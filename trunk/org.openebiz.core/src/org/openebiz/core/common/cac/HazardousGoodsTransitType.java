/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.InhalationToxicityZoneCodeType;
import org.openebiz.core.common.cbc.PackingCriteriaCodeType;
import org.openebiz.core.common.cbc.RegulationCodeType;
import org.openebiz.core.common.cbc.TransportAuthorizationCodeType;
import org.openebiz.core.common.cbc.TransportEmergencyCardCodeType;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hazardous Goods Transit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Hazardous Goods Transit. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about Harzardous Goods Transit</ccts:Definition>
 *           <ccts:ObjectClass>Hazardous Goods Transit</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.HazardousGoodsTransitType#getTransportEmergencyCardCode <em>Transport Emergency Card Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.HazardousGoodsTransitType#getPackingCriteriaCode <em>Packing Criteria Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.HazardousGoodsTransitType#getRegulationCode <em>Regulation Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.HazardousGoodsTransitType#getInhalationToxicityZoneCode <em>Inhalation Toxicity Zone Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.HazardousGoodsTransitType#getTransportAuthorizationCode <em>Transport Authorization Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.HazardousGoodsTransitType#getMaximumTemperature <em>Maximum Temperature</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.HazardousGoodsTransitType#getMinimumTemperature <em>Minimum Temperature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HazardousGoodsTransitType implements Serializable {
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
	 * The cached value of the '{@link #getTransportEmergencyCardCode() <em>Transport Emergency Card Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportEmergencyCardCode()
	 * @generated
	 * @ordered
	 */
	protected TransportEmergencyCardCodeType transportEmergencyCardCode = null;

	/**
	 * The cached value of the '{@link #getPackingCriteriaCode() <em>Packing Criteria Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackingCriteriaCode()
	 * @generated
	 * @ordered
	 */
	protected PackingCriteriaCodeType packingCriteriaCode = null;

	/**
	 * The cached value of the '{@link #getRegulationCode() <em>Regulation Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulationCode()
	 * @generated
	 * @ordered
	 */
	protected RegulationCodeType regulationCode = null;

	/**
	 * The cached value of the '{@link #getInhalationToxicityZoneCode() <em>Inhalation Toxicity Zone Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInhalationToxicityZoneCode()
	 * @generated
	 * @ordered
	 */
	protected InhalationToxicityZoneCodeType inhalationToxicityZoneCode = null;

	/**
	 * The cached value of the '{@link #getTransportAuthorizationCode() <em>Transport Authorization Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportAuthorizationCode()
	 * @generated
	 * @ordered
	 */
	protected TransportAuthorizationCodeType transportAuthorizationCode = null;

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
	 * The cached value of the '{@link #getMinimumTemperature() <em>Minimum Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumTemperature()
	 * @generated
	 * @ordered
	 */
	protected TemperatureType minimumTemperature = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public HazardousGoodsTransitType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.transportEmergencyCardCode = this.getTransportEmergencyCardCode();
		this.packingCriteriaCode = this.getPackingCriteriaCode();
		this.regulationCode = this.getRegulationCode();
		this.inhalationToxicityZoneCode = this.getInhalationToxicityZoneCode();
		this.transportAuthorizationCode = this.getTransportAuthorizationCode();
		this.maximumTemperature = this.getMaximumTemperature();
		this.minimumTemperature = this.getMinimumTemperature();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getRegulationCode().getValue());
		return sdisplay.toString();
	}
	
	/**
	 * Returns the value of the '<em><b>Transport Emergency Card Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Hazardous Goods Transit. Transport Emergency Card. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for a transport emergency card, describing the actions to be taken in an emergency in transporting the Hazardous Goods.  May be the identity number of a hazardous emergency response plan assigned by the appropriate authority.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Hazardous Goods Transit</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Transport Emergency Card</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>TREM card</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transport Emergency Card Code</em>' containment reference.
	 * @see #setTransportEmergencyCardCode(TransportEmergencyCardCodeType)
	 * @generated
	 */
	public TransportEmergencyCardCodeType getTransportEmergencyCardCode() {
		return (transportEmergencyCardCode == null) ? new TransportEmergencyCardCodeType()
				: transportEmergencyCardCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousGoodsTransitType#getTransportEmergencyCardCode <em>Transport Emergency Card Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Emergency Card Code</em>' containment reference.
	 * @see #getTransportEmergencyCardCode()
	 * @generated
	 */
	public void setTransportEmergencyCardCode(
			TransportEmergencyCardCodeType newTransportEmergencyCardCode) {
		transportEmergencyCardCode = newTransportEmergencyCardCode;
	}

	/**
	 * Returns the value of the '<em><b>Packing Criteria Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Hazardous Goods Transit. Packing Criteria. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A code identifying the packaging requirement for the transportation of the Hazardous Goods as assigned by IATA/IMDB/ADR/RID etc.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Hazardous Goods Transit</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Packing Criteria</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Packing Group</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packing Criteria Code</em>' containment reference.
	 * @see #setPackingCriteriaCode(PackingCriteriaCodeType)
	 * @generated
	 */
	public PackingCriteriaCodeType getPackingCriteriaCode() {
		return (packingCriteriaCode == null) ? new PackingCriteriaCodeType()
				: packingCriteriaCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousGoodsTransitType#getPackingCriteriaCode <em>Packing Criteria Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packing Criteria Code</em>' containment reference.
	 * @see #getPackingCriteriaCode()
	 * @generated
	 */
	public void setPackingCriteriaCode(
			PackingCriteriaCodeType newPackingCriteriaCode) {
		packingCriteriaCode = newPackingCriteriaCode;
	}

	/**
	 * Returns the value of the '<em><b>Regulation Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Hazardous Goods Transit. Regulation Code. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for a set of legal regulations which governs the transportation of the Hazardous Goods; expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Hazardous Goods Transit</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Regulation Code</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Regulation Code</em>' containment reference.
	 * @see #setRegulationCode(RegulationCodeType)
	 * @generated
	 */
	public RegulationCodeType getRegulationCode() {
		return (regulationCode == null) ? new RegulationCodeType()
				: regulationCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousGoodsTransitType#getRegulationCode <em>Regulation Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulation Code</em>' containment reference.
	 * @see #getRegulationCode()
	 * @generated
	 */
	public void setRegulationCode(RegulationCodeType newRegulationCode) {
		regulationCode = newRegulationCode;
	}

	/**
	 * Returns the value of the '<em><b>Inhalation Toxicity Zone Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Hazardous Goods Transit. Inhalation Toxicity Zone. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An identifier for the Inhalation Toxicity Hazard Zone for the Hazardous Goods, as defined by the US Department of Transportation; expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Hazardous Goods Transit</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Inhalation Toxicity Zone</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inhalation Toxicity Zone Code</em>' containment reference.
	 * @see #setInhalationToxicityZoneCode(InhalationToxicityZoneCodeType)
	 * @generated
	 */
	public InhalationToxicityZoneCodeType getInhalationToxicityZoneCode() {
		return (inhalationToxicityZoneCode == null) ? new InhalationToxicityZoneCodeType()
				: inhalationToxicityZoneCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousGoodsTransitType#getInhalationToxicityZoneCode <em>Inhalation Toxicity Zone Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inhalation Toxicity Zone Code</em>' containment reference.
	 * @see #getInhalationToxicityZoneCode()
	 * @generated
	 */
	public void setInhalationToxicityZoneCode(
			InhalationToxicityZoneCodeType newInhalationToxicityZoneCode) {
		inhalationToxicityZoneCode = newInhalationToxicityZoneCode;
	}

	/**
	 * Returns the value of the '<em><b>Transport Authorization Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Hazardous Goods Transit. Transport_ Authorization Code. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Code specifying the authorisation for the transportation of hazardous cargo.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Hazardous Goods Transit</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Transport</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Authorization Code</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Permission for Transport</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transport Authorization Code</em>' containment reference.
	 * @see #setTransportAuthorizationCode(TransportAuthorizationCodeType)
	 * @generated
	 */
	public TransportAuthorizationCodeType getTransportAuthorizationCode() {
		return (transportAuthorizationCode == null) ? new TransportAuthorizationCodeType()
				: transportAuthorizationCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousGoodsTransitType#getTransportAuthorizationCode <em>Transport Authorization Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Authorization Code</em>' containment reference.
	 * @see #getTransportAuthorizationCode()
	 * @generated
	 */
	public void setTransportAuthorizationCode(
			TransportAuthorizationCodeType newTransportAuthorizationCode) {
		transportAuthorizationCode = newTransportAuthorizationCode;
	}

	/**
	 * Returns the value of the '<em><b>Maximum Temperature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Hazardous Goods Transit. Maximum_ Temperature. Temperature</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Maximum Temperature (at which the Hazardous Goods can be safely transported)</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Hazardous Goods Transit</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousGoodsTransitType#getMaximumTemperature <em>Maximum Temperature</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Minimum Temperature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Hazardous Goods Transit. Minimum_ Temperature. Temperature</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Minimum Temperature (at which the Hazardous Goods can be safely transported)</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Hazardous Goods Transit</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousGoodsTransitType#getMinimumTemperature <em>Minimum Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Temperature</em>' containment reference.
	 * @see #getMinimumTemperature()
	 * @generated
	 */
	public void setMinimumTemperature(TemperatureType newMinimumTemperature) {
		minimumTemperature = newMinimumTemperature;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.inhalationToxicityZoneCode == null) ? 0 : this.inhalationToxicityZoneCode.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.maximumTemperature == null) ? 0 : this.maximumTemperature.hashCode());
		result = PRIME * result + ((this.minimumTemperature == null) ? 0 : this.minimumTemperature.hashCode());
		result = PRIME * result + ((this.packingCriteriaCode == null) ? 0 : this.packingCriteriaCode.hashCode());
		result = PRIME * result + ((this.regulationCode == null) ? 0 : this.regulationCode.hashCode());
		result = PRIME * result + ((this.transportAuthorizationCode == null) ? 0 : this.transportAuthorizationCode.hashCode());
		result = PRIME * result + ((this.transportEmergencyCardCode == null) ? 0 : this.transportEmergencyCardCode.hashCode());
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
		final HazardousGoodsTransitType other = (HazardousGoodsTransitType) obj;
		if (this.inhalationToxicityZoneCode == null) {
			if (other.inhalationToxicityZoneCode != null)
				return false;
		} else if (!this.inhalationToxicityZoneCode.equals(other.inhalationToxicityZoneCode))
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
		if (this.minimumTemperature == null) {
			if (other.minimumTemperature != null)
				return false;
		} else if (!this.minimumTemperature.equals(other.minimumTemperature))
			return false;
		if (this.packingCriteriaCode == null) {
			if (other.packingCriteriaCode != null)
				return false;
		} else if (!this.packingCriteriaCode.equals(other.packingCriteriaCode))
			return false;
		if (this.regulationCode == null) {
			if (other.regulationCode != null)
				return false;
		} else if (!this.regulationCode.equals(other.regulationCode))
			return false;
		if (this.transportAuthorizationCode == null) {
			if (other.transportAuthorizationCode != null)
				return false;
		} else if (!this.transportAuthorizationCode.equals(other.transportAuthorizationCode))
			return false;
		if (this.transportEmergencyCardCode == null) {
			if (other.transportEmergencyCardCode != null)
				return false;
		} else if (!this.transportEmergencyCardCode.equals(other.transportEmergencyCardCode))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // HazardousGoodsTransitType