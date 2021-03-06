/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.idmdsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.idmdsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IdmdslFactoryImpl extends EFactoryImpl implements IdmdslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static IdmdslFactory init()
  {
    try
    {
      IdmdslFactory theIdmdslFactory = (IdmdslFactory)EPackage.Registry.INSTANCE.getEFactory(IdmdslPackage.eNS_URI);
      if (theIdmdslFactory != null)
      {
        return theIdmdslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new IdmdslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdmdslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case IdmdslPackage.PROGRAMME: return createProgramme();
      case IdmdslPackage.LOADSCOPE: return createLoadscope();
      case IdmdslPackage.LOAD: return createLoad();
      case IdmdslPackage.CREATE: return createCreate();
      case IdmdslPackage.INSTRUCTION: return createInstruction();
      case IdmdslPackage.INSERT_COL: return createInsertCol();
      case IdmdslPackage.REMOVE_COL: return createRemoveCol();
      case IdmdslPackage.INSERT_LINE: return createInsertLine();
      case IdmdslPackage.REMOVE_LINE: return createRemoveLine();
      case IdmdslPackage.INSERT: return createInsert();
      case IdmdslPackage.PRINT: return createPrint();
      case IdmdslPackage.EXPORT_CSV: return createExportCSV();
      case IdmdslPackage.EXPORT_JSON: return createExportJSON();
      case IdmdslPackage.EXPRESSION: return createExpression();
      case IdmdslPackage.MATH_EXPRESSION: return createMathExpression();
      case IdmdslPackage.BINARY_EXPRESSION: return createBinaryExpression();
      case IdmdslPackage.MATH_PRIMARY_EXPRESSION: return createMathPrimaryExpression();
      case IdmdslPackage.SELECTCELL: return createSelectcell();
      case IdmdslPackage.LINESUM: return createLinesum();
      case IdmdslPackage.COLSUM: return createColsum();
      case IdmdslPackage.LINEPROD: return createLineprod();
      case IdmdslPackage.COLPROD: return createColprod();
      case IdmdslPackage.NONE_VALUE: return createNoneValue();
      case IdmdslPackage.INT_VALUE: return createIntValue();
      case IdmdslPackage.STRING_VALUE: return createStringValue();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Programme createProgramme()
  {
    ProgrammeImpl programme = new ProgrammeImpl();
    return programme;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Loadscope createLoadscope()
  {
    LoadscopeImpl loadscope = new LoadscopeImpl();
    return loadscope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Load createLoad()
  {
    LoadImpl load = new LoadImpl();
    return load;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Create createCreate()
  {
    CreateImpl create = new CreateImpl();
    return create;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Instruction createInstruction()
  {
    InstructionImpl instruction = new InstructionImpl();
    return instruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InsertCol createInsertCol()
  {
    InsertColImpl insertCol = new InsertColImpl();
    return insertCol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RemoveCol createRemoveCol()
  {
    RemoveColImpl removeCol = new RemoveColImpl();
    return removeCol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InsertLine createInsertLine()
  {
    InsertLineImpl insertLine = new InsertLineImpl();
    return insertLine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RemoveLine createRemoveLine()
  {
    RemoveLineImpl removeLine = new RemoveLineImpl();
    return removeLine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Insert createInsert()
  {
    InsertImpl insert = new InsertImpl();
    return insert;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Print createPrint()
  {
    PrintImpl print = new PrintImpl();
    return print;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExportCSV createExportCSV()
  {
    ExportCSVImpl exportCSV = new ExportCSVImpl();
    return exportCSV;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExportJSON createExportJSON()
  {
    ExportJSONImpl exportJSON = new ExportJSONImpl();
    return exportJSON;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MathExpression createMathExpression()
  {
    MathExpressionImpl mathExpression = new MathExpressionImpl();
    return mathExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BinaryExpression createBinaryExpression()
  {
    BinaryExpressionImpl binaryExpression = new BinaryExpressionImpl();
    return binaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MathPrimaryExpression createMathPrimaryExpression()
  {
    MathPrimaryExpressionImpl mathPrimaryExpression = new MathPrimaryExpressionImpl();
    return mathPrimaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Selectcell createSelectcell()
  {
    SelectcellImpl selectcell = new SelectcellImpl();
    return selectcell;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Linesum createLinesum()
  {
    LinesumImpl linesum = new LinesumImpl();
    return linesum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Colsum createColsum()
  {
    ColsumImpl colsum = new ColsumImpl();
    return colsum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Lineprod createLineprod()
  {
    LineprodImpl lineprod = new LineprodImpl();
    return lineprod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Colprod createColprod()
  {
    ColprodImpl colprod = new ColprodImpl();
    return colprod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NoneValue createNoneValue()
  {
    NoneValueImpl noneValue = new NoneValueImpl();
    return noneValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntValue createIntValue()
  {
    IntValueImpl intValue = new IntValueImpl();
    return intValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringValue createStringValue()
  {
    StringValueImpl stringValue = new StringValueImpl();
    return stringValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IdmdslPackage getIdmdslPackage()
  {
    return (IdmdslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static IdmdslPackage getPackage()
  {
    return IdmdslPackage.eINSTANCE;
  }

} //IdmdslFactoryImpl
