/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.idmdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colsum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.idmdsl.Colsum#getColName <em>Col Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.idmdsl.IdmdslPackage#getColsum()
 * @model
 * @generated
 */
public interface Colsum extends MathPrimaryExpression
{
  /**
   * Returns the value of the '<em><b>Col Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Col Name</em>' containment reference.
   * @see #setColName(StringValue)
   * @see org.xtext.example.mydsl.idmdsl.IdmdslPackage#getColsum_ColName()
   * @model containment="true"
   * @generated
   */
  StringValue getColName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.idmdsl.Colsum#getColName <em>Col Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Col Name</em>' containment reference.
   * @see #getColName()
   * @generated
   */
  void setColName(StringValue value);

} // Colsum
