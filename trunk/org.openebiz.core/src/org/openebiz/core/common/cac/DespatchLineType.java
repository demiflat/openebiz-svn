/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.BackOrderQuantityType;
import org.openebiz.core.common.cbc.BackOrderReasonType;
import org.openebiz.core.common.cbc.DeliveredQuantityType;
import org.openebiz.core.common.cbc.GUIDType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.LineStatusCodeType;
import org.openebiz.core.common.cbc.NoteType;
import org.openebiz.core.common.cbc.OutstandingQuantityType;
import org.openebiz.core.common.cbc.OutstandingReasonType;
import org.openebiz.core.common.cbc.OverSupplyQuantityType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Despatch Line Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Despatch Line. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about a Despatch Line</ccts:Definition>
 *           <ccts:ObjectClass>Despatch Line</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.DespatchLineType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DespatchLineType#getGUID <em>GUID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DespatchLineType#getNote <em>Note</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DespatchLineType#getLineStatusCode <em>Line Status Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DespatchLineType#getDeliveredQuantity <em>Delivered Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DespatchLineType#getBackorderQuantity <em>Backorder Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DespatchLineType#getBackorderReason <em>Backorder Reason</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DespatchLineType#getOutstandingQuantity <em>Outstanding Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DespatchLineType#getOutstandingReason <em>Outstanding Reason</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DespatchLineType#getOversupplyQuantity <em>Oversupply Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DespatchLineType#getOrderLineReference <em>Order Line Reference</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DespatchLineType#getItem <em>Item</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DespatchLineType#getShipment <em>Shipment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DespatchLineType implements Serializable {
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
	 * The cached value of the '{@link #getLineStatusCode() <em>Line Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStatusCode()
	 * @generated
	 * @ordered
	 */
	protected LineStatusCodeType lineStatusCode = null;

	/**
	 * The cached value of the '{@link #getDeliveredQuantity() <em>Delivered Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveredQuantity()
	 * @generated
	 * @ordered
	 */
	protected DeliveredQuantityType deliveredQuantity = null;

	/**
	 * The cached value of the '{@link #getBackorderQuantity() <em>Backorder Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackorderQuantity()
	 * @generated
	 * @ordered
	 */
	protected BackOrderQuantityType backorderQuantity = null;

	/**
	 * The cached value of the '{@link #getBackorderReason() <em>Backorder Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackorderReason()
	 * @generated
	 * @ordered
	 */
	protected BackOrderReasonType backorderReason = null;

	/**
	 * The cached value of the '{@link #getOutstandingQuantity() <em>Outstanding Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutstandingQuantity()
	 * @generated
	 * @ordered
	 */
	protected OutstandingQuantityType outstandingQuantity = null;

	/**
	 * The cached value of the '{@link #getOutstandingReason() <em>Outstanding Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutstandingReason()
	 * @generated
	 * @ordered
	 */
	protected OutstandingReasonType outstandingReason = null;

	/**
	 * The cached value of the '{@link #getOversupplyQuantity() <em>Oversupply Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOversupplyQuantity()
	 * @generated
	 * @ordered
	 */
	protected OverSupplyQuantityType overSupplyQuantity = null;

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
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected ItemType item = null;

	/**
	 * The cached value of the '{@link #getShipment() <em>Shipment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipment()
	 * @generated
	 * @ordered
	 */
	protected List shipment = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public DespatchLineType() {
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
		this.lineStatusCode = this.getLineStatusCode();
		this.deliveredQuantity = this.getDeliveredQuantity();
		this.backorderQuantity = this.getBackorderQuantity();
		this.backorderReason = this.getBackorderReason();
		this.outstandingQuantity = this.getOutstandingQuantity();
		this.outstandingReason = this.getOutstandingReason();
		this.overSupplyQuantity = this.getOverSupplyQuantity();
		this.orderLineReference = this.getOrderLineReference();
		this.item = this.getItem();
		this.shipment = this.getShipment();
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
	 *               <ccts:DictionaryEntryName>Despatch Line. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the Despatch Line</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Despatch Line</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DespatchLineType#getID <em>ID</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Despatch Line. Globally Unique Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>globally unique identification of the line within the Despatch note.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Despatch Line</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DespatchLineType#getGUID <em>GUID</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Despatch Line. Note. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Free form text applying to the Despatch Line. This element may contain notes or any other similar information that is not contained explicitly in another structure.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Despatch Line</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DespatchLineType#getNote <em>Note</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Despatch Line. Line Status. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Identifies the status of the Despatch Line with respect to its original state.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Despatch Line</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DespatchLineType#getLineStatusCode <em>Line Status Code</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Delivered Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Despatch Line. Delivered_ Quantity. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The quantity despatched</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Despatch Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Delivered</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delivered Quantity</em>' containment reference.
	 * @see #setDeliveredQuantity(DeliveredQuantityType)
	 * @generated
	 */
	public DeliveredQuantityType getDeliveredQuantity() {
		return (deliveredQuantity == null) ? new DeliveredQuantityType()
				: deliveredQuantity;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DespatchLineType#getDeliveredQuantity <em>Delivered Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivered Quantity</em>' containment reference.
	 * @see #getDeliveredQuantity()
	 * @generated
	 */
	public void setDeliveredQuantity(DeliveredQuantityType newDeliveredQuantity) {
		deliveredQuantity = newDeliveredQuantity;
	}

	/**
	 * Returns the value of the '<em><b>Backorder Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Despatch Line. Backorder_ Quantity. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The quantity on Back Order at the Supplier</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Despatch Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Backorder</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Backorder Quantity</em>' containment reference.
	 * @see #setBackorderQuantity(BackOrderQuantityType)
	 * @generated
	 */
	public BackOrderQuantityType getBackorderQuantity() {
		return (backorderQuantity == null) ? new BackOrderQuantityType()
				: backorderQuantity;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DespatchLineType#getBackorderQuantity <em>Backorder Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backorder Quantity</em>' containment reference.
	 * @see #getBackorderQuantity()
	 * @generated
	 */
	public void setBackorderQuantity(BackOrderQuantityType newBackorderQuantity) {
		backorderQuantity = newBackorderQuantity;
	}

	/**
	 * Returns the value of the '<em><b>Backorder Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Despatch Line. Backorder_ Reason. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The reason for the Back Order</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Despatch Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Backorder</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Reason</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Backorder Reason</em>' containment reference.
	 * @see #setBackorderReason(BackOrderReasonType)
	 * @generated
	 */
	public BackOrderReasonType getBackorderReason() {
		return (backorderReason == null) ? new BackOrderReasonType()
				: backorderReason;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DespatchLineType#getBackorderReason <em>Backorder Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backorder Reason</em>' containment reference.
	 * @see #getBackorderReason()
	 * @generated
	 */
	public void setBackorderReason(BackOrderReasonType newBackorderReason) {
		backorderReason = newBackorderReason;
	}

	/**
	 * Returns the value of the '<em><b>Outstanding Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Despatch Line. Outstanding_ Quantity. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The quantity outstanding (which will follow in a later despatch)</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Despatch Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Outstanding</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outstanding Quantity</em>' containment reference.
	 * @see #setOutstandingQuantity(OutstandingQuantityType)
	 * @generated
	 */
	public OutstandingQuantityType getOutstandingQuantity() {
		return (outstandingQuantity == null) ? new OutstandingQuantityType()
				: outstandingQuantity;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DespatchLineType#getOutstandingQuantity <em>Outstanding Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outstanding Quantity</em>' containment reference.
	 * @see #getOutstandingQuantity()
	 * @generated
	 */
	public void setOutstandingQuantity(
			OutstandingQuantityType newOutstandingQuantity) {
		outstandingQuantity = newOutstandingQuantity;
	}

	/**
	 * Returns the value of the '<em><b>Outstanding Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Despatch Line. Outstanding_ Reason. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The reason for the Outstanding Quantity</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Despatch Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Outstanding</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Reason</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outstanding Reason</em>' containment reference.
	 * @see #setOutstandingReason(OutstandingReasonType)
	 * @generated
	 */
	public OutstandingReasonType getOutstandingReason() {
		return (outstandingReason == null) ? new OutstandingReasonType()
				: outstandingReason;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DespatchLineType#getOutstandingReason <em>Outstanding Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outstanding Reason</em>' containment reference.
	 * @see #getOutstandingReason()
	 * @generated
	 */
	public void setOutstandingReason(OutstandingReasonType newOutstandingReason) {
		outstandingReason = newOutstandingReason;
	}

	/**
	 * Returns the value of the '<em><b>Oversupply Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Despatch Line. Oversupply_ Quantity. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The quantity over supplied.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Despatch Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Oversupply</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Oversupply Quantity</em>' containment reference.
	 * @see #setOversupplyQuantity(OversupplyQuantityType)
	 * @generated
	 */
	public OverSupplyQuantityType getOverSupplyQuantity() {
		return (overSupplyQuantity == null) ? new OverSupplyQuantityType()
				: overSupplyQuantity;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DespatchLineType#getOversupplyQuantity <em>Oversupply Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oversupply Quantity</em>' containment reference.
	 * @see #getOversupplyQuantity()
	 * @generated
	 */
	public void setOverSupplyQuantity(
			OverSupplyQuantityType newOverSupplyQuantity) {
		overSupplyQuantity = newOverSupplyQuantity;
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
	 *               <ccts:DictionaryEntryName>Despatch Line. Order Line Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Order Line Reference</ccts:Definition>
	 *               <ccts:Cardinality>1..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Despatch Line</ccts:ObjectClass>
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
	 * Returns the value of the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Despatch Line. Item</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Item</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Despatch Line</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DespatchLineType#getItem <em>Item</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Shipment</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.ShipmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Despatch Line. Shipment</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Shipment</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Despatch Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Shipment</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Shipment</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shipment</em>' containment reference list.
	 * @generated
	 */
	public List getShipment() {
		if (shipment == null) {
			shipment = new ArrayList<ShipmentType>();
		}
		return shipment;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.backorderQuantity == null) ? 0 : this.backorderQuantity.hashCode());
		result = PRIME * result + ((this.backorderReason == null) ? 0 : this.backorderReason.hashCode());
		result = PRIME * result + ((this.deliveredQuantity == null) ? 0 : this.deliveredQuantity.hashCode());
		result = PRIME * result + ((this.gUID == null) ? 0 : this.gUID.hashCode());
		result = PRIME * result + ((this.iD == null) ? 0 : this.iD.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.item == null) ? 0 : this.item.hashCode());
		result = PRIME * result + ((this.lineStatusCode == null) ? 0 : this.lineStatusCode.hashCode());
		result = PRIME * result + ((this.note == null) ? 0 : this.note.hashCode());
		result = PRIME * result + ((this.orderLineReference == null) ? 0 : this.orderLineReference.hashCode());
		result = PRIME * result + ((this.outstandingQuantity == null) ? 0 : this.outstandingQuantity.hashCode());
		result = PRIME * result + ((this.outstandingReason == null) ? 0 : this.outstandingReason.hashCode());
		result = PRIME * result + ((this.overSupplyQuantity == null) ? 0 : this.overSupplyQuantity.hashCode());
		result = PRIME * result + ((this.shipment == null) ? 0 : this.shipment.hashCode());
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
		final DespatchLineType other = (DespatchLineType) obj;
		if (this.backorderQuantity == null) {
			if (other.backorderQuantity != null)
				return false;
		} else if (!this.backorderQuantity.equals(other.backorderQuantity))
			return false;
		if (this.backorderReason == null) {
			if (other.backorderReason != null)
				return false;
		} else if (!this.backorderReason.equals(other.backorderReason))
			return false;
		if (this.deliveredQuantity == null) {
			if (other.deliveredQuantity != null)
				return false;
		} else if (!this.deliveredQuantity.equals(other.deliveredQuantity))
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
		if (this.item == null) {
			if (other.item != null)
				return false;
		} else if (!this.item.equals(other.item))
			return false;
		if (this.lineStatusCode == null) {
			if (other.lineStatusCode != null)
				return false;
		} else if (!this.lineStatusCode.equals(other.lineStatusCode))
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
		if (this.outstandingQuantity == null) {
			if (other.outstandingQuantity != null)
				return false;
		} else if (!this.outstandingQuantity.equals(other.outstandingQuantity))
			return false;
		if (this.outstandingReason == null) {
			if (other.outstandingReason != null)
				return false;
		} else if (!this.outstandingReason.equals(other.outstandingReason))
			return false;
		if (this.overSupplyQuantity == null) {
			if (other.overSupplyQuantity != null)
				return false;
		} else if (!this.overSupplyQuantity.equals(other.overSupplyQuantity))
			return false;
		if (this.shipment == null) {
			if (other.shipment != null)
				return false;
		} else if (!this.shipment.equals(other.shipment))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // DespatchLineType