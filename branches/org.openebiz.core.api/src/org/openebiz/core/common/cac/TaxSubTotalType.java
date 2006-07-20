/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.BaseUnitMeasureType;
import org.openebiz.core.common.cbc.CalculationSequenceNumericType;
import org.openebiz.core.common.cbc.ExemptionReasonType;
import org.openebiz.core.common.cbc.PerUnitAmountType;
import org.openebiz.core.common.cbc.PercentType;
import org.openebiz.core.common.cbc.TaxAmountType;
import org.openebiz.core.common.cbc.TaxableAmountType;
import org.openebiz.core.common.cbc.TierRangeType;
import org.openebiz.core.common.cbc.TierRatePercentType;
import org.openebiz.core.common.cbc.TransactionCurrencyTaxAmountType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tax Sub Total Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Tax Sub Total. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about the subtotal for a particular Tax Category within a Tax Type such as Standard Rate within VAT</ccts:Definition>
 *           <ccts:ObjectClass>Tax Sub Total</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.TaxSubTotalType#getTaxableAmount <em>Taxable Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TaxSubTotalType#getTaxAmount <em>Tax Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TaxSubTotalType#getCalculationSequenceNumeric <em>Calculation Sequence Numeric</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TaxSubTotalType#getTransactionCurrencyTaxAmount <em>Transaction Currency Tax Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TaxSubTotalType#getPercent <em>Percent</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TaxSubTotalType#getExemptionReason <em>Exemption Reason</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TaxSubTotalType#getBaseUnitMeasure <em>Base Unit Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TaxSubTotalType#getPerUnitAmount <em>Per Unit Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TaxSubTotalType#getTierRange <em>Tier Range</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TaxSubTotalType#getTierRatePercent <em>Tier Rate Percent</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TaxSubTotalType#getTaxCategory <em>Tax Category</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface TaxSubTotalType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Taxable Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Tax Sub Total. Taxable Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The net amount to which theTax Percent (rate) is applied to calculate the Tax Amount</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Tax Sub Total</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Taxable Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Taxable Amount</em>' containment reference.
	 * @see #setTaxableAmount(TaxableAmountType)
	 */
	TaxableAmountType getTaxableAmount();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxSubTotalType#getTaxableAmount <em>Taxable Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taxable Amount</em>' containment reference.
	 * @see #getTaxableAmount()
	 */
	void setTaxableAmount(TaxableAmountType value);

	/**
	 * Returns the value of the '<em><b>Tax Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Tax Sub Total. Tax Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The amount of tax stated explicitly</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Tax Sub Total</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Tax Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tax Amount</em>' containment reference.
	 * @see #setTaxAmount(TaxAmountType)
	 */
	TaxAmountType getTaxAmount();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxSubTotalType#getTaxAmount <em>Tax Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Amount</em>' containment reference.
	 * @see #getTaxAmount()
	 */
	void setTaxAmount(TaxAmountType value);

	/**
	 * Returns the value of the '<em><b>Calculation Sequence Numeric</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Tax Sub Total. Calculation Sequence. Numeric</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Identifies the numerical order sequence in which taxes are applied when multiple taxes are attracted.  If all taxes apply to the same Taxable Amount, CalculationSequenceNumeric will be ‘1’ for all taxes</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Tax Sub Total</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Calculation Sequence</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Numeric</ccts:RepresentationTerm>
	 *               <ccts:DataType>Numeric. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Calculation Sequence Numeric</em>' containment reference.
	 * @see #setCalculationSequenceNumeric(CalculationSequenceNumericType)
	 */
	CalculationSequenceNumericType getCalculationSequenceNumeric();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxSubTotalType#getCalculationSequenceNumeric <em>Calculation Sequence Numeric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculation Sequence Numeric</em>' containment reference.
	 * @see #getCalculationSequenceNumeric()
	 */
	void setCalculationSequenceNumeric(CalculationSequenceNumericType value);

	/**
	 * Returns the value of the '<em><b>Transaction Currency Tax Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Tax Sub Total. Transaction Currency_ Tax Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The tax amount expressed in the currency used for invoicing</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Tax Sub Total</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Transaction Currency</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Tax Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transaction Currency Tax Amount</em>' containment reference.
	 * @see #setTransactionCurrencyTaxAmount(TransactionCurrencyTaxAmountType)
	 */
	TransactionCurrencyTaxAmountType getTransactionCurrencyTaxAmount();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxSubTotalType#getTransactionCurrencyTaxAmount <em>Transaction Currency Tax Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Currency Tax Amount</em>' containment reference.
	 * @see #getTransactionCurrencyTaxAmount()
	 */
	void setTransactionCurrencyTaxAmount(TransactionCurrencyTaxAmountType value);

	/**
	 * Returns the value of the '<em><b>Percent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Tax Sub Total. Percent</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The Tax Rate for the category expressed as a percentage</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Tax Sub Total</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxSubTotalType#getPercent <em>Percent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percent</em>' containment reference.
	 * @see #getPercent()
	 */
	void setPercent(PercentType value);

	/**
	 * Returns the value of the '<em><b>Exemption Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Tax Sub Total. Exemption_ Reason. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 * 
	 *               <ccts:Definition>The reason for tax being exempted</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Tax Sub Total</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Exemption</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Reason</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exemption Reason</em>' containment reference.
	 * @see #setExemptionReason(ExemptionReasonType)
	 */
	ExemptionReasonType getExemptionReason();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxSubTotalType#getExemptionReason <em>Exemption Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exemption Reason</em>' containment reference.
	 * @see #getExemptionReason()
	 */
	void setExemptionReason(ExemptionReasonType value);

	/**
	 * Returns the value of the '<em><b>Base Unit Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Tax Sub Total. Base Unit Measure. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Where a tax is applied at a certain rate per unit, the measure of units on which the tax calculation is based</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Tax Sub Total</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxSubTotalType#getBaseUnitMeasure <em>Base Unit Measure</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Tax Sub Total. Per Unit Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Where a tax is applied at a certain rate per unit, the rate per unit applied</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Tax Sub Total</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxSubTotalType#getPerUnitAmount <em>Per Unit Amount</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Tax Sub Total. Tier Range. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Where a tax is tiered, the range of tiers applied in the calculation of the Tax Sub Total for the Tax Category</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Tax Sub Total</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxSubTotalType#getTierRange <em>Tier Range</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Tax Sub Total. Tier Rate. Percent</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Where a tax is tiered, the rate of tax applied to the range of tiers in the calculation of the Tax Sub Total for the Tax Category</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Tax Sub Total</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxSubTotalType#getTierRatePercent <em>Tier Rate Percent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tier Rate Percent</em>' containment reference.
	 * @see #getTierRatePercent()
	 */
	void setTierRatePercent(TierRatePercentType value);

	/**
	 * Returns the value of the '<em><b>Tax Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Tax Sub Total. Tax Category</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Tax Category</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Tax Sub Total</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Tax Category</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Tax Category</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tax Category</em>' containment reference.
	 * @see #setTaxCategory(TaxCategoryType)
	 */
	TaxCategoryType getTaxCategory();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxSubTotalType#getTaxCategory <em>Tax Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Category</em>' containment reference.
	 * @see #getTaxCategory()
	 */
	void setTaxCategory(TaxCategoryType value);

} // TaxSubTotalType