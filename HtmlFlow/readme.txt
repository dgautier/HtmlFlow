* Contents:
	+ pom.xml - maven pom file

	+ src - source folder

		+ main - main sources

			+ java - java main sources (package folders start here)
				+ packages ...

			+ sql

			+ resource

		+ test - test sources

			+ java - java test sources (package folders start here)
				+ packages ...

			+ sql

			+ resource
	
	+ target (created by compile tasks and removed by "clean" task) - .class and .jar files

		- shouldn't be on remote repository.