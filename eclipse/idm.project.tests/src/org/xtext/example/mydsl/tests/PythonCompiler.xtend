package org.xtext.example.mydsl.tests

import org.xtext.example.mydsl.idmdsl.BinaryExpression
import org.xtext.example.mydsl.idmdsl.Create
import org.xtext.example.mydsl.idmdsl.ExportCSV
import org.xtext.example.mydsl.idmdsl.ExportJSON
import org.xtext.example.mydsl.idmdsl.Expression
import org.xtext.example.mydsl.idmdsl.Insert
import org.xtext.example.mydsl.idmdsl.InsertCol
import org.xtext.example.mydsl.idmdsl.InsertLine
import org.xtext.example.mydsl.idmdsl.Instruction
import org.xtext.example.mydsl.idmdsl.IntValue
import org.xtext.example.mydsl.idmdsl.Load
import org.xtext.example.mydsl.idmdsl.Loadscope
import org.xtext.example.mydsl.idmdsl.NoneValue
import org.xtext.example.mydsl.idmdsl.MathPrimaryExpression
import org.xtext.example.mydsl.idmdsl.MathExpression
import org.xtext.example.mydsl.idmdsl.Print
import org.xtext.example.mydsl.idmdsl.Programme
import org.xtext.example.mydsl.idmdsl.RemoveCol
import org.xtext.example.mydsl.idmdsl.RemoveLine
import org.xtext.example.mydsl.idmdsl.Selectcell
import org.xtext.example.mydsl.idmdsl.StringValue

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
	
	def dispatch String compile(Load scope) {
		var python = '''
		df = pd.read_csv( «compile(scope.path)» )
		'''
		for (instruction : scope.instructions) {
			python += compile(instruction) + "\n"
		}
		python
	}
	def dispatch String compile(Create scope) {
		var python = '''
		df = pd.DataFrame(list())
		'''
		for (instruction : scope.instructions) {
			python += compile(instruction) + "\n"
		}
		python
	}
	
	def dispatch String compile(Instruction instruction) {
		return "Instruction";
	}
	
	def dispatch String compile(InsertCol instruction) { //TODO add conditional expression
		var python = '''df.insert(«compile(instruction.colIndex)»,«compile(instruction.colName)»,"")'''	
		python
	}
	
	def dispatch String compile(RemoveCol instruction) {
		var python = '''
		df = df.drop(columns=«compile(instruction.colName)»)'''
		return python;
	}
	
	def dispatch String compile(InsertLine instruction) {
		return "Instruction";
	}
	
	def dispatch String compile(RemoveLine instruction) {
		return '''df = df.drop(«compile(instruction.lineIndex)»)''';
	}
	def dispatch String compile(Insert instruction) {
		var python = '''df.at[«compile(instruction.lineIndex)», «compile(instruction.colName)»] = «compile(instruction.value)»'''
		return python;
	}
	def dispatch String compile(Print instruction) {
		return '''print(«compile(instruction.value)»)''';
	}
	def dispatch String compile(ExportCSV instruction) {
		return '''df.to_csv(«compile(instruction.path)»)''';
	}
	def dispatch String compile(ExportJSON instruction) {
		return '''df.to_json(«compile(instruction.path)»)''';
	}
	
	def dispatch String compile(BinaryExpression expr) {
		return '''(«compile(expr.left) + expr.op + compile(expr.right)»)'''
	}
	
	def dispatch String compile(Selectcell expr) {
		return '''df.at[«compile(expr.lineIndex)»,«compile(expr.colName)»]'''
	}
	def dispatch String compile(NoneValue expr) {
		return expr.value
	}
	def dispatch String compile(IntValue expr) {
		return expr.value.toString
	}
	def dispatch String compile(StringValue expr) {
		return '''"«expr.value»"'''
	}
	
	
}