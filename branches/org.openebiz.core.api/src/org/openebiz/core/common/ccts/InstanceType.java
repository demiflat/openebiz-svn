/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.ccts;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.ccts.InstanceType#getName <em>Name</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.InstanceType#getCodeListID <em>Code List ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.InstanceType#getCodeListAgencyID <em>Code List Agency ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.InstanceType#getCodeListAgencyName <em>Code List Agency Name</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.InstanceType#getCodeListName <em>Code List Name</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.InstanceType#getCodeListVersionID <em>Code List Version ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.InstanceType#getCodeListURI <em>Code List URI</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.InstanceType#getCodeListSchemeURI <em>Code List Scheme URI</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.InstanceType#getLanguageID <em>Language ID</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface InstanceType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.InstanceType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Code List ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code List ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code List ID</em>' attribute.
	 * @see #setCodeListID(String)
	 */
	String getCodeListID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.InstanceType#getCodeListID <em>Code List ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code List ID</em>' attribute.
	 * @see #getCodeListID()
	 */
	void setCodeListID(String value);

	/**
	 * Returns the value of the '<em><b>Code List Agency ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code List Agency ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code List Agency ID</em>' attribute.
	 * @see #setCodeListAgencyID(String)
	 */
	String getCodeListAgencyID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.InstanceType#getCodeListAgencyID <em>Code List Agency ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code List Agency ID</em>' attribute.
	 * @see #getCodeListAgencyID()
	 */
	void setCodeListAgencyID(String value);

	/**
	 * Returns the value of the '<em><b>Code List Agency Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code List Agency Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code List Agency Name</em>' attribute.
	 * @see #setCodeListAgencyName(String)
	 */
	String getCodeListAgencyName();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.InstanceType#getCodeListAgencyName <em>Code List Agency Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code List Agency Name</em>' attribute.
	 * @see #getCodeListAgencyName()
	 */
	void setCodeListAgencyName(String value);

	/**
	 * Returns the value of the '<em><b>Code List Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code List Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code List Name</em>' attribute.
	 * @see #setCodeListName(String)
	 */
	String getCodeListName();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.InstanceType#getCodeListName <em>Code List Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code List Name</em>' attribute.
	 * @see #getCodeListName()
	 */
	void setCodeListName(String value);

	/**
	 * Returns the value of the '<em><b>Code List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code List Version ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code List Version ID</em>' attribute.
	 * @see #setCodeListVersionID(String)
	 */
	String getCodeListVersionID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.InstanceType#getCodeListVersionID <em>Code List Version ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code List Version ID</em>' attribute.
	 * @see #getCodeListVersionID()
	 */
	void setCodeListVersionID(String value);

	/**
	 * Returns the value of the '<em><b>Code List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code List URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code List URI</em>' attribute.
	 * @see #setCodeListURI(String)
	 */
	String getCodeListURI();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.InstanceType#getCodeListURI <em>Code List URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code List URI</em>' attribute.
	 * @see #getCodeListURI()
	 */
	void setCodeListURI(String value);

	/**
	 * Returns the value of the '<em><b>Code List Scheme URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code List Scheme URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code List Scheme URI</em>' attribute.
	 * @see #setCodeListSchemeURI(String)
	 */
	String getCodeListSchemeURI();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.InstanceType#getCodeListSchemeURI <em>Code List Scheme URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code List Scheme URI</em>' attribute.
	 * @see #getCodeListSchemeURI()
	 */
	void setCodeListSchemeURI(String value);

	/**
	 * Returns the value of the '<em><b>Language ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language ID</em>' attribute.
	 * @see #setLanguageID(String)
	 */
	String getLanguageID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.InstanceType#getLanguageID <em>Language ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language ID</em>' attribute.
	 * @see #getLanguageID()
	 */
	void setLanguageID(String value);

} // InstanceType