package org.xtext.example.mydsl.tests

import org.xtext.example.mydsl.idmdsl.BinaryExpression
import org.xtext.example.mydsl.idmdsl.Colprod
import org.xtext.example.mydsl.idmdsl.Colsum
import org.xtext.example.mydsl.idmdsl.Create
import org.xtext.example.mydsl.idmdsl.ExportCSV
import org.xtext.example.mydsl.idmdsl.ExportJSON
import org.xtext.example.mydsl.idmdsl.Insert
import org.xtext.example.mydsl.idmdsl.InsertCol
import org.xtext.example.mydsl.idmdsl.InsertLine
import org.xtext.example.mydsl.idmdsl.IntValue
import org.xtext.example.mydsl.idmdsl.Lineprod
import org.xtext.example.mydsl.idmdsl.Linesum
import org.xtext.example.mydsl.idmdsl.Load
import org.xtext.example.mydsl.idmdsl.NoneValue
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
		var python = ""

		for (scope : prog.loadscopes) {
			python += compile(scope) + "\n";
		}
		
		return python;
	
	}
	
	def dispatch String compile(Load scope) {
		var python = 
		'''
		# Creates a new DataFrame from a CSV File
		df = read.csv(file = '«compile(scope.path)»')
		'''
		for (instruction : scope.instructions) {
			python += compile(instruction) + "\n"
		}
		python
	}
	def dispatch String compile(Create scope) {
		var python = '''
		# Creates a new DataFrame from a CSV File
		df = data.frame()
		'''
		for (instruction : scope.instructions) {
			python += compile(instruction) + "\n"
		}
		python
	}
	
	
	def dispatch String compile(InsertCol instruction) { //TODO add conditional expression
		var python = '''
		#Adds a new Column to the dataframe
		df[1,«compile(instruction.colName)»] <- NA
		'''	
		python
	}
	
	def dispatch String compile(RemoveCol instruction) {
		
		var python = '''
		#removes the column with the given name
		python +=df$«compile(instruction.colName)» <- NULL 
		'''
		return python;
	}
	
	def dispatch String compile(InsertLine instruction) {
		var r = '''
		#Inserts a row at the given index (current appends after last row)
		df[nrow(df) + 1,] = NA
		'''
		return r;
	}
	
	def dispatch String compile(RemoveLine instruction) {
		return '''
		#removes a row at the given index
		df <- df[-c(«compile(instruction.lineIndex)»), ]
		''';
	}
	def dispatch String compile(Insert instruction) {
		var python = '''
		#inserts a value at a cell
		df[«compile(instruction.lineIndex)»+1,«compile(instruction.colName)»] = «compile(instruction.value)»
		'''
		return python;
	}
	def dispatch String compile(Print instruction) {
		return '''
		#Prints a expression
		print(«compile(instruction.value)»)
		''';
	}
	def dispatch String compile(ExportCSV instruction) {
		return '''write.csv(df,«compile(instruction.path)»,quote = FALSE,row.names = FALSE)''';
	}
	def dispatch String compile(ExportJSON instruction) {
		return '''write(toJSON(df),file = «compile(instruction.path)»)''';
	}
	
	def dispatch String compile(BinaryExpression expr) {
		return '''(«compile(expr.left) + expr.op + compile(expr.right)»)'''
	}
	def dispatch String compile(Selectcell expr) {
		return '''df[«compile(expr.lineIndex)»+1,«compile(expr.colName)»]'''
	}
	
	
	
	def dispatch String compile(Linesum expr) {
		return '''apply(df,1,sum,na.rm=TRUE)[«compile(expr.lineIndex)»+1]'''
	}
	
	def dispatch String compile(Colsum expr) {
		return '''apply(df,2,sum,na.rm=TRUE)[«compile(expr.colName)»]'''
	}
	
	def dispatch String compile(Lineprod expr) {
		return '''apply(df,1,prod,na.rm=TRUE)[«compile(expr.lineIndex)»+1]'''
	}
	
	def dispatch String compile(Colprod expr) {
		return '''apply(df,2,prod,na.rm=TRUE)[«compile(expr.colName)»]'''
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