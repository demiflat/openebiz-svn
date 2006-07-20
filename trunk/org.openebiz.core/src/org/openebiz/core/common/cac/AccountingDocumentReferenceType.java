/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.DocumentCurrencyCodeType;
import org.openebiz.core.common.cbc.TaxCurrencyCodeType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accounting Document Reference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Accounting Document Reference. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>information directly relating to a related document</ccts:Definition>
 *           <ccts:ObjectClass>Accounting Document Reference</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.AccountingDocumentReferenceType#getDocumentCurrencyCode <em>Document Currency Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AccountingDocumentReferenceType#getTaxCurrencyCode <em>Tax Currency Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AccountingDocumentReferenceType#getAdditionalDocumentReference <em>Additional Document Reference</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AccountingDocumentReferenceType#getStatementDocumentReference <em>Statement Document Reference</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AccountingDocumentReferenceType#getInvoiceDocumentReference <em>Invoice Document Reference</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AccountingDocumentReferenceType#getSelfBilledInvoiceDocumentReference <em>Self Billed Invoice Document Reference</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AccountingDocumentReferenceType#getCreditNoteDocumentReference <em>Credit Note Document Reference</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AccountingDocumentReferenceType#getSelfBilledCreditNoteDocumentReference <em>Self Billed Credit Note Document Reference</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AccountingDocumentReferenceType#getDebitNoteDocumentReference <em>Debit Note Document Reference</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AccountingDocumentReferenceType#getRemittanceDocumentReference <em>Remittance Document Reference</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AccountingDocumentReferenceType#getPaymentMeans <em>Payment Means</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AccountingDocumentReferenceType#getPaymentTerms <em>Payment Terms</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AccountingDocumentReferenceType#getLegalTotal <em>Legal Total</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AccountingDocumentReferenceType#getTaxTotal <em>Tax Total</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AccountingDocumentReferenceType#getAccountingDocumentReferenceLine <em>Accounting Document Reference Line</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AccountingDocumentReferenceType implements Serializable {
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
	 * The cached value of the '{@link #getDocumentCurrencyCode() <em>Document Currency Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentCurrencyCode()
	 * @generated
	 * @ordered
	 */
	protected DocumentCurrencyCodeType documentCurrencyCode = null;

	/**
	 * The cached value of the '{@link #getTaxCurrencyCode() <em>Tax Currency Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxCurrencyCode()
	 * @generated
	 * @ordered
	 */
	protected TaxCurrencyCodeType taxCurrencyCode = null;

	/**
	 * The cached value of the '{@link #getAdditionalDocumentReference() <em>Additional Document Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalDocumentReference()
	 * @generated
	 * @ordered
	 */
	protected List additionalDocumentReference = null;

	/**
	 * The cached value of the '{@link #getStatementDocumentReference() <em>Statement Document Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementDocumentReference()
	 * @generated
	 * @ordered
	 */
	protected List statementDocumentReference = null;

	/**
	 * The cached value of the '{@link #getInvoiceDocumentReference() <em>Invoice Document Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceDocumentReference()
	 * @generated
	 * @ordered
	 */
	protected List invoiceDocumentReference = null;

	/**
	 * The cached value of the '{@link #getSelfBilledInvoiceDocumentReference() <em>Self Billed Invoice Document Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfBilledInvoiceDocumentReference()
	 * @generated
	 * @ordered
	 */
	protected List selfBilledInvoiceDocumentReference = null;

	/**
	 * The cached value of the '{@link #getCreditNoteDocumentReference() <em>Credit Note Document Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditNoteDocumentReference()
	 * @generated
	 * @ordered
	 */
	protected List creditNoteDocumentReference = null;

	/**
	 * The cached value of the '{@link #getSelfBilledCreditNoteDocumentReference() <em>Self Billed Credit Note Document Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfBilledCreditNoteDocumentReference()
	 * @generated
	 * @ordered
	 */
	protected List selfBilledCreditNoteDocumentReference = null;

	/**
	 * The cached value of the '{@link #getDebitNoteDocumentReference() <em>Debit Note Document Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebitNoteDocumentReference()
	 * @generated
	 * @ordered
	 */
	protected List debitNoteDocumentReference = null;

	/**
	 * The cached value of the '{@link #getRemittanceDocumentReference() <em>Remittance Document Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemittanceDocumentReference()
	 * @generated
	 * @ordered
	 */
	protected List remittanceDocumentReference = null;

	/**
	 * The cached value of the '{@link #getPaymentMeans() <em>Payment Means</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMeans()
	 * @generated
	 * @ordered
	 */
	protected PaymentMeansType paymentMeans = null;

	/**
	 * The cached value of the '{@link #getPaymentTerms() <em>Payment Terms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentTerms()
	 * @generated
	 * @ordered
	 */
	protected List paymentTerms = null;

	/**
	 * The cached value of the '{@link #getLegalTotal() <em>Legal Total</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegalTotal()
	 * @generated
	 * @ordered
	 */
	protected List legalTotal = null;

	/**
	 * The cached value of the '{@link #getTaxTotal() <em>Tax Total</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxTotal()
	 * @generated
	 * @ordered
	 */
	protected List taxTotal = null;

	/**
	 * The cached value of the '{@link #getAccountingDocumentReferenceLine() <em>Accounting Document Reference Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountingDocumentReferenceLine()
	 * @generated
	 * @ordered
	 */
	protected AccountingDocumentReferenceLineType accountingDocumentReferenceLine = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public AccountingDocumentReferenceType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.documentCurrencyCode = this.getDocumentCurrencyCode();
		this.taxCurrencyCode = this.getTaxCurrencyCode();
		this.additionalDocumentReference = this.getAdditionalDocumentReference();
		this.statementDocumentReference = this.getStatementDocumentReference();
		this.invoiceDocumentReference = this.getInvoiceDocumentReference();
		this.selfBilledInvoiceDocumentReference = this.getSelfBilledInvoiceDocumentReference();
		this.creditNoteDocumentReference = this.getCreditNoteDocumentReference();
		this.selfBilledCreditNoteDocumentReference = this.getSelfBilledCreditNoteDocumentReference();
		this.debitNoteDocumentReference = this.getDebitNoteDocumentReference();
		this.remittanceDocumentReference = this.getRemittanceDocumentReference();
		this.paymentMeans = this.getPaymentMeans();
		this.paymentTerms = this.getPaymentTerms();
		this.legalTotal = this.getLegalTotal();
		this.taxTotal = this.getTaxTotal();
		this.accountingDocumentReferenceLine = this.getAccountingDocumentReferenceLine();
	}
	
	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		return sdisplay.toString();
	}
	
	/**
	 * Returns the value of the '<em><b>Document Currency Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Accounting Document Reference. Document_ Currency. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the currency in which the document is presented. This may be the same currency as the pricing or as the tax.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Accounting Document Reference</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Document</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Currency</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Currency_ Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Currency Code</em>' containment reference.
	 * @see #setDocumentCurrencyCode(DocumentCurrencyCodeType)
	 * @generated
	 */
	public DocumentCurrencyCodeType getDocumentCurrencyCode() {
		return (documentCurrencyCode == null) ? new DocumentCurrencyCodeType()
				: documentCurrencyCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AccountingDocumentReferenceType#getDocumentCurrencyCode <em>Document Currency Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Currency Code</em>' containment reference.
	 * @see #getDocumentCurrencyCode()
	 * @generated
	 */
	public void setDocumentCurrencyCode(
			DocumentCurrencyCodeType newDocumentCurrencyCode) {
		documentCurrencyCode = newDocumentCurrencyCode;
	}

	/**
	 * Returns the value of the '<em><b>Tax Currency Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Accounting Document Reference. Tax_ Currency. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the currency in which the tax on the document is presented. This may be the same currency as the pricing or as the document itself.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Accounting Document Reference</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Tax</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Currency</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Currency_ Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tax Currency Code</em>' containment reference.
	 * @see #setTaxCurrencyCode(TaxCurrencyCodeType)
	 * @generated
	 */
	public TaxCurrencyCodeType getTaxCurrencyCode() {
		return (taxCurrencyCode == null) ? new TaxCurrencyCodeType()
				: taxCurrencyCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AccountingDocumentReferenceType#getTaxCurrencyCode <em>Tax Currency Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Currency Code</em>' containment reference.
	 * @see #getTaxCurrencyCode()
	 * @generated
	 */
	public void setTaxCurrencyCode(TaxCurrencyCodeType newTaxCurrencyCode) {
		taxCurrencyCode = newTaxCurrencyCode;
	}

	/**
	 * Returns the value of the '<em><b>Additional Document Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.DocumentReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Accounting Document Reference. Additional_ Document Reference. Document Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Provides other means of identifying a Line with a document which is being related</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Accounting Document Reference</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Additional</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Document Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Document Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Document Reference</em>' containment reference list.
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
	 * Returns the value of the '<em><b>Statement Document Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.DocumentReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Accounting Document Reference. Statement_ Document Reference. Document Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Provides a means of associating a Line (optionally) with one or more other Statements of Accounts which are being related</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Accounting Document Reference</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Statement</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Document Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Document Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statement Document Reference</em>' containment reference list.
	 * @generated
	 */
	public List getStatementDocumentReference() {
		if (statementDocumentReference == null) {
			statementDocumentReference = new ArrayList<
					DocumentReferenceType>();
		}
		return statementDocumentReference;
	}

	/**
	 * Returns the value of the '<em><b>Invoice Document Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.DocumentReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Accounting Document Reference. Invoice_ Document Reference. Document Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Provides a means of associating a Line (optionally) with one or more invoices which are being related</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Accounting Document Reference</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Invoice</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Document Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Document Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invoice Document Reference</em>' containment reference list.
	 * @generated
	 */
	public List getInvoiceDocumentReference() {
		if (invoiceDocumentReference == null) {
			invoiceDocumentReference = new ArrayList<
					DocumentReferenceType>();
		}
		return invoiceDocumentReference;
	}

	/**
	 * Returns the value of the '<em><b>Self Billed Invoice Document Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.DocumentReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Accounting Document Reference. Self Billed Invoice_ Document Reference. Document Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Provides a means of associating a Line (optionally) with one or more self billed invoices which are being related</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Accounting Document Reference</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Self Billed Invoice</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Document Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Document Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Self Billed Invoice Document Reference</em>' containment reference list.
	 * @generated
	 */
	public List getSelfBilledInvoiceDocumentReference() {
		if (selfBilledInvoiceDocumentReference == null) {
			selfBilledInvoiceDocumentReference = new ArrayList<
					DocumentReferenceType>();
		}
		return selfBilledInvoiceDocumentReference;
	}

	/**
	 * Returns the value of the '<em><b>Credit Note Document Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.DocumentReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Accounting Document Reference. Credit Note_ Document Reference. Document Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Provides a means of associating a Line (optionally) with one or more credit notes</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Accounting Document Reference</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Credit Note</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Document Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Document Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Credit Note Document Reference</em>' containment reference list.
	 * @generated
	 */
	public List getCreditNoteDocumentReference() {
		if (creditNoteDocumentReference == null) {
			creditNoteDocumentReference = new ArrayList<
					DocumentReferenceType>();
		}
		return creditNoteDocumentReference;
	}

	/**
	 * Returns the value of the '<em><b>Self Billed Credit Note Document Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.DocumentReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Accounting Document Reference. Self Billed Credit Note_ Document Reference. Document Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Provides a means of associating a Line (optionally) with one or more self billed credit notes</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Accounting Document Reference</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Self Billed Credit Note</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Document Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Document Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Self Billed Credit Note Document Reference</em>' containment reference list.
	 * @generated
	 */
	public List getSelfBilledCreditNoteDocumentReference() {
		if (selfBilledCreditNoteDocumentReference == null) {
			selfBilledCreditNoteDocumentReference = new ArrayList<
					DocumentReferenceType>();
		}
		return selfBilledCreditNoteDocumentReference;
	}

	/**
	 * Returns the value of the '<em><b>Debit Note Document Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.DocumentReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Accounting Document Reference. Debit Note_ Document Reference. Document Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Provides a means of associating a Line (optionally) with one or more debit notes</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Accounting Document Reference</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Debit Note</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Document Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Document Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Debit Note Document Reference</em>' containment reference list.
	 * @generated
	 */
	public List getDebitNoteDocumentReference() {
		if (debitNoteDocumentReference == null) {
			debitNoteDocumentReference = new ArrayList<
					DocumentReferenceType>();
		}
		return debitNoteDocumentReference;
	}

	/**
	 * Returns the value of the '<em><b>Remittance Document Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.DocumentReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Accounting Document Reference. Remittance_ Document Reference. Document Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Provides a means of associating a Line (optionally) with one or more remittance documents which are being related</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Accounting Document Reference</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Remittance</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Document Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Document Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remittance Document Reference</em>' containment reference list.
	 * @generated
	 */
	public List getRemittanceDocumentReference() {
		if (remittanceDocumentReference == null) {
			remittanceDocumentReference = new ArrayList<
					DocumentReferenceType>();
		}
		return remittanceDocumentReference;
	}

	/**
	 * Returns the value of the '<em><b>Payment Means</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Accounting Document Reference. Payment Means</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>associates the Line with the expected means of payment.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Accounting Document Reference</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Payment Means</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Payment Means</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Means</em>' containment reference.
	 * @see #setPaymentMeans(PaymentMeansType)
	 * @generated
	 */
	public PaymentMeansType getPaymentMeans() {
		return (paymentMeans == null) ? new PaymentMeansType() : paymentMeans;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AccountingDocumentReferenceType#getPaymentMeans <em>Payment Means</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Means</em>' containment reference.
	 * @see #getPaymentMeans()
	 * @generated
	 */
	public void setPaymentMeans(PaymentMeansType newPaymentMeans) {
		paymentMeans = newPaymentMeans;
	}

	/**
	 * Returns the value of the '<em><b>Payment Terms</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.PaymentTermsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Accounting Document Reference. Payment Terms</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>associates the Line with the payment terms applicable/offered.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Accounting Document Reference</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Payment Terms</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Payment Terms</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Terms</em>' containment reference list.
	 * @generated
	 */
	public List getPaymentTerms() {
		if (paymentTerms == null) {
			paymentTerms = new ArrayList<PaymentTermsType>();
		}
		return paymentTerms;
	}

	/**
	 * Returns the value of the '<em><b>Legal Total</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.LegalTotalType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Accounting Document Reference. Legal Total</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>associates the Line (optionally) with summary information of the calculated total amounts that are required on the related document for legal purposes.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Accounting Document Reference</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Legal Total</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Legal Total</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Legal Total</em>' containment reference list.
	 * @generated
	 */
	public List getLegalTotal() {
		if (legalTotal == null) {
			legalTotal = new ArrayList<LegalTotalType>();
		}
		return legalTotal;
	}

	/**
	 * Returns the value of the '<em><b>Tax Total</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.TaxTotalType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Accounting Document Reference. Tax Total</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>associates the Line (optionally) with summary information of the calculated total amounts that are required on the related document for legal purposes.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Accounting Document Reference</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Tax Total</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Tax Total</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tax Total</em>' containment reference list.
	 * @generated
	 */
	public List getTaxTotal() {
		if (taxTotal == null) {
			taxTotal = new ArrayList<TaxTotalType>();
		}
		return taxTotal;
	}

	/**
	 * Returns the value of the '<em><b>Accounting Document Reference Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Accounting Document Reference. Accounting Document Reference Line</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition/>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Accounting Document Reference</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Accounting Document Reference Line</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Accounting Document Reference Line</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accounting Document Reference Line</em>' containment reference.
	 * @see #setAccountingDocumentReferenceLine(AccountingDocumentReferenceLineType)
	 * @generated
	 */
	public AccountingDocumentReferenceLineType getAccountingDocumentReferenceLine() {
		return (accountingDocumentReferenceLine == null) ? new AccountingDocumentReferenceLineType()
				: accountingDocumentReferenceLine;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AccountingDocumentReferenceType#getAccountingDocumentReferenceLine <em>Accounting Document Reference Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accounting Document Reference Line</em>' containment reference.
	 * @see #getAccountingDocumentReferenceLine()
	 * @generated
	 */
	public void setAccountingDocumentReferenceLine(
			AccountingDocumentReferenceLineType newAccountingDocumentReferenceLine) {
		accountingDocumentReferenceLine = newAccountingDocumentReferenceLine;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.accountingDocumentReferenceLine == null) ? 0 : this.accountingDocumentReferenceLine.hashCode());
		result = PRIME * result + ((this.additionalDocumentReference == null) ? 0 : this.additionalDocumentReference.hashCode());
		result = PRIME * result + ((this.creditNoteDocumentReference == null) ? 0 : this.creditNoteDocumentReference.hashCode());
		result = PRIME * result + ((this.debitNoteDocumentReference == null) ? 0 : this.debitNoteDocumentReference.hashCode());
		result = PRIME * result + ((this.documentCurrencyCode == null) ? 0 : this.documentCurrencyCode.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.invoiceDocumentReference == null) ? 0 : this.invoiceDocumentReference.hashCode());
		result = PRIME * result + ((this.legalTotal == null) ? 0 : this.legalTotal.hashCode());
		result = PRIME * result + ((this.paymentMeans == null) ? 0 : this.paymentMeans.hashCode());
		result = PRIME * result + ((this.paymentTerms == null) ? 0 : this.paymentTerms.hashCode());
		result = PRIME * result + ((this.remittanceDocumentReference == null) ? 0 : this.remittanceDocumentReference.hashCode());
		result = PRIME * result + ((this.selfBilledCreditNoteDocumentReference == null) ? 0 : this.selfBilledCreditNoteDocumentReference.hashCode());
		result = PRIME * result + ((this.selfBilledInvoiceDocumentReference == null) ? 0 : this.selfBilledInvoiceDocumentReference.hashCode());
		result = PRIME * result + ((this.statementDocumentReference == null) ? 0 : this.statementDocumentReference.hashCode());
		result = PRIME * result + ((this.taxCurrencyCode == null) ? 0 : this.taxCurrencyCode.hashCode());
		result = PRIME * result + ((this.taxTotal == null) ? 0 : this.taxTotal.hashCode());
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
		final AccountingDocumentReferenceType other = (AccountingDocumentReferenceType) obj;
		if (this.accountingDocumentReferenceLine == null) {
			if (other.accountingDocumentReferenceLine != null)
				return false;
		} else if (!this.accountingDocumentReferenceLine.equals(other.accountingDocumentReferenceLine))
			return false;
		if (this.additionalDocumentReference == null) {
			if (other.additionalDocumentReference != null)
				return false;
		} else if (!this.additionalDocumentReference.equals(other.additionalDocumentReference))
			return false;
		if (this.creditNoteDocumentReference == null) {
			if (other.creditNoteDocumentReference != null)
				return false;
		} else if (!this.creditNoteDocumentReference.equals(other.creditNoteDocumentReference))
			return false;
		if (this.debitNoteDocumentReference == null) {
			if (other.debitNoteDocumentReference != null)
				return false;
		} else if (!this.debitNoteDocumentReference.equals(other.debitNoteDocumentReference))
			return false;
		if (this.documentCurrencyCode == null) {
			if (other.documentCurrencyCode != null)
				return false;
		} else if (!this.documentCurrencyCode.equals(other.documentCurrencyCode))
			return false;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.invoiceDocumentReference == null) {
			if (other.invoiceDocumentReference != null)
				return false;
		} else if (!this.invoiceDocumentReference.equals(other.invoiceDocumentReference))
			return false;
		if (this.legalTotal == null) {
			if (other.legalTotal != null)
				return false;
		} else if (!this.legalTotal.equals(other.legalTotal))
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
		if (this.remittanceDocumentReference == null) {
			if (other.remittanceDocumentReference != null)
				return false;
		} else if (!this.remittanceDocumentReference.equals(other.remittanceDocumentReference))
			return false;
		if (this.selfBilledCreditNoteDocumentReference == null) {
			if (other.selfBilledCreditNoteDocumentReference != null)
				return false;
		} else if (!this.selfBilledCreditNoteDocumentReference.equals(other.selfBilledCreditNoteDocumentReference))
			return false;
		if (this.selfBilledInvoiceDocumentReference == null) {
			if (other.selfBilledInvoiceDocumentReference != null)
				return false;
		} else if (!this.selfBilledInvoiceDocumentReference.equals(other.selfBilledInvoiceDocumentReference))
			return false;
		if (this.statementDocumentReference == null) {
			if (other.statementDocumentReference != null)
				return false;
		} else if (!this.statementDocumentReference.equals(other.statementDocumentReference))
			return false;
		if (this.taxCurrencyCode == null) {
			if (other.taxCurrencyCode != null)
				return false;
		} else if (!this.taxCurrencyCode.equals(other.taxCurrencyCode))
			return false;
		if (this.taxTotal == null) {
			if (other.taxTotal != null)
				return false;
		} else if (!this.taxTotal.equals(other.taxTotal))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // AccountingDocumentReferenceType