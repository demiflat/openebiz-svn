/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.AdditionalAccountIDType;
import org.openebiz.core.common.cbc.CustomerAssignedAccountIDType;
import org.openebiz.core.common.cbc.DataSendingCapabilityType;
import org.openebiz.core.common.cbc.SupplierAssignedAccountIDType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supplier Party Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Supplier Party. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about the Supplier Party</ccts:Definition>
 *           <ccts:ObjectClass>Supplier Party</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.SupplierPartyType#getCustomerAssignedAccountID <em>Customer Assigned Account ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.SupplierPartyType#getSupplierAssignedAccountID <em>Supplier Assigned Account ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.SupplierPartyType#getAdditionalAccountID <em>Additional Account ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.SupplierPartyType#getDataSendingCapability <em>Data Sending Capability</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.SupplierPartyType#getParty <em>Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.SupplierPartyType#getShippingContact <em>Shipping Contact</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.SupplierPartyType#getAccountsContact <em>Accounts Contact</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.SupplierPartyType#getOrderContact <em>Order Contact</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SupplierPartyType implements Serializable {
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
	 * The cached value of the '{@link #getCustomerAssignedAccountID() <em>Customer Assigned Account ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerAssignedAccountID()
	 * @generated
	 * @ordered
	 */
	protected CustomerAssignedAccountIDType customerAssignedAccountID = null;

	/**
	 * The cached value of the '{@link #getSupplierAssignedAccountID() <em>Supplier Assigned Account ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierAssignedAccountID()
	 * @generated
	 * @ordered
	 */
	protected SupplierAssignedAccountIDType supplierAssignedAccountID = null;

	/**
	 * The cached value of the '{@link #getAdditionalAccountID() <em>Additional Account ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalAccountID()
	 * @generated
	 * @ordered
	 */
	protected List additionalAccountID = null;

	/**
	 * The cached value of the '{@link #getDataSendingCapability() <em>Data Sending Capability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSendingCapability()
	 * @generated
	 * @ordered
	 */
	protected DataSendingCapabilityType dataSendingCapability = null;

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
	 * The cached value of the '{@link #getShippingContact() <em>Shipping Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShippingContact()
	 * @generated
	 * @ordered
	 */
	protected ContactType shippingContact = null;

	/**
	 * The cached value of the '{@link #getAccountsContact() <em>Accounts Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountsContact()
	 * @generated
	 * @ordered
	 */
	protected ContactType accountsContact = null;

	/**
	 * The cached value of the '{@link #getOrderContact() <em>Order Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderContact()
	 * @generated
	 * @ordered
	 */
	protected ContactType orderContact = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public SupplierPartyType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.customerAssignedAccountID = this.getCustomerAssignedAccountID();
		this.supplierAssignedAccountID = this.getSupplierAssignedAccountID();
		this.additionalAccountID = this.getAdditionalAccountID();
		this.dataSendingCapability = this.getDataSendingCapability();
		this.party = this.getParty();
		this.shippingContact = this.getShippingContact();
		this.accountsContact = this.getAccountsContact();
		this.orderContact = this.getOrderContact();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getParty().getShortDisplay());
		return sdisplay.toString();
	}

	/**
	 * Returns the value of the '<em><b>Customer Assigned Account ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Supplier Party. Customer Assigned_ Account Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An identifier for the Supplier assigned by the Customer</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Supplier Party</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Customer Assigned</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Account Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Customer Assigned Account ID</em>' containment reference.
	 * @see #setCustomerAssignedAccountID(CustomerAssignedAccountIDType)
	 * @generated
	 */
	public CustomerAssignedAccountIDType getCustomerAssignedAccountID() {
		return (customerAssignedAccountID == null) ? new CustomerAssignedAccountIDType()
				: customerAssignedAccountID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SupplierPartyType#getCustomerAssignedAccountID <em>Customer Assigned Account ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Assigned Account ID</em>' containment reference.
	 * @see #getCustomerAssignedAccountID()
	 * @generated
	 */
	public void setCustomerAssignedAccountID(
			CustomerAssignedAccountIDType newCustomerAssignedAccountID) {
		customerAssignedAccountID = newCustomerAssignedAccountID;
	}

	/**
	 * Returns the value of the '<em><b>Supplier Assigned Account ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Supplier Party. Supplier Assigned_ Account Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An identifier for the Supplier assigned by the Supplier itself</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Supplier Party</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Supplier Assigned</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Account Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplier Assigned Account ID</em>' containment reference.
	 * @see #setSupplierAssignedAccountID(SupplierAssignedAccountIDType)
	 * @generated
	 */
	public SupplierAssignedAccountIDType getSupplierAssignedAccountID() {
		return (supplierAssignedAccountID == null) ? new SupplierAssignedAccountIDType()
				: supplierAssignedAccountID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SupplierPartyType#getSupplierAssignedAccountID <em>Supplier Assigned Account ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier Assigned Account ID</em>' containment reference.
	 * @see #getSupplierAssignedAccountID()
	 * @generated
	 */
	public void setSupplierAssignedAccountID(
			SupplierAssignedAccountIDType newSupplierAssignedAccountID) {
		supplierAssignedAccountID = newSupplierAssignedAccountID;
	}

	/**
	 * Returns the value of the '<em><b>Additional Account ID</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cbc.AdditionalAccountIDType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Supplier Party. Additional_ Account Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An identifier for the Supplier assigned by a third party</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Supplier Party</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Additional</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Account Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Account ID</em>' containment reference list.
	 * @generated
	 */
	public List getAdditionalAccountID() {
		if (additionalAccountID == null) {
			additionalAccountID = new ArrayList<
					AdditionalAccountIDType>();
		}
		return additionalAccountID;
	}

	/**
	 * Returns the value of the '<em><b>Data Sending Capability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Supplier Party. Data Sending Capability. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>capability to send invoice data via the Purchase Card provider (VISA/MasterCard/American Express)</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Supplier Party</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Data Sending Capability</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Sending Capability</em>' containment reference.
	 * @see #setDataSendingCapability(DataSendingCapabilityType)
	 * @generated
	 */
	public DataSendingCapabilityType getDataSendingCapability() {
		return (dataSendingCapability == null) ? new DataSendingCapabilityType()
				: dataSendingCapability;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SupplierPartyType#getDataSendingCapability <em>Data Sending Capability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Sending Capability</em>' containment reference.
	 * @see #getDataSendingCapability()
	 * @generated
	 */
	public void setDataSendingCapability(
			DataSendingCapabilityType newDataSendingCapability) {
		dataSendingCapability = newDataSendingCapability;
	}

	/**
	 * Returns the value of the '<em><b>Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Supplier Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Party</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Supplier Party</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SupplierPartyType#getParty <em>Party</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Shipping Contact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Supplier Party. Shipping_ Contact. Contact</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Despatch</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Supplier Party</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Shipping</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Contact</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Contact</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shipping Contact</em>' containment reference.
	 * @see #setShippingContact(ContactType)
	 * @generated
	 */
	public ContactType getShippingContact() {
		return (shippingContact == null) ? new ContactType() : shippingContact;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SupplierPartyType#getShippingContact <em>Shipping Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipping Contact</em>' containment reference.
	 * @see #getShippingContact()
	 * @generated
	 */
	public void setShippingContact(ContactType newShippingContact) {
		shippingContact = newShippingContact;
	}

	/**
	 * Returns the value of the '<em><b>Accounts Contact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Supplier Party. Accounts_ Contact. Contact</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to theCreditor</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Supplier Party</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Accounts</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Contact</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Contact</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accounts Contact</em>' containment reference.
	 * @see #setAccountsContact(ContactType)
	 * @generated
	 */
	public ContactType getAccountsContact() {
		return (accountsContact == null) ? new ContactType() : accountsContact;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SupplierPartyType#getAccountsContact <em>Accounts Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accounts Contact</em>' containment reference.
	 * @see #getAccountsContact()
	 * @generated
	 */
	public void setAccountsContact(ContactType newAccountsContact) {
		accountsContact = newAccountsContact;
	}

	/**
	 * Returns the value of the '<em><b>Order Contact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Supplier Party. Order_ Contact. Contact</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Seller</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Supplier Party</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Order</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Contact</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Contact</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order Contact</em>' containment reference.
	 * @see #setOrderContact(ContactType)
	 * @generated
	 */
	public ContactType getOrderContact() {
		return (orderContact == null) ? new ContactType() : orderContact;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SupplierPartyType#getOrderContact <em>Order Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Contact</em>' containment reference.
	 * @see #getOrderContact()
	 * @generated
	 */
	public void setOrderContact(ContactType newOrderContact) {
		orderContact = newOrderContact;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.accountsContact == null) ? 0 : this.accountsContact.hashCode());
		result = PRIME * result + ((this.additionalAccountID == null) ? 0 : this.additionalAccountID.hashCode());
		result = PRIME * result + ((this.customerAssignedAccountID == null) ? 0 : this.customerAssignedAccountID.hashCode());
		result = PRIME * result + ((this.dataSendingCapability == null) ? 0 : this.dataSendingCapability.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.orderContact == null) ? 0 : this.orderContact.hashCode());
		result = PRIME * result + ((this.party == null) ? 0 : this.party.hashCode());
		result = PRIME * result + ((this.shippingContact == null) ? 0 : this.shippingContact.hashCode());
		result = PRIME * result + ((this.supplierAssignedAccountID == null) ? 0 : this.supplierAssignedAccountID.hashCode());
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
		final SupplierPartyType other = (SupplierPartyType) obj;
		if (this.accountsContact == null) {
			if (other.accountsContact != null)
				return false;
		} else if (!this.accountsContact.equals(other.accountsContact))
			return false;
		if (this.additionalAccountID == null) {
			if (other.additionalAccountID != null)
				return false;
		} else if (!this.additionalAccountID.equals(other.additionalAccountID))
			return false;
		if (this.customerAssignedAccountID == null) {
			if (other.customerAssignedAccountID != null)
				return false;
		} else if (!this.customerAssignedAccountID.equals(other.customerAssignedAccountID))
			return false;
		if (this.dataSendingCapability == null) {
			if (other.dataSendingCapability != null)
				return false;
		} else if (!this.dataSendingCapability.equals(other.dataSendingCapability))
			return false;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.orderContact == null) {
			if (other.orderContact != null)
				return false;
		} else if (!this.orderContact.equals(other.orderContact))
			return false;
		if (this.party == null) {
			if (other.party != null)
				return false;
		} else if (!this.party.equals(other.party))
			return false;
		if (this.shippingContact == null) {
			if (other.shippingContact != null)
				return false;
		} else if (!this.shippingContact.equals(other.shippingContact))
			return false;
		if (this.supplierAssignedAccountID == null) {
			if (other.supplierAssignedAccountID != null)
				return false;
		} else if (!this.supplierAssignedAccountID.equals(other.supplierAssignedAccountID))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // SupplierPartyType