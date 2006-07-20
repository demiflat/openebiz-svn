/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.RailCarIDType;
import org.openebiz.core.common.cbc.TrainIDType;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rail Transport Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Rail Transport. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Describes a train</ccts:Definition>
 *           <ccts:ObjectClass>Rail Transport</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.RailTransportType#getTrainID <em>Train ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.RailTransportType#getRailCarID <em>Rail Car ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RailTransportType implements Serializable {
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
	 * The cached value of the '{@link #getTrainID() <em>Train ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainID()
	 * @generated
	 * @ordered
	 */
	protected TrainIDType trainID = null;

	/**
	 * The cached value of the '{@link #getRailCarID() <em>Rail Car ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRailCarID()
	 * @generated
	 * @ordered
	 */
	protected RailCarIDType railCarID = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public RailTransportType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.trainID = this.getTrainID();
		this.railCarID = this.getRailCarID();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getRailCarID().getValue());
		sdisplay.append(" | ");
		sdisplay.append(this.getTrainID().getValue());
		return sdisplay.toString();
	}

	/**
	 * Returns the value of the '<em><b>Train ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Rail Transport. Train Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Identifier for a train</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Rail Transport</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Train Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Train Number (WCO ID 167)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Train ID</em>' containment reference.
	 * @see #setTrainID(TrainIDType)
	 * @generated
	 */
	public TrainIDType getTrainID() {
		return (trainID == null) ? new TrainIDType() : trainID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.RailTransportType#getTrainID <em>Train ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train ID</em>' containment reference.
	 * @see #getTrainID()
	 * @generated
	 */
	public void setTrainID(TrainIDType newTrainID) {
		trainID = newTrainID;
	}

	/**
	 * Returns the value of the '<em><b>Rail Car ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Rail Transport. Rail Car Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifer for the rail car on the train used for the means of transport</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Rail Transport</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Rail Car Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rail Car ID</em>' containment reference.
	 * @see #setRailCarID(RailCarIDType)
	 * @generated
	 */
	public RailCarIDType getRailCarID() {
		return (railCarID == null) ? new RailCarIDType() : railCarID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.RailTransportType#getRailCarID <em>Rail Car ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rail Car ID</em>' containment reference.
	 * @see #getRailCarID()
	 * @generated
	 */
	public void setRailCarID(RailCarIDType newRailCarID) {
		railCarID = newRailCarID;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.railCarID == null) ? 0 : this.railCarID.hashCode());
		result = PRIME * result + ((this.trainID == null) ? 0 : this.trainID.hashCode());
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
		final RailTransportType other = (RailTransportType) obj;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.railCarID == null) {
			if (other.railCarID != null)
				return false;
		} else if (!this.railCarID.equals(other.railCarID))
			return false;
		if (this.trainID == null) {
			if (other.trainID != null)
				return false;
		} else if (!this.trainID.equals(other.trainID))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // RailTransportType