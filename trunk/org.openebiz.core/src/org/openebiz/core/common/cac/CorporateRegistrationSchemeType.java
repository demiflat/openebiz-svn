/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.CorporateRegistrationTypeCodeType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.NameType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Corporate Registration Scheme Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Corporate Registration Scheme. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>information directly relating a scheme for corporate registration of businesses.</ccts:Definition>
 *           <ccts:ObjectClass>Corporate Registration Scheme</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.CorporateRegistrationSchemeType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CorporateRegistrationSchemeType#getName <em>Name</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CorporateRegistrationSchemeType#getCorporateRegistrationTypeCode <em>Corporate Registration Type Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CorporateRegistrationSchemeType#getJurisdictionRegionAddress <em>Jurisdiction Region Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CorporateRegistrationSchemeType implements Serializable {
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
	 * The cached value of the '{@link #getID() <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected IDType iD = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected NameType name = null;

	/**
	 * The cached value of the '{@link #getCorporateRegistrationTypeCode() <em>Corporate Registration Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorporateRegistrationTypeCode()
	 * @generated
	 * @ordered
	 */
	protected CorporateRegistrationTypeCodeType corporateRegistrationTypeCode = null;

	/**
	 * The cached value of the '{@link #getJurisdictionRegionAddress() <em>Jurisdiction Region Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJurisdictionRegionAddress()
	 * @generated
	 * @ordered
	 */
	protected List jurisdictionRegionAddress = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public CorporateRegistrationSchemeType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.iD = this.getID();
		this.name = this.getName();
		this.corporateRegistrationTypeCode = this.getCorporateRegistrationTypeCode();
		this.jurisdictionRegionAddress = this.getJurisdictionRegionAddress();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getID().getValue());
		return sdisplay.toString();
	}
		
	/**
	 * Returns the value of the '<em><b>ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Corporate Registration Scheme. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>identifies the scheme</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Corporate Registration Scheme</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:Examples>"ASIC" in Australia</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID</em>' containment reference.
	 * @see #setID(IDType)
	 * @generated
	 */
	public IDType getID() {
		return (iD == null) ? new IDType() : iD;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CorporateRegistrationSchemeType#getID <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' containment reference.
	 * @see #getID()
	 * @generated
	 */
	public void setID(IDType newID) {
		iD = newID;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Corporate Registration Scheme. Name</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>identifies the scheme by name</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Corporate Registration Scheme</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Name</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Name</ccts:RepresentationTerm>
	 *               <ccts:DataType>Name. Type</ccts:DataType>
	 *               <ccts:Examples>"Australian Securities and Investment Commission" in Australia</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(NameType)
	 * @generated
	 */
	public NameType getName() {
		return (name == null) ? new NameType() : name;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CorporateRegistrationSchemeType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	public void setName(NameType newName) {
		name = newName;
	}

	/**
	 * Returns the value of the '<em><b>Corporate Registration Type Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Corporate Registration Scheme. Corporate Registration Type. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>identifies the type of scheme</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Corporate Registration Scheme</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Corporate Registration Type</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:Examples>"ACN"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Corporate Registration Type Code</em>' containment reference.
	 * @see #setCorporateRegistrationTypeCode(CorporateRegistrationTypeCodeType)
	 * @generated
	 */
	public CorporateRegistrationTypeCodeType getCorporateRegistrationTypeCode() {
		return (corporateRegistrationTypeCode == null) ? new CorporateRegistrationTypeCodeType()
				: corporateRegistrationTypeCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CorporateRegistrationSchemeType#getCorporateRegistrationTypeCode <em>Corporate Registration Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corporate Registration Type Code</em>' containment reference.
	 * @see #getCorporateRegistrationTypeCode()
	 * @generated
	 */
	public void setCorporateRegistrationTypeCode(
			CorporateRegistrationTypeCodeType newCorporateRegistrationTypeCode) {
		corporateRegistrationTypeCode = newCorporateRegistrationTypeCode;
	}

	/**
	 * Returns the value of the '<em><b>Jurisdiction Region Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.AddressType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Corporate Registration Scheme. Jurisdiction Region_ Address. Address</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>associates the registration scheme with particulars that identify and locate the geographic area to which the scheme applies.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Corporate Registration Scheme</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Jurisdiction Region</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Address</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Address</ccts:AssociatedObjectClass>
	 *               <ccts:Examples>"England", "Wales"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jurisdiction Region Address</em>' containment reference list.
	 * @generated
	 */
	public List getJurisdictionRegionAddress() {
		if (jurisdictionRegionAddress == null) {
			jurisdictionRegionAddress = new ArrayList<
					AddressType>();
		}
		return jurisdictionRegionAddress;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.corporateRegistrationTypeCode == null) ? 0 : this.corporateRegistrationTypeCode.hashCode());
		result = PRIME * result + ((this.iD == null) ? 0 : this.iD.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.jurisdictionRegionAddress == null) ? 0 : this.jurisdictionRegionAddress.hashCode());
		result = PRIME * result + ((this.name == null) ? 0 : this.name.hashCode());
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
		final CorporateRegistrationSchemeType other = (CorporateRegistrationSchemeType) obj;
		if (this.corporateRegistrationTypeCode == null) {
			if (other.corporateRegistrationTypeCode != null)
				return false;
		} else if (!this.corporateRegistrationTypeCode.equals(other.corporateRegistrationTypeCode))
			return false;
		if (this.iD == null) {
			if (other.iD != null)
				return false;
		} else if (!this.iD.equals(other.iD))
			return false;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.jurisdictionRegionAddress == null) {
			if (other.jurisdictionRegionAddress != null)
				return false;
		} else if (!this.jurisdictionRegionAddress.equals(other.jurisdictionRegionAddress))
			return false;
		if (this.name == null) {
			if (other.name != null)
				return false;
		} else if (!this.name.equals(other.name))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // CorporateRegistrationSchemeType