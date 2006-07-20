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
 * A representation of the model object '<em><b>Context Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.ccts.ContextType#getIndustryClassification <em>Industry Classification</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.ContextType#getGeopolitical <em>Geopolitical</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.ContextType#getBusinessProcess <em>Business Process</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.ContextType#getOfficialConstraint <em>Official Constraint</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.ContextType#getProductClassification <em>Product Classification</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.ContextType#getBusinessProcessRole <em>Business Process Role</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.ContextType#getSupportingRole <em>Supporting Role</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.ContextType#getSystemCapability <em>System Capability</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface ContextType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Industry Classification</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Industry Classification</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Industry Classification</em>' attribute list.
	 */
	List getIndustryClassification();

	/**
	 * Returns the value of the '<em><b>Geopolitical</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geopolitical</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geopolitical</em>' attribute list.
	 */
	List getGeopolitical();

	/**
	 * Returns the value of the '<em><b>Business Process</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Process</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Process</em>' attribute list.
	 */
	List getBusinessProcess();

	/**
	 * Returns the value of the '<em><b>Official Constraint</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Official Constraint</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Official Constraint</em>' attribute list.
	 */
	List getOfficialConstraint();

	/**
	 * Returns the value of the '<em><b>Product Classification</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Classification</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Classification</em>' attribute list.
	 */
	List getProductClassification();

	/**
	 * Returns the value of the '<em><b>Business Process Role</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Process Role</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Process Role</em>' attribute list.
	 */
	List getBusinessProcessRole();

	/**
	 * Returns the value of the '<em><b>Supporting Role</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supporting Role</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supporting Role</em>' attribute list.
	 */
	List getSupportingRole();

	/**
	 * Returns the value of the '<em><b>System Capability</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Capability</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Capability</em>' attribute list.
	 */
	List getSystemCapability();

} // ContextType