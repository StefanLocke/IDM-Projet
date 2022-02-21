package org.xtext.example.mydsl.tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;


public class TestUtils {
	String inputPath = (System.getProperty("user.dir") + "/ressources/input").replace("\\", "/");
	String outputPath = (System.getProperty("user.dir") + "/ressources/output").replace("\\", "/");
	String generatedPath = (System.getProperty("user.dir") + "/ressources/generated").replace("\\", "/");
	String expectedPath = (System.getProperty("user.dir") + "/ressources/expected").replace("\\", "/");
	
	String pythonModuleName = "python";
	String rModuleName = "Rscript";
	
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
	 * Get expected python test file path for a test
	 * @param testName 
	 * @return expected path for test
	 */
	public String getExpectedPythonTestPath(String testName) {
		return expectedPath + "/python/" + testName + ".py";
	}
	
	/**
	 * Get expected R test file path for a test
	 * @param testName 
	 * @return expected path for test
	 */
	public String getExpectedRTestPath(String testName) {
		return expectedPath + "/r/" + testName + ".R";
	}
	
	/**
	 * Get expected csv test file path for a python test
	 * @param testName 
	 * @return expected path for test
	 */
	public String getExpectedCSVPythonTestPath(String testName) {
		return expectedPath + "/csvPython/" + testName + ".csv";
	}
	
	/**
	 * Get expected csv test file path for a python test
	 * @param testName 
	 * @return expected path for test
	 */
	public String getExpectedCSVRTestPath(String testName) {
		return expectedPath + "/csvR/" + testName + ".csv";
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
		return generatedPath + "/" + testName + ".R";
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
	public void runPython(String filePath) throws IOException{
		executeCommand(pythonModuleName + " " + filePath);
	}
	
	/**
	 * Run R Python from command line
	 * @param pythonFilePath path of R file to run
	 * @param pythonModuleName name of R module in current command line prompt
	 * @throws IOException
	 */
	public void runR(String filePath) throws IOException{
		executeCommand(rModuleName + " " + filePath);
	}
	
	/**
	 * Run R script from command line
	 * @param rFilePath path of r file to run
	 * @param rModuleName name of r module in current command line prompt
	 * @throws IOException
	 */
	public void executeCommand(String command) throws IOException{
		System.out.println("\nExecute command : " + command);
		var rt = Runtime.getRuntime();
		var proc = rt.exec(command);
		BufferedReader stdInput = new BufferedReader(new InputStreamReader(proc.getInputStream()));
		BufferedReader stdError = new BufferedReader(new InputStreamReader(proc.getErrorStream()));

		// Read the output from the command
		if(stdInput.ready()) {
			System.out.println("Command line result :\n");
		}
		String s = null;
		while ((s = stdInput.readLine()) != null) {
		    System.out.println(s);
		}
		
		// Read any errors from the attempted command
		if(stdInput.ready()) {
			System.out.println("Command line result :\n");
		}
		
		while ((s = stdError.readLine()) != null) {
		    System.out.println(s);
		}
	}
	
	/**
	 * Compare two files line by line
	 * @param filePath1
	 * @param filePath2
	 * @return
	 * @throws IOException
	 */
	public Boolean compareFiles(String filePath1, String filePath2) throws IOException{
		
		System.out.println("Compare " + filePath1 + " and " + filePath2);
		
		if(!new File(filePath1).isFile()) { 
			System.out.println("File does not exists : " + filePath1);
			return false;
		}
		if(!new File(filePath2).isFile()) { 
			System.out.println("File does not exists : " + filePath2);
			return false;
		}
		
		
		BufferedReader reader1 = new BufferedReader(new FileReader(filePath1));
        BufferedReader reader2 = new BufferedReader(new FileReader(filePath2));
         
        String line1 = reader1.readLine();
        String line2 = reader2.readLine();
         
        boolean areEqual = true;
         
        int lineNum = 1;

        while (line1 != null || line2 != null){
        	
            if(line1 == null || line2 == null){
                areEqual = false;
                break;
            }
            else if(!line1.strip().equals(line2.strip())){
            	// Skip path case
            	if ((!line1.strip().contains("df = pd.read_") && !line2.strip().contains("df = pd.read_")) && (!line1.strip().contains("df.to_") && !line2.strip().contains("df.to_"))) {
            		areEqual = false;
                    break;
            	}
                
            }
             
            line1 = reader1.readLine(); 
            line2 = reader2.readLine();
             
            lineNum++;
        }
         
        if(areEqual){
            System.out.println("Files are similar");
        }
        else{
            System.out.println("Files are different at line "+lineNum);
            System.out.println("File1='"+line1+"'\nFile2='"+line2+"'");
        }
         
        reader1.close();
        reader2.close();
        
        return areEqual;
    }
	
	/**
	 * Clean a directory
	 * @param path of directory to clean
	 */
	public void cleanDirectory(String path) {
		var directoryToBeDeleted = new File(path);
	    File[] allContents = directoryToBeDeleted.listFiles();
	    if (allContents != null) {
	        for (File file : allContents) {
	        	file.delete();
	        }
	    }
	}

}
