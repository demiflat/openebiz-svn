/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.businessdocs;

import org.openebiz.core.common.cac.DocumentDistributionType;
import org.openebiz.core.common.cac.DocumentReferenceType;
import org.openebiz.core.common.cac.ExchangeRateType;
import org.openebiz.core.common.cac.PartyType;
import org.openebiz.core.common.cac.ShipmentType;
import org.openebiz.core.common.cac.SignatureType;

import org.openebiz.core.common.cbc.AdValoremIndicatorType;
import org.openebiz.core.common.cbc.CarrierAssignedIDType;
import org.openebiz.core.common.cbc.DeclaredCarriageValueAmountType;
import org.openebiz.core.common.cbc.DescriptionType;
import org.openebiz.core.common.cbc.GUIDType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.IssueDateType;
import org.openebiz.core.common.cbc.IssueTimeType;
import org.openebiz.core.common.cbc.NameType;
import org.openebiz.core.common.cbc.NoteType;
import org.openebiz.core.common.cbc.OtherInstructionType;
import org.openebiz.core.common.cbc.ShippingOrderIDType;
import org.openebiz.core.common.cbc.StatusCodeType;
import org.openebiz.core.common.cbc.ToOrderIndicatorType;

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
 *           <ccts:DictionaryEntryName>Bill Of Lading. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>The Bill of Lading is issued by the party, who acts as an agent for the carrier or other agents, to the party who gives instructions for the transportation services (shipper, consignor, etc.) stating the details of the transportation, charges and terms and conditions under which the transportation service is provided. The party issuing this document does not necessarily provide the physical transportation service. It corresponds to the information on the Forwarding Instruction. It is used for any mode of transport.
 * A Bill of Lading can serve as a contractual document between the parties for the transportation service.  The document evidences a contract of carriage by sea and the acceptance of responsibility for the goods by the carrier, and by which the carrier undertakes to deliver the goods against surrender of the document.  A provision in the document that the goods are to be delivered to the order of a named person, or to order, or to bearer, constitutes such an undertaking.</ccts:Definition>
 *           <ccts:ObjectClass>Bill Of Lading</ccts:ObjectClass>
 *           <ccts:AlternativeBusinessTerms>House Bill of Landing, Master Bill, Bill</ccts:AlternativeBusinessTerms>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.businessdocs.BillOfLadingType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.BillOfLadingType#getCarrierAssignedID <em>Carrier Assigned ID</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.BillOfLadingType#getGUID <em>GUID</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.BillOfLadingType#getIssueDate <em>Issue Date</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.BillOfLadingType#getIssueTime <em>Issue Time</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.BillOfLadingType#getName <em>Name</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.BillOfLadingType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.BillOfLadingType#getNote <em>Note</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.BillOfLadingType#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.BillOfLadingType#getShippingOrderID <em>Shipping Order ID</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.BillOfLadingType#getToOrderIndicator <em>To Order Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.BillOfLadingType#getAdValoremIndicator <em>Ad Valorem Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.BillOfLadingType#getDeclaredCarriageValueAmount <em>Declared Carriage Value Amount</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.BillOfLadingType#getOtherInstruction <em>Other Instruction</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.BillOfLadingType#getConsignorParty <em>Consignor Party</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.BillOfLadingType#getCarrierParty <em>Carrier Party</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.BillOfLadingType#getFreightForwarderParty <em>Freight Forwarder Party</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.BillOfLadingType#getShipment <em>Shipment</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.BillOfLadingType#getDocumentReference <em>Document Reference</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.BillOfLadingType#getExchangeRate <em>Exchange Rate</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.BillOfLadingType#getDocumentDistribution <em>Document Distribution</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.BillOfLadingType#getSignature <em>Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BillOfLadingType implements Serializable {
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
	 * The cached value of the '{@link #getCarrierAssignedID() <em>Carrier Assigned ID</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierAssignedID()
	 * @generated
	 * @ordered
	 */
	protected CarrierAssignedIDType carrierAssignedID = null;

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
	 * The cached value of the '{@link #getName() <em>Name</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected NameType name = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected List description = null;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected List note = null;

	/**
	 * The cached value of the '{@link #getStatusCode() <em>Status Code</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusCode()
	 * @generated
	 * @ordered
	 */
	protected StatusCodeType statusCode = null;

	/**
	 * The cached value of the '{@link #getShippingOrderID() <em>Shipping Order ID</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShippingOrderID()
	 * @generated
	 * @ordered
	 */
	protected ShippingOrderIDType shippingOrderID = null;

	/**
	 * The cached value of the '{@link #getToOrderIndicator() <em>To Order Indicator</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToOrderIndicator()
	 * @generated
	 * @ordered
	 */
	protected ToOrderIndicatorType toOrderIndicator = null;

	/**
	 * The cached value of the '{@link #getAdValoremIndicator() <em>Ad Valorem Indicator</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdValoremIndicator()
	 * @generated
	 * @ordered
	 */
	protected AdValoremIndicatorType adValoremIndicator = null;

	/**
	 * The cached value of the '{@link #getDeclaredCarriageValueAmount() <em>Declared Carriage Value Amount</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaredCarriageValueAmount()
	 * @generated
	 * @ordered
	 */
	protected DeclaredCarriageValueAmountType declaredCarriageValueAmount = null;

	/**
	 * The cached value of the '{@link #getOtherInstruction() <em>Other Instruction</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherInstruction()
	 * @generated
	 * @ordered
	 */
	protected List otherInstruction = null;

	/**
	 * The cached value of the '{@link #getConsignorParty() <em>Consignor Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsignorParty()
	 * @generated
	 * @ordered
	 */
	protected PartyType consignorParty = null;

	/**
	 * The cached value of the '{@link #getCarrierParty() <em>Carrier Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierParty()
	 * @generated
	 * @ordered
	 */
	protected PartyType carrierParty = null;

	/**
	 * The cached value of the '{@link #getFreightForwarderParty() <em>Freight Forwarder Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreightForwarderParty()
	 * @generated
	 * @ordered
	 */
	protected PartyType freightForwarderParty = null;

	/**
	 * The cached value of the '{@link #getShipment() <em>Shipment</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipment()
	 * @generated
	 * @ordered
	 */
	protected ShipmentType shipment = null;

	/**
	 * The cached value of the '{@link #getDocumentReference() <em>Document Reference</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentReference()
	 * @generated
	 * @ordered
	 */
	protected List documentReference = null;

	/**
	 * The cached value of the '{@link #getExchangeRate() <em>Exchange Rate</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangeRate()
	 * @generated
	 * @ordered
	 */
	protected List exchangeRate = null;

	/**
	 * The cached value of the '{@link #getDocumentDistribution() <em>Document Distribution</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentDistribution()
	 * @generated
	 * @ordered
	 */
	protected List documentDistribution = null;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected List signature = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillOfLadingType() {
		super();
		this.init();
	}
	
	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.adValoremIndicator = this.getAdValoremIndicator();
		this.carrierAssignedID = this.getCarrierAssignedID();
		this.carrierParty = this.getCarrierParty();
		this.consignorParty = this.getConsignorParty();
		this.declaredCarriageValueAmount = this.getDeclaredCarriageValueAmount();
		this.description = this.getDescription();
		this.documentDistribution = this.getDocumentDistribution();
		this.documentReference = this.getDocumentReference();
		this.exchangeRate = this.getExchangeRate();
		this.freightForwarderParty = this.getFreightForwarderParty();
		this.gUID = this.getGUID();
		this.iD = this.getID();
		this.issueDate = this.getIssueDate();
		this.issueTime = this.getIssueTime();
		this.name = this.getName();
		this.note = this.getNote();
		this.otherInstruction = this.getOtherInstruction();
		this.shipment = this.getShipment();
		this.shippingOrderID = this.getShippingOrderID();
		this.signature = this.getSignature();
		this.statusCode = this.getStatusCode();
		this.toOrderIndicator = this.getToOrderIndicator();
	}
	
	/**
	 * Returns the value of the '<em><b>ID</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Bill Of Lading. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Unique Identifier of the Bill Of Lading. Reference number to identify a document evidencing a transport contract.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Bill Of Lading</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Bill of Lading Number</ccts:AlternativeBusinessTerms>
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
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.billoflading.BillOfLadingType#getID <em>ID</em>}'
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
	 * Returns the value of the '<em><b>Carrier Assigned ID</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Bill Of Lading. Carrier Assigned_ Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Reference number assigned by a carrier or its agent to identify a specific shipment such as a booking reference number when cargo space is reserved prior to loading.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Bill Of Lading</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Carrier Assigned</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Booking Reference Number</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Carrier Assigned ID</em>'
	 * @see #setCarrierAssignedID(CarrierAssignedIDType)
	 * @generated
	 */
	public CarrierAssignedIDType getCarrierAssignedID() {
		return (carrierAssignedID == null) ? new CarrierAssignedIDType()
				: carrierAssignedID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.billoflading.BillOfLadingType#getCarrierAssignedID <em>Carrier Assigned ID</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Assigned ID</em>'
	 * @see #getCarrierAssignedID()
	 * @generated
	 */
	public void setCarrierAssignedID(CarrierAssignedIDType newCarrierAssignedID) {
		carrierAssignedID = newCarrierAssignedID;
	}

	/**
	 * Returns the value of the '<em><b>GUID</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Bill Of Lading. Globally Unique Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Globally Unique Identifier of the instance of this Bill Of Lading.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Bill Of Lading</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.billoflading.BillOfLadingType#getGUID <em>GUID</em>}'
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
	 *               <ccts:DictionaryEntryName>Bill Of Lading. Issue Date. Date</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Date on which the Bill Of Lading was issued.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Bill Of Lading</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Issue Date</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Transport Document Date</ccts:AlternativeBusinessTerms>
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
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.billoflading.BillOfLadingType#getIssueDate <em>Issue Date</em>}'
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
	 *               <ccts:DictionaryEntryName>Bill Of Lading. Issue Time. Time</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Time at which the Bill Of Lading was issued.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Bill Of Lading</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.billoflading.BillOfLadingType#getIssueTime <em>Issue Time</em>}'
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
	 * Returns the value of the '<em><b>Name</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Bill Of Lading. Name</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The business name given to the document type.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Bill Of Lading</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Name</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Name</ccts:RepresentationTerm>
	 *               <ccts:DataType>Name. Type</ccts:DataType>
	 *               <ccts:Examples>"House Bill", "Consolidated Bill of Lading", "Proforma"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>'
	 * @see #setName(NameType)
	 * @generated
	 */
	public NameType getName() {
		return (name == null) ? new NameType() : name;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.billoflading.BillOfLadingType#getName <em>Name</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>'
	 * @see #getName()
	 * @generated
	 */
	public void setName(NameType newName) {
		name = newName;
	}

	/**
	 * Returns the value of the '<em><b>Description</b></em>'
	 * The list contents are of type {@link org.openebiz.core.common.cbc.DescriptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Bill Of Lading. Description. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Purpose of the document instance</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Bill Of Lading</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Description</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>'
	 * @generated
	 */
	public List getDescription() {
		if (description == null) {
			description = new ArrayList<DescriptionType>();
		}
		return description;
	}

	/**
	 * Returns the value of the '<em><b>Note</b></em>'
	 * The list contents are of type {@link org.openebiz.core.common.cbc.NoteType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Bill Of Lading. Note. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Contains any free form text pertinent to the entire document or to the document message itself. This element may contain notes or any other similar information that is not contained explicitly in another structure.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Bill Of Lading</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Note</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>'
	 * @generated
	 */
	public List getNote() {
		if (note == null) {
			note = new ArrayList<NoteType>();
		}
		return note;
	}

	/**
	 * Returns the value of the '<em><b>Status Code</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Bill Of Lading. Status. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Indicates the status of the Bill Of Lading (revision, replacement, etc)</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Bill Of Lading</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Status</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Code</em>'
	 * @see #setStatusCode(StatusCodeType)
	 * @generated
	 */
	public StatusCodeType getStatusCode() {
		return (statusCode == null) ? new StatusCodeType() : statusCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.billoflading.BillOfLadingType#getStatusCode <em>Status Code</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Code</em>'
	 * @see #getStatusCode()
	 * @generated
	 */
	public void setStatusCode(StatusCodeType newStatusCode) {
		statusCode = newStatusCode;
	}

	/**
	 * Returns the value of the '<em><b>Shipping Order ID</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Bill Of Lading. Shipping Order Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Reference number to identify a Shipping Order or Forwarding Instruction.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Bill Of Lading</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Shipping Order Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Freight forwarding instruction, Shippers letter of instruction</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shipping Order ID</em>'
	 * @see #setShippingOrderID(ShippingOrderIDType)
	 * @generated
	 */
	public ShippingOrderIDType getShippingOrderID() {
		return (shippingOrderID == null) ? new ShippingOrderIDType()
				: shippingOrderID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.billoflading.BillOfLadingType#getShippingOrderID <em>Shipping Order ID</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipping Order ID</em>'
	 * @see #getShippingOrderID()
	 * @generated
	 */
	public void setShippingOrderID(ShippingOrderIDType newShippingOrderID) {
		shippingOrderID = newShippingOrderID;
	}

	/**
	 * Returns the value of the '<em><b>To Order Indicator</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Bill Of Lading. To Order Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Indicator of whether the transport document is consigned to order.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Bill Of Lading</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>To Order Indicator</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Order Indicator</em>'
	 * @see #setToOrderIndicator(ToOrderIndicatorType)
	 * @generated
	 */
	public ToOrderIndicatorType getToOrderIndicator() {
		return (toOrderIndicator == null) ? new ToOrderIndicatorType()
				: toOrderIndicator;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.billoflading.BillOfLadingType#getToOrderIndicator <em>To Order Indicator</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Order Indicator</em>'
	 * @see #getToOrderIndicator()
	 * @generated
	 */
	public void setToOrderIndicator(ToOrderIndicatorType newToOrderIndicator) {
		toOrderIndicator = newToOrderIndicator;
	}

	/**
	 * Returns the value of the '<em><b>Ad Valorem Indicator</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Bill Of Lading. Ad Valorem Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A term used in commerce in reference to certain duties, called ad valorem duties, which are levied on commodities at certain rates per centum on their value.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Bill Of Lading</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Ad Valorem Indicator</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ad Valorem Indicator</em>'
	 * @see #setAdValoremIndicator(AdValoremIndicatorType)
	 * @generated
	 */
	public AdValoremIndicatorType getAdValoremIndicator() {
		return (adValoremIndicator == null) ? new AdValoremIndicatorType()
				: adValoremIndicator;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.billoflading.BillOfLadingType#getAdValoremIndicator <em>Ad Valorem Indicator</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ad Valorem Indicator</em>'
	 * @see #getAdValoremIndicator()
	 * @generated
	 */
	public void setAdValoremIndicator(
			AdValoremIndicatorType newAdValoremIndicator) {
		adValoremIndicator = newAdValoremIndicator;
	}

	/**
	 * Returns the value of the '<em><b>Declared Carriage Value Amount</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Bill Of Lading. Declared_ Carriage Value. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Value, declared by the shipper or his agent solely for the purpose of varying the carrier's level of liability from that provided in the contract of carriage, in case of loss or damage to goods or delayed delivery.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Bill Of Lading</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Declared</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Carriage Value</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Interest in Delivery</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Declared Carriage Value Amount</em>'
	 * @see #setDeclaredCarriageValueAmount(DeclaredCarriageValueAmountType)
	 * @generated
	 */
	public DeclaredCarriageValueAmountType getDeclaredCarriageValueAmount() {
		return (declaredCarriageValueAmount == null) ? new DeclaredCarriageValueAmountType()
				: declaredCarriageValueAmount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.billoflading.BillOfLadingType#getDeclaredCarriageValueAmount <em>Declared Carriage Value Amount</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declared Carriage Value Amount</em>'
	 * @see #getDeclaredCarriageValueAmount()
	 * @generated
	 */
	public void setDeclaredCarriageValueAmount(
			DeclaredCarriageValueAmountType newDeclaredCarriageValueAmount) {
		declaredCarriageValueAmount = newDeclaredCarriageValueAmount;
	}

	/**
	 * Returns the value of the '<em><b>Other Instruction</b></em>'
	 * The list contents are of type {@link org.openebiz.core.common.cbc.OtherInstructionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Bill Of Lading. Other_ Instruction. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Contains other free text based instructions related to the shipment to the forwarders or carriers. This should only be used where such information cannot be represented in other structured information entities within the document.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Bill Of Lading</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Other</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Instruction</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Bill of Lading Remark</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Instruction</em>'
	 * @generated
	 */
	public List getOtherInstruction() {
		if (otherInstruction == null) {
			otherInstruction = new ArrayList<
					OtherInstructionType>();
		}
		return otherInstruction;
	}

	/**
	 * Returns the value of the '<em><b>Consignor Party</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Bill Of Lading. Consignor_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the party consigning goods as stipulated in the transport contract by the party ordering transport.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Bill Of Lading</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Consignor</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Consignor (WCO ID 71 and 72)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consignor Party</em>'
	 * @see #setConsignorParty(PartyType)
	 * @generated
	 */
	public PartyType getConsignorParty() {
		return (consignorParty == null) ? new PartyType() : consignorParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.billoflading.BillOfLadingType#getConsignorParty <em>Consignor Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consignor Party</em>'
	 * @see #getConsignorParty()
	 * @generated
	 */
	public void setConsignorParty(PartyType newConsignorParty) {
		consignorParty = newConsignorParty;
	}

	/**
	 * Returns the value of the '<em><b>Carrier Party</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Bill Of Lading. Carrier_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the party providing the transport of goods between named points.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Bill Of Lading</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Carrier</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Transport Company, Shipping Line, NVOCC, Airline,  Haulier, Courier, Carrier (WCO ID 49 and 50)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Carrier Party</em>'
	 * @see #setCarrierParty(PartyType)
	 * @generated
	 */
	public PartyType getCarrierParty() {
		return (carrierParty == null) ? new PartyType() : carrierParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.billoflading.BillOfLadingType#getCarrierParty <em>Carrier Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Party</em>'
	 * @see #getCarrierParty()
	 * @generated
	 */
	public void setCarrierParty(PartyType newCarrierParty) {
		carrierParty = newCarrierParty;
	}

	/**
	 * Returns the value of the '<em><b>Freight Forwarder Party</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Bill Of Lading. Freight Forwarder_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the party combining individual smaller consignments into a single larger shipment (so called consolidated shipment) that is sent to a counterpart who mirrors the consolidator's activity by dividing the consolidated consignment into its original components.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Bill Of Lading</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Freight Forwarder</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Consolidator (WCO ID 192 AND 193)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Freight Forwarder Party</em>'
	 * @see #setFreightForwarderParty(PartyType)
	 * @generated
	 */
	public PartyType getFreightForwarderParty() {
		return (freightForwarderParty == null) ? new PartyType()
				: freightForwarderParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.billoflading.BillOfLadingType#getFreightForwarderParty <em>Freight Forwarder Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Freight Forwarder Party</em>'
	 * @see #getFreightForwarderParty()
	 * @generated
	 */
	public void setFreightForwarderParty(PartyType newFreightForwarderParty) {
		freightForwarderParty = newFreightForwarderParty;
	}

	/**
	 * Returns the value of the '<em><b>Shipment</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Bill Of Lading. Shipment</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Information about the separately identifiable collection of goods items (available to be) transported from one consignor to one consignee via one or more modes of transport.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Bill Of Lading</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Shipment</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Shipment</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shipment</em>'
	 * @see #setShipment(ShipmentType)
	 * @generated
	 */
	public ShipmentType getShipment() {
		return (shipment == null) ? new ShipmentType() : shipment;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.billoflading.BillOfLadingType#getShipment <em>Shipment</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment</em>'
	 * @see #getShipment()
	 * @generated
	 */
	public void setShipment(ShipmentType newShipment) {
		shipment = newShipment;
	}

	/**
	 * Returns the value of the '<em><b>Document Reference</b></em>'
	 * The list contents are of type {@link org.openebiz.core.common.cac.DocumentReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Bill Of Lading. Document Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Information directly relating to the identification of a document instance.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Bill Of Lading</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Document Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Document Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Reference</em>'
	 * @generated
	 */
	public List getDocumentReference() {
		if (documentReference == null) {
			documentReference = new ArrayList<
					DocumentReferenceType>();
		}
		return documentReference;
	}

	/**
	 * Returns the value of the '<em><b>Exchange Rate</b></em>'
	 * The list contents are of type {@link org.openebiz.core.common.cac.ExchangeRateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Bill Of Lading. Exchange Rate</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Information that directly relates to the rate of exchange (conversion) between two currencies.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Bill Of Lading</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Exchange Rate</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Exchange Rate</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exchange Rate</em>'
	 * @generated
	 */
	public List getExchangeRate() {
		if (exchangeRate == null) {
			exchangeRate = new ArrayList<ExchangeRateType>();
		}
		return exchangeRate;
	}

	/**
	 * Returns the value of the '<em><b>Document Distribution</b></em>'
	 * The list contents are of type {@link org.openebiz.core.common.cac.DocumentDistributionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Bill Of Lading. Document Distribution</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The distribution of the Bill to interested parties</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Bill Of Lading</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Document Distribution</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Document Distribution</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Distribution</em>'
	 * @generated
	 */
	public List getDocumentDistribution() {
		if (documentDistribution == null) {
			documentDistribution = new ArrayList<
					DocumentDistributionType>();
		}
		return documentDistribution;
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
	 *               <ccts:DictionaryEntryName>Bill Of Lading. Signature</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>One or more signatures applied to the document instance</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Bill Of Lading</ccts:ObjectClass>
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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.adValoremIndicator == null) ? 0 : this.adValoremIndicator.hashCode());
		result = PRIME * result + ((this.carrierAssignedID == null) ? 0 : this.carrierAssignedID.hashCode());
		result = PRIME * result + ((this.carrierParty == null) ? 0 : this.carrierParty.hashCode());
		result = PRIME * result + ((this.consignorParty == null) ? 0 : this.consignorParty.hashCode());
		result = PRIME * result + ((this.declaredCarriageValueAmount == null) ? 0 : this.declaredCarriageValueAmount.hashCode());
		result = PRIME * result + ((this.description == null) ? 0 : this.description.hashCode());
		result = PRIME * result + ((this.documentDistribution == null) ? 0 : this.documentDistribution.hashCode());
		result = PRIME * result + ((this.documentReference == null) ? 0 : this.documentReference.hashCode());
		result = PRIME * result + ((this.exchangeRate == null) ? 0 : this.exchangeRate.hashCode());
		result = PRIME * result + ((this.freightForwarderParty == null) ? 0 : this.freightForwarderParty.hashCode());
		result = PRIME * result + ((this.gUID == null) ? 0 : this.gUID.hashCode());
		result = PRIME * result + ((this.iD == null) ? 0 : this.iD.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.issueDate == null) ? 0 : this.issueDate.hashCode());
		result = PRIME * result + ((this.issueTime == null) ? 0 : this.issueTime.hashCode());
		result = PRIME * result + ((this.name == null) ? 0 : this.name.hashCode());
		result = PRIME * result + ((this.note == null) ? 0 : this.note.hashCode());
		result = PRIME * result + ((this.otherInstruction == null) ? 0 : this.otherInstruction.hashCode());
		result = PRIME * result + ((this.shipment == null) ? 0 : this.shipment.hashCode());
		result = PRIME * result + ((this.shippingOrderID == null) ? 0 : this.shippingOrderID.hashCode());
		result = PRIME * result + ((this.signature == null) ? 0 : this.signature.hashCode());
		result = PRIME * result + ((this.statusCode == null) ? 0 : this.statusCode.hashCode());
		result = PRIME * result + ((this.toOrderIndicator == null) ? 0 : this.toOrderIndicator.hashCode());
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
		final BillOfLadingType other = (BillOfLadingType) obj;
		if (this.adValoremIndicator == null) {
			if (other.adValoremIndicator != null)
				return false;
		} else if (!this.adValoremIndicator.equals(other.adValoremIndicator))
			return false;
		if (this.carrierAssignedID == null) {
			if (other.carrierAssignedID != null)
				return false;
		} else if (!this.carrierAssignedID.equals(other.carrierAssignedID))
			return false;
		if (this.carrierParty == null) {
			if (other.carrierParty != null)
				return false;
		} else if (!this.carrierParty.equals(other.carrierParty))
			return false;
		if (this.consignorParty == null) {
			if (other.consignorParty != null)
				return false;
		} else if (!this.consignorParty.equals(other.consignorParty))
			return false;
		if (this.declaredCarriageValueAmount == null) {
			if (other.declaredCarriageValueAmount != null)
				return false;
		} else if (!this.declaredCarriageValueAmount.equals(other.declaredCarriageValueAmount))
			return false;
		if (this.description == null) {
			if (other.description != null)
				return false;
		} else if (!this.description.equals(other.description))
			return false;
		if (this.documentDistribution == null) {
			if (other.documentDistribution != null)
				return false;
		} else if (!this.documentDistribution.equals(other.documentDistribution))
			return false;
		if (this.documentReference == null) {
			if (other.documentReference != null)
				return false;
		} else if (!this.documentReference.equals(other.documentReference))
			return false;
		if (this.exchangeRate == null) {
			if (other.exchangeRate != null)
				return false;
		} else if (!this.exchangeRate.equals(other.exchangeRate))
			return false;
		if (this.freightForwarderParty == null) {
			if (other.freightForwarderParty != null)
				return false;
		} else if (!this.freightForwarderParty.equals(other.freightForwarderParty))
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
		if (this.name == null) {
			if (other.name != null)
				return false;
		} else if (!this.name.equals(other.name))
			return false;
		if (this.note == null) {
			if (other.note != null)
				return false;
		} else if (!this.note.equals(other.note))
			return false;
		if (this.otherInstruction == null) {
			if (other.otherInstruction != null)
				return false;
		} else if (!this.otherInstruction.equals(other.otherInstruction))
			return false;
		if (this.shipment == null) {
			if (other.shipment != null)
				return false;
		} else if (!this.shipment.equals(other.shipment))
			return false;
		if (this.shippingOrderID == null) {
			if (other.shippingOrderID != null)
				return false;
		} else if (!this.shippingOrderID.equals(other.shippingOrderID))
			return false;
		if (this.signature == null) {
			if (other.signature != null)
				return false;
		} else if (!this.signature.equals(other.signature))
			return false;
		if (this.statusCode == null) {
			if (other.statusCode != null)
				return false;
		} else if (!this.statusCode.equals(other.statusCode))
			return false;
		if (this.toOrderIndicator == null) {
			if (other.toOrderIndicator != null)
				return false;
		} else if (!this.toOrderIndicator.equals(other.toOrderIndicator))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // BillOfLadingType