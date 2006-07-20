/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.DamageRemarksType;
import org.openebiz.core.common.cbc.HandlingCodeType;
import org.openebiz.core.common.cbc.HandlingInstructionsType;
import org.openebiz.core.common.cbc.HazardousRiskIndicatorType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.ShippingMarksType;
import org.openebiz.core.common.cbc.TotalGoodsItemQuantityType;
import org.openebiz.core.common.cbc.TotalPackageQuantityType;
import org.openebiz.core.common.cbc.TotalTransportEquipmentQuantityType;
import org.openebiz.core.common.cbc.TransportHandlingUnitTypeCodeType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transport Handling Unit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Transport Handling Unit. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>A uniquely identifiable physical unit consisting of one or more packages (not necessarily containing the same articles) for enabling physical handling during the  transport process.</ccts:Definition>
 *           <ccts:ObjectClass>Transport Handling Unit</ccts:ObjectClass>
 *           <ccts:AlternativeBusinessTerms>Logistics Unit, Handling Unit, THU</ccts:AlternativeBusinessTerms>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getTransportHandlingUnitTypeCode <em>Transport Handling Unit Type Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getHandlingCode <em>Handling Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getHandlingInstructions <em>Handling Instructions</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getHazardousRiskIndicator <em>Hazardous Risk Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getTotalGoodsItemQuantity <em>Total Goods Item Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getDamageRemarks <em>Damage Remarks</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getShippingMarks <em>Shipping Marks</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getTotalTransportEquipmentQuantity <em>Total Transport Equipment Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getTotalPackageQuantity <em>Total Package Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getDespatchLine <em>Despatch Line</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getActualPackage <em>Actual Package</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getReceivedReceiptLine <em>Received Receipt Line</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getTransportEquipment <em>Transport Equipment</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getHazardousGoodsTransit <em>Hazardous Goods Transit</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getMeasurementDimension <em>Measurement Dimension</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getMinimumTemperature <em>Minimum Temperature</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getMaximumTemperature <em>Maximum Temperature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransportHandlingUnitType implements Serializable {
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
	 * The cached value of the '{@link #getTransportHandlingUnitTypeCode() <em>Transport Handling Unit Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportHandlingUnitTypeCode()
	 * @generated
	 * @ordered
	 */
	protected TransportHandlingUnitTypeCodeType transportHandlingUnitTypeCode = null;

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
	 * The cached value of the '{@link #getHazardousRiskIndicator() <em>Hazardous Risk Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazardousRiskIndicator()
	 * @generated
	 * @ordered
	 */
	protected HazardousRiskIndicatorType hazardousRiskIndicator = null;

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
	 * The cached value of the '{@link #getDamageRemarks() <em>Damage Remarks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamageRemarks()
	 * @generated
	 * @ordered
	 */
	protected List damageRemarks = null;

	/**
	 * The cached value of the '{@link #getShippingMarks() <em>Shipping Marks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShippingMarks()
	 * @generated
	 * @ordered
	 */
	protected List shippingMarks = null;

	/**
	 * The cached value of the '{@link #getTotalTransportEquipmentQuantity() <em>Total Transport Equipment Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalTransportEquipmentQuantity()
	 * @generated
	 * @ordered
	 */
	protected TotalTransportEquipmentQuantityType totalTransportEquipmentQuantity = null;

	/**
	 * The cached value of the '{@link #getTotalPackageQuantity() <em>Total Package Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalPackageQuantity()
	 * @generated
	 * @ordered
	 */
	protected TotalPackageQuantityType totalPackageQuantity = null;

	/**
	 * The cached value of the '{@link #getDespatchLine() <em>Despatch Line</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDespatchLine()
	 * @generated
	 * @ordered
	 */
	protected List despatchLine = null;

	/**
	 * The cached value of the '{@link #getActualPackage() <em>Actual Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualPackage()
	 * @generated
	 * @ordered
	 */
	protected List actualPackage = null;

	/**
	 * The cached value of the '{@link #getReceivedReceiptLine() <em>Received Receipt Line</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedReceiptLine()
	 * @generated
	 * @ordered
	 */
	protected List receivedReceiptLine = null;

	/**
	 * The cached value of the '{@link #getTransportEquipment() <em>Transport Equipment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportEquipment()
	 * @generated
	 * @ordered
	 */
	protected List transportEquipment = null;

	/**
	 * The cached value of the '{@link #getHazardousGoodsTransit() <em>Hazardous Goods Transit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazardousGoodsTransit()
	 * @generated
	 * @ordered
	 */
	protected List hazardousGoodsTransit = null;

	/**
	 * The cached value of the '{@link #getMeasurementDimension() <em>Measurement Dimension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementDimension()
	 * @generated
	 * @ordered
	 */
	protected List measurementDimension = null;

	/**
	 * The cached value of the '{@link #getMinimumTemperature() <em>Minimum Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumTemperature()
	 * @generated
	 * @ordered
	 */
	protected TemperatureType minimumTemperature = null;

	/**
	 * The cached value of the '{@link #getMaximumTemperature() <em>Maximum Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumTemperature()
	 * @generated
	 * @ordered
	 */
	protected TemperatureType maximumTemperature = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public TransportHandlingUnitType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.iD = this.getID();
		this.transportHandlingUnitTypeCode = this.getTransportHandlingUnitTypeCode();
		this.handlingCode = this.getHandlingCode();
		this.handlingInstructions = this.getHandlingInstructions();
		this.hazardousRiskIndicator = this.getHazardousRiskIndicator();
		this.totalGoodsItemQuantity = this.getTotalGoodsItemQuantity();
		this.damageRemarks = this.getDamageRemarks();
		this.shippingMarks = this.getShippingMarks();
		this.totalTransportEquipmentQuantity = this.getTotalTransportEquipmentQuantity();
		this.totalPackageQuantity = this.getTotalPackageQuantity();
		this.despatchLine = this.getDespatchLine();
		this.actualPackage = this.getActualPackage();
		this.receivedReceiptLine = this.getReceivedReceiptLine();
		this.transportEquipment = this.getTransportEquipment();
		this.hazardousGoodsTransit = this.getHazardousGoodsTransit();
		this.measurementDimension = this.getMeasurementDimension();
		this.minimumTemperature = this.getMinimumTemperature();
		this.maximumTemperature = this.getMaximumTemperature();
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
	 *               <ccts:DictionaryEntryName>Transport Handling Unit. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the Transport Handling Unit</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Handling Unit</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getID <em>ID</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Transport Handling Unit Type Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Handling Unit. Transport Handling Unit Type. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The type of Transport Handling Unit expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Handling Unit</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Transport Handling Unit Type</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transport Handling Unit Type Code</em>' containment reference.
	 * @see #setTransportHandlingUnitTypeCode(TransportHandlingUnitTypeCodeType)
	 * @generated
	 */
	public TransportHandlingUnitTypeCodeType getTransportHandlingUnitTypeCode() {
		return (transportHandlingUnitTypeCode == null) ? new TransportHandlingUnitTypeCodeType()
				: transportHandlingUnitTypeCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getTransportHandlingUnitTypeCode <em>Transport Handling Unit Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Handling Unit Type Code</em>' containment reference.
	 * @see #getTransportHandlingUnitTypeCode()
	 * @generated
	 */
	public void setTransportHandlingUnitTypeCode(
			TransportHandlingUnitTypeCodeType newTransportHandlingUnitTypeCode) {
		transportHandlingUnitTypeCode = newTransportHandlingUnitTypeCode;
	}

	/**
	 * Returns the value of the '<em><b>Handling Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Handling Unit. Handling Code. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The handling required for a Shipment expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Handling Unit</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getHandlingCode <em>Handling Code</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Transport Handling Unit. Handling Instructions. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Free form text describing Handling Instructions for a Shipment</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Handling Unit</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getHandlingInstructions <em>Handling Instructions</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Hazardous Risk Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Handling Unit. Hazardous Risk Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An indicator as to whether the shipment contains hazardous materials</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Handling Unit</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Hazardous Risk Indicator</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *               <ccts:Examples>Default is negative</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hazardous Risk Indicator</em>' containment reference.
	 * @see #setHazardousRiskIndicator(HazardousRiskIndicatorType)
	 * @generated
	 */
	public HazardousRiskIndicatorType getHazardousRiskIndicator() {
		return (hazardousRiskIndicator == null) ? new HazardousRiskIndicatorType()
				: hazardousRiskIndicator;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getHazardousRiskIndicator <em>Hazardous Risk Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hazardous Risk Indicator</em>' containment reference.
	 * @see #getHazardousRiskIndicator()
	 * @generated
	 */
	public void setHazardousRiskIndicator(
			HazardousRiskIndicatorType newHazardousRiskIndicator) {
		hazardousRiskIndicator = newHazardousRiskIndicator;
	}

	/**
	 * Returns the value of the '<em><b>Total Goods Item Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Handling Unit. Total_ Goods Item Quantity. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The total number of goods items in the Transport Handling Unit</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Handling Unit</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getTotalGoodsItemQuantity <em>Total Goods Item Quantity</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Damage Remarks</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cbc.DamageRemarksType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Handling Unit. Damage Remarks. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Description of a type of damage.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Handling Unit</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Damage Remarks</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Damage Remarks</em>' containment reference list.
	 * @generated
	 */
	public List getDamageRemarks() {
		if (damageRemarks == null) {
			damageRemarks = new ArrayList<DamageRemarksType>();
		}
		return damageRemarks;
	}

	/**
	 * Returns the value of the '<em><b>Shipping Marks</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cbc.ShippingMarksType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Handling Unit. Shipping Marks. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Free form description of the marks and numbers on a transport unit or package.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Handling Unit</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Shipping Marks</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Marks and Numbers, Shipping Marks</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shipping Marks</em>' containment reference list.
	 * @generated
	 */
	public List getShippingMarks() {
		if (shippingMarks == null) {
			shippingMarks = new ArrayList<ShippingMarksType>();
		}
		return shippingMarks;
	}

	/**
	 * Returns the value of the '<em><b>Total Transport Equipment Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Handling Unit. Total_ Transport Equipment Quantity. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Count of the number of pieces of transport equipment in a THU, such as containers and similar unit load devices.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Handling Unit</ccts:ObjectClass>
	 * 
	 *               <ccts:PropertyTermQualifier>Total</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Transport Equipment Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Number of containers (WCO ID 150)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Transport Equipment Quantity</em>' containment reference.
	 * @see #setTotalTransportEquipmentQuantity(TotalTransportEquipmentQuantityType)
	 * @generated
	 */
	public TotalTransportEquipmentQuantityType getTotalTransportEquipmentQuantity() {
		return (totalTransportEquipmentQuantity == null) ? new TotalTransportEquipmentQuantityType()
				: totalTransportEquipmentQuantity;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getTotalTransportEquipmentQuantity <em>Total Transport Equipment Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Transport Equipment Quantity</em>' containment reference.
	 * @see #getTotalTransportEquipmentQuantity()
	 * @generated
	 */
	public void setTotalTransportEquipmentQuantity(
			TotalTransportEquipmentQuantityType newTotalTransportEquipmentQuantity) {
		totalTransportEquipmentQuantity = newTotalTransportEquipmentQuantity;
	}

	/**
	 * Returns the value of the '<em><b>Total Package Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Handling Unit. Total_ Package Quantity. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Count of total number of packages of the entire THU.</ccts:Definition>
	 * 
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Handling Unit</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Total</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Package Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Package Quantity</em>' containment reference.
	 * @see #setTotalPackageQuantity(TotalPackageQuantityType)
	 * @generated
	 */
	public TotalPackageQuantityType getTotalPackageQuantity() {
		return (totalPackageQuantity == null) ? new TotalPackageQuantityType()
				: totalPackageQuantity;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getTotalPackageQuantity <em>Total Package Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Package Quantity</em>' containment reference.
	 * @see #getTotalPackageQuantity()
	 * @generated
	 */
	public void setTotalPackageQuantity(
			TotalPackageQuantityType newTotalPackageQuantity) {
		totalPackageQuantity = newTotalPackageQuantity;
	}

	/**
	 * Returns the value of the '<em><b>Despatch Line</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.DespatchLineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Handling Unit. Despatch Line</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Handling Unit Despatch Line</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Handling Unit</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Despatch Line</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Despatch Line</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Despatch Line</em>' containment reference list.
	 * @generated
	 */
	public List getDespatchLine() {
		if (despatchLine == null) {
			despatchLine = new ArrayList<DespatchLineType>();
		}
		return despatchLine;
	}

	/**
	 * Returns the value of the '<em><b>Actual Package</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.PackageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Handling Unit. Actual_ Package. Package</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Actual Package</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Handling Unit</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Actual</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Package</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Package</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Package</em>' containment reference list.
	 * @generated
	 */
	public List getActualPackage() {
		if (actualPackage == null) {
			actualPackage = new ArrayList<PackageType>();
		}
		return actualPackage;
	}

	/**
	 * Returns the value of the '<em><b>Received Receipt Line</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.ReceiptLineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Handling Unit. Received_ Receipt Line. Receipt Line</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Receipt Line</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Handling Unit</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Received</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Receipt Line</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Receipt Line</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Received Receipt Line</em>' containment reference list.
	 * @generated
	 */
	public List getReceivedReceiptLine() {
		if (receivedReceiptLine == null) {
			receivedReceiptLine = new ArrayList<ReceiptLineType>();
		}
		return receivedReceiptLine;
	}

	/**
	 * Returns the value of the '<em><b>Transport Equipment</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.TransportEquipmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Handling Unit. Transport Equipment</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Transport Equipment</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Handling Unit</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Transport Equipment</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Transport Equipment</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transport Equipment</em>' containment reference list.
	 * @generated
	 */
	public List getTransportEquipment() {
		if (transportEquipment == null) {
			transportEquipment = new ArrayList<
					TransportEquipmentType>();
		}
		return transportEquipment;
	}

	/**
	 * Returns the value of the '<em><b>Hazardous Goods Transit</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.HazardousGoodsTransitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Handling Unit. Hazardous Goods Transit</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to information about the transportation of hazardous goods.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Handling Unit</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Hazardous Goods Transit</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Hazardous Goods Transit</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hazardous Goods Transit</em>' containment reference list.
	 * @generated
	 */
	public List getHazardousGoodsTransit() {
		if (hazardousGoodsTransit == null) {
			hazardousGoodsTransit = new ArrayList<
					HazardousGoodsTransitType>();
		}
		return hazardousGoodsTransit;
	}

	/**
	 * Returns the value of the '<em><b>Measurement Dimension</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.DimensionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Handling Unit. Measurement_ Dimension. Dimension</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Dimension</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Handling Unit</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Measurement</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Dimension</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Dimension</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measurement Dimension</em>' containment reference list.
	 * @generated
	 */
	public List getMeasurementDimension() {
		if (measurementDimension == null) {
			measurementDimension = new ArrayList<DimensionType>();
		}
		return measurementDimension;
	}

	/**
	 * Returns the value of the '<em><b>Minimum Temperature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Handling Unit. Minimum_ Temperature. Temperature</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The minimum required operating temperature</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Handling Unit</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Minimum</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Temperature</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Temperature</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Temperature</em>' containment reference.
	 * @see #setMinimumTemperature(TemperatureType)
	 * @generated
	 */
	public TemperatureType getMinimumTemperature() {
		return (minimumTemperature == null) ? new TemperatureType()
				: minimumTemperature;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getMinimumTemperature <em>Minimum Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Temperature</em>' containment reference.
	 * @see #getMinimumTemperature()
	 * @generated
	 */
	public void setMinimumTemperature(TemperatureType newMinimumTemperature) {
		minimumTemperature = newMinimumTemperature;
	}

	/**
	 * Returns the value of the '<em><b>Maximum Temperature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Handling Unit. Maximum_ Temperature. Temperature</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The maximum required operating termperature</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Handling Unit</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Maximum</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Temperature</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Temperature</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Temperature</em>' containment reference.
	 * @see #setMaximumTemperature(TemperatureType)
	 * @generated
	 */
	public TemperatureType getMaximumTemperature() {
		return (maximumTemperature == null) ? new TemperatureType()
				: maximumTemperature;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getMaximumTemperature <em>Maximum Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Temperature</em>' containment reference.
	 * @see #getMaximumTemperature()
	 * @generated
	 */
	public void setMaximumTemperature(TemperatureType newMaximumTemperature) {
		maximumTemperature = newMaximumTemperature;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.actualPackage == null) ? 0 : this.actualPackage.hashCode());
		result = PRIME * result + ((this.damageRemarks == null) ? 0 : this.damageRemarks.hashCode());
		result = PRIME * result + ((this.despatchLine == null) ? 0 : this.despatchLine.hashCode());
		result = PRIME * result + ((this.handlingCode == null) ? 0 : this.handlingCode.hashCode());
		result = PRIME * result + ((this.handlingInstructions == null) ? 0 : this.handlingInstructions.hashCode());
		result = PRIME * result + ((this.hazardousGoodsTransit == null) ? 0 : this.hazardousGoodsTransit.hashCode());
		result = PRIME * result + ((this.hazardousRiskIndicator == null) ? 0 : this.hazardousRiskIndicator.hashCode());
		result = PRIME * result + ((this.iD == null) ? 0 : this.iD.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.maximumTemperature == null) ? 0 : this.maximumTemperature.hashCode());
		result = PRIME * result + ((this.measurementDimension == null) ? 0 : this.measurementDimension.hashCode());
		result = PRIME * result + ((this.minimumTemperature == null) ? 0 : this.minimumTemperature.hashCode());
		result = PRIME * result + ((this.receivedReceiptLine == null) ? 0 : this.receivedReceiptLine.hashCode());
		result = PRIME * result + ((this.shippingMarks == null) ? 0 : this.shippingMarks.hashCode());
		result = PRIME * result + ((this.totalGoodsItemQuantity == null) ? 0 : this.totalGoodsItemQuantity.hashCode());
		result = PRIME * result + ((this.totalPackageQuantity == null) ? 0 : this.totalPackageQuantity.hashCode());
		result = PRIME * result + ((this.totalTransportEquipmentQuantity == null) ? 0 : this.totalTransportEquipmentQuantity.hashCode());
		result = PRIME * result + ((this.transportEquipment == null) ? 0 : this.transportEquipment.hashCode());
		result = PRIME * result + ((this.transportHandlingUnitTypeCode == null) ? 0 : this.transportHandlingUnitTypeCode.hashCode());
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
		final TransportHandlingUnitType other = (TransportHandlingUnitType) obj;
		if (this.actualPackage == null) {
			if (other.actualPackage != null)
				return false;
		} else if (!this.actualPackage.equals(other.actualPackage))
			return false;
		if (this.damageRemarks == null) {
			if (other.damageRemarks != null)
				return false;
		} else if (!this.damageRemarks.equals(other.damageRemarks))
			return false;
		if (this.despatchLine == null) {
			if (other.despatchLine != null)
				return false;
		} else if (!this.despatchLine.equals(other.despatchLine))
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
		if (this.hazardousGoodsTransit == null) {
			if (other.hazardousGoodsTransit != null)
				return false;
		} else if (!this.hazardousGoodsTransit.equals(other.hazardousGoodsTransit))
			return false;
		if (this.hazardousRiskIndicator == null) {
			if (other.hazardousRiskIndicator != null)
				return false;
		} else if (!this.hazardousRiskIndicator.equals(other.hazardousRiskIndicator))
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
		if (this.maximumTemperature == null) {
			if (other.maximumTemperature != null)
				return false;
		} else if (!this.maximumTemperature.equals(other.maximumTemperature))
			return false;
		if (this.measurementDimension == null) {
			if (other.measurementDimension != null)
				return false;
		} else if (!this.measurementDimension.equals(other.measurementDimension))
			return false;
		if (this.minimumTemperature == null) {
			if (other.minimumTemperature != null)
				return false;
		} else if (!this.minimumTemperature.equals(other.minimumTemperature))
			return false;
		if (this.receivedReceiptLine == null) {
			if (other.receivedReceiptLine != null)
				return false;
		} else if (!this.receivedReceiptLine.equals(other.receivedReceiptLine))
			return false;
		if (this.shippingMarks == null) {
			if (other.shippingMarks != null)
				return false;
		} else if (!this.shippingMarks.equals(other.shippingMarks))
			return false;
		if (this.totalGoodsItemQuantity == null) {
			if (other.totalGoodsItemQuantity != null)
				return false;
		} else if (!this.totalGoodsItemQuantity.equals(other.totalGoodsItemQuantity))
			return false;
		if (this.totalPackageQuantity == null) {
			if (other.totalPackageQuantity != null)
				return false;
		} else if (!this.totalPackageQuantity.equals(other.totalPackageQuantity))
			return false;
		if (this.totalTransportEquipmentQuantity == null) {
			if (other.totalTransportEquipmentQuantity != null)
				return false;
		} else if (!this.totalTransportEquipmentQuantity.equals(other.totalTransportEquipmentQuantity))
			return false;
		if (this.transportEquipment == null) {
			if (other.transportEquipment != null)
				return false;
		} else if (!this.transportEquipment.equals(other.transportEquipment))
			return false;
		if (this.transportHandlingUnitTypeCode == null) {
			if (other.transportHandlingUnitTypeCode != null)
				return false;
		} else if (!this.transportHandlingUnitTypeCode.equals(other.transportHandlingUnitTypeCode))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // TransportHandlingUnitType