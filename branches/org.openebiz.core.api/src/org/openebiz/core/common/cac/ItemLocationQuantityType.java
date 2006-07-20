/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import java.util.List;

import org.openebiz.core.common.cbc.HazardousRiskIndicatorType;
import org.openebiz.core.common.cbc.LeadTimeMeasureType;
import org.openebiz.core.common.cbc.MaximumQuantityType;
import org.openebiz.core.common.cbc.MinimumQuantityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Location Quantity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Item Location Quantity. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about the properites of an Item as they relate to specific quantities  and/or specific locations</ccts:Definition>
 *           <ccts:ObjectClass>Item Location Quantity</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.ItemLocationQuantityType#getLeadTimeMeasure <em>Lead Time Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemLocationQuantityType#getMinimumQuantity <em>Minimum Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemLocationQuantityType#getMaximumQuantity <em>Maximum Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemLocationQuantityType#getHazardousRiskIndicator <em>Hazardous Risk Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemLocationQuantityType#getTradingRestrictions <em>Trading Restrictions</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemLocationQuantityType#getApplicableTerritoryAddress <em>Applicable Territory Address</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemLocationQuantityType#getBasePrice <em>Base Price</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemLocationQuantityType#getDeliveryUnit <em>Delivery Unit</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemLocationQuantityType#getApplicableTaxCategory <em>Applicable Tax Category</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface ItemLocationQuantityType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Lead Time Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item Location Quantity. Lead Time. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The time taken from the time of order to the time of delivery for an Item</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item Location Quantity</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Lead Time</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
	 *               <ccts:Examples>"2 days", "24 hours"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lead Time Measure</em>' containment reference.
	 * @see #setLeadTimeMeasure(LeadTimeMeasureType)
	 */
	LeadTimeMeasureType getLeadTimeMeasure();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemLocationQuantityType#getLeadTimeMeasure <em>Lead Time Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lead Time Measure</em>' containment reference.
	 * @see #getLeadTimeMeasure()
	 */
	void setLeadTimeMeasure(LeadTimeMeasureType value);

	/**
	 * Returns the value of the '<em><b>Minimum Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item Location Quantity. Minimum_ Quantity. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The minimum quantity that can be ordered (to qualify for a specific price)</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item Location Quantity</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Minimum</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *               <ccts:Examples>"10 boxes", "1 carton", "1000 sheets"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Quantity</em>' containment reference.
	 * @see #setMinimumQuantity(MinimumQuantityType)
	 */
	MinimumQuantityType getMinimumQuantity();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemLocationQuantityType#getMinimumQuantity <em>Minimum Quantity</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Item Location Quantity. Maximum_ Quantity. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The maximum quantity that can be ordered (to qualify for a specific price)</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item Location Quantity</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Maximum</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *               <ccts:Examples>"10 boxes", "1 carton", "1000 sheets"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Quantity</em>' containment reference.
	 * @see #setMaximumQuantity(MaximumQuantityType)
	 */
	MaximumQuantityType getMaximumQuantity();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemLocationQuantityType#getMaximumQuantity <em>Maximum Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Quantity</em>' containment reference.
	 * @see #getMaximumQuantity()
	 */
	void setMaximumQuantity(MaximumQuantityType value);

	/**
	 * Returns the value of the '<em><b>Hazardous Risk Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item Location Quantity. Hazardous Risk Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Indicates whether the Item as delivered is hazardous</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item Location Quantity</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemLocationQuantityType#getHazardousRiskIndicator <em>Hazardous Risk Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hazardous Risk Indicator</em>' containment reference.
	 * @see #getHazardousRiskIndicator()
	 */
	void setHazardousRiskIndicator(HazardousRiskIndicatorType value);

	/**
	 * Returns the value of the '<em><b>Trading Restrictions</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cbc.TradingRestrictionsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item Location Quantity. Trading Restrictions. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A description of trade restrictions that apply to the Item or quantities of the Item</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item Location Quantity</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Trading Restrictions</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:Examples>"not for export"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trading Restrictions</em>' containment reference list.
	 */
	List getTradingRestrictions();

	/**
	 * Returns the value of the '<em><b>Applicable Territory Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.AddressType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item Location Quantity. Applicable Territory_ Address. Address</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Territory (Address)</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item Location Quantity</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Applicable Territory</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Address</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Address</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applicable Territory Address</em>' containment reference list.
	 */
	List getApplicableTerritoryAddress();

	/**
	 * Returns the value of the '<em><b>Base Price</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item Location Quantity. Base Price</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Base Price</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item Location Quantity</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Base Price</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Base Price</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Price</em>' containment reference.
	 * @see #setBasePrice(BasePriceType)
	 */
	BasePriceType getBasePrice();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemLocationQuantityType#getBasePrice <em>Base Price</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Price</em>' containment reference.
	 * @see #getBasePrice()
	 */
	void setBasePrice(BasePriceType value);

	/**
	 * Returns the value of the '<em><b>Delivery Unit</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.DeliveryUnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item Location Quantity. Delivery Unit</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Delivery Unit</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item Location Quantity</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Delivery Unit</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Delivery Unit</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delivery Unit</em>' containment reference list.
	 */
	List getDeliveryUnit();

	/**
	 * Returns the value of the '<em><b>Applicable Tax Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.TaxCategoryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item Location Quantity. Applicable_ Tax Category. Tax Category</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Tax Category</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item Location Quantity</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Applicable</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Tax Category</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Tax Category</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applicable Tax Category</em>' containment reference list.
	 */
	List getApplicableTaxCategory();

} // ItemLocationQuantityType