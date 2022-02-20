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
	
	public String getInputPath() {
		return inputPath;
	}
	public String getOutputPath() {
		return outputPath;
	}
	public String getGeneratedPath() {
		return generatedPath;
	}
	
	public void writeFile(String filePath, String fileContent) throws IOException{
		try {
	        System.out.println("Write " + filePath);
	        var writer = new FileWriter(new File(filePath));
	        writer.write(fileContent);
	        writer.flush();
	        writer.close();
		}catch(Exception e) {
	        System.out.println("Exception Raised" + e.toString());
	     }
	}
	
	public void runPython(String pythonFilePath, String pythonModuleName) throws IOException{
		var rt = Runtime.getRuntime();
		var pr = rt.exec(pythonModuleName + " " + pythonFilePath);

	}
	
	public Boolean compareFiles(String filePath1, String filePath2) throws IOException{
        var first = Files.readAllBytes(Paths.get(filePath1));
        var second = Files.readAllBytes(Paths.get(filePath2));
        return Arrays.equals(first, second);
   }
	

}
