/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.idmdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linesum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.idmdsl.Linesum#getLineIndex <em>Line Index</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.idmdsl.IdmdslPackage#getLinesum()
 * @model
 * @generated
 */
public interface Linesum extends PrimaryExpression
{
  /**
   * Returns the value of the '<em><b>Line Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Line Index</em>' containment reference.
   * @see #setLineIndex(Expression)
   * @see org.xtext.example.mydsl.idmdsl.IdmdslPackage#getLinesum_LineIndex()
   * @model containment="true"
   * @generated
   */
  Expression getLineIndex();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.idmdsl.Linesum#getLineIndex <em>Line Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Line Index</em>' containment reference.
   * @see #getLineIndex()
   * @generated
   */
  void setLineIndex(Expression value);

} // Linesum
