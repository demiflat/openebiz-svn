/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.CompanyIDType;
import org.openebiz.core.common.cbc.RegistrationNameType;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party Legal Entity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Party Legal Entity. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>information directly relating to the legal registration that is applicable to a party.</ccts:Definition>
 *           <ccts:ObjectClass>Party Legal Entity</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.PartyLegalEntityType#getRegistrationName <em>Registration Name</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PartyLegalEntityType#getCompanyID <em>Company ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PartyLegalEntityType#getRegistrationAddress <em>Registration Address</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PartyLegalEntityType#getCorporateRegistrationScheme <em>Corporate Registration Scheme</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartyLegalEntityType implements Serializable {
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
	 * The cached value of the '{@link #getRegistrationName() <em>Registration Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrationName()
	 * @generated
	 * @ordered
	 */
	protected RegistrationNameType registrationName = null;

	/**
	 * The cached value of the '{@link #getCompanyID() <em>Company ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanyID()
	 * @generated
	 * @ordered
	 */
	protected CompanyIDType companyID = null;

	/**
	 * The cached value of the '{@link #getRegistrationAddress() <em>Registration Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrationAddress()
	 * @generated
	 * @ordered
	 */
	protected AddressType registrationAddress = null;

	/**
	 * The cached value of the '{@link #getCorporateRegistrationScheme() <em>Corporate Registration Scheme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorporateRegistrationScheme()
	 * @generated
	 * @ordered
	 */
	protected CorporateRegistrationSchemeType corporateRegistrationScheme = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public PartyLegalEntityType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.registrationName = this.getRegistrationName();
		this.companyID = this.getCompanyID();
		this.registrationAddress = this.getRegistrationAddress();
		this.corporateRegistrationScheme = this.getCorporateRegistrationScheme();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getCompanyID().getValue());
		return sdisplay.toString();
	}
	
	/**
	 * Returns the value of the '<em><b>Registration Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Party Legal Entity. Registration Name. Name</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the name of a party as registered with the legal authority.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party Legal Entity</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Registration Name</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Name</ccts:RepresentationTerm>
	 *               <ccts:DataType>Name. Type</ccts:DataType>
	 *               <ccts:Examples>"Microsoft Corporation"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Registration Name</em>' containment reference.
	 * @see #setRegistrationName(RegistrationNameType)
	 * @generated
	 */
	public RegistrationNameType getRegistrationName() {
		return (registrationName == null) ? new RegistrationNameType()
				: registrationName;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PartyLegalEntityType#getRegistrationName <em>Registration Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registration Name</em>' containment reference.
	 * @see #getRegistrationName()
	 * @generated
	 */
	public void setRegistrationName(RegistrationNameType newRegistrationName) {
		registrationName = newRegistrationName;
	}

	/**
	 * Returns the value of the '<em><b>Company ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Party Legal Entity. Company Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>identifies a company as registered with the company registration scheme</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party Legal Entity</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Company Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Business Registration Number, Company Number</ccts:AlternativeBusinessTerms>
	 *               <ccts:Examples>"3556625"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Company ID</em>' containment reference.
	 * @see #setCompanyID(CompanyIDType)
	 * @generated
	 */
	public CompanyIDType getCompanyID() {
		return (companyID == null) ? new CompanyIDType() : companyID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PartyLegalEntityType#getCompanyID <em>Company ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Company ID</em>' containment reference.
	 * @see #getCompanyID()
	 * @generated
	 */
	public void setCompanyID(CompanyIDType newCompanyID) {
		companyID = newCompanyID;
	}

	/**
	 * Returns the value of the '<em><b>Registration Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Party Legal Entity. Registration_ Address. Address</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>associates with the registered address of the party within a Corporate Registration Scheme.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party Legal Entity</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Registration</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Address</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Address</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Registration Address</em>' containment reference.
	 * @see #setRegistrationAddress(AddressType)
	 * @generated
	 */
	public AddressType getRegistrationAddress() {
		return (registrationAddress == null) ? new AddressType()
				: registrationAddress;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PartyLegalEntityType#getRegistrationAddress <em>Registration Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registration Address</em>' containment reference.
	 * @see #getRegistrationAddress()
	 * @generated
	 */
	public void setRegistrationAddress(AddressType newRegistrationAddress) {
		registrationAddress = newRegistrationAddress;
	}

	/**
	 * Returns the value of the '<em><b>Corporate Registration Scheme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Party Legal Entity. Corporate Registration Scheme</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>associates with the party with a Corporate Registration Scheme.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party Legal Entity</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Corporate Registration Scheme</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Corporate Registration Scheme</ccts:AssociatedObjectClass>
	 * 
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Corporate Registration Scheme</em>' containment reference.
	 * @see #setCorporateRegistrationScheme(CorporateRegistrationSchemeType)
	 * @generated
	 */
	public CorporateRegistrationSchemeType getCorporateRegistrationScheme() {
		return (corporateRegistrationScheme == null) ? new CorporateRegistrationSchemeType()
				: corporateRegistrationScheme;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PartyLegalEntityType#getCorporateRegistrationScheme <em>Corporate Registration Scheme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corporate Registration Scheme</em>' containment reference.
	 * @see #getCorporateRegistrationScheme()
	 * @generated
	 */
	public void setCorporateRegistrationScheme(
			CorporateRegistrationSchemeType newCorporateRegistrationScheme) {
		corporateRegistrationScheme = newCorporateRegistrationScheme;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.companyID == null) ? 0 : this.companyID.hashCode());
		result = PRIME * result + ((this.corporateRegistrationScheme == null) ? 0 : this.corporateRegistrationScheme.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.registrationAddress == null) ? 0 : this.registrationAddress.hashCode());
		result = PRIME * result + ((this.registrationName == null) ? 0 : this.registrationName.hashCode());
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
		final PartyLegalEntityType other = (PartyLegalEntityType) obj;
		if (this.companyID == null) {
			if (other.companyID != null)
				return false;
		} else if (!this.companyID.equals(other.companyID))
			return false;
		if (this.corporateRegistrationScheme == null) {
			if (other.corporateRegistrationScheme != null)
				return false;
		} else if (!this.corporateRegistrationScheme.equals(other.corporateRegistrationScheme))
			return false;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.registrationAddress == null) {
			if (other.registrationAddress != null)
				return false;
		} else if (!this.registrationAddress.equals(other.registrationAddress))
			return false;
		if (this.registrationName == null) {
			if (other.registrationName != null)
				return false;
		} else if (!this.registrationName.equals(other.registrationName))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // PartyLegalEntityType