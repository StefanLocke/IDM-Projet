/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.idmdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.idmdsl.Programme#getLoadscopes <em>Loadscopes</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.idmdsl.IdmdslPackage#getProgramme()
 * @model
 * @generated
 */
public interface Programme extends EObject
{
  /**
   * Returns the value of the '<em><b>Loadscopes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.idmdsl.Loadscope}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loadscopes</em>' containment reference list.
   * @see org.xtext.example.mydsl.idmdsl.IdmdslPackage#getProgramme_Loadscopes()
   * @model containment="true"
   * @generated
   */
  EList<Loadscope> getLoadscopes();

} // Programme
