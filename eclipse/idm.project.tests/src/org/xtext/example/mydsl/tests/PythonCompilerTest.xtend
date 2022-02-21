package org.xtext.example.mydsl.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.xtext.example.mydsl.idmdsl.Programme
import org.junit.jupiter.api.BeforeEach

@ExtendWith(InjectionExtension)
@InjectWith(MyDslInjectorProvider)
class PythonCompilerTest {
	@Inject
	ParseHelper<Programme> parseHelper;
	
	TestUtils testUtils = new TestUtils();
	String inputFilePath = testUtils.getInputPath + "/fruits.csv"
	
    @BeforeEach
    def void init(){
    	testUtils.cleanDirectory(testUtils.generatedPath);
    	testUtils.cleanDirectory(testUtils.outputPath);
    }

    
    @Test
    def void loadAndExport() {
    	
    	// Test Name
    	var testName = "loadAndExport"
    	
    	// Start Time
    	var startTime = System.nanoTime();
    	
    	// Parse Instructions
        val result = parseHelper.parse('''
            Load('«inputFilePath»') {
                Store('«testUtils.getOutputPythonTestPath(testName)»');
            }
        ''') 
        
        // Assert parse works
        Assertions.assertNotNull(result)
        
        // Initialize compiler and get result
        val compiler = new PythonCompiler(result);
        var compilerResult = compiler.doCompile
        
        // Elapsed time
        var timeElapsed = System.nanoTime() - startTime;
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
        
        println("Compiler result :")
        println(compilerResult)
        
        // Assert there is no errors during compilation
        Assertions.assertTrue(result.eResource.errors.isEmpty)
        
        // Get path of generated
        var generated_file_path = testUtils.getGeneratedPythonTestPath(testName);
        
        // Write compiler result as python file
        testUtils.writeFile(generated_file_path, compilerResult)
        
		// Execute python file
        testUtils.runPython(generated_file_path)
        
        // Compare generated and expected csv
        Assertions.assertTrue(testUtils.compareFiles(testUtils.getOutputPythonTestPath(testName), testUtils.getExpectedCSVPythonTestPath(testName)))
        
        // Compare generated and expected python
        Assertions.assertTrue(testUtils.compareFiles(generated_file_path, testUtils.getExpectedPythonTestPath(testName)))
    } 
    
    @Test
    def void createAndExport1() {
    	
    	// Test Name
    	var testName = "createAndExport1"
    	
    	// Start Time
    	var startTime = System.nanoTime();
    	
    	// Parse Instructions
        val result = parseHelper.parse('''
        Create() {
			InsertCol(0, "Prenom", "");
			InsertCol(1, "Sexe", "");
			Insert(0, "Prenom", "Alexis");
			Insert(0,"Sexe", "Male");
		    Store('«testUtils.getOutputPythonTestPath(testName)»');
        }
        ''') 
        
        // Assert parse works
        Assertions.assertNotNull(result)
        
        // Initialize compiler and get result
        val compiler = new PythonCompiler(result);
        var compilerResult = compiler.doCompile
        
        // Elapsed time
        var timeElapsed = System.nanoTime() - startTime;
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
        
        println("Compiler result :")
        println(compilerResult)
        
        // Assert there is no errors during compilation
        Assertions.assertTrue(result.eResource.errors.isEmpty)
        
        // Get path of generated
        var generated_file_path = testUtils.getGeneratedPythonTestPath(testName);
        
        // Write compiler result as python file
        testUtils.writeFile(generated_file_path, compilerResult)
        
		// Execute python file
        testUtils.runPython(generated_file_path)
        
        // Compare generated and expected csv
        Assertions.assertTrue(testUtils.compareFiles(testUtils.getOutputPythonTestPath(testName), testUtils.getExpectedCSVPythonTestPath(testName)))
        
        // Compare generated and expected python
        Assertions.assertTrue(testUtils.compareFiles(generated_file_path, testUtils.getExpectedPythonTestPath(testName)))
    }
    
    @Test
    def void removeCol() {

    	// Test Name
    	var testName = "removeCol"

    	// Start Time
    	var startTime = System.nanoTime();

    	// Parse Instructions
        val result = parseHelper.parse('''
        Create() {
			InsertCol(0, "Prenom", "");
			InsertCol(1, "Sexe", "");
			InsertCol(2, "removedCol", "");
			Insert(0, "Prenom", "Alexis");
			Insert(0,"Sexe", "Male");
			RemoveCol("removedCol");
		    Store('«testUtils.getOutputPythonTestPath(testName)»');
        }
        ''') 

        // Assert parse works
        Assertions.assertNotNull(result)

        // Initialize compiler and get result
        val compiler = new PythonCompiler(result);
        var compilerResult = compiler.doCompile

        // Elapsed time
        var timeElapsed = System.nanoTime() - startTime;
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);

        println("\nCompiler result :")
        println(compilerResult)

        // Assert there is no errors during compilation
        Assertions.assertTrue(result.eResource.errors.isEmpty)

        // Get path of generated
        var generated_file_path = testUtils.getGeneratedPythonTestPath(testName);

        // Write compiler result as python file
        testUtils.writeFile(generated_file_path, compilerResult)

		// Execute python file
        testUtils.runPython(generated_file_path)

        // Compare generated and expected csv
        Assertions.assertTrue(testUtils.compareFiles(testUtils.getOutputPythonTestPath(testName), testUtils.getExpectedCSVPythonTestPath(testName)))

        // Compare generated and expected python
        Assertions.assertTrue(testUtils.compareFiles(generated_file_path, testUtils.getExpectedPythonTestPath(testName)))
    }
    
    @Test
    def void removeLine() {

    	// Test Name
    	var testName = "removeLine"

    	// Start Time
    	var startTime = System.nanoTime();

    	// Parse Instructions
        val result = parseHelper.parse('''
        Load('«inputFilePath»') {
        	RemoveLine(5);
		    Store('«testUtils.getOutputPythonTestPath(testName)»');
        }
        ''') 

        // Assert parse works
        Assertions.assertNotNull(result)

        // Initialize compiler and get result
        val compiler = new PythonCompiler(result);
        var compilerResult = compiler.doCompile

        // Elapsed time
        var timeElapsed = System.nanoTime() - startTime;
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);

        println("\nCompiler result :")
        println(compilerResult)

        // Assert there is no errors during compilation
        Assertions.assertTrue(result.eResource.errors.isEmpty)

        // Get path of generated
        var generated_file_path = testUtils.getGeneratedPythonTestPath(testName);

        // Write compiler result as python file
        testUtils.writeFile(generated_file_path, compilerResult)

		// Execute python file
        testUtils.runPython(generated_file_path)

        // Compare generated and expected csv
        Assertions.assertTrue(testUtils.compareFiles(testUtils.getOutputPythonTestPath(testName), testUtils.getExpectedCSVPythonTestPath(testName)))

        // Compare generated and expected python
        Assertions.assertTrue(testUtils.compareFiles(generated_file_path, testUtils.getExpectedPythonTestPath(testName)))
    }
    
    @Test
    def void colSum() {
    	// Test Name
    	var testName = "colSum"

    	// Start Time
    	var startTime = System.nanoTime();

    	// Parse Instructions
        val result = parseHelper.parse('''
        Load('«inputFilePath»') {
        	Insert(6, "Article", "Benefice Total");
        	Insert(6, "Stock", Colsum("Benefice"));
		    Store('«testUtils.getOutputPythonTestPath(testName)»');
        }
        ''') 

        // Assert parse works
        Assertions.assertNotNull(result)

        // Initialize compiler and get result
        val compiler = new PythonCompiler(result);
        var compilerResult = compiler.doCompile

        // Elapsed time
        var timeElapsed = System.nanoTime() - startTime;
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);

        println("\nCompiler result :")
        println(compilerResult)

        // Assert there is no errors during compilation
        Assertions.assertTrue(result.eResource.errors.isEmpty)

        // Get path of generated
        var generated_file_path = testUtils.getGeneratedPythonTestPath(testName);

        // Write compiler result as python file
        testUtils.writeFile(generated_file_path, compilerResult)

		// Execute python file
        testUtils.runPython(generated_file_path)

        // Compare generated and expected csv
        Assertions.assertTrue(testUtils.compareFiles(testUtils.getOutputPythonTestPath(testName), testUtils.getExpectedCSVPythonTestPath(testName)))

        // Compare generated and expected python
        Assertions.assertTrue(testUtils.compareFiles(generated_file_path, testUtils.getExpectedPythonTestPath(testName)))
    }
    
    @Test
    def void selectCell() {
    	// Test Name
    	var testName = "selectCell"

    	// Start Time
    	var startTime = System.nanoTime();

    	// Parse Instructions
        val result = parseHelper.parse('''
        Create() {
        	InsertCol(0, "Stocks", 0);
        	Insert(0, "Stocks", 40);
        	Insert(1, "Stocks", 25);
        	Insert(2, "Stocks", 10);
        	Insert(3, "Stocks", (Selectcell(0,"Stocks")+Selectcell(1,"Stocks")));
		    Store('«testUtils.getOutputPythonTestPath(testName)»');
        }
        ''') 

        // Assert parse works
        Assertions.assertNotNull(result)

        // Initialize compiler and get result
        val compiler = new PythonCompiler(result);
        var compilerResult = compiler.doCompile

        // Elapsed time
        var timeElapsed = System.nanoTime() - startTime;
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);

        println("\nCompiler result :")
        println(compilerResult)

        // Assert there is no errors during compilation
        Assertions.assertTrue(result.eResource.errors.isEmpty)

        // Get path of generated
        var generated_file_path = testUtils.getGeneratedPythonTestPath(testName);

        // Write compiler result as python file
        testUtils.writeFile(generated_file_path, compilerResult)

		// Execute python file
        testUtils.runPython(generated_file_path)

        // Compare generated and expected csv
        Assertions.assertTrue(testUtils.compareFiles(testUtils.getOutputPythonTestPath(testName), testUtils.getExpectedCSVPythonTestPath(testName)))

        // Compare generated and expected python
        Assertions.assertTrue(testUtils.compareFiles(generated_file_path, testUtils.getExpectedPythonTestPath(testName)))
    }
    
    @Test
    def void binOp() {
    	// Test Name
    	var testName = "binOp"

    	// Start Time
    	var startTime = System.nanoTime();

    	// Parse Instructions
        val result = parseHelper.parse('''
        Create() {
        	InsertCol(0, "Stocks", 0);
        	Insert(0, "Stocks", (10+10));
        	Insert(1, "Stocks", (10*10));
        	Insert(2, "Stocks", (10-10));
        	Insert(3, "Stocks", (10/10));
		    Store('«testUtils.getOutputPythonTestPath(testName)»');
        }
        ''') 

        // Assert parse works
        Assertions.assertNotNull(result)

        // Initialize compiler and get result
        val compiler = new PythonCompiler(result);
        var compilerResult = compiler.doCompile

        // Elapsed time
        var timeElapsed = System.nanoTime() - startTime;
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);

        println("\nCompiler result :")
        println(compilerResult)

        // Assert there is no errors during compilation
        Assertions.assertTrue(result.eResource.errors.isEmpty)

        // Get path of generated
        var generated_file_path = testUtils.getGeneratedPythonTestPath(testName);

        // Write compiler result as python file
        testUtils.writeFile(generated_file_path, compilerResult)

		// Execute python file
        testUtils.runPython(generated_file_path)

        // Compare generated and expected csv
        Assertions.assertTrue(testUtils.compareFiles(testUtils.getOutputPythonTestPath(testName), testUtils.getExpectedCSVPythonTestPath(testName)))

        // Compare generated and expected python
        Assertions.assertTrue(testUtils.compareFiles(generated_file_path, testUtils.getExpectedPythonTestPath(testName)))
    }
    
    @Test
    def void print() {
    	// Test Name
    	var testName = "print"

    	// Start Time
    	var startTime = System.nanoTime();

    	// Parse Instructions
        val result = parseHelper.parse('''
        Create() {
        	InsertCol(0, "Stocks", 0);
        	Insert(0, "Stocks", (10+10));
        	Print(Selectcell(0,"Stocks"));
		    Store('«testUtils.getOutputPythonTestPath(testName)»');
        }
        ''') 

        // Assert parse works
        Assertions.assertNotNull(result)

        // Initialize compiler and get result
        val compiler = new PythonCompiler(result);
        var compilerResult = compiler.doCompile

        // Elapsed time
        var timeElapsed = System.nanoTime() - startTime;
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);

        println("\nCompiler result :")
        println(compilerResult)

        // Assert there is no errors during compilation
        Assertions.assertTrue(result.eResource.errors.isEmpty)

        // Get path of generated
        var generated_file_path = testUtils.getGeneratedPythonTestPath(testName);

        // Write compiler result as python file
        testUtils.writeFile(generated_file_path, compilerResult)

		// Execute python file
        testUtils.runPython(generated_file_path)

        // Compare generated and expected csv
        Assertions.assertTrue(testUtils.compareFiles(testUtils.getOutputPythonTestPath(testName), testUtils.getExpectedCSVPythonTestPath(testName)))

        // Compare generated and expected python
        Assertions.assertTrue(testUtils.compareFiles(generated_file_path, testUtils.getExpectedPythonTestPath(testName)))
    }
    
}
