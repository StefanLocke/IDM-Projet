/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.idmdsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.idmdsl.Colprod;
import org.xtext.example.mydsl.idmdsl.Expression;
import org.xtext.example.mydsl.idmdsl.IdmdslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Colprod</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.idmdsl.impl.ColprodImpl#getColIndex <em>Col Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColprodImpl extends MinimalEObjectImpl.Container implements Colprod
{
  /**
   * The cached value of the '{@link #getColIndex() <em>Col Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColIndex()
   * @generated
   * @ordered
   */
  protected Expression colIndex;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ColprodImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return IdmdslPackage.Literals.COLPROD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getColIndex()
  {
    return colIndex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetColIndex(Expression newColIndex, NotificationChain msgs)
  {
    Expression oldColIndex = colIndex;
    colIndex = newColIndex;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IdmdslPackage.COLPROD__COL_INDEX, oldColIndex, newColIndex);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setColIndex(Expression newColIndex)
  {
    if (newColIndex != colIndex)
    {
      NotificationChain msgs = null;
      if (colIndex != null)
        msgs = ((InternalEObject)colIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IdmdslPackage.COLPROD__COL_INDEX, null, msgs);
      if (newColIndex != null)
        msgs = ((InternalEObject)newColIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IdmdslPackage.COLPROD__COL_INDEX, null, msgs);
      msgs = basicSetColIndex(newColIndex, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdmdslPackage.COLPROD__COL_INDEX, newColIndex, newColIndex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case IdmdslPackage.COLPROD__COL_INDEX:
        return basicSetColIndex(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case IdmdslPackage.COLPROD__COL_INDEX:
        return getColIndex();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case IdmdslPackage.COLPROD__COL_INDEX:
        setColIndex((Expression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case IdmdslPackage.COLPROD__COL_INDEX:
        setColIndex((Expression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case IdmdslPackage.COLPROD__COL_INDEX:
        return colIndex != null;
    }
    return super.eIsSet(featureID);
  }

} //ColprodImpl
