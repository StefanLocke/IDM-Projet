/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.idmdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.idmdsl.StringValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.idmdsl.IdmdslPackage#getStringValue()
 * @model
 * @generated
 */
public interface StringValue extends Expression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.xtext.example.mydsl.idmdsl.IdmdslPackage#getStringValue_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.idmdsl.StringValue#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // StringValue
