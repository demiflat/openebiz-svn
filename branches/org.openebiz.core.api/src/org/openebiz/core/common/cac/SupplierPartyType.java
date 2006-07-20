/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import java.util.List;

import org.openebiz.core.common.cbc.CustomerAssignedAccountIDType;
import org.openebiz.core.common.cbc.DataSendingCapabilityType;
import org.openebiz.core.common.cbc.SupplierAssignedAccountIDType;

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
 */
public interface SupplierPartyType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

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
	 */
	CustomerAssignedAccountIDType getCustomerAssignedAccountID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SupplierPartyType#getCustomerAssignedAccountID <em>Customer Assigned Account ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Assigned Account ID</em>' containment reference.
	 * @see #getCustomerAssignedAccountID()
	 */
	void setCustomerAssignedAccountID(CustomerAssignedAccountIDType value);

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
	 */
	SupplierAssignedAccountIDType getSupplierAssignedAccountID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SupplierPartyType#getSupplierAssignedAccountID <em>Supplier Assigned Account ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier Assigned Account ID</em>' containment reference.
	 * @see #getSupplierAssignedAccountID()
	 */
	void setSupplierAssignedAccountID(SupplierAssignedAccountIDType value);

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
	 */
	List getAdditionalAccountID();

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
	 */
	DataSendingCapabilityType getDataSendingCapability();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SupplierPartyType#getDataSendingCapability <em>Data Sending Capability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Sending Capability</em>' containment reference.
	 * @see #getDataSendingCapability()
	 */
	void setDataSendingCapability(DataSendingCapabilityType value);

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
	 */
	PartyType getParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SupplierPartyType#getParty <em>Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' containment reference.
	 * @see #getParty()
	 */
	void setParty(PartyType value);

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
	 */
	ContactType getShippingContact();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SupplierPartyType#getShippingContact <em>Shipping Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipping Contact</em>' containment reference.
	 * @see #getShippingContact()
	 */
	void setShippingContact(ContactType value);

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
	 */
	ContactType getAccountsContact();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SupplierPartyType#getAccountsContact <em>Accounts Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accounts Contact</em>' containment reference.
	 * @see #getAccountsContact()
	 */
	void setAccountsContact(ContactType value);

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
	 */
	ContactType getOrderContact();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SupplierPartyType#getOrderContact <em>Order Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Contact</em>' containment reference.
	 * @see #getOrderContact()
	 */
	void setOrderContact(ContactType value);

} // SupplierPartyType