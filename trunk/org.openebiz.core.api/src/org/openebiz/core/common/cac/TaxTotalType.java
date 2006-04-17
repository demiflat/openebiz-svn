/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import java.util.List;

import org.openebiz.core.common.cbc.RoundingAmountType;
import org.openebiz.core.common.cbc.TaxAmountType;
import org.openebiz.core.common.cbc.TaxEvidenceIndicatorType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tax Total Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Tax Total. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about a total amount of a particular type of tax</ccts:Definition>
 *           <ccts:ObjectClass>Tax Total</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.TaxTotalType#getTaxAmount <em>Tax Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TaxTotalType#getRoundingAmount <em>Rounding Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TaxTotalType#getTaxEvidenceIndicator <em>Tax Evidence Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TaxTotalType#getTaxSubTotal <em>Tax Sub Total</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface TaxTotalType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Tax Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Tax Total. Tax Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The total tax amount for a tax type; the sum of each of the Tax Sub Totals for each Tax Category within the Tax Type</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Tax Total</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxTotalType#getTaxAmount <em>Tax Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Amount</em>' containment reference.
	 * @see #getTaxAmount()
	 */
	void setTaxAmount(TaxAmountType value);

	/**
	 * Returns the value of the '<em><b>Rounding Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Tax Total. Rounding Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The rounding amount (positive or negative) added to the calculated tax total to produce the rounded TotalTaxAmount</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Tax Total</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Rounding Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rounding Amount</em>' containment reference.
	 * @see #setRoundingAmount(RoundingAmountType)
	 */
	RoundingAmountType getRoundingAmount();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxTotalType#getRoundingAmount <em>Rounding Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rounding Amount</em>' containment reference.
	 * @see #getRoundingAmount()
	 */
	void setRoundingAmount(RoundingAmountType value);

	/**
	 * Returns the value of the '<em><b>Tax Evidence Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Tax Total. Tax Evidence Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An indicator as to whether these totals are recognized as legal evidence for taxation purposes.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Tax Total</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Tax Evidence Indicator</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *               <ccts:Examples>default is negative</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tax Evidence Indicator</em>' containment reference.
	 * @see #setTaxEvidenceIndicator(TaxEvidenceIndicatorType)
	 */
	TaxEvidenceIndicatorType getTaxEvidenceIndicator();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxTotalType#getTaxEvidenceIndicator <em>Tax Evidence Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Evidence Indicator</em>' containment reference.
	 * @see #getTaxEvidenceIndicator()
	 */
	void setTaxEvidenceIndicator(TaxEvidenceIndicatorType value);

	/**
	 * Returns the value of the '<em><b>Tax Sub Total</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.TaxSubTotalType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Tax Total. Tax Sub Total</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Tax Sub Total</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Tax Total</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Tax Sub Total</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Tax Sub Total</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tax Sub Total</em>' containment reference list.
	 */
	List getTaxSubTotal();

} // TaxTotalType