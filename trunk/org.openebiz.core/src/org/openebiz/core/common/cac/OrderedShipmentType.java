/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ordered Shipment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Ordered Shipment. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about an Ordered Shipment</ccts:Definition>
 *           <ccts:ObjectClass>Ordered Shipment</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.OrderedShipmentType#getShipment <em>Shipment</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.OrderedShipmentType#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrderedShipmentType implements Serializable {
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
	 * The cached value of the '{@link #getShipment() <em>Shipment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipment()
	 * @generated
	 * @ordered
	 */
	protected ShipmentType shipment = null;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected List package_ = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public OrderedShipmentType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.shipment = this.getShipment();
		this.package_ = this.getPackage();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getShipment().getID().getValue());
		return sdisplay.toString();
	}
	
	/**
	 * Returns the value of the '<em><b>Shipment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Ordered Shipment. Shipment</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Shipment</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Ordered Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Shipment</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Shipment</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shipment</em>' containment reference.
	 * @see #setShipment(ShipmentType)
	 * @generated
	 */
	public ShipmentType getShipment() {
		return (shipment == null) ? new ShipmentType() : shipment;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.OrderedShipmentType#getShipment <em>Shipment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment</em>' containment reference.
	 * @see #getShipment()
	 * @generated
	 */
	public void setShipment(ShipmentType newShipment) {
		shipment = newShipment;
	}

	/**
	 * Returns the value of the '<em><b>Package</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.PackageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Ordered Shipment. Package</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Package</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Ordered Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Package</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Package</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package</em>' containment reference list.
	 * @generated
	 */
	public List getPackage() {
		if (package_ == null) {
			package_ = new ArrayList<PackageType>();
		}
		return package_;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.package_ == null) ? 0 : this.package_.hashCode());
		result = PRIME * result + ((this.shipment == null) ? 0 : this.shipment.hashCode());
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
		final OrderedShipmentType other = (OrderedShipmentType) obj;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.package_ == null) {
			if (other.package_ != null)
				return false;
		} else if (!this.package_.equals(other.package_))
			return false;
		if (this.shipment == null) {
			if (other.shipment != null)
				return false;
		} else if (!this.shipment.equals(other.shipment))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // OrderedShipmentType