/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.EmergencyProceduresCodeType;
import org.openebiz.core.common.cbc.ExtensionType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.PlacardEndorsementType;
import org.openebiz.core.common.cbc.PlacardNotationType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Secondary Hazard Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Secondary Hazard. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about Secondary Hazard (related to a Hazardous Item)</ccts:Definition>
 *           <ccts:ObjectClass>Secondary Hazard</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.SecondaryHazardType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.SecondaryHazardType#getPlacardNotation <em>Placard Notation</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.SecondaryHazardType#getPlacardEndorsement <em>Placard Endorsement</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.SecondaryHazardType#getEmergencyProceduresCode <em>Emergency Procedures Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.SecondaryHazardType#getExtension <em>Extension</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface SecondaryHazardType {
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
	 *               <ccts:DictionaryEntryName>Secondary Hazard. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the Secondary Hazard</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Secondary Hazard</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SecondaryHazardType#getID <em>ID</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Secondary Hazard. Placard Notation. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The placard notation corresponding to the hazard class of the hazardous commodity. Can also be the hazard identification number of the orange placard (upper part) required on the means of transport</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Secondary Hazard</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SecondaryHazardType#getPlacardNotation <em>Placard Notation</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Secondary Hazard. Placard Endorsement. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The placard endorsement that is to be shown on the shipping papers for the hazardous commodity. Can also be used for the number of the orange placard (lower part) required on the means of transport</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Secondary Hazard</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SecondaryHazardType#getPlacardEndorsement <em>Placard Endorsement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placard Endorsement</em>' containment reference.
	 * @see #getPlacardEndorsement()
	 */
	void setPlacardEndorsement(PlacardEndorsementType value);

	/**
	 * Returns the value of the '<em><b>Emergency Procedures Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Secondary Hazard. Emergency Procedures Code. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Emergency procedures for hazardous goods expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Secondary Hazard</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Emergency Procedures Code</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>EMG code, EMS Page Number</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Emergency Procedures Code</em>' containment reference.
	 * @see #setEmergencyProceduresCode(EmergencyProceduresCodeType)
	 */
	EmergencyProceduresCodeType getEmergencyProceduresCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SecondaryHazardType#getEmergencyProceduresCode <em>Emergency Procedures Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emergency Procedures Code</em>' containment reference.
	 * @see #getEmergencyProceduresCode()
	 */
	void setEmergencyProceduresCode(EmergencyProceduresCodeType value);

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Secondary Hazard. Extension. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Additional information about the hazardous substance. Can be used to specify information such as the type of regulatory requirements that apply to a description</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Secondary Hazard</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Extension</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:Examples>"N.O.S. or a Waste Characteristics Code in conjunction with an EPA Waste Stream code"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extension</em>' containment reference.
	 * @see #setExtension(ExtensionType)
	 */
	ExtensionType getExtension();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SecondaryHazardType#getExtension <em>Extension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' containment reference.
	 * @see #getExtension()
	 */
	void setExtension(ExtensionType value);

} // SecondaryHazardType