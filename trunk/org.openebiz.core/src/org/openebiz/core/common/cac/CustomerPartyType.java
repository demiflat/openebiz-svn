/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.AdditionalAccountIDType;
import org.openebiz.core.common.cbc.CustomerAssignedAccountIDType;
import org.openebiz.core.common.cbc.SupplierAssignedAccountIDType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Party Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Customer Party. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about the Customer Party</ccts:Definition>
 *           <ccts:ObjectClass>Customer Party</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.CustomerPartyType#getCustomerAssignedAccountID <em>Customer Assigned Account ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CustomerPartyType#getSupplierAssignedAccountID <em>Supplier Assigned Account ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CustomerPartyType#getAdditionalAccountID <em>Additional Account ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CustomerPartyType#getParty <em>Party</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomerPartyType implements Serializable {
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
	 * The cached value of the '{@link #getParty() <em>Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParty()
	 * @generated
	 * @ordered
	 */
	protected PartyType party = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public CustomerPartyType() {
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
		this.party = this.getParty();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getCustomerAssignedAccountID().getValue() != null ? this.getCustomerAssignedAccountID().getValue() : "");
		sdisplay.append(" | ");
		sdisplay.append(this.getSupplierAssignedAccountID().getValue() != null ? this.getSupplierAssignedAccountID().getValue() : "");
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
	 *               <ccts:DictionaryEntryName>Customer Party. Customer Assigned_ Account Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An identifier for the Customer assigned by the Customer itself</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Customer Party</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CustomerPartyType#getCustomerAssignedAccountID <em>Customer Assigned Account ID</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Customer Party. Supplier Assigned_ Account Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An identifier for the Customer assigned by the Supplier</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Customer Party</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CustomerPartyType#getSupplierAssignedAccountID <em>Supplier Assigned Account ID</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Customer Party. Additional_ Account Identifier. Identifier</ccts:DictionaryEntryName>
	 * 
	 *               <ccts:Version/>
	 *               <ccts:Definition>An identifier for the Customer assigned by a third party</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Customer Party</ccts:ObjectClass>
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
	 * Returns the value of the '<em><b>Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Customer Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Party</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Customer Party</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CustomerPartyType#getParty <em>Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' containment reference.
	 * @see #getParty()
	 * @generated
	 */
	public void setParty(PartyType newParty) {
		party = newParty;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.additionalAccountID == null) ? 0 : this.additionalAccountID.hashCode());
		result = PRIME * result + ((this.customerAssignedAccountID == null) ? 0 : this.customerAssignedAccountID.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.party == null) ? 0 : this.party.hashCode());
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
		final CustomerPartyType other = (CustomerPartyType) obj;
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

} // CustomerPartyType