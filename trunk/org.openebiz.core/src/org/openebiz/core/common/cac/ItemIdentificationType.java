/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.IDType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Identification Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Item Identification. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about Item identification</ccts:Definition>
 *           <ccts:ObjectClass>Item Identification</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.ItemIdentificationType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemIdentificationType#getPhysicalAttribute <em>Physical Attribute</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemIdentificationType#getMeasurementDimension <em>Measurement Dimension</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemIdentificationType#getIssuerParty <em>Issuer Party</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemIdentificationType implements Serializable {
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
	 * The cached value of the '{@link #getPhysicalAttribute() <em>Physical Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalAttribute()
	 * @generated
	 * @ordered
	 */
	protected List physicalAttribute = null;

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
	 * The cached value of the '{@link #getIssuerParty() <em>Issuer Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuerParty()
	 * @generated
	 * @ordered
	 */
	protected PartyType issuerParty = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ItemIdentificationType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.iD = this.getID();
		this.physicalAttribute = this.getPhysicalAttribute();
		this.measurementDimension = this.getMeasurementDimension();
		this.issuerParty = this.getIssuerParty();
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
	 *               <ccts:DictionaryEntryName>Item Identification. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An identifier for an Item</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item Identification</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:Examples>"CUST001" "3333-44-123"</ccts:Examples>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemIdentificationType#getID <em>ID</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Physical Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.PhysicalAttributeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item Identification. Physical Attribute</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Physical Attribute</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item Identification</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Physical Attribute</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Physical Attribute</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Attribute</em>' containment reference list.
	 * @generated
	 */
	public List getPhysicalAttribute() {
		if (physicalAttribute == null) {
			physicalAttribute = new ArrayList<
					PhysicalAttributeType>();
		}
		return physicalAttribute;
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
	 *               <ccts:DictionaryEntryName>Item Identification. Measurement_ Dimension. Dimension</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Measement Dimension</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item Identification</ccts:ObjectClass>
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

	/**
	 * Returns the value of the '<em><b>Issuer Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item Identification. Issuer_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Issuer Party i.e. the Party that issued the Item Identification</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item Identification</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Issuer</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issuer Party</em>' containment reference.
	 * @see #setIssuerParty(PartyType)
	 * @generated
	 */
	public PartyType getIssuerParty() {
		return (issuerParty == null) ? new PartyType() : issuerParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemIdentificationType#getIssuerParty <em>Issuer Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuer Party</em>' containment reference.
	 * @see #getIssuerParty()
	 * @generated
	 */
	public void setIssuerParty(PartyType newIssuerParty) {
		issuerParty = newIssuerParty;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.iD == null) ? 0 : this.iD.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.issuerParty == null) ? 0 : this.issuerParty.hashCode());
		result = PRIME * result + ((this.measurementDimension == null) ? 0 : this.measurementDimension.hashCode());
		result = PRIME * result + ((this.physicalAttribute == null) ? 0 : this.physicalAttribute.hashCode());
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
		final ItemIdentificationType other = (ItemIdentificationType) obj;
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
		if (this.issuerParty == null) {
			if (other.issuerParty != null)
				return false;
		} else if (!this.issuerParty.equals(other.issuerParty))
			return false;
		if (this.measurementDimension == null) {
			if (other.measurementDimension != null)
				return false;
		} else if (!this.measurementDimension.equals(other.measurementDimension))
			return false;
		if (this.physicalAttribute == null) {
			if (other.physicalAttribute != null)
				return false;
		} else if (!this.physicalAttribute.equals(other.physicalAttribute))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // ItemIdentificationType