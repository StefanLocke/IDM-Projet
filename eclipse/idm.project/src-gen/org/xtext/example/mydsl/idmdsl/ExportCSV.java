/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.idmdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Export CSV</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.idmdsl.ExportCSV#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.idmdsl.IdmdslPackage#getExportCSV()
 * @model
 * @generated
 */
public interface ExportCSV extends Instruction
{
  /**
   * Returns the value of the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' containment reference.
   * @see #setPath(StringValue)
   * @see org.xtext.example.mydsl.idmdsl.IdmdslPackage#getExportCSV_Path()
   * @model containment="true"
   * @generated
   */
  StringValue getPath();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.idmdsl.ExportCSV#getPath <em>Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' containment reference.
   * @see #getPath()
   * @generated
   */
  void setPath(StringValue value);

} // ExportCSV
