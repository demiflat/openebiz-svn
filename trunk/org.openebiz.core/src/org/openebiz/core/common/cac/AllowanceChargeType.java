/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.AccountingCostCodeType;
import org.openebiz.core.common.cbc.AmountType;
import org.openebiz.core.common.cbc.BaseAmountType;
import org.openebiz.core.common.cbc.ChargeIndicatorType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.MultiplierFactorNumericType;
import org.openebiz.core.common.cbc.PrepaidIndicatorType;
import org.openebiz.core.common.cbc.ReasonCodeType;
import org.openebiz.core.common.cbc.SequenceNumericType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allowance Charge Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Allowance Charge. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about a charge or discount price component</ccts:Definition>
 *           <ccts:ObjectClass>Allowance Charge</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.AllowanceChargeType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AllowanceChargeType#getChargeIndicator <em>Charge Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AllowanceChargeType#getReasonCode <em>Reason Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AllowanceChargeType#getMultiplierFactorNumeric <em>Multiplier Factor Numeric</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AllowanceChargeType#getPrepaidIndicator <em>Prepaid Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AllowanceChargeType#getSequenceNumeric <em>Sequence Numeric</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AllowanceChargeType#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AllowanceChargeType#getBaseAmount <em>Base Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AllowanceChargeType#getAccountingCostCode <em>Accounting Cost Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AllowanceChargeType#getTaxCategory <em>Tax Category</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AllowanceChargeType#getPaymentMeans <em>Payment Means</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllowanceChargeType implements Serializable {
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
	 * The cached value of the '{@link #getID() <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected IDType iD = null;

	/**
	 * The cached value of the '{@link #getChargeIndicator() <em>Charge Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeIndicator()
	 * @generated
	 * @ordered
	 */
	protected ChargeIndicatorType chargeIndicator = null;

	/**
	 * The cached value of the '{@link #getReasonCode() <em>Reason Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonCode()
	 * @generated
	 * @ordered
	 */
	protected ReasonCodeType reasonCode = null;

	/**
	 * The cached value of the '{@link #getMultiplierFactorNumeric() <em>Multiplier Factor Numeric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplierFactorNumeric()
	 * @generated
	 * @ordered
	 */
	protected MultiplierFactorNumericType multiplierFactorNumeric = null;

	/**
	 * The cached value of the '{@link #getPrepaidIndicator() <em>Prepaid Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrepaidIndicator()
	 * @generated
	 * @ordered
	 */
	protected PrepaidIndicatorType prepaidIndicator = null;

	/**
	 * The cached value of the '{@link #getSequenceNumeric() <em>Sequence Numeric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumeric()
	 * @generated
	 * @ordered
	 */
	protected SequenceNumericType sequenceNumeric = null;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected AmountType amount = null;

	/**
	 * The cached value of the '{@link #getBaseAmount() <em>Base Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseAmount()
	 * @generated
	 * @ordered
	 */
	protected BaseAmountType baseAmount = null;

	/**
	 * The cached value of the '{@link #getAccountingCostCode() <em>Accounting Cost Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountingCostCode()
	 * @generated
	 * @ordered
	 */
	protected AccountingCostCodeType accountingCostCode = null;

	/**
	 * The cached value of the '{@link #getTaxCategory() <em>Tax Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxCategory()
	 * @generated
	 * @ordered
	 */
	protected List taxCategory = null;

	/**
	 * The cached value of the '{@link #getPaymentMeans() <em>Payment Means</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMeans()
	 * @generated
	 * @ordered
	 */
	protected List paymentMeans = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public AllowanceChargeType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.iD = this.getID();
		this.chargeIndicator = this.getChargeIndicator();
		this.reasonCode = this.getReasonCode();
		this.multiplierFactorNumeric = this.getMultiplierFactorNumeric();
		this.prepaidIndicator = this.getPrepaidIndicator();
		this.sequenceNumeric = this.getSequenceNumeric();
		this.amount = this.getAmount();
		this.baseAmount = this.getBaseAmount();
		this.accountingCostCode = this.getAccountingCostCode();
		this.taxCategory = this.getTaxCategory();
		this.paymentMeans = this.getPaymentMeans();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getID().getValue());
		return sdisplay.toString();
	}
	
	/**
	 * Returns the value of the '<em><b>ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Allowance Charge. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the Allowance Charge</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Allowance Charge</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID</em>' containment reference.
	 * @see #setID(IDType)
	 * @generated
	 */
	public IDType getID() {
		return (iD == null) ? new IDType() : iD;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AllowanceChargeType#getID <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' containment reference.
	 * @see #getID()
	 * @generated
	 */
	public void setID(IDType newID) {
		iD = newID;
	}

	/**
	 * Returns the value of the '<em><b>Charge Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Allowance Charge. Charge Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Indicates whether the Allowance Charge is a charge (true) or a discount (false)</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Allowance Charge</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Charge Indicator</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Charge Indicator</em>' containment reference.
	 * @see #setChargeIndicator(ChargeIndicatorType)
	 * @generated
	 */
	public ChargeIndicatorType getChargeIndicator() {
		return (chargeIndicator == null) ? new ChargeIndicatorType()
				: chargeIndicator;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AllowanceChargeType#getChargeIndicator <em>Charge Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Indicator</em>' containment reference.
	 * @see #getChargeIndicator()
	 * @generated
	 */
	public void setChargeIndicator(ChargeIndicatorType newChargeIndicator) {
		chargeIndicator = newChargeIndicator;
	}

	/**
	 * Returns the value of the '<em><b>Reason Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Allowance Charge. Reason. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The reason for the Allowance Charge expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Allowance Charge</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Reason</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason Code</em>' containment reference.
	 * @see #setReasonCode(ReasonCodeType)
	 * @generated
	 */
	public ReasonCodeType getReasonCode() {
		return (reasonCode == null) ? new ReasonCodeType() : reasonCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AllowanceChargeType#getReasonCode <em>Reason Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason Code</em>' containment reference.
	 * @see #getReasonCode()
	 * @generated
	 */
	public void setReasonCode(ReasonCodeType newReasonCode) {
		reasonCode = newReasonCode;
	}

	/**
	 * Returns the value of the '<em><b>Multiplier Factor Numeric</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Allowance Charge. Multiplier Factor. Numeric</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The factor applied to the Base Amount to calculate the Allowance Charge</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Allowance Charge</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Multiplier Factor</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Numeric</ccts:RepresentationTerm>
	 *               <ccts:DataType>Numeric. Type</ccts:DataType>
	 *               <ccts:Examples>0.20</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multiplier Factor Numeric</em>' containment reference.
	 * @see #setMultiplierFactorNumeric(MultiplierFactorNumericType)
	 * @generated
	 */
	public MultiplierFactorNumericType getMultiplierFactorNumeric() {
		return (multiplierFactorNumeric == null) ? new MultiplierFactorNumericType()
				: multiplierFactorNumeric;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AllowanceChargeType#getMultiplierFactorNumeric <em>Multiplier Factor Numeric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplier Factor Numeric</em>' containment reference.
	 * @see #getMultiplierFactorNumeric()
	 * @generated
	 */
	public void setMultiplierFactorNumeric(
			MultiplierFactorNumericType newMultiplierFactorNumeric) {
		multiplierFactorNumeric = newMultiplierFactorNumeric;
	}

	/**
	 * Returns the value of the '<em><b>Prepaid Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Allowance Charge. Prepaid Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Indicates whether the Allowance Charge is prepaid (true) or not (false)</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Allowance Charge</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Prepaid Indicator</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prepaid Indicator</em>' containment reference.
	 * @see #setPrepaidIndicator(PrepaidIndicatorType)
	 * @generated
	 */
	public PrepaidIndicatorType getPrepaidIndicator() {
		return (prepaidIndicator == null) ? new PrepaidIndicatorType()
				: prepaidIndicator;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AllowanceChargeType#getPrepaidIndicator <em>Prepaid Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prepaid Indicator</em>' containment reference.
	 * @see #getPrepaidIndicator()
	 * @generated
	 */
	public void setPrepaidIndicator(PrepaidIndicatorType newPrepaidIndicator) {
		prepaidIndicator = newPrepaidIndicator;
	}

	/**
	 * Returns the value of the '<em><b>Sequence Numeric</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Allowance Charge. Sequence. Numeric</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Identifies the numerical order sequence in which Allowance Charges are calculated when multiple Allowance Charges apply.  If all Allowance Charges apply to the same Base Amount, SequenceNumeric will be ‘1’ for all Allowance Charges</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Allowance Charge</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Sequence</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Numeric</ccts:RepresentationTerm>
	 *               <ccts:DataType>Numeric. Type</ccts:DataType>
	 *               <ccts:Examples>1, 2, 3, 4, etc.</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence Numeric</em>' containment reference.
	 * @see #setSequenceNumeric(SequenceNumericType)
	 * @generated
	 */
	public SequenceNumericType getSequenceNumeric() {
		return (sequenceNumeric == null) ? new SequenceNumericType()
				: sequenceNumeric;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AllowanceChargeType#getSequenceNumeric <em>Sequence Numeric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Numeric</em>' containment reference.
	 * @see #getSequenceNumeric()
	 * @generated
	 */
	public void setSequenceNumeric(SequenceNumericType newSequenceNumeric) {
		sequenceNumeric = newSequenceNumeric;
	}

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Allowance Charge. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The Allowance Charge amount</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Allowance Charge</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *               <ccts:Examples>35,23</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount</em>' containment reference.
	 * @see #setAmount(AmountType)
	 * @generated
	 */
	public AmountType getAmount() {
		return (amount == null) ? new AmountType() : amount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AllowanceChargeType#getAmount <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' containment reference.
	 * @see #getAmount()
	 * @generated
	 */
	public void setAmount(AmountType newAmount) {
		amount = newAmount;
	}

	/**
	 * Returns the value of the '<em><b>Base Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Allowance Charge. Base_ Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The amount to which the MultiplierFactorNumeric is applied to calculate the Allowance Charge</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Allowance Charge</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Base</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Amount</em>' containment reference.
	 * @see #setBaseAmount(BaseAmountType)
	 * @generated
	 */
	public BaseAmountType getBaseAmount() {
		return (baseAmount == null) ? new BaseAmountType() : baseAmount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AllowanceChargeType#getBaseAmount <em>Base Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Amount</em>' containment reference.
	 * @see #getBaseAmount()
	 * @generated
	 */
	public void setBaseAmount(BaseAmountType newBaseAmount) {
		baseAmount = newBaseAmount;
	}

	/**
	 * Returns the value of the '<em><b>Accounting Cost Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Allowance Charge. Accounting_ Cost Code. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The Buyer's accounting code applied to the Allowance Charge</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Allowance Charge</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Accounting</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Cost Code</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accounting Cost Code</em>' containment reference.
	 * @see #setAccountingCostCode(AccountingCostCodeType)
	 * @generated
	 */
	public AccountingCostCodeType getAccountingCostCode() {
		return (accountingCostCode == null) ? new AccountingCostCodeType()
				: accountingCostCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AllowanceChargeType#getAccountingCostCode <em>Accounting Cost Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accounting Cost Code</em>' containment reference.
	 * @see #getAccountingCostCode()
	 * @generated
	 */
	public void setAccountingCostCode(
			AccountingCostCodeType newAccountingCostCode) {
		accountingCostCode = newAccountingCostCode;
	}

	/**
	 * Returns the value of the '<em><b>Tax Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.TaxCategoryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Allowance Charge. Tax Category</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Tax Category</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Allowance Charge</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Tax Category</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Tax Category</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tax Category</em>' containment reference list.
	 * @generated
	 */
	public List getTaxCategory() {
		if (taxCategory == null) {
			taxCategory = new ArrayList<TaxCategoryType>();
		}
		return taxCategory;
	}

	/**
	 * Returns the value of the '<em><b>Payment Means</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.PaymentMeansType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Allowance Charge. Payment Means</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Payment Means</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Allowance Charge</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Payment Means</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Payment Means</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Means</em>' containment reference list.
	 * @generated
	 */
	public List getPaymentMeans() {
		if (paymentMeans == null) {
			paymentMeans = new ArrayList<PaymentMeansType>();
		}
		return paymentMeans;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.accountingCostCode == null) ? 0 : this.accountingCostCode.hashCode());
		result = PRIME * result + ((this.amount == null) ? 0 : this.amount.hashCode());
		result = PRIME * result + ((this.baseAmount == null) ? 0 : this.baseAmount.hashCode());
		result = PRIME * result + ((this.chargeIndicator == null) ? 0 : this.chargeIndicator.hashCode());
		result = PRIME * result + ((this.iD == null) ? 0 : this.iD.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.multiplierFactorNumeric == null) ? 0 : this.multiplierFactorNumeric.hashCode());
		result = PRIME * result + ((this.paymentMeans == null) ? 0 : this.paymentMeans.hashCode());
		result = PRIME * result + ((this.prepaidIndicator == null) ? 0 : this.prepaidIndicator.hashCode());
		result = PRIME * result + ((this.reasonCode == null) ? 0 : this.reasonCode.hashCode());
		result = PRIME * result + ((this.sequenceNumeric == null) ? 0 : this.sequenceNumeric.hashCode());
		result = PRIME * result + ((this.taxCategory == null) ? 0 : this.taxCategory.hashCode());
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
		final AllowanceChargeType other = (AllowanceChargeType) obj;
		if (this.accountingCostCode == null) {
			if (other.accountingCostCode != null)
				return false;
		} else if (!this.accountingCostCode.equals(other.accountingCostCode))
			return false;
		if (this.amount == null) {
			if (other.amount != null)
				return false;
		} else if (!this.amount.equals(other.amount))
			return false;
		if (this.baseAmount == null) {
			if (other.baseAmount != null)
				return false;
		} else if (!this.baseAmount.equals(other.baseAmount))
			return false;
		if (this.chargeIndicator == null) {
			if (other.chargeIndicator != null)
				return false;
		} else if (!this.chargeIndicator.equals(other.chargeIndicator))
			return false;
		if (this.iD == null) {
			if (other.iD != null)
				return false;
		} else if (!this.iD.equals(other.iD))
			return false;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.multiplierFactorNumeric == null) {
			if (other.multiplierFactorNumeric != null)
				return false;
		} else if (!this.multiplierFactorNumeric.equals(other.multiplierFactorNumeric))
			return false;
		if (this.paymentMeans == null) {
			if (other.paymentMeans != null)
				return false;
		} else if (!this.paymentMeans.equals(other.paymentMeans))
			return false;
		if (this.prepaidIndicator == null) {
			if (other.prepaidIndicator != null)
				return false;
		} else if (!this.prepaidIndicator.equals(other.prepaidIndicator))
			return false;
		if (this.reasonCode == null) {
			if (other.reasonCode != null)
				return false;
		} else if (!this.reasonCode.equals(other.reasonCode))
			return false;
		if (this.sequenceNumeric == null) {
			if (other.sequenceNumeric != null)
				return false;
		} else if (!this.sequenceNumeric.equals(other.sequenceNumeric))
			return false;
		if (this.taxCategory == null) {
			if (other.taxCategory != null)
				return false;
		} else if (!this.taxCategory.equals(other.taxCategory))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // AllowanceChargeType