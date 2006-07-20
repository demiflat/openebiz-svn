/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import java.util.List;

import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.QuantityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goods Item Container Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Goods Item Container. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>How goods items are split across transport equipment.</ccts:Definition>
 *           <ccts:ObjectClass>Goods Item Container</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemContainerType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemContainerType#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemContainerType#getTransportEquipment <em>Transport Equipment</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface GoodsItemContainerType {
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
	 *               <ccts:DictionaryEntryName>Goods Item Container. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Identifies goods items split across transport equipment.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item Container</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemContainerType#getID <em>ID</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Goods Item Container. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Number of goods items loaded into or onto one piece of transport equipment as part of, or total of one consignment.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item Container</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Number of packages stuffed</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(QuantityType)
	 */
	QuantityType getQuantity();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemContainerType#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 */
	void setQuantity(QuantityType value);

	/**
	 * Returns the value of the '<em><b>Transport Equipment</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.TransportEquipmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item Container. Transport Equipment</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Associates the containers for a single goods item.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item Container</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Transport Equipment</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Transport Equipment</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transport Equipment</em>' containment reference list.
	 */
	List getTransportEquipment();

} // GoodsItemContainerType