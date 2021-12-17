/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.idmdsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.idmdsl.Expression;
import org.xtext.example.mydsl.idmdsl.IdmdslPackage;
import org.xtext.example.mydsl.idmdsl.Modify;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modify</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.idmdsl.impl.ModifyImpl#getColIndex <em>Col Index</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.idmdsl.impl.ModifyImpl#getRowIndex <em>Row Index</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.idmdsl.impl.ModifyImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModifyImpl extends InstructionImpl implements Modify
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
   * The cached value of the '{@link #getRowIndex() <em>Row Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRowIndex()
   * @generated
   * @ordered
   */
  protected Expression rowIndex;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected EObject value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModifyImpl()
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
    return IdmdslPackage.Literals.MODIFY;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IdmdslPackage.MODIFY__COL_INDEX, oldColIndex, newColIndex);
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
        msgs = ((InternalEObject)colIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IdmdslPackage.MODIFY__COL_INDEX, null, msgs);
      if (newColIndex != null)
        msgs = ((InternalEObject)newColIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IdmdslPackage.MODIFY__COL_INDEX, null, msgs);
      msgs = basicSetColIndex(newColIndex, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdmdslPackage.MODIFY__COL_INDEX, newColIndex, newColIndex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getRowIndex()
  {
    return rowIndex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRowIndex(Expression newRowIndex, NotificationChain msgs)
  {
    Expression oldRowIndex = rowIndex;
    rowIndex = newRowIndex;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IdmdslPackage.MODIFY__ROW_INDEX, oldRowIndex, newRowIndex);
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
  public void setRowIndex(Expression newRowIndex)
  {
    if (newRowIndex != rowIndex)
    {
      NotificationChain msgs = null;
      if (rowIndex != null)
        msgs = ((InternalEObject)rowIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IdmdslPackage.MODIFY__ROW_INDEX, null, msgs);
      if (newRowIndex != null)
        msgs = ((InternalEObject)newRowIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IdmdslPackage.MODIFY__ROW_INDEX, null, msgs);
      msgs = basicSetRowIndex(newRowIndex, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdmdslPackage.MODIFY__ROW_INDEX, newRowIndex, newRowIndex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(EObject newValue, NotificationChain msgs)
  {
    EObject oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IdmdslPackage.MODIFY__VALUE, oldValue, newValue);
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
  public void setValue(EObject newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IdmdslPackage.MODIFY__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IdmdslPackage.MODIFY__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdmdslPackage.MODIFY__VALUE, newValue, newValue));
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
      case IdmdslPackage.MODIFY__COL_INDEX:
        return basicSetColIndex(null, msgs);
      case IdmdslPackage.MODIFY__ROW_INDEX:
        return basicSetRowIndex(null, msgs);
      case IdmdslPackage.MODIFY__VALUE:
        return basicSetValue(null, msgs);
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
      case IdmdslPackage.MODIFY__COL_INDEX:
        return getColIndex();
      case IdmdslPackage.MODIFY__ROW_INDEX:
        return getRowIndex();
      case IdmdslPackage.MODIFY__VALUE:
        return getValue();
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
      case IdmdslPackage.MODIFY__COL_INDEX:
        setColIndex((Expression)newValue);
        return;
      case IdmdslPackage.MODIFY__ROW_INDEX:
        setRowIndex((Expression)newValue);
        return;
      case IdmdslPackage.MODIFY__VALUE:
        setValue((EObject)newValue);
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
      case IdmdslPackage.MODIFY__COL_INDEX:
        setColIndex((Expression)null);
        return;
      case IdmdslPackage.MODIFY__ROW_INDEX:
        setRowIndex((Expression)null);
        return;
      case IdmdslPackage.MODIFY__VALUE:
        setValue((EObject)null);
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
      case IdmdslPackage.MODIFY__COL_INDEX:
        return colIndex != null;
      case IdmdslPackage.MODIFY__ROW_INDEX:
        return rowIndex != null;
      case IdmdslPackage.MODIFY__VALUE:
        return value != null;
    }
    return super.eIsSet(featureID);
  }

} //ModifyImpl
