/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.DirectionCodeType;
import org.openebiz.core.common.cbc.JourneyIDType;
import org.openebiz.core.common.cbc.RegistrationNationalityIDType;
import org.openebiz.core.common.cbc.RegistrationNationalityType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

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
 * @generated
 */
public class TransportMeansType implements Serializable {
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
	 * The cached value of the '{@link #getJourneyID() <em>Journey ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJourneyID()
	 * @generated
	 * @ordered
	 */
	protected JourneyIDType journeyID = null;

	/**
	 * The cached value of the '{@link #getRegistrationNationalityID() <em>Registration Nationality ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrationNationalityID()
	 * @generated
	 * @ordered
	 */
	protected RegistrationNationalityIDType registrationNationalityID = null;

	/**
	 * The cached value of the '{@link #getRegistrationNationality() <em>Registration Nationality</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrationNationality()
	 * @generated
	 * @ordered
	 */
	protected List registrationNationality = null;

	/**
	 * The cached value of the '{@link #getDirectionCode() <em>Direction Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionCode()
	 * @generated
	 * @ordered
	 */
	protected DirectionCodeType directionCode = null;

	/**
	 * The cached value of the '{@link #getStowage() <em>Stowage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStowage()
	 * @generated
	 * @ordered
	 */
	protected StowageType stowage = null;

	/**
	 * The cached value of the '{@link #getAirTransport() <em>Air Transport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirTransport()
	 * @generated
	 * @ordered
	 */
	protected AirTransportType airTransport = null;

	/**
	 * The cached value of the '{@link #getRoadTransport() <em>Road Transport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoadTransport()
	 * @generated
	 * @ordered
	 */
	protected RoadTransportType roadTransport = null;

	/**
	 * The cached value of the '{@link #getRailTransport() <em>Rail Transport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRailTransport()
	 * @generated
	 * @ordered
	 */
	protected RailTransportType railTransport = null;

	/**
	 * The cached value of the '{@link #getMaritimeTransport() <em>Maritime Transport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaritimeTransport()
	 * @generated
	 * @ordered
	 */
	protected MaritimeTransportType maritimeTransport = null;

	/**
	 * The cached value of the '{@link #getOwnerParty() <em>Owner Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerParty()
	 * @generated
	 * @ordered
	 */
	protected PartyType ownerParty = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public TransportMeansType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.journeyID = this.getJourneyID();
		this.registrationNationalityID = this.getRegistrationNationalityID();
		this.registrationNationality = this.getRegistrationNationality();
		this.directionCode = this.getDirectionCode();
		this.stowage = this.getStowage();
		this.airTransport = this.getAirTransport();
		this.roadTransport = this.getRoadTransport();
		this.railTransport = this.getRailTransport();
		this.maritimeTransport = this.getMaritimeTransport();
		this.ownerParty = this.getOwnerParty();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getJourneyID().getValue());
		return sdisplay.toString();
	}

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
	 * @generated
	 */
	public JourneyIDType getJourneyID() {
		return (journeyID == null) ? new JourneyIDType() : journeyID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportMeansType#getJourneyID <em>Journey ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journey ID</em>' containment reference.
	 * @see #getJourneyID()
	 * @generated
	 */
	public void setJourneyID(JourneyIDType newJourneyID) {
		journeyID = newJourneyID;
	}

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
	 * @generated
	 */
	public RegistrationNationalityIDType getRegistrationNationalityID() {
		return (registrationNationalityID == null) ? new RegistrationNationalityIDType()
				: registrationNationalityID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportMeansType#getRegistrationNationalityID <em>Registration Nationality ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registration Nationality ID</em>' containment reference.
	 * @see #getRegistrationNationalityID()
	 * @generated
	 */
	public void setRegistrationNationalityID(
			RegistrationNationalityIDType newRegistrationNationalityID) {
		registrationNationalityID = newRegistrationNationalityID;
	}

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
	 * @generated
	 */
	public List getRegistrationNationality() {
		if (registrationNationality == null) {
			registrationNationality = new ArrayList<
					RegistrationNationalityType>();
		}
		return registrationNationality;
	}

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
	 * @generated
	 */
	public DirectionCodeType getDirectionCode() {
		return (directionCode == null) ? new DirectionCodeType()
				: directionCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportMeansType#getDirectionCode <em>Direction Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction Code</em>' containment reference.
	 * @see #getDirectionCode()
	 * @generated
	 */
	public void setDirectionCode(DirectionCodeType newDirectionCode) {
		directionCode = newDirectionCode;
	}

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
	 * @generated
	 */
	public StowageType getStowage() {
		return (stowage == null) ? new StowageType() : stowage;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportMeansType#getStowage <em>Stowage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stowage</em>' containment reference.
	 * @see #getStowage()
	 * @generated
	 */
	public void setStowage(StowageType newStowage) {
		stowage = newStowage;
	}

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
	 * @generated
	 */
	public AirTransportType getAirTransport() {
		return (airTransport == null) ? new AirTransportType() : airTransport;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportMeansType#getAirTransport <em>Air Transport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Air Transport</em>' containment reference.
	 * @see #getAirTransport()
	 * @generated
	 */
	public void setAirTransport(AirTransportType newAirTransport) {
		airTransport = newAirTransport;
	}

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
	 * @generated
	 */
	public RoadTransportType getRoadTransport() {
		return (roadTransport == null) ? new RoadTransportType()
				: roadTransport;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportMeansType#getRoadTransport <em>Road Transport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Road Transport</em>' containment reference.
	 * @see #getRoadTransport()
	 * @generated
	 */
	public void setRoadTransport(RoadTransportType newRoadTransport) {
		roadTransport = newRoadTransport;
	}

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
	 * @generated
	 */
	public RailTransportType getRailTransport() {
		return (railTransport == null) ? new RailTransportType()
				: railTransport;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportMeansType#getRailTransport <em>Rail Transport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rail Transport</em>' containment reference.
	 * @see #getRailTransport()
	 * @generated
	 */
	public void setRailTransport(RailTransportType newRailTransport) {
		railTransport = newRailTransport;
	}

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
	 * @generated
	 */
	public MaritimeTransportType getMaritimeTransport() {
		return (maritimeTransport == null) ? new MaritimeTransportType()
				: maritimeTransport;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportMeansType#getMaritimeTransport <em>Maritime Transport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maritime Transport</em>' containment reference.
	 * @see #getMaritimeTransport()
	 * @generated
	 */
	public void setMaritimeTransport(MaritimeTransportType newMaritimeTransport) {
		maritimeTransport = newMaritimeTransport;
	}

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
	 * @generated
	 */
	public PartyType getOwnerParty() {
		return (ownerParty == null) ? new PartyType() : ownerParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportMeansType#getOwnerParty <em>Owner Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Party</em>' containment reference.
	 * @see #getOwnerParty()
	 * @generated
	 */
	public void setOwnerParty(PartyType newOwnerParty) {
		ownerParty = newOwnerParty;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.airTransport == null) ? 0 : this.airTransport.hashCode());
		result = PRIME * result + ((this.directionCode == null) ? 0 : this.directionCode.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.journeyID == null) ? 0 : this.journeyID.hashCode());
		result = PRIME * result + ((this.maritimeTransport == null) ? 0 : this.maritimeTransport.hashCode());
		result = PRIME * result + ((this.ownerParty == null) ? 0 : this.ownerParty.hashCode());
		result = PRIME * result + ((this.railTransport == null) ? 0 : this.railTransport.hashCode());
		result = PRIME * result + ((this.registrationNationality == null) ? 0 : this.registrationNationality.hashCode());
		result = PRIME * result + ((this.registrationNationalityID == null) ? 0 : this.registrationNationalityID.hashCode());
		result = PRIME * result + ((this.roadTransport == null) ? 0 : this.roadTransport.hashCode());
		result = PRIME * result + ((this.stowage == null) ? 0 : this.stowage.hashCode());
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
		final TransportMeansType other = (TransportMeansType) obj;
		if (this.airTransport == null) {
			if (other.airTransport != null)
				return false;
		} else if (!this.airTransport.equals(other.airTransport))
			return false;
		if (this.directionCode == null) {
			if (other.directionCode != null)
				return false;
		} else if (!this.directionCode.equals(other.directionCode))
			return false;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.journeyID == null) {
			if (other.journeyID != null)
				return false;
		} else if (!this.journeyID.equals(other.journeyID))
			return false;
		if (this.maritimeTransport == null) {
			if (other.maritimeTransport != null)
				return false;
		} else if (!this.maritimeTransport.equals(other.maritimeTransport))
			return false;
		if (this.ownerParty == null) {
			if (other.ownerParty != null)
				return false;
		} else if (!this.ownerParty.equals(other.ownerParty))
			return false;
		if (this.railTransport == null) {
			if (other.railTransport != null)
				return false;
		} else if (!this.railTransport.equals(other.railTransport))
			return false;
		if (this.registrationNationality == null) {
			if (other.registrationNationality != null)
				return false;
		} else if (!this.registrationNationality.equals(other.registrationNationality))
			return false;
		if (this.registrationNationalityID == null) {
			if (other.registrationNationalityID != null)
				return false;
		} else if (!this.registrationNationalityID.equals(other.registrationNationalityID))
			return false;
		if (this.roadTransport == null) {
			if (other.roadTransport != null)
				return false;
		} else if (!this.roadTransport.equals(other.roadTransport))
			return false;
		if (this.stowage == null) {
			if (other.stowage != null)
				return false;
		} else if (!this.stowage.equals(other.stowage))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // TransportMeansType