/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import java.util.List;

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
 */
public interface HazardousItemType {
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
	 */
	IDType getID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousItemType#getID <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' containment reference.
	 * @see #getID()
	 */
	void setID(IDType value);

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
	 */
	PlacardNotationType getPlacardNotation();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousItemType#getPlacardNotation <em>Placard Notation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placard Notation</em>' containment reference.
	 * @see #getPlacardNotation()
	 */
	void setPlacardNotation(PlacardNotationType value);

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
	 */
	PlacardEndorsementType getPlacardEndorsement();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousItemType#getPlacardEndorsement <em>Placard Endorsement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placard Endorsement</em>' containment reference.
	 * @see #getPlacardEndorsement()
	 */
	void setPlacardEndorsement(PlacardEndorsementType value);

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
	 */
	AdditionalInformationType getAdditionalInformation();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousItemType#getAdditionalInformation <em>Additional Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Information</em>' containment reference.
	 * @see #getAdditionalInformation()
	 */
	void setAdditionalInformation(AdditionalInformationType value);

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
	 */
	UNDGCodeType getUNDGCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousItemType#getUNDGCode <em>UNDG Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UNDG Code</em>' containment reference.
	 * @see #getUNDGCode()
	 */
	void setUNDGCode(UNDGCodeType value);

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
	 */
	EmergencyProceduresCodeType getEmergencyProceduresCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousItemType#getEmergencyProceduresCode <em>Emergency Procedures Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emergency Procedures Code</em>' containment reference.
	 * @see #getEmergencyProceduresCode()
	 */
	void setEmergencyProceduresCode(EmergencyProceduresCodeType value);

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
	 */
	MedicalFirstAidGuideCodeType getMedicalFirstAidGuideCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousItemType#getMedicalFirstAidGuideCode <em>Medical First Aid Guide Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medical First Aid Guide Code</em>' containment reference.
	 * @see #getMedicalFirstAidGuideCode()
	 */
	void setMedicalFirstAidGuideCode(MedicalFirstAidGuideCodeType value);

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
	 */
	TechnicalNameType getTechnicalName();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousItemType#getTechnicalName <em>Technical Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technical Name</em>' containment reference.
	 * @see #getTechnicalName()
	 */
	void setTechnicalName(TechnicalNameType value);

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
	 */
	CategoryNameType getCategoryName();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousItemType#getCategoryName <em>Category Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category Name</em>' containment reference.
	 * @see #getCategoryName()
	 */
	void setCategoryName(CategoryNameType value);

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
	 */
	CategoryCodeType getCategoryCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousItemType#getCategoryCode <em>Category Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category Code</em>' containment reference.
	 * @see #getCategoryCode()
	 */
	void setCategoryCode(CategoryCodeType value);

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
	 */
	UpperOrangeHazardPlacardIDType getUpperOrangeHazardPlacardID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousItemType#getUpperOrangeHazardPlacardID <em>Upper Orange Hazard Placard ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Orange Hazard Placard ID</em>' containment reference.
	 * @see #getUpperOrangeHazardPlacardID()
	 */
	void setUpperOrangeHazardPlacardID(UpperOrangeHazardPlacardIDType value);

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
	 */
	LowerOrangeHazardPlacardIDType getLowerOrangeHazardPlacardID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousItemType#getLowerOrangeHazardPlacardID <em>Lower Orange Hazard Placard ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Orange Hazard Placard ID</em>' containment reference.
	 * @see #getLowerOrangeHazardPlacardID()
	 */
	void setLowerOrangeHazardPlacardID(LowerOrangeHazardPlacardIDType value);

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
	 */
	MarkingIDType getMarkingID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousItemType#getMarkingID <em>Marking ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marking ID</em>' containment reference.
	 * @see #getMarkingID()
	 */
	void setMarkingID(MarkingIDType value);

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
	 */
	HazardClassIDType getHazardClassID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousItemType#getHazardClassID <em>Hazard Class ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hazard Class ID</em>' containment reference.
	 * @see #getHazardClassID()
	 */
	void setHazardClassID(HazardClassIDType value);

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
	 */
	PartyType getContactParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousItemType#getContactParty <em>Contact Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Party</em>' containment reference.
	 * @see #getContactParty()
	 */
	void setContactParty(PartyType value);

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
	 */
	List getSecondaryHazard();

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
	 */
	List getHazardousGoodsTransit();

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
	 */
	TemperatureType getEmergencyTemperature();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousItemType#getEmergencyTemperature <em>Emergency Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emergency Temperature</em>' containment reference.
	 * @see #getEmergencyTemperature()
	 */
	void setEmergencyTemperature(TemperatureType value);

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
	 */
	TemperatureType getFlashpointTemperature();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousItemType#getFlashpointTemperature <em>Flashpoint Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flashpoint Temperature</em>' containment reference.
	 * @see #getFlashpointTemperature()
	 */
	void setFlashpointTemperature(TemperatureType value);

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
	 */
	List getAdditionalTemperature();

} // HazardousItemType