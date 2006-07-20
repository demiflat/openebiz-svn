/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.EmergencyProceduresCodeType;
import org.openebiz.core.common.cbc.ExtensionType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.PlacardEndorsementType;
import org.openebiz.core.common.cbc.PlacardNotationType;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Secondary Hazard Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Secondary Hazard. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about Secondary Hazard (related to a Hazardous Item)</ccts:Definition>
 *           <ccts:ObjectClass>Secondary Hazard</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.SecondaryHazardType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.SecondaryHazardType#getPlacardNotation <em>Placard Notation</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.SecondaryHazardType#getPlacardEndorsement <em>Placard Endorsement</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.SecondaryHazardType#getEmergencyProceduresCode <em>Emergency Procedures Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.SecondaryHazardType#getExtension <em>Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SecondaryHazardType implements Serializable {
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
	 * The cached value of the '{@link #getPlacardNotation() <em>Placard Notation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacardNotation()
	 * @generated
	 * @ordered
	 */
	protected PlacardNotationType placardNotation = null;

	/**
	 * The cached value of the '{@link #getPlacardEndorsement() <em>Placard Endorsement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacardEndorsement()
	 * @generated
	 * @ordered
	 */
	protected PlacardEndorsementType placardEndorsement = null;

	/**
	 * The cached value of the '{@link #getEmergencyProceduresCode() <em>Emergency Procedures Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmergencyProceduresCode()
	 * @generated
	 * @ordered
	 */
	protected EmergencyProceduresCodeType emergencyProceduresCode = null;

	/**
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected ExtensionType extension = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public SecondaryHazardType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.iD = this.getID();
		this.placardNotation = this.getPlacardNotation();
		this.placardEndorsement = this.getPlacardEndorsement();
		this.emergencyProceduresCode = this.getEmergencyProceduresCode();
		this.extension = this.getExtension();
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
	 *               <ccts:DictionaryEntryName>Secondary Hazard. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the Secondary Hazard</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Secondary Hazard</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SecondaryHazardType#getID <em>ID</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Placard Notation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Secondary Hazard. Placard Notation. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The placard notation corresponding to the hazard class of the hazardous commodity. Can also be the hazard identification number of the orange placard (upper part) required on the means of transport</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Secondary Hazard</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Placard Notation</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:Examples>"5.1"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Placard Notation</em>' containment reference.
	 * @see #setPlacardNotation(PlacardNotationType)
	 * @generated
	 */
	public PlacardNotationType getPlacardNotation() {
		return (placardNotation == null) ? new PlacardNotationType()
				: placardNotation;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SecondaryHazardType#getPlacardNotation <em>Placard Notation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placard Notation</em>' containment reference.
	 * @see #getPlacardNotation()
	 * @generated
	 */
	public void setPlacardNotation(PlacardNotationType newPlacardNotation) {
		placardNotation = newPlacardNotation;
	}

	/**
	 * Returns the value of the '<em><b>Placard Endorsement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Secondary Hazard. Placard Endorsement. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The placard endorsement that is to be shown on the shipping papers for the hazardous commodity. Can also be used for the number of the orange placard (lower part) required on the means of transport</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Secondary Hazard</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Placard Endorsement</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:Examples>"2"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Placard Endorsement</em>' containment reference.
	 * @see #setPlacardEndorsement(PlacardEndorsementType)
	 * @generated
	 */
	public PlacardEndorsementType getPlacardEndorsement() {
		return (placardEndorsement == null) ? new PlacardEndorsementType()
				: placardEndorsement;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SecondaryHazardType#getPlacardEndorsement <em>Placard Endorsement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placard Endorsement</em>' containment reference.
	 * @see #getPlacardEndorsement()
	 * @generated
	 */
	public void setPlacardEndorsement(
			PlacardEndorsementType newPlacardEndorsement) {
		placardEndorsement = newPlacardEndorsement;
	}

	/**
	 * Returns the value of the '<em><b>Emergency Procedures Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Secondary Hazard. Emergency Procedures Code. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Emergency procedures for hazardous goods expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Secondary Hazard</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Emergency Procedures Code</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>EMG code, EMS Page Number</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Emergency Procedures Code</em>' containment reference.
	 * @see #setEmergencyProceduresCode(EmergencyProceduresCodeType)
	 * @generated
	 */
	public EmergencyProceduresCodeType getEmergencyProceduresCode() {
		return (emergencyProceduresCode == null) ? new EmergencyProceduresCodeType()
				: emergencyProceduresCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SecondaryHazardType#getEmergencyProceduresCode <em>Emergency Procedures Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emergency Procedures Code</em>' containment reference.
	 * @see #getEmergencyProceduresCode()
	 * @generated
	 */
	public void setEmergencyProceduresCode(
			EmergencyProceduresCodeType newEmergencyProceduresCode) {
		emergencyProceduresCode = newEmergencyProceduresCode;
	}

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Secondary Hazard. Extension. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Additional information about the hazardous substance. Can be used to specify information such as the type of regulatory requirements that apply to a description</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Secondary Hazard</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Extension</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:Examples>"N.O.S. or a Waste Characteristics Code in conjunction with an EPA Waste Stream code"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extension</em>' containment reference.
	 * @see #setExtension(ExtensionType)
	 * @generated
	 */
	public ExtensionType getExtension() {
		return (extension == null) ? new ExtensionType() : extension;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SecondaryHazardType#getExtension <em>Extension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' containment reference.
	 * @see #getExtension()
	 * @generated
	 */
	public void setExtension(ExtensionType newExtension) {
		extension = newExtension;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.emergencyProceduresCode == null) ? 0 : this.emergencyProceduresCode.hashCode());
		result = PRIME * result + ((this.extension == null) ? 0 : this.extension.hashCode());
		result = PRIME * result + ((this.iD == null) ? 0 : this.iD.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.placardEndorsement == null) ? 0 : this.placardEndorsement.hashCode());
		result = PRIME * result + ((this.placardNotation == null) ? 0 : this.placardNotation.hashCode());
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
		final SecondaryHazardType other = (SecondaryHazardType) obj;
		if (this.emergencyProceduresCode == null) {
			if (other.emergencyProceduresCode != null)
				return false;
		} else if (!this.emergencyProceduresCode.equals(other.emergencyProceduresCode))
			return false;
		if (this.extension == null) {
			if (other.extension != null)
				return false;
		} else if (!this.extension.equals(other.extension))
			return false;
		if (this.iD == null) {
			if (other.iD != null)
				return false;
		} else if (!this.iD.equals(other.iD))
			return false;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.placardEndorsement == null) {
			if (other.placardEndorsement != null)
				return false;
		} else if (!this.placardEndorsement.equals(other.placardEndorsement))
			return false;
		if (this.placardNotation == null) {
			if (other.placardNotation != null)
				return false;
		} else if (!this.placardNotation.equals(other.placardNotation))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // SecondaryHazardType