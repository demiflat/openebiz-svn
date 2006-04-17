/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.CoordinateSystemCodeType;
import org.openebiz.core.common.cbc.LatitudeDegreesMeasureType;
import org.openebiz.core.common.cbc.LatitudeDirectionCodeType;
import org.openebiz.core.common.cbc.LatitudeMinutesMeasureType;
import org.openebiz.core.common.cbc.LongitudeDegreesMeasureType;
import org.openebiz.core.common.cbc.LongitudeDirectionCodeType;
import org.openebiz.core.common.cbc.LongitudeMinutesMeasureType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Coordinate Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Location Coordinate. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about physical (geographical) location</ccts:Definition>
 *           <ccts:ObjectClass>Location Coordinate</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.LocationCoordinateType#getCoordinateSystemCode <em>Coordinate System Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LocationCoordinateType#getLatitudeDegreesMeasure <em>Latitude Degrees Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LocationCoordinateType#getLatitudeMinutesMeasure <em>Latitude Minutes Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LocationCoordinateType#getLatitudeDirectionCode <em>Latitude Direction Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LocationCoordinateType#getLongitudeDegreesMeasure <em>Longitude Degrees Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LocationCoordinateType#getLongitudeMinutesMeasure <em>Longitude Minutes Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LocationCoordinateType#getLongitudeDirectionCode <em>Longitude Direction Code</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface LocationCoordinateType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Coordinate System Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Location Coordinate. Coordinate System. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An identifier for the location system used</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Location Coordinate</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Coordinate System</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordinate System Code</em>' containment reference.
	 * @see #setCoordinateSystemCode(CoordinateSystemCodeType)
	 */
	CoordinateSystemCodeType getCoordinateSystemCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LocationCoordinateType#getCoordinateSystemCode <em>Coordinate System Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinate System Code</em>' containment reference.
	 * @see #getCoordinateSystemCode()
	 */
	void setCoordinateSystemCode(CoordinateSystemCodeType value);

	/**
	 * Returns the value of the '<em><b>Latitude Degrees Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Location Coordinate. Latitude Degrees. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The measure of latitude in degrees</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Location Coordinate</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Latitude Degrees</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Latitude Degrees Measure</em>' containment reference.
	 * @see #setLatitudeDegreesMeasure(LatitudeDegreesMeasureType)
	 */
	LatitudeDegreesMeasureType getLatitudeDegreesMeasure();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LocationCoordinateType#getLatitudeDegreesMeasure <em>Latitude Degrees Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude Degrees Measure</em>' containment reference.
	 * @see #getLatitudeDegreesMeasure()
	 */
	void setLatitudeDegreesMeasure(LatitudeDegreesMeasureType value);

	/**
	 * Returns the value of the '<em><b>Latitude Minutes Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Location Coordinate. Latitude Minutes. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The measure of latitude in minutes</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Location Coordinate</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Latitude Minutes</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Latitude Minutes Measure</em>' containment reference.
	 * @see #setLatitudeMinutesMeasure(LatitudeMinutesMeasureType)
	 */
	LatitudeMinutesMeasureType getLatitudeMinutesMeasure();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LocationCoordinateType#getLatitudeMinutesMeasure <em>Latitude Minutes Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude Minutes Measure</em>' containment reference.
	 * @see #getLatitudeMinutesMeasure()
	 */
	void setLatitudeMinutesMeasure(LatitudeMinutesMeasureType value);

	/**
	 * Returns the value of the '<em><b>Latitude Direction Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Location Coordinate. Latitude Direction. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The direction of latitude measurement offset from the equator</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Location Coordinate</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Latitude Direction</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Latitude Direction_ Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Latitude Direction Code</em>' containment reference.
	 * @see #setLatitudeDirectionCode(LatitudeDirectionCodeType)
	 */
	LatitudeDirectionCodeType getLatitudeDirectionCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LocationCoordinateType#getLatitudeDirectionCode <em>Latitude Direction Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude Direction Code</em>' containment reference.
	 * @see #getLatitudeDirectionCode()
	 */
	void setLatitudeDirectionCode(LatitudeDirectionCodeType value);

	/**
	 * Returns the value of the '<em><b>Longitude Degrees Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Location Coordinate. Longitude Degrees. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The measure of longitude in degrees</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Location Coordinate</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Longitude Degrees</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Longitude Degrees Measure</em>' containment reference.
	 * @see #setLongitudeDegreesMeasure(LongitudeDegreesMeasureType)
	 */
	LongitudeDegreesMeasureType getLongitudeDegreesMeasure();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LocationCoordinateType#getLongitudeDegreesMeasure <em>Longitude Degrees Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude Degrees Measure</em>' containment reference.
	 * @see #getLongitudeDegreesMeasure()
	 */
	void setLongitudeDegreesMeasure(LongitudeDegreesMeasureType value);

	/**
	 * Returns the value of the '<em><b>Longitude Minutes Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Location Coordinate. Longitude Minutes. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The measure of longitude in minutes</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Location Coordinate</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Longitude Minutes</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 * 
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Longitude Minutes Measure</em>' containment reference.
	 * @see #setLongitudeMinutesMeasure(LongitudeMinutesMeasureType)
	 */
	LongitudeMinutesMeasureType getLongitudeMinutesMeasure();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LocationCoordinateType#getLongitudeMinutesMeasure <em>Longitude Minutes Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude Minutes Measure</em>' containment reference.
	 * @see #getLongitudeMinutesMeasure()
	 */
	void setLongitudeMinutesMeasure(LongitudeMinutesMeasureType value);

	/**
	 * Returns the value of the '<em><b>Longitude Direction Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Location Coordinate. Longitude Direction. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The direction of longitude measurement offset from the meridian</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Location Coordinate</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Longitude Direction</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Longitude Direction_ Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Longitude Direction Code</em>' containment reference.
	 * @see #setLongitudeDirectionCode(LongitudeDirectionCodeType)
	 */
	LongitudeDirectionCodeType getLongitudeDirectionCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LocationCoordinateType#getLongitudeDirectionCode <em>Longitude Direction Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude Direction Code</em>' containment reference.
	 * @see #getLongitudeDirectionCode()
	 */
	void setLongitudeDirectionCode(LongitudeDirectionCodeType value);

} // LocationCoordinateType