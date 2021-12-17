package org.xtext.example.mydsl.tests;

import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.xtext.example.mydsl.idmdsl.Expression;
import org.xtext.example.mydsl.idmdsl.InsertCol;
import org.xtext.example.mydsl.idmdsl.Instruction;
import org.xtext.example.mydsl.idmdsl.Loadscope;
import org.xtext.example.mydsl.idmdsl.Programme;

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
    String python = "";
    String _url = scope.getUrl();
    boolean _tripleNotEquals = (_url != null);
    if (_tripleNotEquals) {
      String _python = python;
      String _url_1 = scope.getUrl();
      String _plus = ("df = pd.read_csv(\"" + _url_1);
      String _plus_1 = (_plus + "\")\n");
      python = (_python + _plus_1);
    } else {
      String _python_1 = python;
      python = (_python_1 + "df = pd.DataFrame(list())\ndf.to_csv(\'temp.csv\')\n");
    }
    EList<Instruction> _instructions = scope.getInstructions();
    for (final Instruction instruction : _instructions) {
      String _python_2 = python;
      String _compile = this.compile(instruction);
      String _plus_2 = (_compile + "\n");
      python = (_python_2 + _plus_2);
    }
    return python;
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
      _builder.append(",");
      String _colName = instruction.getColName();
      _builder.append(_colName);
      _builder.append(")");
      String python = _builder.toString();
      _xblockexpression = python;
    }
    return _xblockexpression;
  }
  
  protected String _compile(final Expression expr) {
    return "Expr not implemented";
  }
  
  public String compile(final EObject instruction) {
    if (instruction instanceof InsertCol) {
      return _compile((InsertCol)instruction);
    } else if (instruction instanceof Expression) {
      return _compile((Expression)instruction);
    } else if (instruction instanceof Instruction) {
      return _compile((Instruction)instruction);
    } else if (instruction instanceof Loadscope) {
      return _compile((Loadscope)instruction);
    } else if (instruction instanceof Programme) {
      return _compile((Programme)instruction);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(instruction).toString());
    }
  }
}
