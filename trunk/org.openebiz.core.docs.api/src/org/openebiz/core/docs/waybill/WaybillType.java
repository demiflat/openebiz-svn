/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.docs.waybill;

import java.util.List;

import org.openebiz.core.common.cac.PartyType;
import org.openebiz.core.common.cac.ShipmentType;

import org.openebiz.core.common.cbc.AdValoremIndicatorType;
import org.openebiz.core.common.cbc.CarrierAssignedIDType;
import org.openebiz.core.common.cbc.DeclaredCarriageValueAmountType;
import org.openebiz.core.common.cbc.GUIDType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.IssueDateType;
import org.openebiz.core.common.cbc.IssueTimeType;
import org.openebiz.core.common.cbc.NameType;
import org.openebiz.core.common.cbc.ShippingOrderIDType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Waybill. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>The Waybill is issued by the party, who acts as an agent for the carrier or other agents, to the party who gives instructions for the transportation services (shipper, consignor, etc.) stating the details of the transportation, charges and terms and conditions under which the transportation service is provided. The party issuing this document may not provide the physical transportation service. It corresponds to the information on the Forwarding Instruction. It is used for all modes of transport.
 * It can serve as a contractual document between the parties for the transportation service. The document made out by the carrier or on behalf of the carrier evidencing the contract for the transport of cargo.</ccts:Definition>
 *           <ccts:ObjectClass>Waybill</ccts:ObjectClass>
 *           <ccts:AlternativeBusinessTerms>Consignment Note</ccts:AlternativeBusinessTerms>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.docs.waybill.WaybillType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.docs.waybill.WaybillType#getCarrierAssignedID <em>Carrier Assigned ID</em>}</li>
 *   <li>{@link org.openebiz.core.docs.waybill.WaybillType#getGUID <em>GUID</em>}</li>
 *   <li>{@link org.openebiz.core.docs.waybill.WaybillType#getIssueDate <em>Issue Date</em>}</li>
 *   <li>{@link org.openebiz.core.docs.waybill.WaybillType#getIssueTime <em>Issue Time</em>}</li>
 *   <li>{@link org.openebiz.core.docs.waybill.WaybillType#getName <em>Name</em>}</li>
 *   <li>{@link org.openebiz.core.docs.waybill.WaybillType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openebiz.core.docs.waybill.WaybillType#getNote <em>Note</em>}</li>
 *   <li>{@link org.openebiz.core.docs.waybill.WaybillType#getShippingOrderID <em>Shipping Order ID</em>}</li>
 *   <li>{@link org.openebiz.core.docs.waybill.WaybillType#getAdValoremIndicator <em>Ad Valorem Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.docs.waybill.WaybillType#getDeclaredCarriageValueAmount <em>Declared Carriage Value Amount</em>}</li>
 *   <li>{@link org.openebiz.core.docs.waybill.WaybillType#getOtherInstruction <em>Other Instruction</em>}</li>
 *   <li>{@link org.openebiz.core.docs.waybill.WaybillType#getConsignorParty <em>Consignor Party</em>}</li>
 *   <li>{@link org.openebiz.core.docs.waybill.WaybillType#getCarrierParty <em>Carrier Party</em>}</li>
 *   <li>{@link org.openebiz.core.docs.waybill.WaybillType#getFreightForwarderParty <em>Freight Forwarder Party</em>}</li>
 *   <li>{@link org.openebiz.core.docs.waybill.WaybillType#getShipment <em>Shipment</em>}</li>
 *   <li>{@link org.openebiz.core.docs.waybill.WaybillType#getDocumentReference <em>Document Reference</em>}</li>
 *   <li>{@link org.openebiz.core.docs.waybill.WaybillType#getExchangeRate <em>Exchange Rate</em>}</li>
 *   <li>{@link org.openebiz.core.docs.waybill.WaybillType#getDocumentDistribution <em>Document Distribution</em>}</li>
 *   <li>{@link org.openebiz.core.docs.waybill.WaybillType#getSignature <em>Signature</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface WaybillType {
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
	 *               <ccts:DictionaryEntryName>Waybill. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Unique identifier of the Waybill. Reference number to identify a document evidencing a transport contract.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Waybill</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Master Waybill Number</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID</em>' containment reference.
	 * @see #setID(IDType)
	 */
	IDType getID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.waybill.WaybillType#getID <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' containment reference.
	 * @see #getID()
	 */
	void setID(IDType value);

	/**
	 * Returns the value of the '<em><b>Carrier Assigned ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Waybill. Carrier Assigned_ Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Reference number assigned by a carrier or its agent to identify a specific shipment.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Waybill</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Carrier Assigned</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Carrier Assigned ID</em>' containment reference.
	 * @see #setCarrierAssignedID(CarrierAssignedIDType)
	 */
	CarrierAssignedIDType getCarrierAssignedID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.waybill.WaybillType#getCarrierAssignedID <em>Carrier Assigned ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Assigned ID</em>' containment reference.
	 * @see #getCarrierAssignedID()
	 */
	void setCarrierAssignedID(CarrierAssignedIDType value);

	/**
	 * Returns the value of the '<em><b>GUID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Waybill. Globally Unique Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Globally Unique Identifier of one instance of a Waybill.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Waybill</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.docs.waybill.WaybillType#getGUID <em>GUID</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Waybill. Issue Date. Date</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Date on which the Waybill was issued.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Waybill</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.docs.waybill.WaybillType#getIssueDate <em>Issue Date</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Waybill. Issue Time. Time</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Time at which the Waybill was issued.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Waybill</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.docs.waybill.WaybillType#getIssueTime <em>Issue Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Time</em>' containment reference.
	 * @see #getIssueTime()
	 */
	void setIssueTime(IssueTimeType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Waybill. Name</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Name of a Waybill.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Waybill</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Name</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Name</ccts:RepresentationTerm>
	 *               <ccts:DataType>Name. Type</ccts:DataType>
	 *               <ccts:Examples>"Air Waybill", "House Waybill"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(NameType)
	 */
	NameType getName();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.waybill.WaybillType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 */
	void setName(NameType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cbc.DescriptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Waybill. Description. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Textual description of a Waybill.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Waybill</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Description</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference list.
	 */
	List getDescription();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cbc.NoteType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Waybill. Note. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Textual note associated with a Waybill.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Waybill</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Note</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 */
	List getNote();

	/**
	 * Returns the value of the '<em><b>Shipping Order ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Waybill. Shipping Order Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Reference number to identify a Shipping Order or Forwarding Instruction.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Waybill</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Shipping Order Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shipping Order ID</em>' containment reference.
	 * @see #setShippingOrderID(ShippingOrderIDType)
	 */
	ShippingOrderIDType getShippingOrderID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.waybill.WaybillType#getShippingOrderID <em>Shipping Order ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipping Order ID</em>' containment reference.
	 * @see #getShippingOrderID()
	 */
	void setShippingOrderID(ShippingOrderIDType value);

	/**
	 * Returns the value of the '<em><b>Ad Valorem Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Waybill. Ad Valorem Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A term used in commerce in reference to certain duties, called ad valorem duties, which are levied on commodities at certain rates per centum on their value.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Waybill</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Ad Valorem Indicator</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ad Valorem Indicator</em>' containment reference.
	 * @see #setAdValoremIndicator(AdValoremIndicatorType)
	 */
	AdValoremIndicatorType getAdValoremIndicator();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.waybill.WaybillType#getAdValoremIndicator <em>Ad Valorem Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ad Valorem Indicator</em>' containment reference.
	 * @see #getAdValoremIndicator()
	 */
	void setAdValoremIndicator(AdValoremIndicatorType value);

	/**
	 * Returns the value of the '<em><b>Declared Carriage Value Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Waybill. Declared_ Carriage Value. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Value, declared by the shipper or his agent solely for the purpose of varying the carrier's level of liability from that provided in the contract of carriage, in case of loss or damage to goods or delayed delivery.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Waybill</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Declared</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Carriage Value</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Declared Carriage Value Amount</em>' containment reference.
	 * @see #setDeclaredCarriageValueAmount(DeclaredCarriageValueAmountType)
	 */
	DeclaredCarriageValueAmountType getDeclaredCarriageValueAmount();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.waybill.WaybillType#getDeclaredCarriageValueAmount <em>Declared Carriage Value Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declared Carriage Value Amount</em>' containment reference.
	 * @see #getDeclaredCarriageValueAmount()
	 */
	void setDeclaredCarriageValueAmount(DeclaredCarriageValueAmountType value);

	/**
	 * Returns the value of the '<em><b>Other Instruction</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cbc.OtherInstructionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Waybill. Other_ Instruction. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Contains other free text based instructions related to the shipment to the forwarders or carriers. This should only be used where such information cannot be represented in other structured information entities within the document.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Waybill</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Other</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Instruction</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Instruction</em>' containment reference list.
	 */
	List getOtherInstruction();

	/**
	 * Returns the value of the '<em><b>Consignor Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Waybill. Consignor_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the party consigning goods as stipulated in the transport contract by the party ordering transport.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Waybill</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Consignor</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Consignor (WCO ID 71 and 72)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consignor Party</em>' containment reference.
	 * @see #setConsignorParty(PartyType)
	 */
	PartyType getConsignorParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.waybill.WaybillType#getConsignorParty <em>Consignor Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consignor Party</em>' containment reference.
	 * @see #getConsignorParty()
	 */
	void setConsignorParty(PartyType value);

	/**
	 * Returns the value of the '<em><b>Carrier Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Waybill. Carrier_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the party providing the transport of goods between named points.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Waybill</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Carrier</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Transport Company, Shipping Line, NVOCC, Airline,  Haulier, Courier, Carrier (WCO ID 49 and 50)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Carrier Party</em>' containment reference.
	 * @see #setCarrierParty(PartyType)
	 */
	PartyType getCarrierParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.waybill.WaybillType#getCarrierParty <em>Carrier Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Party</em>' containment reference.
	 * @see #getCarrierParty()
	 */
	void setCarrierParty(PartyType value);

	/**
	 * Returns the value of the '<em><b>Freight Forwarder Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Waybill. Freight Forwarder_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the party combining individual smaller consignments into a single larger shipment (so called consolidated consignment ) that is sent to a counterpart who mirrors the consolidator's activity by dividing the consolidated consignment into its original components.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Waybill</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Freight Forwarder</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Consolidator (WCO ID 192 AND 193)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Freight Forwarder Party</em>' containment reference.
	 * @see #setFreightForwarderParty(PartyType)
	 */
	PartyType getFreightForwarderParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.waybill.WaybillType#getFreightForwarderParty <em>Freight Forwarder Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Freight Forwarder Party</em>' containment reference.
	 * @see #getFreightForwarderParty()
	 */
	void setFreightForwarderParty(PartyType value);

	/**
	 * Returns the value of the '<em><b>Shipment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Waybill. Shipment</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A separately identifiable collection of goods items (available to be) transported from one consignor to one consignee via one or more modes of transport.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Waybill</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Shipment</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Shipment</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shipment</em>' containment reference.
	 * @see #setShipment(ShipmentType)
	 */
	ShipmentType getShipment();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.waybill.WaybillType#getShipment <em>Shipment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment</em>' containment reference.
	 * @see #getShipment()
	 */
	void setShipment(ShipmentType value);

	/**
	 * Returns the value of the '<em><b>Document Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.DocumentReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Waybill. Document Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Information directly relating to the identification of a document instance.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Waybill</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Document Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Document Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Reference</em>' containment reference list.
	 */
	List getDocumentReference();

	/**
	 * Returns the value of the '<em><b>Exchange Rate</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.ExchangeRateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Waybill. Exchange Rate</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Information that directly relates to the rate of exchange (conversion) between two currencies.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Waybill</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Exchange Rate</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Exchange Rate</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exchange Rate</em>' containment reference list.
	 */
	List getExchangeRate();

	/**
	 * Returns the value of the '<em><b>Document Distribution</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.DocumentDistributionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Waybill. Document Distribution</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The distribution of the Waybill to interested parties</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Waybill</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Document Distribution</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Document Distribution</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Distribution</em>' containment reference list.
	 */
	List getDocumentDistribution();

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.SignatureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Waybill. Signature</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>One or more signatures applied to the document instance</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Waybill</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Signature</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Signature</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature</em>' containment reference list.
	 */
	List getSignature();

} // WaybillType