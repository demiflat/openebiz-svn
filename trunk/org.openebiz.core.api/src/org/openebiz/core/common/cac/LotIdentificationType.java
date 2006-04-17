/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import java.util.List;

import org.openebiz.core.common.cbc.ExpiryDateType;
import org.openebiz.core.common.cbc.LotNumberIDType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lot Identification Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Lot Identification. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about a Lot (of Item Instances)</ccts:Definition>
 *           <ccts:ObjectClass>Lot Identification</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.LotIdentificationType#getLotNumberID <em>Lot Number ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LotIdentificationType#getExpiryDate <em>Expiry Date</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LotIdentificationType#getAdditionalItemProperty <em>Additional Item Property</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface LotIdentificationType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Lot Number ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Lot Identification. Lot Number. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the Lot</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Lot Identification</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Lot Number</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lot Number ID</em>' containment reference.
	 * @see #setLotNumberID(LotNumberIDType)
	 */
	LotNumberIDType getLotNumberID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LotIdentificationType#getLotNumberID <em>Lot Number ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lot Number ID</em>' containment reference.
	 * @see #getLotNumberID()
	 */
	void setLotNumberID(LotNumberIDType value);

	/**
	 * Returns the value of the '<em><b>Expiry Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Lot Identification. Expiry Date. Date</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The expiry date of the Lot</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Lot Identification</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Expiry Date</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expiry Date</em>' containment reference.
	 * @see #setExpiryDate(ExpiryDateType)
	 */
	ExpiryDateType getExpiryDate();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LotIdentificationType#getExpiryDate <em>Expiry Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiry Date</em>' containment reference.
	 * @see #getExpiryDate()
	 */
	void setExpiryDate(ExpiryDateType value);

	/**
	 * Returns the value of the '<em><b>Additional Item Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.ItemPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Lot Identification. Additional_ Item Property. Item Property</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Additional Item Property</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Lot Identification</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Additional</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Item Property</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Item Property</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Item Property</em>' containment reference list.
	 */
	List getAdditionalItemProperty();

} // LotIdentificationType