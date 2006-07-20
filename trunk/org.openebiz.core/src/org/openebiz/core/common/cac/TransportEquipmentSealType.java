/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.ConditionType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.SealIssuerTypeCodeType;
import org.openebiz.core.common.cbc.SealStatusCodeType;
import org.openebiz.core.common.cbc.SealingPartyTypeType;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transport Equipment Seal Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Transport Equipment Seal. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 * 
 *           <ccts:Definition>Information about a Transport Equipment Seal.  A security device attached to the doors of a shipping container.</ccts:Definition>
 *           <ccts:ObjectClass>Transport Equipment Seal</ccts:ObjectClass>
 *           <ccts:AlternativeBusinessTerms>Container Seal</ccts:AlternativeBusinessTerms>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentSealType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentSealType#getSealIssuerTypeCode <em>Seal Issuer Type Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentSealType#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentSealType#getSealStatusCode <em>Seal Status Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentSealType#getSealingPartyType <em>Sealing Party Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransportEquipmentSealType implements Serializable {
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
	 * The cached value of the '{@link #getSealIssuerTypeCode() <em>Seal Issuer Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSealIssuerTypeCode()
	 * @generated
	 * @ordered
	 */
	protected SealIssuerTypeCodeType sealIssuerTypeCode = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected ConditionType condition = null;

	/**
	 * The cached value of the '{@link #getSealStatusCode() <em>Seal Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSealStatusCode()
	 * @generated
	 * @ordered
	 */
	protected SealStatusCodeType sealStatusCode = null;

	/**
	 * The cached value of the '{@link #getSealingPartyType() <em>Sealing Party Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSealingPartyType()
	 * @generated
	 * @ordered
	 */
	protected SealingPartyTypeType sealingPartyType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public TransportEquipmentSealType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.iD = this.getID();
		this.sealIssuerTypeCode = this.getSealIssuerTypeCode();
		this.condition = this.getCondition();
		this.sealStatusCode = this.getSealStatusCode();
		this.sealingPartyType = this.getSealingPartyType();
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
	 *               <ccts:DictionaryEntryName>Transport Equipment Seal. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the seal</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment Seal</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:Examples>"ACS1234"</ccts:Examples>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportEquipmentSealType#getID <em>ID</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Seal Issuer Type Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Equipment Seal. Seal Issuer Type. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The type of party that issues and is responsible for a seal; expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment Seal</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Seal Issuer Type</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Seal Issuer Type Code</em>' containment reference.
	 * @see #setSealIssuerTypeCode(SealIssuerTypeCodeType)
	 * @generated
	 */
	public SealIssuerTypeCodeType getSealIssuerTypeCode() {
		return (sealIssuerTypeCode == null) ? new SealIssuerTypeCodeType()
				: sealIssuerTypeCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportEquipmentSealType#getSealIssuerTypeCode <em>Seal Issuer Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seal Issuer Type Code</em>' containment reference.
	 * @see #getSealIssuerTypeCode()
	 * @generated
	 */
	public void setSealIssuerTypeCode(
			SealIssuerTypeCodeType newSealIssuerTypeCode) {
		sealIssuerTypeCode = newSealIssuerTypeCode;
	}

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Equipment Seal. Condition. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Information about the condition of a seal</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment Seal</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Condition</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(ConditionType)
	 * @generated
	 */
	public ConditionType getCondition() {
		return (condition == null) ? new ConditionType() : condition;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportEquipmentSealType#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	public void setCondition(ConditionType newCondition) {
		condition = newCondition;
	}

	/**
	 * Returns the value of the '<em><b>Seal Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Equipment Seal. Seal Status. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The status of a seal expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment Seal</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Seal Status</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Seal Status Code</em>' containment reference.
	 * @see #setSealStatusCode(SealStatusCodeType)
	 * @generated
	 */
	public SealStatusCodeType getSealStatusCode() {
		return (sealStatusCode == null) ? new SealStatusCodeType()
				: sealStatusCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportEquipmentSealType#getSealStatusCode <em>Seal Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seal Status Code</em>' containment reference.
	 * @see #getSealStatusCode()
	 * @generated
	 */
	public void setSealStatusCode(SealStatusCodeType newSealStatusCode) {
		sealStatusCode = newSealStatusCode;
	}

	/**
	 * Returns the value of the '<em><b>Sealing Party Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Equipment Seal. Sealing Party Type. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Textual description of the role of a sealing party.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment Seal</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Sealing Party Type</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Sealing Party</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sealing Party Type</em>' containment reference.
	 * @see #setSealingPartyType(SealingPartyTypeType)
	 * @generated
	 */
	public SealingPartyTypeType getSealingPartyType() {
		return (sealingPartyType == null) ? new SealingPartyTypeType()
				: sealingPartyType;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportEquipmentSealType#getSealingPartyType <em>Sealing Party Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sealing Party Type</em>' containment reference.
	 * @see #getSealingPartyType()
	 * @generated
	 */
	public void setSealingPartyType(SealingPartyTypeType newSealingPartyType) {
		sealingPartyType = newSealingPartyType;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.condition == null) ? 0 : this.condition.hashCode());
		result = PRIME * result + ((this.iD == null) ? 0 : this.iD.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.sealIssuerTypeCode == null) ? 0 : this.sealIssuerTypeCode.hashCode());
		result = PRIME * result + ((this.sealStatusCode == null) ? 0 : this.sealStatusCode.hashCode());
		result = PRIME * result + ((this.sealingPartyType == null) ? 0 : this.sealingPartyType.hashCode());
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
		final TransportEquipmentSealType other = (TransportEquipmentSealType) obj;
		if (this.condition == null) {
			if (other.condition != null)
				return false;
		} else if (!this.condition.equals(other.condition))
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
		if (this.sealIssuerTypeCode == null) {
			if (other.sealIssuerTypeCode != null)
				return false;
		} else if (!this.sealIssuerTypeCode.equals(other.sealIssuerTypeCode))
			return false;
		if (this.sealStatusCode == null) {
			if (other.sealStatusCode != null)
				return false;
		} else if (!this.sealStatusCode.equals(other.sealStatusCode))
			return false;
		if (this.sealingPartyType == null) {
			if (other.sealingPartyType != null)
				return false;
		} else if (!this.sealingPartyType.equals(other.sealingPartyType))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // TransportEquipmentSealType