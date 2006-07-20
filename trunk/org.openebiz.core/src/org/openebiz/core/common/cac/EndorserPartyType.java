/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.RoleCodeType;
import org.openebiz.core.common.cbc.SequenceNumericType;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endorser Party Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Endorser Party. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>The party endorsing a document</ccts:Definition>
 *           <ccts:ObjectClass>Endorser Party</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.EndorserPartyType#getRoleCode <em>Role Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.EndorserPartyType#getSequenceNumeric <em>Sequence Numeric</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.EndorserPartyType#getParty <em>Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.EndorserPartyType#getSignatoryContact <em>Signatory Contact</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EndorserPartyType implements Serializable {
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
	 * The cached value of the '{@link #getRoleCode() <em>Role Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleCode()
	 * @generated
	 * @ordered
	 */
	protected RoleCodeType roleCode = null;

	/**
	 * The cached value of the '{@link #getSequenceNumeric() <em>Sequence Numeric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumeric()
	 * @generated
	 * @ordered
	 */
	protected SequenceNumericType sequenceNumeric = null;

	/**
	 * The cached value of the '{@link #getParty() <em>Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParty()
	 * @generated
	 * @ordered
	 */
	protected PartyType party = null;

	/**
	 * The cached value of the '{@link #getSignatoryContact() <em>Signatory Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatoryContact()
	 * @generated
	 * @ordered
	 */
	protected ContactType signatoryContact = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EndorserPartyType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.roleCode = this.getRoleCode();
		this.sequenceNumeric = this.getSequenceNumeric();
		this.party = this.getParty();
		this.signatoryContact = this.getSignatoryContact();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getSequenceNumeric().getValue().toPlainString());
		return sdisplay.toString();
	}
	
	/**
	 * Returns the value of the '<em><b>Role Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Endorser Party. Role. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The role of the party providing the endorsement, eg. Issuer, Embassy, Insurance, etc.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Endorser Party</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Role</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role Code</em>' containment reference.
	 * @see #setRoleCode(RoleCodeType)
	 * @generated
	 */
	public RoleCodeType getRoleCode() {
		return (roleCode == null) ? new RoleCodeType() : roleCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.EndorserPartyType#getRoleCode <em>Role Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Code</em>' containment reference.
	 * @see #getRoleCode()
	 * @generated
	 */
	public void setRoleCode(RoleCodeType newRoleCode) {
		roleCode = newRoleCode;
	}

	/**
	 * Returns the value of the '<em><b>Sequence Numeric</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Endorser Party. Sequence. Numeric</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The sequence in which the endorsements are to be applied</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Endorser Party</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Sequence</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Numeric</ccts:RepresentationTerm>
	 *               <ccts:DataType>Numeric. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence Numeric</em>' containment reference.
	 * @see #setSequenceNumeric(SequenceNumericType)
	 * @generated
	 */
	public SequenceNumericType getSequenceNumeric() {
		return (sequenceNumeric == null) ? new SequenceNumericType()
				: sequenceNumeric;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.EndorserPartyType#getSequenceNumeric <em>Sequence Numeric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Numeric</em>' containment reference.
	 * @see #getSequenceNumeric()
	 * @generated
	 */
	public void setSequenceNumeric(SequenceNumericType newSequenceNumeric) {
		sequenceNumeric = newSequenceNumeric;
	}

	/**
	 * Returns the value of the '<em><b>Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Endorser Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Details of the party endorsing the application</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Endorser Party</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Party</em>' containment reference.
	 * @see #setParty(PartyType)
	 * @generated
	 */
	public PartyType getParty() {
		return (party == null) ? new PartyType() : party;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.EndorserPartyType#getParty <em>Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' containment reference.
	 * @see #getParty()
	 * @generated
	 */
	public void setParty(PartyType newParty) {
		party = newParty;
	}

	/**
	 * Returns the value of the '<em><b>Signatory Contact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Endorser Party. Signatory_ Contact. Contact</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Details of the individual represents the exporter who signs the Certificate of Origin application before submitting to the Issuer Party.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Endorser Party</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Signatory</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Contact</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Contact</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signatory Contact</em>' containment reference.
	 * @see #setSignatoryContact(ContactType)
	 * @generated
	 */
	public ContactType getSignatoryContact() {
		return (signatoryContact == null) ? new ContactType()
				: signatoryContact;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.EndorserPartyType#getSignatoryContact <em>Signatory Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signatory Contact</em>' containment reference.
	 * @see #getSignatoryContact()
	 * @generated
	 */
	public void setSignatoryContact(ContactType newSignatoryContact) {
		signatoryContact = newSignatoryContact;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.party == null) ? 0 : this.party.hashCode());
		result = PRIME * result + ((this.roleCode == null) ? 0 : this.roleCode.hashCode());
		result = PRIME * result + ((this.sequenceNumeric == null) ? 0 : this.sequenceNumeric.hashCode());
		result = PRIME * result + ((this.signatoryContact == null) ? 0 : this.signatoryContact.hashCode());
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
		final EndorserPartyType other = (EndorserPartyType) obj;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.party == null) {
			if (other.party != null)
				return false;
		} else if (!this.party.equals(other.party))
			return false;
		if (this.roleCode == null) {
			if (other.roleCode != null)
				return false;
		} else if (!this.roleCode.equals(other.roleCode))
			return false;
		if (this.sequenceNumeric == null) {
			if (other.sequenceNumeric != null)
				return false;
		} else if (!this.sequenceNumeric.equals(other.sequenceNumeric))
			return false;
		if (this.signatoryContact == null) {
			if (other.signatoryContact != null)
				return false;
		} else if (!this.signatoryContact.equals(other.signatoryContact))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // EndorserPartyType