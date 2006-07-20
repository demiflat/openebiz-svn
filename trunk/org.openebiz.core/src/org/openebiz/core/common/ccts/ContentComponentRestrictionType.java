/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.ccts;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Component Restriction Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.ccts.ContentComponentRestrictionType#getRestrictionType <em>Restriction Type</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.ContentComponentRestrictionType#getRestrictionValue <em>Restriction Value</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.ContentComponentRestrictionType#getExpressionType <em>Expression Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContentComponentRestrictionType implements Serializable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Open E-Biz - Darrell Kundel"; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getRestrictionType() <em>Restriction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestrictionType()
	 * @generated
	 * @ordered
	 */
	protected static final String RESTRICTION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRestrictionType() <em>Restriction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestrictionType()
	 * @generated
	 * @ordered
	 */
	protected String restrictionType = RESTRICTION_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRestrictionValue() <em>Restriction Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestrictionValue()
	 * @generated
	 * @ordered
	 */
	protected List  restrictionValue = null;

	/**
	 * The default value of the '{@link #getExpressionType() <em>Expression Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionType()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpressionType() <em>Expression Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionType()
	 * @generated
	 * @ordered
	 */
	protected String expressionType = EXPRESSION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentComponentRestrictionType() {
		super();
	}

	/**
	 * Returns the value of the '<em><b>Restriction Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Restriction Type</em>' attribute
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restriction Type</em>' attribute.
	 * @see #setRestrictionType(String)
	 * @generated
	 */
	public String getRestrictionType() {
		return (restrictionType == null) ? new String() : restrictionType;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ContentComponentRestrictionType#getRestrictionType <em>Restriction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restriction Type</em>' attribute.
	 * @see #getRestrictionType()
	 * @generated
	 */
	public void setRestrictionType(String newRestrictionType) {
		restrictionType = newRestrictionType;
	}

	/**
	 * Returns the value of the '<em><b>Restriction Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Restriction Value</em>' attribute list
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restriction Value</em>' attribute list.
	 * @generated
	 */
	public List getRestrictionValue() {
		if (restrictionValue == null) {
			restrictionValue = new ArrayList<String>();
		}
		return restrictionValue;
	}

	/**
	 * Returns the value of the '<em><b>Expression Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Expression Type</em>' attribute
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Type</em>' attribute.
	 * @see #setExpressionType(String)
	 * @generated
	 */
	public String getExpressionType() {
		return (expressionType == null) ? new String() : expressionType;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ContentComponentRestrictionType#getExpressionType <em>Expression Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression Type</em>' attribute.
	 * @see #getExpressionType()
	 * @generated
	 */
	public void setExpressionType(String newExpressionType) {
		expressionType = newExpressionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (restrictionType: "); //$NON-NLS-1$
		result.append(restrictionType);
		result.append(", restrictionValue: "); //$NON-NLS-1$
		result.append(restrictionValue);
		result.append(", expressionType: "); //$NON-NLS-1$
		result.append(expressionType);
		result.append(')');
		return result.toString();
	}

} // ContentComponentRestrictionType