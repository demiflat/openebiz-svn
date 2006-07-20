/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.OnCarriageIndicatorType;
import org.openebiz.core.common.cbc.PreCarriageIndicatorType;
import org.openebiz.core.common.cbc.TransitDirectionCodeType;
import org.openebiz.core.common.cbc.TransportMeansTypeCodeType;
import org.openebiz.core.common.cbc.TransportModeCodeType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipment Stage Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Shipment Stage. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about a Shipment Stage</ccts:Definition>
 *           <ccts:ObjectClass>Shipment Stage</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentStageType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentStageType#getTransportModeCode <em>Transport Mode Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentStageType#getTransportMeansTypeCode <em>Transport Means Type Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentStageType#getTransitDirectionCode <em>Transit Direction Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentStageType#getPreCarriageIndicator <em>Pre Carriage Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentStageType#getOnCarriageIndicator <em>On Carriage Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentStageType#getTransitPeriod <em>Transit Period</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentStageType#getCarrierParty <em>Carrier Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentStageType#getTransportMeans <em>Transport Means</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentStageType#getLoadingPort <em>Loading Port</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentStageType#getUnloadingPort <em>Unloading Port</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentStageType#getTransshipPort <em>Transship Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShipmentStageType implements Serializable {
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
	 * The cached value of the '{@link #getTransportModeCode() <em>Transport Mode Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportModeCode()
	 * @generated
	 * @ordered
	 */
	protected TransportModeCodeType transportModeCode = null;

	/**
	 * The cached value of the '{@link #getTransportMeansTypeCode() <em>Transport Means Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportMeansTypeCode()
	 * @generated
	 * @ordered
	 */
	protected TransportMeansTypeCodeType transportMeansTypeCode = null;

	/**
	 * The cached value of the '{@link #getTransitDirectionCode() <em>Transit Direction Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitDirectionCode()
	 * @generated
	 * @ordered
	 */
	protected TransitDirectionCodeType transitDirectionCode = null;

	/**
	 * The cached value of the '{@link #getPreCarriageIndicator() <em>Pre Carriage Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreCarriageIndicator()
	 * @generated
	 * @ordered
	 */
	protected PreCarriageIndicatorType preCarriageIndicator = null;

	/**
	 * The cached value of the '{@link #getOnCarriageIndicator() <em>On Carriage Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnCarriageIndicator()
	 * @generated
	 * @ordered
	 */
	protected OnCarriageIndicatorType onCarriageIndicator = null;

	/**
	 * The cached value of the '{@link #getTransitPeriod() <em>Transit Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitPeriod()
	 * @generated
	 * @ordered
	 */
	protected PeriodType transitPeriod = null;

	/**
	 * The cached value of the '{@link #getCarrierParty() <em>Carrier Party</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierParty()
	 * @generated
	 * @ordered
	 */
	protected List carrierParty = null;

	/**
	 * The cached value of the '{@link #getTransportMeans() <em>Transport Means</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportMeans()
	 * @generated
	 * @ordered
	 */
	protected TransportMeansType transportMeans = null;

	/**
	 * The cached value of the '{@link #getLoadingPort() <em>Loading Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadingPort()
	 * @generated
	 * @ordered
	 */
	protected PortType loadingPort = null;

	/**
	 * The cached value of the '{@link #getUnloadingPort() <em>Unloading Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnloadingPort()
	 * @generated
	 * @ordered
	 */
	protected PortType unloadingPort = null;

	/**
	 * The cached value of the '{@link #getTransshipPort() <em>Transship Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransshipPort()
	 * @generated
	 * @ordered
	 */
	protected PortType transshipPort = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ShipmentStageType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.iD = this.getID();
		this.transportModeCode = this.getTransportModeCode();
		this.transportMeansTypeCode = this.getTransportMeansTypeCode();
		this.transitDirectionCode = this.getTransitDirectionCode();
		this.preCarriageIndicator = this.getPreCarriageIndicator();
		this.onCarriageIndicator = this.getOnCarriageIndicator();
		this.transitPeriod = this.getTransitPeriod();
		this.carrierParty = this.getCarrierParty();
		this.transportMeans = this.getTransportMeans();
		this.loadingPort = this.getLoadingPort();
		this.unloadingPort = this.getUnloadingPort();
		this.transshipPort = this.getTransshipPort();
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
	 *               <ccts:DictionaryEntryName>Shipment Stage. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for a Shipment Stage</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment Stage</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:Examples>"1","2", etc..</ccts:Examples>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentStageType#getID <em>ID</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Transport Mode Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment Stage. Transport Mode. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The method of transport used for a Shipment Stage</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment Stage</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Transport Mode</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transport Mode Code</em>' containment reference.
	 * @see #setTransportModeCode(TransportModeCodeType)
	 * @generated
	 */
	public TransportModeCodeType getTransportModeCode() {
		return (transportModeCode == null) ? new TransportModeCodeType()
				: transportModeCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentStageType#getTransportModeCode <em>Transport Mode Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Mode Code</em>' containment reference.
	 * @see #getTransportModeCode()
	 * @generated
	 */
	public void setTransportModeCode(TransportModeCodeType newTransportModeCode) {
		transportModeCode = newTransportModeCode;
	}

	/**
	 * Returns the value of the '<em><b>Transport Means Type Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment Stage. Transport Means Type. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The type of vehicle used for a Shipment Stage</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment Stage</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Transport Means Type</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transport Means Type Code</em>' containment reference.
	 * @see #setTransportMeansTypeCode(TransportMeansTypeCodeType)
	 * @generated
	 */
	public TransportMeansTypeCodeType getTransportMeansTypeCode() {
		return (transportMeansTypeCode == null) ? new TransportMeansTypeCodeType()
				: transportMeansTypeCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentStageType#getTransportMeansTypeCode <em>Transport Means Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Means Type Code</em>' containment reference.
	 * @see #getTransportMeansTypeCode()
	 * @generated
	 */
	public void setTransportMeansTypeCode(
			TransportMeansTypeCodeType newTransportMeansTypeCode) {
		transportMeansTypeCode = newTransportMeansTypeCode;
	}

	/**
	 * Returns the value of the '<em><b>Transit Direction Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment Stage. Transit Direction. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The direction of transit for a Shipment Stage</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment Stage</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Transit Direction</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transit Direction Code</em>' containment reference.
	 * @see #setTransitDirectionCode(TransitDirectionCodeType)
	 * @generated
	 */
	public TransitDirectionCodeType getTransitDirectionCode() {
		return (transitDirectionCode == null) ? new TransitDirectionCodeType()
				: transitDirectionCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentStageType#getTransitDirectionCode <em>Transit Direction Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transit Direction Code</em>' containment reference.
	 * @see #getTransitDirectionCode()
	 * @generated
	 */
	public void setTransitDirectionCode(
			TransitDirectionCodeType newTransitDirectionCode) {
		transitDirectionCode = newTransitDirectionCode;
	}

	/**
	 * Returns the value of the '<em><b>Pre Carriage Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment Stage. Pre Carriage Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An indicator as the whether the stage is before the main carriage of the shipment</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment Stage</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Pre Carriage Indicator</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *               <ccts:Examples>Truck delivery to wharf</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pre Carriage Indicator</em>' containment reference.
	 * @see #setPreCarriageIndicator(PreCarriageIndicatorType)
	 * @generated
	 */
	public PreCarriageIndicatorType getPreCarriageIndicator() {
		return (preCarriageIndicator == null) ? new PreCarriageIndicatorType()
				: preCarriageIndicator;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentStageType#getPreCarriageIndicator <em>Pre Carriage Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Carriage Indicator</em>' containment reference.
	 * @see #getPreCarriageIndicator()
	 * @generated
	 */
	public void setPreCarriageIndicator(
			PreCarriageIndicatorType newPreCarriageIndicator) {
		preCarriageIndicator = newPreCarriageIndicator;
	}

	/**
	 * Returns the value of the '<em><b>On Carriage Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment Stage. On Carriage Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An indicator as the whether the stage is after the main carriage of the shipment</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment Stage</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>On Carriage Indicator</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *               <ccts:Examples>Truck delivery from wharf</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Carriage Indicator</em>' containment reference.
	 * @see #setOnCarriageIndicator(OnCarriageIndicatorType)
	 * @generated
	 */
	public OnCarriageIndicatorType getOnCarriageIndicator() {
		return (onCarriageIndicator == null) ? new OnCarriageIndicatorType()
				: onCarriageIndicator;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentStageType#getOnCarriageIndicator <em>On Carriage Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Carriage Indicator</em>' containment reference.
	 * @see #getOnCarriageIndicator()
	 * @generated
	 */
	public void setOnCarriageIndicator(
			OnCarriageIndicatorType newOnCarriageIndicator) {
		onCarriageIndicator = newOnCarriageIndicator;
	}

	/**
	 * Returns the value of the '<em><b>Transit Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment Stage. Transit_ Period. Period</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Transit Period</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment Stage</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Transit</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Period</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Period</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transit Period</em>' containment reference.
	 * @see #setTransitPeriod(PeriodType)
	 * @generated
	 */
	public PeriodType getTransitPeriod() {
		return (transitPeriod == null) ? new PeriodType() : transitPeriod;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentStageType#getTransitPeriod <em>Transit Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transit Period</em>' containment reference.
	 * @see #getTransitPeriod()
	 * @generated
	 */
	public void setTransitPeriod(PeriodType newTransitPeriod) {
		transitPeriod = newTransitPeriod;
	}

	/**
	 * Returns the value of the '<em><b>Carrier Party</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.PartyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment Stage. Carrier_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Carrier</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment Stage</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Carrier</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Carrier Party</em>' containment reference list.
	 * @generated
	 */
	public List getCarrierParty() {
		if (carrierParty == null) {
			carrierParty = new ArrayList<PartyType>();
		}
		return carrierParty;
	}

	/**
	 * Returns the value of the '<em><b>Transport Means</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment Stage. Transport Means</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the means of transport</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment Stage</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Transport Means</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Transport Means</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transport Means</em>' containment reference.
	 * @see #setTransportMeans(TransportMeansType)
	 * @generated
	 */
	public TransportMeansType getTransportMeans() {
		return (transportMeans == null) ? new TransportMeansType()
				: transportMeans;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentStageType#getTransportMeans <em>Transport Means</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Means</em>' containment reference.
	 * @see #getTransportMeans()
	 * @generated
	 */
	public void setTransportMeans(TransportMeansType newTransportMeans) {
		transportMeans = newTransportMeans;
	}

	/**
	 * Returns the value of the '<em><b>Loading Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 * 
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment Stage. Loading_ Port. Port</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the port of loading</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment Stage</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Loading</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Port</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Port</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loading Port</em>' containment reference.
	 * @see #setLoadingPort(PortType)
	 * @generated
	 */
	public PortType getLoadingPort() {
		return (loadingPort == null) ? new PortType() : loadingPort;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentStageType#getLoadingPort <em>Loading Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loading Port</em>' containment reference.
	 * @see #getLoadingPort()
	 * @generated
	 */
	public void setLoadingPort(PortType newLoadingPort) {
		loadingPort = newLoadingPort;
	}

	/**
	 * Returns the value of the '<em><b>Unloading Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment Stage. Unloading_ Port. Port</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the port of unloading</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment Stage</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Unloading</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Port</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Port</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unloading Port</em>' containment reference.
	 * @see #setUnloadingPort(PortType)
	 * @generated
	 */
	public PortType getUnloadingPort() {
		return (unloadingPort == null) ? new PortType() : unloadingPort;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentStageType#getUnloadingPort <em>Unloading Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unloading Port</em>' containment reference.
	 * @see #getUnloadingPort()
	 * @generated
	 */
	public void setUnloadingPort(PortType newUnloadingPort) {
		unloadingPort = newUnloadingPort;
	}

	/**
	 * Returns the value of the '<em><b>Transship Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment Stage. Transship_ Port. Port</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the port of transshipment</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment Stage</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Transship</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Port</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Port</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transship Port</em>' containment reference.
	 * @see #setTransshipPort(PortType)
	 * @generated
	 */
	public PortType getTransshipPort() {
		return (transshipPort == null) ? new PortType() : transshipPort;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentStageType#getTransshipPort <em>Transship Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transship Port</em>' containment reference.
	 * @see #getTransshipPort()
	 * @generated
	 */
	public void setTransshipPort(PortType newTransshipPort) {
		transshipPort = newTransshipPort;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.carrierParty == null) ? 0 : this.carrierParty.hashCode());
		result = PRIME * result + ((this.iD == null) ? 0 : this.iD.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.loadingPort == null) ? 0 : this.loadingPort.hashCode());
		result = PRIME * result + ((this.onCarriageIndicator == null) ? 0 : this.onCarriageIndicator.hashCode());
		result = PRIME * result + ((this.preCarriageIndicator == null) ? 0 : this.preCarriageIndicator.hashCode());
		result = PRIME * result + ((this.transitDirectionCode == null) ? 0 : this.transitDirectionCode.hashCode());
		result = PRIME * result + ((this.transitPeriod == null) ? 0 : this.transitPeriod.hashCode());
		result = PRIME * result + ((this.transportMeans == null) ? 0 : this.transportMeans.hashCode());
		result = PRIME * result + ((this.transportMeansTypeCode == null) ? 0 : this.transportMeansTypeCode.hashCode());
		result = PRIME * result + ((this.transportModeCode == null) ? 0 : this.transportModeCode.hashCode());
		result = PRIME * result + ((this.transshipPort == null) ? 0 : this.transshipPort.hashCode());
		result = PRIME * result + ((this.unloadingPort == null) ? 0 : this.unloadingPort.hashCode());
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
		final ShipmentStageType other = (ShipmentStageType) obj;
		if (this.carrierParty == null) {
			if (other.carrierParty != null)
				return false;
		} else if (!this.carrierParty.equals(other.carrierParty))
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
		if (this.loadingPort == null) {
			if (other.loadingPort != null)
				return false;
		} else if (!this.loadingPort.equals(other.loadingPort))
			return false;
		if (this.onCarriageIndicator == null) {
			if (other.onCarriageIndicator != null)
				return false;
		} else if (!this.onCarriageIndicator.equals(other.onCarriageIndicator))
			return false;
		if (this.preCarriageIndicator == null) {
			if (other.preCarriageIndicator != null)
				return false;
		} else if (!this.preCarriageIndicator.equals(other.preCarriageIndicator))
			return false;
		if (this.transitDirectionCode == null) {
			if (other.transitDirectionCode != null)
				return false;
		} else if (!this.transitDirectionCode.equals(other.transitDirectionCode))
			return false;
		if (this.transitPeriod == null) {
			if (other.transitPeriod != null)
				return false;
		} else if (!this.transitPeriod.equals(other.transitPeriod))
			return false;
		if (this.transportMeans == null) {
			if (other.transportMeans != null)
				return false;
		} else if (!this.transportMeans.equals(other.transportMeans))
			return false;
		if (this.transportMeansTypeCode == null) {
			if (other.transportMeansTypeCode != null)
				return false;
		} else if (!this.transportMeansTypeCode.equals(other.transportMeansTypeCode))
			return false;
		if (this.transportModeCode == null) {
			if (other.transportModeCode != null)
				return false;
		} else if (!this.transportModeCode.equals(other.transportModeCode))
			return false;
		if (this.transshipPort == null) {
			if (other.transshipPort != null)
				return false;
		} else if (!this.transshipPort.equals(other.transshipPort))
			return false;
		if (this.unloadingPort == null) {
			if (other.unloadingPort != null)
				return false;
		} else if (!this.unloadingPort.equals(other.unloadingPort))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // ShipmentStageType