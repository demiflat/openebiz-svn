/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.ActualDespatchDateTimeType;
import org.openebiz.core.common.cbc.EstimatedDespatchDateTimeType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.RequestedDespatchDateTimeType;

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
 */
public interface DespatchType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

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
	 */
	IDType getID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DespatchType#getID <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' containment reference.
	 * @see #getID()
	 */
	void setID(IDType value);

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
	 */
	RequestedDespatchDateTimeType getRequestedDespatchDateTime();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DespatchType#getRequestedDespatchDateTime <em>Requested Despatch Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested Despatch Date Time</em>' containment reference.
	 * @see #getRequestedDespatchDateTime()
	 */
	void setRequestedDespatchDateTime(RequestedDespatchDateTimeType value);

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
	 */
	EstimatedDespatchDateTimeType getEstimatedDespatchDateTime();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DespatchType#getEstimatedDespatchDateTime <em>Estimated Despatch Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Despatch Date Time</em>' containment reference.
	 * @see #getEstimatedDespatchDateTime()
	 */
	void setEstimatedDespatchDateTime(EstimatedDespatchDateTimeType value);

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
	 */
	ActualDespatchDateTimeType getActualDespatchDateTime();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DespatchType#getActualDespatchDateTime <em>Actual Despatch Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Despatch Date Time</em>' containment reference.
	 * @see #getActualDespatchDateTime()
	 */
	void setActualDespatchDateTime(ActualDespatchDateTimeType value);

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
	 */
	AddressType getDespatchAddress();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DespatchType#getDespatchAddress <em>Despatch Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Despatch Address</em>' containment reference.
	 * @see #getDespatchAddress()
	 */
	void setDespatchAddress(AddressType value);

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
	 */
	PartyType getDespatchParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DespatchType#getDespatchParty <em>Despatch Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Despatch Party</em>' containment reference.
	 * @see #getDespatchParty()
	 */
	void setDespatchParty(PartyType value);

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
	 */
	ContactType getContact();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DespatchType#getContact <em>Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact</em>' containment reference.
	 * @see #getContact()
	 */
	void setContact(ContactType value);

} // DespatchType