/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.AdditionalInformationType;
import org.openebiz.core.common.cbc.CategoryCodeType;
import org.openebiz.core.common.cbc.CategoryNameType;
import org.openebiz.core.common.cbc.EmergencyProceduresCodeType;
import org.openebiz.core.common.cbc.HazardClassIDType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.LowerOrangeHazardPlacardIDType;
import org.openebiz.core.common.cbc.MarkingIDType;
import org.openebiz.core.common.cbc.MedicalFirstAidGuideCodeType;
import org.openebiz.core.common.cbc.PlacardEndorsementType;
import org.openebiz.core.common.cbc.PlacardNotationType;
import org.openebiz.core.common.cbc.TechnicalNameType;
import org.openebiz.core.common.cbc.UNDGCodeType;
import org.openebiz.core.common.cbc.UpperOrangeHazardPlacardIDType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hazardous Item Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Hazardous Item. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about a Hazardous Item</ccts:Definition>
 *           <ccts:ObjectClass>Hazardous Item</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.HazardousItemType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.HazardousItemType#getPlacardNotation <em>Placard Notation</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.HazardousItemType#getPlacardEndorsement <em>Placard Endorsement</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.HazardousItemType#getAdditionalInformation <em>Additional Information</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.HazardousItemType#getUNDGCode <em>UNDG Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.HazardousItemType#getEmergencyProceduresCode <em>Emergency Procedures Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.HazardousItemType#getMedicalFirstAidGuideCode <em>Medical First Aid Guide Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.HazardousItemType#getTechnicalName <em>Technical Name</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.HazardousItemType#getCategoryName <em>Category Name</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.HazardousItemType#getCategoryCode <em>Category Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.HazardousItemType#getUpperOrangeHazardPlacardID <em>Upper Orange Hazard Placard ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.HazardousItemType#getLowerOrangeHazardPlacardID <em>Lower Orange Hazard Placard ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.HazardousItemType#getMarkingID <em>Marking ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.HazardousItemType#getHazardClassID <em>Hazard Class ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.HazardousItemType#getContactParty <em>Contact Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.HazardousItemType#getSecondaryHazard <em>Secondary Hazard</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.HazardousItemType#getHazardousGoodsTransit <em>Hazardous Goods Transit</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.HazardousItemType#getEmergencyTemperature <em>Emergency Temperature</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.HazardousItemType#getFlashpointTemperature <em>Flashpoint Temperature</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.HazardousItemType#getAdditionalTemperature <em>Additional Temperature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HazardousItemType implements Serializable {
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
	 * The cached value of the '{@link #getPlacardNotation() <em>Placard Notation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacardNotation()
	 * @generated
	 * @ordered
	 */
	protected PlacardNotationType placardNotation = null;

	/**
	 * The cached value of the '{@link #getPlacardEndorsement() <em>Placard Endorsement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacardEndorsement()
	 * @generated
	 * @ordered
	 */
	protected PlacardEndorsementType placardEndorsement = null;

	/**
	 * The cached value of the '{@link #getAdditionalInformation() <em>Additional Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInformation()
	 * @generated
	 * @ordered
	 */
	protected AdditionalInformationType additionalInformation = null;

	/**
	 * The cached value of the '{@link #getUNDGCode() <em>UNDG Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUNDGCode()
	 * @generated
	 * @ordered
	 */
	protected UNDGCodeType uNDGCode = null;

	/**
	 * The cached value of the '{@link #getEmergencyProceduresCode() <em>Emergency Procedures Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmergencyProceduresCode()
	 * @generated
	 * @ordered
	 */
	protected EmergencyProceduresCodeType emergencyProceduresCode = null;

	/**
	 * The cached value of the '{@link #getMedicalFirstAidGuideCode() <em>Medical First Aid Guide Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicalFirstAidGuideCode()
	 * @generated
	 * @ordered
	 */
	protected MedicalFirstAidGuideCodeType medicalFirstAidGuideCode = null;

	/**
	 * The cached value of the '{@link #getTechnicalName() <em>Technical Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnicalName()
	 * @generated
	 * @ordered
	 */
	protected TechnicalNameType technicalName = null;

	/**
	 * The cached value of the '{@link #getCategoryName() <em>Category Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryName()
	 * @generated
	 * @ordered
	 */
	protected CategoryNameType categoryName = null;

	/**
	 * The cached value of the '{@link #getCategoryCode() <em>Category Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryCode()
	 * @generated
	 * @ordered
	 */
	protected CategoryCodeType categoryCode = null;

	/**
	 * The cached value of the '{@link #getUpperOrangeHazardPlacardID() <em>Upper Orange Hazard Placard ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperOrangeHazardPlacardID()
	 * @generated
	 * @ordered
	 */
	protected UpperOrangeHazardPlacardIDType upperOrangeHazardPlacardID = null;

	/**
	 * The cached value of the '{@link #getLowerOrangeHazardPlacardID() <em>Lower Orange Hazard Placard ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerOrangeHazardPlacardID()
	 * @generated
	 * @ordered
	 */
	protected LowerOrangeHazardPlacardIDType lowerOrangeHazardPlacardID = null;

	/**
	 * The cached value of the '{@link #getMarkingID() <em>Marking ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkingID()
	 * @generated
	 * @ordered
	 */
	protected MarkingIDType markingID = null;

	/**
	 * The cached value of the '{@link #getHazardClassID() <em>Hazard Class ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazardClassID()
	 * @generated
	 * @ordered
	 */
	protected HazardClassIDType hazardClassID = null;

	/**
	 * The cached value of the '{@link #getContactParty() <em>Contact Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactParty()
	 * @generated
	 * @ordered
	 */
	protected PartyType contactParty = null;

	/**
	 * The cached value of the '{@link #getSecondaryHazard() <em>Secondary Hazard</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryHazard()
	 * @generated
	 * @ordered
	 */
	protected List secondaryHazard = null;

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
	 * The cached value of the '{@link #getEmergencyTemperature() <em>Emergency Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmergencyTemperature()
	 * @generated
	 * @ordered
	 */
	protected TemperatureType emergencyTemperature = null;

	/**
	 * The cached value of the '{@link #getFlashpointTemperature() <em>Flashpoint Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlashpointTemperature()
	 * @generated
	 * @ordered
	 */
	protected TemperatureType flashpointTemperature = null;

	/**
	 * The cached value of the '{@link #getAdditionalTemperature() <em>Additional Temperature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalTemperature()
	 * @generated
	 * @ordered
	 */
	protected List additionalTemperature = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public HazardousItemType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.iD = this.getID();
		this.placardNotation = this.getPlacardNotation();
		this.placardEndorsement = this.getPlacardEndorsement();
		this.additionalInformation = this.getAdditionalInformation();
		this.uNDGCode = this.getUNDGCode();
		this.emergencyProceduresCode = this.getEmergencyProceduresCode();
		this.medicalFirstAidGuideCode = this.getMedicalFirstAidGuideCode();
		this.technicalName = this.getTechnicalName();
		this.categoryName = this.getCategoryName();
		this.categoryCode = this.getCategoryCode();
		this.upperOrangeHazardPlacardID = this.getUpperOrangeHazardPlacardID();
		this.lowerOrangeHazardPlacardID = this.getLowerOrangeHazardPlacardID();
		this.markingID = this.getMarkingID();
		this.hazardClassID = this.getHazardClassID();
		this.contactParty = this.getContactParty();
		this.secondaryHazard = this.getSecondaryHazard();
		this.hazardousGoodsTransit = this.getHazardousGoodsTransit();
		this.emergencyTemperature = this.getEmergencyTemperature();
		this.flashpointTemperature = this.getFlashpointTemperature();
		this.additionalTemperature = this.getAdditionalTemperature();
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
	 *               <ccts:DictionaryEntryName>Hazardous Item. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for a Hazardour Item</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Hazardous Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:Examples>"Round Up"</ccts:Examples>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousItemType#getID <em>ID</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Placard Notation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Hazardous Item. Placard Notation. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The placard notation corresponding to the hazard class of the hazardous commodity. Can also be the hazard identification number of the orange placard (upper part) required on the means of transport</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Hazardous Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Placard Notation</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:Examples>"5.1"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Placard Notation</em>' containment reference.
	 * @see #setPlacardNotation(PlacardNotationType)
	 * @generated
	 */
	public PlacardNotationType getPlacardNotation() {
		return (placardNotation == null) ? new PlacardNotationType()
				: placardNotation;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousItemType#getPlacardNotation <em>Placard Notation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placard Notation</em>' containment reference.
	 * @see #getPlacardNotation()
	 * @generated
	 */
	public void setPlacardNotation(PlacardNotationType newPlacardNotation) {
		placardNotation = newPlacardNotation;
	}

	/**
	 * Returns the value of the '<em><b>Placard Endorsement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Hazardous Item. Placard Endorsement. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The placard endorsement that is to be shown on the shipping papers for the hazardous commodity. Can also be used for the number of the orange placard (lower part) required on the means of transport</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Hazardous Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Placard Endorsement</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:Examples>"2"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Placard Endorsement</em>' containment reference.
	 * @see #setPlacardEndorsement(PlacardEndorsementType)
	 * @generated
	 */
	public PlacardEndorsementType getPlacardEndorsement() {
		return (placardEndorsement == null) ? new PlacardEndorsementType()
				: placardEndorsement;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousItemType#getPlacardEndorsement <em>Placard Endorsement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placard Endorsement</em>' containment reference.
	 * @see #getPlacardEndorsement()
	 * @generated
	 */
	public void setPlacardEndorsement(
			PlacardEndorsementType newPlacardEndorsement) {
		placardEndorsement = newPlacardEndorsement;
	}

	/**
	 * Returns the value of the '<em><b>Additional Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Hazardous Item. Additional_ Information. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Additional information about the hazardous substance. Can be used to specify information such as the type of regulatory requirements that apply to a description</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Hazardous Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Additional</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Information</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:Examples>"Must be stored away from flammable materials" "N.O.S. or a Waste Characteristics Code in conjunction with an EPA Waste Stream code"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Information</em>' containment reference.
	 * @see #setAdditionalInformation(AdditionalInformationType)
	 * @generated
	 */
	public AdditionalInformationType getAdditionalInformation() {
		return (additionalInformation == null) ? new AdditionalInformationType()
				: additionalInformation;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousItemType#getAdditionalInformation <em>Additional Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Information</em>' containment reference.
	 * @see #getAdditionalInformation()
	 * @generated
	 */
	public void setAdditionalInformation(
			AdditionalInformationType newAdditionalInformation) {
		additionalInformation = newAdditionalInformation;
	}

	/**
	 * Returns the value of the '<em><b>UNDG Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Hazardous Item. UNDG Code. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier assigned to transportable hazardous goods within the United Nations; expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Hazardous Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>UNDG Code</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>UN Code</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UNDG Code</em>' containment reference.
	 * @see #setUNDGCode(UNDGCodeType)
	 * @generated
	 */
	public UNDGCodeType getUNDGCode() {
		return (uNDGCode == null) ? new UNDGCodeType() : uNDGCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousItemType#getUNDGCode <em>UNDG Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UNDG Code</em>' containment reference.
	 * @see #getUNDGCode()
	 * @generated
	 */
	public void setUNDGCode(UNDGCodeType newUNDGCode) {
		uNDGCode = newUNDGCode;
	}

	/**
	 * Returns the value of the '<em><b>Emergency Procedures Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Hazardous Item. Emergency Procedures. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The emergency procedures for the hazardous Item expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Hazardous Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Emergency Procedures</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>EMG code, EMS Page Number</ccts:AlternativeBusinessTerms>
	 * 
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Emergency Procedures Code</em>' containment reference.
	 * @see #setEmergencyProceduresCode(EmergencyProceduresCodeType)
	 * @generated
	 */
	public EmergencyProceduresCodeType getEmergencyProceduresCode() {
		return (emergencyProceduresCode == null) ? new EmergencyProceduresCodeType()
				: emergencyProceduresCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousItemType#getEmergencyProceduresCode <em>Emergency Procedures Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emergency Procedures Code</em>' containment reference.
	 * @see #getEmergencyProceduresCode()
	 * @generated
	 */
	public void setEmergencyProceduresCode(
			EmergencyProceduresCodeType newEmergencyProceduresCode) {
		emergencyProceduresCode = newEmergencyProceduresCode;
	}

	/**
	 * Returns the value of the '<em><b>Medical First Aid Guide Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Hazardous Item. Medical First Aid Guide. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier of a medical first aid guide that is relevant to specific hazardous goods; expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Hazardous Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Medical First Aid Guide</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>MFAG page number</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medical First Aid Guide Code</em>' containment reference.
	 * @see #setMedicalFirstAidGuideCode(MedicalFirstAidGuideCodeType)
	 * @generated
	 */
	public MedicalFirstAidGuideCodeType getMedicalFirstAidGuideCode() {
		return (medicalFirstAidGuideCode == null) ? new MedicalFirstAidGuideCodeType()
				: medicalFirstAidGuideCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousItemType#getMedicalFirstAidGuideCode <em>Medical First Aid Guide Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medical First Aid Guide Code</em>' containment reference.
	 * @see #getMedicalFirstAidGuideCode()
	 * @generated
	 */
	public void setMedicalFirstAidGuideCode(
			MedicalFirstAidGuideCodeType newMedicalFirstAidGuideCode) {
		medicalFirstAidGuideCode = newMedicalFirstAidGuideCode;
	}

	/**
	 * Returns the value of the '<em><b>Technical Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Hazardous Item. Technical Name. Name</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The full technical name of the specific hazardous substance</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Hazardous Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Technical Name</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Name</ccts:RepresentationTerm>
	 *               <ccts:DataType>Name. Type</ccts:DataType>
	 *               <ccts:Examples>"Granular Sodium Chlorate WeedKiller"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Technical Name</em>' containment reference.
	 * @see #setTechnicalName(TechnicalNameType)
	 * @generated
	 */
	public TechnicalNameType getTechnicalName() {
		return (technicalName == null) ? new TechnicalNameType()
				: technicalName;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousItemType#getTechnicalName <em>Technical Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technical Name</em>' containment reference.
	 * @see #getTechnicalName()
	 * @generated
	 */
	public void setTechnicalName(TechnicalNameType newTechnicalName) {
		technicalName = newTechnicalName;
	}

	/**
	 * Returns the value of the '<em><b>Category Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Hazardous Item. Category Name. Name</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Name of a kind of hazard for a material.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Hazardous Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Category Name</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Name</ccts:RepresentationTerm>
	 *               <ccts:DataType>Name. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category Name</em>' containment reference.
	 * @see #setCategoryName(CategoryNameType)
	 * @generated
	 */
	public CategoryNameType getCategoryName() {
		return (categoryName == null) ? new CategoryNameType() : categoryName;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousItemType#getCategoryName <em>Category Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category Name</em>' containment reference.
	 * @see #getCategoryName()
	 * @generated
	 */
	public void setCategoryName(CategoryNameType newCategoryName) {
		categoryName = newCategoryName;
	}

	/**
	 * Returns the value of the '<em><b>Category Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Hazardous Item. Category Code. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Code specifying a kind of hazard for a material.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Hazardous Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Category Code</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Hazardous material class code</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category Code</em>' containment reference.
	 * @see #setCategoryCode(CategoryCodeType)
	 * @generated
	 */
	public CategoryCodeType getCategoryCode() {
		return (categoryCode == null) ? new CategoryCodeType() : categoryCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousItemType#getCategoryCode <em>Category Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category Code</em>' containment reference.
	 * @see #getCategoryCode()
	 * @generated
	 */
	public void setCategoryCode(CategoryCodeType newCategoryCode) {
		categoryCode = newCategoryCode;
	}

	/**
	 * Returns the value of the '<em><b>Upper Orange Hazard Placard ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Hazardous Item. Upper_ Orange Hazard Placard Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>To specify the identity number for the upper part of the orange hazard placard required on the means of transport.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Hazardous Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Upper</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Orange Hazard Placard Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Hazard identification number (upper part)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper Orange Hazard Placard ID</em>' containment reference.
	 * @see #setUpperOrangeHazardPlacardID(UpperOrangeHazardPlacardIDType)
	 * @generated
	 */
	public UpperOrangeHazardPlacardIDType getUpperOrangeHazardPlacardID() {
		return (upperOrangeHazardPlacardID == null) ? new UpperOrangeHazardPlacardIDType()
				: upperOrangeHazardPlacardID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousItemType#getUpperOrangeHazardPlacardID <em>Upper Orange Hazard Placard ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Orange Hazard Placard ID</em>' containment reference.
	 * @see #getUpperOrangeHazardPlacardID()
	 * @generated
	 */
	public void setUpperOrangeHazardPlacardID(
			UpperOrangeHazardPlacardIDType newUpperOrangeHazardPlacardID) {
		upperOrangeHazardPlacardID = newUpperOrangeHazardPlacardID;
	}

	/**
	 * Returns the value of the '<em><b>Lower Orange Hazard Placard ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Hazardous Item. Lower_ Orange Hazard Placard Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>To specify the identity number for the lower part of the orange hazard placard required on the means of transport.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Hazardous Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Lower</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Orange Hazard Placard Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Substance identification number (lower part)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower Orange Hazard Placard ID</em>' containment reference.
	 * @see #setLowerOrangeHazardPlacardID(LowerOrangeHazardPlacardIDType)
	 * @generated
	 */
	public LowerOrangeHazardPlacardIDType getLowerOrangeHazardPlacardID() {
		return (lowerOrangeHazardPlacardID == null) ? new LowerOrangeHazardPlacardIDType()
				: lowerOrangeHazardPlacardID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousItemType#getLowerOrangeHazardPlacardID <em>Lower Orange Hazard Placard ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Orange Hazard Placard ID</em>' containment reference.
	 * @see #getLowerOrangeHazardPlacardID()
	 * @generated
	 */
	public void setLowerOrangeHazardPlacardID(
			LowerOrangeHazardPlacardIDType newLowerOrangeHazardPlacardID) {
		lowerOrangeHazardPlacardID = newLowerOrangeHazardPlacardID;
	}

	/**
	 * Returns the value of the '<em><b>Marking ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Hazardous Item. Marking. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>To identify the marking of dangerous goods.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Hazardous Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Marking</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Dangerous goods label marking</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Marking ID</em>' containment reference.
	 * @see #setMarkingID(MarkingIDType)
	 * @generated
	 */
	public MarkingIDType getMarkingID() {
		return (markingID == null) ? new MarkingIDType() : markingID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousItemType#getMarkingID <em>Marking ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marking ID</em>' containment reference.
	 * @see #getMarkingID()
	 * @generated
	 */
	public void setMarkingID(MarkingIDType newMarkingID) {
		markingID = newMarkingID;
	}

	/**
	 * Returns the value of the '<em><b>Hazard Class ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Hazardous Item. Hazard Class Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>To identify a hazard class applicable to dangerous goods as defined by the relevant regulation authority such as the IMDG Class Number of the SOLAS Convention of IMO and the ADR/RID Class Number for the road/rail environment.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Hazardous Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Hazard Class Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>IMDG Class Number, ADR/RID Class Number</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hazard Class ID</em>' containment reference.
	 * @see #setHazardClassID(HazardClassIDType)
	 * @generated
	 */
	public HazardClassIDType getHazardClassID() {
		return (hazardClassID == null) ? new HazardClassIDType()
				: hazardClassID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousItemType#getHazardClassID <em>Hazard Class ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hazard Class ID</em>' containment reference.
	 * @see #getHazardClassID()
	 * @generated
	 */
	public void setHazardClassID(HazardClassIDType newHazardClassID) {
		hazardClassID = newHazardClassID;
	}

	/**
	 * Returns the value of the '<em><b>Contact Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Hazardous Item. Contact_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>associates the hazardous item with details of an individual, a group or a body that is the contact in case of hazard incident.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Hazardous Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Contact</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Party</em>' containment reference.
	 * @see #setContactParty(PartyType)
	 * @generated
	 */
	public PartyType getContactParty() {
		return (contactParty == null) ? new PartyType() : contactParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousItemType#getContactParty <em>Contact Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Party</em>' containment reference.
	 * @see #getContactParty()
	 * @generated
	 */
	public void setContactParty(PartyType newContactParty) {
		contactParty = newContactParty;
	}

	/**
	 * Returns the value of the '<em><b>Secondary Hazard</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.SecondaryHazardType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Hazardous Item. Secondary Hazard</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>associates the hazardous item with information about secondary hazards.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Hazardous Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Secondary Hazard</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Secondary Hazard</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Secondary Hazard</em>' containment reference list.
	 * @generated
	 */
	public List getSecondaryHazard() {
		if (secondaryHazard == null) {
			secondaryHazard = new ArrayList<SecondaryHazardType>();
		}
		return secondaryHazard;
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
	 *               <ccts:DictionaryEntryName>Hazardous Item. Hazardous Goods Transit</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>associates the hazardous item with information about the transportation of hazardous goods.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Hazardous Item</ccts:ObjectClass>
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
	 * Returns the value of the '<em><b>Emergency Temperature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Hazardous Item. Emergency_ Temperature. Temperature</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>associates the hazardous item with the temperature at which emergency procedures apply during the handling of temperature-controlled hazardous goods.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Hazardous Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Emergency</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Temperature</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Temperature</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Emergency Temperature</em>' containment reference.
	 * @see #setEmergencyTemperature(TemperatureType)
	 * @generated
	 */
	public TemperatureType getEmergencyTemperature() {
		return (emergencyTemperature == null) ? new TemperatureType()
				: emergencyTemperature;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousItemType#getEmergencyTemperature <em>Emergency Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emergency Temperature</em>' containment reference.
	 * @see #getEmergencyTemperature()
	 * @generated
	 */
	public void setEmergencyTemperature(TemperatureType newEmergencyTemperature) {
		emergencyTemperature = newEmergencyTemperature;
	}

	/**
	 * Returns the value of the '<em><b>Flashpoint Temperature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Hazardous Item. Flashpoint_ Temperature. Temperature</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>associates the hazardous item with the lowest temperature at which the vapor of a combustible liquid can be made to ignite momentarily in air, known in hazardous goods procedures as the flashpoint.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Hazardous Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Flashpoint</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Temperature</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Temperature</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flashpoint Temperature</em>' containment reference.
	 * @see #setFlashpointTemperature(TemperatureType)
	 * @generated
	 */
	public TemperatureType getFlashpointTemperature() {
		return (flashpointTemperature == null) ? new TemperatureType()
				: flashpointTemperature;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousItemType#getFlashpointTemperature <em>Flashpoint Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flashpoint Temperature</em>' containment reference.
	 * @see #getFlashpointTemperature()
	 * @generated
	 */
	public void setFlashpointTemperature(
			TemperatureType newFlashpointTemperature) {
		flashpointTemperature = newFlashpointTemperature;
	}

	/**
	 * Returns the value of the '<em><b>Additional Temperature</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.TemperatureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Hazardous Item. Additional_ Temperature. Temperature</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>information providing details of temperatures relevant to the handling of hazardous goods.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Hazardous Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Additional</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Temperature</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Temperature</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Temperature</em>' containment reference list.
	 * @generated
	 */
	public List getAdditionalTemperature() {
		if (additionalTemperature == null) {
			additionalTemperature = new ArrayList<
					TemperatureType>();
		}
		return additionalTemperature;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.additionalInformation == null) ? 0 : this.additionalInformation.hashCode());
		result = PRIME * result + ((this.additionalTemperature == null) ? 0 : this.additionalTemperature.hashCode());
		result = PRIME * result + ((this.categoryCode == null) ? 0 : this.categoryCode.hashCode());
		result = PRIME * result + ((this.categoryName == null) ? 0 : this.categoryName.hashCode());
		result = PRIME * result + ((this.contactParty == null) ? 0 : this.contactParty.hashCode());
		result = PRIME * result + ((this.emergencyProceduresCode == null) ? 0 : this.emergencyProceduresCode.hashCode());
		result = PRIME * result + ((this.emergencyTemperature == null) ? 0 : this.emergencyTemperature.hashCode());
		result = PRIME * result + ((this.flashpointTemperature == null) ? 0 : this.flashpointTemperature.hashCode());
		result = PRIME * result + ((this.hazardClassID == null) ? 0 : this.hazardClassID.hashCode());
		result = PRIME * result + ((this.hazardousGoodsTransit == null) ? 0 : this.hazardousGoodsTransit.hashCode());
		result = PRIME * result + ((this.iD == null) ? 0 : this.iD.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.lowerOrangeHazardPlacardID == null) ? 0 : this.lowerOrangeHazardPlacardID.hashCode());
		result = PRIME * result + ((this.markingID == null) ? 0 : this.markingID.hashCode());
		result = PRIME * result + ((this.medicalFirstAidGuideCode == null) ? 0 : this.medicalFirstAidGuideCode.hashCode());
		result = PRIME * result + ((this.placardEndorsement == null) ? 0 : this.placardEndorsement.hashCode());
		result = PRIME * result + ((this.placardNotation == null) ? 0 : this.placardNotation.hashCode());
		result = PRIME * result + ((this.secondaryHazard == null) ? 0 : this.secondaryHazard.hashCode());
		result = PRIME * result + ((this.technicalName == null) ? 0 : this.technicalName.hashCode());
		result = PRIME * result + ((this.uNDGCode == null) ? 0 : this.uNDGCode.hashCode());
		result = PRIME * result + ((this.upperOrangeHazardPlacardID == null) ? 0 : this.upperOrangeHazardPlacardID.hashCode());
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
		final HazardousItemType other = (HazardousItemType) obj;
		if (this.additionalInformation == null) {
			if (other.additionalInformation != null)
				return false;
		} else if (!this.additionalInformation.equals(other.additionalInformation))
			return false;
		if (this.additionalTemperature == null) {
			if (other.additionalTemperature != null)
				return false;
		} else if (!this.additionalTemperature.equals(other.additionalTemperature))
			return false;
		if (this.categoryCode == null) {
			if (other.categoryCode != null)
				return false;
		} else if (!this.categoryCode.equals(other.categoryCode))
			return false;
		if (this.categoryName == null) {
			if (other.categoryName != null)
				return false;
		} else if (!this.categoryName.equals(other.categoryName))
			return false;
		if (this.contactParty == null) {
			if (other.contactParty != null)
				return false;
		} else if (!this.contactParty.equals(other.contactParty))
			return false;
		if (this.emergencyProceduresCode == null) {
			if (other.emergencyProceduresCode != null)
				return false;
		} else if (!this.emergencyProceduresCode.equals(other.emergencyProceduresCode))
			return false;
		if (this.emergencyTemperature == null) {
			if (other.emergencyTemperature != null)
				return false;
		} else if (!this.emergencyTemperature.equals(other.emergencyTemperature))
			return false;
		if (this.flashpointTemperature == null) {
			if (other.flashpointTemperature != null)
				return false;
		} else if (!this.flashpointTemperature.equals(other.flashpointTemperature))
			return false;
		if (this.hazardClassID == null) {
			if (other.hazardClassID != null)
				return false;
		} else if (!this.hazardClassID.equals(other.hazardClassID))
			return false;
		if (this.hazardousGoodsTransit == null) {
			if (other.hazardousGoodsTransit != null)
				return false;
		} else if (!this.hazardousGoodsTransit.equals(other.hazardousGoodsTransit))
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
		if (this.lowerOrangeHazardPlacardID == null) {
			if (other.lowerOrangeHazardPlacardID != null)
				return false;
		} else if (!this.lowerOrangeHazardPlacardID.equals(other.lowerOrangeHazardPlacardID))
			return false;
		if (this.markingID == null) {
			if (other.markingID != null)
				return false;
		} else if (!this.markingID.equals(other.markingID))
			return false;
		if (this.medicalFirstAidGuideCode == null) {
			if (other.medicalFirstAidGuideCode != null)
				return false;
		} else if (!this.medicalFirstAidGuideCode.equals(other.medicalFirstAidGuideCode))
			return false;
		if (this.placardEndorsement == null) {
			if (other.placardEndorsement != null)
				return false;
		} else if (!this.placardEndorsement.equals(other.placardEndorsement))
			return false;
		if (this.placardNotation == null) {
			if (other.placardNotation != null)
				return false;
		} else if (!this.placardNotation.equals(other.placardNotation))
			return false;
		if (this.secondaryHazard == null) {
			if (other.secondaryHazard != null)
				return false;
		} else if (!this.secondaryHazard.equals(other.secondaryHazard))
			return false;
		if (this.technicalName == null) {
			if (other.technicalName != null)
				return false;
		} else if (!this.technicalName.equals(other.technicalName))
			return false;
		if (this.uNDGCode == null) {
			if (other.uNDGCode != null)
				return false;
		} else if (!this.uNDGCode.equals(other.uNDGCode))
			return false;
		if (this.upperOrangeHazardPlacardID == null) {
			if (other.upperOrangeHazardPlacardID != null)
				return false;
		} else if (!this.upperOrangeHazardPlacardID.equals(other.upperOrangeHazardPlacardID))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // HazardousItemType