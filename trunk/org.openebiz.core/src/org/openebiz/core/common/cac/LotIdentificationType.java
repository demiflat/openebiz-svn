/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.ExpiryDateType;
import org.openebiz.core.common.cbc.LotNumberIDType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lot Identification Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Lot Identification. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about a Lot (of Item Instances)</ccts:Definition>
 *           <ccts:ObjectClass>Lot Identification</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.LotIdentificationType#getLotNumberID <em>Lot Number ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LotIdentificationType#getExpiryDate <em>Expiry Date</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LotIdentificationType#getAdditionalItemProperty <em>Additional Item Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LotIdentificationType implements Serializable {
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
	 * The cached value of the '{@link #getLotNumberID() <em>Lot Number ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLotNumberID()
	 * @generated
	 * @ordered
	 */
	protected LotNumberIDType lotNumberID = null;

	/**
	 * The cached value of the '{@link #getExpiryDate() <em>Expiry Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiryDate()
	 * @generated
	 * @ordered
	 */
	protected ExpiryDateType expiryDate = null;

	/**
	 * The cached value of the '{@link #getAdditionalItemProperty() <em>Additional Item Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalItemProperty()
	 * @generated
	 * @ordered
	 */
	protected List additionalItemProperty = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public LotIdentificationType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.lotNumberID = this.getLotNumberID();
		this.expiryDate = this.getExpiryDate();
		this.additionalItemProperty = this.getAdditionalItemProperty();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getLotNumberID().getValue());
		return sdisplay.toString();
	}
	
	/**
	 * Returns the value of the '<em><b>Lot Number ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Lot Identification. Lot Number. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the Lot</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Lot Identification</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Lot Number</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lot Number ID</em>' containment reference.
	 * @see #setLotNumberID(LotNumberIDType)
	 * @generated
	 */
	public LotNumberIDType getLotNumberID() {
		return (lotNumberID == null) ? new LotNumberIDType() : lotNumberID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LotIdentificationType#getLotNumberID <em>Lot Number ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lot Number ID</em>' containment reference.
	 * @see #getLotNumberID()
	 * @generated
	 */
	public void setLotNumberID(LotNumberIDType newLotNumberID) {
		lotNumberID = newLotNumberID;
	}

	/**
	 * Returns the value of the '<em><b>Expiry Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Lot Identification. Expiry Date. Date</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The expiry date of the Lot</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Lot Identification</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Expiry Date</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expiry Date</em>' containment reference.
	 * @see #setExpiryDate(ExpiryDateType)
	 * @generated
	 */
	public ExpiryDateType getExpiryDate() {
		return (expiryDate == null) ? new ExpiryDateType() : expiryDate;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LotIdentificationType#getExpiryDate <em>Expiry Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiry Date</em>' containment reference.
	 * @see #getExpiryDate()
	 * @generated
	 */
	public void setExpiryDate(ExpiryDateType newExpiryDate) {
		expiryDate = newExpiryDate;
	}

	/**
	 * Returns the value of the '<em><b>Additional Item Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.ItemPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Lot Identification. Additional_ Item Property. Item Property</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Additional Item Property</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Lot Identification</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Additional</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Item Property</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Item Property</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Item Property</em>' containment reference list.
	 * @generated
	 */
	public List getAdditionalItemProperty() {
		if (additionalItemProperty == null) {
			additionalItemProperty = new ArrayList<
					ItemPropertyType>();
		}
		return additionalItemProperty;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.additionalItemProperty == null) ? 0 : this.additionalItemProperty.hashCode());
		result = PRIME * result + ((this.expiryDate == null) ? 0 : this.expiryDate.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.lotNumberID == null) ? 0 : this.lotNumberID.hashCode());
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
		final LotIdentificationType other = (LotIdentificationType) obj;
		if (this.additionalItemProperty == null) {
			if (other.additionalItemProperty != null)
				return false;
		} else if (!this.additionalItemProperty.equals(other.additionalItemProperty))
			return false;
		if (this.expiryDate == null) {
			if (other.expiryDate != null)
				return false;
		} else if (!this.expiryDate.equals(other.expiryDate))
			return false;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.lotNumberID == null) {
			if (other.lotNumberID != null)
				return false;
		} else if (!this.lotNumberID.equals(other.lotNumberID))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // LotIdentificationType