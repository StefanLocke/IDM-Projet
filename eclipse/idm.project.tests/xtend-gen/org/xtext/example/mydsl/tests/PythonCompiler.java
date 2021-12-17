package org.xtext.example.mydsl.tests;

import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.xtext.example.mydsl.idmdsl.Binexpr;
import org.xtext.example.mydsl.idmdsl.Create;
import org.xtext.example.mydsl.idmdsl.ExportCSV;
import org.xtext.example.mydsl.idmdsl.ExportJSON;
import org.xtext.example.mydsl.idmdsl.Expression;
import org.xtext.example.mydsl.idmdsl.Insert;
import org.xtext.example.mydsl.idmdsl.InsertCol;
import org.xtext.example.mydsl.idmdsl.InsertLine;
import org.xtext.example.mydsl.idmdsl.Instruction;
import org.xtext.example.mydsl.idmdsl.IntValue;
import org.xtext.example.mydsl.idmdsl.Load;
import org.xtext.example.mydsl.idmdsl.Loadscope;
import org.xtext.example.mydsl.idmdsl.NoneValue;
import org.xtext.example.mydsl.idmdsl.PrimaryExpression;
import org.xtext.example.mydsl.idmdsl.Print;
import org.xtext.example.mydsl.idmdsl.Programme;
import org.xtext.example.mydsl.idmdsl.RemoveCol;
import org.xtext.example.mydsl.idmdsl.RemoveLine;
import org.xtext.example.mydsl.idmdsl.Selectcell;
import org.xtext.example.mydsl.idmdsl.StringValue;

@SuppressWarnings("all")
public class PythonCompiler {
  private final Programme prog;
  
  public PythonCompiler(final Programme prog) {
    this.prog = prog;
  }
  
  public String doCompile() {
    return this.compile(this.prog);
  }
  
  protected String _compile(final Programme prog) {
    String python = "import pandas as pd\n";
    EList<Loadscope> _loadscopes = prog.getLoadscopes();
    for (final Loadscope scope : _loadscopes) {
      String _python = python;
      String _compile = this.compile(scope);
      String _plus = (_compile + "\n");
      python = (_python + _plus);
    }
    return python;
  }
  
  protected String _compile(final Loadscope scope) {
    return "Loadscope";
  }
  
  protected String _compile(final Load scope) {
    String _xblockexpression = null;
    {
      String python = "";
      String _python = python;
      String _path = scope.getPath();
      String _plus = ("df = pd.read_csv(\"" + _path);
      String _plus_1 = (_plus + "\")\n");
      python = (_python + _plus_1);
      EList<Instruction> _instructions = scope.getInstructions();
      for (final Instruction instruction : _instructions) {
        String _python_1 = python;
        String _compile = this.compile(instruction);
        String _plus_2 = (_compile + "\n");
        python = (_python_1 + _plus_2);
      }
      _xblockexpression = python;
    }
    return _xblockexpression;
  }
  
  protected String _compile(final Create scope) {
    String _xblockexpression = null;
    {
      String python = "";
      String _python = python;
      python = (_python + "df = pd.DataFrame(list())\ndf.to_csv(\'temp.csv\')\n");
      EList<Instruction> _instructions = scope.getInstructions();
      for (final Instruction instruction : _instructions) {
        String _python_1 = python;
        String _compile = this.compile(instruction);
        String _plus = (_compile + "\n");
        python = (_python_1 + _plus);
      }
      _xblockexpression = python;
    }
    return _xblockexpression;
  }
  
  protected String _compile(final Instruction instruction) {
    return "Instruction";
  }
  
  protected String _compile(final InsertCol instruction) {
    String _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("df.insert(");
      String _compile = this.compile(instruction.getColIndex());
      _builder.append(_compile);
      _builder.append(",\"");
      String _colName = instruction.getColName();
      _builder.append(_colName);
      _builder.append("\")");
      String python = _builder.toString();
      _xblockexpression = python;
    }
    return _xblockexpression;
  }
  
  protected String _compile(final RemoveCol instruction) {
    String python = "";
    String _python = python;
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("df = df.drop(columns=df.columns[");
    String _compile = this.compile(instruction.getColIndex());
    _builder.append(_compile);
    _builder.append("])");
    python = (_python + _builder);
    Expression _colIndex = instruction.getColIndex();
    boolean _tripleNotEquals = (_colIndex != null);
    if (_tripleNotEquals) {
    } else {
      String _python_1 = python;
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("df = df.drop(columns=");
      String _name = instruction.getName();
      _builder_1.append(_name);
      _builder_1.append(")");
      python = (_python_1 + _builder_1);
    }
    return python;
  }
  
  protected String _compile(final InsertLine instruction) {
    return "Instruction";
  }
  
  protected String _compile(final RemoveLine instruction) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("df = df.drop(");
    String _compile = this.compile(instruction.getLineIndex());
    _builder.append(_compile);
    _builder.append(")");
    return _builder.toString();
  }
  
  protected String _compile(final Insert instruction) {
    String python = "";
    Expression _colNameOrIndex = instruction.getColNameOrIndex();
    if ((_colNameOrIndex instanceof Expression)) {
      String _python = python;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("df.at[");
      String _compile = this.compile(instruction.getLineIndex());
      _builder.append(_compile);
      _builder.append(", df.columns[");
      String _compile_1 = this.compile(instruction.getColNameOrIndex());
      _builder.append(_compile_1);
      _builder.append("]] = ");
      String _compile_2 = this.compile(instruction.getValue());
      _builder.append(_compile_2);
      python = (_python + _builder);
    } else {
      String _python_1 = python;
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("df.at[");
      String _compile_3 = this.compile(instruction.getLineIndex());
      _builder_1.append(_compile_3);
      _builder_1.append(", ");
      String _compile_4 = this.compile(instruction.getColNameOrIndex());
      _builder_1.append(_compile_4);
      _builder_1.append("] = ");
      String _compile_5 = this.compile(instruction.getValue());
      _builder_1.append(_compile_5);
      python = (_python_1 + _builder_1);
    }
    return python;
  }
  
  protected String _compile(final Print instruction) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("print(");
    String _compile = this.compile(instruction.getValue());
    _builder.append(_compile);
    _builder.append(")");
    return _builder.toString();
  }
  
  protected String _compile(final ExportCSV instruction) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("df.to_csv(\"");
    String _path = instruction.getPath();
    _builder.append(_path);
    _builder.append("\")");
    return _builder.toString();
  }
  
  protected String _compile(final ExportJSON instruction) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("df.to_json(\"");
    String _path = instruction.getPath();
    _builder.append(_path);
    _builder.append("\")");
    return _builder.toString();
  }
  
  protected String _compile(final Expression expr) {
    return "Expr not implemented";
  }
  
  protected String _compile(final PrimaryExpression expr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("PrimaryExpression");
    return _builder.toString();
  }
  
  protected String _compile(final Binexpr expr) {
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
    _builder.append("Selectcell");
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
    } else if (expr instanceof Binexpr) {
      return _compile((Binexpr)expr);
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
    } else if (expr instanceof PrimaryExpression) {
      return _compile((PrimaryExpression)expr);
    } else if (expr instanceof Print) {
      return _compile((Print)expr);
    } else if (expr instanceof RemoveCol) {
      return _compile((RemoveCol)expr);
    } else if (expr instanceof RemoveLine) {
      return _compile((RemoveLine)expr);
    } else if (expr instanceof Expression) {
      return _compile((Expression)expr);
    } else if (expr instanceof Instruction) {
      return _compile((Instruction)expr);
    } else if (expr instanceof Loadscope) {
      return _compile((Loadscope)expr);
    } else if (expr instanceof Programme) {
      return _compile((Programme)expr);
    } else if (expr instanceof StringValue) {
      return _compile((StringValue)expr);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expr).toString());
    }
  }
}
