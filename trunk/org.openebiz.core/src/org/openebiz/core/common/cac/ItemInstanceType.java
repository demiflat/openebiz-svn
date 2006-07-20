/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.ManufactureDateTimeType;
import org.openebiz.core.common.cbc.ProductTraceIDType;
import org.openebiz.core.common.cbc.RegistrationDateTimeType;
import org.openebiz.core.common.cbc.RegistrationIDType;
import org.openebiz.core.common.cbc.SerialIDType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Instance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Item Instance. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about a specific instance of an Item</ccts:Definition>
 *           <ccts:ObjectClass>Item Instance</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.ItemInstanceType#getProductTraceID <em>Product Trace ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemInstanceType#getManufactureDateTime <em>Manufacture Date Time</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemInstanceType#getRegistrationDateTime <em>Registration Date Time</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemInstanceType#getRegistrationID <em>Registration ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemInstanceType#getSerialID <em>Serial ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemInstanceType#getAdditionalItemProperty <em>Additional Item Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemInstanceType implements Serializable {
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
	 * The cached value of the '{@link #getProductTraceID() <em>Product Trace ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductTraceID()
	 * @generated
	 * @ordered
	 */
	protected ProductTraceIDType productTraceID = null;

	/**
	 * The cached value of the '{@link #getManufactureDateTime() <em>Manufacture Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufactureDateTime()
	 * @generated
	 * @ordered
	 */
	protected ManufactureDateTimeType manufactureDateTime = null;

	/**
	 * The cached value of the '{@link #getRegistrationDateTime() <em>Registration Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrationDateTime()
	 * @generated
	 * @ordered
	 */
	protected RegistrationDateTimeType registrationDateTime = null;

	/**
	 * The cached value of the '{@link #getRegistrationID() <em>Registration ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrationID()
	 * @generated
	 * @ordered
	 */
	protected RegistrationIDType registrationID = null;

	/**
	 * The cached value of the '{@link #getSerialID() <em>Serial ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialID()
	 * @generated
	 * @ordered
	 */
	protected SerialIDType serialID = null;

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
	public ItemInstanceType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.productTraceID = this.getProductTraceID();
		this.manufactureDateTime = this.getManufactureDateTime();
		this.registrationDateTime = this.getRegistrationDateTime();
		this.registrationID = this.getRegistrationID();
		this.serialID = this.getSerialID();
		this.additionalItemProperty = this.getAdditionalItemProperty();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getRegistrationID().getValue());
		return sdisplay.toString();
	}
	
	/**
	 * Returns the value of the '<em><b>Product Trace ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item Instance. Product_ Trace Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An identifier used for tracing the Item such as EPC number used in RFID</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item Instance</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Product</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Trace Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product Trace ID</em>' containment reference.
	 * @see #setProductTraceID(ProductTraceIDType)
	 * @generated
	 */
	public ProductTraceIDType getProductTraceID() {
		return (productTraceID == null) ? new ProductTraceIDType()
				: productTraceID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemInstanceType#getProductTraceID <em>Product Trace ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Trace ID</em>' containment reference.
	 * @see #getProductTraceID()
	 * @generated
	 */
	public void setProductTraceID(ProductTraceIDType newProductTraceID) {
		productTraceID = newProductTraceID;
	}

	/**
	 * Returns the value of the '<em><b>Manufacture Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item Instance. Manufacture Date Time. Date Time</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The date of manufacture of the Item Instance</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item Instance</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Manufacture Date Time</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date Time</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date Time. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacture Date Time</em>' containment reference.
	 * @see #setManufactureDateTime(ManufactureDateTimeType)
	 * @generated
	 */
	public ManufactureDateTimeType getManufactureDateTime() {
		return (manufactureDateTime == null) ? new ManufactureDateTimeType()
				: manufactureDateTime;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemInstanceType#getManufactureDateTime <em>Manufacture Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacture Date Time</em>' containment reference.
	 * @see #getManufactureDateTime()
	 * @generated
	 */
	public void setManufactureDateTime(
			ManufactureDateTimeType newManufactureDateTime) {
		manufactureDateTime = newManufactureDateTime;
	}

	/**
	 * Returns the value of the '<em><b>Registration Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item Instance. Registration Date Time. Date Time</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The date of registration of the Item Instance</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item Instance</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Registration Date Time</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date Time</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date Time. Type</ccts:DataType>
	 *               <ccts:Examples>date of first registration of a car.</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Registration Date Time</em>' containment reference.
	 * @see #setRegistrationDateTime(RegistrationDateTimeType)
	 * @generated
	 */
	public RegistrationDateTimeType getRegistrationDateTime() {
		return (registrationDateTime == null) ? new RegistrationDateTimeType()
				: registrationDateTime;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemInstanceType#getRegistrationDateTime <em>Registration Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registration Date Time</em>' containment reference.
	 * @see #getRegistrationDateTime()
	 * @generated
	 */
	public void setRegistrationDateTime(
			RegistrationDateTimeType newRegistrationDateTime) {
		registrationDateTime = newRegistrationDateTime;
	}

	/**
	 * Returns the value of the '<em><b>Registration ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item Instance. Registration Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The registration identifier for the Item Instance</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item Instance</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Registration Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:Examples>car registration or licensing number</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Registration ID</em>' containment reference.
	 * @see #setRegistrationID(RegistrationIDType)
	 * @generated
	 */
	public RegistrationIDType getRegistrationID() {
		return (registrationID == null) ? new RegistrationIDType()
				: registrationID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemInstanceType#getRegistrationID <em>Registration ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registration ID</em>' containment reference.
	 * @see #getRegistrationID()
	 * @generated
	 */
	public void setRegistrationID(RegistrationIDType newRegistrationID) {
		registrationID = newRegistrationID;
	}

	/**
	 * Returns the value of the '<em><b>Serial ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item Instance. Serial Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The serial number of the Item Instance</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item Instance</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Serial Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:Examples>chassis number of a car</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Serial ID</em>' containment reference.
	 * @see #setSerialID(SerialIDType)
	 * @generated
	 */
	public SerialIDType getSerialID() {
		return (serialID == null) ? new SerialIDType() : serialID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemInstanceType#getSerialID <em>Serial ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial ID</em>' containment reference.
	 * @see #getSerialID()
	 * @generated
	 */
	public void setSerialID(SerialIDType newSerialID) {
		serialID = newSerialID;
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
	 *               <ccts:DictionaryEntryName>Item Instance. Additional_ Item Property. Item Property</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Additional Item Property</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item Instance</ccts:ObjectClass>
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
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.manufactureDateTime == null) ? 0 : this.manufactureDateTime.hashCode());
		result = PRIME * result + ((this.productTraceID == null) ? 0 : this.productTraceID.hashCode());
		result = PRIME * result + ((this.registrationDateTime == null) ? 0 : this.registrationDateTime.hashCode());
		result = PRIME * result + ((this.registrationID == null) ? 0 : this.registrationID.hashCode());
		result = PRIME * result + ((this.serialID == null) ? 0 : this.serialID.hashCode());
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
		final ItemInstanceType other = (ItemInstanceType) obj;
		if (this.additionalItemProperty == null) {
			if (other.additionalItemProperty != null)
				return false;
		} else if (!this.additionalItemProperty.equals(other.additionalItemProperty))
			return false;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.manufactureDateTime == null) {
			if (other.manufactureDateTime != null)
				return false;
		} else if (!this.manufactureDateTime.equals(other.manufactureDateTime))
			return false;
		if (this.productTraceID == null) {
			if (other.productTraceID != null)
				return false;
		} else if (!this.productTraceID.equals(other.productTraceID))
			return false;
		if (this.registrationDateTime == null) {
			if (other.registrationDateTime != null)
				return false;
		} else if (!this.registrationDateTime.equals(other.registrationDateTime))
			return false;
		if (this.registrationID == null) {
			if (other.registrationID != null)
				return false;
		} else if (!this.registrationID.equals(other.registrationID))
			return false;
		if (this.serialID == null) {
			if (other.serialID != null)
				return false;
		} else if (!this.serialID.equals(other.serialID))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // ItemInstanceType