package org.xtext.example.mydsl.tests;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;


public class TestUtils {
	String inputPath = (System.getProperty("user.dir") + "/ressources/input").replace("\\", "/");
	String outputPath = (System.getProperty("user.dir") + "/ressources/output").replace("\\", "/");
	String generatedPath = (System.getProperty("user.dir") + "/ressources/generated").replace("\\", "/");
	String expectedPath = (System.getProperty("user.dir") + "/ressources/expected").replace("\\", "/");
	
	public String getInputPath() {
		return inputPath;
	}
	
	public String getOutputPath() {
		return outputPath;
	}
	
	public String getGeneratedPath() {
		return generatedPath;
	}
	
	public String getExpectedPath() {
		return expectedPath;
	}
	
	/**
	 * Get expected test file path for a test
	 * @param testName 
	 * @return expected path for test
	 */
	public String getExpectedTestPath(String testName) {
		return expectedPath + "/" + testName + ".csv";
	}
	
	/**
	 * Get generated file path for Python test
	 * @param testName
	 * @return generated Python file path
	 */
	public String getGeneratedPythonTestPath(String testName) {
		return generatedPath + "/" + testName + ".py";
	}
	
	/**
	 * Get generated file path for R test
	 * @param testName
	 * @return generated R file path
	 */
	public String getGeneratedRTestPath(String testName) {
		return generatedPath + "/" + testName + ".r";
	}
	
	/**
	 * Get output .csv file path for a Python test
	 * @param testName
	 * @return output .csv file path
	 */
	public String getOutputPythonTestPath(String testName) {
		return outputPath + "/" + testName + "Python.csv";
	}
	
	/**
	 * Get output .csv file path for a R test
	 * @param testName
	 * @return output .csv file path
	 */
	public String getOutputRTestPath(String testName) {
		return outputPath + "/" + testName + "R.csv";
	}
	
	
	/**
	 * Write a file
	 * @param filePath file to write
	 * @param fileContent file content to write
	 * @throws IOException
	 */
	public void writeFile(String filePath, String fileContent) throws IOException{
        System.out.println("Write " + filePath);
        var writer = new FileWriter(new File(filePath));
        writer.write(fileContent);
        writer.flush();
        writer.close();
	}
	
	/**
	 * Run R Python from command line
	 * @param pythonFilePath path of Python file to run
	 * @param pythonModuleName name of Python module in current command line prompt
	 * @throws IOException
	 */
	public void runPython(String pythonFilePath, String pythonModuleName) throws IOException{
		var rt = Runtime.getRuntime();
		var pr = rt.exec(pythonModuleName + " " + pythonFilePath);
	}
	
	/**
	 * Run R script from command line
	 * @param rFilePath path of r file to run
	 * @param rModuleName name of r module in current command line prompt
	 * @throws IOException
	 */
	public void runR(String rFilePath, String rModuleName) throws IOException{
		var rt = Runtime.getRuntime();
		var pr = rt.exec(rModuleName + " " + rFilePath);
	}
	
	/**
	 * Compare two files
	 * @param filePath1 path of first file
	 * @param filePath2 path of second file
	 * @return true if similar else false
	 * @throws IOException
	 */
	public Boolean compareFiles(String filePath1, String filePath2) throws IOException{
		System.out.println("Compare " + filePath1 + " and " + filePath2);
        var first = Files.readAllBytes(Paths.get(filePath1));
        var second = Files.readAllBytes(Paths.get(filePath2));
        return Arrays.equals(first, second);
   }
	

}
