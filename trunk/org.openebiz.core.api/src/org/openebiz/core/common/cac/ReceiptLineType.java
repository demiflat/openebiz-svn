/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import java.util.List;

import org.openebiz.core.common.cbc.GUIDType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.NoteType;
import org.openebiz.core.common.cbc.OverSupplyQuantityType1;
import org.openebiz.core.common.cbc.ReceivedDateType;
import org.openebiz.core.common.cbc.ReceivedQuantityType;
import org.openebiz.core.common.cbc.RejectActionCodeType;
import org.openebiz.core.common.cbc.RejectReasonCodeType;
import org.openebiz.core.common.cbc.RejectedQuantityType;
import org.openebiz.core.common.cbc.ShortQuantityType;
import org.openebiz.core.common.cbc.ShortageActionCodeType;
import org.openebiz.core.common.cbc.TimingComplaintCodeType;

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
 */
public interface ReceiptLineType {
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
	 */
	IDType getID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ReceiptLineType#getID <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' containment reference.
	 * @see #getID()
	 */
	void setID(IDType value);

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
	 */
	GUIDType getGUID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ReceiptLineType#getGUID <em>GUID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GUID</em>' containment reference.
	 * @see #getGUID()
	 */
	void setGUID(GUIDType value);

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
	 */
	NoteType getNote();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ReceiptLineType#getNote <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' containment reference.
	 * @see #getNote()
	 */
	void setNote(NoteType value);

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
	 */
	ReceivedQuantityType getReceivedQuantity();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ReceiptLineType#getReceivedQuantity <em>Received Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Received Quantity</em>' containment reference.
	 * @see #getReceivedQuantity()
	 */
	void setReceivedQuantity(ReceivedQuantityType value);

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
	 */
	ShortQuantityType getShortQuantity();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ReceiptLineType#getShortQuantity <em>Short Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Quantity</em>' containment reference.
	 * @see #getShortQuantity()
	 */
	void setShortQuantity(ShortQuantityType value);

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
	 */
	ShortageActionCodeType getShortageActionCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ReceiptLineType#getShortageActionCode <em>Shortage Action Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shortage Action Code</em>' containment reference.
	 * @see #getShortageActionCode()
	 */
	void setShortageActionCode(ShortageActionCodeType value);

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
	 */
	RejectedQuantityType getRejectedQuantity();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ReceiptLineType#getRejectedQuantity <em>Rejected Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rejected Quantity</em>' containment reference.
	 * @see #getRejectedQuantity()
	 */
	void setRejectedQuantity(RejectedQuantityType value);

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
	 */
	RejectReasonCodeType getRejectReasonCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ReceiptLineType#getRejectReasonCode <em>Reject Reason Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reject Reason Code</em>' containment reference.
	 * @see #getRejectReasonCode()
	 */
	void setRejectReasonCode(RejectReasonCodeType value);

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
	 */
	RejectActionCodeType getRejectActionCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ReceiptLineType#getRejectActionCode <em>Reject Action Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reject Action Code</em>' containment reference.
	 * @see #getRejectActionCode()
	 */
	void setRejectActionCode(RejectActionCodeType value);

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
	 */
	OverSupplyQuantityType1 getOverSupplyQuantity();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ReceiptLineType#getOverSupplyQuantity <em>Over Supply Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Over Supply Quantity</em>' containment reference.
	 * @see #getOverSupplyQuantity()
	 */
	void setOverSupplyQuantity(OverSupplyQuantityType1 value);

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
	 */
	ReceivedDateType getReceivedDate();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ReceiptLineType#getReceivedDate <em>Received Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Received Date</em>' containment reference.
	 * @see #getReceivedDate()
	 */
	void setReceivedDate(ReceivedDateType value);

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
	 */
	TimingComplaintCodeType getTimingComplaintCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ReceiptLineType#getTimingComplaintCode <em>Timing Complaint Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Complaint Code</em>' containment reference.
	 * @see #getTimingComplaintCode()
	 */
	void setTimingComplaintCode(TimingComplaintCodeType value);

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
	 */
	OrderLineReferenceType getOrderLineReference();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ReceiptLineType#getOrderLineReference <em>Order Line Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Line Reference</em>' containment reference.
	 * @see #getOrderLineReference()
	 */
	void setOrderLineReference(OrderLineReferenceType value);

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
	 */
	List getDespatchLineReference();

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
	 */
	List getItem();

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
	 */
	List getShipment();

} // ReceiptLineType