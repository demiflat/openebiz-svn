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
import org.openebiz.core.common.cbc.InvoicedQuantityType;
import org.openebiz.core.common.cbc.LineExtensionAmountType;
import org.openebiz.core.common.cbc.NoteType;
import org.openebiz.core.common.cbc.TaxPointDateType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoice Line Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Invoice Line. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about an Invoice Line</ccts:Definition>
 *           <ccts:ObjectClass>Invoice Line</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.InvoiceLineType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.InvoiceLineType#getGUID <em>GUID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.InvoiceLineType#getNote <em>Note</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.InvoiceLineType#getInvoicedQuantity <em>Invoiced Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.InvoiceLineType#getLineExtensionAmount <em>Line Extension Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.InvoiceLineType#getTaxPointDate <em>Tax Point Date</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.InvoiceLineType#getAccountingCostCode <em>Accounting Cost Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.InvoiceLineType#getOrderLineReference <em>Order Line Reference</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.InvoiceLineType#getDespatchLineReference <em>Despatch Line Reference</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.InvoiceLineType#getReceiptLineReference <em>Receipt Line Reference</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.InvoiceLineType#getDelivery <em>Delivery</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.InvoiceLineType#getPaymentTerms <em>Payment Terms</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.InvoiceLineType#getAllowanceCharge <em>Allowance Charge</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.InvoiceLineType#getTaxTotal <em>Tax Total</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.InvoiceLineType#getItem <em>Item</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.InvoiceLineType#getBasePrice <em>Base Price</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.InvoiceLineType#getDeliveryTerms <em>Delivery Terms</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.InvoiceLineType#getItemInstance <em>Item Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InvoiceLineType implements Serializable {
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
	 * The cached value of the '{@link #getInvoicedQuantity() <em>Invoiced Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoicedQuantity()
	 * @generated
	 * @ordered
	 */
	protected InvoicedQuantityType invoicedQuantity = null;

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
	 * The cached value of the '{@link #getOrderLineReference() <em>Order Line Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderLineReference()
	 * @generated
	 * @ordered
	 */
	protected List orderLineReference = null;

	/**
	 * The cached value of the '{@link #getDespatchLineReference() <em>Despatch Line Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDespatchLineReference()
	 * @generated
	 * @ordered
	 */
	protected List despatchLineReference = null;

	/**
	 * The cached value of the '{@link #getReceiptLineReference() <em>Receipt Line Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiptLineReference()
	 * @generated
	 * @ordered
	 */
	protected List receiptLineReference = null;

	/**
	 * The cached value of the '{@link #getDelivery() <em>Delivery</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelivery()
	 * @generated
	 * @ordered
	 */
	protected List delivery = null;

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
	 * The cached value of the '{@link #getAllowanceCharge() <em>Allowance Charge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowanceCharge()
	 * @generated
	 * @ordered
	 */
	protected List allowanceCharge = null;

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
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected ItemType item = null;

	/**
	 * The cached value of the '{@link #getBasePrice() <em>Base Price</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePrice()
	 * @generated
	 * @ordered
	 */
	protected BasePriceType basePrice = null;

	/**
	 * The cached value of the '{@link #getDeliveryTerms() <em>Delivery Terms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryTerms()
	 * @generated
	 * @ordered
	 */
	protected DeliveryTermsType deliveryTerms = null;

	/**
	 * The cached value of the '{@link #getItemInstance() <em>Item Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemInstance()
	 * @generated
	 * @ordered
	 */
	protected List itemInstance = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public InvoiceLineType() {
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
		this.invoicedQuantity = this.getInvoicedQuantity();
		this.lineExtensionAmount = this.getLineExtensionAmount();
		this.taxPointDate = this.getTaxPointDate();
		this.accountingCostCode = this.getAccountingCostCode();
		this.orderLineReference = this.getOrderLineReference();
		this.despatchLineReference = this.getDespatchLineReference();
		this.receiptLineReference = this.getReceiptLineReference();
		this.delivery = this.getDelivery();
		this.paymentTerms = this.getPaymentTerms();
		this.allowanceCharge = this.getAllowanceCharge();
		this.taxTotal = this.getTaxTotal();
		this.item = this.getItem();
		this.basePrice = this.getBasePrice();
		this.deliveryTerms = this.getDeliveryTerms();
		this.itemInstance = this.getItemInstance();
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
	 *               <ccts:DictionaryEntryName>Invoice Line. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the Invoice Line</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice Line</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.InvoiceLineType#getID <em>ID</em>}' containment reference.
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
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice Line. Globally Unique Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A computer-generated globally unique identifier (GUID) for the Invoice Line instance</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice Line</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.InvoiceLineType#getGUID <em>GUID</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Invoice Line. Note. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Free form text applying to the Invoice Line. This element may contain notes or any other similar information that is not contained explicitly in another structure.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice Line</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.InvoiceLineType#getNote <em>Note</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Invoiced Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice Line. Invoiced_ Quantity. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The quantity (of Items) on the Invoice Line</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Invoiced</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invoiced Quantity</em>' containment reference.
	 * @see #setInvoicedQuantity(InvoicedQuantityType)
	 * @generated
	 */
	public InvoicedQuantityType getInvoicedQuantity() {
		return (invoicedQuantity == null) ? new InvoicedQuantityType()
				: invoicedQuantity;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.InvoiceLineType#getInvoicedQuantity <em>Invoiced Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoiced Quantity</em>' containment reference.
	 * @see #getInvoicedQuantity()
	 * @generated
	 */
	public void setInvoicedQuantity(InvoicedQuantityType newInvoicedQuantity) {
		invoicedQuantity = newInvoicedQuantity;
	}

	/**
	 * Returns the value of the '<em><b>Line Extension Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice Line. Line Extension Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The total amount for the Invoice Line including Allowance Charges but net of taxes</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice Line</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.InvoiceLineType#getLineExtensionAmount <em>Line Extension Amount</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Invoice Line. Tax Point Date. Date</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The date of the Invoice Line used to indicate the point at which tax becomes applicable.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice Line</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.InvoiceLineType#getTaxPointDate <em>Tax Point Date</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Invoice Line. Accounting_ Cost Code. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The Buyer's accounting code applied to the Invoice Line</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice Line</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.InvoiceLineType#getAccountingCostCode <em>Accounting Cost Code</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Order Line Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.OrderLineReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice Line. Order Line Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Order Line Reference</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Order Line Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Order Line Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order Line Reference</em>' containment reference list.
	 * @generated
	 */
	public List getOrderLineReference() {
		if (orderLineReference == null) {
			orderLineReference = new ArrayList<
					OrderLineReferenceType>();
		}
		return orderLineReference;
	}

	/**
	 * Returns the value of the '<em><b>Despatch Line Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.LineReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice Line. Despatch_ Line Reference. Line Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Despatch Line Reference</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 * 
	 *               <ccts:ObjectClass>Invoice Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Despatch</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Line Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Line Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Despatch Line Reference</em>' containment reference list.
	 * @generated
	 */
	public List getDespatchLineReference() {
		if (despatchLineReference == null) {
			despatchLineReference = new ArrayList<
					LineReferenceType>();
		}
		return despatchLineReference;
	}

	/**
	 * Returns the value of the '<em><b>Receipt Line Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.LineReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice Line. Receipt_ Line Reference. Line Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Receipt Line Reference</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Receipt</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Line Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Line Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receipt Line Reference</em>' containment reference list.
	 * @generated
	 */
	public List getReceiptLineReference() {
		if (receiptLineReference == null) {
			receiptLineReference = new ArrayList<
					LineReferenceType>();
		}
		return receiptLineReference;
	}

	/**
	 * Returns the value of the '<em><b>Delivery</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.DeliveryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice Line. Delivery</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Delivery</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Delivery</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Delivery</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delivery</em>' containment reference list.
	 * @generated
	 */
	public List getDelivery() {
		if (delivery == null) {
			delivery = new ArrayList<DeliveryType>();
		}
		return delivery;
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
	 *               <ccts:DictionaryEntryName>Invoice Line. Payment Terms</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Payment Terms</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice Line</ccts:ObjectClass>
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
	 * Returns the value of the '<em><b>Allowance Charge</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.AllowanceChargeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice Line. Allowance Charge</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Allowance Charge</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Allowance Charge</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Allowance Charge</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allowance Charge</em>' containment reference list.
	 * @generated
	 */
	public List getAllowanceCharge() {
		if (allowanceCharge == null) {
			allowanceCharge = new ArrayList<AllowanceChargeType>();
		}
		return allowanceCharge;
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
	 *               <ccts:DictionaryEntryName>Invoice Line. Tax Total</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Tax Total</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice Line</ccts:ObjectClass>
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
	 * Returns the value of the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice Line. Item</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Item</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Item</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Item</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference.
	 * @see #setItem(ItemType)
	 * @generated
	 */
	public ItemType getItem() {
		return (item == null) ? new ItemType() : item;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.InvoiceLineType#getItem <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' containment reference.
	 * @see #getItem()
	 * @generated
	 */
	public void setItem(ItemType newItem) {
		item = newItem;
	}

	/**
	 * Returns the value of the '<em><b>Base Price</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice Line. Base Price</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Base Price</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Base Price</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Base Price</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Unit Price</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Price</em>' containment reference.
	 * @see #setBasePrice(BasePriceType)
	 * @generated
	 */
	public BasePriceType getBasePrice() {
		return (basePrice == null) ? new BasePriceType() : basePrice;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.InvoiceLineType#getBasePrice <em>Base Price</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Price</em>' containment reference.
	 * @see #getBasePrice()
	 * @generated
	 */
	public void setBasePrice(BasePriceType newBasePrice) {
		basePrice = newBasePrice;
	}

	/**
	 * Returns the value of the '<em><b>Delivery Terms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice Line. Delivery Terms</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Delivery Terms</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Delivery Terms</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Delivery Terms</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delivery Terms</em>' containment reference.
	 * @see #setDeliveryTerms(DeliveryTermsType)
	 * @generated
	 */
	public DeliveryTermsType getDeliveryTerms() {
		return (deliveryTerms == null) ? new DeliveryTermsType()
				: deliveryTerms;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.InvoiceLineType#getDeliveryTerms <em>Delivery Terms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Terms</em>' containment reference.
	 * @see #getDeliveryTerms()
	 * @generated
	 */
	public void setDeliveryTerms(DeliveryTermsType newDeliveryTerms) {
		deliveryTerms = newDeliveryTerms;
	}

	/**
	 * Returns the value of the '<em><b>Item Instance</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.ItemInstanceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice Line. Item Instance</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Item Instance</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Item Instance</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Item Instance</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Instance</em>' containment reference list.
	 * @generated
	 */
	public List getItemInstance() {
		if (itemInstance == null) {
			itemInstance = new ArrayList<ItemInstanceType>();
		}
		return itemInstance;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.accountingCostCode == null) ? 0 : this.accountingCostCode.hashCode());
		result = PRIME * result + ((this.allowanceCharge == null) ? 0 : this.allowanceCharge.hashCode());
		result = PRIME * result + ((this.basePrice == null) ? 0 : this.basePrice.hashCode());
		result = PRIME * result + ((this.delivery == null) ? 0 : this.delivery.hashCode());
		result = PRIME * result + ((this.deliveryTerms == null) ? 0 : this.deliveryTerms.hashCode());
		result = PRIME * result + ((this.despatchLineReference == null) ? 0 : this.despatchLineReference.hashCode());
		result = PRIME * result + ((this.gUID == null) ? 0 : this.gUID.hashCode());
		result = PRIME * result + ((this.iD == null) ? 0 : this.iD.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.invoicedQuantity == null) ? 0 : this.invoicedQuantity.hashCode());
		result = PRIME * result + ((this.item == null) ? 0 : this.item.hashCode());
		result = PRIME * result + ((this.itemInstance == null) ? 0 : this.itemInstance.hashCode());
		result = PRIME * result + ((this.lineExtensionAmount == null) ? 0 : this.lineExtensionAmount.hashCode());
		result = PRIME * result + ((this.note == null) ? 0 : this.note.hashCode());
		result = PRIME * result + ((this.orderLineReference == null) ? 0 : this.orderLineReference.hashCode());
		result = PRIME * result + ((this.paymentTerms == null) ? 0 : this.paymentTerms.hashCode());
		result = PRIME * result + ((this.receiptLineReference == null) ? 0 : this.receiptLineReference.hashCode());
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
		final InvoiceLineType other = (InvoiceLineType) obj;
		if (this.accountingCostCode == null) {
			if (other.accountingCostCode != null)
				return false;
		} else if (!this.accountingCostCode.equals(other.accountingCostCode))
			return false;
		if (this.allowanceCharge == null) {
			if (other.allowanceCharge != null)
				return false;
		} else if (!this.allowanceCharge.equals(other.allowanceCharge))
			return false;
		if (this.basePrice == null) {
			if (other.basePrice != null)
				return false;
		} else if (!this.basePrice.equals(other.basePrice))
			return false;
		if (this.delivery == null) {
			if (other.delivery != null)
				return false;
		} else if (!this.delivery.equals(other.delivery))
			return false;
		if (this.deliveryTerms == null) {
			if (other.deliveryTerms != null)
				return false;
		} else if (!this.deliveryTerms.equals(other.deliveryTerms))
			return false;
		if (this.despatchLineReference == null) {
			if (other.despatchLineReference != null)
				return false;
		} else if (!this.despatchLineReference.equals(other.despatchLineReference))
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
		if (this.invoicedQuantity == null) {
			if (other.invoicedQuantity != null)
				return false;
		} else if (!this.invoicedQuantity.equals(other.invoicedQuantity))
			return false;
		if (this.item == null) {
			if (other.item != null)
				return false;
		} else if (!this.item.equals(other.item))
			return false;
		if (this.itemInstance == null) {
			if (other.itemInstance != null)
				return false;
		} else if (!this.itemInstance.equals(other.itemInstance))
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
		if (this.orderLineReference == null) {
			if (other.orderLineReference != null)
				return false;
		} else if (!this.orderLineReference.equals(other.orderLineReference))
			return false;
		if (this.paymentTerms == null) {
			if (other.paymentTerms != null)
				return false;
		} else if (!this.paymentTerms.equals(other.paymentTerms))
			return false;
		if (this.receiptLineReference == null) {
			if (other.receiptLineReference != null)
				return false;
		} else if (!this.receiptLineReference.equals(other.receiptLineReference))
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

} // InvoiceLineType