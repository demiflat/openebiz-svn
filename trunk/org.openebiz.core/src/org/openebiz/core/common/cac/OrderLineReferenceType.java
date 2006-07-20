/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.GUIDType;
import org.openebiz.core.common.cbc.LineIDType;
import org.openebiz.core.common.cbc.LineStatusCodeType;
import org.openebiz.core.common.cbc.SalesOrderLineIDType;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Line Reference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Order Line Reference. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about an Order Line Reference</ccts:Definition>
 *           <ccts:ObjectClass>Order Line Reference</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.OrderLineReferenceType#getLineID <em>Line ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.OrderLineReferenceType#getSalesOrderLineID <em>Sales Order Line ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.OrderLineReferenceType#getGUID <em>GUID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.OrderLineReferenceType#getLineStatusCode <em>Line Status Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.OrderLineReferenceType#getOrderReference <em>Order Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrderLineReferenceType implements Serializable {
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
	 * The cached value of the '{@link #getLineID() <em>Line ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineID()
	 * @generated
	 * @ordered
	 */
	protected LineIDType lineID = null;

	/**
	 * The cached value of the '{@link #getSalesOrderLineID() <em>Sales Order Line ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesOrderLineID()
	 * @generated
	 * @ordered
	 */
	protected SalesOrderLineIDType salesOrderLineID = null;

	/**
	 * The cached value of the '{@link #getGUID() <em>GUID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGUID()
	 * @generated
	 * @ordered
	 */
	protected GUIDType gUID = null;

	/**
	 * The cached value of the '{@link #getLineStatusCode() <em>Line Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStatusCode()
	 * @generated
	 * @ordered
	 */
	protected LineStatusCodeType lineStatusCode = null;

	/**
	 * The cached value of the '{@link #getOrderReference() <em>Order Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderReference()
	 * @generated
	 * @ordered
	 */
	protected OrderReferenceType orderReference = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public OrderLineReferenceType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.lineID = this.getLineID();
		this.salesOrderLineID = this.getSalesOrderLineID();
		this.gUID = this.getGUID();
		this.lineStatusCode = this.getLineStatusCode();
		this.orderReference = this.getOrderReference();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getLineID().getValue());
		return sdisplay.toString();
	}
	
	/**
	 * Returns the value of the '<em><b>Line ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order Line Reference. Line Identifier. Identifier</ccts:DictionaryEntryName>
	 * 
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the referenced Order Line assigned by the Buyer</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order Line Reference</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Line Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line ID</em>' containment reference.
	 * @see #setLineID(LineIDType)
	 * @generated
	 */
	public LineIDType getLineID() {
		return (lineID == null) ? new LineIDType() : lineID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.OrderLineReferenceType#getLineID <em>Line ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line ID</em>' containment reference.
	 * @see #getLineID()
	 * @generated
	 */
	public void setLineID(LineIDType newLineID) {
		lineID = newLineID;
	}

	/**
	 * Returns the value of the '<em><b>Sales Order Line ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order Line Reference. Sales Order_ Line Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the referenced Order Line assigned by the Seller</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order Line Reference</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Sales Order</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Line Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sales Order Line ID</em>' containment reference.
	 * @see #setSalesOrderLineID(SalesOrderLineIDType)
	 * @generated
	 */
	public SalesOrderLineIDType getSalesOrderLineID() {
		return (salesOrderLineID == null) ? new SalesOrderLineIDType()
				: salesOrderLineID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.OrderLineReferenceType#getSalesOrderLineID <em>Sales Order Line ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Order Line ID</em>' containment reference.
	 * @see #getSalesOrderLineID()
	 * @generated
	 */
	public void setSalesOrderLineID(SalesOrderLineIDType newSalesOrderLineID) {
		salesOrderLineID = newSalesOrderLineID;
	}

	/**
	 * Returns the value of the '<em><b>GUID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order Line Reference. Globally Unique Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A computer-generated globally unique identifier (GUID) for the referenced Order Line instance</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order Line Reference</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Globally Unique Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GUID</em>' containment reference.
	 * @see #setGUID(GUIDType)
	 * @generated
	 */
	public GUIDType getGUID() {
		return (gUID == null) ? new GUIDType() : gUID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.OrderLineReferenceType#getGUID <em>GUID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GUID</em>' containment reference.
	 * @see #getGUID()
	 * @generated
	 */
	public void setGUID(GUIDType newGUID) {
		gUID = newGUID;
	}

	/**
	 * Returns the value of the '<em><b>Line Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order Line Reference. Line Status. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Identifies the status of the referenced Order Line with respect to its original state</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order Line Reference</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Line Status</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Status Code</em>' containment reference.
	 * @see #setLineStatusCode(LineStatusCodeType)
	 * @generated
	 */
	public LineStatusCodeType getLineStatusCode() {
		return (lineStatusCode == null) ? new LineStatusCodeType()
				: lineStatusCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.OrderLineReferenceType#getLineStatusCode <em>Line Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Status Code</em>' containment reference.
	 * @see #getLineStatusCode()
	 * @generated
	 */
	public void setLineStatusCode(LineStatusCodeType newLineStatusCode) {
		lineStatusCode = newLineStatusCode;
	}

	/**
	 * Returns the value of the '<em><b>Order Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order Line Reference. Order Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Order Reference</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order Line Reference</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Order Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Order Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order Reference</em>' containment reference.
	 * @see #setOrderReference(OrderReferenceType)
	 * @generated
	 */
	public OrderReferenceType getOrderReference() {
		return (orderReference == null) ? new OrderReferenceType()
				: orderReference;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.OrderLineReferenceType#getOrderReference <em>Order Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Reference</em>' containment reference.
	 * @see #getOrderReference()
	 * @generated
	 */
	public void setOrderReference(OrderReferenceType newOrderReference) {
		orderReference = newOrderReference;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.gUID == null) ? 0 : this.gUID.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.lineID == null) ? 0 : this.lineID.hashCode());
		result = PRIME * result + ((this.lineStatusCode == null) ? 0 : this.lineStatusCode.hashCode());
		result = PRIME * result + ((this.orderReference == null) ? 0 : this.orderReference.hashCode());
		result = PRIME * result + ((this.salesOrderLineID == null) ? 0 : this.salesOrderLineID.hashCode());
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
		final OrderLineReferenceType other = (OrderLineReferenceType) obj;
		if (this.gUID == null) {
			if (other.gUID != null)
				return false;
		} else if (!this.gUID.equals(other.gUID))
			return false;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.lineID == null) {
			if (other.lineID != null)
				return false;
		} else if (!this.lineID.equals(other.lineID))
			return false;
		if (this.lineStatusCode == null) {
			if (other.lineStatusCode != null)
				return false;
		} else if (!this.lineStatusCode.equals(other.lineStatusCode))
			return false;
		if (this.orderReference == null) {
			if (other.orderReference != null)
				return false;
		} else if (!this.orderReference.equals(other.orderReference))
			return false;
		if (this.salesOrderLineID == null) {
			if (other.salesOrderLineID != null)
				return false;
		} else if (!this.salesOrderLineID.equals(other.salesOrderLineID))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // OrderLineReferenceType