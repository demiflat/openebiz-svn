/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import java.util.List;

import org.openebiz.core.common.cbc.DirectionCodeType;
import org.openebiz.core.common.cbc.JourneyIDType;
import org.openebiz.core.common.cbc.RegistrationNationalityIDType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transport Means Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Transport Means. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>The particular vehicle used for the transport of goods or persons.</ccts:Definition>
 *           <ccts:ObjectClass>Transport Means</ccts:ObjectClass>
 *           <ccts:AlternativeBusinessTerms>Conveyance</ccts:AlternativeBusinessTerms>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.TransportMeansType#getJourneyID <em>Journey ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportMeansType#getRegistrationNationalityID <em>Registration Nationality ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportMeansType#getRegistrationNationality <em>Registration Nationality</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportMeansType#getDirectionCode <em>Direction Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportMeansType#getStowage <em>Stowage</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportMeansType#getAirTransport <em>Air Transport</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportMeansType#getRoadTransport <em>Road Transport</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportMeansType#getRailTransport <em>Rail Transport</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportMeansType#getMaritimeTransport <em>Maritime Transport</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportMeansType#getOwnerParty <em>Owner Party</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface TransportMeansType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Journey ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Means. Journey Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An identifier assigned to a regularly scheduled service of a means of transport.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Means</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Journey Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Voyage Number, Scheduled Conveyance Identifier (WCO ID 205), Flight Number</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Journey ID</em>' containment reference.
	 * @see #setJourneyID(JourneyIDType)
	 */
	JourneyIDType getJourneyID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportMeansType#getJourneyID <em>Journey ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journey ID</em>' containment reference.
	 * @see #getJourneyID()
	 */
	void setJourneyID(JourneyIDType value);

	/**
	 * Returns the value of the '<em><b>Registration Nationality ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Means. Registration_ Nationality Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Formal identification of the country in which a means of transport is registered.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Means</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Registration</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Nationality Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Nationality of Means of Transport (WCO 175, 178 and 179)</ccts:AlternativeBusinessTerms>
	 *               <ccts:Examples>"LIB"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Registration Nationality ID</em>' containment reference.
	 * @see #setRegistrationNationalityID(RegistrationNationalityIDType)
	 */
	RegistrationNationalityIDType getRegistrationNationalityID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportMeansType#getRegistrationNationalityID <em>Registration Nationality ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registration Nationality ID</em>' containment reference.
	 * @see #getRegistrationNationalityID()
	 */
	void setRegistrationNationalityID(RegistrationNationalityIDType value);

	/**
	 * Returns the value of the '<em><b>Registration Nationality</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cbc.RegistrationNationalityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Means. Registration_ Nationality. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Name of the country in which a means of transport is registered.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Means</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Registration</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Nationality</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Flag of Vessel, Nationality of Ship</ccts:AlternativeBusinessTerms>
	 *               <ccts:Examples>Liberia</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Registration Nationality</em>' containment reference list.
	 */
	List getRegistrationNationality();

	/**
	 * Returns the value of the '<em><b>Direction Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Means. Direction. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The direction of the transport means</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Means</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Direction</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Transit Direction</ccts:AlternativeBusinessTerms>
	 *               <ccts:Examples>"North","East"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direction Code</em>' containment reference.
	 * @see #setDirectionCode(DirectionCodeType)
	 */
	DirectionCodeType getDirectionCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportMeansType#getDirectionCode <em>Direction Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction Code</em>' containment reference.
	 * @see #getDirectionCode()
	 */
	void setDirectionCode(DirectionCodeType value);

	/**
	 * Returns the value of the '<em><b>Stowage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Means. Stowage</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Association to a location on board a means of transport where specified goods or transport equipment have been or are to be stowed.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Means</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Stowage</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Stowage</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stowage</em>' containment reference.
	 * @see #setStowage(StowageType)
	 */
	StowageType getStowage();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportMeansType#getStowage <em>Stowage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stowage</em>' containment reference.
	 * @see #getStowage()
	 */
	void setStowage(StowageType value);

	/**
	 * Returns the value of the '<em><b>Air Transport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Means. Air Transport</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Association to identify an aircraft</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Means</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Air Transport</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Air Transport</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Air Transport</em>' containment reference.
	 * @see #setAirTransport(AirTransportType)
	 */
	AirTransportType getAirTransport();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportMeansType#getAirTransport <em>Air Transport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Air Transport</em>' containment reference.
	 * @see #getAirTransport()
	 */
	void setAirTransport(AirTransportType value);

	/**
	 * Returns the value of the '<em><b>Road Transport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Means. Road Transport</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Association to identify a road vehicle</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Means</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Road Transport</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Road Transport</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Road Transport</em>' containment reference.
	 * @see #setRoadTransport(RoadTransportType)
	 */
	RoadTransportType getRoadTransport();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportMeansType#getRoadTransport <em>Road Transport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Road Transport</em>' containment reference.
	 * @see #getRoadTransport()
	 */
	void setRoadTransport(RoadTransportType value);

	/**
	 * Returns the value of the '<em><b>Rail Transport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Means. Rail Transport</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Association to identify a train</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Means</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Rail Transport</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Rail Transport</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rail Transport</em>' containment reference.
	 * @see #setRailTransport(RailTransportType)
	 */
	RailTransportType getRailTransport();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportMeansType#getRailTransport <em>Rail Transport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rail Transport</em>' containment reference.
	 * @see #getRailTransport()
	 */
	void setRailTransport(RailTransportType value);

	/**
	 * Returns the value of the '<em><b>Maritime Transport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Means. Maritime Transport</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Association to identify a ship</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Means</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Maritime Transport</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Maritime Transport</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maritime Transport</em>' containment reference.
	 * @see #setMaritimeTransport(MaritimeTransportType)
	 */
	MaritimeTransportType getMaritimeTransport();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportMeansType#getMaritimeTransport <em>Maritime Transport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maritime Transport</em>' containment reference.
	 * @see #getMaritimeTransport()
	 */
	void setMaritimeTransport(MaritimeTransportType value);

	/**
	 * Returns the value of the '<em><b>Owner Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Means. Owner_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Association to the party owning the means of transport</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Means</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Owner</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owner Party</em>' containment reference.
	 * @see #setOwnerParty(PartyType)
	 */
	PartyType getOwnerParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportMeansType#getOwnerParty <em>Owner Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Party</em>' containment reference.
	 * @see #getOwnerParty()
	 */
	void setOwnerParty(PartyType value);

} // TransportMeansType