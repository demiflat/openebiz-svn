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
import org.openebiz.core.common.cbc.SupplierAssignedAccountIDType;

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
 */
public interface CustomerPartyType {
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
	 */
	CustomerAssignedAccountIDType getCustomerAssignedAccountID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CustomerPartyType#getCustomerAssignedAccountID <em>Customer Assigned Account ID</em>}' containment reference.
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
	 */
	SupplierAssignedAccountIDType getSupplierAssignedAccountID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CustomerPartyType#getSupplierAssignedAccountID <em>Supplier Assigned Account ID</em>}' containment reference.
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
	 */
	List getAdditionalAccountID();

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
	 */
	PartyType getParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CustomerPartyType#getParty <em>Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' containment reference.
	 * @see #getParty()
	 */
	void setParty(PartyType value);

} // CustomerPartyType