package htmlflow;

import java.io.PrintStream;

public interface HtmlWriter<T>{
	/**
	 * Writes into an internal PrintStream the HTML content
	 * if this element.
	 * 
	 * @param depth The number of tabs indentation.
	 * @param model An optional object model that could be bind to this element. 
	 */
	void write(int depth, T model);
	
	/**
	 * Sets the current PrintStream.
	 * @param out
	 */
	HtmlWriter<T> setPrintStream(PrintStream out);
}
