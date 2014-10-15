package htmlflow;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Test;

public class TestBasicTags {

	@Test
	public void mainTags() throws Exception {
		Sample sample = new Sample("Some key", "Some value");

		HtmlView<Sample> sampleHtml = new HtmlView<Sample>();
		sampleHtml.head().title("Task Details");

		sampleHtml.body().heading(1, "Task Details").hr().div().text("Title: ")
				.text(sample.getKey()).br().text("Description: ")
				.text(sample.getValue()).br();

		PrintStream out = null;
		try {
			out = new PrintStream(new FileOutputStream("Sample.html"));
			sampleHtml.setPrintStream(out).write(1, sample);
			
			// Check that the file exists
			File outputFile = new File("Sample.html");
			Assert.assertTrue(outputFile.isFile());			
		} finally {
			out.close();
		}
	}
	
	@Test
	public void addLinks() throws Exception {
		Sample sample = new Sample("Some key", "Some value");

		HtmlView<Sample> sampleHtml = new HtmlView<Sample>();
		sampleHtml.head().title("Task Details");

		sampleHtml.body().link("Title", "http://www.google.com");
		
		PrintStream out = null;
		try {
			out = new PrintStream(new FileOutputStream("Sample.html"));
			sampleHtml.setPrintStream(out).write(1, sample);
			
			// Check that the file exists
			File outputFile = new File("Sample.html");
			Assert.assertTrue(outputFile.isFile());			
		} finally {
			out.close();
		}
	}
	
	@After
	public void removeFiles() throws Exception {
		File file = new File("Sample.html");
		if (file.exists()) {
			file.delete();
		}
	}
}
