/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.AccountingCostCodeType;
import org.openebiz.core.common.cbc.GUIDType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.LineExtensionAmountType;
import org.openebiz.core.common.cbc.NoteType;
import org.openebiz.core.common.cbc.TaxPointDateType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Debit Note Line Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Debit Note Line. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about a Debit Note Line</ccts:Definition>
 *           <ccts:ObjectClass>Debit Note Line</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.DebitNoteLineType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DebitNoteLineType#getGUID <em>GUID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DebitNoteLineType#getNote <em>Note</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DebitNoteLineType#getLineExtensionAmount <em>Line Extension Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DebitNoteLineType#getTaxPointDate <em>Tax Point Date</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DebitNoteLineType#getAccountingCostCode <em>Accounting Cost Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DebitNoteLineType#getDiscrepancyResponse <em>Discrepancy Response</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DebitNoteLineType#getAccountingDocumentReference <em>Accounting Document Reference</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DebitNoteLineType#getTaxTotal <em>Tax Total</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DebitNoteLineType implements Serializable {
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
	 * The cached value of the '{@link #getID() <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected IDType iD = null;

	/**
	 * The cached value of the '{@link #getGUID() <em>GUID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGUID()
	 * @generated
	 * @ordered
	 */
	protected GUIDType gUID = null;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected NoteType note = null;

	/**
	 * The cached value of the '{@link #getLineExtensionAmount() <em>Line Extension Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineExtensionAmount()
	 * @generated
	 * @ordered
	 */
	protected LineExtensionAmountType lineExtensionAmount = null;

	/**
	 * The cached value of the '{@link #getTaxPointDate() <em>Tax Point Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxPointDate()
	 * @generated
	 * @ordered
	 */
	protected TaxPointDateType taxPointDate = null;

	/**
	 * The cached value of the '{@link #getAccountingCostCode() <em>Accounting Cost Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountingCostCode()
	 * @generated
	 * @ordered
	 */
	protected AccountingCostCodeType accountingCostCode = null;

	/**
	 * The cached value of the '{@link #getDiscrepancyResponse() <em>Discrepancy Response</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscrepancyResponse()
	 * @generated
	 * @ordered
	 */
	protected List discrepancyResponse = null;

	/**
	 * The cached value of the '{@link #getAccountingDocumentReference() <em>Accounting Document Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountingDocumentReference()
	 * @generated
	 * @ordered
	 */
	protected List accountingDocumentReference = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public DebitNoteLineType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.iD = this.getID();
		this.gUID = this.getGUID();
		this.note = this.getNote();
		this.lineExtensionAmount = this.getLineExtensionAmount();
		this.taxPointDate = this.getTaxPointDate();
		this.accountingCostCode = this.getAccountingCostCode();
		this.discrepancyResponse = this.getDiscrepancyResponse();
		this.accountingDocumentReference = this.getAccountingDocumentReference();
		this.taxTotal = this.getTaxTotal();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getID().getValue());
		return sdisplay.toString();
	}
	
	/**
	 * Returns the value of the '<em><b>ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Debit Note Line. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the Debit Note Line</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Debit Note Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID</em>' containment reference.
	 * @see #setID(IDType)
	 * @generated
	 */
	public IDType getID() {
		return (iD == null) ? new IDType() : iD;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DebitNoteLineType#getID <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' containment reference.
	 * @see #getID()
	 * @generated
	 */
	public void setID(IDType newID) {
		iD = newID;
	}

	/**
	 * Returns the value of the '<em><b>GUID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Debit Note Line. Globally Unique Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A computer-generated globally unique identifier (GUID) for the Debit Note Line instance</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Debit Note Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Globally Unique Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GUID</em>' containment reference.
	 * @see #setGUID(GUIDType)
	 * @generated
	 */
	public GUIDType getGUID() {
		return (gUID == null) ? new GUIDType() : gUID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DebitNoteLineType#getGUID <em>GUID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GUID</em>' containment reference.
	 * @see #getGUID()
	 * @generated
	 */
	public void setGUID(GUIDType newGUID) {
		gUID = newGUID;
	}

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Debit Note Line. Note. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Free form text applying to the Debit Note Line. This element may contain notes or any other similar information that is not contained explicitly in another structure.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Debit Note Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Note</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference.
	 * @see #setNote(NoteType)
	 * @generated
	 */
	public NoteType getNote() {
		return (note == null) ? new NoteType() : note;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DebitNoteLineType#getNote <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' containment reference.
	 * @see #getNote()
	 * @generated
	 */
	public void setNote(NoteType newNote) {
		note = newNote;
	}

	/**
	 * Returns the value of the '<em><b>Line Extension Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Debit Note Line. Line Extension Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The total amount for the Debit Note Line including Allowance Charges but net of taxes</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Debit Note Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Line Extension Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Extension Amount</em>' containment reference.
	 * @see #setLineExtensionAmount(LineExtensionAmountType)
	 * @generated
	 */
	public LineExtensionAmountType getLineExtensionAmount() {
		return (lineExtensionAmount == null) ? new LineExtensionAmountType()
				: lineExtensionAmount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DebitNoteLineType#getLineExtensionAmount <em>Line Extension Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Extension Amount</em>' containment reference.
	 * @see #getLineExtensionAmount()
	 * @generated
	 */
	public void setLineExtensionAmount(
			LineExtensionAmountType newLineExtensionAmount) {
		lineExtensionAmount = newLineExtensionAmount;
	}

	/**
	 * Returns the value of the '<em><b>Tax Point Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Debit Note Line. Tax Point Date. Date</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The date of the Debit Note Line used to indicate the point at which tax becomes applicable.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Debit Note Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Tax Point Date</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tax Point Date</em>' containment reference.
	 * @see #setTaxPointDate(TaxPointDateType)
	 * @generated
	 */
	public TaxPointDateType getTaxPointDate() {
		return (taxPointDate == null) ? new TaxPointDateType() : taxPointDate;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DebitNoteLineType#getTaxPointDate <em>Tax Point Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Point Date</em>' containment reference.
	 * @see #getTaxPointDate()
	 * @generated
	 */
	public void setTaxPointDate(TaxPointDateType newTaxPointDate) {
		taxPointDate = newTaxPointDate;
	}

	/**
	 * Returns the value of the '<em><b>Accounting Cost Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Debit Note Line. Accounting_ Cost Code. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The Buyer's accounting code applied to the Debit Note Line</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Debit Note Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Accounting</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Cost Code</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accounting Cost Code</em>' containment reference.
	 * @see #setAccountingCostCode(AccountingCostCodeType)
	 * @generated
	 */
	public AccountingCostCodeType getAccountingCostCode() {
		return (accountingCostCode == null) ? new AccountingCostCodeType()
				: accountingCostCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DebitNoteLineType#getAccountingCostCode <em>Accounting Cost Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accounting Cost Code</em>' containment reference.
	 * @see #getAccountingCostCode()
	 * @generated
	 */
	public void setAccountingCostCode(
			AccountingCostCodeType newAccountingCostCode) {
		accountingCostCode = newAccountingCostCode;
	}

	/**
	 * Returns the value of the '<em><b>Discrepancy Response</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.ResponseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Debit Note Line. Discrepancy_ Response. Response</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Discrepany Response; the reason for the Debit</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Debit Note Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Discrepancy</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Response</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Response</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Discrepancy Response</em>' containment reference list.
	 * @generated
	 */
	public List getDiscrepancyResponse() {
		if (discrepancyResponse == null) {
			discrepancyResponse = new ArrayList<ResponseType>();
		}
		return discrepancyResponse;
	}

	/**
	 * Returns the value of the '<em><b>Accounting Document Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.AccountingDocumentReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Debit Note Line. Accounting Document Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to an Accounting Document</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Debit Note Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Accounting Document Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Accounting Document Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accounting Document Reference</em>' containment reference list.
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
	 * Returns the value of the '<em><b>Tax Total</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.TaxTotalType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Debit Note Line. Tax Total</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Tax Total</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Debit Note Line</ccts:ObjectClass>
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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.accountingCostCode == null) ? 0 : this.accountingCostCode.hashCode());
		result = PRIME * result + ((this.accountingDocumentReference == null) ? 0 : this.accountingDocumentReference.hashCode());
		result = PRIME * result + ((this.discrepancyResponse == null) ? 0 : this.discrepancyResponse.hashCode());
		result = PRIME * result + ((this.gUID == null) ? 0 : this.gUID.hashCode());
		result = PRIME * result + ((this.iD == null) ? 0 : this.iD.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.lineExtensionAmount == null) ? 0 : this.lineExtensionAmount.hashCode());
		result = PRIME * result + ((this.note == null) ? 0 : this.note.hashCode());
		result = PRIME * result + ((this.taxPointDate == null) ? 0 : this.taxPointDate.hashCode());
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
		final DebitNoteLineType other = (DebitNoteLineType) obj;
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
		if (this.discrepancyResponse == null) {
			if (other.discrepancyResponse != null)
				return false;
		} else if (!this.discrepancyResponse.equals(other.discrepancyResponse))
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
		if (this.lineExtensionAmount == null) {
			if (other.lineExtensionAmount != null)
				return false;
		} else if (!this.lineExtensionAmount.equals(other.lineExtensionAmount))
			return false;
		if (this.note == null) {
			if (other.note != null)
				return false;
		} else if (!this.note.equals(other.note))
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
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // DebitNoteLineType