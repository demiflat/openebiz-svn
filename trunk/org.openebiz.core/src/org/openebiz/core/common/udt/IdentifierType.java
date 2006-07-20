/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.udt;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang.time.FastDateFormat;

import org.springframework.webflow.util.RandomGuid;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Identifier Type</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * 
 * <ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2">UDT0000011</ccts:UniqueID>
 * <ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2">UDT</ccts:CategoryCode>
 * <ccts:DictionaryEntryName
 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identifier. Type</ccts:DictionaryEntryName>
 * <ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2">1.0</ccts:VersionID>
 * <ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2">A
 * character string to identify and distinguish uniquely, one instance of an
 * object in an identification scheme from all other objects in the same scheme
 * together with relevant supplementary information.</ccts:Definition>
 * <ccts:RepresentationTermName
 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identifier</ccts:RepresentationTermName>
 * <ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2">string</ccts:PrimitiveType>
 * <xsd:BuiltinType>normalizedString</xsd:BuiltinType> <ccts:UsageRule
 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">Other supplementary
 * components in the CCT are captured as part of the token and name for the
 * schema module containing the identifer list and thus, are not declared as
 * attributes. </ccts:UsageRule>
 * 
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openebiz.core.common.udt.IdentifierType#getValue <em>Value</em>}</li>
 * <li>{@link org.openebiz.core.common.udt.IdentifierType#getSchemeAgencyID <em>Scheme Agency ID</em>}</li>
 * <li>{@link org.openebiz.core.common.udt.IdentifierType#getSchemeAgencyName <em>Scheme Agency Name</em>}</li>
 * <li>{@link org.openebiz.core.common.udt.IdentifierType#getSchemeDataURI <em>Scheme Data URI</em>}</li>
 * <li>{@link org.openebiz.core.common.udt.IdentifierType#getSchemeID <em>Scheme ID</em>}</li>
 * <li>{@link org.openebiz.core.common.udt.IdentifierType#getSchemeName <em>Scheme Name</em>}</li>
 * <li>{@link org.openebiz.core.common.udt.IdentifierType#getSchemeURI <em>Scheme URI</em>}</li>
 * <li>{@link org.openebiz.core.common.udt.IdentifierType#getSchemeVersionID <em>Scheme Version ID</em>}</li>
 * </ul>
 * </p>
 * 
 */
public class IdentifierType implements Serializable {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = "Open E-Biz - Darrell Kundel"; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
	 * @param internalId
	 *            The internalId to set.
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
	 * @param version
	 *            The version to set.
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchemeAgencyID() <em>Scheme Agency ID</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSchemeAgencyID()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEME_AGENCY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchemeAgencyID() <em>Scheme Agency ID</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSchemeAgencyID()
	 * @generated
	 * @ordered
	 */
	protected String schemeAgencyID = SCHEME_AGENCY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchemeAgencyName() <em>Scheme Agency Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSchemeAgencyName()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEME_AGENCY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchemeAgencyName() <em>Scheme Agency Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSchemeAgencyName()
	 * @generated
	 * @ordered
	 */
	protected String schemeAgencyName = SCHEME_AGENCY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchemeDataURI() <em>Scheme Data URI</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSchemeDataURI()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEME_DATA_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchemeDataURI() <em>Scheme Data URI</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSchemeDataURI()
	 * @generated
	 * @ordered
	 */
	protected String schemeDataURI = SCHEME_DATA_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchemeID() <em>Scheme ID</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSchemeID()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEME_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchemeID() <em>Scheme ID</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSchemeID()
	 * @generated
	 * @ordered
	 */
	protected String schemeID = SCHEME_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchemeName() <em>Scheme Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSchemeName()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEME_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchemeName() <em>Scheme Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSchemeName()
	 * @generated
	 * @ordered
	 */
	protected String schemeName = SCHEME_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchemeURI() <em>Scheme URI</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSchemeURI()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEME_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchemeURI() <em>Scheme URI</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSchemeURI()
	 * @generated
	 * @ordered
	 */
	protected String schemeURI = SCHEME_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchemeVersionID() <em>Scheme Version ID</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSchemeVersionID()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEME_VERSION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchemeVersionID() <em>Scheme Version ID</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSchemeVersionID()
	 * @generated
	 * @ordered
	 */
	protected String schemeVersionID = SCHEME_VERSION_ID_EDEFAULT;

	/**
	 * Can this ID be edited? default true
	 */
	protected boolean editable = true;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IdentifierType() {
		super();
		this.init();
	}

	protected final static String dateFormat = new String("yyMMddSSS");

	/**
	 * Initializes the ID value field to a unique context sensitive value
	 */
	public void init() {
		String name = this.getClass().getSimpleName();
		if ((this.value == null && name.startsWith("GUID"))
				|| (this.value == null && name
						.startsWith("GloballyUniqueGUIDType"))) {
			this.value = new RandomGuid().toString();
		}
		// these are _excluded_ from generation
		else if (name.startsWith("CustomerAssignedAccountIDType")
				|| name.startsWith("SupplierAssignedAccountIDType")
				|| name.startsWith("ReferenceIDType")
				|| name.startsWith("PreviousVersionIDType")
				|| name.startsWith("CarrierAssignedID")
				|| name.startsWith("URI")) {
			// noop
		} else {
			this.value = name.substring(0, name.length() - 4) + ":"
					+ FastDateFormat.getInstance(dateFormat).format(new Date());
		}
		processEditable(name);
	}

	/**
	 * process the field name to set whether this ID is editable
	 */
	protected void processEditable(String name) {
		if (name.startsWith("GUID")) {
			this.editable = false;
		}
		if (name.startsWith("GloballyUniqueGUID")) {
			this.editable = false;
		}
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getValue());
		return sdisplay.toString();
	}
	
	/**
	 * @return the editable
	 */
	public boolean isEditable() {
		return this.editable;
	}

	/**
	 * @param editable
	 *            the editable to set
	 */
	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * Returning the '<em>Value</em>' attribute
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.udt.IdentifierType#getValue <em>Value</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	public void setValue(String newValue) {
		value = newValue;
	}

	/**
	 * Returns the value of the '<em><b>Scheme Agency ID</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc -->
	 * 
	 * <ccts:UniqueID
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">UDT000011-SC4</ccts:UniqueID>
	 * <ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2">SC</ccts:CategoryCode>
	 * <ccts:DictionaryEntryName
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identification Scheme
	 * Agency. Identifier</ccts:DictionaryEntryName> <ccts:Definition
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">The identification of
	 * the agency that maintains the identification scheme.</ccts:Definition>
	 * <ccts:ObjectClass
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identification Scheme
	 * Agency</ccts:ObjectClass> <ccts:PropertyTermName
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identification</ccts:PropertyTermName>
	 * <ccts:RepresentationTermName
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identifier</ccts:RepresentationTermName>
	 * <ccts:PrimitiveType
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">string</ccts:PrimitiveType>
	 * <ccts:UsageRule
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">Defaults to the
	 * UN/EDIFACT data element 3055 code list.</ccts:UsageRule>
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Scheme Agency ID</em>' attribute.
	 * @see #setSchemeAgencyID(String)
	 * @generated
	 */
	public String getSchemeAgencyID() {
		return (schemeAgencyID == null) ? new String() : schemeAgencyID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.udt.IdentifierType#getSchemeAgencyID <em>Scheme Agency ID</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Scheme Agency ID</em>'
	 *            attribute.
	 * @see #getSchemeAgencyID()
	 * @generated
	 */
	public void setSchemeAgencyID(String newSchemeAgencyID) {
		schemeAgencyID = newSchemeAgencyID;
	}

	/**
	 * Returns the value of the '<em><b>Scheme Agency Name</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc -->
	 * 
	 * <ccts:UniqueID
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">UDT000011-SC5</ccts:UniqueID>
	 * <ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2">SC</ccts:CategoryCode>
	 * <ccts:DictionaryEntryName
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identification Scheme
	 * Agency. Name. Text</ccts:DictionaryEntryName> <ccts:Definition
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">The name of the agency
	 * that maintains the identification scheme.</ccts:Definition>
	 * <ccts:ObjectClass
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identification Scheme
	 * Agency</ccts:ObjectClass> <ccts:PropertyTermName
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">Agency Name</ccts:PropertyTermName>
	 * <ccts:RepresentationTermName
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">Text</ccts:RepresentationTermName>
	 * <ccts:PrimitiveType
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">string</ccts:PrimitiveType>
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Scheme Agency Name</em>' attribute.
	 * @see #setSchemeAgencyName(String)
	 * @generated
	 */
	public String getSchemeAgencyName() {
		return (schemeAgencyName == null) ? new String() : schemeAgencyName;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.udt.IdentifierType#getSchemeAgencyName <em>Scheme Agency Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Scheme Agency Name</em>'
	 *            attribute.
	 * @see #getSchemeAgencyName()
	 * @generated
	 */
	public void setSchemeAgencyName(String newSchemeAgencyName) {
		schemeAgencyName = newSchemeAgencyName;
	}

	/**
	 * Returns the value of the '<em><b>Scheme Data URI</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc -->
	 * 
	 * <ccts:UniqueID
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">UDT0000011-SC7</ccts:UniqueID>
	 * <ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2">SC</ccts:CategoryCode>
	 * <ccts:DictionaryEntryName
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identification Scheme
	 * Data. Uniform Resource. Identifier</ccts:DictionaryEntryName>
	 * <ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2">The
	 * Uniform Resource Identifier that identifies where the identification
	 * scheme data is located.</ccts:Definition> <ccts:ObjectClass
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identification Scheme
	 * Data</ccts:ObjectClass> <ccts:PropertyTermName
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">Uniform Resource
	 * Identifier</ccts:PropertyTermName> <ccts:RepresentationTermName
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identifier</ccts:RepresentationTermName>
	 * <ccts:PrimitiveType
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">string</ccts:PrimitiveType>
	 * <xsd:BuiltinType>anyURI</xsd:BuiltinType>
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Scheme Data URI</em>' attribute.
	 * @see #setSchemeDataURI(String)
	 * @generated
	 */
	public String getSchemeDataURI() {
		return (schemeDataURI == null) ? new String() : schemeDataURI;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.udt.IdentifierType#getSchemeDataURI <em>Scheme Data URI</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Scheme Data URI</em>' attribute.
	 * @see #getSchemeDataURI()
	 * @generated
	 */
	public void setSchemeDataURI(String newSchemeDataURI) {
		schemeDataURI = newSchemeDataURI;
	}

	/**
	 * Returns the value of the '<em><b>Scheme ID</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * <ccts:UniqueID
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">UDT000011-SC2</ccts:UniqueID>
	 * <ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2">SC</ccts:CategoryCode>
	 * <ccts:DictionaryEntryName
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identification Scheme.
	 * Identifier</ccts:DictionaryEntryName> <ccts:Definition
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">The identification of
	 * the identification scheme.</ccts:Definition> <ccts:ObjectClass
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identification Scheme</ccts:ObjectClass>
	 * <ccts:PropertyTermName
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identification</ccts:PropertyTermName>
	 * <ccts:RepresentationTermName
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identifier</ccts:RepresentationTermName>
	 * <ccts:PrimitiveType
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">string</ccts:PrimitiveType>
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Scheme ID</em>' attribute.
	 * @see #setSchemeID(String)
	 * @generated
	 */
	public String getSchemeID() {
		return (schemeID == null) ? new String() : schemeID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.udt.IdentifierType#getSchemeID <em>Scheme ID</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Scheme ID</em>' attribute.
	 * @see #getSchemeID()
	 * @generated
	 */
	public void setSchemeID(String newSchemeID) {
		schemeID = newSchemeID;
	}

	/**
	 * Returns the value of the '<em><b>Scheme Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * <ccts:UniqueID
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">UDT000011-SC3</ccts:UniqueID>
	 * <ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2">SC</ccts:CategoryCode>
	 * <ccts:DictionaryEntryName
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identification Scheme.
	 * Name. Text</ccts:DictionaryEntryName> <ccts:Definition
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">The name of the
	 * identification scheme.</ccts:Definition> <ccts:ObjectClass
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identification Scheme</ccts:ObjectClass>
	 * <ccts:PropertyTermName
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">Name</ccts:PropertyTermName>
	 * <ccts:RepresentationTermName
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">Text</ccts:RepresentationTermName>
	 * <ccts:PrimitiveType
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">string</ccts:PrimitiveType>
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Scheme Name</em>' attribute.
	 * @see #setSchemeName(String)
	 * @generated
	 */
	public String getSchemeName() {
		return (schemeName == null) ? new String() : schemeName;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.udt.IdentifierType#getSchemeName <em>Scheme Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Scheme Name</em>' attribute.
	 * @see #getSchemeName()
	 * @generated
	 */
	public void setSchemeName(String newSchemeName) {
		schemeName = newSchemeName;
	}

	/**
	 * Returns the value of the '<em><b>Scheme URI</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * <ccts:UniqueID
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">UDT0000011-SC8</ccts:UniqueID>
	 * <ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2">SC</ccts:CategoryCode>
	 * <ccts:DictionaryEntryName
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identification Scheme.
	 * Uniform Resource. Identifier</ccts:DictionaryEntryName> <ccts:Definition
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">The Uniform Resource
	 * Identifier that identifies where the identification scheme is located.</ccts:Definition>
	 * <ccts:ObjectClass
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identification Scheme</ccts:ObjectClass>
	 * <ccts:PropertyTermName
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">Uniform Resource
	 * Identifier</ccts:PropertyTermName> <ccts:RepresentationTermName
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identifier</ccts:RepresentationTermName>
	 * <ccts:PrimitiveType
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">string</ccts:PrimitiveType>
	 * <xsd:BuiltinType>anyURI</xsd:BuiltinType>
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Scheme URI</em>' attribute.
	 * @see #setSchemeURI(String)
	 * @generated
	 */
	public String getSchemeURI() {
		return (schemeURI == null) ? new String() : schemeURI;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.udt.IdentifierType#getSchemeURI <em>Scheme URI</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Scheme URI</em>' attribute.
	 * @see #getSchemeURI()
	 * @generated
	 */
	public void setSchemeURI(String newSchemeURI) {
		schemeURI = newSchemeURI;
	}

	/**
	 * Returns the value of the '<em><b>Scheme Version ID</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc -->
	 * 
	 * <ccts:UniqueID
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">UDT000011-SC6</ccts:UniqueID>
	 * <ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2">SC</ccts:CategoryCode>
	 * <ccts:DictionaryEntryName
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identification Scheme.
	 * Version. Identifier</ccts:DictionaryEntryName> <ccts:Definition
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">The version of the
	 * identification scheme.</ccts:Definition> <ccts:ObjectClass
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identification Scheme</ccts:ObjectClass>
	 * <ccts:PropertyTermName
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">Version</ccts:PropertyTermName>
	 * <ccts:RepresentationTermName
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identifier</ccts:RepresentationTermName>
	 * <ccts:PrimitiveType
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">string</ccts:PrimitiveType>
	 * <xsd:BuiltinType>normalizedString</xsd:BuiltinType>
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Scheme Version ID</em>' attribute.
	 * @see #setSchemeVersionID(String)
	 * @generated
	 */
	public String getSchemeVersionID() {
		return (schemeVersionID == null) ? new String() : schemeVersionID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.udt.IdentifierType#getSchemeVersionID <em>Scheme Version ID</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Scheme Version ID</em>'
	 *            attribute.
	 * @see #getSchemeVersionID()
	 * @generated
	 */
	public void setSchemeVersionID(String newSchemeVersionID) {
		schemeVersionID = newSchemeVersionID;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (value: "); //$NON-NLS-1$
		result.append(value);
		result.append(", schemeAgencyID: "); //$NON-NLS-1$
		result.append(schemeAgencyID);
		result.append(", schemeAgencyName: "); //$NON-NLS-1$
		result.append(schemeAgencyName);
		result.append(", schemeDataURI: "); //$NON-NLS-1$
		result.append(schemeDataURI);
		result.append(", schemeID: "); //$NON-NLS-1$
		result.append(schemeID);
		result.append(", schemeName: "); //$NON-NLS-1$
		result.append(schemeName);
		result.append(", schemeURI: "); //$NON-NLS-1$
		result.append(schemeURI);
		result.append(", schemeVersionID: "); //$NON-NLS-1$
		result.append(schemeVersionID);
		result.append(')');
		return result.toString();
	}

} // IdentifierType
