/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.AccountingCostCodeType;
import org.openebiz.core.common.cbc.BackOrderAllowedIndicatorType;
import org.openebiz.core.common.cbc.GloballyUniqueGUIDType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.InspectionMethodCodeType;
import org.openebiz.core.common.cbc.LineExtensionAmountType;
import org.openebiz.core.common.cbc.LineStatusCodeType;
import org.openebiz.core.common.cbc.MaximumBackorderQuantityType;
import org.openebiz.core.common.cbc.MaximumQuantityType;
import org.openebiz.core.common.cbc.MinimumBackorderQuantityType;
import org.openebiz.core.common.cbc.MinimumQuantityType;
import org.openebiz.core.common.cbc.NoteType;
import org.openebiz.core.common.cbc.PartialDeliveryIndicatorType;
import org.openebiz.core.common.cbc.QuantityType;
import org.openebiz.core.common.cbc.SalesOrderIDType;
import org.openebiz.core.common.cbc.TotalTaxAmountType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Item Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Line Item. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about a Line Item</ccts:Definition>
 *           <ccts:ObjectClass>Line Item</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.LineItemType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LineItemType#getSalesOrderID <em>Sales Order ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LineItemType#getGloballyUniqueGUID <em>Globally Unique GUID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LineItemType#getNote <em>Note</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LineItemType#getLineStatusCode <em>Line Status Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LineItemType#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LineItemType#getLineExtensionAmount <em>Line Extension Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LineItemType#getTotalTaxAmount <em>Total Tax Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LineItemType#getMinimumQuantity <em>Minimum Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LineItemType#getMaximumQuantity <em>Maximum Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LineItemType#getMinimumBackorderQuantity <em>Minimum Backorder Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LineItemType#getMaximumBackorderQuantity <em>Maximum Backorder Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LineItemType#getInspectionMethodCode <em>Inspection Method Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LineItemType#getPartialDeliveryIndicator <em>Partial Delivery Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LineItemType#getBackOrderAllowedIndicator <em>Back Order Allowed Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LineItemType#getAccountingCostCode <em>Accounting Cost Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LineItemType#getDelivery <em>Delivery</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LineItemType#getDeliveryTerms <em>Delivery Terms</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LineItemType#getDestinationParty <em>Destination Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LineItemType#getOrderedShipment <em>Ordered Shipment</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LineItemType#getAllowanceCharge <em>Allowance Charge</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LineItemType#getBasePrice <em>Base Price</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LineItemType#getItem <em>Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LineItemType implements Serializable {
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
	 * The cached value of the '{@link #getSalesOrderID() <em>Sales Order ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesOrderID()
	 * @generated
	 * @ordered
	 */
	protected SalesOrderIDType salesOrderID = null;

	/**
	 * The cached value of the '{@link #getGloballyUniqueGUID() <em>Globally Unique GUID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGloballyUniqueGUID()
	 * @generated
	 * @ordered
	 */
	protected GloballyUniqueGUIDType globallyUniqueGUID = null;

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
	 * The cached value of the '{@link #getLineStatusCode() <em>Line Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStatusCode()
	 * @generated
	 * @ordered
	 */
	protected LineStatusCodeType lineStatusCode = null;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected QuantityType quantity = null;

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
	 * The cached value of the '{@link #getTotalTaxAmount() <em>Total Tax Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalTaxAmount()
	 * @generated
	 * @ordered
	 */
	protected TotalTaxAmountType totalTaxAmount = null;

	/**
	 * The cached value of the '{@link #getMinimumQuantity() <em>Minimum Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumQuantity()
	 * @generated
	 * @ordered
	 */
	protected MinimumQuantityType minimumQuantity = null;

	/**
	 * The cached value of the '{@link #getMaximumQuantity() <em>Maximum Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumQuantity()
	 * @generated
	 * @ordered
	 */
	protected MaximumQuantityType maximumQuantity = null;

	/**
	 * The cached value of the '{@link #getMinimumBackorderQuantity() <em>Minimum Backorder Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumBackorderQuantity()
	 * @generated
	 * @ordered
	 */
	protected MinimumBackorderQuantityType minimumBackorderQuantity = null;

	/**
	 * The cached value of the '{@link #getMaximumBackorderQuantity() <em>Maximum Backorder Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumBackorderQuantity()
	 * @generated
	 * @ordered
	 */
	protected MaximumBackorderQuantityType maximumBackorderQuantity = null;

	/**
	 * The cached value of the '{@link #getInspectionMethodCode() <em>Inspection Method Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInspectionMethodCode()
	 * @generated
	 * @ordered
	 */
	protected InspectionMethodCodeType inspectionMethodCode = null;

	/**
	 * The cached value of the '{@link #getPartialDeliveryIndicator() <em>Partial Delivery Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartialDeliveryIndicator()
	 * @generated
	 * @ordered
	 */
	protected PartialDeliveryIndicatorType partialDeliveryIndicator = null;

	/**
	 * The cached value of the '{@link #getBackOrderAllowedIndicator() <em>Back Order Allowed Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackOrderAllowedIndicator()
	 * @generated
	 * @ordered
	 */
	protected BackOrderAllowedIndicatorType backOrderAllowedIndicator = null;

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
	 * The cached value of the '{@link #getDelivery() <em>Delivery</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelivery()
	 * @generated
	 * @ordered
	 */
	protected List delivery = null;

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
	 * The cached value of the '{@link #getDestinationParty() <em>Destination Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationParty()
	 * @generated
	 * @ordered
	 */
	protected PartyType destinationParty = null;

	/**
	 * The cached value of the '{@link #getOrderedShipment() <em>Ordered Shipment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderedShipment()
	 * @generated
	 * @ordered
	 */
	protected List orderedShipment = null;

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
	 * The cached value of the '{@link #getBasePrice() <em>Base Price</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePrice()
	 * @generated
	 * @ordered
	 */
	protected BasePriceType basePrice = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public LineItemType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.iD = this.getID();
		this.salesOrderID = this.getSalesOrderID();
		this.globallyUniqueGUID = this.getGloballyUniqueGUID();
		this.note = this.getNote();
		this.lineStatusCode = this.getLineStatusCode();
		this.quantity = this.getQuantity();
		this.lineExtensionAmount = this.getLineExtensionAmount();
		this.totalTaxAmount = this.getTotalTaxAmount();
		this.minimumQuantity = this.getMinimumQuantity();
		this.maximumQuantity = this.getMaximumQuantity();
		this.minimumBackorderQuantity = this.getMinimumBackorderQuantity();
		this.maximumBackorderQuantity = this.getMaximumBackorderQuantity();
		this.inspectionMethodCode = this.getInspectionMethodCode();
		this.partialDeliveryIndicator = this.getPartialDeliveryIndicator();
		this.backOrderAllowedIndicator = this.getBackOrderAllowedIndicator();
		this.accountingCostCode = this.getAccountingCostCode();
		this.delivery = this.getDelivery();
		this.deliveryTerms = this.getDeliveryTerms();
		this.destinationParty = this.getDestinationParty();
		this.orderedShipment = this.getOrderedShipment();
		this.allowanceCharge = this.getAllowanceCharge();
		this.basePrice = this.getBasePrice();
		this.item = this.getItem();
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
	 *               <ccts:DictionaryEntryName>Line Item. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the Line Item assigned by the Buyer</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Line Item</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LineItemType#getID <em>ID</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Sales Order ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Line Item. SalesOrder Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identification given to a Line by the Seller.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Line Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>SalesOrder Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sales Order ID</em>' containment reference.
	 * @see #setSalesOrderID(SalesOrderIDType)
	 * @generated
	 */
	public SalesOrderIDType getSalesOrderID() {
		return (salesOrderID == null) ? new SalesOrderIDType() : salesOrderID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LineItemType#getSalesOrderID <em>Sales Order ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Order ID</em>' containment reference.
	 * @see #getSalesOrderID()
	 * @generated
	 */
	public void setSalesOrderID(SalesOrderIDType newSalesOrderID) {
		salesOrderID = newSalesOrderID;
	}

	/**
	 * Returns the value of the '<em><b>Globally Unique GUID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Line Item. Globally Unique_ Globally Unique Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A computer-generated globally unique identifier (GUID) for the Line Item instance</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Line Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Globally Unique</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Globally Unique Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Globally Unique GUID</em>' containment reference.
	 * @see #setGloballyUniqueGUID(GloballyUniqueGUIDType)
	 * @generated
	 */
	public GloballyUniqueGUIDType getGloballyUniqueGUID() {
		return (globallyUniqueGUID == null) ? new GloballyUniqueGUIDType()
				: globallyUniqueGUID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LineItemType#getGloballyUniqueGUID <em>Globally Unique GUID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Globally Unique GUID</em>' containment reference.
	 * @see #getGloballyUniqueGUID()
	 * @generated
	 */
	public void setGloballyUniqueGUID(
			GloballyUniqueGUIDType newGloballyUniqueGUID) {
		globallyUniqueGUID = newGloballyUniqueGUID;
	}

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Line Item. Note. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Free form text applying to the Line Item. This element may contain notes or any other similar information that is not contained explicitly in another structure.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Line Item</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LineItemType#getNote <em>Note</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Line Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Line Item. Line Status. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Identifies the status of the Line with respect to its original state</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Line Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Line Status</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Status Code</em>' containment reference.
	 * @see #setLineStatusCode(LineStatusCodeType)
	 * @generated
	 */
	public LineStatusCodeType getLineStatusCode() {
		return (lineStatusCode == null) ? new LineStatusCodeType()
				: lineStatusCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LineItemType#getLineStatusCode <em>Line Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Status Code</em>' containment reference.
	 * @see #getLineStatusCode()
	 * @generated
	 */
	public void setLineStatusCode(LineStatusCodeType newLineStatusCode) {
		lineStatusCode = newLineStatusCode;
	}

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Line Item. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The quantity of Items for the Line Item</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Line Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(QuantityType)
	 * @generated
	 */
	public QuantityType getQuantity() {
		return (quantity == null) ? new QuantityType() : quantity;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LineItemType#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	public void setQuantity(QuantityType newQuantity) {
		quantity = newQuantity;
	}

	/**
	 * Returns the value of the '<em><b>Line Extension Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Line Item. Line Extension Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The total amount for the Line Item including Allowance Charges but net of taxes</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Line Item</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LineItemType#getLineExtensionAmount <em>Line Extension Amount</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Total Tax Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Line Item. Total_ Tax Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The total tax amount for the Line Item</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Line Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Total</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Tax Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Tax Amount</em>' containment reference.
	 * @see #setTotalTaxAmount(TotalTaxAmountType)
	 * @generated
	 */
	public TotalTaxAmountType getTotalTaxAmount() {
		return (totalTaxAmount == null) ? new TotalTaxAmountType()
				: totalTaxAmount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LineItemType#getTotalTaxAmount <em>Total Tax Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Tax Amount</em>' containment reference.
	 * @see #getTotalTaxAmount()
	 * @generated
	 */
	public void setTotalTaxAmount(TotalTaxAmountType newTotalTaxAmount) {
		totalTaxAmount = newTotalTaxAmount;
	}

	/**
	 * Returns the value of the '<em><b>Minimum Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Line Item. Minimum_ Quantity. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The minimum quantity for the Item on the Line</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Line Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Minimum</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Quantity</em>' containment reference.
	 * @see #setMinimumQuantity(MinimumQuantityType)
	 * @generated
	 */
	public MinimumQuantityType getMinimumQuantity() {
		return (minimumQuantity == null) ? new MinimumQuantityType()
				: minimumQuantity;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LineItemType#getMinimumQuantity <em>Minimum Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Quantity</em>' containment reference.
	 * @see #getMinimumQuantity()
	 * @generated
	 */
	public void setMinimumQuantity(MinimumQuantityType newMinimumQuantity) {
		minimumQuantity = newMinimumQuantity;
	}

	/**
	 * Returns the value of the '<em><b>Maximum Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Line Item. Maximum_ Quantity. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The maximum quantity for the Item on the Line</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Line Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Maximum</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Quantity</em>' containment reference.
	 * @see #setMaximumQuantity(MaximumQuantityType)
	 * @generated
	 */
	public MaximumQuantityType getMaximumQuantity() {
		return (maximumQuantity == null) ? new MaximumQuantityType()
				: maximumQuantity;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LineItemType#getMaximumQuantity <em>Maximum Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Quantity</em>' containment reference.
	 * @see #getMaximumQuantity()
	 * @generated
	 */
	public void setMaximumQuantity(MaximumQuantityType newMaximumQuantity) {
		maximumQuantity = newMaximumQuantity;
	}

	/**
	 * Returns the value of the '<em><b>Minimum Backorder Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Line Item. Minimum_ Backorder. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The minimum back order quantity (where back order is allowed)</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Line Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Minimum</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Backorder</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Backorder Quantity</em>' containment reference.
	 * @see #setMinimumBackorderQuantity(MinimumBackorderQuantityType)
	 * @generated
	 */
	public MinimumBackorderQuantityType getMinimumBackorderQuantity() {
		return (minimumBackorderQuantity == null) ? new MinimumBackorderQuantityType()
				: minimumBackorderQuantity;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LineItemType#getMinimumBackorderQuantity <em>Minimum Backorder Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Backorder Quantity</em>' containment reference.
	 * @see #getMinimumBackorderQuantity()
	 * @generated
	 */
	public void setMinimumBackorderQuantity(
			MinimumBackorderQuantityType newMinimumBackorderQuantity) {
		minimumBackorderQuantity = newMinimumBackorderQuantity;
	}

	/**
	 * Returns the value of the '<em><b>Maximum Backorder Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Line Item. Maximum_ Backorder. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The maximum back order quantity (where back order is allowed)</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Line Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Maximum</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Backorder</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Backorder Quantity</em>' containment reference.
	 * @see #setMaximumBackorderQuantity(MaximumBackorderQuantityType)
	 * @generated
	 */
	public MaximumBackorderQuantityType getMaximumBackorderQuantity() {
		return (maximumBackorderQuantity == null) ? new MaximumBackorderQuantityType()
				: maximumBackorderQuantity;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LineItemType#getMaximumBackorderQuantity <em>Maximum Backorder Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Backorder Quantity</em>' containment reference.
	 * @see #getMaximumBackorderQuantity()
	 * @generated
	 */
	public void setMaximumBackorderQuantity(
			MaximumBackorderQuantityType newMaximumBackorderQuantity) {
		maximumBackorderQuantity = newMaximumBackorderQuantity;
	}

	/**
	 * Returns the value of the '<em><b>Inspection Method Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Line Item. Inspection Method. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Inspection requirements for a Line Item expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Line Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Inspection Method</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inspection Method Code</em>' containment reference.
	 * @see #setInspectionMethodCode(InspectionMethodCodeType)
	 * @generated
	 */
	public InspectionMethodCodeType getInspectionMethodCode() {
		return (inspectionMethodCode == null) ? new InspectionMethodCodeType()
				: inspectionMethodCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LineItemType#getInspectionMethodCode <em>Inspection Method Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inspection Method Code</em>' containment reference.
	 * @see #getInspectionMethodCode()
	 * @generated
	 */
	public void setInspectionMethodCode(
			InspectionMethodCodeType newInspectionMethodCode) {
		inspectionMethodCode = newInspectionMethodCode;
	}

	/**
	 * Returns the value of the '<em><b>Partial Delivery Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Line Item. Partial Delivery Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Indicates whether a partial delivery is allowed</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Line Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Partial Delivery Indicator</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Partial Delivery Indicator</em>' containment reference.
	 * @see #setPartialDeliveryIndicator(PartialDeliveryIndicatorType)
	 * @generated
	 */
	public PartialDeliveryIndicatorType getPartialDeliveryIndicator() {
		return (partialDeliveryIndicator == null) ? new PartialDeliveryIndicatorType()
				: partialDeliveryIndicator;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LineItemType#getPartialDeliveryIndicator <em>Partial Delivery Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partial Delivery Indicator</em>' containment reference.
	 * @see #getPartialDeliveryIndicator()
	 * @generated
	 */
	public void setPartialDeliveryIndicator(
			PartialDeliveryIndicatorType newPartialDeliveryIndicator) {
		partialDeliveryIndicator = newPartialDeliveryIndicator;
	}

	/**
	 * Returns the value of the '<em><b>Back Order Allowed Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Line Item. Back Order Allowed Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Indicates whether back order is allowed</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Line Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Back Order Allowed Indicator</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Back Order Allowed Indicator</em>' containment reference.
	 * @see #setBackOrderAllowedIndicator(BackOrderAllowedIndicatorType)
	 * @generated
	 */
	public BackOrderAllowedIndicatorType getBackOrderAllowedIndicator() {
		return (backOrderAllowedIndicator == null) ? new BackOrderAllowedIndicatorType()
				: backOrderAllowedIndicator;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LineItemType#getBackOrderAllowedIndicator <em>Back Order Allowed Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Back Order Allowed Indicator</em>' containment reference.
	 * @see #getBackOrderAllowedIndicator()
	 * @generated
	 */
	public void setBackOrderAllowedIndicator(
			BackOrderAllowedIndicatorType newBackOrderAllowedIndicator) {
		backOrderAllowedIndicator = newBackOrderAllowedIndicator;
	}

	/**
	 * Returns the value of the '<em><b>Accounting Cost Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Line Item. Accounting_ Cost Code. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The Buyer's accounting code applied to the Line Item</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Line Item</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LineItemType#getAccountingCostCode <em>Accounting Cost Code</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Delivery</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.DeliveryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Line Item. Delivery</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Delivery</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Line Item</ccts:ObjectClass>
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
	 * Returns the value of the '<em><b>Delivery Terms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Line Item. Delivery Terms</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Delivery Terms</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Line Item</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LineItemType#getDeliveryTerms <em>Delivery Terms</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Destination Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Line Item. Destination_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Delivery Party</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Line Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Destination</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination Party</em>' containment reference.
	 * @see #setDestinationParty(PartyType)
	 * @generated
	 */
	public PartyType getDestinationParty() {
		return (destinationParty == null) ? new PartyType() : destinationParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LineItemType#getDestinationParty <em>Destination Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Party</em>' containment reference.
	 * @see #getDestinationParty()
	 * @generated
	 */
	public void setDestinationParty(PartyType newDestinationParty) {
		destinationParty = newDestinationParty;
	}

	/**
	 * Returns the value of the '<em><b>Ordered Shipment</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.OrderedShipmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Line Item. Ordered Shipment</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Ordered Shipment</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Line Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Ordered Shipment</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Ordered Shipment</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ordered Shipment</em>' containment reference list.
	 * @generated
	 */
	public List getOrderedShipment() {
		if (orderedShipment == null) {
			orderedShipment = new ArrayList<OrderedShipmentType>();
		}
		return orderedShipment;
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
	 *               <ccts:DictionaryEntryName>Line Item. Allowance Charge</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Allowance Charge</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Line Item</ccts:ObjectClass>
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
	 * Returns the value of the '<em><b>Base Price</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Line Item. Base Price</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Base Price</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Line Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Base Price</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Base Price</ccts:AssociatedObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LineItemType#getBasePrice <em>Base Price</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Line Item. Item</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Item</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Line Item</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LineItemType#getItem <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' containment reference.
	 * @see #getItem()
	 * @generated
	 */
	public void setItem(ItemType newItem) {
		item = newItem;
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
		result = PRIME * result + ((this.backOrderAllowedIndicator == null) ? 0 : this.backOrderAllowedIndicator.hashCode());
		result = PRIME * result + ((this.basePrice == null) ? 0 : this.basePrice.hashCode());
		result = PRIME * result + ((this.delivery == null) ? 0 : this.delivery.hashCode());
		result = PRIME * result + ((this.deliveryTerms == null) ? 0 : this.deliveryTerms.hashCode());
		result = PRIME * result + ((this.destinationParty == null) ? 0 : this.destinationParty.hashCode());
		result = PRIME * result + ((this.globallyUniqueGUID == null) ? 0 : this.globallyUniqueGUID.hashCode());
		result = PRIME * result + ((this.iD == null) ? 0 : this.iD.hashCode());
		result = PRIME * result + ((this.inspectionMethodCode == null) ? 0 : this.inspectionMethodCode.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.item == null) ? 0 : this.item.hashCode());
		result = PRIME * result + ((this.lineExtensionAmount == null) ? 0 : this.lineExtensionAmount.hashCode());
		result = PRIME * result + ((this.lineStatusCode == null) ? 0 : this.lineStatusCode.hashCode());
		result = PRIME * result + ((this.maximumBackorderQuantity == null) ? 0 : this.maximumBackorderQuantity.hashCode());
		result = PRIME * result + ((this.maximumQuantity == null) ? 0 : this.maximumQuantity.hashCode());
		result = PRIME * result + ((this.minimumBackorderQuantity == null) ? 0 : this.minimumBackorderQuantity.hashCode());
		result = PRIME * result + ((this.minimumQuantity == null) ? 0 : this.minimumQuantity.hashCode());
		result = PRIME * result + ((this.note == null) ? 0 : this.note.hashCode());
		result = PRIME * result + ((this.orderedShipment == null) ? 0 : this.orderedShipment.hashCode());
		result = PRIME * result + ((this.partialDeliveryIndicator == null) ? 0 : this.partialDeliveryIndicator.hashCode());
		result = PRIME * result + ((this.quantity == null) ? 0 : this.quantity.hashCode());
		result = PRIME * result + ((this.salesOrderID == null) ? 0 : this.salesOrderID.hashCode());
		result = PRIME * result + ((this.totalTaxAmount == null) ? 0 : this.totalTaxAmount.hashCode());
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
		final LineItemType other = (LineItemType) obj;
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
		if (this.backOrderAllowedIndicator == null) {
			if (other.backOrderAllowedIndicator != null)
				return false;
		} else if (!this.backOrderAllowedIndicator.equals(other.backOrderAllowedIndicator))
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
		if (this.destinationParty == null) {
			if (other.destinationParty != null)
				return false;
		} else if (!this.destinationParty.equals(other.destinationParty))
			return false;
		if (this.globallyUniqueGUID == null) {
			if (other.globallyUniqueGUID != null)
				return false;
		} else if (!this.globallyUniqueGUID.equals(other.globallyUniqueGUID))
			return false;
		if (this.iD == null) {
			if (other.iD != null)
				return false;
		} else if (!this.iD.equals(other.iD))
			return false;
		if (this.inspectionMethodCode == null) {
			if (other.inspectionMethodCode != null)
				return false;
		} else if (!this.inspectionMethodCode.equals(other.inspectionMethodCode))
			return false;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.item == null) {
			if (other.item != null)
				return false;
		} else if (!this.item.equals(other.item))
			return false;
		if (this.lineExtensionAmount == null) {
			if (other.lineExtensionAmount != null)
				return false;
		} else if (!this.lineExtensionAmount.equals(other.lineExtensionAmount))
			return false;
		if (this.lineStatusCode == null) {
			if (other.lineStatusCode != null)
				return false;
		} else if (!this.lineStatusCode.equals(other.lineStatusCode))
			return false;
		if (this.maximumBackorderQuantity == null) {
			if (other.maximumBackorderQuantity != null)
				return false;
		} else if (!this.maximumBackorderQuantity.equals(other.maximumBackorderQuantity))
			return false;
		if (this.maximumQuantity == null) {
			if (other.maximumQuantity != null)
				return false;
		} else if (!this.maximumQuantity.equals(other.maximumQuantity))
			return false;
		if (this.minimumBackorderQuantity == null) {
			if (other.minimumBackorderQuantity != null)
				return false;
		} else if (!this.minimumBackorderQuantity.equals(other.minimumBackorderQuantity))
			return false;
		if (this.minimumQuantity == null) {
			if (other.minimumQuantity != null)
				return false;
		} else if (!this.minimumQuantity.equals(other.minimumQuantity))
			return false;
		if (this.note == null) {
			if (other.note != null)
				return false;
		} else if (!this.note.equals(other.note))
			return false;
		if (this.orderedShipment == null) {
			if (other.orderedShipment != null)
				return false;
		} else if (!this.orderedShipment.equals(other.orderedShipment))
			return false;
		if (this.partialDeliveryIndicator == null) {
			if (other.partialDeliveryIndicator != null)
				return false;
		} else if (!this.partialDeliveryIndicator.equals(other.partialDeliveryIndicator))
			return false;
		if (this.quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!this.quantity.equals(other.quantity))
			return false;
		if (this.salesOrderID == null) {
			if (other.salesOrderID != null)
				return false;
		} else if (!this.salesOrderID.equals(other.salesOrderID))
			return false;
		if (this.totalTaxAmount == null) {
			if (other.totalTaxAmount != null)
				return false;
		} else if (!this.totalTaxAmount.equals(other.totalTaxAmount))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // LineItemType