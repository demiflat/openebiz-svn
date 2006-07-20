/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.sdt;

import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Status Code Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>DT</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Line Status_ Code. Type</ccts:DictionaryEntryName>
 *           <ccts:Version>2</ccts:Version>
 *           <ccts:Definition>The set of possible statuses of a line in a transaction with regard to its original state.</ccts:Definition>
 *           <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
 *           <ccts:DataTypeQualifier>Line Status</ccts:DataTypeQualifier>
 *           <ccts:DataType>Code. Type</ccts:DataType>
 *         </ccts:Component>
 *         <ccts:Instance xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2"/>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.sdt.LineStatusCodeType#getValue <em>Value</em>}</li>
 *   <li>{@link org.openebiz.core.common.sdt.LineStatusCodeType#getLanguageID <em>Language ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.sdt.LineStatusCodeType#getListAgencyID <em>List Agency ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.sdt.LineStatusCodeType#getListAgencyName <em>List Agency Name</em>}</li>
 *   <li>{@link org.openebiz.core.common.sdt.LineStatusCodeType#getListID <em>List ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.sdt.LineStatusCodeType#getListName <em>List Name</em>}</li>
 *   <li>{@link org.openebiz.core.common.sdt.LineStatusCodeType#getListSchemeURI <em>List Scheme URI</em>}</li>
 *   <li>{@link org.openebiz.core.common.sdt.LineStatusCodeType#getListURI <em>List URI</em>}</li>
 *   <li>{@link org.openebiz.core.common.sdt.LineStatusCodeType#getListVersionID <em>List Version ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.sdt.LineStatusCodeType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LineStatusCodeType implements Serializable {
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

	/*
	 * Basic Entity support code for surrogate id's
	 */
	protected Long internalId = null;

	protected Integer version = null;

	/**
	 * @return Returns the internalId.
	 */
	public Long getInternalId() {
		return this.internalId;
	}

	/**
	 * @param internalId The internalId to set.
	 */
	public void setInternalId(Long internalId) {
		this.internalId = internalId;
	}

	/**
	 * @return Returns the version.
	 */
	public Integer getVersion() {
		return this.version;
	}

	/**
	 * @param version The version to set.
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguageID() <em>Language ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageID()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_ID_EDEFAULT = "en"; //$NON-NLS-1$

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
	 * The default value of the '{@link #getListAgencyID() <em>List Agency ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListAgencyID()
	 * @generated
	 * @ordered
	 */
	protected static final String LIST_AGENCY_ID_EDEFAULT = "UBL"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getListAgencyID() <em>List Agency ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListAgencyID()
	 * @generated
	 * @ordered
	 */
	protected String listAgencyID = LIST_AGENCY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getListAgencyName() <em>List Agency Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListAgencyName()
	 * @generated
	 * @ordered
	 */
	protected static final String LIST_AGENCY_NAME_EDEFAULT = "OASIS Universal Business Language"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getListAgencyName() <em>List Agency Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListAgencyName()
	 * @generated
	 * @ordered
	 */
	protected String listAgencyName = LIST_AGENCY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getListID() <em>List ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListID()
	 * @generated
	 * @ordered
	 */
	protected static final String LIST_ID_EDEFAULT = "Line Status"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getListID() <em>List ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListID()
	 * @generated
	 * @ordered
	 */
	protected String listID = LIST_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getListName() <em>List Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListName()
	 * @generated
	 * @ordered
	 */
	protected static final String LIST_NAME_EDEFAULT = "Line Status"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getListName() <em>List Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListName()
	 * @generated
	 * @ordered
	 */
	protected String listName = LIST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getListSchemeURI() <em>List Scheme URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListSchemeURI()
	 * @generated
	 * @ordered
	 */
	protected static final String LIST_SCHEME_URI_EDEFAULT = "urn:oasis:names:specification:ubl:schema:xsd:LineStatusCode-1.0"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getListSchemeURI() <em>List Scheme URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListSchemeURI()
	 * @generated
	 * @ordered
	 */
	protected String listSchemeURI = LIST_SCHEME_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getListURI() <em>List URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListURI()
	 * @generated
	 * @ordered
	 */
	protected static final String LIST_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getListURI() <em>List URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListURI()
	 * @generated
	 * @ordered
	 */
	protected String listURI = LIST_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getListVersionID() <em>List Version ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListVersionID()
	 * @generated
	 * @ordered
	 */
	protected static final String LIST_VERSION_ID_EDEFAULT = "1.0"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getListVersionID() <em>List Version ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListVersionID()
	 * @generated
	 * @ordered
	 */
	protected String listVersionID = LIST_VERSION_ID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineStatusCodeType() {
		super();
	}

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Value</em>' attribute
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @generated
	 */
	public String getValue() {
		return (value == null) ? new String() : value;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.sdt.LineStatusCodeType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	public void setValue(String newValue) {
		value = newValue;
	}

	/**
	 * Returns the value of the '<em><b>Language ID</b></em>' attribute.
	 * The default value is <code>"en"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *                 <ccts:ComponentType>SC</ccts:ComponentType>
	 *                 <ccts:DictionaryEntryName>Line Status_ Language. Identifier</ccts:DictionaryEntryName>
	 *                 <ccts:Version/>
	 *                 <ccts:Definition/>
	 *                 <ccts:PrimitiveType>String</ccts:PrimitiveType>
	 *               </ccts:Component>
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language ID</em>' attribute.
	 * @see #setLanguageID(String)
	 * @generated
	 */
	public String getLanguageID() {
		return (languageID == null) ? new String() : languageID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.sdt.LineStatusCodeType#getLanguageID <em>Language ID</em>}' attribute.
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
	 * Returns the value of the '<em><b>List Agency ID</b></em>' attribute.
	 * The default value is <code>"UBL"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *                 <ccts:ComponentType>SC</ccts:ComponentType>
	 *                 <ccts:DictionaryEntryName>Line Status_ Code List. Agency. Identifier</ccts:DictionaryEntryName>
	 *                 <ccts:Version/>
	 *                 <ccts:Definition/>
	 *                 <ccts:PrimitiveType>String</ccts:PrimitiveType>
	 *               </ccts:Component>
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>List Agency ID</em>' attribute.
	 * @see #setListAgencyID(String)
	 * @generated
	 */
	public String getListAgencyID() {
		return (listAgencyID == null) ? new String() : listAgencyID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.sdt.LineStatusCodeType#getListAgencyID <em>List Agency ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Agency ID</em>' attribute.
	 * @see #getListAgencyID()
	 * @generated
	 */
	public void setListAgencyID(String newListAgencyID) {
		listAgencyID = newListAgencyID;
	}

	/**
	 * Returns the value of the '<em><b>List Agency Name</b></em>' attribute.
	 * The default value is <code>"OASIS Universal Business Language"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *                 <ccts:ComponentType>SC</ccts:ComponentType>
	 *                 <ccts:DictionaryEntryName>Line Status_ Code List. Agency Name. Text</ccts:DictionaryEntryName>
	 *                 <ccts:Version/>
	 *                 <ccts:Definition/>
	 *                 <ccts:PrimitiveType>String</ccts:PrimitiveType>
	 *               </ccts:Component>
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>List Agency Name</em>' attribute.
	 * @see #setListAgencyName(String)
	 * @generated
	 */
	public String getListAgencyName() {
		return (listAgencyName == null) ? new String() : listAgencyName;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.sdt.LineStatusCodeType#getListAgencyName <em>List Agency Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Agency Name</em>' attribute.
	 * @see #getListAgencyName()
	 * @generated
	 */
	public void setListAgencyName(String newListAgencyName) {
		listAgencyName = newListAgencyName;
	}

	/**
	 * Returns the value of the '<em><b>List ID</b></em>' attribute.
	 * The default value is <code>"Line Status"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *                 <ccts:ComponentType>SC</ccts:ComponentType>
	 *                 <ccts:DictionaryEntryName>Line Status_ Code List. Identifier</ccts:DictionaryEntryName>
	 *                 <ccts:Version/>
	 *                 <ccts:Definition/>
	 *                 <ccts:PrimitiveType>String</ccts:PrimitiveType>
	 *               </ccts:Component>
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>List ID</em>' attribute.
	 * @see #setListID(String)
	 * @generated
	 */
	public String getListID() {
		return (listID == null) ? new String() : listID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.sdt.LineStatusCodeType#getListID <em>List ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List ID</em>' attribute.
	 * @see #getListID()
	 * @generated
	 */
	public void setListID(String newListID) {
		listID = newListID;
	}

	/**
	 * Returns the value of the '<em><b>List Name</b></em>' attribute.
	 * The default value is <code>"Line Status"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *                 <ccts:ComponentType>SC</ccts:ComponentType>
	 *                 <ccts:DictionaryEntryName>Line Status_ Code List. Name. Text</ccts:DictionaryEntryName>
	 *                 <ccts:Version/>
	 *                 <ccts:Definition/>
	 *                 <ccts:PrimitiveType>String</ccts:PrimitiveType>
	 *               </ccts:Component>
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>List Name</em>' attribute.
	 * @see #setListName(String)
	 * @generated
	 */
	public String getListName() {
		return (listName == null) ? new String() : listName;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.sdt.LineStatusCodeType#getListName <em>List Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Name</em>' attribute.
	 * @see #getListName()
	 * @generated
	 */
	public void setListName(String newListName) {
		listName = newListName;
	}

	/**
	 * Returns the value of the '<em><b>List Scheme URI</b></em>' attribute.
	 * The default value is <code>"urn:oasis:names:specification:ubl:schema:xsd:LineStatusCode-1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *                 <ccts:ComponentType>SC</ccts:ComponentType>
	 *                 <ccts:DictionaryEntryName>Line Status_ Code List Scheme. Uniform Resource. Identifier</ccts:DictionaryEntryName>
	 *                 <ccts:Version/>
	 *                 <ccts:Definition/>
	 *                 <ccts:PrimitiveType>String</ccts:PrimitiveType>
	 *               </ccts:Component>
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>List Scheme URI</em>' attribute.
	 * @see #setListSchemeURI(String)
	 * @generated
	 */
	public String getListSchemeURI() {
		return (listSchemeURI == null) ? new String() : listSchemeURI;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.sdt.LineStatusCodeType#getListSchemeURI <em>List Scheme URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Scheme URI</em>' attribute.
	 * @see #getListSchemeURI()
	 * @generated
	 */
	public void setListSchemeURI(String newListSchemeURI) {
		listSchemeURI = newListSchemeURI;
	}

	/**
	 * Returns the value of the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *                 <ccts:ComponentType>SC</ccts:ComponentType>
	 *                 <ccts:DictionaryEntryName>Line Status_ Code List. Uniform Resource. Identifier</ccts:DictionaryEntryName>
	 *                 <ccts:Version/>
	 *                 <ccts:Definition/>
	 *                 <ccts:PrimitiveType>String</ccts:PrimitiveType>
	 *               </ccts:Component>
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>List URI</em>' attribute.
	 * @see #setListURI(String)
	 * @generated
	 */
	public String getListURI() {
		return (listURI == null) ? new String() : listURI;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.sdt.LineStatusCodeType#getListURI <em>List URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List URI</em>' attribute.
	 * @see #getListURI()
	 * @generated
	 */
	public void setListURI(String newListURI) {
		listURI = newListURI;
	}

	/**
	 * Returns the value of the '<em><b>List Version ID</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *                 <ccts:ComponentType>SC</ccts:ComponentType>
	 *                 <ccts:DictionaryEntryName>Line Status_ Code List. Version. Identifier</ccts:DictionaryEntryName>
	 *                 <ccts:Version/>
	 *                 <ccts:Definition/>
	 *                 <ccts:PrimitiveType>String</ccts:PrimitiveType>
	 *               </ccts:Component>
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>List Version ID</em>' attribute.
	 * @see #setListVersionID(String)
	 * @generated
	 */
	public String getListVersionID() {
		return (listVersionID == null) ? new String() : listVersionID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.sdt.LineStatusCodeType#getListVersionID <em>List Version ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Version ID</em>' attribute.
	 * @see #getListVersionID()
	 * @generated
	 */
	public void setListVersionID(String newListVersionID) {
		listVersionID = newListVersionID;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *                 <ccts:ComponentType>SC</ccts:ComponentType>
	 *                 <ccts:DictionaryEntryName>Line Status_ Code. Name. Text</ccts:DictionaryEntryName>
	 *                 <ccts:Version/>
	 *                 <ccts:Definition/>
	 *                 <ccts:PrimitiveType>String</ccts:PrimitiveType>
	 *               </ccts:Component>
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	public String getName() {
		return (name == null) ? new String() : name;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.sdt.LineStatusCodeType#getName <em>Name</em>}' attribute.
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (value: "); //$NON-NLS-1$
		result.append(value);
		result.append(", languageID: "); //$NON-NLS-1$
		result.append(languageID);
		result.append(", listAgencyID: "); //$NON-NLS-1$
		result.append(listAgencyID);
		result.append(", listAgencyName: "); //$NON-NLS-1$
		result.append(listAgencyName);
		result.append(", listID: "); //$NON-NLS-1$
		result.append(listID);
		result.append(", listName: "); //$NON-NLS-1$
		result.append(listName);
		result.append(", listSchemeURI: "); //$NON-NLS-1$
		result.append(listSchemeURI);
		result.append(", listURI: "); //$NON-NLS-1$
		result.append(listURI);
		result.append(", listVersionID: "); //$NON-NLS-1$
		result.append(listVersionID);
		result.append(", name: "); //$NON-NLS-1$
		result.append(name);
		result.append(')');
		return result.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.languageID == null) ? 0 : this.languageID.hashCode());
		result = PRIME * result + ((this.listAgencyID == null) ? 0 : this.listAgencyID.hashCode());
		result = PRIME * result + ((this.listAgencyName == null) ? 0 : this.listAgencyName.hashCode());
		result = PRIME * result + ((this.listID == null) ? 0 : this.listID.hashCode());
		result = PRIME * result + ((this.listName == null) ? 0 : this.listName.hashCode());
		result = PRIME * result + ((this.listSchemeURI == null) ? 0 : this.listSchemeURI.hashCode());
		result = PRIME * result + ((this.listURI == null) ? 0 : this.listURI.hashCode());
		result = PRIME * result + ((this.listVersionID == null) ? 0 : this.listVersionID.hashCode());
		result = PRIME * result + ((this.name == null) ? 0 : this.name.hashCode());
		result = PRIME * result + ((this.value == null) ? 0 : this.value.hashCode());
		result = PRIME * result + ((this.version == null) ? 0 : this.version.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final LineStatusCodeType other = (LineStatusCodeType) obj;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.languageID == null) {
			if (other.languageID != null)
				return false;
		} else if (!this.languageID.equals(other.languageID))
			return false;
		if (this.listAgencyID == null) {
			if (other.listAgencyID != null)
				return false;
		} else if (!this.listAgencyID.equals(other.listAgencyID))
			return false;
		if (this.listAgencyName == null) {
			if (other.listAgencyName != null)
				return false;
		} else if (!this.listAgencyName.equals(other.listAgencyName))
			return false;
		if (this.listID == null) {
			if (other.listID != null)
				return false;
		} else if (!this.listID.equals(other.listID))
			return false;
		if (this.listName == null) {
			if (other.listName != null)
				return false;
		} else if (!this.listName.equals(other.listName))
			return false;
		if (this.listSchemeURI == null) {
			if (other.listSchemeURI != null)
				return false;
		} else if (!this.listSchemeURI.equals(other.listSchemeURI))
			return false;
		if (this.listURI == null) {
			if (other.listURI != null)
				return false;
		} else if (!this.listURI.equals(other.listURI))
			return false;
		if (this.listVersionID == null) {
			if (other.listVersionID != null)
				return false;
		} else if (!this.listVersionID.equals(other.listVersionID))
			return false;
		if (this.name == null) {
			if (other.name != null)
				return false;
		} else if (!this.name.equals(other.name))
			return false;
		if (this.value == null) {
			if (other.value != null)
				return false;
		} else if (!this.value.equals(other.value))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // LineStatusCodeType