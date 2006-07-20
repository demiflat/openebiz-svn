/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.businessdocs;

import org.openebiz.core.common.cac.AccountingDocumentReferenceType;
import org.openebiz.core.common.cac.CustomerPartyType;
import org.openebiz.core.common.cac.DebitNoteLineType;
import org.openebiz.core.common.cac.DocumentReferenceType;
import org.openebiz.core.common.cac.ExchangeRateType;
import org.openebiz.core.common.cac.LegalTotalType;
import org.openebiz.core.common.cac.OrderReferenceType;
import org.openebiz.core.common.cac.PartyType;
import org.openebiz.core.common.cac.PeriodType;
import org.openebiz.core.common.cac.ResponseType;
import org.openebiz.core.common.cac.SignatureType;
import org.openebiz.core.common.cac.SupplierPartyType;
import org.openebiz.core.common.cac.TaxTotalType;

import org.openebiz.core.common.cbc.AccountingCostCodeType;
import org.openebiz.core.common.cbc.CopyIndicatorType;
import org.openebiz.core.common.cbc.DocumentCurrencyCodeType;
import org.openebiz.core.common.cbc.GUIDType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.IssueDateType;
import org.openebiz.core.common.cbc.IssueTimeType;
import org.openebiz.core.common.cbc.NoteType;
import org.openebiz.core.common.cbc.PricingCurrencyCodeType;
import org.openebiz.core.common.cbc.TaxCurrencyCodeType;
import org.openebiz.core.common.cbc.TaxPointDateType;
import org.openebiz.core.common.cbc.TransactionCurrencyCodeType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Debit Note. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>The document used to specify debits made by the Debtor</ccts:Definition>
 *           <ccts:ObjectClass>Debit Note</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.businessdocs.DebitNoteType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DebitNoteType#getCopyIndicator <em>Copy Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DebitNoteType#getGUID <em>GUID</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DebitNoteType#getIssueDate <em>Issue Date</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DebitNoteType#getIssueTime <em>Issue Time</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DebitNoteType#getNote <em>Note</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DebitNoteType#getTaxPointDate <em>Tax Point Date</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DebitNoteType#getTransactionCurrencyCode <em>Transaction Currency Code</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DebitNoteType#getDocumentCurrencyCode <em>Document Currency Code</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DebitNoteType#getTaxCurrencyCode <em>Tax Currency Code</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DebitNoteType#getPricingCurrencyCode <em>Pricing Currency Code</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DebitNoteType#getAccountingCostCode <em>Accounting Cost Code</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DebitNoteType#getInvoicePeriod <em>Invoice Period</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DebitNoteType#getDiscrepancyResponse <em>Discrepancy Response</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DebitNoteType#getOrderReference <em>Order Reference</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DebitNoteType#getAccountingDocumentReference <em>Accounting Document Reference</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DebitNoteType#getContractDocumentReference <em>Contract Document Reference</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DebitNoteType#getAdditionalDocumentReference <em>Additional Document Reference</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DebitNoteType#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DebitNoteType#getDebtorCustomerParty <em>Debtor Customer Party</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DebitNoteType#getCreditorSupplierParty <em>Creditor Supplier Party</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DebitNoteType#getPayeeParty <em>Payee Party</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DebitNoteType#getTransactionExchangeRate <em>Transaction Exchange Rate</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DebitNoteType#getTaxExchangeRate <em>Tax Exchange Rate</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DebitNoteType#getPricingExchangeRate <em>Pricing Exchange Rate</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DebitNoteType#getTaxTotal <em>Tax Total</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DebitNoteType#getLegalTotal <em>Legal Total</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DebitNoteType#getDebitNoteLine <em>Debit Note Line</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DebitNoteType implements Serializable {
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

	/**
	 *  Basic surrogate id support
	 */

	/**
	 *  The internal surrogate id
	 */
	protected Long internalId = null;

	/**
	 *  The db version number
	 */
	protected Integer version = null;

	/**
	 * @return the internalId
	 */
	public Long getInternalId() {
		return this.internalId;
	}

	/**
	 * @return the version
	 */
	public Integer getVersion() {
		return this.version;
	}

	/**
	 * @param internalId the internalId to set
	 */
	protected void setInternalId(Long internalId) {
		this.internalId = internalId;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected IDType iD = null;

	/**
	 * The cached value of the '{@link #getCopyIndicator() <em>Copy Indicator</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyIndicator()
	 * @generated
	 * @ordered
	 */
	protected CopyIndicatorType copyIndicator = null;

	/**
	 * The cached value of the '{@link #getGUID() <em>GUID</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGUID()
	 * @generated
	 * @ordered
	 */
	protected GUIDType gUID = null;

	/**
	 * The cached value of the '{@link #getIssueDate() <em>Issue Date</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueDate()
	 * @generated
	 * @ordered
	 */
	protected IssueDateType issueDate = null;

	/**
	 * The cached value of the '{@link #getIssueTime() <em>Issue Time</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueTime()
	 * @generated
	 * @ordered
	 */
	protected IssueTimeType issueTime = null;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected NoteType note = null;

	/**
	 * The cached value of the '{@link #getTaxPointDate() <em>Tax Point Date</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxPointDate()
	 * @generated
	 * @ordered
	 */
	protected TaxPointDateType taxPointDate = null;

	/**
	 * The cached value of the '{@link #getTransactionCurrencyCode() <em>Transaction Currency Code</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionCurrencyCode()
	 * @generated
	 * @ordered
	 */
	protected TransactionCurrencyCodeType transactionCurrencyCode = null;

	/**
	 * The cached value of the '{@link #getDocumentCurrencyCode() <em>Document Currency Code</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentCurrencyCode()
	 * @generated
	 * @ordered
	 */
	protected DocumentCurrencyCodeType documentCurrencyCode = null;

	/**
	 * The cached value of the '{@link #getTaxCurrencyCode() <em>Tax Currency Code</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxCurrencyCode()
	 * @generated
	 * @ordered
	 */
	protected TaxCurrencyCodeType taxCurrencyCode = null;

	/**
	 * The cached value of the '{@link #getPricingCurrencyCode() <em>Pricing Currency Code</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPricingCurrencyCode()
	 * @generated
	 * @ordered
	 */
	protected PricingCurrencyCodeType pricingCurrencyCode = null;

	/**
	 * The cached value of the '{@link #getAccountingCostCode() <em>Accounting Cost Code</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountingCostCode()
	 * @generated
	 * @ordered
	 */
	protected AccountingCostCodeType accountingCostCode = null;

	/**
	 * The cached value of the '{@link #getInvoicePeriod() <em>Invoice Period</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoicePeriod()
	 * @generated
	 * @ordered
	 */
	protected List  invoicePeriod = null;

	/**
	 * The cached value of the '{@link #getDiscrepancyResponse() <em>Discrepancy Response</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscrepancyResponse()
	 * @generated
	 * @ordered
	 */
	protected List  discrepancyResponse = null;

	/**
	 * The cached value of the '{@link #getOrderReference() <em>Order Reference</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderReference()
	 * @generated
	 * @ordered
	 */
	protected List  orderReference = null;

	/**
	 * The cached value of the '{@link #getAccountingDocumentReference() <em>Accounting Document Reference</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountingDocumentReference()
	 * @generated
	 * @ordered
	 */
	protected List  accountingDocumentReference = null;

	/**
	 * The cached value of the '{@link #getContractDocumentReference() <em>Contract Document Reference</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContractDocumentReference()
	 * @generated
	 * @ordered
	 */
	protected List  contractDocumentReference = null;

	/**
	 * The cached value of the '{@link #getAdditionalDocumentReference() <em>Additional Document Reference</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalDocumentReference()
	 * @generated
	 * @ordered
	 */
	protected List  additionalDocumentReference = null;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected List  signature = null;

	/**
	 * The cached value of the '{@link #getDebtorCustomerParty() <em>Debtor Customer Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebtorCustomerParty()
	 * @generated
	 * @ordered
	 */
	protected CustomerPartyType debtorCustomerParty = null;

	/**
	 * The cached value of the '{@link #getCreditorSupplierParty() <em>Creditor Supplier Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditorSupplierParty()
	 * @generated
	 * @ordered
	 */
	protected SupplierPartyType creditorSupplierParty = null;

	/**
	 * The cached value of the '{@link #getPayeeParty() <em>Payee Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayeeParty()
	 * @generated
	 * @ordered
	 */
	protected PartyType payeeParty = null;

	/**
	 * The cached value of the '{@link #getTransactionExchangeRate() <em>Transaction Exchange Rate</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionExchangeRate()
	 * @generated
	 * @ordered
	 */
	protected ExchangeRateType transactionExchangeRate = null;

	/**
	 * The cached value of the '{@link #getTaxExchangeRate() <em>Tax Exchange Rate</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxExchangeRate()
	 * @generated
	 * @ordered
	 */
	protected ExchangeRateType taxExchangeRate = null;

	/**
	 * The cached value of the '{@link #getPricingExchangeRate() <em>Pricing Exchange Rate</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPricingExchangeRate()
	 * @generated
	 * @ordered
	 */
	protected ExchangeRateType pricingExchangeRate = null;

	/**
	 * The cached value of the '{@link #getTaxTotal() <em>Tax Total</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxTotal()
	 * @generated
	 * @ordered
	 */
	protected List  taxTotal = null;

	/**
	 * The cached value of the '{@link #getLegalTotal() <em>Legal Total</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegalTotal()
	 * @generated
	 * @ordered
	 */
	protected LegalTotalType legalTotal = null;

	/**
	 * The cached value of the '{@link #getDebitNoteLine() <em>Debit Note Line</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebitNoteLine()
	 * @generated
	 * @ordered
	 */
	protected List  debitNoteLine = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DebitNoteType() {
		super();
		this.init();
	}
	
	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.accountingCostCode = this.getAccountingCostCode();
		this.accountingDocumentReference = this.getAccountingDocumentReference();
		this.additionalDocumentReference = this.getAdditionalDocumentReference();
		this.contractDocumentReference = this.getContractDocumentReference();
		this.copyIndicator = this.getCopyIndicator();
		this.creditorSupplierParty = this.getCreditorSupplierParty();
		this.debitNoteLine = this.getDebitNoteLine();
		this.debtorCustomerParty = this.getDebtorCustomerParty();
		this.discrepancyResponse = this.getDiscrepancyResponse();
		this.documentCurrencyCode = this.getDocumentCurrencyCode();
		this.gUID = this.getGUID();
		this.iD = this.getID();
		this.invoicePeriod = this.getInvoicePeriod();
		this.issueDate = this.getIssueDate();
		this.issueTime = this.getIssueTime();
		this.legalTotal = this.getLegalTotal();
		this.note = this.getNote();
		this.orderReference = this.getOrderReference();
		this.payeeParty = this.getPayeeParty();
		this.pricingCurrencyCode = this.getPricingCurrencyCode();
		this.pricingExchangeRate = this.getPricingExchangeRate();
		this.signature = this.getSignature();
		this.taxCurrencyCode = this.getTaxCurrencyCode();
		this.taxExchangeRate = this.getTaxExchangeRate();
		this.taxPointDate = this.getTaxPointDate();
		this.taxTotal = this.getTaxTotal();
		this.transactionCurrencyCode = this.getTransactionCurrencyCode();
		this.transactionExchangeRate = this.getTaxExchangeRate();
	}

	/**
	 * Returns the value of the '<em><b>ID</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Debit Note. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An identifier for the Debit Note assigned by the Debtor</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Debit Note</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID</em>'
	 * @see #setID(IDType)
	 * @generated
	 */
	public IDType getID() {
		return (iD == null) ? new IDType() : iD;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.debitnote.DebitNoteType#getID <em>ID</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>'
	 * @see #getID()
	 * @generated
	 */
	public void setID(IDType newID) {
		iD = newID;
	}

	/**
	 * Returns the value of the '<em><b>Copy Indicator</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Debit Note. Copy Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Indicates whether the Debit Note is a copy (true) or not (false)</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Debit Note</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Copy Indicator</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copy Indicator</em>'
	 * @see #setCopyIndicator(CopyIndicatorType)
	 * @generated
	 */
	public CopyIndicatorType getCopyIndicator() {
		return (copyIndicator == null) ? new CopyIndicatorType()
				: copyIndicator;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.debitnote.DebitNoteType#getCopyIndicator <em>Copy Indicator</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy Indicator</em>'
	 * @see #getCopyIndicator()
	 * @generated
	 */
	public void setCopyIndicator(CopyIndicatorType newCopyIndicator) {
		copyIndicator = newCopyIndicator;
	}

	/**
	 * Returns the value of the '<em><b>GUID</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Debit Note. Globally Unique Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A computer-generated globally unique identifier (GUID) for the Debit Note instance</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Debit Note</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Globally Unique Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GUID</em>'
	 * @see #setGUID(GUIDType)
	 * @generated
	 */
	public GUIDType getGUID() {
		return (gUID == null) ? new GUIDType() : gUID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.debitnote.DebitNoteType#getGUID <em>GUID</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GUID</em>'
	 * @see #getGUID()
	 * @generated
	 */
	public void setGUID(GUIDType newGUID) {
		gUID = newGUID;
	}

	/**
	 * Returns the value of the '<em><b>Issue Date</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Debit Note. Issue Date. Date</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The date assigned by the Debtor on which the Debit Note was issued</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Debit Note</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Issue Date</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue Date</em>'
	 * @see #setIssueDate(IssueDateType)
	 * @generated
	 */
	public IssueDateType getIssueDate() {
		return (issueDate == null) ? new IssueDateType() : issueDate;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.debitnote.DebitNoteType#getIssueDate <em>Issue Date</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Date</em>'
	 * @see #getIssueDate()
	 * @generated
	 */
	public void setIssueDate(IssueDateType newIssueDate) {
		issueDate = newIssueDate;
	}

	/**
	 * Returns the value of the '<em><b>Issue Time</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Debit Note. Issue Time. Time</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The time assigned by the Debtor on which the Debit Note was issued</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Debit Note</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Issue Time</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Time</ccts:RepresentationTerm>
	 *               <ccts:DataType>Time. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue Time</em>'
	 * @see #setIssueTime(IssueTimeType)
	 * @generated
	 */
	public IssueTimeType getIssueTime() {
		return (issueTime == null) ? new IssueTimeType() : issueTime;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.debitnote.DebitNoteType#getIssueTime <em>Issue Time</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Time</em>'
	 * @see #getIssueTime()
	 * @generated
	 */
	public void setIssueTime(IssueTimeType newIssueTime) {
		issueTime = newIssueTime;
	}

	/**
	 * Returns the value of the '<em><b>Note</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Debit Note. Note. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Free form text applying to the Debit Note. This element may contain notes or any other similar information that is not contained explicitly in another structure.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Debit Note</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Note</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>'
	 * @see #setNote(NoteType)
	 * @generated
	 */
	public NoteType getNote() {
		return (note == null) ? new NoteType() : note;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.debitnote.DebitNoteType#getNote <em>Note</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>'
	 * @see #getNote()
	 * @generated
	 */
	public void setNote(NoteType newNote) {
		note = newNote;
	}

	/**
	 * Returns the value of the '<em><b>Tax Point Date</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Debit Note. Tax Point Date. Date</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The date of the Debit Note used to indicate the point at which tax becomes applicable.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Debit Note</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Tax Point Date</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tax Point Date</em>'
	 * @see #setTaxPointDate(TaxPointDateType)
	 * @generated
	 */
	public TaxPointDateType getTaxPointDate() {
		return (taxPointDate == null) ? new TaxPointDateType() : taxPointDate;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.debitnote.DebitNoteType#getTaxPointDate <em>Tax Point Date</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Point Date</em>'
	 * @see #getTaxPointDate()
	 * @generated
	 */
	public void setTaxPointDate(TaxPointDateType newTaxPointDate) {
		taxPointDate = newTaxPointDate;
	}

	/**
	 * Returns the value of the '<em><b>Transaction Currency Code</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Debit Note. Transaction_ Currency. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The default currency for the transaction</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Debit Note</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Transaction</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Currency</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Currency_ Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transaction Currency Code</em>'
	 * @see #setTransactionCurrencyCode(TransactionCurrencyCodeType)
	 * @generated
	 */
	public TransactionCurrencyCodeType getTransactionCurrencyCode() {
		return (transactionCurrencyCode == null) ? new TransactionCurrencyCodeType()
				: transactionCurrencyCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.debitnote.DebitNoteType#getTransactionCurrencyCode <em>Transaction Currency Code</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Currency Code</em>'
	 * @see #getTransactionCurrencyCode()
	 * @generated
	 */
	public void setTransactionCurrencyCode(
			TransactionCurrencyCodeType newTransactionCurrencyCode) {
		transactionCurrencyCode = newTransactionCurrencyCode;
	}

	/**
	 * Returns the value of the '<em><b>Document Currency Code</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Debit Note. Document_ Currency. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The default currency for the Debit Note</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Debit Note</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Document</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Currency</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Currency_ Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Currency Code</em>'
	 * @see #setDocumentCurrencyCode(DocumentCurrencyCodeType)
	 * @generated
	 */
	public DocumentCurrencyCodeType getDocumentCurrencyCode() {
		return (documentCurrencyCode == null) ? new DocumentCurrencyCodeType()
				: documentCurrencyCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.debitnote.DebitNoteType#getDocumentCurrencyCode <em>Document Currency Code</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Currency Code</em>'
	 * @see #getDocumentCurrencyCode()
	 * @generated
	 */
	public void setDocumentCurrencyCode(
			DocumentCurrencyCodeType newDocumentCurrencyCode) {
		documentCurrencyCode = newDocumentCurrencyCode;
	}

	/**
	 * Returns the value of the '<em><b>Tax Currency Code</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Debit Note. Tax_ Currency. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The currency used for tax amounts in the Debit Note</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Debit Note</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Tax</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Currency</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Currency_ Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tax Currency Code</em>'
	 * @see #setTaxCurrencyCode(TaxCurrencyCodeType)
	 * @generated
	 */
	public TaxCurrencyCodeType getTaxCurrencyCode() {
		return (taxCurrencyCode == null) ? new TaxCurrencyCodeType()
				: taxCurrencyCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.debitnote.DebitNoteType#getTaxCurrencyCode <em>Tax Currency Code</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Currency Code</em>'
	 * @see #getTaxCurrencyCode()
	 * @generated
	 */
	public void setTaxCurrencyCode(TaxCurrencyCodeType newTaxCurrencyCode) {
		taxCurrencyCode = newTaxCurrencyCode;
	}

	/**
	 * Returns the value of the '<em><b>Pricing Currency Code</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Debit Note. Pricing_ Currency. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The currency used for prices in the Debit Note</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Debit Note</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Pricing</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Currency</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Currency_ Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pricing Currency Code</em>'
	 * @see #setPricingCurrencyCode(PricingCurrencyCodeType)
	 * @generated
	 */
	public PricingCurrencyCodeType getPricingCurrencyCode() {
		return (pricingCurrencyCode == null) ? new PricingCurrencyCodeType()
				: pricingCurrencyCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.debitnote.DebitNoteType#getPricingCurrencyCode <em>Pricing Currency Code</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pricing Currency Code</em>'
	 * @see #getPricingCurrencyCode()
	 * @generated
	 */
	public void setPricingCurrencyCode(
			PricingCurrencyCodeType newPricingCurrencyCode) {
		pricingCurrencyCode = newPricingCurrencyCode;
	}

	/**
	 * Returns the value of the '<em><b>Accounting Cost Code</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Debit Note. Accounting_ Cost Code. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The Buyer's accounting code applied to the Credit Note as a whole</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Debit Note</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Accounting</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Cost Code</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accounting Cost Code</em>'
	 * @see #setAccountingCostCode(AccountingCostCodeType)
	 * @generated
	 */
	public AccountingCostCodeType getAccountingCostCode() {
		return (accountingCostCode == null) ? new AccountingCostCodeType()
				: accountingCostCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.debitnote.DebitNoteType#getAccountingCostCode <em>Accounting Cost Code</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accounting Cost Code</em>'
	 * @see #getAccountingCostCode()
	 * @generated
	 */
	public void setAccountingCostCode(
			AccountingCostCodeType newAccountingCostCode) {
		accountingCostCode = newAccountingCostCode;
	}

	/**
	 * Returns the value of the '<em><b>Invoice Period</b></em>'
	 * The list contents are of type {@link org.openebiz.core.common.cac.PeriodType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Debit Note. Invoice_ Period. Period</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to period(s) to which the Invoices related to the Debit apply</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Debit Note</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Invoice</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Period</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Period</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invoice Period</em>'
	 * @generated
	 */
	public List getInvoicePeriod() {
		if (invoicePeriod == null) {
			invoicePeriod = new ArrayList<PeriodType>();
		}
		return invoicePeriod;
	}

	/**
	 * Returns the value of the '<em><b>Discrepancy Response</b></em>'
	 * The list contents are of type {@link org.openebiz.core.common.cac.ResponseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Debit Note. Discrepancy_ Response. Response</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to a reason for the Debit Note as a whole</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Debit Note</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Discrepancy</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Response</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Response</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Discrepancy Response</em>'
	 * @generated
	 */
	public List getDiscrepancyResponse() {
		if (discrepancyResponse == null) {
			discrepancyResponse = new ArrayList<ResponseType>();
		}
		return discrepancyResponse;
	}

	/**
	 * Returns the value of the '<em><b>Order Reference</b></em>'
	 * The list contents are of type {@link org.openebiz.core.common.cac.OrderReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Debit Note. Order Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to an Order</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Debit Note</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Order Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Order Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order Reference</em>'
	 * @generated
	 */
	public List getOrderReference() {
		if (orderReference == null) {
			orderReference = new ArrayList<OrderReferenceType>();
		}
		return orderReference;
	}

	/**
	 * Returns the value of the '<em><b>Accounting Document Reference</b></em>'
	 * The list contents are of type {@link org.openebiz.core.common.cac.AccountingDocumentReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Debit Note. Accounting Document Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to other accounting documents.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Debit Note</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Accounting Document Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Accounting Document Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accounting Document Reference</em>'
	 * @generated
	 */
	public List getAccountingDocumentReference() {
		if (accountingDocumentReference == null) {
			accountingDocumentReference = new ArrayList<
					AccountingDocumentReferenceType>();
		}
		return accountingDocumentReference;
	}

	/**
	 * Returns the value of the '<em><b>Contract Document Reference</b></em>'
	 * The list contents are of type {@link org.openebiz.core.common.cac.DocumentReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Debit Note. Contract_ Document Reference. Document Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to a framework agreement or contract</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Debit Note</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Contract</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Document Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Document Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contract Document Reference</em>'
	 * @generated
	 */
	public List getContractDocumentReference() {
		if (contractDocumentReference == null) {
			contractDocumentReference = new ArrayList<
					DocumentReferenceType>();
		}
		return contractDocumentReference;
	}

	/**
	 * Returns the value of the '<em><b>Additional Document Reference</b></em>'
	 * The list contents are of type {@link org.openebiz.core.common.cac.DocumentReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Debit Note. Additional_ Document Reference. Document Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to other documents</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Debit Note</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Additional</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Document Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Document Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Document Reference</em>'
	 * @generated
	 */
	public List getAdditionalDocumentReference() {
		if (additionalDocumentReference == null) {
			additionalDocumentReference = new ArrayList<
					DocumentReferenceType>();
		}
		return additionalDocumentReference;
	}

	/**
	 * Returns the value of the '<em><b>Signature</b></em>'
	 * The list contents are of type {@link org.openebiz.core.common.cac.SignatureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Debit Note. Signature</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Associates the Debit Note with zero or more signatures.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Debit Note</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Signature</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Signature</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature</em>'
	 * @generated
	 */
	public List getSignature() {
		if (signature == null) {
			signature = new ArrayList<SignatureType>();
		}
		return signature;
	}

	/**
	 * Returns the value of the '<em><b>Debtor Customer Party</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Debit Note. Debtor_ Customer Party. Customer Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Debtor</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Debit Note</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Debtor</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Customer Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Customer Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Debtor Customer Party</em>'
	 * @see #setDebtorCustomerParty(CustomerPartyType)
	 * @generated
	 */
	public CustomerPartyType getDebtorCustomerParty() {
		return (debtorCustomerParty == null) ? new CustomerPartyType()
				: debtorCustomerParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.debitnote.DebitNoteType#getDebtorCustomerParty <em>Debtor Customer Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debtor Customer Party</em>'
	 * @see #getDebtorCustomerParty()
	 * @generated
	 */
	public void setDebtorCustomerParty(CustomerPartyType newDebtorCustomerParty) {
		debtorCustomerParty = newDebtorCustomerParty;
	}

	/**
	 * Returns the value of the '<em><b>Creditor Supplier Party</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Debit Note. Creditor_ Supplier Party. Supplier Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Creditor</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Debit Note</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Creditor</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Supplier Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Supplier Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creditor Supplier Party</em>'
	 * @see #setCreditorSupplierParty(SupplierPartyType)
	 * @generated
	 */
	public SupplierPartyType getCreditorSupplierParty() {
		return (creditorSupplierParty == null) ? new SupplierPartyType()
				: creditorSupplierParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.debitnote.DebitNoteType#getCreditorSupplierParty <em>Creditor Supplier Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creditor Supplier Party</em>'
	 * @see #getCreditorSupplierParty()
	 * @generated
	 */
	public void setCreditorSupplierParty(
			SupplierPartyType newCreditorSupplierParty) {
		creditorSupplierParty = newCreditorSupplierParty;
	}

	/**
	 * Returns the value of the '<em><b>Payee Party</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Debit Note. Payee_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Payee</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Debit Note</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Payee</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payee Party</em>'
	 * @see #setPayeeParty(PartyType)
	 * @generated
	 */
	public PartyType getPayeeParty() {
		return (payeeParty == null) ? new PartyType() : payeeParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.debitnote.DebitNoteType#getPayeeParty <em>Payee Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payee Party</em>'
	 * @see #getPayeeParty()
	 * @generated
	 */
	public void setPayeeParty(PartyType newPayeeParty) {
		payeeParty = newPayeeParty;
	}

	/**
	 * Returns the value of the '<em><b>Transaction Exchange Rate</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Debit Note. Transaction_ Exchange Rate. Exchange Rate</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Exchange Rate between the Document Currency and the Transaction Currency</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Debit Note</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Transaction</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Exchange Rate</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Exchange Rate</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transaction Exchange Rate</em>'
	 * @see #setTransactionExchangeRate(ExchangeRateType)
	 * @generated
	 */
	public ExchangeRateType getTransactionExchangeRate() {
		return (transactionExchangeRate == null) ? new ExchangeRateType()
				: transactionExchangeRate;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.debitnote.DebitNoteType#getTransactionExchangeRate <em>Transaction Exchange Rate</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Exchange Rate</em>'
	 * @see #getTransactionExchangeRate()
	 * @generated
	 */
	public void setTransactionExchangeRate(
			ExchangeRateType newTransactionExchangeRate) {
		transactionExchangeRate = newTransactionExchangeRate;
	}

	/**
	 * Returns the value of the '<em><b>Tax Exchange Rate</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Debit Note. Tax_ Exchange Rate. Exchange Rate</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Exchange Rate between the Document Currency and the Pricing Currency</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Debit Note</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Tax</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Exchange Rate</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Exchange Rate</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tax Exchange Rate</em>'
	 * @see #setTaxExchangeRate(ExchangeRateType)
	 * @generated
	 */
	public ExchangeRateType getTaxExchangeRate() {
		return (taxExchangeRate == null) ? new ExchangeRateType()
				: taxExchangeRate;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.debitnote.DebitNoteType#getTaxExchangeRate <em>Tax Exchange Rate</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Exchange Rate</em>'
	 * @see #getTaxExchangeRate()
	 * @generated
	 */
	public void setTaxExchangeRate(ExchangeRateType newTaxExchangeRate) {
		taxExchangeRate = newTaxExchangeRate;
	}

	/**
	 * Returns the value of the '<em><b>Pricing Exchange Rate</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Debit Note. Pricing_ Exchange Rate. Exchange Rate</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Exchange Rate between the Document Currency and the Tax Currency</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Debit Note</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Pricing</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Exchange Rate</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Exchange Rate</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pricing Exchange Rate</em>'
	 * @see #setPricingExchangeRate(ExchangeRateType)
	 * @generated
	 */
	public ExchangeRateType getPricingExchangeRate() {
		return (pricingExchangeRate == null) ? new ExchangeRateType()
				: pricingExchangeRate;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.debitnote.DebitNoteType#getPricingExchangeRate <em>Pricing Exchange Rate</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pricing Exchange Rate</em>'
	 * @see #getPricingExchangeRate()
	 * @generated
	 */
	public void setPricingExchangeRate(ExchangeRateType newPricingExchangeRate) {
		pricingExchangeRate = newPricingExchangeRate;
	}

	/**
	 * Returns the value of the '<em><b>Tax Total</b></em>'
	 * The list contents are of type {@link org.openebiz.core.common.cac.TaxTotalType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Debit Note. Tax Total</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to tax total for specific tax types/rates</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Debit Note</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Tax Total</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Tax Total</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tax Total</em>'
	 * @generated
	 */
	public List getTaxTotal() {
		if (taxTotal == null) {
			taxTotal = new ArrayList<TaxTotalType>();
		}
		return taxTotal;
	}

	/**
	 * Returns the value of the '<em><b>Legal Total</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Debit Note. Legal Total</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the total amount payable on the Debit Note including Allowances, Charges and Taxes</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Debit Note</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Legal Total</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Legal Total</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Legal Total</em>'
	 * @see #setLegalTotal(LegalTotalType)
	 * @generated
	 */
	public LegalTotalType getLegalTotal() {
		return (legalTotal == null) ? new LegalTotalType() : legalTotal;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.debitnote.DebitNoteType#getLegalTotal <em>Legal Total</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legal Total</em>'
	 * @see #getLegalTotal()
	 * @generated
	 */
	public void setLegalTotal(LegalTotalType newLegalTotal) {
		legalTotal = newLegalTotal;
	}

	/**
	 * Returns the value of the '<em><b>Debit Note Line</b></em>'
	 * The list contents are of type {@link org.openebiz.core.common.cac.DebitNoteLineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Debit Note. Debit Note Line</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to one or more Debit Note Lines</ccts:Definition>
	 *               <ccts:Cardinality>1..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Debit Note</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Debit Note Line</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Debit Note Line</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Debit Note Line</em>'
	 * @generated
	 */
	public List getDebitNoteLine() {
		if (debitNoteLine == null) {
			debitNoteLine = new ArrayList<DebitNoteLineType>();
		}
		return debitNoteLine;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.accountingCostCode == null) ? 0 : this.accountingCostCode.hashCode());
		result = PRIME * result + ((this.accountingDocumentReference == null) ? 0 : this.accountingDocumentReference.hashCode());
		result = PRIME * result + ((this.additionalDocumentReference == null) ? 0 : this.additionalDocumentReference.hashCode());
		result = PRIME * result + ((this.contractDocumentReference == null) ? 0 : this.contractDocumentReference.hashCode());
		result = PRIME * result + ((this.copyIndicator == null) ? 0 : this.copyIndicator.hashCode());
		result = PRIME * result + ((this.creditorSupplierParty == null) ? 0 : this.creditorSupplierParty.hashCode());
		result = PRIME * result + ((this.debitNoteLine == null) ? 0 : this.debitNoteLine.hashCode());
		result = PRIME * result + ((this.debtorCustomerParty == null) ? 0 : this.debtorCustomerParty.hashCode());
		result = PRIME * result + ((this.discrepancyResponse == null) ? 0 : this.discrepancyResponse.hashCode());
		result = PRIME * result + ((this.documentCurrencyCode == null) ? 0 : this.documentCurrencyCode.hashCode());
		result = PRIME * result + ((this.gUID == null) ? 0 : this.gUID.hashCode());
		result = PRIME * result + ((this.iD == null) ? 0 : this.iD.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.invoicePeriod == null) ? 0 : this.invoicePeriod.hashCode());
		result = PRIME * result + ((this.issueDate == null) ? 0 : this.issueDate.hashCode());
		result = PRIME * result + ((this.issueTime == null) ? 0 : this.issueTime.hashCode());
		result = PRIME * result + ((this.legalTotal == null) ? 0 : this.legalTotal.hashCode());
		result = PRIME * result + ((this.note == null) ? 0 : this.note.hashCode());
		result = PRIME * result + ((this.orderReference == null) ? 0 : this.orderReference.hashCode());
		result = PRIME * result + ((this.payeeParty == null) ? 0 : this.payeeParty.hashCode());
		result = PRIME * result + ((this.pricingCurrencyCode == null) ? 0 : this.pricingCurrencyCode.hashCode());
		result = PRIME * result + ((this.pricingExchangeRate == null) ? 0 : this.pricingExchangeRate.hashCode());
		result = PRIME * result + ((this.signature == null) ? 0 : this.signature.hashCode());
		result = PRIME * result + ((this.taxCurrencyCode == null) ? 0 : this.taxCurrencyCode.hashCode());
		result = PRIME * result + ((this.taxExchangeRate == null) ? 0 : this.taxExchangeRate.hashCode());
		result = PRIME * result + ((this.taxPointDate == null) ? 0 : this.taxPointDate.hashCode());
		result = PRIME * result + ((this.taxTotal == null) ? 0 : this.taxTotal.hashCode());
		result = PRIME * result + ((this.transactionCurrencyCode == null) ? 0 : this.transactionCurrencyCode.hashCode());
		result = PRIME * result + ((this.transactionExchangeRate == null) ? 0 : this.transactionExchangeRate.hashCode());
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
		final DebitNoteType other = (DebitNoteType) obj;
		if (this.accountingCostCode == null) {
			if (other.accountingCostCode != null)
				return false;
		} else if (!this.accountingCostCode.equals(other.accountingCostCode))
			return false;
		if (this.accountingDocumentReference == null) {
			if (other.accountingDocumentReference != null)
				return false;
		} else if (!this.accountingDocumentReference.equals(other.accountingDocumentReference))
			return false;
		if (this.additionalDocumentReference == null) {
			if (other.additionalDocumentReference != null)
				return false;
		} else if (!this.additionalDocumentReference.equals(other.additionalDocumentReference))
			return false;
		if (this.contractDocumentReference == null) {
			if (other.contractDocumentReference != null)
				return false;
		} else if (!this.contractDocumentReference.equals(other.contractDocumentReference))
			return false;
		if (this.copyIndicator == null) {
			if (other.copyIndicator != null)
				return false;
		} else if (!this.copyIndicator.equals(other.copyIndicator))
			return false;
		if (this.creditorSupplierParty == null) {
			if (other.creditorSupplierParty != null)
				return false;
		} else if (!this.creditorSupplierParty.equals(other.creditorSupplierParty))
			return false;
		if (this.debitNoteLine == null) {
			if (other.debitNoteLine != null)
				return false;
		} else if (!this.debitNoteLine.equals(other.debitNoteLine))
			return false;
		if (this.debtorCustomerParty == null) {
			if (other.debtorCustomerParty != null)
				return false;
		} else if (!this.debtorCustomerParty.equals(other.debtorCustomerParty))
			return false;
		if (this.discrepancyResponse == null) {
			if (other.discrepancyResponse != null)
				return false;
		} else if (!this.discrepancyResponse.equals(other.discrepancyResponse))
			return false;
		if (this.documentCurrencyCode == null) {
			if (other.documentCurrencyCode != null)
				return false;
		} else if (!this.documentCurrencyCode.equals(other.documentCurrencyCode))
			return false;
		if (this.gUID == null) {
			if (other.gUID != null)
				return false;
		} else if (!this.gUID.equals(other.gUID))
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
		if (this.invoicePeriod == null) {
			if (other.invoicePeriod != null)
				return false;
		} else if (!this.invoicePeriod.equals(other.invoicePeriod))
			return false;
		if (this.issueDate == null) {
			if (other.issueDate != null)
				return false;
		} else if (!this.issueDate.equals(other.issueDate))
			return false;
		if (this.issueTime == null) {
			if (other.issueTime != null)
				return false;
		} else if (!this.issueTime.equals(other.issueTime))
			return false;
		if (this.legalTotal == null) {
			if (other.legalTotal != null)
				return false;
		} else if (!this.legalTotal.equals(other.legalTotal))
			return false;
		if (this.note == null) {
			if (other.note != null)
				return false;
		} else if (!this.note.equals(other.note))
			return false;
		if (this.orderReference == null) {
			if (other.orderReference != null)
				return false;
		} else if (!this.orderReference.equals(other.orderReference))
			return false;
		if (this.payeeParty == null) {
			if (other.payeeParty != null)
				return false;
		} else if (!this.payeeParty.equals(other.payeeParty))
			return false;
		if (this.pricingCurrencyCode == null) {
			if (other.pricingCurrencyCode != null)
				return false;
		} else if (!this.pricingCurrencyCode.equals(other.pricingCurrencyCode))
			return false;
		if (this.pricingExchangeRate == null) {
			if (other.pricingExchangeRate != null)
				return false;
		} else if (!this.pricingExchangeRate.equals(other.pricingExchangeRate))
			return false;
		if (this.signature == null) {
			if (other.signature != null)
				return false;
		} else if (!this.signature.equals(other.signature))
			return false;
		if (this.taxCurrencyCode == null) {
			if (other.taxCurrencyCode != null)
				return false;
		} else if (!this.taxCurrencyCode.equals(other.taxCurrencyCode))
			return false;
		if (this.taxExchangeRate == null) {
			if (other.taxExchangeRate != null)
				return false;
		} else if (!this.taxExchangeRate.equals(other.taxExchangeRate))
			return false;
		if (this.taxPointDate == null) {
			if (other.taxPointDate != null)
				return false;
		} else if (!this.taxPointDate.equals(other.taxPointDate))
			return false;
		if (this.taxTotal == null) {
			if (other.taxTotal != null)
				return false;
		} else if (!this.taxTotal.equals(other.taxTotal))
			return false;
		if (this.transactionCurrencyCode == null) {
			if (other.transactionCurrencyCode != null)
				return false;
		} else if (!this.transactionCurrencyCode.equals(other.transactionCurrencyCode))
			return false;
		if (this.transactionExchangeRate == null) {
			if (other.transactionExchangeRate != null)
				return false;
		} else if (!this.transactionExchangeRate.equals(other.transactionExchangeRate))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // DebitNoteType