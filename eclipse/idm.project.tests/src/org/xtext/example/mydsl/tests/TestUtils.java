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
		return expectedPath + "/r/" + testName + ".r";
	}
	
	/**
	 * Get expected csv test file path for a test
	 * @param testName 
	 * @return expected path for test
	 */
	public String getExpectedCSVTestPath(String testName) {
		return expectedPath + "/csv/" + testName + ".csv";
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
	public void runPython(String pythonFilePath) throws IOException{
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
		var proc = rt.exec(rModuleName + " " + rFilePath);
		BufferedReader stdInput = new BufferedReader(new InputStreamReader(proc.getInputStream()));

		BufferedReader stdError = new BufferedReader(new InputStreamReader(proc.getErrorStream()));

		// Read the output from the command
		System.out.println("Command line result :\n");
		String s = null;
		while ((s = stdInput.readLine()) != null) {
		    System.out.println(s);
		}
	
		// Read any errors from the attempted command
		System.out.println("Command line errors :\n");
		while ((s = stdError.readLine()) != null) {
		    System.out.println(s);
		}
	}
	
	/**
	 * Compare two files
	 * @param filePath1 path of first file
	 * @param filePath2 path of second file
	 * @return true if similar else false
	 * @throws IOException
	 */
	public Boolean compareFiles2(String filePath1, String filePath2) throws IOException{
		System.out.println("Compare " + filePath1 + " and " + filePath2);
        var first = Files.readAllBytes(Paths.get(filePath1));
        var second = Files.readAllBytes(Paths.get(filePath2));
        var r = Arrays.equals(first, second);
        if(r == true) {
        	System.out.println("Files are similar : " + filePath1 + " and " + filePath2);
        }
        else {
        	System.out.println("Files are different : " + filePath1 + " and " + filePath2);
        }
        return r;
   }
	
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
            	if (!line1.strip().contains("df = pd.read_") && !line1.strip().contains("df.to_")) {
            		System.out.println(line1.strip());
            		System.out.println(line1.strip().contains("df.read_csv"));
            		System.out.println(line1.strip().contains("df.to_"));
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

}
