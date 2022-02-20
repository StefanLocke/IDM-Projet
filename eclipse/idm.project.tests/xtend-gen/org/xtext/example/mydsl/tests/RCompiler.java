package org.xtext.example.mydsl.tests;

import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.xtext.example.mydsl.idmdsl.BinaryExpression;
import org.xtext.example.mydsl.idmdsl.Create;
import org.xtext.example.mydsl.idmdsl.ExportCSV;
import org.xtext.example.mydsl.idmdsl.ExportJSON;
import org.xtext.example.mydsl.idmdsl.Insert;
import org.xtext.example.mydsl.idmdsl.InsertCol;
import org.xtext.example.mydsl.idmdsl.InsertLine;
import org.xtext.example.mydsl.idmdsl.Instruction;
import org.xtext.example.mydsl.idmdsl.IntValue;
import org.xtext.example.mydsl.idmdsl.Load;
import org.xtext.example.mydsl.idmdsl.Loadscope;
import org.xtext.example.mydsl.idmdsl.NoneValue;
import org.xtext.example.mydsl.idmdsl.Print;
import org.xtext.example.mydsl.idmdsl.Programme;
import org.xtext.example.mydsl.idmdsl.RemoveCol;
import org.xtext.example.mydsl.idmdsl.RemoveLine;
import org.xtext.example.mydsl.idmdsl.Selectcell;
import org.xtext.example.mydsl.idmdsl.StringValue;

@SuppressWarnings("all")
public class RCompiler {
  private final Programme prog;
  
  public RCompiler(final Programme prog) {
    this.prog = prog;
  }
  
  public String doCompile() {
    return this.compile(this.prog);
  }
  
  protected String _compile(final Programme prog) {
    String python = "";
    EList<Loadscope> _loadscopes = prog.getLoadscopes();
    for (final Loadscope scope : _loadscopes) {
      String _python = python;
      String _compile = this.compile(scope);
      String _plus = (_compile + "\n");
      python = (_python + _plus);
    }
    return python;
  }
  
  protected String _compile(final Load scope) {
    String _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("# Creates a new DataFrame from a CSV File");
      _builder.newLine();
      _builder.append("df = read.csv(file = \'");
      StringValue _path = scope.getPath();
      _builder.append(_path);
      _builder.append("\')");
      _builder.newLineIfNotEmpty();
      String python = _builder.toString();
      EList<Instruction> _instructions = scope.getInstructions();
      for (final Instruction instruction : _instructions) {
        String _python = python;
        String _compile = this.compile(instruction);
        String _plus = (_compile + "\n");
        python = (_python + _plus);
      }
      _xblockexpression = python;
    }
    return _xblockexpression;
  }
  
  protected String _compile(final Create scope) {
    String _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("# Creates a new DataFrame from a CSV File");
      _builder.newLine();
      _builder.append("df = data.frame()");
      _builder.newLine();
      String python = _builder.toString();
      EList<Instruction> _instructions = scope.getInstructions();
      for (final Instruction instruction : _instructions) {
        String _python = python;
        String _compile = this.compile(instruction);
        String _plus = (_compile + "\n");
        python = (_python + _plus);
      }
      _xblockexpression = python;
    }
    return _xblockexpression;
  }
  
  protected String _compile(final InsertCol instruction) {
    String _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("#Adds a new Column to the dataframe");
      _builder.newLine();
      _builder.append("df[1,");
      String _compile = this.compile(instruction.getColName());
      _builder.append(_compile);
      _builder.append("] <- NA");
      _builder.newLineIfNotEmpty();
      String python = _builder.toString();
      _xblockexpression = python;
    }
    return _xblockexpression;
  }
  
  protected String _compile(final RemoveCol instruction) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#removes the column with the given name");
    _builder.newLine();
    _builder.append("python +=df$");
    String _compile = this.compile(instruction.getColName());
    _builder.append(_compile);
    _builder.append(" <- NULL ");
    _builder.newLineIfNotEmpty();
    String python = _builder.toString();
    return python;
  }
  
  protected String _compile(final InsertLine instruction) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#Inserts a row at the given index (current appends after last row)");
    _builder.newLine();
    _builder.append("df[nrow(df) + 1,] = NA");
    _builder.newLine();
    String r = _builder.toString();
    return r;
  }
  
  protected String _compile(final RemoveLine instruction) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#removes a row at the given index");
    _builder.newLine();
    _builder.append("df <- df[-c(");
    String _compile = this.compile(instruction.getLineIndex());
    _builder.append(_compile);
    _builder.append("), ]");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected String _compile(final Insert instruction) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#inserts a value at a cell");
    _builder.newLine();
    _builder.append("df[");
    String _compile = this.compile(instruction.getLineIndex());
    _builder.append(_compile);
    _builder.append("+1,");
    String _compile_1 = this.compile(instruction.getColName());
    _builder.append(_compile_1);
    _builder.append("] = ");
    String _compile_2 = this.compile(instruction.getValue());
    _builder.append(_compile_2);
    _builder.newLineIfNotEmpty();
    String python = _builder.toString();
    return python;
  }
  
  protected String _compile(final Print instruction) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#Prints a expression");
    _builder.newLine();
    _builder.append("print(");
    String _compile = this.compile(instruction.getValue());
    _builder.append(_compile);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected String _compile(final ExportCSV instruction) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("write.csv(df,");
    String _compile = this.compile(instruction.getPath());
    _builder.append(_compile);
    _builder.append(")");
    return _builder.toString();
  }
  
  protected String _compile(final ExportJSON instruction) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("write(toJSON(df),file = ");
    String _compile = this.compile(instruction.getPath());
    _builder.append(_compile);
    _builder.append(")");
    return _builder.toString();
  }
  
  protected String _compile(final BinaryExpression expr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _compile = this.compile(expr.getLeft());
    String _op = expr.getOp();
    String _plus = (_compile + _op);
    String _compile_1 = this.compile(expr.getRight());
    String _plus_1 = (_plus + _compile_1);
    _builder.append(_plus_1);
    _builder.append(")");
    return _builder.toString();
  }
  
  protected String _compile(final Selectcell expr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("df[");
    String _compile = this.compile(expr.getLineIndex());
    _builder.append(_compile);
    _builder.append("+1,");
    String _compile_1 = this.compile(expr.getColName());
    _builder.append(_compile_1);
    _builder.append("]");
    return _builder.toString();
  }
  
  protected String _compile(final NoneValue expr) {
    return expr.getValue();
  }
  
  protected String _compile(final IntValue expr) {
    return Integer.valueOf(expr.getValue()).toString();
  }
  
  protected String _compile(final StringValue expr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    String _value = expr.getValue();
    _builder.append(_value);
    _builder.append("\"");
    return _builder.toString();
  }
  
  public String compile(final EObject expr) {
    if (expr instanceof IntValue) {
      return _compile((IntValue)expr);
    } else if (expr instanceof Selectcell) {
      return _compile((Selectcell)expr);
    } else if (expr instanceof BinaryExpression) {
      return _compile((BinaryExpression)expr);
    } else if (expr instanceof Create) {
      return _compile((Create)expr);
    } else if (expr instanceof ExportCSV) {
      return _compile((ExportCSV)expr);
    } else if (expr instanceof ExportJSON) {
      return _compile((ExportJSON)expr);
    } else if (expr instanceof Insert) {
      return _compile((Insert)expr);
    } else if (expr instanceof InsertCol) {
      return _compile((InsertCol)expr);
    } else if (expr instanceof InsertLine) {
      return _compile((InsertLine)expr);
    } else if (expr instanceof Load) {
      return _compile((Load)expr);
    } else if (expr instanceof NoneValue) {
      return _compile((NoneValue)expr);
    } else if (expr instanceof Print) {
      return _compile((Print)expr);
    } else if (expr instanceof RemoveCol) {
      return _compile((RemoveCol)expr);
    } else if (expr instanceof RemoveLine) {
      return _compile((RemoveLine)expr);
    } else if (expr instanceof StringValue) {
      return _compile((StringValue)expr);
    } else if (expr instanceof Programme) {
      return _compile((Programme)expr);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expr).toString());
    }
  }
}
