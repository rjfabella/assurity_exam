# assurity_exam

### DISCLAIMER
This project is created for the sole purpose of answering a coding problem assigned to the author, and is designed to be compatible only on a Windows machine.
Other information will not be disclosed.

### PREREQUISITES
* Latest Java version properly installed and setup - [see guide](https://phoenixnap.com/kb/install-java-windows)
* Latest Maven version properly installed and setup - [see guide](https://maven.apache.org/install.html)

### HOW TO RUN TEST
1. Download or pull repository and extract on a location on your machine
2. Launch the Command Prompt and navigate to the 'AssurityCodingTest' folder on the local folder where the repository. See example below:  
   - `cd C:\Downloads\assurity_exam\AssurityCodingTest`
3. Make sure Maven and Java are correctly installed by verifying the versions when typing the commands below:
   - `mvn -version`
   - `java -version`
4. Once both conditions above are met, run the command:
   - `mvn clean test`
5. If successful, logs similar to the sample below should be displayed with the correct test results

   - `[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 2.902 s - in TestSuite`  
`[INFO]`  
`[INFO] Results:`  
`[INFO]`  
`[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0`  
`[INFO]`  
`[INFO] ------------------------------------------------------------------------`  
`[INFO] BUILD SUCCESS`  
`[INFO] ------------------------------------------------------------------------`  
`[INFO] Total time:  4.505 s`  
`[INFO] Finished at: 2023-06-06T23:08:54+08:00`  
`[INFO] ------------------------------------------------------------------------`

## PROJECT STRUCTURE
* The project is developed using a simple Maven framework of RESTassured and TestNG libraries written in Java on Eclipse.
* The main test file can be found at *\assurity_exam\AssurityCodingTest\src\main\java\tests*

### ABOUT THE AUTHOR:
* [LinkedIn](https://www.linkedin.com/in/rj-fabella-60559b92/)
