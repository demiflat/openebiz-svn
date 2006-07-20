/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.BatchQuantityType;
import org.openebiz.core.common.cbc.ConsumerUnitQuantityType;
import org.openebiz.core.common.cbc.HazardousRiskIndicatorType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delivery Unit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Delivery Unit. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about a Delivery Unit</ccts:Definition>
 *           <ccts:ObjectClass>Delivery Unit</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryUnitType#getBatchQuantity <em>Batch Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryUnitType#getConsumerUnitQuantity <em>Consumer Unit Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryUnitType#getHazardousRiskIndicator <em>Hazardous Risk Indicator</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface DeliveryUnitType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Batch Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery Unit. Batch Quantity. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The quantity of ordered Items that constitutes a batch for delivery purposes</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery Unit</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Batch Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *               <ccts:Examples>"100 units", "by the dozen"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Batch Quantity</em>' containment reference.
	 * @see #setBatchQuantity(BatchQuantityType)
	 */
	BatchQuantityType getBatchQuantity();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryUnitType#getBatchQuantity <em>Batch Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Batch Quantity</em>' containment reference.
	 * @see #getBatchQuantity()
	 */
	void setBatchQuantity(BatchQuantityType value);

	/**
	 * Returns the value of the '<em><b>Consumer Unit Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery Unit. Consumer_ Unit. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The quantity of consumer units in the Delivery Unit</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery Unit</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Consumer</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Unit</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *               <ccts:Examples>"packs of 10"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consumer Unit Quantity</em>' containment reference.
	 * @see #setConsumerUnitQuantity(ConsumerUnitQuantityType)
	 */
	ConsumerUnitQuantityType getConsumerUnitQuantity();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryUnitType#getConsumerUnitQuantity <em>Consumer Unit Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumer Unit Quantity</em>' containment reference.
	 * @see #getConsumerUnitQuantity()
	 */
	void setConsumerUnitQuantity(ConsumerUnitQuantityType value);

	/**
	 * Returns the value of the '<em><b>Hazardous Risk Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery Unit. Hazardous Risk Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Indicates whether the Item as delivered is hazardous</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery Unit</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Hazardous Risk Indicator</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *               <ccts:Examples>Default is negative</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hazardous Risk Indicator</em>' containment reference.
	 * @see #setHazardousRiskIndicator(HazardousRiskIndicatorType)
	 */
	HazardousRiskIndicatorType getHazardousRiskIndicator();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryUnitType#getHazardousRiskIndicator <em>Hazardous Risk Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hazardous Risk Indicator</em>' containment reference.
	 * @see #getHazardousRiskIndicator()
	 */
	void setHazardousRiskIndicator(HazardousRiskIndicatorType value);

} // DeliveryUnitType