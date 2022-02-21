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
	String inputFilePath = testUtils.getInputPath + "/recettesFruits.csv"
	
	
    
    @Test
    def void test1() {
    	var currentTest = "test1"
        
    } 
    
}
