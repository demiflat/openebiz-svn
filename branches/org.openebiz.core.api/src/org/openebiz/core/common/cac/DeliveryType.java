/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import java.util.List;

import org.openebiz.core.common.cbc.ActualDeliveryDateTimeType;
import org.openebiz.core.common.cbc.EstimatedDeliveryDateTimeType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.LatestDeliveryDateTimeType;
import org.openebiz.core.common.cbc.MaximumQuantityType;
import org.openebiz.core.common.cbc.MinimumQuantityType;
import org.openebiz.core.common.cbc.PromisedDeliveryDateTimeType;
import org.openebiz.core.common.cbc.QuantityType;
import org.openebiz.core.common.cbc.RequestedDeliveryDateTimeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delivery Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Delivery. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about Delivery</ccts:Definition>
 *           <ccts:ObjectClass>Delivery</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryType#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryType#getMinimumQuantity <em>Minimum Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryType#getMaximumQuantity <em>Maximum Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryType#getRequestedDeliveryDateTime <em>Requested Delivery Date Time</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryType#getPromisedDeliveryDateTime <em>Promised Delivery Date Time</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryType#getEstimatedDeliveryDateTime <em>Estimated Delivery Date Time</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryType#getActualDeliveryDateTime <em>Actual Delivery Date Time</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryType#getLatestDeliveryDateTime <em>Latest Delivery Date Time</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryType#getDeliveryAddress <em>Delivery Address</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryType#getOrderLineReference <em>Order Line Reference</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryType#getContact <em>Contact</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryType#getOriginatorParty <em>Originator Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryType#getDespatch <em>Despatch</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface DeliveryType {
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
	 *               <ccts:DictionaryEntryName>Delivery. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identitfer for the Delivery</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryType#getID <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' containment reference.
	 * @see #getID()
	 */
	void setID(IDType value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The quantity in a Delivery</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(QuantityType)
	 */
	QuantityType getQuantity();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryType#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 */
	void setQuantity(QuantityType value);

	/**
	 * Returns the value of the '<em><b>Minimum Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery. Minimum_ Quantity. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The minimum quantity in a Delivery</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Minimum</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Quantity</em>' containment reference.
	 * @see #setMinimumQuantity(MinimumQuantityType)
	 */
	MinimumQuantityType getMinimumQuantity();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryType#getMinimumQuantity <em>Minimum Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Quantity</em>' containment reference.
	 * @see #getMinimumQuantity()
	 */
	void setMinimumQuantity(MinimumQuantityType value);

	/**
	 * Returns the value of the '<em><b>Maximum Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery. Maximum_ Quantity. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The maximum quantity in a Delivery</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Maximum</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Quantity</em>' containment reference.
	 * @see #setMaximumQuantity(MaximumQuantityType)
	 */
	MaximumQuantityType getMaximumQuantity();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryType#getMaximumQuantity <em>Maximum Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Quantity</em>' containment reference.
	 * @see #getMaximumQuantity()
	 */
	void setMaximumQuantity(MaximumQuantityType value);

	/**
	 * Returns the value of the '<em><b>Requested Delivery Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery. Requested_ Delivery Date Time. Date Time</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The Delivery datetime requested by the Buyer</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Requested</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Delivery Date Time</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date Time</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date Time. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requested Delivery Date Time</em>' containment reference.
	 * @see #setRequestedDeliveryDateTime(RequestedDeliveryDateTimeType)
	 */
	RequestedDeliveryDateTimeType getRequestedDeliveryDateTime();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryType#getRequestedDeliveryDateTime <em>Requested Delivery Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested Delivery Date Time</em>' containment reference.
	 * @see #getRequestedDeliveryDateTime()
	 */
	void setRequestedDeliveryDateTime(RequestedDeliveryDateTimeType value);

	/**
	 * Returns the value of the '<em><b>Promised Delivery Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery. Promised_ Delivery Date Time. Date Time</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The Delivery datetime promised by the Seller</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Promised</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Delivery Date Time</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date Time</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date Time. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Promised Delivery Date Time</em>' containment reference.
	 * @see #setPromisedDeliveryDateTime(PromisedDeliveryDateTimeType)
	 */
	PromisedDeliveryDateTimeType getPromisedDeliveryDateTime();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryType#getPromisedDeliveryDateTime <em>Promised Delivery Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Promised Delivery Date Time</em>' containment reference.
	 * @see #getPromisedDeliveryDateTime()
	 */
	void setPromisedDeliveryDateTime(PromisedDeliveryDateTimeType value);

	/**
	 * Returns the value of the '<em><b>Estimated Delivery Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery. Estimated_ Delivery Date Time. Date Time</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The Delivery datetime estimated by the Seller or Despatch</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Estimated</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Delivery Date Time</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date Time</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date Time. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Estimated Delivery Date Time</em>' containment reference.
	 * @see #setEstimatedDeliveryDateTime(EstimatedDeliveryDateTimeType)
	 */
	EstimatedDeliveryDateTimeType getEstimatedDeliveryDateTime();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryType#getEstimatedDeliveryDateTime <em>Estimated Delivery Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Delivery Date Time</em>' containment reference.
	 * @see #getEstimatedDeliveryDateTime()
	 */
	void setEstimatedDeliveryDateTime(EstimatedDeliveryDateTimeType value);

	/**
	 * Returns the value of the '<em><b>Actual Delivery Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery. Actual_ Delivery Date Time. Date Time</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The actual Delivery datetime</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Actual</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Delivery Date Time</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date Time</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date Time. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Delivery Date Time</em>' containment reference.
	 * @see #setActualDeliveryDateTime(ActualDeliveryDateTimeType)
	 */
	ActualDeliveryDateTimeType getActualDeliveryDateTime();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryType#getActualDeliveryDateTime <em>Actual Delivery Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Delivery Date Time</em>' containment reference.
	 * @see #getActualDeliveryDateTime()
	 */
	void setActualDeliveryDateTime(ActualDeliveryDateTimeType value);

	/**
	 * Returns the value of the '<em><b>Latest Delivery Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery. Latest_ Delivery Date Time. Date Time</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The latest delivery datetime allowed by the Buyer.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Latest</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Delivery Date Time</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date Time</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date Time. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Latest Delivery Date Time</em>' containment reference.
	 * @see #setLatestDeliveryDateTime(LatestDeliveryDateTimeType)
	 */
	LatestDeliveryDateTimeType getLatestDeliveryDateTime();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryType#getLatestDeliveryDateTime <em>Latest Delivery Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latest Delivery Date Time</em>' containment reference.
	 * @see #getLatestDeliveryDateTime()
	 */
	void setLatestDeliveryDateTime(LatestDeliveryDateTimeType value);

	/**
	 * Returns the value of the '<em><b>Delivery Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery. Delivery_ Address. Address</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Delivery Address</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Delivery</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Address</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Address</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delivery Address</em>' containment reference.
	 * @see #setDeliveryAddress(AddressType)
	 */
	AddressType getDeliveryAddress();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryType#getDeliveryAddress <em>Delivery Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Address</em>' containment reference.
	 * @see #getDeliveryAddress()
	 */
	void setDeliveryAddress(AddressType value);

	/**
	 * Returns the value of the '<em><b>Order Line Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.OrderLineReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery. Order Line Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Order Line Reference</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Order Line Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Order Line Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order Line Reference</em>' containment reference list.
	 */
	List getOrderLineReference();

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery. Contact</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Contact</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryType#getContact <em>Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact</em>' containment reference.
	 * @see #getContact()
	 */
	void setContact(ContactType value);

	/**
	 * Returns the value of the '<em><b>Originator Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery. Originator_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The party who originated the delivery</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Originator</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Originator Party</em>' containment reference.
	 * @see #setOriginatorParty(PartyType)
	 */
	PartyType getOriginatorParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryType#getOriginatorParty <em>Originator Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Originator Party</em>' containment reference.
	 * @see #getOriginatorParty()
	 */
	void setOriginatorParty(PartyType value);

	/**
	 * Returns the value of the '<em><b>Despatch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery. Despatch</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The party who despatched the delivery</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Despatch</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Despatch</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Despatch</em>' containment reference.
	 * @see #setDespatch(DespatchType)
	 */
	DespatchType getDespatch();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryType#getDespatch <em>Despatch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Despatch</em>' containment reference.
	 * @see #getDespatch()
	 */
	void setDespatch(DespatchType value);

} // DeliveryType