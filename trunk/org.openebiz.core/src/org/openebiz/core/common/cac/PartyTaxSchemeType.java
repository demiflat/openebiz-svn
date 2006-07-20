/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.CompanyIDType;
import org.openebiz.core.common.cbc.ExemptionReasonType;
import org.openebiz.core.common.cbc.RegistrationNameType;
import org.openebiz.core.common.cbc.TaxLevelCodeType;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party Tax Scheme Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Party Tax Scheme. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about a Party's Tax Scheme</ccts:Definition>
 *           <ccts:ObjectClass>Party Tax Scheme</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.PartyTaxSchemeType#getRegistrationName <em>Registration Name</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PartyTaxSchemeType#getCompanyID <em>Company ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PartyTaxSchemeType#getTaxLevelCode <em>Tax Level Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PartyTaxSchemeType#getExemptionReason <em>Exemption Reason</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PartyTaxSchemeType#getRegistrationAddress <em>Registration Address</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PartyTaxSchemeType#getTaxScheme <em>Tax Scheme</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartyTaxSchemeType implements Serializable {
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
	 * The cached value of the '{@link #getTaxLevelCode() <em>Tax Level Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxLevelCode()
	 * @generated
	 * @ordered
	 */
	protected TaxLevelCodeType taxLevelCode = null;

	/**
	 * The cached value of the '{@link #getExemptionReason() <em>Exemption Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExemptionReason()
	 * @generated
	 * @ordered
	 */
	protected ExemptionReasonType exemptionReason = null;

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
	 * The cached value of the '{@link #getTaxScheme() <em>Tax Scheme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxScheme()
	 * @generated
	 * @ordered
	 */
	protected TaxSchemeType taxScheme = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public PartyTaxSchemeType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.registrationName = this.getRegistrationName();
		this.companyID = this.getCompanyID();
		this.taxLevelCode = this.getTaxLevelCode();
		this.exemptionReason = this.getExemptionReason();
		this.registrationAddress = this.getRegistrationAddress();
		this.taxScheme = this.getTaxScheme();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getTaxScheme().getTaxTypeCode().getValue());
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
	 *               <ccts:DictionaryEntryName>Party Tax Scheme. Registration Name. Name</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The official name of the Party as registered with the relevant fiscal authority</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party Tax Scheme</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PartyTaxSchemeType#getRegistrationName <em>Registration Name</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Party Tax Scheme. Company Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier assigned for tax purposes to a Party by the taxation authority</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party Tax Scheme</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Company Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>VAT Number</ccts:AlternativeBusinessTerms>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PartyTaxSchemeType#getCompanyID <em>Company ID</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Tax Level Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Party Tax Scheme. Tax Level. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The section or role within the tax scheme that applies to The Party</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party Tax Scheme</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Tax Level</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tax Level Code</em>' containment reference.
	 * @see #setTaxLevelCode(TaxLevelCodeType)
	 * @generated
	 */
	public TaxLevelCodeType getTaxLevelCode() {
		return (taxLevelCode == null) ? new TaxLevelCodeType() : taxLevelCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PartyTaxSchemeType#getTaxLevelCode <em>Tax Level Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Level Code</em>' containment reference.
	 * @see #getTaxLevelCode()
	 * @generated
	 */
	public void setTaxLevelCode(TaxLevelCodeType newTaxLevelCode) {
		taxLevelCode = newTaxLevelCode;
	}

	/**
	 * Returns the value of the '<em><b>Exemption Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Party Tax Scheme. Exemption Reason. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A reason for a Party's exemption from tax</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party Tax Scheme</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Exemption Reason</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exemption Reason</em>' containment reference.
	 * @see #setExemptionReason(ExemptionReasonType)
	 * @generated
	 */
	public ExemptionReasonType getExemptionReason() {
		return (exemptionReason == null) ? new ExemptionReasonType()
				: exemptionReason;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PartyTaxSchemeType#getExemptionReason <em>Exemption Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exemption Reason</em>' containment reference.
	 * @see #getExemptionReason()
	 * @generated
	 */
	public void setExemptionReason(ExemptionReasonType newExemptionReason) {
		exemptionReason = newExemptionReason;
	}

	/**
	 * Returns the value of the '<em><b>Registration Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Party Tax Scheme. Registration_ Address. Address</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Registered Address (for tax purposes)</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party Tax Scheme</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PartyTaxSchemeType#getRegistrationAddress <em>Registration Address</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Tax Scheme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Party Tax Scheme. Tax Scheme</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Tax Scheme</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party Tax Scheme</ccts:ObjectClass>
	 * 
	 *               <ccts:PropertyTerm>Tax Scheme</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Tax Scheme</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tax Scheme</em>' containment reference.
	 * @see #setTaxScheme(TaxSchemeType)
	 * @generated
	 */
	public TaxSchemeType getTaxScheme() {
		return (taxScheme == null) ? new TaxSchemeType() : taxScheme;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PartyTaxSchemeType#getTaxScheme <em>Tax Scheme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Scheme</em>' containment reference.
	 * @see #getTaxScheme()
	 * @generated
	 */
	public void setTaxScheme(TaxSchemeType newTaxScheme) {
		taxScheme = newTaxScheme;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.companyID == null) ? 0 : this.companyID.hashCode());
		result = PRIME * result + ((this.exemptionReason == null) ? 0 : this.exemptionReason.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.registrationAddress == null) ? 0 : this.registrationAddress.hashCode());
		result = PRIME * result + ((this.registrationName == null) ? 0 : this.registrationName.hashCode());
		result = PRIME * result + ((this.taxLevelCode == null) ? 0 : this.taxLevelCode.hashCode());
		result = PRIME * result + ((this.taxScheme == null) ? 0 : this.taxScheme.hashCode());
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
		final PartyTaxSchemeType other = (PartyTaxSchemeType) obj;
		if (this.companyID == null) {
			if (other.companyID != null)
				return false;
		} else if (!this.companyID.equals(other.companyID))
			return false;
		if (this.exemptionReason == null) {
			if (other.exemptionReason != null)
				return false;
		} else if (!this.exemptionReason.equals(other.exemptionReason))
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
		if (this.taxLevelCode == null) {
			if (other.taxLevelCode != null)
				return false;
		} else if (!this.taxLevelCode.equals(other.taxLevelCode))
			return false;
		if (this.taxScheme == null) {
			if (other.taxScheme != null)
				return false;
		} else if (!this.taxScheme.equals(other.taxScheme))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // PartyTaxSchemeType