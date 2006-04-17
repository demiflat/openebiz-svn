/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import java.util.List;

import org.openebiz.core.common.cbc.PaymentChannelCodeType;
import org.openebiz.core.common.cbc.PaymentDueDateType;
import org.openebiz.core.common.cbc.PaymentMeansCodeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Means Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Payment Means. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about Payment Means</ccts:Definition>
 *           <ccts:ObjectClass>Payment Means</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.PaymentMeansType#getPaymentMeansCode <em>Payment Means Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PaymentMeansType#getPaymentDueDate <em>Payment Due Date</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PaymentMeansType#getPaymentChannelCode <em>Payment Channel Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PaymentMeansType#getCardAccount <em>Card Account</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PaymentMeansType#getPayerFinancialAccount <em>Payer Financial Account</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PaymentMeansType#getPayeeFinancialAccount <em>Payee Financial Account</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PaymentMeansType#getCreditAccount <em>Credit Account</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PaymentMeansType#getPayment <em>Payment</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface PaymentMeansType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Payment Means Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment Means. Payment Means. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the Payment Means</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment Means</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Payment Means</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Means Code</em>' containment reference.
	 * @see #setPaymentMeansCode(PaymentMeansCodeType)
	 */
	PaymentMeansCodeType getPaymentMeansCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentMeansType#getPaymentMeansCode <em>Payment Means Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Means Code</em>' containment reference.
	 * @see #getPaymentMeansCode()
	 */
	void setPaymentMeansCode(PaymentMeansCodeType value);

	/**
	 * Returns the value of the '<em><b>Payment Due Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment Means. Payment Due Date. Date</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The date on which payment is due for the Payment Means</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment Means</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Payment Due Date</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Due Date</em>' containment reference.
	 * @see #setPaymentDueDate(PaymentDueDateType)
	 */
	PaymentDueDateType getPaymentDueDate();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentMeansType#getPaymentDueDate <em>Payment Due Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Due Date</em>' containment reference.
	 * @see #getPaymentDueDate()
	 */
	void setPaymentDueDate(PaymentDueDateType value);

	/**
	 * Returns the value of the '<em><b>Payment Channel Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment Means. Payment Channel. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The Payment Channel expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment Means</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Payment Channel</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Channel Code</em>' containment reference.
	 * @see #setPaymentChannelCode(PaymentChannelCodeType)
	 */
	PaymentChannelCodeType getPaymentChannelCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentMeansType#getPaymentChannelCode <em>Payment Channel Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Channel Code</em>' containment reference.
	 * @see #getPaymentChannelCode()
	 */
	void setPaymentChannelCode(PaymentChannelCodeType value);

	/**
	 * Returns the value of the '<em><b>Card Account</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment Means. Card Account</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Card Account</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment Means</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Card Account</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Card Account</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Card Account</em>' containment reference.
	 * @see #setCardAccount(CardAccountType)
	 */
	CardAccountType getCardAccount();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentMeansType#getCardAccount <em>Card Account</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Account</em>' containment reference.
	 * @see #getCardAccount()
	 */
	void setCardAccount(CardAccountType value);

	/**
	 * Returns the value of the '<em><b>Payer Financial Account</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment Means. Payer_ Financial Account. Financial Account</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Payer's Financial Account</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment Means</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Payer</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Financial Account</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Financial Account</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payer Financial Account</em>' containment reference.
	 * @see #setPayerFinancialAccount(FinancialAccountType)
	 */
	FinancialAccountType getPayerFinancialAccount();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentMeansType#getPayerFinancialAccount <em>Payer Financial Account</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payer Financial Account</em>' containment reference.
	 * @see #getPayerFinancialAccount()
	 */
	void setPayerFinancialAccount(FinancialAccountType value);

	/**
	 * Returns the value of the '<em><b>Payee Financial Account</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment Means. Payee_ Financial Account. Financial Account</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Payee's Financial Account</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment Means</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Payee</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Financial Account</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Financial Account</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payee Financial Account</em>' containment reference.
	 * @see #setPayeeFinancialAccount(FinancialAccountType)
	 */
	FinancialAccountType getPayeeFinancialAccount();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentMeansType#getPayeeFinancialAccount <em>Payee Financial Account</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payee Financial Account</em>' containment reference.
	 * @see #getPayeeFinancialAccount()
	 */
	void setPayeeFinancialAccount(FinancialAccountType value);

	/**
	 * Returns the value of the '<em><b>Credit Account</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment Means. Credit Account</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Credit Account</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment Means</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Credit Account</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Credit Account</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Credit Account</em>' containment reference.
	 * @see #setCreditAccount(CreditAccountType)
	 */
	CreditAccountType getCreditAccount();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentMeansType#getCreditAccount <em>Credit Account</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit Account</em>' containment reference.
	 * @see #getCreditAccount()
	 */
	void setCreditAccount(CreditAccountType value);

	/**
	 * Returns the value of the '<em><b>Payment</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.PaymentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment Means. Payment</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Payment</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment Means</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Payment</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Payment</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment</em>' containment reference list.
	 */
	List getPayment();

} // PaymentMeansType