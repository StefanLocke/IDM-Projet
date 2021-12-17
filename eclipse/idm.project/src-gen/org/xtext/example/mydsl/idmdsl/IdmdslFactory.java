/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.idmdsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.idmdsl.IdmdslPackage
 * @generated
 */
public interface IdmdslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  IdmdslFactory eINSTANCE = org.xtext.example.mydsl.idmdsl.impl.IdmdslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Programme</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Programme</em>'.
   * @generated
   */
  Programme createProgramme();

  /**
   * Returns a new object of class '<em>Loadscope</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Loadscope</em>'.
   * @generated
   */
  Loadscope createLoadscope();

  /**
   * Returns a new object of class '<em>Load</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Load</em>'.
   * @generated
   */
  Load createLoad();

  /**
   * Returns a new object of class '<em>Create</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Create</em>'.
   * @generated
   */
  Create createCreate();

  /**
   * Returns a new object of class '<em>Instruction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction</em>'.
   * @generated
   */
  Instruction createInstruction();

  /**
   * Returns a new object of class '<em>Insert Col</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Insert Col</em>'.
   * @generated
   */
  InsertCol createInsertCol();

  /**
   * Returns a new object of class '<em>Remove Col</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Remove Col</em>'.
   * @generated
   */
  RemoveCol createRemoveCol();

  /**
   * Returns a new object of class '<em>Insert Line</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Insert Line</em>'.
   * @generated
   */
  InsertLine createInsertLine();

  /**
   * Returns a new object of class '<em>Remove Line</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Remove Line</em>'.
   * @generated
   */
  RemoveLine createRemoveLine();

  /**
   * Returns a new object of class '<em>Insert</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Insert</em>'.
   * @generated
   */
  Insert createInsert();

  /**
   * Returns a new object of class '<em>Print</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Print</em>'.
   * @generated
   */
  Print createPrint();

  /**
   * Returns a new object of class '<em>Export CSV</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Export CSV</em>'.
   * @generated
   */
  ExportCSV createExportCSV();

  /**
   * Returns a new object of class '<em>Export JSON</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Export JSON</em>'.
   * @generated
   */
  ExportJSON createExportJSON();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Primary Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primary Expression</em>'.
   * @generated
   */
  PrimaryExpression createPrimaryExpression();

  /**
   * Returns a new object of class '<em>Selectcell</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Selectcell</em>'.
   * @generated
   */
  Selectcell createSelectcell();

  /**
   * Returns a new object of class '<em>Linesum</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Linesum</em>'.
   * @generated
   */
  Linesum createLinesum();

  /**
   * Returns a new object of class '<em>Colsum</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Colsum</em>'.
   * @generated
   */
  Colsum createColsum();

  /**
   * Returns a new object of class '<em>Lineprod</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lineprod</em>'.
   * @generated
   */
  Lineprod createLineprod();

  /**
   * Returns a new object of class '<em>Colprod</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Colprod</em>'.
   * @generated
   */
  Colprod createColprod();

  /**
   * Returns a new object of class '<em>Binexpr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Binexpr</em>'.
   * @generated
   */
  Binexpr createBinexpr();

  /**
   * Returns a new object of class '<em>None Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>None Value</em>'.
   * @generated
   */
  NoneValue createNoneValue();

  /**
   * Returns a new object of class '<em>Int Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Value</em>'.
   * @generated
   */
  IntValue createIntValue();

  /**
   * Returns a new object of class '<em>String Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Value</em>'.
   * @generated
   */
  StringValue createStringValue();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  IdmdslPackage getIdmdslPackage();

} //IdmdslFactory
