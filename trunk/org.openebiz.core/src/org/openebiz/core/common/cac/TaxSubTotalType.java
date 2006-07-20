/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
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
import java.io.Serializable;

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
 * @generated
 */
public class TaxSubTotalType implements Serializable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Open E-Biz - Darrell Kundel"; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * Basic Entity support code for surrogate id's
	 */
	protected Long internalId = null;

	protected Integer version = null;

	/**
	 * @return Returns the internalId.
	 */
	public Long getInternalId() {
		return this.internalId;
	}

	/**
	 * @param internalId The internalId to set.
	 */
	public void setInternalId(Long internalId) {
		this.internalId = internalId;
	}

	/**
	 * @return Returns the version.
	 */
	public Integer getVersion() {
		return this.version;
	}

	/**
	 * @param version The version to set.
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}

	/**
	 * The cached value of the '{@link #getTaxableAmount() <em>Taxable Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxableAmount()
	 * @generated
	 * @ordered
	 */
	protected TaxableAmountType taxableAmount = null;

	/**
	 * The cached value of the '{@link #getTaxAmount() <em>Tax Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAmount()
	 * @generated
	 * @ordered
	 */
	protected TaxAmountType taxAmount = null;

	/**
	 * The cached value of the '{@link #getCalculationSequenceNumeric() <em>Calculation Sequence Numeric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculationSequenceNumeric()
	 * @generated
	 * @ordered
	 */
	protected CalculationSequenceNumericType calculationSequenceNumeric = null;

	/**
	 * The cached value of the '{@link #getTransactionCurrencyTaxAmount() <em>Transaction Currency Tax Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionCurrencyTaxAmount()
	 * @generated
	 * @ordered
	 */
	protected TransactionCurrencyTaxAmountType transactionCurrencyTaxAmount = null;

	/**
	 * The cached value of the '{@link #getPercent() <em>Percent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercent()
	 * @generated
	 * @ordered
	 */
	protected PercentType percent = null;

	/**
	 * The cached value of the '{@link #getExemptionReason() <em>Exemption Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExemptionReason()
	 * @generated
	 * @ordered
	 */
	protected ExemptionReasonType exemptionReason = null;

	/**
	 * The cached value of the '{@link #getBaseUnitMeasure() <em>Base Unit Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseUnitMeasure()
	 * @generated
	 * @ordered
	 */
	protected BaseUnitMeasureType baseUnitMeasure = null;

	/**
	 * The cached value of the '{@link #getPerUnitAmount() <em>Per Unit Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerUnitAmount()
	 * @generated
	 * @ordered
	 */
	protected PerUnitAmountType perUnitAmount = null;

	/**
	 * The cached value of the '{@link #getTierRange() <em>Tier Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTierRange()
	 * @generated
	 * @ordered
	 */
	protected TierRangeType tierRange = null;

	/**
	 * The cached value of the '{@link #getTierRatePercent() <em>Tier Rate Percent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTierRatePercent()
	 * @generated
	 * @ordered
	 */
	protected TierRatePercentType tierRatePercent = null;

	/**
	 * The cached value of the '{@link #getTaxCategory() <em>Tax Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxCategory()
	 * @generated
	 * @ordered
	 */
	protected TaxCategoryType taxCategory = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public TaxSubTotalType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.taxableAmount = this.getTaxableAmount();
		this.taxAmount = this.getTaxAmount();
		this.calculationSequenceNumeric = this.getCalculationSequenceNumeric();
		this.transactionCurrencyTaxAmount = this.getTransactionCurrencyTaxAmount();
		this.percent = this.getPercent();
		this.exemptionReason = this.getExemptionReason();
		this.baseUnitMeasure = this.getBaseUnitMeasure();
		this.perUnitAmount = this.getPerUnitAmount();
		this.tierRange = this.getTierRange();
		this.tierRatePercent = this.getTierRatePercent();
		this.taxCategory = this.getTaxCategory();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getTaxAmount().getValue().toPlainString());
		return sdisplay.toString();
	}

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
	 * @generated
	 */
	public TaxableAmountType getTaxableAmount() {
		return (taxableAmount == null) ? new TaxableAmountType()
				: taxableAmount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxSubTotalType#getTaxableAmount <em>Taxable Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taxable Amount</em>' containment reference.
	 * @see #getTaxableAmount()
	 * @generated
	 */
	public void setTaxableAmount(TaxableAmountType newTaxableAmount) {
		taxableAmount = newTaxableAmount;
	}

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
	 * @generated
	 */
	public TaxAmountType getTaxAmount() {
		return (taxAmount == null) ? new TaxAmountType() : taxAmount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxSubTotalType#getTaxAmount <em>Tax Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Amount</em>' containment reference.
	 * @see #getTaxAmount()
	 * @generated
	 */
	public void setTaxAmount(TaxAmountType newTaxAmount) {
		taxAmount = newTaxAmount;
	}

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
	 * @generated
	 */
	public CalculationSequenceNumericType getCalculationSequenceNumeric() {
		return (calculationSequenceNumeric == null) ? new CalculationSequenceNumericType()
				: calculationSequenceNumeric;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxSubTotalType#getCalculationSequenceNumeric <em>Calculation Sequence Numeric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculation Sequence Numeric</em>' containment reference.
	 * @see #getCalculationSequenceNumeric()
	 * @generated
	 */
	public void setCalculationSequenceNumeric(
			CalculationSequenceNumericType newCalculationSequenceNumeric) {
		calculationSequenceNumeric = newCalculationSequenceNumeric;
	}

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
	 * @generated
	 */
	public TransactionCurrencyTaxAmountType getTransactionCurrencyTaxAmount() {
		return (transactionCurrencyTaxAmount == null) ? new TransactionCurrencyTaxAmountType()
				: transactionCurrencyTaxAmount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxSubTotalType#getTransactionCurrencyTaxAmount <em>Transaction Currency Tax Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Currency Tax Amount</em>' containment reference.
	 * @see #getTransactionCurrencyTaxAmount()
	 * @generated
	 */
	public void setTransactionCurrencyTaxAmount(
			TransactionCurrencyTaxAmountType newTransactionCurrencyTaxAmount) {
		transactionCurrencyTaxAmount = newTransactionCurrencyTaxAmount;
	}

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
	 * @generated
	 */
	public PercentType getPercent() {
		return (percent == null) ? new PercentType() : percent;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxSubTotalType#getPercent <em>Percent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percent</em>' containment reference.
	 * @see #getPercent()
	 * @generated
	 */
	public void setPercent(PercentType newPercent) {
		percent = newPercent;
	}

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
	 * @generated
	 */
	public ExemptionReasonType getExemptionReason() {
		return (exemptionReason == null) ? new ExemptionReasonType()
				: exemptionReason;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxSubTotalType#getExemptionReason <em>Exemption Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exemption Reason</em>' containment reference.
	 * @see #getExemptionReason()
	 * @generated
	 */
	public void setExemptionReason(ExemptionReasonType newExemptionReason) {
		exemptionReason = newExemptionReason;
	}

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
	 * @generated
	 */
	public BaseUnitMeasureType getBaseUnitMeasure() {
		return (baseUnitMeasure == null) ? new BaseUnitMeasureType()
				: baseUnitMeasure;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxSubTotalType#getBaseUnitMeasure <em>Base Unit Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Unit Measure</em>' containment reference.
	 * @see #getBaseUnitMeasure()
	 * @generated
	 */
	public void setBaseUnitMeasure(BaseUnitMeasureType newBaseUnitMeasure) {
		baseUnitMeasure = newBaseUnitMeasure;
	}

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
	 * @generated
	 */
	public PerUnitAmountType getPerUnitAmount() {
		return (perUnitAmount == null) ? new PerUnitAmountType()
				: perUnitAmount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxSubTotalType#getPerUnitAmount <em>Per Unit Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Per Unit Amount</em>' containment reference.
	 * @see #getPerUnitAmount()
	 * @generated
	 */
	public void setPerUnitAmount(PerUnitAmountType newPerUnitAmount) {
		perUnitAmount = newPerUnitAmount;
	}

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
	 * @generated
	 */
	public TierRangeType getTierRange() {
		return (tierRange == null) ? new TierRangeType() : tierRange;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxSubTotalType#getTierRange <em>Tier Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tier Range</em>' containment reference.
	 * @see #getTierRange()
	 * @generated
	 */
	public void setTierRange(TierRangeType newTierRange) {
		tierRange = newTierRange;
	}

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
	 * @generated
	 */
	public TierRatePercentType getTierRatePercent() {
		return (tierRatePercent == null) ? new TierRatePercentType()
				: tierRatePercent;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxSubTotalType#getTierRatePercent <em>Tier Rate Percent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tier Rate Percent</em>' containment reference.
	 * @see #getTierRatePercent()
	 * @generated
	 */
	public void setTierRatePercent(TierRatePercentType newTierRatePercent) {
		tierRatePercent = newTierRatePercent;
	}

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
	 * @generated
	 */
	public TaxCategoryType getTaxCategory() {
		return (taxCategory == null) ? new TaxCategoryType() : taxCategory;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxSubTotalType#getTaxCategory <em>Tax Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Category</em>' containment reference.
	 * @see #getTaxCategory()
	 * @generated
	 */
	public void setTaxCategory(TaxCategoryType newTaxCategory) {
		taxCategory = newTaxCategory;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.baseUnitMeasure == null) ? 0 : this.baseUnitMeasure.hashCode());
		result = PRIME * result + ((this.calculationSequenceNumeric == null) ? 0 : this.calculationSequenceNumeric.hashCode());
		result = PRIME * result + ((this.exemptionReason == null) ? 0 : this.exemptionReason.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.perUnitAmount == null) ? 0 : this.perUnitAmount.hashCode());
		result = PRIME * result + ((this.percent == null) ? 0 : this.percent.hashCode());
		result = PRIME * result + ((this.taxAmount == null) ? 0 : this.taxAmount.hashCode());
		result = PRIME * result + ((this.taxCategory == null) ? 0 : this.taxCategory.hashCode());
		result = PRIME * result + ((this.taxableAmount == null) ? 0 : this.taxableAmount.hashCode());
		result = PRIME * result + ((this.tierRange == null) ? 0 : this.tierRange.hashCode());
		result = PRIME * result + ((this.tierRatePercent == null) ? 0 : this.tierRatePercent.hashCode());
		result = PRIME * result + ((this.transactionCurrencyTaxAmount == null) ? 0 : this.transactionCurrencyTaxAmount.hashCode());
		result = PRIME * result + ((this.version == null) ? 0 : this.version.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final TaxSubTotalType other = (TaxSubTotalType) obj;
		if (this.baseUnitMeasure == null) {
			if (other.baseUnitMeasure != null)
				return false;
		} else if (!this.baseUnitMeasure.equals(other.baseUnitMeasure))
			return false;
		if (this.calculationSequenceNumeric == null) {
			if (other.calculationSequenceNumeric != null)
				return false;
		} else if (!this.calculationSequenceNumeric.equals(other.calculationSequenceNumeric))
			return false;
		if (this.exemptionReason == null) {
			if (other.exemptionReason != null)
				return false;
		} else if (!this.exemptionReason.equals(other.exemptionReason))
			return false;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.perUnitAmount == null) {
			if (other.perUnitAmount != null)
				return false;
		} else if (!this.perUnitAmount.equals(other.perUnitAmount))
			return false;
		if (this.percent == null) {
			if (other.percent != null)
				return false;
		} else if (!this.percent.equals(other.percent))
			return false;
		if (this.taxAmount == null) {
			if (other.taxAmount != null)
				return false;
		} else if (!this.taxAmount.equals(other.taxAmount))
			return false;
		if (this.taxCategory == null) {
			if (other.taxCategory != null)
				return false;
		} else if (!this.taxCategory.equals(other.taxCategory))
			return false;
		if (this.taxableAmount == null) {
			if (other.taxableAmount != null)
				return false;
		} else if (!this.taxableAmount.equals(other.taxableAmount))
			return false;
		if (this.tierRange == null) {
			if (other.tierRange != null)
				return false;
		} else if (!this.tierRange.equals(other.tierRange))
			return false;
		if (this.tierRatePercent == null) {
			if (other.tierRatePercent != null)
				return false;
		} else if (!this.tierRatePercent.equals(other.tierRatePercent))
			return false;
		if (this.transactionCurrencyTaxAmount == null) {
			if (other.transactionCurrencyTaxAmount != null)
				return false;
		} else if (!this.transactionCurrencyTaxAmount.equals(other.transactionCurrencyTaxAmount))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // TaxSubTotalType