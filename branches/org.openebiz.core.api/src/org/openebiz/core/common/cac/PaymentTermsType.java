/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.AmountType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.NoteType;
import org.openebiz.core.common.cbc.PenaltySurchargePercentType;
import org.openebiz.core.common.cbc.ReferenceEventCodeType;
import org.openebiz.core.common.cbc.SettlementDiscountPercentType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Terms Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Payment Terms. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about Payment Terms</ccts:Definition>
 *           <ccts:ObjectClass>Payment Terms</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.PaymentTermsType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PaymentTermsType#getNote <em>Note</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PaymentTermsType#getReferenceEventCode <em>Reference Event Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PaymentTermsType#getSettlementDiscountPercent <em>Settlement Discount Percent</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PaymentTermsType#getPenaltySurchargePercent <em>Penalty Surcharge Percent</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PaymentTermsType#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PaymentTermsType#getSettlementPeriod <em>Settlement Period</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PaymentTermsType#getPenaltyPeriod <em>Penalty Period</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PaymentTermsType#getPaymentMeans <em>Payment Means</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface PaymentTermsType {
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
	 *               <ccts:DictionaryEntryName>Payment Terms. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the Payment Terms</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment Terms</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentTermsType#getID <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' containment reference.
	 * @see #getID()
	 */
	void setID(IDType value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment Terms. Note. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Free form text applying to the Payment Terms. This element may contain notes or any other similar information that is not contained explicitly in another structure.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment Terms</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Note</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference.
	 * @see #setNote(NoteType)
	 */
	NoteType getNote();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentTermsType#getNote <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' containment reference.
	 * @see #getNote()
	 */
	void setNote(NoteType value);

	/**
	 * Returns the value of the '<em><b>Reference Event Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment Terms. Reference_ Event. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the event from which terms are offered for a length of time, identified by a standard code.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment Terms</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Reference</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Event</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Event Code</em>' containment reference.
	 * @see #setReferenceEventCode(ReferenceEventCodeType)
	 */
	ReferenceEventCodeType getReferenceEventCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentTermsType#getReferenceEventCode <em>Reference Event Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Event Code</em>' containment reference.
	 * @see #getReferenceEventCode()
	 */
	void setReferenceEventCode(ReferenceEventCodeType value);

	/**
	 * Returns the value of the '<em><b>Settlement Discount Percent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment Terms. Settlement_ Discount Percent. Percent</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The settlement discount rate (percentage) offered for payment within the settlement period</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment Terms</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Settlement</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Discount Percent</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Percent</ccts:RepresentationTerm>
	 *               <ccts:DataType>Percent. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Settlement Discount Percent</em>' containment reference.
	 * @see #setSettlementDiscountPercent(SettlementDiscountPercentType)
	 */
	SettlementDiscountPercentType getSettlementDiscountPercent();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentTermsType#getSettlementDiscountPercent <em>Settlement Discount Percent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Settlement Discount Percent</em>' containment reference.
	 * @see #getSettlementDiscountPercent()
	 */
	void setSettlementDiscountPercent(SettlementDiscountPercentType value);

	/**
	 * Returns the value of the '<em><b>Penalty Surcharge Percent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment Terms. Penalty_ Surcharge Percent. Percent</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The penalty rate (percentage) charged for late payment</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment Terms</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Penalty</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Surcharge Percent</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Percent</ccts:RepresentationTerm>
	 *               <ccts:DataType>Percent. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Penalty Surcharge Percent</em>' containment reference.
	 * @see #setPenaltySurchargePercent(PenaltySurchargePercentType)
	 */
	PenaltySurchargePercentType getPenaltySurchargePercent();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentTermsType#getPenaltySurchargePercent <em>Penalty Surcharge Percent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Penalty Surcharge Percent</em>' containment reference.
	 * @see #getPenaltySurchargePercent()
	 */
	void setPenaltySurchargePercent(PenaltySurchargePercentType value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment Terms. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The payment amount for the Payment Terms</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment Terms</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount</em>' containment reference.
	 * @see #setAmount(AmountType)
	 */
	AmountType getAmount();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentTermsType#getAmount <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' containment reference.
	 * @see #getAmount()
	 */
	void setAmount(AmountType value);

	/**
	 * Returns the value of the '<em><b>Settlement Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment Terms. Settlement_ Period. Period</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Settlement Period</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment Terms</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Settlement</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Period</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Period</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Settlement Period</em>' containment reference.
	 * @see #setSettlementPeriod(PeriodType)
	 */
	PeriodType getSettlementPeriod();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentTermsType#getSettlementPeriod <em>Settlement Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Settlement Period</em>' containment reference.
	 * @see #getSettlementPeriod()
	 */
	void setSettlementPeriod(PeriodType value);

	/**
	 * Returns the value of the '<em><b>Penalty Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment Terms. Penalty_ Period. Period</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Penalty Period</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment Terms</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Penalty</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Period</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Period</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Penalty Period</em>' containment reference.
	 * @see #setPenaltyPeriod(PeriodType)
	 */
	PeriodType getPenaltyPeriod();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentTermsType#getPenaltyPeriod <em>Penalty Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Penalty Period</em>' containment reference.
	 * @see #getPenaltyPeriod()
	 */
	void setPenaltyPeriod(PeriodType value);

	/**
	 * Returns the value of the '<em><b>Payment Means</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment Terms. Payment Means</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Payment Means</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment Terms</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Payment Means</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Payment Means</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Means</em>' containment reference.
	 * @see #setPaymentMeans(PaymentMeansType)
	 */
	PaymentMeansType getPaymentMeans();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentTermsType#getPaymentMeans <em>Payment Means</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Means</em>' containment reference.
	 * @see #getPaymentMeans()
	 */
	void setPaymentMeans(PaymentMeansType value);

} // PaymentTermsType