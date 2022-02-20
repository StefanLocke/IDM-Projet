/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.idmdsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.idmdsl.Expression;
import org.xtext.example.mydsl.idmdsl.IdmdslPackage;
import org.xtext.example.mydsl.idmdsl.InsertLine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Insert Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.idmdsl.impl.InsertLineImpl#getLineIndex <em>Line Index</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.idmdsl.impl.InsertLineImpl#getExps <em>Exps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InsertLineImpl extends InstructionImpl implements InsertLine
{
  /**
   * The cached value of the '{@link #getLineIndex() <em>Line Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLineIndex()
   * @generated
   * @ordered
   */
  protected Expression lineIndex;

  /**
   * The cached value of the '{@link #getExps() <em>Exps</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExps()
   * @generated
   * @ordered
   */
  protected EList<Expression> exps;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InsertLineImpl()
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
    return IdmdslPackage.Literals.INSERT_LINE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getLineIndex()
  {
    return lineIndex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLineIndex(Expression newLineIndex, NotificationChain msgs)
  {
    Expression oldLineIndex = lineIndex;
    lineIndex = newLineIndex;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IdmdslPackage.INSERT_LINE__LINE_INDEX, oldLineIndex, newLineIndex);
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
  public void setLineIndex(Expression newLineIndex)
  {
    if (newLineIndex != lineIndex)
    {
      NotificationChain msgs = null;
      if (lineIndex != null)
        msgs = ((InternalEObject)lineIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IdmdslPackage.INSERT_LINE__LINE_INDEX, null, msgs);
      if (newLineIndex != null)
        msgs = ((InternalEObject)newLineIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IdmdslPackage.INSERT_LINE__LINE_INDEX, null, msgs);
      msgs = basicSetLineIndex(newLineIndex, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdmdslPackage.INSERT_LINE__LINE_INDEX, newLineIndex, newLineIndex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Expression> getExps()
  {
    if (exps == null)
    {
      exps = new EObjectContainmentEList<Expression>(Expression.class, this, IdmdslPackage.INSERT_LINE__EXPS);
    }
    return exps;
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
      case IdmdslPackage.INSERT_LINE__LINE_INDEX:
        return basicSetLineIndex(null, msgs);
      case IdmdslPackage.INSERT_LINE__EXPS:
        return ((InternalEList<?>)getExps()).basicRemove(otherEnd, msgs);
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
      case IdmdslPackage.INSERT_LINE__LINE_INDEX:
        return getLineIndex();
      case IdmdslPackage.INSERT_LINE__EXPS:
        return getExps();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case IdmdslPackage.INSERT_LINE__LINE_INDEX:
        setLineIndex((Expression)newValue);
        return;
      case IdmdslPackage.INSERT_LINE__EXPS:
        getExps().clear();
        getExps().addAll((Collection<? extends Expression>)newValue);
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
      case IdmdslPackage.INSERT_LINE__LINE_INDEX:
        setLineIndex((Expression)null);
        return;
      case IdmdslPackage.INSERT_LINE__EXPS:
        getExps().clear();
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
      case IdmdslPackage.INSERT_LINE__LINE_INDEX:
        return lineIndex != null;
      case IdmdslPackage.INSERT_LINE__EXPS:
        return exps != null && !exps.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //InsertLineImpl