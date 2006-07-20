/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.ccts;

import java.io.Serializable;

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
 * @generated
 */
public class InstanceType implements Serializable {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeListID() <em>Code List ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeListID()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_LIST_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeListID() <em>Code List ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeListID()
	 * @generated
	 * @ordered
	 */
	protected String codeListID = CODE_LIST_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeListAgencyID() <em>Code List Agency ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeListAgencyID()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_LIST_AGENCY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeListAgencyID() <em>Code List Agency ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeListAgencyID()
	 * @generated
	 * @ordered
	 */
	protected String codeListAgencyID = CODE_LIST_AGENCY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeListAgencyName() <em>Code List Agency Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeListAgencyName()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_LIST_AGENCY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeListAgencyName() <em>Code List Agency Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeListAgencyName()
	 * @generated
	 * @ordered
	 */
	protected String codeListAgencyName = CODE_LIST_AGENCY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeListName() <em>Code List Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeListName()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_LIST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeListName() <em>Code List Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeListName()
	 * @generated
	 * @ordered
	 */
	protected String codeListName = CODE_LIST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeListVersionID() <em>Code List Version ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeListVersionID()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_LIST_VERSION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeListVersionID() <em>Code List Version ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeListVersionID()
	 * @generated
	 * @ordered
	 */
	protected String codeListVersionID = CODE_LIST_VERSION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeListURI() <em>Code List URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeListURI()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_LIST_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeListURI() <em>Code List URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeListURI()
	 * @generated
	 * @ordered
	 */
	protected String codeListURI = CODE_LIST_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeListSchemeURI() <em>Code List Scheme URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeListSchemeURI()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_LIST_SCHEME_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeListSchemeURI() <em>Code List Scheme URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeListSchemeURI()
	 * @generated
	 * @ordered
	 */
	protected String codeListSchemeURI = CODE_LIST_SCHEME_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguageID() <em>Language ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageID()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguageID() <em>Language ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageID()
	 * @generated
	 * @ordered
	 */
	protected String languageID = LANGUAGE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceType() {
		super();
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Name</em>' attribute
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	public String getName() {
		return (name == null) ? new String() : name;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.InstanceType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * Returns the value of the '<em><b>Code List ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Code List ID</em>' attribute
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code List ID</em>' attribute.
	 * @see #setCodeListID(String)
	 * @generated
	 */
	public String getCodeListID() {
		return (codeListID == null) ? new String() : codeListID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.InstanceType#getCodeListID <em>Code List ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code List ID</em>' attribute.
	 * @see #getCodeListID()
	 * @generated
	 */
	public void setCodeListID(String newCodeListID) {
		codeListID = newCodeListID;
	}

	/**
	 * Returns the value of the '<em><b>Code List Agency ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Code List Agency ID</em>' attribute
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code List Agency ID</em>' attribute.
	 * @see #setCodeListAgencyID(String)
	 * @generated
	 */
	public String getCodeListAgencyID() {
		return (codeListAgencyID == null) ? new String() : codeListAgencyID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.InstanceType#getCodeListAgencyID <em>Code List Agency ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code List Agency ID</em>' attribute.
	 * @see #getCodeListAgencyID()
	 * @generated
	 */
	public void setCodeListAgencyID(String newCodeListAgencyID) {
		codeListAgencyID = newCodeListAgencyID;
	}

	/**
	 * Returns the value of the '<em><b>Code List Agency Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Code List Agency Name</em>' attribute
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code List Agency Name</em>' attribute.
	 * @see #setCodeListAgencyName(String)
	 * @generated
	 */
	public String getCodeListAgencyName() {
		return (codeListAgencyName == null) ? new String() : codeListAgencyName;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.InstanceType#getCodeListAgencyName <em>Code List Agency Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code List Agency Name</em>' attribute.
	 * @see #getCodeListAgencyName()
	 * @generated
	 */
	public void setCodeListAgencyName(String newCodeListAgencyName) {
		codeListAgencyName = newCodeListAgencyName;
	}

	/**
	 * Returns the value of the '<em><b>Code List Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Code List Name</em>' attribute
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code List Name</em>' attribute.
	 * @see #setCodeListName(String)
	 * @generated
	 */
	public String getCodeListName() {
		return (codeListName == null) ? new String() : codeListName;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.InstanceType#getCodeListName <em>Code List Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code List Name</em>' attribute.
	 * @see #getCodeListName()
	 * @generated
	 */
	public void setCodeListName(String newCodeListName) {
		codeListName = newCodeListName;
	}

	/**
	 * Returns the value of the '<em><b>Code List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Code List Version ID</em>' attribute
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code List Version ID</em>' attribute.
	 * @see #setCodeListVersionID(String)
	 * @generated
	 */
	public String getCodeListVersionID() {
		return (codeListVersionID == null) ? new String() : codeListVersionID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.InstanceType#getCodeListVersionID <em>Code List Version ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code List Version ID</em>' attribute.
	 * @see #getCodeListVersionID()
	 * @generated
	 */
	public void setCodeListVersionID(String newCodeListVersionID) {
		codeListVersionID = newCodeListVersionID;
	}

	/**
	 * Returns the value of the '<em><b>Code List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Code List URI</em>' attribute
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code List URI</em>' attribute.
	 * @see #setCodeListURI(String)
	 * @generated
	 */
	public String getCodeListURI() {
		return (codeListURI == null) ? new String() : codeListURI;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.InstanceType#getCodeListURI <em>Code List URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code List URI</em>' attribute.
	 * @see #getCodeListURI()
	 * @generated
	 */
	public void setCodeListURI(String newCodeListURI) {
		codeListURI = newCodeListURI;
	}

	/**
	 * Returns the value of the '<em><b>Code List Scheme URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Code List Scheme URI</em>' attribute
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code List Scheme URI</em>' attribute.
	 * @see #setCodeListSchemeURI(String)
	 * @generated
	 */
	public String getCodeListSchemeURI() {
		return (codeListSchemeURI == null) ? new String() : codeListSchemeURI;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.InstanceType#getCodeListSchemeURI <em>Code List Scheme URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code List Scheme URI</em>' attribute.
	 * @see #getCodeListSchemeURI()
	 * @generated
	 */
	public void setCodeListSchemeURI(String newCodeListSchemeURI) {
		codeListSchemeURI = newCodeListSchemeURI;
	}

	/**
	 * Returns the value of the '<em><b>Language ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Language ID</em>' attribute
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language ID</em>' attribute.
	 * @see #setLanguageID(String)
	 * @generated
	 */
	public String getLanguageID() {
		return (languageID == null) ? new String() : languageID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.InstanceType#getLanguageID <em>Language ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language ID</em>' attribute.
	 * @see #getLanguageID()
	 * @generated
	 */
	public void setLanguageID(String newLanguageID) {
		languageID = newLanguageID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", codeListID: "); //$NON-NLS-1$
		result.append(codeListID);
		result.append(", codeListAgencyID: "); //$NON-NLS-1$
		result.append(codeListAgencyID);
		result.append(", codeListAgencyName: "); //$NON-NLS-1$
		result.append(codeListAgencyName);
		result.append(", codeListName: "); //$NON-NLS-1$
		result.append(codeListName);
		result.append(", codeListVersionID: "); //$NON-NLS-1$
		result.append(codeListVersionID);
		result.append(", codeListURI: "); //$NON-NLS-1$
		result.append(codeListURI);
		result.append(", codeListSchemeURI: "); //$NON-NLS-1$
		result.append(codeListSchemeURI);
		result.append(", languageID: "); //$NON-NLS-1$
		result.append(languageID);
		result.append(')');
		return result.toString();
	}

} // InstanceType