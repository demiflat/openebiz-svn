/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.GUIDType;
import org.openebiz.core.common.cbc.LineIDType;
import org.openebiz.core.common.cbc.LineStatusCodeType;
import org.openebiz.core.common.cbc.SalesOrderLineIDType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Line Reference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Order Line Reference. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about an Order Line Reference</ccts:Definition>
 *           <ccts:ObjectClass>Order Line Reference</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.OrderLineReferenceType#getLineID <em>Line ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.OrderLineReferenceType#getSalesOrderLineID <em>Sales Order Line ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.OrderLineReferenceType#getGUID <em>GUID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.OrderLineReferenceType#getLineStatusCode <em>Line Status Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.OrderLineReferenceType#getOrderReference <em>Order Reference</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface OrderLineReferenceType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Line ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order Line Reference. Line Identifier. Identifier</ccts:DictionaryEntryName>
	 * 
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the referenced Order Line assigned by the Buyer</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order Line Reference</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Line Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line ID</em>' containment reference.
	 * @see #setLineID(LineIDType)
	 */
	LineIDType getLineID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.OrderLineReferenceType#getLineID <em>Line ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line ID</em>' containment reference.
	 * @see #getLineID()
	 */
	void setLineID(LineIDType value);

	/**
	 * Returns the value of the '<em><b>Sales Order Line ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order Line Reference. Sales Order_ Line Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the referenced Order Line assigned by the Seller</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order Line Reference</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Sales Order</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Line Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sales Order Line ID</em>' containment reference.
	 * @see #setSalesOrderLineID(SalesOrderLineIDType)
	 */
	SalesOrderLineIDType getSalesOrderLineID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.OrderLineReferenceType#getSalesOrderLineID <em>Sales Order Line ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Order Line ID</em>' containment reference.
	 * @see #getSalesOrderLineID()
	 */
	void setSalesOrderLineID(SalesOrderLineIDType value);

	/**
	 * Returns the value of the '<em><b>GUID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order Line Reference. Globally Unique Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A computer-generated globally unique identifier (GUID) for the referenced Order Line instance</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order Line Reference</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Globally Unique Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GUID</em>' containment reference.
	 * @see #setGUID(GUIDType)
	 */
	GUIDType getGUID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.OrderLineReferenceType#getGUID <em>GUID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GUID</em>' containment reference.
	 * @see #getGUID()
	 */
	void setGUID(GUIDType value);

	/**
	 * Returns the value of the '<em><b>Line Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order Line Reference. Line Status. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Identifies the status of the referenced Order Line with respect to its original state</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order Line Reference</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Line Status</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Status Code</em>' containment reference.
	 * @see #setLineStatusCode(LineStatusCodeType)
	 */
	LineStatusCodeType getLineStatusCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.OrderLineReferenceType#getLineStatusCode <em>Line Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Status Code</em>' containment reference.
	 * @see #getLineStatusCode()
	 */
	void setLineStatusCode(LineStatusCodeType value);

	/**
	 * Returns the value of the '<em><b>Order Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order Line Reference. Order Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Order Reference</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order Line Reference</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Order Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Order Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order Reference</em>' containment reference.
	 * @see #setOrderReference(OrderReferenceType)
	 */
	OrderReferenceType getOrderReference();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.OrderLineReferenceType#getOrderReference <em>Order Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Reference</em>' containment reference.
	 * @see #getOrderReference()
	 */
	void setOrderReference(OrderReferenceType value);

} // OrderLineReferenceType