/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.AdditionalStreetNameType;
import org.openebiz.core.common.cbc.BuildingNameType;
import org.openebiz.core.common.cbc.BuildingNumberType;
import org.openebiz.core.common.cbc.CityNameType;
import org.openebiz.core.common.cbc.CountrySubentityCodeType;
import org.openebiz.core.common.cbc.CountrySubentityType;
import org.openebiz.core.common.cbc.DepartmentType;
import org.openebiz.core.common.cbc.DistrictType;
import org.openebiz.core.common.cbc.FloorType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.InhouseMailType;
import org.openebiz.core.common.cbc.PostalZoneType;
import org.openebiz.core.common.cbc.PostboxType;
import org.openebiz.core.common.cbc.RegionType;
import org.openebiz.core.common.cbc.RoomType;
import org.openebiz.core.common.cbc.StreetNameType;
import org.openebiz.core.common.cbc.TimezoneOffsetType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Address. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about a structured address</ccts:Definition>
 *           <ccts:ObjectClass>Address</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.AddressType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AddressType#getPostbox <em>Postbox</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AddressType#getFloor <em>Floor</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AddressType#getRoom <em>Room</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AddressType#getStreetName <em>Street Name</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AddressType#getAdditionalStreetName <em>Additional Street Name</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AddressType#getBuildingName <em>Building Name</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AddressType#getBuildingNumber <em>Building Number</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AddressType#getInhouseMail <em>Inhouse Mail</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AddressType#getDepartment <em>Department</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AddressType#getCityName <em>City Name</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AddressType#getPostalZone <em>Postal Zone</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AddressType#getCountrySubentity <em>Country Subentity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AddressType#getCountrySubentityCode <em>Country Subentity Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AddressType#getRegion <em>Region</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AddressType#getDistrict <em>District</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AddressType#getTimezoneOffset <em>Timezone Offset</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AddressType#getAddressLine <em>Address Line</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AddressType#getCountry <em>Country</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AddressType#getLocationCoordinate <em>Location Coordinate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddressType implements Serializable {
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
	 * The cached value of the '{@link #getPostbox() <em>Postbox</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostbox()
	 * @generated
	 * @ordered
	 */
	protected PostboxType postbox = null;

	/**
	 * The cached value of the '{@link #getFloor() <em>Floor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloor()
	 * @generated
	 * @ordered
	 */
	protected FloorType floor = null;

	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected RoomType room = null;

	/**
	 * The cached value of the '{@link #getStreetName() <em>Street Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreetName()
	 * @generated
	 * @ordered
	 */
	protected StreetNameType streetName = null;

	/**
	 * The cached value of the '{@link #getAdditionalStreetName() <em>Additional Street Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalStreetName()
	 * @generated
	 * @ordered
	 */
	protected AdditionalStreetNameType additionalStreetName = null;

	/**
	 * The cached value of the '{@link #getBuildingName() <em>Building Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildingName()
	 * @generated
	 * @ordered
	 */
	protected BuildingNameType buildingName = null;

	/**
	 * The cached value of the '{@link #getBuildingNumber() <em>Building Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildingNumber()
	 * @generated
	 * @ordered
	 */
	protected BuildingNumberType buildingNumber = null;

	/**
	 * The cached value of the '{@link #getInhouseMail() <em>Inhouse Mail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInhouseMail()
	 * @generated
	 * @ordered
	 */
	protected InhouseMailType inhouseMail = null;

	/**
	 * The cached value of the '{@link #getDepartment() <em>Department</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartment()
	 * @generated
	 * @ordered
	 */
	protected DepartmentType department = null;

	/**
	 * The cached value of the '{@link #getCityName() <em>City Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCityName()
	 * @generated
	 * @ordered
	 */
	protected CityNameType cityName = null;

	/**
	 * The cached value of the '{@link #getPostalZone() <em>Postal Zone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalZone()
	 * @generated
	 * @ordered
	 */
	protected PostalZoneType postalZone = null;

	/**
	 * The cached value of the '{@link #getCountrySubentity() <em>Country Subentity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountrySubentity()
	 * @generated
	 * @ordered
	 */
	protected CountrySubentityType countrySubentity = null;

	/**
	 * The cached value of the '{@link #getCountrySubentityCode() <em>Country Subentity Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountrySubentityCode()
	 * @generated
	 * @ordered
	 */
	protected CountrySubentityCodeType countrySubentityCode = null;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected RegionType region = null;

	/**
	 * The cached value of the '{@link #getDistrict() <em>District</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistrict()
	 * @generated
	 * @ordered
	 */
	protected DistrictType district = null;

	/**
	 * The cached value of the '{@link #getTimezoneOffset() <em>Timezone Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimezoneOffset()
	 * @generated
	 * @ordered
	 */
	protected TimezoneOffsetType timezoneOffset = null;

	/**
	 * The cached value of the '{@link #getAddressLine() <em>Address Line</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressLine()
	 * @generated
	 * @ordered
	 */
	protected List addressLine = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected CountryType country = null;

	/**
	 * The cached value of the '{@link #getLocationCoordinate() <em>Location Coordinate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationCoordinate()
	 * @generated
	 * @ordered
	 */
	protected LocationCoordinateType locationCoordinate = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public AddressType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.iD = this.getID();
		this.postbox = this.getPostbox();
		this.floor = this.getFloor();
		this.room = this.getRoom();
		this.streetName = this.getStreetName();
		this.additionalStreetName = this.getAdditionalStreetName();
		this.buildingName = this.getBuildingName();
		this.buildingNumber = this.getBuildingNumber();
		this.inhouseMail = this.getInhouseMail();
		this.department = this.getDepartment();
		this.cityName = this.getCityName();
		this.postalZone = this.getPostalZone();
		this.countrySubentity = this.getCountrySubentity();
		this.countrySubentityCode = this.getCountrySubentityCode();
		this.region = this.getRegion();
		this.district = this.getDistrict();
		this.timezoneOffset = this.getTimezoneOffset();
		this.addressLine = this.getAddressLine();
		this.country = this.getCountry();
		this.locationCoordinate = this.getLocationCoordinate();
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
	 *               <ccts:DictionaryEntryName>Address. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An identifier for a specific address within a scheme of registered addresses</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Address</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>DetailsKey</ccts:AlternativeBusinessTerms>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AddressType#getID <em>ID</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Postbox</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Address. Postbox. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A post office box number</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Address</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Postbox</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>PostBox, PO Box</ccts:AlternativeBusinessTerms>
	 *               <ccts:Examples>"123"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postbox</em>' containment reference.
	 * @see #setPostbox(PostboxType)
	 * @generated
	 */
	public PostboxType getPostbox() {
		return (postbox == null) ? new PostboxType() : postbox;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AddressType#getPostbox <em>Postbox</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postbox</em>' containment reference.
	 * @see #getPostbox()
	 * @generated
	 */
	public void setPostbox(PostboxType newPostbox) {
		postbox = newPostbox;
	}

	/**
	 * Returns the value of the '<em><b>Floor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Address. Floor. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An addressable floor of a building</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Address</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Floor</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>SubPremiseNumber</ccts:AlternativeBusinessTerms>
	 *               <ccts:Examples>"30"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Floor</em>' containment reference.
	 * @see #setFloor(FloorType)
	 * @generated
	 */
	public FloorType getFloor() {
		return (floor == null) ? new FloorType() : floor;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AddressType#getFloor <em>Floor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floor</em>' containment reference.
	 * @see #getFloor()
	 * @generated
	 */
	public void setFloor(FloorType newFloor) {
		floor = newFloor;
	}

	/**
	 * Returns the value of the '<em><b>Room</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Address. Room. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A room, suite or apartment of a building</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Address</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Room</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>SubPremiseNumber</ccts:AlternativeBusinessTerms>
	 *               <ccts:Examples>"Reception"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Room</em>' containment reference.
	 * @see #setRoom(RoomType)
	 * @generated
	 */
	public RoomType getRoom() {
		return (room == null) ? new RoomType() : room;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AddressType#getRoom <em>Room</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' containment reference.
	 * @see #getRoom()
	 * @generated
	 */
	public void setRoom(RoomType newRoom) {
		room = newRoom;
	}

	/**
	 * Returns the value of the '<em><b>Street Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Address. Street Name. Name</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The name of a street</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Address</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Street Name</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Name</ccts:RepresentationTerm>
	 *               <ccts:DataType>Name. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Thoroughfare</ccts:AlternativeBusinessTerms>
	 *               <ccts:Examples>"Kwun Tong Road"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Street Name</em>' containment reference.
	 * @see #setStreetName(StreetNameType)
	 * @generated
	 */
	public StreetNameType getStreetName() {
		return (streetName == null) ? new StreetNameType() : streetName;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AddressType#getStreetName <em>Street Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street Name</em>' containment reference.
	 * @see #getStreetName()
	 * @generated
	 */
	public void setStreetName(StreetNameType newStreetName) {
		streetName = newStreetName;
	}

	/**
	 * Returns the value of the '<em><b>Additional Street Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Address. Additional_ Street Name. Name</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An additional name of a street used to further specify the Street Name</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Address</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Additional</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Street Name</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Name</ccts:RepresentationTerm>
	 *               <ccts:DataType>Name. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Thoroughfare</ccts:AlternativeBusinessTerms>
	 *               <ccts:Examples>"Cnr Aberdeen Road"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Street Name</em>' containment reference.
	 * @see #setAdditionalStreetName(AdditionalStreetNameType)
	 * @generated
	 */
	public AdditionalStreetNameType getAdditionalStreetName() {
		return (additionalStreetName == null) ? new AdditionalStreetNameType()
				: additionalStreetName;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AddressType#getAdditionalStreetName <em>Additional Street Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Street Name</em>' containment reference.
	 * @see #getAdditionalStreetName()
	 * @generated
	 */
	public void setAdditionalStreetName(
			AdditionalStreetNameType newAdditionalStreetName) {
		additionalStreetName = newAdditionalStreetName;
	}

	/**
	 * Returns the value of the '<em><b>Building Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Address. Building Name. Name</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The name of a building</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Address</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Building Name</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Name</ccts:RepresentationTerm>
	 *               <ccts:DataType>Name. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>BuildingName</ccts:AlternativeBusinessTerms>
	 *               <ccts:Examples>"Plot 421"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Building Name</em>' containment reference.
	 * @see #setBuildingName(BuildingNameType)
	 * @generated
	 */
	public BuildingNameType getBuildingName() {
		return (buildingName == null) ? new BuildingNameType() : buildingName;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AddressType#getBuildingName <em>Building Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Building Name</em>' containment reference.
	 * @see #getBuildingName()
	 * @generated
	 */
	public void setBuildingName(BuildingNameType newBuildingName) {
		buildingName = newBuildingName;
	}

	/**
	 * Returns the value of the '<em><b>Building Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Address. Building Number. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The number of a building</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Address</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Building Number</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>PremiseNumber</ccts:AlternativeBusinessTerms>
	 *               <ccts:Examples>"388"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Building Number</em>' containment reference.
	 * @see #setBuildingNumber(BuildingNumberType)
	 * @generated
	 */
	public BuildingNumberType getBuildingNumber() {
		return (buildingNumber == null) ? new BuildingNumberType()
				: buildingNumber;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AddressType#getBuildingNumber <em>Building Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Building Number</em>' containment reference.
	 * @see #getBuildingNumber()
	 * @generated
	 */
	public void setBuildingNumber(BuildingNumberType newBuildingNumber) {
		buildingNumber = newBuildingNumber;
	}

	/**
	 * Returns the value of the '<em><b>Inhouse Mail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Address. Inhouse Mail. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A specific location within a building</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Address</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Inhouse Mail</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>MailStop</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inhouse Mail</em>' containment reference.
	 * @see #setInhouseMail(InhouseMailType)
	 * @generated
	 */
	public InhouseMailType getInhouseMail() {
		return (inhouseMail == null) ? new InhouseMailType() : inhouseMail;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AddressType#getInhouseMail <em>Inhouse Mail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inhouse Mail</em>' containment reference.
	 * @see #getInhouseMail()
	 * @generated
	 */
	public void setInhouseMail(InhouseMailType newInhouseMail) {
		inhouseMail = newInhouseMail;
	}

	/**
	 * Returns the value of the '<em><b>Department</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Address. Department. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An addressable department of an organisation</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Address</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Department</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Department</ccts:AlternativeBusinessTerms>
	 *               <ccts:Examples>"Accounts Payable"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Department</em>' containment reference.
	 * @see #setDepartment(DepartmentType)
	 * @generated
	 */
	public DepartmentType getDepartment() {
		return (department == null) ? new DepartmentType() : department;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AddressType#getDepartment <em>Department</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Department</em>' containment reference.
	 * @see #getDepartment()
	 * @generated
	 */
	public void setDepartment(DepartmentType newDepartment) {
		department = newDepartment;
	}

	/**
	 * Returns the value of the '<em><b>City Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Address. City Name. Name</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The name of a city, town or village</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Address</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>City Name</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Name</ccts:RepresentationTerm>
	 *               <ccts:DataType>Name. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>LocalityName</ccts:AlternativeBusinessTerms>
	 *               <ccts:Examples>"Hong Kong"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>City Name</em>' containment reference.
	 * @see #setCityName(CityNameType)
	 * @generated
	 */
	public CityNameType getCityName() {
		return (cityName == null) ? new CityNameType() : cityName;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AddressType#getCityName <em>City Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City Name</em>' containment reference.
	 * @see #getCityName()
	 * @generated
	 */
	public void setCityName(CityNameType newCityName) {
		cityName = newCityName;
	}

	/**
	 * Returns the value of the '<em><b>Postal Zone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Address. Postal Zone. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for an addressable group of properties according to the relevant national postal service such as a ZIP code or Post Code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Address</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Postal Zone</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>PostalCodeNumber</ccts:AlternativeBusinessTerms>
	 *               <ccts:Examples>"SW11 4EW" "2500 GG"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postal Zone</em>' containment reference.
	 * @see #setPostalZone(PostalZoneType)
	 * @generated
	 */
	public PostalZoneType getPostalZone() {
		return (postalZone == null) ? new PostalZoneType() : postalZone;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AddressType#getPostalZone <em>Postal Zone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Zone</em>' containment reference.
	 * @see #getPostalZone()
	 * @generated
	 */
	public void setPostalZone(PostalZoneType newPostalZone) {
		postalZone = newPostalZone;
	}

	/**
	 * Returns the value of the '<em><b>Country Subentity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Address. Country Subentity. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A territorial division of a country such as a county or state</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Address</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Country Subentity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>AdministrativeArea, State, Country, Shire, Canton</ccts:AlternativeBusinessTerms>
	 *               <ccts:Examples>"Florida","Tamilnadu"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Country Subentity</em>' containment reference.
	 * @see #setCountrySubentity(CountrySubentityType)
	 * @generated
	 */
	public CountrySubentityType getCountrySubentity() {
		return (countrySubentity == null) ? new CountrySubentityType()
				: countrySubentity;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AddressType#getCountrySubentity <em>Country Subentity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country Subentity</em>' containment reference.
	 * @see #getCountrySubentity()
	 * @generated
	 */
	public void setCountrySubentity(CountrySubentityType newCountrySubentity) {
		countrySubentity = newCountrySubentity;
	}

	/**
	 * Returns the value of the '<em><b>Country Subentity Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Address. Country Subentity Code. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The territorial division of a country such as a county or state expresssed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Address</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Country Subentity Code</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>AdministrativeAreaCode, State Code</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Country Subentity Code</em>' containment reference.
	 * @see #setCountrySubentityCode(CountrySubentityCodeType)
	 * @generated
	 */
	public CountrySubentityCodeType getCountrySubentityCode() {
		return (countrySubentityCode == null) ? new CountrySubentityCodeType()
				: countrySubentityCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AddressType#getCountrySubentityCode <em>Country Subentity Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country Subentity Code</em>' containment reference.
	 * @see #getCountrySubentityCode()
	 * @generated
	 */
	public void setCountrySubentityCode(
			CountrySubentityCodeType newCountrySubentityCode) {
		countrySubentityCode = newCountrySubentityCode;
	}

	/**
	 * Returns the value of the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Address. Region. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An addressable region or group of countries</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Address</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Region</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>LocalityName, Economic Zone</ccts:AlternativeBusinessTerms>
	 *               <ccts:Examples>"European Union"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Region</em>' containment reference.
	 * @see #setRegion(RegionType)
	 * @generated
	 */
	public RegionType getRegion() {
		return (region == null) ? new RegionType() : region;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AddressType#getRegion <em>Region</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' containment reference.
	 * @see #getRegion()
	 * @generated
	 */
	public void setRegion(RegionType newRegion) {
		region = newRegion;
	}

	/**
	 * Returns the value of the '<em><b>District</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Address. District. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A geographical division of a country</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Address</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>District</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>LocalityName, Area</ccts:AlternativeBusinessTerms>
	 *               <ccts:Examples>"East Coast"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>District</em>' containment reference.
	 * @see #setDistrict(DistrictType)
	 * @generated
	 */
	public DistrictType getDistrict() {
		return (district == null) ? new DistrictType() : district;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AddressType#getDistrict <em>District</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>District</em>' containment reference.
	 * @see #getDistrict()
	 * @generated
	 */
	public void setDistrict(DistrictType newDistrict) {
		district = newDistrict;
	}

	/**
	 * Returns the value of the '<em><b>Timezone Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Address. Timezone Offset. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>For the time zone in which the address is situated, the measure of time offset from Universal Coordinated Time (UTC)</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Address</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Timezone Offset</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:Examples>"+8:00" "-3:00"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timezone Offset</em>' containment reference.
	 * @see #setTimezoneOffset(TimezoneOffsetType)
	 * @generated
	 */
	public TimezoneOffsetType getTimezoneOffset() {
		return (timezoneOffset == null) ? new TimezoneOffsetType()
				: timezoneOffset;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AddressType#getTimezoneOffset <em>Timezone Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timezone Offset</em>' containment reference.
	 * @see #getTimezoneOffset()
	 * @generated
	 */
	public void setTimezoneOffset(TimezoneOffsetType newTimezoneOffset) {
		timezoneOffset = newTimezoneOffset;
	}

	/**
	 * Returns the value of the '<em><b>Address Line</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.AddressLineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Address. Address Line</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Address Line</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Address</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Address Line</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Address Line</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Line</em>' containment reference list.
	 * @generated
	 */
	public List getAddressLine() {
		if (addressLine == null) {
			addressLine = new ArrayList<AddressLineType>();
		}
		return addressLine;
	}

	/**
	 * Returns the value of the '<em><b>Country</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Address. Country</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Country</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Address</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Country</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Country</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Country</em>' containment reference.
	 * @see #setCountry(CountryType)
	 * @generated
	 */
	public CountryType getCountry() {
		return (country == null) ? new CountryType() : country;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AddressType#getCountry <em>Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' containment reference.
	 * @see #getCountry()
	 * @generated
	 */
	public void setCountry(CountryType newCountry) {
		country = newCountry;
	}

	/**
	 * Returns the value of the '<em><b>Location Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Address. Location Coordinate</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Location Coordinate</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Address</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Location Coordinate</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Location Coordinate</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Coordinate</em>' containment reference.
	 * @see #setLocationCoordinate(LocationCoordinateType)
	 * @generated
	 */
	public LocationCoordinateType getLocationCoordinate() {
		return (locationCoordinate == null) ? new LocationCoordinateType()
				: locationCoordinate;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AddressType#getLocationCoordinate <em>Location Coordinate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Coordinate</em>' containment reference.
	 * @see #getLocationCoordinate()
	 * @generated
	 */
	public void setLocationCoordinate(
			LocationCoordinateType newLocationCoordinate) {
		locationCoordinate = newLocationCoordinate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.additionalStreetName == null) ? 0 : this.additionalStreetName.hashCode());
		result = PRIME * result + ((this.addressLine == null) ? 0 : this.addressLine.hashCode());
		result = PRIME * result + ((this.buildingName == null) ? 0 : this.buildingName.hashCode());
		result = PRIME * result + ((this.buildingNumber == null) ? 0 : this.buildingNumber.hashCode());
		result = PRIME * result + ((this.cityName == null) ? 0 : this.cityName.hashCode());
		result = PRIME * result + ((this.country == null) ? 0 : this.country.hashCode());
		result = PRIME * result + ((this.countrySubentity == null) ? 0 : this.countrySubentity.hashCode());
		result = PRIME * result + ((this.countrySubentityCode == null) ? 0 : this.countrySubentityCode.hashCode());
		result = PRIME * result + ((this.department == null) ? 0 : this.department.hashCode());
		result = PRIME * result + ((this.district == null) ? 0 : this.district.hashCode());
		result = PRIME * result + ((this.floor == null) ? 0 : this.floor.hashCode());
		result = PRIME * result + ((this.iD == null) ? 0 : this.iD.hashCode());
		result = PRIME * result + ((this.inhouseMail == null) ? 0 : this.inhouseMail.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.locationCoordinate == null) ? 0 : this.locationCoordinate.hashCode());
		result = PRIME * result + ((this.postalZone == null) ? 0 : this.postalZone.hashCode());
		result = PRIME * result + ((this.postbox == null) ? 0 : this.postbox.hashCode());
		result = PRIME * result + ((this.region == null) ? 0 : this.region.hashCode());
		result = PRIME * result + ((this.room == null) ? 0 : this.room.hashCode());
		result = PRIME * result + ((this.streetName == null) ? 0 : this.streetName.hashCode());
		result = PRIME * result + ((this.timezoneOffset == null) ? 0 : this.timezoneOffset.hashCode());
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
		final AddressType other = (AddressType) obj;
		if (this.additionalStreetName == null) {
			if (other.additionalStreetName != null)
				return false;
		} else if (!this.additionalStreetName.equals(other.additionalStreetName))
			return false;
		if (this.addressLine == null) {
			if (other.addressLine != null)
				return false;
		} else if (!this.addressLine.equals(other.addressLine))
			return false;
		if (this.buildingName == null) {
			if (other.buildingName != null)
				return false;
		} else if (!this.buildingName.equals(other.buildingName))
			return false;
		if (this.buildingNumber == null) {
			if (other.buildingNumber != null)
				return false;
		} else if (!this.buildingNumber.equals(other.buildingNumber))
			return false;
		if (this.cityName == null) {
			if (other.cityName != null)
				return false;
		} else if (!this.cityName.equals(other.cityName))
			return false;
		if (this.country == null) {
			if (other.country != null)
				return false;
		} else if (!this.country.equals(other.country))
			return false;
		if (this.countrySubentity == null) {
			if (other.countrySubentity != null)
				return false;
		} else if (!this.countrySubentity.equals(other.countrySubentity))
			return false;
		if (this.countrySubentityCode == null) {
			if (other.countrySubentityCode != null)
				return false;
		} else if (!this.countrySubentityCode.equals(other.countrySubentityCode))
			return false;
		if (this.department == null) {
			if (other.department != null)
				return false;
		} else if (!this.department.equals(other.department))
			return false;
		if (this.district == null) {
			if (other.district != null)
				return false;
		} else if (!this.district.equals(other.district))
			return false;
		if (this.floor == null) {
			if (other.floor != null)
				return false;
		} else if (!this.floor.equals(other.floor))
			return false;
		if (this.iD == null) {
			if (other.iD != null)
				return false;
		} else if (!this.iD.equals(other.iD))
			return false;
		if (this.inhouseMail == null) {
			if (other.inhouseMail != null)
				return false;
		} else if (!this.inhouseMail.equals(other.inhouseMail))
			return false;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.locationCoordinate == null) {
			if (other.locationCoordinate != null)
				return false;
		} else if (!this.locationCoordinate.equals(other.locationCoordinate))
			return false;
		if (this.postalZone == null) {
			if (other.postalZone != null)
				return false;
		} else if (!this.postalZone.equals(other.postalZone))
			return false;
		if (this.postbox == null) {
			if (other.postbox != null)
				return false;
		} else if (!this.postbox.equals(other.postbox))
			return false;
		if (this.region == null) {
			if (other.region != null)
				return false;
		} else if (!this.region.equals(other.region))
			return false;
		if (this.room == null) {
			if (other.room != null)
				return false;
		} else if (!this.room.equals(other.room))
			return false;
		if (this.streetName == null) {
			if (other.streetName != null)
				return false;
		} else if (!this.streetName.equals(other.streetName))
			return false;
		if (this.timezoneOffset == null) {
			if (other.timezoneOffset != null)
				return false;
		} else if (!this.timezoneOffset.equals(other.timezoneOffset))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // AddressType