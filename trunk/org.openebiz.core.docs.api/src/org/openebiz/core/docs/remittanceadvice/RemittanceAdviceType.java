/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.docs.remittanceadvice;

import java.util.List;

import org.openebiz.core.common.cac.AccountingDocumentReferenceType;
import org.openebiz.core.common.cac.CustomerPartyType;
import org.openebiz.core.common.cac.PartyType;
import org.openebiz.core.common.cac.PaymentMeansType;
import org.openebiz.core.common.cac.SignatureType;
import org.openebiz.core.common.cac.SupplierPartyType;

import org.openebiz.core.common.cbc.CopyIndicatorType;
import org.openebiz.core.common.cbc.DocumentCurrencyCodeType;
import org.openebiz.core.common.cbc.GUIDType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.IssueDateType;
import org.openebiz.core.common.cbc.IssueTimeType;
import org.openebiz.core.common.cbc.NoteType;
import org.openebiz.core.common.cbc.TotalCreditAmountType;
import org.openebiz.core.common.cbc.TotalDebitAmountType;
import org.openebiz.core.common.cbc.TotalPaymentAmountType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remittance Advice Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Remittance Advice. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>The document used to specify details of an actual payment</ccts:Definition>
 *           <ccts:ObjectClass>Remittance Advice</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.docs.remittanceadvice.RemittanceAdviceType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.docs.remittanceadvice.RemittanceAdviceType#getCopyIndicator <em>Copy Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.docs.remittanceadvice.RemittanceAdviceType#getGUID <em>GUID</em>}</li>
 *   <li>{@link org.openebiz.core.docs.remittanceadvice.RemittanceAdviceType#getIssueDate <em>Issue Date</em>}</li>
 *   <li>{@link org.openebiz.core.docs.remittanceadvice.RemittanceAdviceType#getIssueTime <em>Issue Time</em>}</li>
 *   <li>{@link org.openebiz.core.docs.remittanceadvice.RemittanceAdviceType#getNote <em>Note</em>}</li>
 *   <li>{@link org.openebiz.core.docs.remittanceadvice.RemittanceAdviceType#getDocumentCurrencyCode <em>Document Currency Code</em>}</li>
 *   <li>{@link org.openebiz.core.docs.remittanceadvice.RemittanceAdviceType#getTotalDebitAmount <em>Total Debit Amount</em>}</li>
 *   <li>{@link org.openebiz.core.docs.remittanceadvice.RemittanceAdviceType#getTotalCreditAmount <em>Total Credit Amount</em>}</li>
 *   <li>{@link org.openebiz.core.docs.remittanceadvice.RemittanceAdviceType#getTotalPaymentAmount <em>Total Payment Amount</em>}</li>
 *   <li>{@link org.openebiz.core.docs.remittanceadvice.RemittanceAdviceType#getInvoicePeriod <em>Invoice Period</em>}</li>
 *   <li>{@link org.openebiz.core.docs.remittanceadvice.RemittanceAdviceType#getAccountingDocumentReference <em>Accounting Document Reference</em>}</li>
 *   <li>{@link org.openebiz.core.docs.remittanceadvice.RemittanceAdviceType#getAdditionalDocumentReference <em>Additional Document Reference</em>}</li>
 *   <li>{@link org.openebiz.core.docs.remittanceadvice.RemittanceAdviceType#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.openebiz.core.docs.remittanceadvice.RemittanceAdviceType#getDebtorCustomerParty <em>Debtor Customer Party</em>}</li>
 *   <li>{@link org.openebiz.core.docs.remittanceadvice.RemittanceAdviceType#getCreditorSupplierParty <em>Creditor Supplier Party</em>}</li>
 *   <li>{@link org.openebiz.core.docs.remittanceadvice.RemittanceAdviceType#getPayeeParty <em>Payee Party</em>}</li>
 *   <li>{@link org.openebiz.core.docs.remittanceadvice.RemittanceAdviceType#getPaymentMeans <em>Payment Means</em>}</li>
 *   <li>{@link org.openebiz.core.docs.remittanceadvice.RemittanceAdviceType#getTaxTotal <em>Tax Total</em>}</li>
 *   <li>{@link org.openebiz.core.docs.remittanceadvice.RemittanceAdviceType#getRemittanceAdviceLine <em>Remittance Advice Line</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface RemittanceAdviceType {
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
	 *               <ccts:DictionaryEntryName>Remittance Advice. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An identifier for the Remittance Advice assigned by the Debtor</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Remittance Advice</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.docs.remittanceadvice.RemittanceAdviceType#getID <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' containment reference.
	 * @see #getID()
	 */
	void setID(IDType value);

	/**
	 * Returns the value of the '<em><b>Copy Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Remittance Advice. Copy Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Indicates whether the Remittance Advice is a copy (true) or not (false)</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Remittance Advice</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Copy Indicator</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copy Indicator</em>' containment reference.
	 * @see #setCopyIndicator(CopyIndicatorType)
	 */
	CopyIndicatorType getCopyIndicator();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.remittanceadvice.RemittanceAdviceType#getCopyIndicator <em>Copy Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy Indicator</em>' containment reference.
	 * @see #getCopyIndicator()
	 */
	void setCopyIndicator(CopyIndicatorType value);

	/**
	 * Returns the value of the '<em><b>GUID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Remittance Advice. Globally Unique Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A computer-generated globally unique identifier (GUID) for the Remittance Advice instance</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Remittance Advice</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Globally Unique Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GUID</em>' containment reference.
	 * @see #setGUID(GUIDType)
	 */
	GUIDType getGUID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.remittanceadvice.RemittanceAdviceType#getGUID <em>GUID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GUID</em>' containment reference.
	 * @see #getGUID()
	 */
	void setGUID(GUIDType value);

	/**
	 * Returns the value of the '<em><b>Issue Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Remittance Advice. Issue Date. Date</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The date assigned by the Debtor on which the Remittance Advice was issued</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Remittance Advice</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Issue Date</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue Date</em>' containment reference.
	 * @see #setIssueDate(IssueDateType)
	 */
	IssueDateType getIssueDate();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.remittanceadvice.RemittanceAdviceType#getIssueDate <em>Issue Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Date</em>' containment reference.
	 * @see #getIssueDate()
	 */
	void setIssueDate(IssueDateType value);

	/**
	 * Returns the value of the '<em><b>Issue Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Remittance Advice. Issue Time. Time</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The time assigned by the Debtor on which the Remittance Advice was issued</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Remittance Advice</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Issue Time</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Time</ccts:RepresentationTerm>
	 *               <ccts:DataType>Time. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue Time</em>' containment reference.
	 * @see #setIssueTime(IssueTimeType)
	 */
	IssueTimeType getIssueTime();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.remittanceadvice.RemittanceAdviceType#getIssueTime <em>Issue Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Time</em>' containment reference.
	 * @see #getIssueTime()
	 */
	void setIssueTime(IssueTimeType value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Remittance Advice. Note. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Free form text applying to the Remittance Advice. This element may contain notes or any other similar information that is not contained explicitly in another structure.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Remittance Advice</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.docs.remittanceadvice.RemittanceAdviceType#getNote <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' containment reference.
	 * @see #getNote()
	 */
	void setNote(NoteType value);

	/**
	 * Returns the value of the '<em><b>Document Currency Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Remittance Advice. Document_ Currency. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The default currency for the Remittance Advice</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Remittance Advice</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Document</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Currency</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Currency_ Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Currency Code</em>' containment reference.
	 * @see #setDocumentCurrencyCode(DocumentCurrencyCodeType)
	 */
	DocumentCurrencyCodeType getDocumentCurrencyCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.remittanceadvice.RemittanceAdviceType#getDocumentCurrencyCode <em>Document Currency Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Currency Code</em>' containment reference.
	 * @see #getDocumentCurrencyCode()
	 */
	void setDocumentCurrencyCode(DocumentCurrencyCodeType value);

	/**
	 * Returns the value of the '<em><b>Total Debit Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Remittance Advice. Total_ Debit Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The totals of all debit amounts for the Remittance Advice</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Remittance Advice</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Total</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Debit Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Debit Amount</em>' containment reference.
	 * @see #setTotalDebitAmount(TotalDebitAmountType)
	 */
	TotalDebitAmountType getTotalDebitAmount();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.remittanceadvice.RemittanceAdviceType#getTotalDebitAmount <em>Total Debit Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Debit Amount</em>' containment reference.
	 * @see #getTotalDebitAmount()
	 */
	void setTotalDebitAmount(TotalDebitAmountType value);

	/**
	 * Returns the value of the '<em><b>Total Credit Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Remittance Advice. Total_ Credit Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The totals of all credit amounts for the Remittance Advice</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Remittance Advice</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Total</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Credit Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Credit Amount</em>' containment reference.
	 * @see #setTotalCreditAmount(TotalCreditAmountType)
	 */
	TotalCreditAmountType getTotalCreditAmount();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.remittanceadvice.RemittanceAdviceType#getTotalCreditAmount <em>Total Credit Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Credit Amount</em>' containment reference.
	 * @see #getTotalCreditAmount()
	 */
	void setTotalCreditAmount(TotalCreditAmountType value);

	/**
	 * Returns the value of the '<em><b>Total Payment Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Remittance Advice. Total_ Payment Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The total payable amount for the Remittance Advice (positive)</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Remittance Advice</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Total</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Payment Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Payment Amount</em>' containment reference.
	 * @see #setTotalPaymentAmount(TotalPaymentAmountType)
	 */
	TotalPaymentAmountType getTotalPaymentAmount();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.remittanceadvice.RemittanceAdviceType#getTotalPaymentAmount <em>Total Payment Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Payment Amount</em>' containment reference.
	 * @see #getTotalPaymentAmount()
	 */
	void setTotalPaymentAmount(TotalPaymentAmountType value);

	/**
	 * Returns the value of the '<em><b>Invoice Period</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.PeriodType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Remittance Advice. Invoice_ Period. Period</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to period(s) to which the Invoices related to the Remittance apply</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Remittance Advice</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Invoice</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Period</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Period</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invoice Period</em>' containment reference list.
	 */
	List getInvoicePeriod();

	/**
	 * Returns the value of the '<em><b>Accounting Document Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Remittance Advice. Accounting Document Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to other accounting documents.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Remittance Advice</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Accounting Document Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Accounting Document Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accounting Document Reference</em>' containment reference.
	 * @see #setAccountingDocumentReference(AccountingDocumentReferenceType)
	 */
	AccountingDocumentReferenceType getAccountingDocumentReference();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.remittanceadvice.RemittanceAdviceType#getAccountingDocumentReference <em>Accounting Document Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accounting Document Reference</em>' containment reference.
	 * @see #getAccountingDocumentReference()
	 */
	void setAccountingDocumentReference(AccountingDocumentReferenceType value);

	/**
	 * Returns the value of the '<em><b>Additional Document Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.DocumentReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Remittance Advice. Additional_ Document Reference. Document Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to other documents.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Remittance Advice</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Additional</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Document Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Document Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Document Reference</em>' containment reference list.
	 */
	List getAdditionalDocumentReference();

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Remittance Advice. Signature</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Associates the Remittance Advice with zero or more signatures.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Remittance Advice</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Signature</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Signature</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature</em>' containment reference.
	 * @see #setSignature(SignatureType)
	 */
	SignatureType getSignature();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.remittanceadvice.RemittanceAdviceType#getSignature <em>Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' containment reference.
	 * @see #getSignature()
	 */
	void setSignature(SignatureType value);

	/**
	 * Returns the value of the '<em><b>Debtor Customer Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Remittance Advice. Debtor_ Customer Party. Customer Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Debtor</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Remittance Advice</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Debtor</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Customer Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Customer Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Debtor Customer Party</em>' containment reference.
	 * @see #setDebtorCustomerParty(CustomerPartyType)
	 */
	CustomerPartyType getDebtorCustomerParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.remittanceadvice.RemittanceAdviceType#getDebtorCustomerParty <em>Debtor Customer Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debtor Customer Party</em>' containment reference.
	 * @see #getDebtorCustomerParty()
	 */
	void setDebtorCustomerParty(CustomerPartyType value);

	/**
	 * Returns the value of the '<em><b>Creditor Supplier Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Remittance Advice. Creditor_ Supplier Party. Supplier Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Creditor</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Remittance Advice</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Creditor</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Supplier Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Supplier Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creditor Supplier Party</em>' containment reference.
	 * @see #setCreditorSupplierParty(SupplierPartyType)
	 */
	SupplierPartyType getCreditorSupplierParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.remittanceadvice.RemittanceAdviceType#getCreditorSupplierParty <em>Creditor Supplier Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creditor Supplier Party</em>' containment reference.
	 * @see #getCreditorSupplierParty()
	 */
	void setCreditorSupplierParty(SupplierPartyType value);

	/**
	 * Returns the value of the '<em><b>Payee Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Remittance Advice. Payee_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Payee</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Remittance Advice</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Payee</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payee Party</em>' containment reference.
	 * @see #setPayeeParty(PartyType)
	 */
	PartyType getPayeeParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.remittanceadvice.RemittanceAdviceType#getPayeeParty <em>Payee Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payee Party</em>' containment reference.
	 * @see #getPayeeParty()
	 */
	void setPayeeParty(PartyType value);

	/**
	 * Returns the value of the '<em><b>Payment Means</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Remittance Advice. Payment Means</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Payment Means</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Remittance Advice</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.docs.remittanceadvice.RemittanceAdviceType#getPaymentMeans <em>Payment Means</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Means</em>' containment reference.
	 * @see #getPaymentMeans()
	 */
	void setPaymentMeans(PaymentMeansType value);

	/**
	 * Returns the value of the '<em><b>Tax Total</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.TaxTotalType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Remittance Advice. Tax Total</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Associates the Remittance Advice with summary information for a particular tax.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Remittance Advice</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Tax Total</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Tax Total</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tax Total</em>' containment reference list.
	 */
	List getTaxTotal();

	/**
	 * Returns the value of the '<em><b>Remittance Advice Line</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.RemittanceAdviceLineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Remittance Advice. Remittance Advice Line</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to one or more Remittance Advice Lines</ccts:Definition>
	 *               <ccts:Cardinality>1..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Remittance Advice</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Remittance Advice Line</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Remittance Advice Line</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remittance Advice Line</em>' containment reference list.
	 */
	List getRemittanceAdviceLine();

} // RemittanceAdviceType