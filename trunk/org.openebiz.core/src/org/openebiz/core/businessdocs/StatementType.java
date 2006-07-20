/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.businessdocs;

import org.openebiz.core.common.cac.AllowanceChargeType;
import org.openebiz.core.common.cac.CustomerPartyType;
import org.openebiz.core.common.cac.DocumentReferenceType;
import org.openebiz.core.common.cac.PartyType;
import org.openebiz.core.common.cac.PaymentMeansType;
import org.openebiz.core.common.cac.PaymentTermsType;
import org.openebiz.core.common.cac.PeriodType;
import org.openebiz.core.common.cac.SignatureType;
import org.openebiz.core.common.cac.StatementLineType;
import org.openebiz.core.common.cac.SupplierPartyType;
import org.openebiz.core.common.cac.TaxTotalType;

import org.openebiz.core.common.cbc.CopyIndicatorType;
import org.openebiz.core.common.cbc.DocumentCurrencyCodeType;
import org.openebiz.core.common.cbc.GUIDType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.IssueDateType;
import org.openebiz.core.common.cbc.IssueTimeType;
import org.openebiz.core.common.cbc.NoteType;
import org.openebiz.core.common.cbc.TotalBalanceAmountType;
import org.openebiz.core.common.cbc.TotalCreditAmountType;
import org.openebiz.core.common.cbc.TotalDebitAmountType;

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
 *           <ccts:DictionaryEntryName>Statement. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>The document used to specify the status of Orders, Billing and Payment</ccts:Definition>
 *           <ccts:ObjectClass>Statement</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.businessdocs.StatementType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.StatementType#getCopyIndicator <em>Copy Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.StatementType#getGUID <em>GUID</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.StatementType#getIssueDate <em>Issue Date</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.StatementType#getIssueTime <em>Issue Time</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.StatementType#getNote <em>Note</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.StatementType#getDocumentCurrencyCode <em>Document Currency Code</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.StatementType#getTotalDebitAmount <em>Total Debit Amount</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.StatementType#getTotalCreditAmount <em>Total Credit Amount</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.StatementType#getTotalBalanceAmount <em>Total Balance Amount</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.StatementType#getStatementPeriod <em>Statement Period</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.StatementType#getAdditionalDocumentReference <em>Additional Document Reference</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.StatementType#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.StatementType#getCreditorSupplierParty <em>Creditor Supplier Party</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.StatementType#getDebtorCustomerParty <em>Debtor Customer Party</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.StatementType#getBuyerCustomerParty <em>Buyer Customer Party</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.StatementType#getSellerSupplierParty <em>Seller Supplier Party</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.StatementType#getOriginatorCustomerParty <em>Originator Customer Party</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.StatementType#getPayeeParty <em>Payee Party</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.StatementType#getPaymentMeans <em>Payment Means</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.StatementType#getPaymentTerms <em>Payment Terms</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.StatementType#getAllowanceCharge <em>Allowance Charge</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.StatementType#getTaxTotal <em>Tax Total</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.StatementType#getStatementLine <em>Statement Line</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatementType implements Serializable {
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
	 * The cached value of the '{@link #getDocumentCurrencyCode() <em>Document Currency Code</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentCurrencyCode()
	 * @generated
	 * @ordered
	 */
	protected DocumentCurrencyCodeType documentCurrencyCode = null;

	/**
	 * The cached value of the '{@link #getTotalDebitAmount() <em>Total Debit Amount</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalDebitAmount()
	 * @generated
	 * @ordered
	 */
	protected TotalDebitAmountType totalDebitAmount = null;

	/**
	 * The cached value of the '{@link #getTotalCreditAmount() <em>Total Credit Amount</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCreditAmount()
	 * @generated
	 * @ordered
	 */
	protected TotalCreditAmountType totalCreditAmount = null;

	/**
	 * The cached value of the '{@link #getTotalBalanceAmount() <em>Total Balance Amount</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalBalanceAmount()
	 * @generated
	 * @ordered
	 */
	protected TotalBalanceAmountType totalBalanceAmount = null;

	/**
	 * The cached value of the '{@link #getStatementPeriod() <em>Statement Period</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementPeriod()
	 * @generated
	 * @ordered
	 */
	protected PeriodType statementPeriod = null;

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
	 * The cached value of the '{@link #getCreditorSupplierParty() <em>Creditor Supplier Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditorSupplierParty()
	 * @generated
	 * @ordered
	 */
	protected SupplierPartyType creditorSupplierParty = null;

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
	 * The cached value of the '{@link #getBuyerCustomerParty() <em>Buyer Customer Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuyerCustomerParty()
	 * @generated
	 * @ordered
	 */
	protected CustomerPartyType buyerCustomerParty = null;

	/**
	 * The cached value of the '{@link #getSellerSupplierParty() <em>Seller Supplier Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSellerSupplierParty()
	 * @generated
	 * @ordered
	 */
	protected SupplierPartyType sellerSupplierParty = null;

	/**
	 * The cached value of the '{@link #getOriginatorCustomerParty() <em>Originator Customer Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginatorCustomerParty()
	 * @generated
	 * @ordered
	 */
	protected CustomerPartyType originatorCustomerParty = null;

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
	 * The cached value of the '{@link #getPaymentMeans() <em>Payment Means</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMeans()
	 * @generated
	 * @ordered
	 */
	protected PaymentMeansType paymentMeans = null;

	/**
	 * The cached value of the '{@link #getPaymentTerms() <em>Payment Terms</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentTerms()
	 * @generated
	 * @ordered
	 */
	protected List  paymentTerms = null;

	/**
	 * The cached value of the '{@link #getAllowanceCharge() <em>Allowance Charge</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowanceCharge()
	 * @generated
	 * @ordered
	 */
	protected List  allowanceCharge = null;

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
	 * The cached value of the '{@link #getStatementLine() <em>Statement Line</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementLine()
	 * @generated
	 * @ordered
	 */
	protected List  statementLine = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementType() {
		super();
		this.init();
	}
	
	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.additionalDocumentReference = this.getAdditionalDocumentReference();
		this.allowanceCharge = this.getAllowanceCharge();
		this.buyerCustomerParty = this.getBuyerCustomerParty();
		this.copyIndicator = this.getCopyIndicator();
		this.creditorSupplierParty = this.getCreditorSupplierParty();
		this.debtorCustomerParty = this.getDebtorCustomerParty();
		this.documentCurrencyCode = this.getDocumentCurrencyCode();
		this.gUID = this.getGUID();
		this.iD = this.getID();
		this.issueDate = this.getIssueDate();
		this.issueTime = this.getIssueTime();
		this.note = this.getNote();
		this.originatorCustomerParty = this.getOriginatorCustomerParty();
		this.payeeParty = this.getPayeeParty();
		this.paymentMeans = this.getPaymentMeans();
		this.paymentTerms = this.getPaymentTerms();
		this.sellerSupplierParty = this.getSellerSupplierParty();
		this.signature = this.getSignature();
		this.statementLine = this.getStatementLine();
		this.statementPeriod = this.getStatementPeriod();
		this.taxTotal = this.getTaxTotal();
		this.totalBalanceAmount = this.getTotalBalanceAmount();
		this.totalCreditAmount = this.getTotalCreditAmount();
		this.totalDebitAmount = this.getTotalDebitAmount();
	}

	/**
	 * Returns the value of the '<em><b>ID</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Statement. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An identifier for the Statement assigned by the Creditor</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.statement.StatementType#getID <em>ID</em>}'
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
	 *               <ccts:DictionaryEntryName>Statement. Copy Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Indicates whether the Statement is a copy (true) or not (false)</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.statement.StatementType#getCopyIndicator <em>Copy Indicator</em>}'
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
	 *               <ccts:DictionaryEntryName>Statement. Globally Unique Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A computer-generated globally unique identifier (GUID) for the Statement instance</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.statement.StatementType#getGUID <em>GUID</em>}'
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
	 *               <ccts:DictionaryEntryName>Statement. Issue Date. Date</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The date assigned by the Creditor on which the Statement was issued</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.statement.StatementType#getIssueDate <em>Issue Date</em>}'
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
	 *               <ccts:DictionaryEntryName>Statement. Issue Time. Time</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The time assigned by the Creditor on which the Statement was issued</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.statement.StatementType#getIssueTime <em>Issue Time</em>}'
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
	 *               <ccts:DictionaryEntryName>Statement. Note. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Free form text applying to the Statement. This element may contain notes or any other similar information that is not contained explicitly in another structure.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.statement.StatementType#getNote <em>Note</em>}'
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
	 * Returns the value of the '<em><b>Document Currency Code</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Statement. Document_ Currency. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The default currency for the Statement</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.statement.StatementType#getDocumentCurrencyCode <em>Document Currency Code</em>}'
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
	 * Returns the value of the '<em><b>Total Debit Amount</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Statement. Total_ Debit Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The totals of all debit amounts for the Statement</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Total</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Debit Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Debit Amount</em>'
	 * @see #setTotalDebitAmount(TotalDebitAmountType)
	 * @generated
	 */
	public TotalDebitAmountType getTotalDebitAmount() {
		return (totalDebitAmount == null) ? new TotalDebitAmountType()
				: totalDebitAmount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.statement.StatementType#getTotalDebitAmount <em>Total Debit Amount</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Debit Amount</em>'
	 * @see #getTotalDebitAmount()
	 * @generated
	 */
	public void setTotalDebitAmount(TotalDebitAmountType newTotalDebitAmount) {
		totalDebitAmount = newTotalDebitAmount;
	}

	/**
	 * Returns the value of the '<em><b>Total Credit Amount</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Statement. Total_ Credit Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The totals of all credit amounts for the Statement</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Total</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Credit Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Credit Amount</em>'
	 * @see #setTotalCreditAmount(TotalCreditAmountType)
	 * @generated
	 */
	public TotalCreditAmountType getTotalCreditAmount() {
		return (totalCreditAmount == null) ? new TotalCreditAmountType()
				: totalCreditAmount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.statement.StatementType#getTotalCreditAmount <em>Total Credit Amount</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Credit Amount</em>'
	 * @see #getTotalCreditAmount()
	 * @generated
	 */
	public void setTotalCreditAmount(TotalCreditAmountType newTotalCreditAmount) {
		totalCreditAmount = newTotalCreditAmount;
	}

	/**
	 * Returns the value of the '<em><b>Total Balance Amount</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Statement. Total_ Balance Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The total amount for the Statement</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Total</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Balance Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Balance Amount</em>'
	 * @see #setTotalBalanceAmount(TotalBalanceAmountType)
	 * @generated
	 */
	public TotalBalanceAmountType getTotalBalanceAmount() {
		return (totalBalanceAmount == null) ? new TotalBalanceAmountType()
				: totalBalanceAmount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.statement.StatementType#getTotalBalanceAmount <em>Total Balance Amount</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Balance Amount</em>'
	 * @see #getTotalBalanceAmount()
	 * @generated
	 */
	public void setTotalBalanceAmount(
			TotalBalanceAmountType newTotalBalanceAmount) {
		totalBalanceAmount = newTotalBalanceAmount;
	}

	/**
	 * Returns the value of the '<em><b>Statement Period</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Statement. Statement_ Period. Period</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to period(s) to which the Statement applies</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Statement</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Period</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Period</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statement Period</em>'
	 * @see #setStatementPeriod(PeriodType)
	 * @generated
	 */
	public PeriodType getStatementPeriod() {
		return (statementPeriod == null) ? new PeriodType() : statementPeriod;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.statement.StatementType#getStatementPeriod <em>Statement Period</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement Period</em>'
	 * @see #getStatementPeriod()
	 * @generated
	 */
	public void setStatementPeriod(PeriodType newStatementPeriod) {
		statementPeriod = newStatementPeriod;
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
	 *               <ccts:DictionaryEntryName>Statement. Additional_ Document Reference. Document Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Refers to various non-UBL documents related to the statement.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement</ccts:ObjectClass>
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
	 *               <ccts:DictionaryEntryName>Statement. Signature</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Associates the Statement with zero or more signatures.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement</ccts:ObjectClass>
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
	 * Returns the value of the '<em><b>Creditor Supplier Party</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Statement. Creditor_ Supplier Party. Supplier Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Creditor</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.statement.StatementType#getCreditorSupplierParty <em>Creditor Supplier Party</em>}'
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
	 * Returns the value of the '<em><b>Debtor Customer Party</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Statement. Debtor_ Customer Party. Customer Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Debtor</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.statement.StatementType#getDebtorCustomerParty <em>Debtor Customer Party</em>}'
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
	 * Returns the value of the '<em><b>Buyer Customer Party</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Statement. Buyer_ Customer Party. Customer Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Buyer</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Buyer</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Customer Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Customer Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Buyer Customer Party</em>'
	 * @see #setBuyerCustomerParty(CustomerPartyType)
	 * @generated
	 */
	public CustomerPartyType getBuyerCustomerParty() {
		return (buyerCustomerParty == null) ? new CustomerPartyType()
				: buyerCustomerParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.statement.StatementType#getBuyerCustomerParty <em>Buyer Customer Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buyer Customer Party</em>'
	 * @see #getBuyerCustomerParty()
	 * @generated
	 */
	public void setBuyerCustomerParty(CustomerPartyType newBuyerCustomerParty) {
		buyerCustomerParty = newBuyerCustomerParty;
	}

	/**
	 * Returns the value of the '<em><b>Seller Supplier Party</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Statement. Seller_ Supplier Party. Supplier Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Seller</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Seller</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Supplier Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Supplier Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Seller Supplier Party</em>'
	 * @see #setSellerSupplierParty(SupplierPartyType)
	 * @generated
	 */
	public SupplierPartyType getSellerSupplierParty() {
		return (sellerSupplierParty == null) ? new SupplierPartyType()
				: sellerSupplierParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.statement.StatementType#getSellerSupplierParty <em>Seller Supplier Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seller Supplier Party</em>'
	 * @see #getSellerSupplierParty()
	 * @generated
	 */
	public void setSellerSupplierParty(SupplierPartyType newSellerSupplierParty) {
		sellerSupplierParty = newSellerSupplierParty;
	}

	/**
	 * Returns the value of the '<em><b>Originator Customer Party</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Statement. Originator_ Customer Party. Customer Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Originator</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Originator</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Customer Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Customer Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Originator Customer Party</em>'
	 * @see #setOriginatorCustomerParty(CustomerPartyType)
	 * @generated
	 */
	public CustomerPartyType getOriginatorCustomerParty() {
		return (originatorCustomerParty == null) ? new CustomerPartyType()
				: originatorCustomerParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.statement.StatementType#getOriginatorCustomerParty <em>Originator Customer Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Originator Customer Party</em>'
	 * @see #getOriginatorCustomerParty()
	 * @generated
	 */
	public void setOriginatorCustomerParty(
			CustomerPartyType newOriginatorCustomerParty) {
		originatorCustomerParty = newOriginatorCustomerParty;
	}

	/**
	 * Returns the value of the '<em><b>Payee Party</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Statement. Payee_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Payee</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.statement.StatementType#getPayeeParty <em>Payee Party</em>}'
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
	 * Returns the value of the '<em><b>Payment Means</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Statement. Payment Means</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Payment Means</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Payment Means</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Payment Means</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Means</em>'
	 * @see #setPaymentMeans(PaymentMeansType)
	 * @generated
	 */
	public PaymentMeansType getPaymentMeans() {
		return (paymentMeans == null) ? new PaymentMeansType() : paymentMeans;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.statement.StatementType#getPaymentMeans <em>Payment Means</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Means</em>'
	 * @see #getPaymentMeans()
	 * @generated
	 */
	public void setPaymentMeans(PaymentMeansType newPaymentMeans) {
		paymentMeans = newPaymentMeans;
	}

	/**
	 * Returns the value of the '<em><b>Payment Terms</b></em>'
	 * The list contents are of type {@link org.openebiz.core.common.cac.PaymentTermsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Statement. Payment Terms</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Payment Terms</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Payment Terms</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Payment Terms</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Terms</em>'
	 * @generated
	 */
	public List getPaymentTerms() {
		if (paymentTerms == null) {
			paymentTerms = new ArrayList<PaymentTermsType>();
		}
		return paymentTerms;
	}

	/**
	 * Returns the value of the '<em><b>Allowance Charge</b></em>'
	 * The list contents are of type {@link org.openebiz.core.common.cac.AllowanceChargeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Statement. Allowance Charge</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Allowances and Charges that apply to the Statement period as a whole</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Allowance Charge</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Allowance Charge</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allowance Charge</em>'
	 * @generated
	 */
	public List getAllowanceCharge() {
		if (allowanceCharge == null) {
			allowanceCharge = new ArrayList<AllowanceChargeType>();
		}
		return allowanceCharge;
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
	 *               <ccts:DictionaryEntryName>Statement. Tax Total</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association with summary information for particular taxes.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement</ccts:ObjectClass>
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
	 * Returns the value of the '<em><b>Statement Line</b></em>'
	 * The list contents are of type {@link org.openebiz.core.common.cac.StatementLineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Statement. Statement Line</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to one or more Statement Lines</ccts:Definition>
	 *               <ccts:Cardinality>1..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Statement Line</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Statement Line</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statement Line</em>'
	 * @generated
	 */
	public List getStatementLine() {
		if (statementLine == null) {
			statementLine = new ArrayList<StatementLineType>();
		}
		return statementLine;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.additionalDocumentReference == null) ? 0 : this.additionalDocumentReference.hashCode());
		result = PRIME * result + ((this.allowanceCharge == null) ? 0 : this.allowanceCharge.hashCode());
		result = PRIME * result + ((this.buyerCustomerParty == null) ? 0 : this.buyerCustomerParty.hashCode());
		result = PRIME * result + ((this.copyIndicator == null) ? 0 : this.copyIndicator.hashCode());
		result = PRIME * result + ((this.creditorSupplierParty == null) ? 0 : this.creditorSupplierParty.hashCode());
		result = PRIME * result + ((this.debtorCustomerParty == null) ? 0 : this.debtorCustomerParty.hashCode());
		result = PRIME * result + ((this.documentCurrencyCode == null) ? 0 : this.documentCurrencyCode.hashCode());
		result = PRIME * result + ((this.gUID == null) ? 0 : this.gUID.hashCode());
		result = PRIME * result + ((this.iD == null) ? 0 : this.iD.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.issueDate == null) ? 0 : this.issueDate.hashCode());
		result = PRIME * result + ((this.issueTime == null) ? 0 : this.issueTime.hashCode());
		result = PRIME * result + ((this.note == null) ? 0 : this.note.hashCode());
		result = PRIME * result + ((this.originatorCustomerParty == null) ? 0 : this.originatorCustomerParty.hashCode());
		result = PRIME * result + ((this.payeeParty == null) ? 0 : this.payeeParty.hashCode());
		result = PRIME * result + ((this.paymentMeans == null) ? 0 : this.paymentMeans.hashCode());
		result = PRIME * result + ((this.paymentTerms == null) ? 0 : this.paymentTerms.hashCode());
		result = PRIME * result + ((this.sellerSupplierParty == null) ? 0 : this.sellerSupplierParty.hashCode());
		result = PRIME * result + ((this.signature == null) ? 0 : this.signature.hashCode());
		result = PRIME * result + ((this.statementLine == null) ? 0 : this.statementLine.hashCode());
		result = PRIME * result + ((this.statementPeriod == null) ? 0 : this.statementPeriod.hashCode());
		result = PRIME * result + ((this.taxTotal == null) ? 0 : this.taxTotal.hashCode());
		result = PRIME * result + ((this.totalBalanceAmount == null) ? 0 : this.totalBalanceAmount.hashCode());
		result = PRIME * result + ((this.totalCreditAmount == null) ? 0 : this.totalCreditAmount.hashCode());
		result = PRIME * result + ((this.totalDebitAmount == null) ? 0 : this.totalDebitAmount.hashCode());
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
		final StatementType other = (StatementType) obj;
		if (this.additionalDocumentReference == null) {
			if (other.additionalDocumentReference != null)
				return false;
		} else if (!this.additionalDocumentReference.equals(other.additionalDocumentReference))
			return false;
		if (this.allowanceCharge == null) {
			if (other.allowanceCharge != null)
				return false;
		} else if (!this.allowanceCharge.equals(other.allowanceCharge))
			return false;
		if (this.buyerCustomerParty == null) {
			if (other.buyerCustomerParty != null)
				return false;
		} else if (!this.buyerCustomerParty.equals(other.buyerCustomerParty))
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
		if (this.debtorCustomerParty == null) {
			if (other.debtorCustomerParty != null)
				return false;
		} else if (!this.debtorCustomerParty.equals(other.debtorCustomerParty))
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
		if (this.note == null) {
			if (other.note != null)
				return false;
		} else if (!this.note.equals(other.note))
			return false;
		if (this.originatorCustomerParty == null) {
			if (other.originatorCustomerParty != null)
				return false;
		} else if (!this.originatorCustomerParty.equals(other.originatorCustomerParty))
			return false;
		if (this.payeeParty == null) {
			if (other.payeeParty != null)
				return false;
		} else if (!this.payeeParty.equals(other.payeeParty))
			return false;
		if (this.paymentMeans == null) {
			if (other.paymentMeans != null)
				return false;
		} else if (!this.paymentMeans.equals(other.paymentMeans))
			return false;
		if (this.paymentTerms == null) {
			if (other.paymentTerms != null)
				return false;
		} else if (!this.paymentTerms.equals(other.paymentTerms))
			return false;
		if (this.sellerSupplierParty == null) {
			if (other.sellerSupplierParty != null)
				return false;
		} else if (!this.sellerSupplierParty.equals(other.sellerSupplierParty))
			return false;
		if (this.signature == null) {
			if (other.signature != null)
				return false;
		} else if (!this.signature.equals(other.signature))
			return false;
		if (this.statementLine == null) {
			if (other.statementLine != null)
				return false;
		} else if (!this.statementLine.equals(other.statementLine))
			return false;
		if (this.statementPeriod == null) {
			if (other.statementPeriod != null)
				return false;
		} else if (!this.statementPeriod.equals(other.statementPeriod))
			return false;
		if (this.taxTotal == null) {
			if (other.taxTotal != null)
				return false;
		} else if (!this.taxTotal.equals(other.taxTotal))
			return false;
		if (this.totalBalanceAmount == null) {
			if (other.totalBalanceAmount != null)
				return false;
		} else if (!this.totalBalanceAmount.equals(other.totalBalanceAmount))
			return false;
		if (this.totalCreditAmount == null) {
			if (other.totalCreditAmount != null)
				return false;
		} else if (!this.totalCreditAmount.equals(other.totalCreditAmount))
			return false;
		if (this.totalDebitAmount == null) {
			if (other.totalDebitAmount != null)
				return false;
		} else if (!this.totalDebitAmount.equals(other.totalDebitAmount))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // StatementType