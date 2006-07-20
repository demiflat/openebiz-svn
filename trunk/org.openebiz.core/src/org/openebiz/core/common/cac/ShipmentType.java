/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.DeclaredCustomsValueAmountType;
import org.openebiz.core.common.cbc.DeclaredForCarriageValueAmountType;
import org.openebiz.core.common.cbc.DeclaredStatisticsValueAmountType;
import org.openebiz.core.common.cbc.DeliveryInstructionsType;
import org.openebiz.core.common.cbc.FreeOnBoardValueAmountType;
import org.openebiz.core.common.cbc.GrossVolumeMeasureType;
import org.openebiz.core.common.cbc.GrossWeightMeasureType;
import org.openebiz.core.common.cbc.HandlingCodeType;
import org.openebiz.core.common.cbc.HandlingInstructionsType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.InformationType;
import org.openebiz.core.common.cbc.InsuranceValueAmountType;
import org.openebiz.core.common.cbc.NetNetWeightMeasureType;
import org.openebiz.core.common.cbc.NetVolumeMeasureType;
import org.openebiz.core.common.cbc.NetWeightMeasureType;
import org.openebiz.core.common.cbc.PriorityLevelCodeType;
import org.openebiz.core.common.cbc.SpecialInstructionsType;
import org.openebiz.core.common.cbc.TotalGoodsItemQuantityType;
import org.openebiz.core.common.cbc.TotalTransportHandlingUnitQuantityType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Shipment. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about a Shipment</ccts:Definition>
 *           <ccts:ObjectClass>Shipment</ccts:ObjectClass>
 *           <ccts:AlternativeBusinessTerms>Consignment</ccts:AlternativeBusinessTerms>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getPriorityLevelCode <em>Priority Level Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getHandlingCode <em>Handling Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getHandlingInstructions <em>Handling Instructions</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getInformation <em>Information</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getGrossWeightMeasure <em>Gross Weight Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getNetWeightMeasure <em>Net Weight Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getNetNetWeightMeasure <em>Net Net Weight Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getGrossVolumeMeasure <em>Gross Volume Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getNetVolumeMeasure <em>Net Volume Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getTotalGoodsItemQuantity <em>Total Goods Item Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getTotalTransportHandlingUnitQuantity <em>Total Transport Handling Unit Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getInsuranceValueAmount <em>Insurance Value Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getDeclaredCustomsValueAmount <em>Declared Customs Value Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getDeclaredForCarriageValueAmount <em>Declared For Carriage Value Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getDeclaredStatisticsValueAmount <em>Declared Statistics Value Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getFreeOnBoardValueAmount <em>Free On Board Value Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getSpecialInstructions <em>Special Instructions</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getDeliveryInstructions <em>Delivery Instructions</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getConsignment <em>Consignment</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getTransportContract <em>Transport Contract</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getGoodsItem <em>Goods Item</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getShipmentStage <em>Shipment Stage</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getDelivery <em>Delivery</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getTransportHandlingUnit <em>Transport Handling Unit</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getOriginAddress <em>Origin Address</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getFirstArrivalPort <em>First Arrival Port</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getLastExitPort <em>Last Exit Port</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getExportCountry <em>Export Country</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getFreightAllowanceCharge <em>Freight Allowance Charge</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShipmentType implements Serializable {
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
	 * The cached value of the '{@link #getPriorityLevelCode() <em>Priority Level Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityLevelCode()
	 * @generated
	 * @ordered
	 */
	protected PriorityLevelCodeType priorityLevelCode = null;

	/**
	 * The cached value of the '{@link #getHandlingCode() <em>Handling Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlingCode()
	 * @generated
	 * @ordered
	 */
	protected HandlingCodeType handlingCode = null;

	/**
	 * The cached value of the '{@link #getHandlingInstructions() <em>Handling Instructions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlingInstructions()
	 * @generated
	 * @ordered
	 */
	protected HandlingInstructionsType handlingInstructions = null;

	/**
	 * The cached value of the '{@link #getInformation() <em>Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformation()
	 * @generated
	 * @ordered
	 */
	protected InformationType information = null;

	/**
	 * The cached value of the '{@link #getGrossWeightMeasure() <em>Gross Weight Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrossWeightMeasure()
	 * @generated
	 * @ordered
	 */
	protected GrossWeightMeasureType grossWeightMeasure = null;

	/**
	 * The cached value of the '{@link #getNetWeightMeasure() <em>Net Weight Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetWeightMeasure()
	 * @generated
	 * @ordered
	 */
	protected NetWeightMeasureType netWeightMeasure = null;

	/**
	 * The cached value of the '{@link #getNetNetWeightMeasure() <em>Net Net Weight Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetNetWeightMeasure()
	 * @generated
	 * @ordered
	 */
	protected NetNetWeightMeasureType netNetWeightMeasure = null;

	/**
	 * The cached value of the '{@link #getGrossVolumeMeasure() <em>Gross Volume Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrossVolumeMeasure()
	 * @generated
	 * @ordered
	 */
	protected GrossVolumeMeasureType grossVolumeMeasure = null;

	/**
	 * The cached value of the '{@link #getNetVolumeMeasure() <em>Net Volume Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetVolumeMeasure()
	 * @generated
	 * @ordered
	 */
	protected NetVolumeMeasureType netVolumeMeasure = null;

	/**
	 * The cached value of the '{@link #getTotalGoodsItemQuantity() <em>Total Goods Item Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalGoodsItemQuantity()
	 * @generated
	 * @ordered
	 */
	protected TotalGoodsItemQuantityType totalGoodsItemQuantity = null;

	/**
	 * The cached value of the '{@link #getTotalTransportHandlingUnitQuantity() <em>Total Transport Handling Unit Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalTransportHandlingUnitQuantity()
	 * @generated
	 * @ordered
	 */
	protected TotalTransportHandlingUnitQuantityType totalTransportHandlingUnitQuantity = null;

	/**
	 * The cached value of the '{@link #getInsuranceValueAmount() <em>Insurance Value Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsuranceValueAmount()
	 * @generated
	 * @ordered
	 */
	protected InsuranceValueAmountType insuranceValueAmount = null;

	/**
	 * The cached value of the '{@link #getDeclaredCustomsValueAmount() <em>Declared Customs Value Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaredCustomsValueAmount()
	 * @generated
	 * @ordered
	 */
	protected DeclaredCustomsValueAmountType declaredCustomsValueAmount = null;

	/**
	 * The cached value of the '{@link #getDeclaredForCarriageValueAmount() <em>Declared For Carriage Value Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaredForCarriageValueAmount()
	 * @generated
	 * @ordered
	 */
	protected DeclaredForCarriageValueAmountType declaredForCarriageValueAmount = null;

	/**
	 * The cached value of the '{@link #getDeclaredStatisticsValueAmount() <em>Declared Statistics Value Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaredStatisticsValueAmount()
	 * @generated
	 * @ordered
	 */
	protected DeclaredStatisticsValueAmountType declaredStatisticsValueAmount = null;

	/**
	 * The cached value of the '{@link #getFreeOnBoardValueAmount() <em>Free On Board Value Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreeOnBoardValueAmount()
	 * @generated
	 * @ordered
	 */
	protected FreeOnBoardValueAmountType freeOnBoardValueAmount = null;

	/**
	 * The cached value of the '{@link #getSpecialInstructions() <em>Special Instructions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialInstructions()
	 * @generated
	 * @ordered
	 */
	protected List specialInstructions = null;

	/**
	 * The cached value of the '{@link #getDeliveryInstructions() <em>Delivery Instructions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryInstructions()
	 * @generated
	 * @ordered
	 */
	protected List deliveryInstructions = null;

	/**
	 * The cached value of the '{@link #getConsignment() <em>Consignment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsignment()
	 * @generated
	 * @ordered
	 */
	protected ConsignmentType consignment = null;

	/**
	 * The cached value of the '{@link #getTransportContract() <em>Transport Contract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportContract()
	 * @generated
	 * @ordered
	 */
	protected ContractType transportContract = null;

	/**
	 * The cached value of the '{@link #getGoodsItem() <em>Goods Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoodsItem()
	 * @generated
	 * @ordered
	 */
	protected List goodsItem = null;

	/**
	 * The cached value of the '{@link #getShipmentStage() <em>Shipment Stage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentStage()
	 * @generated
	 * @ordered
	 */
	protected List shipmentStage = null;

	/**
	 * The cached value of the '{@link #getDelivery() <em>Delivery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelivery()
	 * @generated
	 * @ordered
	 */
	protected DeliveryType delivery = null;

	/**
	 * The cached value of the '{@link #getTransportHandlingUnit() <em>Transport Handling Unit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportHandlingUnit()
	 * @generated
	 * @ordered
	 */
	protected List transportHandlingUnit = null;

	/**
	 * The cached value of the '{@link #getOriginAddress() <em>Origin Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginAddress()
	 * @generated
	 * @ordered
	 */
	protected AddressType originAddress = null;

	/**
	 * The cached value of the '{@link #getFirstArrivalPort() <em>First Arrival Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstArrivalPort()
	 * @generated
	 * @ordered
	 */
	protected PortType firstArrivalPort = null;

	/**
	 * The cached value of the '{@link #getLastExitPort() <em>Last Exit Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastExitPort()
	 * @generated
	 * @ordered
	 */
	protected PortType lastExitPort = null;

	/**
	 * The cached value of the '{@link #getExportCountry() <em>Export Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportCountry()
	 * @generated
	 * @ordered
	 */
	protected CountryType exportCountry = null;

	/**
	 * The cached value of the '{@link #getFreightAllowanceCharge() <em>Freight Allowance Charge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreightAllowanceCharge()
	 * @generated
	 * @ordered
	 */
	protected List freightAllowanceCharge = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ShipmentType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.iD = this.getID();
		this.priorityLevelCode = this.getPriorityLevelCode();
		this.handlingCode = this.getHandlingCode();
		this.handlingInstructions = this.getHandlingInstructions();
		this.information = this.getInformation();
		this.grossWeightMeasure = this.getGrossWeightMeasure();
		this.netWeightMeasure = this.getNetWeightMeasure();
		this.netNetWeightMeasure = this.getNetNetWeightMeasure();
		this.grossVolumeMeasure = this.getGrossVolumeMeasure();
		this.netVolumeMeasure = this.getNetVolumeMeasure();
		this.totalGoodsItemQuantity = this.getTotalGoodsItemQuantity();
		this.totalTransportHandlingUnitQuantity = this.getTotalTransportHandlingUnitQuantity();
		this.insuranceValueAmount = this.getInsuranceValueAmount();
		this.declaredCustomsValueAmount = this.getDeclaredCustomsValueAmount();
		this.declaredForCarriageValueAmount = this.getDeclaredForCarriageValueAmount();
		this.declaredStatisticsValueAmount = this.getDeclaredStatisticsValueAmount();
		this.freeOnBoardValueAmount = this.getFreeOnBoardValueAmount();
		this.specialInstructions = this.getSpecialInstructions();
		this.deliveryInstructions = this.getDeliveryInstructions();
		this.consignment = this.getConsignment();
		this.transportContract = this.getTransportContract();
		this.goodsItem = this.getGoodsItem();
		this.shipmentStage = this.getShipmentStage();
		this.delivery = this.getDelivery();
		this.transportHandlingUnit = this.getTransportHandlingUnit();
		this.originAddress = this.getOriginAddress();
		this.firstArrivalPort = this.getFirstArrivalPort();
		this.lastExitPort = this.getLastExitPort();
		this.exportCountry = this.getExportCountry();
		this.freightAllowanceCharge = this.getFreightAllowanceCharge();
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
	 *               <ccts:DictionaryEntryName>Shipment. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for a Shipment</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Waybill Number</ccts:AlternativeBusinessTerms>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getID <em>ID</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Priority Level Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Priority Level. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The priority or level of service required for a Shipment expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Priority Level</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Service Level, Service Priority</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority Level Code</em>' containment reference.
	 * @see #setPriorityLevelCode(PriorityLevelCodeType)
	 * @generated
	 */
	public PriorityLevelCodeType getPriorityLevelCode() {
		return (priorityLevelCode == null) ? new PriorityLevelCodeType()
				: priorityLevelCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getPriorityLevelCode <em>Priority Level Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority Level Code</em>' containment reference.
	 * @see #getPriorityLevelCode()
	 * @generated
	 */
	public void setPriorityLevelCode(PriorityLevelCodeType newPriorityLevelCode) {
		priorityLevelCode = newPriorityLevelCode;
	}

	/**
	 * Returns the value of the '<em><b>Handling Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Handling Code. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The handling required for a Shipment expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Handling Code</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Special Handling</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Handling Code</em>' containment reference.
	 * @see #setHandlingCode(HandlingCodeType)
	 * @generated
	 */
	public HandlingCodeType getHandlingCode() {
		return (handlingCode == null) ? new HandlingCodeType() : handlingCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getHandlingCode <em>Handling Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handling Code</em>' containment reference.
	 * @see #getHandlingCode()
	 * @generated
	 */
	public void setHandlingCode(HandlingCodeType newHandlingCode) {
		handlingCode = newHandlingCode;
	}

	/**
	 * Returns the value of the '<em><b>Handling Instructions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Handling Instructions. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Free form text describing Handling Instructions for a Shipment</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Handling Instructions</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Handling Instructions</em>' containment reference.
	 * @see #setHandlingInstructions(HandlingInstructionsType)
	 * @generated
	 */
	public HandlingInstructionsType getHandlingInstructions() {
		return (handlingInstructions == null) ? new HandlingInstructionsType()
				: handlingInstructions;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getHandlingInstructions <em>Handling Instructions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handling Instructions</em>' containment reference.
	 * @see #getHandlingInstructions()
	 * @generated
	 */
	public void setHandlingInstructions(
			HandlingInstructionsType newHandlingInstructions) {
		handlingInstructions = newHandlingInstructions;
	}

	/**
	 * Returns the value of the '<em><b>Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Information. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Free form text applying to a Shipment. This element may contain notes or any other similar information that is not contained explicitly in another structure.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Information</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Information</em>' containment reference.
	 * @see #setInformation(InformationType)
	 * @generated
	 */
	public InformationType getInformation() {
		return (information == null) ? new InformationType() : information;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getInformation <em>Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information</em>' containment reference.
	 * @see #getInformation()
	 * @generated
	 */
	public void setInformation(InformationType newInformation) {
		information = newInformation;
	}

	/**
	 * Returns the value of the '<em><b>Gross Weight Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Gross_ Weight. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The total gross weight of a Shipment; the weight of the goods + packaging + transport equipment</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Gross</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Weight</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gross Weight Measure</em>' containment reference.
	 * @see #setGrossWeightMeasure(GrossWeightMeasureType)
	 * @generated
	 */
	public GrossWeightMeasureType getGrossWeightMeasure() {
		return (grossWeightMeasure == null) ? new GrossWeightMeasureType()
				: grossWeightMeasure;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getGrossWeightMeasure <em>Gross Weight Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gross Weight Measure</em>' containment reference.
	 * @see #getGrossWeightMeasure()
	 * @generated
	 */
	public void setGrossWeightMeasure(
			GrossWeightMeasureType newGrossWeightMeasure) {
		grossWeightMeasure = newGrossWeightMeasure;
	}

	/**
	 * Returns the value of the '<em><b>Net Weight Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Net_ Weight. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The total net weight of a Shipment; the weight of the goods + packaging</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Net</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Weight</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Net Weight Measure</em>' containment reference.
	 * @see #setNetWeightMeasure(NetWeightMeasureType)
	 * @generated
	 */
	public NetWeightMeasureType getNetWeightMeasure() {
		return (netWeightMeasure == null) ? new NetWeightMeasureType()
				: netWeightMeasure;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getNetWeightMeasure <em>Net Weight Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net Weight Measure</em>' containment reference.
	 * @see #getNetWeightMeasure()
	 * @generated
	 */
	public void setNetWeightMeasure(NetWeightMeasureType newNetWeightMeasure) {
		netWeightMeasure = newNetWeightMeasure;
	}

	/**
	 * Returns the value of the '<em><b>Net Net Weight Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Net Net_ Weight. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The weight of the goods net of packaging and transport equipment</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Net Net</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Weight</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Net Net Weight Measure</em>' containment reference.
	 * @see #setNetNetWeightMeasure(NetNetWeightMeasureType)
	 * @generated
	 */
	public NetNetWeightMeasureType getNetNetWeightMeasure() {
		return (netNetWeightMeasure == null) ? new NetNetWeightMeasureType()
				: netNetWeightMeasure;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getNetNetWeightMeasure <em>Net Net Weight Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net Net Weight Measure</em>' containment reference.
	 * @see #getNetNetWeightMeasure()
	 * @generated
	 */
	public void setNetNetWeightMeasure(
			NetNetWeightMeasureType newNetNetWeightMeasure) {
		netNetWeightMeasure = newNetNetWeightMeasure;
	}

	/**
	 * Returns the value of the '<em><b>Gross Volume Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Gross_ Volume. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The total volume of the goods in a Shipment + packaging</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Gross</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Volume</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gross Volume Measure</em>' containment reference.
	 * @see #setGrossVolumeMeasure(GrossVolumeMeasureType)
	 * @generated
	 */
	public GrossVolumeMeasureType getGrossVolumeMeasure() {
		return (grossVolumeMeasure == null) ? new GrossVolumeMeasureType()
				: grossVolumeMeasure;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getGrossVolumeMeasure <em>Gross Volume Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gross Volume Measure</em>' containment reference.
	 * @see #getGrossVolumeMeasure()
	 * @generated
	 */
	public void setGrossVolumeMeasure(
			GrossVolumeMeasureType newGrossVolumeMeasure) {
		grossVolumeMeasure = newGrossVolumeMeasure;
	}

	/**
	 * Returns the value of the '<em><b>Net Volume Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Net_ Volume. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The volume of a Shipment net of packaging and transport equipment</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Net</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Volume</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Net Volume Measure</em>' containment reference.
	 * @see #setNetVolumeMeasure(NetVolumeMeasureType)
	 * @generated
	 */
	public NetVolumeMeasureType getNetVolumeMeasure() {
		return (netVolumeMeasure == null) ? new NetVolumeMeasureType()
				: netVolumeMeasure;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getNetVolumeMeasure <em>Net Volume Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net Volume Measure</em>' containment reference.
	 * @see #getNetVolumeMeasure()
	 * @generated
	 */
	public void setNetVolumeMeasure(NetVolumeMeasureType newNetVolumeMeasure) {
		netVolumeMeasure = newNetVolumeMeasure;
	}

	/**
	 * Returns the value of the '<em><b>Total Goods Item Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Total_ Goods Item Quantity. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Count of the total number of goods items within a shipment.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Total</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Goods Item Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Goods Item Quantity</em>' containment reference.
	 * @see #setTotalGoodsItemQuantity(TotalGoodsItemQuantityType)
	 * @generated
	 */
	public TotalGoodsItemQuantityType getTotalGoodsItemQuantity() {
		return (totalGoodsItemQuantity == null) ? new TotalGoodsItemQuantityType()
				: totalGoodsItemQuantity;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getTotalGoodsItemQuantity <em>Total Goods Item Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Goods Item Quantity</em>' containment reference.
	 * @see #getTotalGoodsItemQuantity()
	 * @generated
	 */
	public void setTotalGoodsItemQuantity(
			TotalGoodsItemQuantityType newTotalGoodsItemQuantity) {
		totalGoodsItemQuantity = newTotalGoodsItemQuantity;
	}

	/**
	 * Returns the value of the '<em><b>Total Transport Handling Unit Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Total_ Transport Handling Unit Quantity. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Count of the number of pieces of transport handling equipment in a shipment, such as pallets, boxes,cases.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Total</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Transport Handling Unit Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Number of THUs</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Transport Handling Unit Quantity</em>' containment reference.
	 * @see #setTotalTransportHandlingUnitQuantity(TotalTransportHandlingUnitQuantityType)
	 * @generated
	 */
	public TotalTransportHandlingUnitQuantityType getTotalTransportHandlingUnitQuantity() {
		return (totalTransportHandlingUnitQuantity == null) ? new TotalTransportHandlingUnitQuantityType()
				: totalTransportHandlingUnitQuantity;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getTotalTransportHandlingUnitQuantity <em>Total Transport Handling Unit Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Transport Handling Unit Quantity</em>' containment reference.
	 * @see #getTotalTransportHandlingUnitQuantity()
	 * @generated
	 */
	public void setTotalTransportHandlingUnitQuantity(
			TotalTransportHandlingUnitQuantityType newTotalTransportHandlingUnitQuantity) {
		totalTransportHandlingUnitQuantity = newTotalTransportHandlingUnitQuantity;
	}

	/**
	 * Returns the value of the '<em><b>Insurance Value Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Insurance Value. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The total sum covered by an insurance for the shipment</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Insurance Value</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Value Insured</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insurance Value Amount</em>' containment reference.
	 * @see #setInsuranceValueAmount(InsuranceValueAmountType)
	 * @generated
	 */
	public InsuranceValueAmountType getInsuranceValueAmount() {
		return (insuranceValueAmount == null) ? new InsuranceValueAmountType()
				: insuranceValueAmount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getInsuranceValueAmount <em>Insurance Value Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insurance Value Amount</em>' containment reference.
	 * @see #getInsuranceValueAmount()
	 * @generated
	 */
	public void setInsuranceValueAmount(
			InsuranceValueAmountType newInsuranceValueAmount) {
		insuranceValueAmount = newInsuranceValueAmount;
	}

	/**
	 * Returns the value of the '<em><b>Declared Customs Value Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Declared_ Customs Value. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Amount declared for customs purposes of those goods in a shipment which are subject to the same customs procedure, and have the same tariff/statistical heading, country information and duty regime.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Declared</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Customs Value</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Declared Customs Value Amount</em>' containment reference.
	 * @see #setDeclaredCustomsValueAmount(DeclaredCustomsValueAmountType)
	 * @generated
	 */
	public DeclaredCustomsValueAmountType getDeclaredCustomsValueAmount() {
		return (declaredCustomsValueAmount == null) ? new DeclaredCustomsValueAmountType()
				: declaredCustomsValueAmount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getDeclaredCustomsValueAmount <em>Declared Customs Value Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declared Customs Value Amount</em>' containment reference.
	 * @see #getDeclaredCustomsValueAmount()
	 * @generated
	 */
	public void setDeclaredCustomsValueAmount(
			DeclaredCustomsValueAmountType newDeclaredCustomsValueAmount) {
		declaredCustomsValueAmount = newDeclaredCustomsValueAmount;
	}

	/**
	 * Returns the value of the '<em><b>Declared For Carriage Value Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Declared_ For Carriage Value. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Value, declared by the shipper or his agent solely for the purpose of varying the carrier's level of liability from that provided in the contract of carriage, in case of loss or damage to goods or delayed delivery.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Declared</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>For Carriage Value</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Declared value for carriage, Interest in delivery</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Declared For Carriage Value Amount</em>' containment reference.
	 * @see #setDeclaredForCarriageValueAmount(DeclaredForCarriageValueAmountType)
	 * @generated
	 */
	public DeclaredForCarriageValueAmountType getDeclaredForCarriageValueAmount() {
		return (declaredForCarriageValueAmount == null) ? new DeclaredForCarriageValueAmountType()
				: declaredForCarriageValueAmount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getDeclaredForCarriageValueAmount <em>Declared For Carriage Value Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declared For Carriage Value Amount</em>' containment reference.
	 * @see #getDeclaredForCarriageValueAmount()
	 * @generated
	 */
	public void setDeclaredForCarriageValueAmount(
			DeclaredForCarriageValueAmountType newDeclaredForCarriageValueAmount) {
		declaredForCarriageValueAmount = newDeclaredForCarriageValueAmount;
	}

	/**
	 * Returns the value of the '<em><b>Declared Statistics Value Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Declared_ Statistics Value. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Value declared for statistical purposes of those goods in a consignment which have the same statistical heading.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Declared</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Statistics Value</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Statistical Value</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Declared Statistics Value Amount</em>' containment reference.
	 * @see #setDeclaredStatisticsValueAmount(DeclaredStatisticsValueAmountType)
	 * @generated
	 */
	public DeclaredStatisticsValueAmountType getDeclaredStatisticsValueAmount() {
		return (declaredStatisticsValueAmount == null) ? new DeclaredStatisticsValueAmountType()
				: declaredStatisticsValueAmount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getDeclaredStatisticsValueAmount <em>Declared Statistics Value Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declared Statistics Value Amount</em>' containment reference.
	 * @see #getDeclaredStatisticsValueAmount()
	 * @generated
	 */
	public void setDeclaredStatisticsValueAmount(
			DeclaredStatisticsValueAmountType newDeclaredStatisticsValueAmount) {
		declaredStatisticsValueAmount = newDeclaredStatisticsValueAmount;
	}

	/**
	 * Returns the value of the '<em><b>Free On Board Value Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Free On Board Value. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Monetary amount that has to be or has been paid as calculated under the applicable trade delivery.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Free On Board Value</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>FOB Value</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Free On Board Value Amount</em>' containment reference.
	 * @see #setFreeOnBoardValueAmount(FreeOnBoardValueAmountType)
	 * @generated
	 */
	public FreeOnBoardValueAmountType getFreeOnBoardValueAmount() {
		return (freeOnBoardValueAmount == null) ? new FreeOnBoardValueAmountType()
				: freeOnBoardValueAmount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getFreeOnBoardValueAmount <em>Free On Board Value Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free On Board Value Amount</em>' containment reference.
	 * @see #getFreeOnBoardValueAmount()
	 * @generated
	 */
	public void setFreeOnBoardValueAmount(
			FreeOnBoardValueAmountType newFreeOnBoardValueAmount) {
		freeOnBoardValueAmount = newFreeOnBoardValueAmount;
	}

	/**
	 * Returns the value of the '<em><b>Special Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cbc.SpecialInstructionsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Special Instructions. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Special instructions relating to a shipment.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Special Instructions</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Special Instructions</em>' containment reference list.
	 * @generated
	 */
	public List getSpecialInstructions() {
		if (specialInstructions == null) {
			specialInstructions = new ArrayList<
					SpecialInstructionsType>();
		}
		return specialInstructions;
	}

	/**
	 * Returns the value of the '<em><b>Delivery Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cbc.DeliveryInstructionsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Delivery Instructions. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Delivery instructions relating to a shipment.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Delivery Instructions</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delivery Instructions</em>' containment reference list.
	 * @generated
	 */
	public List getDeliveryInstructions() {
		if (deliveryInstructions == null) {
			deliveryInstructions = new ArrayList<
					DeliveryInstructionsType>();
		}
		return deliveryInstructions;
	}

	/**
	 * Returns the value of the '<em><b>Consignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Consignment</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Consignment covering the shipment.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Consignment</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Consignment</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consignment</em>' containment reference.
	 * @see #setConsignment(ConsignmentType)
	 * @generated
	 */
	public ConsignmentType getConsignment() {
		return (consignment == null) ? new ConsignmentType() : consignment;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getConsignment <em>Consignment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consignment</em>' containment reference.
	 * @see #getConsignment()
	 * @generated
	 */
	public void setConsignment(ConsignmentType newConsignment) {
		consignment = newConsignment;
	}

	/**
	 * Returns the value of the '<em><b>Transport Contract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Transport_ Contract. Contract</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Transport Contact</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Transport</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Contract</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Contract</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transport Contract</em>' containment reference.
	 * @see #setTransportContract(ContractType)
	 * @generated
	 */
	public ContractType getTransportContract() {
		return (transportContract == null) ? new ContractType()
				: transportContract;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getTransportContract <em>Transport Contract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Contract</em>' containment reference.
	 * @see #getTransportContract()
	 * @generated
	 */
	public void setTransportContract(ContractType newTransportContract) {
		transportContract = newTransportContract;
	}

	/**
	 * Returns the value of the '<em><b>Goods Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.GoodsItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Goods Item</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Goods Item (for Bulk Goods)</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Goods Item</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Goods Item</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Goods Item</em>' containment reference list.
	 * @generated
	 */
	public List getGoodsItem() {
		if (goodsItem == null) {
			goodsItem = new ArrayList<GoodsItemType>();
		}
		return goodsItem;
	}

	/**
	 * Returns the value of the '<em><b>Shipment Stage</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.ShipmentStageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Shipment Stage</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Shipment Stage</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Shipment Stage</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Shipment Stage</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shipment Stage</em>' containment reference list.
	 * @generated
	 */
	public List getShipmentStage() {
		if (shipmentStage == null) {
			shipmentStage = new ArrayList<ShipmentStageType>();
		}
		return shipmentStage;
	}

	/**
	 * Returns the value of the '<em><b>Delivery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Delivery</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Delivery</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Delivery</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Delivery</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delivery</em>' containment reference.
	 * @see #setDelivery(DeliveryType)
	 * @generated
	 */
	public DeliveryType getDelivery() {
		return (delivery == null) ? new DeliveryType() : delivery;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getDelivery <em>Delivery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery</em>' containment reference.
	 * @see #getDelivery()
	 * @generated
	 */
	public void setDelivery(DeliveryType newDelivery) {
		delivery = newDelivery;
	}

	/**
	 * Returns the value of the '<em><b>Transport Handling Unit</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.TransportHandlingUnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Transport Handling Unit</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Transport Handling Unit used for loose and containerized goods.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Transport Handling Unit</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Transport Handling Unit</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transport Handling Unit</em>' containment reference list.
	 * @generated
	 */
	public List getTransportHandlingUnit() {
		if (transportHandlingUnit == null) {
			transportHandlingUnit = new ArrayList<
					TransportHandlingUnitType>();
		}
		return transportHandlingUnit;
	}

	/**
	 * Returns the value of the '<em><b>Origin Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Origin_ Address. Address</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the region in which the goods have been produced or manufactured, according to criteria laid down for the purposes of application of the Customs tariff, or quantitative restrictions, or of any other measure related to trade</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Origin</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Address</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Address</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Origin Address</em>' containment reference.
	 * @see #setOriginAddress(AddressType)
	 * @generated
	 */
	public AddressType getOriginAddress() {
		return (originAddress == null) ? new AddressType() : originAddress;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getOriginAddress <em>Origin Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Address</em>' containment reference.
	 * @see #getOriginAddress()
	 * @generated
	 */
	public void setOriginAddress(AddressType newOriginAddress) {
		originAddress = newOriginAddress;
	}

	/**
	 * Returns the value of the '<em><b>First Arrival Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. First Arrival_ Port. Port</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>To identify the first arrival location. This would be a port for sea, airport for air and border post for land crossing.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>First Arrival</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Port</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Port</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First Arrival Port</em>' containment reference.
	 * @see #setFirstArrivalPort(PortType)
	 * @generated
	 */
	public PortType getFirstArrivalPort() {
		return (firstArrivalPort == null) ? new PortType() : firstArrivalPort;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getFirstArrivalPort <em>First Arrival Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Arrival Port</em>' containment reference.
	 * @see #getFirstArrivalPort()
	 * @generated
	 */
	public void setFirstArrivalPort(PortType newFirstArrivalPort) {
		firstArrivalPort = newFirstArrivalPort;
	}

	/**
	 * Returns the value of the '<em><b>Last Exit Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Last Exit_ Port. Port</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>To identify the final exporting location. This would be a port for sea, airport for air and border post for land crossing.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Last Exit</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Port</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Port</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Exit Port</em>' containment reference.
	 * @see #setLastExitPort(PortType)
	 * @generated
	 */
	public PortType getLastExitPort() {
		return (lastExitPort == null) ? new PortType() : lastExitPort;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getLastExitPort <em>Last Exit Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Exit Port</em>' containment reference.
	 * @see #getLastExitPort()
	 * @generated
	 */
	public void setLastExitPort(PortType newLastExitPort) {
		lastExitPort = newLastExitPort;
	}

	/**
	 * Returns the value of the '<em><b>Export Country</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Export_ Country. Country</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>To identify the country from which the goods are originally exported without any commercial transaction taken place in intermediate countries.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Export</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Country</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Country</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Country of exportation (WCO ID 062)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Export Country</em>' containment reference.
	 * @see #setExportCountry(CountryType)
	 * @generated
	 */
	public CountryType getExportCountry() {
		return (exportCountry == null) ? new CountryType() : exportCountry;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getExportCountry <em>Export Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Export Country</em>' containment reference.
	 * @see #getExportCountry()
	 * @generated
	 */
	public void setExportCountry(CountryType newExportCountry) {
		exportCountry = newExportCountry;
	}

	/**
	 * Returns the value of the '<em><b>Freight Allowance Charge</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.AllowanceChargeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Freight_ Allowance Charge. Allowance Charge</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Costs incurred by the shipper in moving goods, by whatever means, from one place to another under the terms of the contract of carriage. In addition to transport costs, this may include such elements as packing, documentation, loading, unloading, and insurance (to the extent that they relate to the freight costs).</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Freight</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Allowance Charge</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Allowance Charge</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Freight Costs</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Freight Allowance Charge</em>' containment reference list.
	 * @generated
	 */
	public List getFreightAllowanceCharge() {
		if (freightAllowanceCharge == null) {
			freightAllowanceCharge = new ArrayList<
					AllowanceChargeType>();
		}
		return freightAllowanceCharge;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.consignment == null) ? 0 : this.consignment.hashCode());
		result = PRIME * result + ((this.declaredCustomsValueAmount == null) ? 0 : this.declaredCustomsValueAmount.hashCode());
		result = PRIME * result + ((this.declaredForCarriageValueAmount == null) ? 0 : this.declaredForCarriageValueAmount.hashCode());
		result = PRIME * result + ((this.declaredStatisticsValueAmount == null) ? 0 : this.declaredStatisticsValueAmount.hashCode());
		result = PRIME * result + ((this.delivery == null) ? 0 : this.delivery.hashCode());
		result = PRIME * result + ((this.deliveryInstructions == null) ? 0 : this.deliveryInstructions.hashCode());
		result = PRIME * result + ((this.exportCountry == null) ? 0 : this.exportCountry.hashCode());
		result = PRIME * result + ((this.firstArrivalPort == null) ? 0 : this.firstArrivalPort.hashCode());
		result = PRIME * result + ((this.freeOnBoardValueAmount == null) ? 0 : this.freeOnBoardValueAmount.hashCode());
		result = PRIME * result + ((this.freightAllowanceCharge == null) ? 0 : this.freightAllowanceCharge.hashCode());
		result = PRIME * result + ((this.goodsItem == null) ? 0 : this.goodsItem.hashCode());
		result = PRIME * result + ((this.grossVolumeMeasure == null) ? 0 : this.grossVolumeMeasure.hashCode());
		result = PRIME * result + ((this.grossWeightMeasure == null) ? 0 : this.grossWeightMeasure.hashCode());
		result = PRIME * result + ((this.handlingCode == null) ? 0 : this.handlingCode.hashCode());
		result = PRIME * result + ((this.handlingInstructions == null) ? 0 : this.handlingInstructions.hashCode());
		result = PRIME * result + ((this.iD == null) ? 0 : this.iD.hashCode());
		result = PRIME * result + ((this.information == null) ? 0 : this.information.hashCode());
		result = PRIME * result + ((this.insuranceValueAmount == null) ? 0 : this.insuranceValueAmount.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.lastExitPort == null) ? 0 : this.lastExitPort.hashCode());
		result = PRIME * result + ((this.netNetWeightMeasure == null) ? 0 : this.netNetWeightMeasure.hashCode());
		result = PRIME * result + ((this.netVolumeMeasure == null) ? 0 : this.netVolumeMeasure.hashCode());
		result = PRIME * result + ((this.netWeightMeasure == null) ? 0 : this.netWeightMeasure.hashCode());
		result = PRIME * result + ((this.originAddress == null) ? 0 : this.originAddress.hashCode());
		result = PRIME * result + ((this.priorityLevelCode == null) ? 0 : this.priorityLevelCode.hashCode());
		result = PRIME * result + ((this.shipmentStage == null) ? 0 : this.shipmentStage.hashCode());
		result = PRIME * result + ((this.specialInstructions == null) ? 0 : this.specialInstructions.hashCode());
		result = PRIME * result + ((this.totalGoodsItemQuantity == null) ? 0 : this.totalGoodsItemQuantity.hashCode());
		result = PRIME * result + ((this.totalTransportHandlingUnitQuantity == null) ? 0 : this.totalTransportHandlingUnitQuantity.hashCode());
		result = PRIME * result + ((this.transportContract == null) ? 0 : this.transportContract.hashCode());
		result = PRIME * result + ((this.transportHandlingUnit == null) ? 0 : this.transportHandlingUnit.hashCode());
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
		final ShipmentType other = (ShipmentType) obj;
		if (this.consignment == null) {
			if (other.consignment != null)
				return false;
		} else if (!this.consignment.equals(other.consignment))
			return false;
		if (this.declaredCustomsValueAmount == null) {
			if (other.declaredCustomsValueAmount != null)
				return false;
		} else if (!this.declaredCustomsValueAmount.equals(other.declaredCustomsValueAmount))
			return false;
		if (this.declaredForCarriageValueAmount == null) {
			if (other.declaredForCarriageValueAmount != null)
				return false;
		} else if (!this.declaredForCarriageValueAmount.equals(other.declaredForCarriageValueAmount))
			return false;
		if (this.declaredStatisticsValueAmount == null) {
			if (other.declaredStatisticsValueAmount != null)
				return false;
		} else if (!this.declaredStatisticsValueAmount.equals(other.declaredStatisticsValueAmount))
			return false;
		if (this.delivery == null) {
			if (other.delivery != null)
				return false;
		} else if (!this.delivery.equals(other.delivery))
			return false;
		if (this.deliveryInstructions == null) {
			if (other.deliveryInstructions != null)
				return false;
		} else if (!this.deliveryInstructions.equals(other.deliveryInstructions))
			return false;
		if (this.exportCountry == null) {
			if (other.exportCountry != null)
				return false;
		} else if (!this.exportCountry.equals(other.exportCountry))
			return false;
		if (this.firstArrivalPort == null) {
			if (other.firstArrivalPort != null)
				return false;
		} else if (!this.firstArrivalPort.equals(other.firstArrivalPort))
			return false;
		if (this.freeOnBoardValueAmount == null) {
			if (other.freeOnBoardValueAmount != null)
				return false;
		} else if (!this.freeOnBoardValueAmount.equals(other.freeOnBoardValueAmount))
			return false;
		if (this.freightAllowanceCharge == null) {
			if (other.freightAllowanceCharge != null)
				return false;
		} else if (!this.freightAllowanceCharge.equals(other.freightAllowanceCharge))
			return false;
		if (this.goodsItem == null) {
			if (other.goodsItem != null)
				return false;
		} else if (!this.goodsItem.equals(other.goodsItem))
			return false;
		if (this.grossVolumeMeasure == null) {
			if (other.grossVolumeMeasure != null)
				return false;
		} else if (!this.grossVolumeMeasure.equals(other.grossVolumeMeasure))
			return false;
		if (this.grossWeightMeasure == null) {
			if (other.grossWeightMeasure != null)
				return false;
		} else if (!this.grossWeightMeasure.equals(other.grossWeightMeasure))
			return false;
		if (this.handlingCode == null) {
			if (other.handlingCode != null)
				return false;
		} else if (!this.handlingCode.equals(other.handlingCode))
			return false;
		if (this.handlingInstructions == null) {
			if (other.handlingInstructions != null)
				return false;
		} else if (!this.handlingInstructions.equals(other.handlingInstructions))
			return false;
		if (this.iD == null) {
			if (other.iD != null)
				return false;
		} else if (!this.iD.equals(other.iD))
			return false;
		if (this.information == null) {
			if (other.information != null)
				return false;
		} else if (!this.information.equals(other.information))
			return false;
		if (this.insuranceValueAmount == null) {
			if (other.insuranceValueAmount != null)
				return false;
		} else if (!this.insuranceValueAmount.equals(other.insuranceValueAmount))
			return false;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.lastExitPort == null) {
			if (other.lastExitPort != null)
				return false;
		} else if (!this.lastExitPort.equals(other.lastExitPort))
			return false;
		if (this.netNetWeightMeasure == null) {
			if (other.netNetWeightMeasure != null)
				return false;
		} else if (!this.netNetWeightMeasure.equals(other.netNetWeightMeasure))
			return false;
		if (this.netVolumeMeasure == null) {
			if (other.netVolumeMeasure != null)
				return false;
		} else if (!this.netVolumeMeasure.equals(other.netVolumeMeasure))
			return false;
		if (this.netWeightMeasure == null) {
			if (other.netWeightMeasure != null)
				return false;
		} else if (!this.netWeightMeasure.equals(other.netWeightMeasure))
			return false;
		if (this.originAddress == null) {
			if (other.originAddress != null)
				return false;
		} else if (!this.originAddress.equals(other.originAddress))
			return false;
		if (this.priorityLevelCode == null) {
			if (other.priorityLevelCode != null)
				return false;
		} else if (!this.priorityLevelCode.equals(other.priorityLevelCode))
			return false;
		if (this.shipmentStage == null) {
			if (other.shipmentStage != null)
				return false;
		} else if (!this.shipmentStage.equals(other.shipmentStage))
			return false;
		if (this.specialInstructions == null) {
			if (other.specialInstructions != null)
				return false;
		} else if (!this.specialInstructions.equals(other.specialInstructions))
			return false;
		if (this.totalGoodsItemQuantity == null) {
			if (other.totalGoodsItemQuantity != null)
				return false;
		} else if (!this.totalGoodsItemQuantity.equals(other.totalGoodsItemQuantity))
			return false;
		if (this.totalTransportHandlingUnitQuantity == null) {
			if (other.totalTransportHandlingUnitQuantity != null)
				return false;
		} else if (!this.totalTransportHandlingUnitQuantity.equals(other.totalTransportHandlingUnitQuantity))
			return false;
		if (this.transportContract == null) {
			if (other.transportContract != null)
				return false;
		} else if (!this.transportContract.equals(other.transportContract))
			return false;
		if (this.transportHandlingUnit == null) {
			if (other.transportHandlingUnit != null)
				return false;
		} else if (!this.transportHandlingUnit.equals(other.transportHandlingUnit))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // ShipmentType