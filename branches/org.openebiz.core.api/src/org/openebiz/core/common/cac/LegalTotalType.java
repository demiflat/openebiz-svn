/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.LineExtensionAmountType;
import org.openebiz.core.common.cbc.LineExtensionRoundingAmountType;
import org.openebiz.core.common.cbc.PrepaidAmountType;
import org.openebiz.core.common.cbc.TaxExclusiveAmountType;
import org.openebiz.core.common.cbc.TaxInclusiveAmountType;
import org.openebiz.core.common.cbc.ToBePaidAmountType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legal Total Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Legal Total. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about Legal Totals (as opposed to Tax Totals)</ccts:Definition>
 *           <ccts:ObjectClass>Legal Total</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.LegalTotalType#getLineExtensionAmount <em>Line Extension Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LegalTotalType#getTaxExclusiveAmount <em>Tax Exclusive Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LegalTotalType#getTaxInclusiveAmount <em>Tax Inclusive Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LegalTotalType#getPrepaidAmount <em>Prepaid Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LegalTotalType#getLineExtensionRoundingAmount <em>Line Extension Rounding Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LegalTotalType#getToBePaidAmount <em>To Be Paid Amount</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface LegalTotalType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Line Extension Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Legal Total. Line Extension Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The total of Line Extention Amounts net of tax and settlement discounts, but inclusive of any applicable rounding amount</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Legal Total</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Line Extension Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Extension Amount</em>' containment reference.
	 * @see #setLineExtensionAmount(LineExtensionAmountType)
	 */
	LineExtensionAmountType getLineExtensionAmount();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LegalTotalType#getLineExtensionAmount <em>Line Extension Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Extension Amount</em>' containment reference.
	 * @see #getLineExtensionAmount()
	 */
	void setLineExtensionAmount(LineExtensionAmountType value);

	/**
	 * Returns the value of the '<em><b>Tax Exclusive Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Legal Total. Tax Exclusive Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The total amount exclusive of texes</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Legal Total</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Tax Exclusive Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tax Exclusive Amount</em>' containment reference.
	 * @see #setTaxExclusiveAmount(TaxExclusiveAmountType)
	 */
	TaxExclusiveAmountType getTaxExclusiveAmount();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LegalTotalType#getTaxExclusiveAmount <em>Tax Exclusive Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Exclusive Amount</em>' containment reference.
	 * @see #getTaxExclusiveAmount()
	 */
	void setTaxExclusiveAmount(TaxExclusiveAmountType value);

	/**
	 * Returns the value of the '<em><b>Tax Inclusive Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Legal Total. Tax Inclusive Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The total amount inclusive of taxes</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Legal Total</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Tax Inclusive Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tax Inclusive Amount</em>' containment reference.
	 * @see #setTaxInclusiveAmount(TaxInclusiveAmountType)
	 */
	TaxInclusiveAmountType getTaxInclusiveAmount();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LegalTotalType#getTaxInclusiveAmount <em>Tax Inclusive Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Inclusive Amount</em>' containment reference.
	 * @see #getTaxInclusiveAmount()
	 */
	void setTaxInclusiveAmount(TaxInclusiveAmountType value);

	/**
	 * Returns the value of the '<em><b>Prepaid Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Legal Total. Prepaid Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The total prepaid amount</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Legal Total</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Prepaid Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prepaid Amount</em>' containment reference.
	 * @see #setPrepaidAmount(PrepaidAmountType)
	 */
	PrepaidAmountType getPrepaidAmount();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LegalTotalType#getPrepaidAmount <em>Prepaid Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prepaid Amount</em>' containment reference.
	 * @see #getPrepaidAmount()
	 */
	void setPrepaidAmount(PrepaidAmountType value);

	/**
	 * Returns the value of the '<em><b>Line Extension Rounding Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Legal Total. Line Extension_ Rounding Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The rounding amount (positive or negative) added to the calculated Line Extention Total Amount to produce the rounded Line Extention Total Amount</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Legal Total</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Line Extension</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Rounding Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Extension Rounding Amount</em>' containment reference.
	 * @see #setLineExtensionRoundingAmount(LineExtensionRoundingAmountType)
	 */
	LineExtensionRoundingAmountType getLineExtensionRoundingAmount();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LegalTotalType#getLineExtensionRoundingAmount <em>Line Extension Rounding Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Extension Rounding Amount</em>' containment reference.
	 * @see #getLineExtensionRoundingAmount()
	 */
	void setLineExtensionRoundingAmount(LineExtensionRoundingAmountType value);

	/**
	 * Returns the value of the '<em><b>To Be Paid Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Legal Total. To Be Paid Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The total amount to be paid</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Legal Total</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>To Be Paid Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Be Paid Amount</em>' containment reference.
	 * @see #setToBePaidAmount(ToBePaidAmountType)
	 */
	ToBePaidAmountType getToBePaidAmount();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LegalTotalType#getToBePaidAmount <em>To Be Paid Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Be Paid Amount</em>' containment reference.
	 * @see #getToBePaidAmount()
	 */
	void setToBePaidAmount(ToBePaidAmountType value);

} // LegalTotalType