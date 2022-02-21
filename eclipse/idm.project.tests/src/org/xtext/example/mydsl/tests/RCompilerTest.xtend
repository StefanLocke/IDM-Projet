package org.xtext.example.mydsl.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.xtext.example.mydsl.idmdsl.Programme

@ExtendWith(InjectionExtension)
@InjectWith(MyDslInjectorProvider)
class RCompilerTest {
	@Inject
	ParseHelper<Programme> parseHelper;
	
	TestUtils testUtils = new TestUtils();
	String inputFilePath = testUtils.getInputPath + "/fruits.csv"
	
	
     @Test
    def void loadAndExport() {
    	
    	// Test Name
    	var testName = "loadAndExport"
    	
    	// Start Time
    	var startTime = System.nanoTime();
    	
    	// Parse Instructions
        val result = parseHelper.parse('''
            Load('«inputFilePath»') {
                Store('«testUtils.getOutputRTestPath(testName)»');
            }
        ''') 
        
        // Assert parse works
        Assertions.assertNotNull(result)
        
        // Initialize compiler and get result
        val compiler = new RCompiler(result);
        var compilerResult = compiler.doCompile
        
        // Elapsed time
        var timeElapsed = System.nanoTime() - startTime;
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
        
        println("Compiler result :")
        println(compilerResult)
        
        // Assert there is no errors during compilation
        Assertions.assertTrue(result.eResource.errors.isEmpty)
        
        // Get path of generated
        var generated_file_path = testUtils.getGeneratedRTestPath(testName);
        
        // Write compiler result as R file
        testUtils.writeFile(generated_file_path, compilerResult)
        
		// Execute R file
        testUtils.runR(generated_file_path)
        
        // Compare generated and expected csv
        Assertions.assertTrue(testUtils.compareFiles(testUtils.getOutputRTestPath(testName), testUtils.getExpectedCSVTestPath(testName)))
        
        // Compare generated and expected R
        Assertions.assertTrue(testUtils.compareFiles(generated_file_path, testUtils.getExpectedRTestPath(testName)))
    } 
    
}
