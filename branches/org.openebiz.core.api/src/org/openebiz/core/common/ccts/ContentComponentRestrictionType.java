/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.ccts;

import java.util.List;

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
 */
public interface ContentComponentRestrictionType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Restriction Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restriction Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restriction Type</em>' attribute.
	 * @see #setRestrictionType(String)
	 */
	String getRestrictionType();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ContentComponentRestrictionType#getRestrictionType <em>Restriction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restriction Type</em>' attribute.
	 * @see #getRestrictionType()
	 */
	void setRestrictionType(String value);

	/**
	 * Returns the value of the '<em><b>Restriction Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restriction Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restriction Value</em>' attribute list.
	 */
	List getRestrictionValue();

	/**
	 * Returns the value of the '<em><b>Expression Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Type</em>' attribute.
	 * @see #setExpressionType(String)
	 */
	String getExpressionType();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ContentComponentRestrictionType#getExpressionType <em>Expression Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression Type</em>' attribute.
	 * @see #getExpressionType()
	 */
	void setExpressionType(String value);

} // ContentComponentRestrictionType