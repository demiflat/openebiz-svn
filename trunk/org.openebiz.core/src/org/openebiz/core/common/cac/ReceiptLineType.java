/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.GUIDType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.NoteType;
import org.openebiz.core.common.cbc.OverSupplyQuantityType;
import org.openebiz.core.common.cbc.ReceivedDateType;
import org.openebiz.core.common.cbc.ReceivedQuantityType;
import org.openebiz.core.common.cbc.RejectActionCodeType;
import org.openebiz.core.common.cbc.RejectReasonCodeType;
import org.openebiz.core.common.cbc.RejectedQuantityType;
import org.openebiz.core.common.cbc.ShortQuantityType;
import org.openebiz.core.common.cbc.ShortageActionCodeType;
import org.openebiz.core.common.cbc.TimingComplaintCodeType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receipt Line Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Receipt Line. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about a Receipt Line</ccts:Definition>
 *           <ccts:ObjectClass>Receipt Line</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.ReceiptLineType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ReceiptLineType#getGUID <em>GUID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ReceiptLineType#getNote <em>Note</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ReceiptLineType#getReceivedQuantity <em>Received Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ReceiptLineType#getShortQuantity <em>Short Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ReceiptLineType#getShortageActionCode <em>Shortage Action Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ReceiptLineType#getRejectedQuantity <em>Rejected Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ReceiptLineType#getRejectReasonCode <em>Reject Reason Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ReceiptLineType#getRejectActionCode <em>Reject Action Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ReceiptLineType#getOverSupplyQuantity <em>Over Supply Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ReceiptLineType#getReceivedDate <em>Received Date</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ReceiptLineType#getTimingComplaintCode <em>Timing Complaint Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ReceiptLineType#getOrderLineReference <em>Order Line Reference</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ReceiptLineType#getDespatchLineReference <em>Despatch Line Reference</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ReceiptLineType#getItem <em>Item</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ReceiptLineType#getShipment <em>Shipment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReceiptLineType implements Serializable {
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
	 * The cached value of the '{@link #getReceivedQuantity() <em>Received Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedQuantity()
	 * @generated
	 * @ordered
	 */
	protected ReceivedQuantityType receivedQuantity = null;

	/**
	 * The cached value of the '{@link #getShortQuantity() <em>Short Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortQuantity()
	 * @generated
	 * @ordered
	 */
	protected ShortQuantityType shortQuantity = null;

	/**
	 * The cached value of the '{@link #getShortageActionCode() <em>Shortage Action Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortageActionCode()
	 * @generated
	 * @ordered
	 */
	protected ShortageActionCodeType shortageActionCode = null;

	/**
	 * The cached value of the '{@link #getRejectedQuantity() <em>Rejected Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRejectedQuantity()
	 * @generated
	 * @ordered
	 */
	protected RejectedQuantityType rejectedQuantity = null;

	/**
	 * The cached value of the '{@link #getRejectReasonCode() <em>Reject Reason Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRejectReasonCode()
	 * @generated
	 * @ordered
	 */
	protected RejectReasonCodeType rejectReasonCode = null;

	/**
	 * The cached value of the '{@link #getRejectActionCode() <em>Reject Action Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRejectActionCode()
	 * @generated
	 * @ordered
	 */
	protected RejectActionCodeType rejectActionCode = null;

	/**
	 * The cached value of the '{@link #getOverSupplyQuantity() <em>Over Supply Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverSupplyQuantity()
	 * @generated
	 * @ordered
	 */
	protected OverSupplyQuantityType overSupplyQuantity = null;

	/**
	 * The cached value of the '{@link #getReceivedDate() <em>Received Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedDate()
	 * @generated
	 * @ordered
	 */
	protected ReceivedDateType receivedDate = null;

	/**
	 * The cached value of the '{@link #getTimingComplaintCode() <em>Timing Complaint Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingComplaintCode()
	 * @generated
	 * @ordered
	 */
	protected TimingComplaintCodeType timingComplaintCode = null;

	/**
	 * The cached value of the '{@link #getOrderLineReference() <em>Order Line Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderLineReference()
	 * @generated
	 * @ordered
	 */
	protected OrderLineReferenceType orderLineReference = null;

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
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected List item = null;

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
	public ReceiptLineType() {
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
		this.receivedQuantity = this.getReceivedQuantity();
		this.shortQuantity = this.getShortQuantity();
		this.shortageActionCode = this.getShortageActionCode();
		this.rejectedQuantity = this.getRejectedQuantity();
		this.rejectReasonCode = this.getRejectReasonCode();
		this.rejectActionCode = this.getRejectActionCode();
		this.overSupplyQuantity = this.getOverSupplyQuantity();
		this.receivedDate = this.getReceivedDate();
		this.timingComplaintCode = this.getTimingComplaintCode();
		this.orderLineReference = this.getOrderLineReference();
		this.despatchLineReference = this.getDespatchLineReference();
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
	 *               <ccts:DictionaryEntryName>Receipt Line. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the Receipt Line</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Receipt Line</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ReceiptLineType#getID <em>ID</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Receipt Line. Globally Unique Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A computer-generated globally unique identifier (GUID) for the Receipt Line instance</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Receipt Line</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ReceiptLineType#getGUID <em>GUID</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Receipt Line. Note. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Free form text applying to the Receipt Line. This element may contain notes or any other similar information that is not contained explicitly in another structure.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Receipt Line</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ReceiptLineType#getNote <em>Note</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Received Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Receipt Line. Received_ Quantity. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The quantity received</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Receipt Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Received</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Received Quantity</em>' containment reference.
	 * @see #setReceivedQuantity(ReceivedQuantityType)
	 * @generated
	 */
	public ReceivedQuantityType getReceivedQuantity() {
		return (receivedQuantity == null) ? new ReceivedQuantityType()
				: receivedQuantity;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ReceiptLineType#getReceivedQuantity <em>Received Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Received Quantity</em>' containment reference.
	 * @see #getReceivedQuantity()
	 * @generated
	 */
	public void setReceivedQuantity(ReceivedQuantityType newReceivedQuantity) {
		receivedQuantity = newReceivedQuantity;
	}

	/**
	 * Returns the value of the '<em><b>Short Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Receipt Line. Short_ Quantity. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The quantity received short; the difference between the quantity reported despatched and the quantity actually received</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Receipt Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Short</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Short Quantity</em>' containment reference.
	 * @see #setShortQuantity(ShortQuantityType)
	 * @generated
	 */
	public ShortQuantityType getShortQuantity() {
		return (shortQuantity == null) ? new ShortQuantityType()
				: shortQuantity;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ReceiptLineType#getShortQuantity <em>Short Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Quantity</em>' containment reference.
	 * @see #getShortQuantity()
	 * @generated
	 */
	public void setShortQuantity(ShortQuantityType newShortQuantity) {
		shortQuantity = newShortQuantity;
	}

	/**
	 * Returns the value of the '<em><b>Shortage Action Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Receipt Line. Shortage Action. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The action that the Delivery Party wishes the Despatch Party to take as a result of the shortage; expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Receipt Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Shortage Action</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shortage Action Code</em>' containment reference.
	 * @see #setShortageActionCode(ShortageActionCodeType)
	 * @generated
	 */
	public ShortageActionCodeType getShortageActionCode() {
		return (shortageActionCode == null) ? new ShortageActionCodeType()
				: shortageActionCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ReceiptLineType#getShortageActionCode <em>Shortage Action Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shortage Action Code</em>' containment reference.
	 * @see #getShortageActionCode()
	 * @generated
	 */
	public void setShortageActionCode(
			ShortageActionCodeType newShortageActionCode) {
		shortageActionCode = newShortageActionCode;
	}

	/**
	 * Returns the value of the '<em><b>Rejected Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Receipt Line. Rejected_ Quantity. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The quantity rejected</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Receipt Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Rejected</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rejected Quantity</em>' containment reference.
	 * @see #setRejectedQuantity(RejectedQuantityType)
	 * @generated
	 */
	public RejectedQuantityType getRejectedQuantity() {
		return (rejectedQuantity == null) ? new RejectedQuantityType()
				: rejectedQuantity;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ReceiptLineType#getRejectedQuantity <em>Rejected Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rejected Quantity</em>' containment reference.
	 * @see #getRejectedQuantity()
	 * @generated
	 */
	public void setRejectedQuantity(RejectedQuantityType newRejectedQuantity) {
		rejectedQuantity = newRejectedQuantity;
	}

	/**
	 * Returns the value of the '<em><b>Reject Reason Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Receipt Line. Reject Reason. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The reason for rejection expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Receipt Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Reject Reason</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reject Reason Code</em>' containment reference.
	 * @see #setRejectReasonCode(RejectReasonCodeType)
	 * @generated
	 */
	public RejectReasonCodeType getRejectReasonCode() {
		return (rejectReasonCode == null) ? new RejectReasonCodeType()
				: rejectReasonCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ReceiptLineType#getRejectReasonCode <em>Reject Reason Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reject Reason Code</em>' containment reference.
	 * @see #getRejectReasonCode()
	 * @generated
	 */
	public void setRejectReasonCode(RejectReasonCodeType newRejectReasonCode) {
		rejectReasonCode = newRejectReasonCode;
	}

	/**
	 * Returns the value of the '<em><b>Reject Action Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Receipt Line. Reject Action. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The action that the Delivery Party wishes the Despatch Party to take as a result of the rejection; expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Receipt Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Reject Action</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reject Action Code</em>' containment reference.
	 * @see #setRejectActionCode(RejectActionCodeType)
	 * @generated
	 */
	public RejectActionCodeType getRejectActionCode() {
		return (rejectActionCode == null) ? new RejectActionCodeType()
				: rejectActionCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ReceiptLineType#getRejectActionCode <em>Reject Action Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reject Action Code</em>' containment reference.
	 * @see #getRejectActionCode()
	 * @generated
	 */
	public void setRejectActionCode(RejectActionCodeType newRejectActionCode) {
		rejectActionCode = newRejectActionCode;
	}

	/**
	 * Returns the value of the '<em><b>Over Supply Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Receipt Line. Over Supply. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>indicate fluctuating quantity with regard to ordered/despatched quantity. Should only be positive number</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Receipt Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Over Supply</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Over Supply Quantity</em>' containment reference.
	 * @see #setOverSupplyQuantity(OverSupplyQuantityType1)
	 * @generated
	 */
	public OverSupplyQuantityType getOverSupplyQuantity() {
		return (overSupplyQuantity == null) ? new OverSupplyQuantityType()
				: overSupplyQuantity;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ReceiptLineType#getOverSupplyQuantity <em>Over Supply Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Over Supply Quantity</em>' containment reference.
	 * @see #getOverSupplyQuantity()
	 * @generated
	 */
	public void setOverSupplyQuantity(
			OverSupplyQuantityType newOverSupplyQuantity) {
		overSupplyQuantity = newOverSupplyQuantity;
	}

	/**
	 * Returns the value of the '<em><b>Received Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Receipt Line. Received Date. Date</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The date on which the good/services are received</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Receipt Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Received Date</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Received Date</em>' containment reference.
	 * @see #setReceivedDate(ReceivedDateType)
	 * @generated
	 */
	public ReceivedDateType getReceivedDate() {
		return (receivedDate == null) ? new ReceivedDateType() : receivedDate;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ReceiptLineType#getReceivedDate <em>Received Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Received Date</em>' containment reference.
	 * @see #getReceivedDate()
	 * @generated
	 */
	public void setReceivedDate(ReceivedDateType newReceivedDate) {
		receivedDate = newReceivedDate;
	}

	/**
	 * Returns the value of the '<em><b>Timing Complaint Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Receipt Line. Timing Complaint. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A complaint about the timing of delivery expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Receipt Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Timing Complaint</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timing Complaint Code</em>' containment reference.
	 * @see #setTimingComplaintCode(TimingComplaintCodeType)
	 * @generated
	 */
	public TimingComplaintCodeType getTimingComplaintCode() {
		return (timingComplaintCode == null) ? new TimingComplaintCodeType()
				: timingComplaintCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ReceiptLineType#getTimingComplaintCode <em>Timing Complaint Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Complaint Code</em>' containment reference.
	 * @see #getTimingComplaintCode()
	 * @generated
	 */
	public void setTimingComplaintCode(
			TimingComplaintCodeType newTimingComplaintCode) {
		timingComplaintCode = newTimingComplaintCode;
	}

	/**
	 * Returns the value of the '<em><b>Order Line Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Receipt Line. Order Line Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Order Line Reference</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Receipt Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Order Line Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Order Line Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order Line Reference</em>' containment reference.
	 * @see #setOrderLineReference(OrderLineReferenceType)
	 * @generated
	 */
	public OrderLineReferenceType getOrderLineReference() {
		return (orderLineReference == null) ? new OrderLineReferenceType()
				: orderLineReference;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ReceiptLineType#getOrderLineReference <em>Order Line Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Line Reference</em>' containment reference.
	 * @see #getOrderLineReference()
	 * @generated
	 */
	public void setOrderLineReference(
			OrderLineReferenceType newOrderLineReference) {
		orderLineReference = newOrderLineReference;
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
	 *               <ccts:DictionaryEntryName>Receipt Line. Despatch_ Line Reference. Line Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Despatch Line Reference</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Receipt Line</ccts:ObjectClass>
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
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.ItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Receipt Line. Item</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Item.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Receipt Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Item</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Item</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @generated
	 */
	public List getItem() {
		if (item == null) {
			item = new ArrayList<ItemType>();
		}
		return item;
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
	 *               <ccts:DictionaryEntryName>Receipt Line. Shipment</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Shipment.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Receipt Line</ccts:ObjectClass>
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
		result = PRIME * result + ((this.despatchLineReference == null) ? 0 : this.despatchLineReference.hashCode());
		result = PRIME * result + ((this.gUID == null) ? 0 : this.gUID.hashCode());
		result = PRIME * result + ((this.iD == null) ? 0 : this.iD.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.item == null) ? 0 : this.item.hashCode());
		result = PRIME * result + ((this.note == null) ? 0 : this.note.hashCode());
		result = PRIME * result + ((this.orderLineReference == null) ? 0 : this.orderLineReference.hashCode());
		result = PRIME * result + ((this.overSupplyQuantity == null) ? 0 : this.overSupplyQuantity.hashCode());
		result = PRIME * result + ((this.receivedDate == null) ? 0 : this.receivedDate.hashCode());
		result = PRIME * result + ((this.receivedQuantity == null) ? 0 : this.receivedQuantity.hashCode());
		result = PRIME * result + ((this.rejectActionCode == null) ? 0 : this.rejectActionCode.hashCode());
		result = PRIME * result + ((this.rejectReasonCode == null) ? 0 : this.rejectReasonCode.hashCode());
		result = PRIME * result + ((this.rejectedQuantity == null) ? 0 : this.rejectedQuantity.hashCode());
		result = PRIME * result + ((this.shipment == null) ? 0 : this.shipment.hashCode());
		result = PRIME * result + ((this.shortQuantity == null) ? 0 : this.shortQuantity.hashCode());
		result = PRIME * result + ((this.shortageActionCode == null) ? 0 : this.shortageActionCode.hashCode());
		result = PRIME * result + ((this.timingComplaintCode == null) ? 0 : this.timingComplaintCode.hashCode());
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
		final ReceiptLineType other = (ReceiptLineType) obj;
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
		if (this.item == null) {
			if (other.item != null)
				return false;
		} else if (!this.item.equals(other.item))
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
		if (this.overSupplyQuantity == null) {
			if (other.overSupplyQuantity != null)
				return false;
		} else if (!this.overSupplyQuantity.equals(other.overSupplyQuantity))
			return false;
		if (this.receivedDate == null) {
			if (other.receivedDate != null)
				return false;
		} else if (!this.receivedDate.equals(other.receivedDate))
			return false;
		if (this.receivedQuantity == null) {
			if (other.receivedQuantity != null)
				return false;
		} else if (!this.receivedQuantity.equals(other.receivedQuantity))
			return false;
		if (this.rejectActionCode == null) {
			if (other.rejectActionCode != null)
				return false;
		} else if (!this.rejectActionCode.equals(other.rejectActionCode))
			return false;
		if (this.rejectReasonCode == null) {
			if (other.rejectReasonCode != null)
				return false;
		} else if (!this.rejectReasonCode.equals(other.rejectReasonCode))
			return false;
		if (this.rejectedQuantity == null) {
			if (other.rejectedQuantity != null)
				return false;
		} else if (!this.rejectedQuantity.equals(other.rejectedQuantity))
			return false;
		if (this.shipment == null) {
			if (other.shipment != null)
				return false;
		} else if (!this.shipment.equals(other.shipment))
			return false;
		if (this.shortQuantity == null) {
			if (other.shortQuantity != null)
				return false;
		} else if (!this.shortQuantity.equals(other.shortQuantity))
			return false;
		if (this.shortageActionCode == null) {
			if (other.shortageActionCode != null)
				return false;
		} else if (!this.shortageActionCode.equals(other.shortageActionCode))
			return false;
		if (this.timingComplaintCode == null) {
			if (other.timingComplaintCode != null)
				return false;
		} else if (!this.timingComplaintCode.equals(other.timingComplaintCode))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // ReceiptLineType