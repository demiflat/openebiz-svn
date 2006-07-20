/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.DispositionCodeType;
import org.openebiz.core.common.cbc.FullnessIndicationCodeType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.InformationType;
import org.openebiz.core.common.cbc.LegalStatusIndicatorType;
import org.openebiz.core.common.cbc.OwnerTypeCodeType;
import org.openebiz.core.common.cbc.ProviderTypeCodeType;
import org.openebiz.core.common.cbc.RefrigerationOnIndicatorType;
import org.openebiz.core.common.cbc.ReturnabilityIndicatorType;
import org.openebiz.core.common.cbc.SizeTypeCodeType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transport Equipment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Transport Equipment. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about Transport Equipment; a piece of equipment used to transport goods</ccts:Definition>
 *           <ccts:ObjectClass>Transport Equipment</ccts:ObjectClass>
 *           <ccts:AlternativeBusinessTerms>Shipping Container, Sea Container, Rail Wagon, Pallet, Trailer, Unit Load Device, ULD</ccts:AlternativeBusinessTerms>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentType#getProviderTypeCode <em>Provider Type Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentType#getOwnerTypeCode <em>Owner Type Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentType#getSizeTypeCode <em>Size Type Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentType#getDispositionCode <em>Disposition Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentType#getFullnessIndicationCode <em>Fullness Indication Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentType#getRefrigerationOnIndicator <em>Refrigeration On Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentType#getInformation <em>Information</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentType#getReturnabilityIndicator <em>Returnability Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentType#getLegalStatusIndicator <em>Legal Status Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentType#getMeasurementDimension <em>Measurement Dimension</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentType#getTransportEquipmentSeal <em>Transport Equipment Seal</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentType#getMinimumTemperature <em>Minimum Temperature</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentType#getMaximumTemperature <em>Maximum Temperature</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentType#getProviderParty <em>Provider Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentType#getLoadingProofParty <em>Loading Proof Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentType#getLoadingLocation <em>Loading Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransportEquipmentType implements Serializable {
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
	 * The cached value of the '{@link #getProviderTypeCode() <em>Provider Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderTypeCode()
	 * @generated
	 * @ordered
	 */
	protected ProviderTypeCodeType providerTypeCode = null;

	/**
	 * The cached value of the '{@link #getOwnerTypeCode() <em>Owner Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerTypeCode()
	 * @generated
	 * @ordered
	 */
	protected OwnerTypeCodeType ownerTypeCode = null;

	/**
	 * The cached value of the '{@link #getSizeTypeCode() <em>Size Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeTypeCode()
	 * @generated
	 * @ordered
	 */
	protected SizeTypeCodeType sizeTypeCode = null;

	/**
	 * The cached value of the '{@link #getDispositionCode() <em>Disposition Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispositionCode()
	 * @generated
	 * @ordered
	 */
	protected DispositionCodeType dispositionCode = null;

	/**
	 * The cached value of the '{@link #getFullnessIndicationCode() <em>Fullness Indication Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullnessIndicationCode()
	 * @generated
	 * @ordered
	 */
	protected FullnessIndicationCodeType fullnessIndicationCode = null;

	/**
	 * The cached value of the '{@link #getRefrigerationOnIndicator() <em>Refrigeration On Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefrigerationOnIndicator()
	 * @generated
	 * @ordered
	 */
	protected RefrigerationOnIndicatorType refrigerationOnIndicator = null;

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
	 * The cached value of the '{@link #getReturnabilityIndicator() <em>Returnability Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnabilityIndicator()
	 * @generated
	 * @ordered
	 */
	protected ReturnabilityIndicatorType returnabilityIndicator = null;

	/**
	 * The cached value of the '{@link #getLegalStatusIndicator() <em>Legal Status Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegalStatusIndicator()
	 * @generated
	 * @ordered
	 */
	protected LegalStatusIndicatorType legalStatusIndicator = null;

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
	 * The cached value of the '{@link #getTransportEquipmentSeal() <em>Transport Equipment Seal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportEquipmentSeal()
	 * @generated
	 * @ordered
	 */
	protected List transportEquipmentSeal = null;

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
	 * The cached value of the '{@link #getProviderParty() <em>Provider Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderParty()
	 * @generated
	 * @ordered
	 */
	protected PartyType providerParty = null;

	/**
	 * The cached value of the '{@link #getLoadingProofParty() <em>Loading Proof Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadingProofParty()
	 * @generated
	 * @ordered
	 */
	protected PartyType loadingProofParty = null;

	/**
	 * The cached value of the '{@link #getLoadingLocation() <em>Loading Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadingLocation()
	 * @generated
	 * @ordered
	 */
	protected LocationType loadingLocation = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public TransportEquipmentType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.iD = this.getID();
		this.providerTypeCode = this.getProviderTypeCode();
		this.ownerTypeCode = this.getOwnerTypeCode();
		this.sizeTypeCode = this.getSizeTypeCode();
		this.dispositionCode = this.getDispositionCode();
		this.fullnessIndicationCode = this.getFullnessIndicationCode();
		this.refrigerationOnIndicator = this.getRefrigerationOnIndicator();
		this.information = this.getInformation();
		this.returnabilityIndicator = this.getReturnabilityIndicator();
		this.legalStatusIndicator = this.getLegalStatusIndicator();
		this.measurementDimension = this.getMeasurementDimension();
		this.transportEquipmentSeal = this.getTransportEquipmentSeal();
		this.minimumTemperature = this.getMinimumTemperature();
		this.maximumTemperature = this.getMaximumTemperature();
		this.providerParty = this.getProviderParty();
		this.loadingProofParty = this.getLoadingProofParty();
		this.loadingLocation = this.getLoadingLocation();
	}

	/**
	 * Returns the value of the '<em><b>ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Equipment. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for Transport Equipment</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:Examples>"OCLU 1234567"</ccts:Examples>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportEquipmentType#getID <em>ID</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Provider Type Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Equipment. Provider Type. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An identifier for the type of provider for the Transport Equipment</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Provider Type</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider Type Code</em>' containment reference.
	 * @see #setProviderTypeCode(ProviderTypeCodeType)
	 * @generated
	 */
	public ProviderTypeCodeType getProviderTypeCode() {
		return (providerTypeCode == null) ? new ProviderTypeCodeType()
				: providerTypeCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportEquipmentType#getProviderTypeCode <em>Provider Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Type Code</em>' containment reference.
	 * @see #getProviderTypeCode()
	 * @generated
	 */
	public void setProviderTypeCode(ProviderTypeCodeType newProviderTypeCode) {
		providerTypeCode = newProviderTypeCode;
	}

	/**
	 * Returns the value of the '<em><b>Owner Type Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Equipment. Owner Type. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An identifier for the type of owner of a piece of Transport Equipment</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Owner Type</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owner Type Code</em>' containment reference.
	 * @see #setOwnerTypeCode(OwnerTypeCodeType)
	 * @generated
	 */
	public OwnerTypeCodeType getOwnerTypeCode() {
		return (ownerTypeCode == null) ? new OwnerTypeCodeType()
				: ownerTypeCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportEquipmentType#getOwnerTypeCode <em>Owner Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Type Code</em>' containment reference.
	 * @see #getOwnerTypeCode()
	 * @generated
	 */
	public void setOwnerTypeCode(OwnerTypeCodeType newOwnerTypeCode) {
		ownerTypeCode = newOwnerTypeCode;
	}

	/**
	 * Returns the value of the '<em><b>Size Type Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Equipment. Size Type. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The size and type of a piece of Transport Equipment expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Size Type</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size Type Code</em>' containment reference.
	 * @see #setSizeTypeCode(SizeTypeCodeType)
	 * @generated
	 */
	public SizeTypeCodeType getSizeTypeCode() {
		return (sizeTypeCode == null) ? new SizeTypeCodeType() : sizeTypeCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportEquipmentType#getSizeTypeCode <em>Size Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Type Code</em>' containment reference.
	 * @see #getSizeTypeCode()
	 * @generated
	 */
	public void setSizeTypeCode(SizeTypeCodeType newSizeTypeCode) {
		sizeTypeCode = newSizeTypeCode;
	}

	/**
	 * Returns the value of the '<em><b>Disposition Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Equipment. Disposition. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The current disposition of the Transport Equipment expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Disposition</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Status</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disposition Code</em>' containment reference.
	 * @see #setDispositionCode(DispositionCodeType)
	 * @generated
	 */
	public DispositionCodeType getDispositionCode() {
		return (dispositionCode == null) ? new DispositionCodeType()
				: dispositionCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportEquipmentType#getDispositionCode <em>Disposition Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disposition Code</em>' containment reference.
	 * @see #getDispositionCode()
	 * @generated
	 */
	public void setDispositionCode(DispositionCodeType newDispositionCode) {
		dispositionCode = newDispositionCode;
	}

	/**
	 * Returns the value of the '<em><b>Fullness Indication Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Equipment. Fullness Indication. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A code indicating whether a piece of transport equipment is full, partially full or empty</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Fullness Indication</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fullness Indication Code</em>' containment reference.
	 * @see #setFullnessIndicationCode(FullnessIndicationCodeType)
	 * @generated
	 */
	public FullnessIndicationCodeType getFullnessIndicationCode() {
		return (fullnessIndicationCode == null) ? new FullnessIndicationCodeType()
				: fullnessIndicationCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportEquipmentType#getFullnessIndicationCode <em>Fullness Indication Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fullness Indication Code</em>' containment reference.
	 * @see #getFullnessIndicationCode()
	 * @generated
	 */
	public void setFullnessIndicationCode(
			FullnessIndicationCodeType newFullnessIndicationCode) {
		fullnessIndicationCode = newFullnessIndicationCode;
	}

	/**
	 * Returns the value of the '<em><b>Refrigeration On Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Equipment. Refrigeration On Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Indicates whether refrigeration is on (true) or off (false) for the Transportation equipment</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Refrigeration On Indicator</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refrigeration On Indicator</em>' containment reference.
	 * @see #setRefrigerationOnIndicator(RefrigerationOnIndicatorType)
	 * @generated
	 */
	public RefrigerationOnIndicatorType getRefrigerationOnIndicator() {
		return (refrigerationOnIndicator == null) ? new RefrigerationOnIndicatorType()
				: refrigerationOnIndicator;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportEquipmentType#getRefrigerationOnIndicator <em>Refrigeration On Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refrigeration On Indicator</em>' containment reference.
	 * @see #getRefrigerationOnIndicator()
	 * @generated
	 */
	public void setRefrigerationOnIndicator(
			RefrigerationOnIndicatorType newRefrigerationOnIndicator) {
		refrigerationOnIndicator = newRefrigerationOnIndicator;
	}

	/**
	 * Returns the value of the '<em><b>Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Equipment. Information. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Additional information about the Transport Equipment</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportEquipmentType#getInformation <em>Information</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Returnability Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Equipment. Returnability Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Indication as to whether or not a particular item of transport equipment is returnable.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Returnability Indicator</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Returnability Indicator</em>' containment reference.
	 * @see #setReturnabilityIndicator(ReturnabilityIndicatorType)
	 * @generated
	 */
	public ReturnabilityIndicatorType getReturnabilityIndicator() {
		return (returnabilityIndicator == null) ? new ReturnabilityIndicatorType()
				: returnabilityIndicator;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportEquipmentType#getReturnabilityIndicator <em>Returnability Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returnability Indicator</em>' containment reference.
	 * @see #getReturnabilityIndicator()
	 * @generated
	 */
	public void setReturnabilityIndicator(
			ReturnabilityIndicatorType newReturnabilityIndicator) {
		returnabilityIndicator = newReturnabilityIndicator;
	}

	/**
	 * Returns the value of the '<em><b>Legal Status Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Equipment. Legal Status Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Legal status of the transport equipment with respect to the Container Convention code.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Legal Status Indicator</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Legal Status Indicator</em>' containment reference.
	 * @see #setLegalStatusIndicator(LegalStatusIndicatorType)
	 * @generated
	 */
	public LegalStatusIndicatorType getLegalStatusIndicator() {
		return (legalStatusIndicator == null) ? new LegalStatusIndicatorType()
				: legalStatusIndicator;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportEquipmentType#getLegalStatusIndicator <em>Legal Status Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legal Status Indicator</em>' containment reference.
	 * @see #getLegalStatusIndicator()
	 * @generated
	 */
	public void setLegalStatusIndicator(
			LegalStatusIndicatorType newLegalStatusIndicator) {
		legalStatusIndicator = newLegalStatusIndicator;
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
	 *               <ccts:DictionaryEntryName>Transport Equipment. Measurement_ Dimension. Dimension</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Dimension</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment</ccts:ObjectClass>
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
	 * Returns the value of the '<em><b>Transport Equipment Seal</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.TransportEquipmentSealType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Equipment. Transport Equipment Seal</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Transport Equiment Seal</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Transport Equipment Seal</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Transport Equipment Seal</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transport Equipment Seal</em>' containment reference list.
	 * @generated
	 */
	public List getTransportEquipmentSeal() {
		if (transportEquipmentSeal == null) {
			transportEquipmentSeal = new ArrayList<
					TransportEquipmentSealType>();
		}
		return transportEquipmentSeal;
	}

	/**
	 * Returns the value of the '<em><b>Minimum Temperature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Equipment. Minimum_ Temperature. Temperature</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The minimum required operating temperature for the container (Reefer)</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportEquipmentType#getMinimumTemperature <em>Minimum Temperature</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Transport Equipment. Maximum_ Temperature. Temperature</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The maximum required operating termperature for the container (Reefer)</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportEquipmentType#getMaximumTemperature <em>Maximum Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Temperature</em>' containment reference.
	 * @see #getMaximumTemperature()
	 * @generated
	 */
	public void setMaximumTemperature(TemperatureType newMaximumTemperature) {
		maximumTemperature = newMaximumTemperature;
	}

	/**
	 * Returns the value of the '<em><b>Provider Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Equipment. Provider_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition/>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Provider</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider Party</em>' containment reference.
	 * @see #setProviderParty(PartyType)
	 * @generated
	 */
	public PartyType getProviderParty() {
		return (providerParty == null) ? new PartyType() : providerParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportEquipmentType#getProviderParty <em>Provider Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Party</em>' containment reference.
	 * @see #getProviderParty()
	 * @generated
	 */
	public void setProviderParty(PartyType newProviderParty) {
		providerParty = newProviderParty;
	}

	/**
	 * Returns the value of the '<em><b>Loading Proof Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Equipment. Loading Proof_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the authorized party responsible for certifying that the goods were loaded into the transport equipment</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Loading Proof</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Party responsible for proof of vanning (WCO ID 059)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loading Proof Party</em>' containment reference.
	 * @see #setLoadingProofParty(PartyType)
	 * @generated
	 */
	public PartyType getLoadingProofParty() {
		return (loadingProofParty == null) ? new PartyType()
				: loadingProofParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportEquipmentType#getLoadingProofParty <em>Loading Proof Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loading Proof Party</em>' containment reference.
	 * @see #getLoadingProofParty()
	 * @generated
	 */
	public void setLoadingProofParty(PartyType newLoadingProofParty) {
		loadingProofParty = newLoadingProofParty;
	}

	/**
	 * Returns the value of the '<em><b>Loading Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Equipment. Loading_ Location. Location</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>To identify the location where the goods are loaded into the transport equipment.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Loading</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Location</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Location</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Vanning address (WCO ID 068), Stuffing location</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loading Location</em>' containment reference.
	 * @see #setLoadingLocation(LocationType)
	 * @generated
	 */
	public LocationType getLoadingLocation() {
		return (loadingLocation == null) ? new LocationType() : loadingLocation;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportEquipmentType#getLoadingLocation <em>Loading Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loading Location</em>' containment reference.
	 * @see #getLoadingLocation()
	 * @generated
	 */
	public void setLoadingLocation(LocationType newLoadingLocation) {
		loadingLocation = newLoadingLocation;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.dispositionCode == null) ? 0 : this.dispositionCode.hashCode());
		result = PRIME * result + ((this.fullnessIndicationCode == null) ? 0 : this.fullnessIndicationCode.hashCode());
		result = PRIME * result + ((this.iD == null) ? 0 : this.iD.hashCode());
		result = PRIME * result + ((this.information == null) ? 0 : this.information.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.legalStatusIndicator == null) ? 0 : this.legalStatusIndicator.hashCode());
		result = PRIME * result + ((this.loadingLocation == null) ? 0 : this.loadingLocation.hashCode());
		result = PRIME * result + ((this.loadingProofParty == null) ? 0 : this.loadingProofParty.hashCode());
		result = PRIME * result + ((this.maximumTemperature == null) ? 0 : this.maximumTemperature.hashCode());
		result = PRIME * result + ((this.measurementDimension == null) ? 0 : this.measurementDimension.hashCode());
		result = PRIME * result + ((this.minimumTemperature == null) ? 0 : this.minimumTemperature.hashCode());
		result = PRIME * result + ((this.ownerTypeCode == null) ? 0 : this.ownerTypeCode.hashCode());
		result = PRIME * result + ((this.providerParty == null) ? 0 : this.providerParty.hashCode());
		result = PRIME * result + ((this.providerTypeCode == null) ? 0 : this.providerTypeCode.hashCode());
		result = PRIME * result + ((this.refrigerationOnIndicator == null) ? 0 : this.refrigerationOnIndicator.hashCode());
		result = PRIME * result + ((this.returnabilityIndicator == null) ? 0 : this.returnabilityIndicator.hashCode());
		result = PRIME * result + ((this.sizeTypeCode == null) ? 0 : this.sizeTypeCode.hashCode());
		result = PRIME * result + ((this.transportEquipmentSeal == null) ? 0 : this.transportEquipmentSeal.hashCode());
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
		final TransportEquipmentType other = (TransportEquipmentType) obj;
		if (this.dispositionCode == null) {
			if (other.dispositionCode != null)
				return false;
		} else if (!this.dispositionCode.equals(other.dispositionCode))
			return false;
		if (this.fullnessIndicationCode == null) {
			if (other.fullnessIndicationCode != null)
				return false;
		} else if (!this.fullnessIndicationCode.equals(other.fullnessIndicationCode))
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
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.legalStatusIndicator == null) {
			if (other.legalStatusIndicator != null)
				return false;
		} else if (!this.legalStatusIndicator.equals(other.legalStatusIndicator))
			return false;
		if (this.loadingLocation == null) {
			if (other.loadingLocation != null)
				return false;
		} else if (!this.loadingLocation.equals(other.loadingLocation))
			return false;
		if (this.loadingProofParty == null) {
			if (other.loadingProofParty != null)
				return false;
		} else if (!this.loadingProofParty.equals(other.loadingProofParty))
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
		if (this.ownerTypeCode == null) {
			if (other.ownerTypeCode != null)
				return false;
		} else if (!this.ownerTypeCode.equals(other.ownerTypeCode))
			return false;
		if (this.providerParty == null) {
			if (other.providerParty != null)
				return false;
		} else if (!this.providerParty.equals(other.providerParty))
			return false;
		if (this.providerTypeCode == null) {
			if (other.providerTypeCode != null)
				return false;
		} else if (!this.providerTypeCode.equals(other.providerTypeCode))
			return false;
		if (this.refrigerationOnIndicator == null) {
			if (other.refrigerationOnIndicator != null)
				return false;
		} else if (!this.refrigerationOnIndicator.equals(other.refrigerationOnIndicator))
			return false;
		if (this.returnabilityIndicator == null) {
			if (other.returnabilityIndicator != null)
				return false;
		} else if (!this.returnabilityIndicator.equals(other.returnabilityIndicator))
			return false;
		if (this.sizeTypeCode == null) {
			if (other.sizeTypeCode != null)
				return false;
		} else if (!this.sizeTypeCode.equals(other.sizeTypeCode))
			return false;
		if (this.transportEquipmentSeal == null) {
			if (other.transportEquipmentSeal != null)
				return false;
		} else if (!this.transportEquipmentSeal.equals(other.transportEquipmentSeal))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // TransportEquipmentType