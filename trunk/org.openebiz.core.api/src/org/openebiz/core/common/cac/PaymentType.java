/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.ExpectedReceiptDateTimeType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.InstructionIDType;
import org.openebiz.core.common.cbc.PaidAmountType;
import org.openebiz.core.common.cbc.PaidDateTimeType;
import org.openebiz.core.common.cbc.ReceivedDateType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Payment. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>information directly relating to a specific payment.</ccts:Definition>
 *           <ccts:ObjectClass>Payment</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.PaymentType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PaymentType#getPaidAmount <em>Paid Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PaymentType#getReceivedDate <em>Received Date</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PaymentType#getPaidDateTime <em>Paid Date Time</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PaymentType#getExpectedReceiptDateTime <em>Expected Receipt Date Time</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PaymentType#getInstructionID <em>Instruction ID</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface PaymentType {
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
	 *               <ccts:DictionaryEntryName>Payment. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the Payment</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentType#getID <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' containment reference.
	 * @see #getID()
	 */
	void setID(IDType value);

	/**
	 * Returns the value of the '<em><b>Paid Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment. Paid Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The amount paid</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Paid Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Paid Amount</em>' containment reference.
	 * @see #setPaidAmount(PaidAmountType)
	 */
	PaidAmountType getPaidAmount();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentType#getPaidAmount <em>Paid Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paid Amount</em>' containment reference.
	 * @see #getPaidAmount()
	 */
	void setPaidAmount(PaidAmountType value);

	/**
	 * Returns the value of the '<em><b>Received Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment. Received Date. Date</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The date on which the Payment was received</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Received Date</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Received Date</em>' containment reference.
	 * @see #setReceivedDate(ReceivedDateType)
	 */
	ReceivedDateType getReceivedDate();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentType#getReceivedDate <em>Received Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Received Date</em>' containment reference.
	 * @see #getReceivedDate()
	 */
	void setReceivedDate(ReceivedDateType value);

	/**
	 * Returns the value of the '<em><b>Paid Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment. Paid Date Time. Date Time</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The date time at which the Payment was made</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Paid Date Time</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date Time</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date Time. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Paid Date Time</em>' containment reference.
	 * @see #setPaidDateTime(PaidDateTimeType)
	 */
	PaidDateTimeType getPaidDateTime();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentType#getPaidDateTime <em>Paid Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paid Date Time</em>' containment reference.
	 * @see #getPaidDateTime()
	 */
	void setPaidDateTime(PaidDateTimeType value);

	/**
	 * Returns the value of the '<em><b>Expected Receipt Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment. Expected_ Receipt Date Time. Date Time</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The datetime at which Payment is expected to reach the Payee</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Expected</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Receipt Date Time</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date Time</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date Time. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expected Receipt Date Time</em>' containment reference.
	 * @see #setExpectedReceiptDateTime(ExpectedReceiptDateTimeType)
	 */
	ExpectedReceiptDateTimeType getExpectedReceiptDateTime();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentType#getExpectedReceiptDateTime <em>Expected Receipt Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Receipt Date Time</em>' containment reference.
	 * @see #getExpectedReceiptDateTime()
	 */
	void setExpectedReceiptDateTime(ExpectedReceiptDateTimeType value);

	/**
	 * Returns the value of the '<em><b>Instruction ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment. Instruction Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the Payment Instruction</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Instruction Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instruction ID</em>' containment reference.
	 * @see #setInstructionID(InstructionIDType)
	 */
	InstructionIDType getInstructionID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentType#getInstructionID <em>Instruction ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction ID</em>' containment reference.
	 * @see #getInstructionID()
	 */
	void setInstructionID(InstructionIDType value);

} // PaymentType