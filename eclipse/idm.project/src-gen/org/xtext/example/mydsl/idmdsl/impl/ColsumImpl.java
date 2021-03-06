/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.idmdsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.idmdsl.Colsum;
import org.xtext.example.mydsl.idmdsl.IdmdslPackage;
import org.xtext.example.mydsl.idmdsl.StringValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Colsum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.idmdsl.impl.ColsumImpl#getColName <em>Col Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColsumImpl extends MathPrimaryExpressionImpl implements Colsum
{
  /**
   * The cached value of the '{@link #getColName() <em>Col Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColName()
   * @generated
   * @ordered
   */
  protected StringValue colName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ColsumImpl()
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
    return IdmdslPackage.Literals.COLSUM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringValue getColName()
  {
    return colName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetColName(StringValue newColName, NotificationChain msgs)
  {
    StringValue oldColName = colName;
    colName = newColName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IdmdslPackage.COLSUM__COL_NAME, oldColName, newColName);
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
  public void setColName(StringValue newColName)
  {
    if (newColName != colName)
    {
      NotificationChain msgs = null;
      if (colName != null)
        msgs = ((InternalEObject)colName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IdmdslPackage.COLSUM__COL_NAME, null, msgs);
      if (newColName != null)
        msgs = ((InternalEObject)newColName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IdmdslPackage.COLSUM__COL_NAME, null, msgs);
      msgs = basicSetColName(newColName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdmdslPackage.COLSUM__COL_NAME, newColName, newColName));
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
      case IdmdslPackage.COLSUM__COL_NAME:
        return basicSetColName(null, msgs);
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
      case IdmdslPackage.COLSUM__COL_NAME:
        return getColName();
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
      case IdmdslPackage.COLSUM__COL_NAME:
        setColName((StringValue)newValue);
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
      case IdmdslPackage.COLSUM__COL_NAME:
        setColName((StringValue)null);
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
      case IdmdslPackage.COLSUM__COL_NAME:
        return colName != null;
    }
    return super.eIsSet(featureID);
  }

} //ColsumImpl
