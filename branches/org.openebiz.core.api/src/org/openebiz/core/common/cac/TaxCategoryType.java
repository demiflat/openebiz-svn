/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.BaseUnitMeasureType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.NameType;
import org.openebiz.core.common.cbc.PerUnitAmountType;
import org.openebiz.core.common.cbc.PercentType;
import org.openebiz.core.common.cbc.TierRangeType;
import org.openebiz.core.common.cbc.TierRatePercentType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tax Category Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Tax Category. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information anout a Tax Category</ccts:Definition>
 *           <ccts:ObjectClass>Tax Category</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.TaxCategoryType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TaxCategoryType#getName <em>Name</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TaxCategoryType#getPercent <em>Percent</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TaxCategoryType#getBaseUnitMeasure <em>Base Unit Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TaxCategoryType#getPerUnitAmount <em>Per Unit Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TaxCategoryType#getTierRange <em>Tier Range</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TaxCategoryType#getTierRatePercent <em>Tier Rate Percent</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TaxCategoryType#getTaxScheme <em>Tax Scheme</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface TaxCategoryType {
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
	 *               <ccts:DictionaryEntryName>Tax Category. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the Tax Category</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Tax Category</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:Examples>"ZeroRatedGoods" "NotTaxable" "Standard Rate"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID</em>' containment reference.
	 * @see #setID(IDType)
	 */
	IDType getID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxCategoryType#getID <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' containment reference.
	 * @see #getID()
	 */
	void setID(IDType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Tax Category. Name</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The name of the Tax Category</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Tax Category</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Name</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Name</ccts:RepresentationTerm>
	 *               <ccts:DataType>Name. Type</ccts:DataType>
	 *               <ccts:Examples>"Luxury Goods","Wine Equalization", "Exempt"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(NameType)
	 */
	NameType getName();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxCategoryType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 */
	void setName(NameType value);

	/**
	 * Returns the value of the '<em><b>Percent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Tax Category. Percent</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The Tax Rate for the category expressed as a percentage</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Tax Category</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Percent</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Percent</ccts:RepresentationTerm>
	 *               <ccts:DataType>Percent. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Percent</em>' containment reference.
	 * @see #setPercent(PercentType)
	 */
	PercentType getPercent();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxCategoryType#getPercent <em>Percent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percent</em>' containment reference.
	 * @see #getPercent()
	 */
	void setPercent(PercentType value);

	/**
	 * Returns the value of the '<em><b>Base Unit Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Tax Category. Base Unit Measure. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Where a tax is applied at a certain rate per unit, the measure of units on which the tax calculation is based</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Tax Category</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Base Unit Measure</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Unit Measure</em>' containment reference.
	 * @see #setBaseUnitMeasure(BaseUnitMeasureType)
	 */
	BaseUnitMeasureType getBaseUnitMeasure();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxCategoryType#getBaseUnitMeasure <em>Base Unit Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Unit Measure</em>' containment reference.
	 * @see #getBaseUnitMeasure()
	 */
	void setBaseUnitMeasure(BaseUnitMeasureType value);

	/**
	 * Returns the value of the '<em><b>Per Unit Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Tax Category. Per Unit Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Where a tax is applied at a certain rate per unit, the rate per unit applied</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Tax Category</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Per Unit Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Per Unit Amount</em>' containment reference.
	 * @see #setPerUnitAmount(PerUnitAmountType)
	 */
	PerUnitAmountType getPerUnitAmount();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxCategoryType#getPerUnitAmount <em>Per Unit Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Per Unit Amount</em>' containment reference.
	 * @see #getPerUnitAmount()
	 */
	void setPerUnitAmount(PerUnitAmountType value);

	/**
	 * Returns the value of the '<em><b>Tier Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Tax Category. Tier Range. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Where a tax is tiered, the range of tiers applied in the calculation of the Tax Sub Total for the Tax Category</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Tax Category</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Tier Range</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tier Range</em>' containment reference.
	 * @see #setTierRange(TierRangeType)
	 */
	TierRangeType getTierRange();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxCategoryType#getTierRange <em>Tier Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tier Range</em>' containment reference.
	 * @see #getTierRange()
	 */
	void setTierRange(TierRangeType value);

	/**
	 * Returns the value of the '<em><b>Tier Rate Percent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Tax Category. Tier Rate. Percent</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Where a tax is tiered, the rate of tax applied to the range of tiers in the calculation of the Tax Sub Total for the Tax Category</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Tax Category</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Tier Rate</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Percent</ccts:RepresentationTerm>
	 *               <ccts:DataType>Percent. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tier Rate Percent</em>' containment reference.
	 * @see #setTierRatePercent(TierRatePercentType)
	 */
	TierRatePercentType getTierRatePercent();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxCategoryType#getTierRatePercent <em>Tier Rate Percent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tier Rate Percent</em>' containment reference.
	 * @see #getTierRatePercent()
	 */
	void setTierRatePercent(TierRatePercentType value);

	/**
	 * Returns the value of the '<em><b>Tax Scheme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Tax Category. Tax Scheme</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Tax Scheme</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Tax Category</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Tax Scheme</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Tax Scheme</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tax Scheme</em>' containment reference.
	 * @see #setTaxScheme(TaxSchemeType)
	 */
	TaxSchemeType getTaxScheme();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxCategoryType#getTaxScheme <em>Tax Scheme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Scheme</em>' containment reference.
	 * @see #getTaxScheme()
	 */
	void setTaxScheme(TaxSchemeType value);

} // TaxCategoryType