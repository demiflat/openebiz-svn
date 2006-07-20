/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.InhalationToxicityZoneCodeType;
import org.openebiz.core.common.cbc.PackingCriteriaCodeType;
import org.openebiz.core.common.cbc.RegulationCodeType;
import org.openebiz.core.common.cbc.TransportAuthorizationCodeType;
import org.openebiz.core.common.cbc.TransportEmergencyCardCodeType;

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
 */
public interface HazardousGoodsTransitType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

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
	 */
	TransportEmergencyCardCodeType getTransportEmergencyCardCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousGoodsTransitType#getTransportEmergencyCardCode <em>Transport Emergency Card Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Emergency Card Code</em>' containment reference.
	 * @see #getTransportEmergencyCardCode()
	 */
	void setTransportEmergencyCardCode(TransportEmergencyCardCodeType value);

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
	 */
	PackingCriteriaCodeType getPackingCriteriaCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousGoodsTransitType#getPackingCriteriaCode <em>Packing Criteria Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packing Criteria Code</em>' containment reference.
	 * @see #getPackingCriteriaCode()
	 */
	void setPackingCriteriaCode(PackingCriteriaCodeType value);

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
	 */
	RegulationCodeType getRegulationCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousGoodsTransitType#getRegulationCode <em>Regulation Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulation Code</em>' containment reference.
	 * @see #getRegulationCode()
	 */
	void setRegulationCode(RegulationCodeType value);

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
	 */
	InhalationToxicityZoneCodeType getInhalationToxicityZoneCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousGoodsTransitType#getInhalationToxicityZoneCode <em>Inhalation Toxicity Zone Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inhalation Toxicity Zone Code</em>' containment reference.
	 * @see #getInhalationToxicityZoneCode()
	 */
	void setInhalationToxicityZoneCode(InhalationToxicityZoneCodeType value);

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
	 */
	TransportAuthorizationCodeType getTransportAuthorizationCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousGoodsTransitType#getTransportAuthorizationCode <em>Transport Authorization Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Authorization Code</em>' containment reference.
	 * @see #getTransportAuthorizationCode()
	 */
	void setTransportAuthorizationCode(TransportAuthorizationCodeType value);

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
	 */
	TemperatureType getMaximumTemperature();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousGoodsTransitType#getMaximumTemperature <em>Maximum Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Temperature</em>' containment reference.
	 * @see #getMaximumTemperature()
	 */
	void setMaximumTemperature(TemperatureType value);

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
	 */
	TemperatureType getMinimumTemperature();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.HazardousGoodsTransitType#getMinimumTemperature <em>Minimum Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Temperature</em>' containment reference.
	 * @see #getMinimumTemperature()
	 */
	void setMinimumTemperature(TemperatureType value);

} // HazardousGoodsTransitType