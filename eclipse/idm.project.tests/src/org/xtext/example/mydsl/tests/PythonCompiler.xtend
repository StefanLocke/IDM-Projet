package org.xtext.example.mydsl.tests

import org.xtext.example.mydsl.idmdsl.Programme
import org.xtext.example.mydsl.idmdsl.Loadscope
import org.xtext.example.mydsl.idmdsl.Instruction
import org.xtext.example.mydsl.idmdsl.InsertCol
import org.xtext.example.mydsl.idmdsl.Expression

class PythonCompiler {
	
	val Programme prog;
	
	new(Programme prog) {
		this.prog = prog
	}
	
	def String doCompile() {
		return compile(prog);
	}
	
	def dispatch String compile(Programme prog) {
		var python = "import pandas as pd\n"

		for (scope : prog.loadscopes) {
			python += compile(scope) + "\n";
		}
		
		return python;
	
	}
	
	def dispatch String compile(Loadscope scope) {
		var python = ""
		if (scope.url !== null) {
			python+= "df = pd.read_csv(\"" + scope.url + "\")\n"
		}
		else {
			python+= "df = pd.DataFrame(list())\ndf.to_csv(\'temp.csv\')\n" //TODO CHANGE
		}
		for (instruction : scope.instructions) {
			python += compile(instruction) + "\n"
		}
		return python
	}
	
	def dispatch String compile(Instruction instruction) {
		return "Instruction";
	}
	
	def dispatch String compile(InsertCol instruction) {
		var python = '''df.insert(«compile(instruction.colIndex)»,«instruction.colName»)'''
				
		python
	}
	
	def dispatch String compile(Expression expr) {
		return "Expr not implemented"
	}
	
}