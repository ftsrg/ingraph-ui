/**
 * generated by Xtext 2.13.0
 */
package org.slizaa.neo4j.opencypher.openCypher.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage;
import org.slizaa.neo4j.opencypher.openCypher.ReturnItem;
import org.slizaa.neo4j.opencypher.openCypher.ReturnItems;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Items</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.impl.ReturnItemsImpl#getAll <em>All</em>}</li>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.impl.ReturnItemsImpl#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReturnItemsImpl extends MinimalEObjectImpl.Container implements ReturnItems
{
  /**
   * The default value of the '{@link #getAll() <em>All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAll()
   * @generated
   * @ordered
   */
  protected static final String ALL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAll() <em>All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAll()
   * @generated
   * @ordered
   */
  protected String all = ALL_EDEFAULT;

  /**
   * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItems()
   * @generated
   * @ordered
   */
  protected EList<ReturnItem> items;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReturnItemsImpl()
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
    return OpenCypherPackage.Literals.RETURN_ITEMS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAll()
  {
    return all;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAll(String newAll)
  {
    String oldAll = all;
    all = newAll;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenCypherPackage.RETURN_ITEMS__ALL, oldAll, all));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReturnItem> getItems()
  {
    if (items == null)
    {
      items = new EObjectContainmentEList<ReturnItem>(ReturnItem.class, this, OpenCypherPackage.RETURN_ITEMS__ITEMS);
    }
    return items;
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
      case OpenCypherPackage.RETURN_ITEMS__ITEMS:
        return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
      case OpenCypherPackage.RETURN_ITEMS__ALL:
        return getAll();
      case OpenCypherPackage.RETURN_ITEMS__ITEMS:
        return getItems();
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
      case OpenCypherPackage.RETURN_ITEMS__ALL:
        setAll((String)newValue);
        return;
      case OpenCypherPackage.RETURN_ITEMS__ITEMS:
        getItems().clear();
        getItems().addAll((Collection<? extends ReturnItem>)newValue);
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
      case OpenCypherPackage.RETURN_ITEMS__ALL:
        setAll(ALL_EDEFAULT);
        return;
      case OpenCypherPackage.RETURN_ITEMS__ITEMS:
        getItems().clear();
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
      case OpenCypherPackage.RETURN_ITEMS__ALL:
        return ALL_EDEFAULT == null ? all != null : !ALL_EDEFAULT.equals(all);
      case OpenCypherPackage.RETURN_ITEMS__ITEMS:
        return items != null && !items.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (all: ");
    result.append(all);
    result.append(')');
    return result.toString();
  }

} //ReturnItemsImpl
