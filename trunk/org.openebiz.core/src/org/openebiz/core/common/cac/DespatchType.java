/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.ActualDespatchDateTimeType;
import org.openebiz.core.common.cbc.EstimatedDespatchDateTimeType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.RequestedDespatchDateTimeType;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Despatch Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Despatch. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about Delivery</ccts:Definition>
 *           <ccts:ObjectClass>Despatch</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.DespatchType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DespatchType#getRequestedDespatchDateTime <em>Requested Despatch Date Time</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DespatchType#getEstimatedDespatchDateTime <em>Estimated Despatch Date Time</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DespatchType#getActualDespatchDateTime <em>Actual Despatch Date Time</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DespatchType#getDespatchAddress <em>Despatch Address</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DespatchType#getDespatchParty <em>Despatch Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DespatchType#getContact <em>Contact</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DespatchType implements Serializable {
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
	 * The cached value of the '{@link #getRequestedDespatchDateTime() <em>Requested Despatch Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedDespatchDateTime()
	 * @generated
	 * @ordered
	 */
	protected RequestedDespatchDateTimeType requestedDespatchDateTime = null;

	/**
	 * The cached value of the '{@link #getEstimatedDespatchDateTime() <em>Estimated Despatch Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedDespatchDateTime()
	 * @generated
	 * @ordered
	 */
	protected EstimatedDespatchDateTimeType estimatedDespatchDateTime = null;

	/**
	 * The cached value of the '{@link #getActualDespatchDateTime() <em>Actual Despatch Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualDespatchDateTime()
	 * @generated
	 * @ordered
	 */
	protected ActualDespatchDateTimeType actualDespatchDateTime = null;

	/**
	 * The cached value of the '{@link #getDespatchAddress() <em>Despatch Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDespatchAddress()
	 * @generated
	 * @ordered
	 */
	protected AddressType despatchAddress = null;

	/**
	 * The cached value of the '{@link #getDespatchParty() <em>Despatch Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDespatchParty()
	 * @generated
	 * @ordered
	 */
	protected PartyType despatchParty = null;

	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected ContactType contact = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public DespatchType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.iD = this.getID();
		this.requestedDespatchDateTime = this.getRequestedDespatchDateTime();
		this.estimatedDespatchDateTime = this.getEstimatedDespatchDateTime();
		this.actualDespatchDateTime = this.getActualDespatchDateTime();
		this.despatchAddress = this.getDespatchAddress();
		this.despatchParty = this.getDespatchParty();
		this.contact = this.getContact();
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
	 *               <ccts:DictionaryEntryName>Despatch. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identitfer for the Delivery</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Despatch</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DespatchType#getID <em>ID</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Requested Despatch Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Despatch. Requested_ Despatch Date Time. Date Time</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The despatch (pickup) datetime requested by the Buyer</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Despatch</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Requested</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Despatch Date Time</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date Time</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date Time. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requested Despatch Date Time</em>' containment reference.
	 * @see #setRequestedDespatchDateTime(RequestedDespatchDateTimeType)
	 * @generated
	 */
	public RequestedDespatchDateTimeType getRequestedDespatchDateTime() {
		return (requestedDespatchDateTime == null) ? new RequestedDespatchDateTimeType()
				: requestedDespatchDateTime;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DespatchType#getRequestedDespatchDateTime <em>Requested Despatch Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested Despatch Date Time</em>' containment reference.
	 * @see #getRequestedDespatchDateTime()
	 * @generated
	 */
	public void setRequestedDespatchDateTime(
			RequestedDespatchDateTimeType newRequestedDespatchDateTime) {
		requestedDespatchDateTime = newRequestedDespatchDateTime;
	}

	/**
	 * Returns the value of the '<em><b>Estimated Despatch Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Despatch. Estimated_ Despatch Date Time. Date Time</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The despatch (pickup) datetime estimated by the Seller or Despatch</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Despatch</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Estimated</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Despatch Date Time</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date Time</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date Time. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Estimated Despatch Date Time</em>' containment reference.
	 * @see #setEstimatedDespatchDateTime(EstimatedDespatchDateTimeType)
	 * @generated
	 */
	public EstimatedDespatchDateTimeType getEstimatedDespatchDateTime() {
		return (estimatedDespatchDateTime == null) ? new EstimatedDespatchDateTimeType()
				: estimatedDespatchDateTime;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DespatchType#getEstimatedDespatchDateTime <em>Estimated Despatch Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Despatch Date Time</em>' containment reference.
	 * @see #getEstimatedDespatchDateTime()
	 * @generated
	 */
	public void setEstimatedDespatchDateTime(
			EstimatedDespatchDateTimeType newEstimatedDespatchDateTime) {
		estimatedDespatchDateTime = newEstimatedDespatchDateTime;
	}

	/**
	 * Returns the value of the '<em><b>Actual Despatch Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Despatch. Actual_ Despatch Date Time. Date Time</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The actual despatch (pickup) datetime</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Despatch</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Actual</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Despatch Date Time</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date Time</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date Time. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Despatch Date Time</em>' containment reference.
	 * @see #setActualDespatchDateTime(ActualDespatchDateTimeType)
	 * @generated
	 */
	public ActualDespatchDateTimeType getActualDespatchDateTime() {
		return (actualDespatchDateTime == null) ? new ActualDespatchDateTimeType()
				: actualDespatchDateTime;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DespatchType#getActualDespatchDateTime <em>Actual Despatch Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Despatch Date Time</em>' containment reference.
	 * @see #getActualDespatchDateTime()
	 * @generated
	 */
	public void setActualDespatchDateTime(
			ActualDespatchDateTimeType newActualDespatchDateTime) {
		actualDespatchDateTime = newActualDespatchDateTime;
	}

	/**
	 * Returns the value of the '<em><b>Despatch Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Despatch. Despatch_ Address. Address</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Despatch Address</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Despatch</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Despatch</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Address</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Address</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Despatch Address</em>' containment reference.
	 * @see #setDespatchAddress(AddressType)
	 * @generated
	 */
	public AddressType getDespatchAddress() {
		return (despatchAddress == null) ? new AddressType() : despatchAddress;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DespatchType#getDespatchAddress <em>Despatch Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Despatch Address</em>' containment reference.
	 * @see #getDespatchAddress()
	 * @generated
	 */
	public void setDespatchAddress(AddressType newDespatchAddress) {
		despatchAddress = newDespatchAddress;
	}

	/**
	 * Returns the value of the '<em><b>Despatch Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Despatch. Despatch_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The party who despatched the delivery</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Despatch</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Despatch</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Despatch Party</em>' containment reference.
	 * @see #setDespatchParty(PartyType)
	 * @generated
	 */
	public PartyType getDespatchParty() {
		return (despatchParty == null) ? new PartyType() : despatchParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DespatchType#getDespatchParty <em>Despatch Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Despatch Party</em>' containment reference.
	 * @see #getDespatchParty()
	 * @generated
	 */
	public void setDespatchParty(PartyType newDespatchParty) {
		despatchParty = newDespatchParty;
	}

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Despatch. Contact</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Contact</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Despatch</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Contact</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Contact</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference.
	 * @see #setContact(ContactType)
	 * @generated
	 */
	public ContactType getContact() {
		return (contact == null) ? new ContactType() : contact;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DespatchType#getContact <em>Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact</em>' containment reference.
	 * @see #getContact()
	 * @generated
	 */
	public void setContact(ContactType newContact) {
		contact = newContact;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.actualDespatchDateTime == null) ? 0 : this.actualDespatchDateTime.hashCode());
		result = PRIME * result + ((this.contact == null) ? 0 : this.contact.hashCode());
		result = PRIME * result + ((this.despatchAddress == null) ? 0 : this.despatchAddress.hashCode());
		result = PRIME * result + ((this.despatchParty == null) ? 0 : this.despatchParty.hashCode());
		result = PRIME * result + ((this.estimatedDespatchDateTime == null) ? 0 : this.estimatedDespatchDateTime.hashCode());
		result = PRIME * result + ((this.iD == null) ? 0 : this.iD.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.requestedDespatchDateTime == null) ? 0 : this.requestedDespatchDateTime.hashCode());
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
		final DespatchType other = (DespatchType) obj;
		if (this.actualDespatchDateTime == null) {
			if (other.actualDespatchDateTime != null)
				return false;
		} else if (!this.actualDespatchDateTime.equals(other.actualDespatchDateTime))
			return false;
		if (this.contact == null) {
			if (other.contact != null)
				return false;
		} else if (!this.contact.equals(other.contact))
			return false;
		if (this.despatchAddress == null) {
			if (other.despatchAddress != null)
				return false;
		} else if (!this.despatchAddress.equals(other.despatchAddress))
			return false;
		if (this.despatchParty == null) {
			if (other.despatchParty != null)
				return false;
		} else if (!this.despatchParty.equals(other.despatchParty))
			return false;
		if (this.estimatedDespatchDateTime == null) {
			if (other.estimatedDespatchDateTime != null)
				return false;
		} else if (!this.estimatedDespatchDateTime.equals(other.estimatedDespatchDateTime))
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
		if (this.requestedDespatchDateTime == null) {
			if (other.requestedDespatchDateTime != null)
				return false;
		} else if (!this.requestedDespatchDateTime.equals(other.requestedDespatchDateTime))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // DespatchType