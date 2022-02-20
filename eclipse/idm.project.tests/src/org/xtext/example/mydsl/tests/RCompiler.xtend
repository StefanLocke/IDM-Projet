package org.xtext.example.mydsl.tests

import org.xtext.example.mydsl.idmdsl.Binexpr
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
import org.xtext.example.mydsl.idmdsl.PrimaryExpression
import org.xtext.example.mydsl.idmdsl.Print
import org.xtext.example.mydsl.idmdsl.Programme
import org.xtext.example.mydsl.idmdsl.RemoveCol
import org.xtext.example.mydsl.idmdsl.RemoveLine
import org.xtext.example.mydsl.idmdsl.Selectcell
import org.xtext.example.mydsl.idmdsl.StringValue

class RCompiler {
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
		return "Loadscope";
	}
	
	def dispatch String compile(Load scope) {
		var python = "# Creates a new DataFrame from a CSV File\n"
		python += '''df = read.csv(file = '«scope.path»')\n\n'''
		for (instruction : scope.instructions) {
			python += compile(instruction) + "\n"
		}
		python
	}
	def dispatch String compile(Create scope) {
		var python = '''# Creates a new DataFrame from a CSV File\n'''
		python+= '''df = data.frame()\n\n'''
		for (instruction : scope.instructions) {
			python += compile(instruction) + "\n"
		}
		python
	}
	
	def dispatch String compile(Instruction instruction) {
		return "Instruction";
	}
	
	def dispatch String compile(InsertCol instruction) { //TODO add conditional expression
		var python = '''df.insert(«compile(instruction.colIndex)»,"«instruction.colName»")'''	
		python
	}
	
	def dispatch String compile(RemoveCol instruction) {
		
		var python = ""
			python += '''df = df.drop(columns=df.columns[«compile(instruction.colIndex)»])'''
		if (instruction.colIndex !== null) {
			
		} else {
			python += '''df = df.drop(columns=«instruction.name»)'''
		}
		return python;
	}
	
	def dispatch String compile(InsertLine instruction) {
		return "Instruction";
	}
	
	def dispatch String compile(RemoveLine instruction) {
		return '''df = df.drop(«compile(instruction.lineIndex)»)''';
	}
	def dispatch String compile(Insert instruction) {
		var python = ""
		if (instruction.colNameOrIndex instanceof Expression) {
			python += '''df.at[«compile(instruction.lineIndex)», df.columns[«compile(instruction.colNameOrIndex)»]] = «compile(instruction.value)»'''
		}else {
			python += '''df.at[«compile(instruction.lineIndex)», «compile(instruction.colNameOrIndex)»] = «compile(instruction.value)»'''
			
		}
		return python;
	}
	def dispatch String compile(Print instruction) {
		return '''print(«compile(instruction.value)»)''';
	}
	def dispatch String compile(ExportCSV instruction) {
		return '''df.to_csv("«instruction.path»")''';
	}
	def dispatch String compile(ExportJSON instruction) {
		return '''df.to_json("«instruction.path»")''';
	}
	

	
	def dispatch String compile(Expression expr) {
		return "Expr not implemented"
	}
	def dispatch String compile(PrimaryExpression expr) {
		return '''PrimaryExpression'''
	}
	
	def dispatch String compile(Binexpr expr) {
		return '''(«compile(expr.left) + expr.op + compile(expr.right)»)'''
	}
	
	
	def dispatch String compile(Selectcell expr) {
		return '''df.iat[«compile(expr.cellX)»,«compile(expr.cellY)»]'''
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