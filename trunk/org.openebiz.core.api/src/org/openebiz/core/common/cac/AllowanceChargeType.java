/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import java.util.List;

import org.openebiz.core.common.cbc.AccountingCostCodeType;
import org.openebiz.core.common.cbc.AmountType;
import org.openebiz.core.common.cbc.BaseAmountType;
import org.openebiz.core.common.cbc.ChargeIndicatorType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.MultiplierFactorNumericType;
import org.openebiz.core.common.cbc.PrepaidIndicatorType;
import org.openebiz.core.common.cbc.ReasonCodeType;
import org.openebiz.core.common.cbc.SequenceNumericType;

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
 */
public interface AllowanceChargeType {
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
	 */
	IDType getID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AllowanceChargeType#getID <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' containment reference.
	 * @see #getID()
	 */
	void setID(IDType value);

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
	 */
	ChargeIndicatorType getChargeIndicator();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AllowanceChargeType#getChargeIndicator <em>Charge Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Indicator</em>' containment reference.
	 * @see #getChargeIndicator()
	 */
	void setChargeIndicator(ChargeIndicatorType value);

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
	 */
	ReasonCodeType getReasonCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AllowanceChargeType#getReasonCode <em>Reason Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason Code</em>' containment reference.
	 * @see #getReasonCode()
	 */
	void setReasonCode(ReasonCodeType value);

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
	 */
	MultiplierFactorNumericType getMultiplierFactorNumeric();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AllowanceChargeType#getMultiplierFactorNumeric <em>Multiplier Factor Numeric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplier Factor Numeric</em>' containment reference.
	 * @see #getMultiplierFactorNumeric()
	 */
	void setMultiplierFactorNumeric(MultiplierFactorNumericType value);

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
	 */
	PrepaidIndicatorType getPrepaidIndicator();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AllowanceChargeType#getPrepaidIndicator <em>Prepaid Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prepaid Indicator</em>' containment reference.
	 * @see #getPrepaidIndicator()
	 */
	void setPrepaidIndicator(PrepaidIndicatorType value);

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
	 */
	SequenceNumericType getSequenceNumeric();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AllowanceChargeType#getSequenceNumeric <em>Sequence Numeric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Numeric</em>' containment reference.
	 * @see #getSequenceNumeric()
	 */
	void setSequenceNumeric(SequenceNumericType value);

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
	 */
	AmountType getAmount();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AllowanceChargeType#getAmount <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' containment reference.
	 * @see #getAmount()
	 */
	void setAmount(AmountType value);

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
	 */
	BaseAmountType getBaseAmount();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AllowanceChargeType#getBaseAmount <em>Base Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Amount</em>' containment reference.
	 * @see #getBaseAmount()
	 */
	void setBaseAmount(BaseAmountType value);

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
	 */
	AccountingCostCodeType getAccountingCostCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AllowanceChargeType#getAccountingCostCode <em>Accounting Cost Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accounting Cost Code</em>' containment reference.
	 * @see #getAccountingCostCode()
	 */
	void setAccountingCostCode(AccountingCostCodeType value);

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
	 */
	List getTaxCategory();

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
	 */
	List getPaymentMeans();

} // AllowanceChargeType