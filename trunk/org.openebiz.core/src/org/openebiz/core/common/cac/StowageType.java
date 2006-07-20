/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.LocationIDType;
import org.openebiz.core.common.cbc.LocationType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stowage Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Stowage. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>A location on board a means of transport where specified goods or transport equipment have been or are to be stowed.</ccts:Definition>
 *           <ccts:ObjectClass>Stowage</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.StowageType#getLocationID <em>Location ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.StowageType#getLocation <em>Location</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.StowageType#getMeasurementDimension <em>Measurement Dimension</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StowageType implements Serializable {
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
	 * The cached value of the '{@link #getLocationID() <em>Location ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationID()
	 * @generated
	 * @ordered
	 */
	protected LocationIDType locationID = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected List location = null;

	/**
	 * The cached value of the '{@link #getMeasurementDimension() <em>Measurement Dimension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementDimension()
	 * @generated
	 * @ordered
	 */
	protected List measurementDimension = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public StowageType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.locationID = this.getLocationID();
		this.location = this.getLocation();
		this.measurementDimension = this.getMeasurementDimension();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getLocationID().getValue());
		return sdisplay.toString();
	}

	/**
	 * Returns the value of the '<em><b>Location ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Stowage. Location Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>To identify a location on board a means of transport where specified goods or transport equipment have been or are to be stowed.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Stowage</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Location Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Cell Location, coded</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location ID</em>' containment reference.
	 * @see #setLocationID(LocationIDType)
	 * @generated
	 */
	public LocationIDType getLocationID() {
		return (locationID == null) ? new LocationIDType() : locationID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.StowageType#getLocationID <em>Location ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location ID</em>' containment reference.
	 * @see #getLocationID()
	 * @generated
	 */
	public void setLocationID(LocationIDType newLocationID) {
		locationID = newLocationID;
	}

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cbc.LocationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Stowage. Location. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Description of a location on board a means of transport where specified goods or transport equipment have been or are to be stowed.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Stowage</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Location</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Cell Location</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference list.
	 * @generated
	 */
	public List getLocation() {
		if (location == null) {
			location = new ArrayList<LocationType>();
		}
		return location;
	}

	/**
	 * Returns the value of the '<em><b>Measurement Dimension</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.DimensionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Stowage. Measurement_ Dimension. Dimension</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Associates any meaurements (including lengths, mass and volume) for this stowage.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Stowage</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Measurement</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Dimension</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Dimension</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measurement Dimension</em>' containment reference list.
	 * @generated
	 */
	public List getMeasurementDimension() {
		if (measurementDimension == null) {
			measurementDimension = new ArrayList<DimensionType>();
		}
		return measurementDimension;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.location == null) ? 0 : this.location.hashCode());
		result = PRIME * result + ((this.locationID == null) ? 0 : this.locationID.hashCode());
		result = PRIME * result + ((this.measurementDimension == null) ? 0 : this.measurementDimension.hashCode());
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
		final StowageType other = (StowageType) obj;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.location == null) {
			if (other.location != null)
				return false;
		} else if (!this.location.equals(other.location))
			return false;
		if (this.locationID == null) {
			if (other.locationID != null)
				return false;
		} else if (!this.locationID.equals(other.locationID))
			return false;
		if (this.measurementDimension == null) {
			if (other.measurementDimension != null)
				return false;
		} else if (!this.measurementDimension.equals(other.measurementDimension))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // StowageType