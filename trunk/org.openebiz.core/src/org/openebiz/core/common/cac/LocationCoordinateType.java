/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.CoordinateSystemCodeType;
import org.openebiz.core.common.cbc.LatitudeDegreesMeasureType;
import org.openebiz.core.common.cbc.LatitudeDirectionCodeType;
import org.openebiz.core.common.cbc.LatitudeMinutesMeasureType;
import org.openebiz.core.common.cbc.LongitudeDegreesMeasureType;
import org.openebiz.core.common.cbc.LongitudeDirectionCodeType;
import org.openebiz.core.common.cbc.LongitudeMinutesMeasureType;
import java.io.Serializable;

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
 * @generated
 */
public class LocationCoordinateType implements Serializable {
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
	 * The cached value of the '{@link #getCoordinateSystemCode() <em>Coordinate System Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinateSystemCode()
	 * @generated
	 * @ordered
	 */
	protected CoordinateSystemCodeType coordinateSystemCode = null;

	/**
	 * The cached value of the '{@link #getLatitudeDegreesMeasure() <em>Latitude Degrees Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitudeDegreesMeasure()
	 * @generated
	 * @ordered
	 */
	protected LatitudeDegreesMeasureType latitudeDegreesMeasure = null;

	/**
	 * The cached value of the '{@link #getLatitudeMinutesMeasure() <em>Latitude Minutes Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitudeMinutesMeasure()
	 * @generated
	 * @ordered
	 */
	protected LatitudeMinutesMeasureType latitudeMinutesMeasure = null;

	/**
	 * The cached value of the '{@link #getLatitudeDirectionCode() <em>Latitude Direction Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitudeDirectionCode()
	 * @generated
	 * @ordered
	 */
	protected LatitudeDirectionCodeType latitudeDirectionCode = null;

	/**
	 * The cached value of the '{@link #getLongitudeDegreesMeasure() <em>Longitude Degrees Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudeDegreesMeasure()
	 * @generated
	 * @ordered
	 */
	protected LongitudeDegreesMeasureType longitudeDegreesMeasure = null;

	/**
	 * The cached value of the '{@link #getLongitudeMinutesMeasure() <em>Longitude Minutes Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudeMinutesMeasure()
	 * @generated
	 * @ordered
	 */
	protected LongitudeMinutesMeasureType longitudeMinutesMeasure = null;

	/**
	 * The cached value of the '{@link #getLongitudeDirectionCode() <em>Longitude Direction Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudeDirectionCode()
	 * @generated
	 * @ordered
	 */
	protected LongitudeDirectionCodeType longitudeDirectionCode = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public LocationCoordinateType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.coordinateSystemCode = this.getCoordinateSystemCode();
		this.latitudeDegreesMeasure = this.getLatitudeDegreesMeasure();
		this.latitudeMinutesMeasure = this.getLatitudeMinutesMeasure();
		this.latitudeDirectionCode = this.getLatitudeDirectionCode();
		this.longitudeDegreesMeasure = this.getLongitudeDegreesMeasure();
		this.longitudeMinutesMeasure = this.getLongitudeMinutesMeasure();
		this.longitudeDirectionCode = this.getLongitudeDirectionCode();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		// TODO: latitude & longitude display
		return sdisplay.toString();
	}
	
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
	 * @generated
	 */
	public CoordinateSystemCodeType getCoordinateSystemCode() {
		return (coordinateSystemCode == null) ? new CoordinateSystemCodeType()
				: coordinateSystemCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LocationCoordinateType#getCoordinateSystemCode <em>Coordinate System Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinate System Code</em>' containment reference.
	 * @see #getCoordinateSystemCode()
	 * @generated
	 */
	public void setCoordinateSystemCode(
			CoordinateSystemCodeType newCoordinateSystemCode) {
		coordinateSystemCode = newCoordinateSystemCode;
	}

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
	 * @generated
	 */
	public LatitudeDegreesMeasureType getLatitudeDegreesMeasure() {
		return (latitudeDegreesMeasure == null) ? new LatitudeDegreesMeasureType()
				: latitudeDegreesMeasure;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LocationCoordinateType#getLatitudeDegreesMeasure <em>Latitude Degrees Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude Degrees Measure</em>' containment reference.
	 * @see #getLatitudeDegreesMeasure()
	 * @generated
	 */
	public void setLatitudeDegreesMeasure(
			LatitudeDegreesMeasureType newLatitudeDegreesMeasure) {
		latitudeDegreesMeasure = newLatitudeDegreesMeasure;
	}

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
	 * @generated
	 */
	public LatitudeMinutesMeasureType getLatitudeMinutesMeasure() {
		return (latitudeMinutesMeasure == null) ? new LatitudeMinutesMeasureType()
				: latitudeMinutesMeasure;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LocationCoordinateType#getLatitudeMinutesMeasure <em>Latitude Minutes Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude Minutes Measure</em>' containment reference.
	 * @see #getLatitudeMinutesMeasure()
	 * @generated
	 */
	public void setLatitudeMinutesMeasure(
			LatitudeMinutesMeasureType newLatitudeMinutesMeasure) {
		latitudeMinutesMeasure = newLatitudeMinutesMeasure;
	}

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
	 * @generated
	 */
	public LatitudeDirectionCodeType getLatitudeDirectionCode() {
		return (latitudeDirectionCode == null) ? new LatitudeDirectionCodeType()
				: latitudeDirectionCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LocationCoordinateType#getLatitudeDirectionCode <em>Latitude Direction Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude Direction Code</em>' containment reference.
	 * @see #getLatitudeDirectionCode()
	 * @generated
	 */
	public void setLatitudeDirectionCode(
			LatitudeDirectionCodeType newLatitudeDirectionCode) {
		latitudeDirectionCode = newLatitudeDirectionCode;
	}

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
	 * @generated
	 */
	public LongitudeDegreesMeasureType getLongitudeDegreesMeasure() {
		return (longitudeDegreesMeasure == null) ? new LongitudeDegreesMeasureType()
				: longitudeDegreesMeasure;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LocationCoordinateType#getLongitudeDegreesMeasure <em>Longitude Degrees Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude Degrees Measure</em>' containment reference.
	 * @see #getLongitudeDegreesMeasure()
	 * @generated
	 */
	public void setLongitudeDegreesMeasure(
			LongitudeDegreesMeasureType newLongitudeDegreesMeasure) {
		longitudeDegreesMeasure = newLongitudeDegreesMeasure;
	}

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
	 * @generated
	 */
	public LongitudeMinutesMeasureType getLongitudeMinutesMeasure() {
		return (longitudeMinutesMeasure == null) ? new LongitudeMinutesMeasureType()
				: longitudeMinutesMeasure;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LocationCoordinateType#getLongitudeMinutesMeasure <em>Longitude Minutes Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude Minutes Measure</em>' containment reference.
	 * @see #getLongitudeMinutesMeasure()
	 * @generated
	 */
	public void setLongitudeMinutesMeasure(
			LongitudeMinutesMeasureType newLongitudeMinutesMeasure) {
		longitudeMinutesMeasure = newLongitudeMinutesMeasure;
	}

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
	 * @generated
	 */
	public LongitudeDirectionCodeType getLongitudeDirectionCode() {
		return (longitudeDirectionCode == null) ? new LongitudeDirectionCodeType()
				: longitudeDirectionCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LocationCoordinateType#getLongitudeDirectionCode <em>Longitude Direction Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude Direction Code</em>' containment reference.
	 * @see #getLongitudeDirectionCode()
	 * @generated
	 */
	public void setLongitudeDirectionCode(
			LongitudeDirectionCodeType newLongitudeDirectionCode) {
		longitudeDirectionCode = newLongitudeDirectionCode;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.coordinateSystemCode == null) ? 0 : this.coordinateSystemCode.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.latitudeDegreesMeasure == null) ? 0 : this.latitudeDegreesMeasure.hashCode());
		result = PRIME * result + ((this.latitudeDirectionCode == null) ? 0 : this.latitudeDirectionCode.hashCode());
		result = PRIME * result + ((this.latitudeMinutesMeasure == null) ? 0 : this.latitudeMinutesMeasure.hashCode());
		result = PRIME * result + ((this.longitudeDegreesMeasure == null) ? 0 : this.longitudeDegreesMeasure.hashCode());
		result = PRIME * result + ((this.longitudeDirectionCode == null) ? 0 : this.longitudeDirectionCode.hashCode());
		result = PRIME * result + ((this.longitudeMinutesMeasure == null) ? 0 : this.longitudeMinutesMeasure.hashCode());
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
		final LocationCoordinateType other = (LocationCoordinateType) obj;
		if (this.coordinateSystemCode == null) {
			if (other.coordinateSystemCode != null)
				return false;
		} else if (!this.coordinateSystemCode.equals(other.coordinateSystemCode))
			return false;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.latitudeDegreesMeasure == null) {
			if (other.latitudeDegreesMeasure != null)
				return false;
		} else if (!this.latitudeDegreesMeasure.equals(other.latitudeDegreesMeasure))
			return false;
		if (this.latitudeDirectionCode == null) {
			if (other.latitudeDirectionCode != null)
				return false;
		} else if (!this.latitudeDirectionCode.equals(other.latitudeDirectionCode))
			return false;
		if (this.latitudeMinutesMeasure == null) {
			if (other.latitudeMinutesMeasure != null)
				return false;
		} else if (!this.latitudeMinutesMeasure.equals(other.latitudeMinutesMeasure))
			return false;
		if (this.longitudeDegreesMeasure == null) {
			if (other.longitudeDegreesMeasure != null)
				return false;
		} else if (!this.longitudeDegreesMeasure.equals(other.longitudeDegreesMeasure))
			return false;
		if (this.longitudeDirectionCode == null) {
			if (other.longitudeDirectionCode != null)
				return false;
		} else if (!this.longitudeDirectionCode.equals(other.longitudeDirectionCode))
			return false;
		if (this.longitudeMinutesMeasure == null) {
			if (other.longitudeMinutesMeasure != null)
				return false;
		} else if (!this.longitudeMinutesMeasure.equals(other.longitudeMinutesMeasure))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // LocationCoordinateType