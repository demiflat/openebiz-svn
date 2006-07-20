/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import java.util.List;

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
 */
public interface AddressType {
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
	 */
	IDType getID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AddressType#getID <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' containment reference.
	 * @see #getID()
	 */
	void setID(IDType value);

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
	 */
	PostboxType getPostbox();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AddressType#getPostbox <em>Postbox</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postbox</em>' containment reference.
	 * @see #getPostbox()
	 */
	void setPostbox(PostboxType value);

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
	 */
	FloorType getFloor();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AddressType#getFloor <em>Floor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floor</em>' containment reference.
	 * @see #getFloor()
	 */
	void setFloor(FloorType value);

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
	 */
	RoomType getRoom();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AddressType#getRoom <em>Room</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' containment reference.
	 * @see #getRoom()
	 */
	void setRoom(RoomType value);

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
	 */
	StreetNameType getStreetName();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AddressType#getStreetName <em>Street Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street Name</em>' containment reference.
	 * @see #getStreetName()
	 */
	void setStreetName(StreetNameType value);

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
	 */
	AdditionalStreetNameType getAdditionalStreetName();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AddressType#getAdditionalStreetName <em>Additional Street Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Street Name</em>' containment reference.
	 * @see #getAdditionalStreetName()
	 */
	void setAdditionalStreetName(AdditionalStreetNameType value);

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
	 */
	BuildingNameType getBuildingName();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AddressType#getBuildingName <em>Building Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Building Name</em>' containment reference.
	 * @see #getBuildingName()
	 */
	void setBuildingName(BuildingNameType value);

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
	 */
	BuildingNumberType getBuildingNumber();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AddressType#getBuildingNumber <em>Building Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Building Number</em>' containment reference.
	 * @see #getBuildingNumber()
	 */
	void setBuildingNumber(BuildingNumberType value);

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
	 */
	InhouseMailType getInhouseMail();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AddressType#getInhouseMail <em>Inhouse Mail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inhouse Mail</em>' containment reference.
	 * @see #getInhouseMail()
	 */
	void setInhouseMail(InhouseMailType value);

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
	 */
	DepartmentType getDepartment();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AddressType#getDepartment <em>Department</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Department</em>' containment reference.
	 * @see #getDepartment()
	 */
	void setDepartment(DepartmentType value);

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
	 */
	CityNameType getCityName();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AddressType#getCityName <em>City Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City Name</em>' containment reference.
	 * @see #getCityName()
	 */
	void setCityName(CityNameType value);

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
	 */
	PostalZoneType getPostalZone();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AddressType#getPostalZone <em>Postal Zone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Zone</em>' containment reference.
	 * @see #getPostalZone()
	 */
	void setPostalZone(PostalZoneType value);

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
	 */
	CountrySubentityType getCountrySubentity();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AddressType#getCountrySubentity <em>Country Subentity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country Subentity</em>' containment reference.
	 * @see #getCountrySubentity()
	 */
	void setCountrySubentity(CountrySubentityType value);

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
	 */
	CountrySubentityCodeType getCountrySubentityCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AddressType#getCountrySubentityCode <em>Country Subentity Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country Subentity Code</em>' containment reference.
	 * @see #getCountrySubentityCode()
	 */
	void setCountrySubentityCode(CountrySubentityCodeType value);

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
	 */
	RegionType getRegion();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AddressType#getRegion <em>Region</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' containment reference.
	 * @see #getRegion()
	 */
	void setRegion(RegionType value);

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
	 */
	DistrictType getDistrict();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AddressType#getDistrict <em>District</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>District</em>' containment reference.
	 * @see #getDistrict()
	 */
	void setDistrict(DistrictType value);

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
	 */
	TimezoneOffsetType getTimezoneOffset();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AddressType#getTimezoneOffset <em>Timezone Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timezone Offset</em>' containment reference.
	 * @see #getTimezoneOffset()
	 */
	void setTimezoneOffset(TimezoneOffsetType value);

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
	 */
	List getAddressLine();

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
	 */
	CountryType getCountry();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AddressType#getCountry <em>Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' containment reference.
	 * @see #getCountry()
	 */
	void setCountry(CountryType value);

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
	 */
	LocationCoordinateType getLocationCoordinate();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AddressType#getLocationCoordinate <em>Location Coordinate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Coordinate</em>' containment reference.
	 * @see #getLocationCoordinate()
	 */
	void setLocationCoordinate(LocationCoordinateType value);

} // AddressType