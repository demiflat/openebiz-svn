/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import java.util.List;

import org.openebiz.core.common.cbc.BaseQuantityType;
import org.openebiz.core.common.cbc.OrderableUnitFactorRateType;
import org.openebiz.core.common.cbc.PriceAmountType;
import org.openebiz.core.common.cbc.PriceTypeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Price Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Base Price. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about the price of an item of goods or service net of all taxes, charges and discounts</ccts:Definition>
 *           <ccts:ObjectClass>Base Price</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.BasePriceType#getPriceAmount <em>Price Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.BasePriceType#getBaseQuantity <em>Base Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.BasePriceType#getPriceChangeReason <em>Price Change Reason</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.BasePriceType#getPriceType <em>Price Type</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.BasePriceType#getOrderableUnitFactorRate <em>Orderable Unit Factor Rate</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.BasePriceType#getValidityPeriod <em>Validity Period</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.BasePriceType#getPriceList <em>Price List</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.BasePriceType#getAllowanceCharge <em>Allowance Charge</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface BasePriceType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Price Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Base Price. Price Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The Base Price amount</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Base Price</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Price Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>unit price</ccts:AlternativeBusinessTerms>
	 *               <ccts:Examples>23.45</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Price Amount</em>' containment reference.
	 * @see #setPriceAmount(PriceAmountType)
	 */
	PriceAmountType getPriceAmount();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.BasePriceType#getPriceAmount <em>Price Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price Amount</em>' containment reference.
	 * @see #getPriceAmount()
	 */
	void setPriceAmount(PriceAmountType value);

	/**
	 * Returns the value of the '<em><b>Base Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Base Price. Base_ Quantity. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The actual quantity to which the Base Price applies</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Base Price</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Base</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Quantity</em>' containment reference.
	 * @see #setBaseQuantity(BaseQuantityType)
	 */
	BaseQuantityType getBaseQuantity();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.BasePriceType#getBaseQuantity <em>Base Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Quantity</em>' containment reference.
	 * @see #getBaseQuantity()
	 */
	void setBaseQuantity(BaseQuantityType value);

	/**
	 * Returns the value of the '<em><b>Price Change Reason</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cbc.PriceChangeReasonType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Base Price. Price Change Reason. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The reason for the Price expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Base Price</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Price Change Reason</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:Examples>"Clearance of old stock", "New contract applies"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Price Change Reason</em>' containment reference list.
	 */
	List getPriceChangeReason();

	/**
	 * Returns the value of the '<em><b>Price Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Base Price. Price Type. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The Price type</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Base Price</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Price Type</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:Examples>retail, wholesale, discount, contract</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Price Type</em>' containment reference.
	 * @see #setPriceType(PriceTypeType)
	 */
	PriceTypeType getPriceType();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.BasePriceType#getPriceType <em>Price Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price Type</em>' containment reference.
	 * @see #getPriceType()
	 */
	void setPriceType(PriceTypeType value);

	/**
	 * Returns the value of the '<em><b>Orderable Unit Factor Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Base Price. Orderable Unit Factor. Rate</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The factor by which the base price unit can be converted to the orderable unit</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Base Price</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Orderable Unit Factor</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Rate</ccts:RepresentationTerm>
	 *               <ccts:DataType>Rate. Type</ccts:DataType>
	 *               <ccts:Examples>Nails are priced by weight but ordered by quantity.  So this would say how many nails per kilo</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Orderable Unit Factor Rate</em>' containment reference.
	 * @see #setOrderableUnitFactorRate(OrderableUnitFactorRateType)
	 */
	OrderableUnitFactorRateType getOrderableUnitFactorRate();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.BasePriceType#getOrderableUnitFactorRate <em>Orderable Unit Factor Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orderable Unit Factor Rate</em>' containment reference.
	 * @see #getOrderableUnitFactorRate()
	 */
	void setOrderableUnitFactorRate(OrderableUnitFactorRateType value);

	/**
	 * Returns the value of the '<em><b>Validity Period</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.PeriodType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Base Price. Validity_ Period. Period</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Validity Period</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Base Price</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Validity</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Period</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Period</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validity Period</em>' containment reference list.
	 */
	List getValidityPeriod();

	/**
	 * Returns the value of the '<em><b>Price List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Base Price. Price List</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Price List</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Base Price</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Price List</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Price List</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Price List</em>' containment reference.
	 * @see #setPriceList(PriceListType)
	 */
	PriceListType getPriceList();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.BasePriceType#getPriceList <em>Price List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price List</em>' containment reference.
	 * @see #getPriceList()
	 */
	void setPriceList(PriceListType value);

	/**
	 * Returns the value of the '<em><b>Allowance Charge</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.AllowanceChargeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Base Price. Allowance Charge</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Allowance Charge</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Base Price</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Allowance Charge</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Allowance Charge</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allowance Charge</em>' containment reference list.
	 */
	List getAllowanceCharge();

} // BasePriceType