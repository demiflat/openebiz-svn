/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.VesselIDType;
import org.openebiz.core.common.cbc.VesselNameType;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maritime Transport Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Maritime Transport. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Describes a water (including sea, river and canal) transport vessel.</ccts:Definition>
 *           <ccts:ObjectClass>Maritime Transport</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.MaritimeTransportType#getVesselID <em>Vessel ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.MaritimeTransportType#getVesselName <em>Vessel Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MaritimeTransportType implements Serializable {
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
	 * The cached value of the '{@link #getVesselID() <em>Vessel ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVesselID()
	 * @generated
	 * @ordered
	 */
	protected VesselIDType vesselID = null;

	/**
	 * The cached value of the '{@link #getVesselName() <em>Vessel Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVesselName()
	 * @generated
	 * @ordered
	 */
	protected VesselNameType vesselName = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public MaritimeTransportType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.vesselID = this.getVesselID();
		this.vesselName = this.getVesselName();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getVesselID());
		sdisplay.append(" | ");
		sdisplay.append(this.getVesselName());
		return sdisplay.toString();
	}
	
	/**
	 * Returns the value of the '<em><b>Vessel ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Maritime Transport. Vessel Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>To identify a specific vessel</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Maritime Transport</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Vessel Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Lloyds Number, Registration Number (WCO ID 167)</ccts:AlternativeBusinessTerms>
	 *               <ccts:Examples>International Maritime Organisation number of a vessel</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vessel ID</em>' containment reference.
	 * @see #setVesselID(VesselIDType)
	 * @generated
	 */
	public VesselIDType getVesselID() {
		return (vesselID == null) ? new VesselIDType() : vesselID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.MaritimeTransportType#getVesselID <em>Vessel ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vessel ID</em>' containment reference.
	 * @see #getVesselID()
	 * @generated
	 */
	public void setVesselID(VesselIDType newVesselID) {
		vesselID = newVesselID;
	}

	/**
	 * Returns the value of the '<em><b>Vessel Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Maritime Transport. Vessel Name. Name</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The name of the vessel</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Maritime Transport</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Vessel Name</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Name</ccts:RepresentationTerm>
	 *               <ccts:DataType>Name. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Ships Name</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vessel Name</em>' containment reference.
	 * @see #setVesselName(VesselNameType)
	 * @generated
	 */
	public VesselNameType getVesselName() {
		return (vesselName == null) ? new VesselNameType() : vesselName;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.MaritimeTransportType#getVesselName <em>Vessel Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vessel Name</em>' containment reference.
	 * @see #getVesselName()
	 * @generated
	 */
	public void setVesselName(VesselNameType newVesselName) {
		vesselName = newVesselName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.version == null) ? 0 : this.version.hashCode());
		result = PRIME * result + ((this.vesselID == null) ? 0 : this.vesselID.hashCode());
		result = PRIME * result + ((this.vesselName == null) ? 0 : this.vesselName.hashCode());
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
		final MaritimeTransportType other = (MaritimeTransportType) obj;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		if (this.vesselID == null) {
			if (other.vesselID != null)
				return false;
		} else if (!this.vesselID.equals(other.vesselID))
			return false;
		if (this.vesselName == null) {
			if (other.vesselName != null)
				return false;
		} else if (!this.vesselName.equals(other.vesselName))
			return false;
		return true;
	}

} // MaritimeTransportType