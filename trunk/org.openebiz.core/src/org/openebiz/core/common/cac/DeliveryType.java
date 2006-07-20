/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.ActualDeliveryDateTimeType;
import org.openebiz.core.common.cbc.EstimatedDeliveryDateTimeType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.LatestDeliveryDateTimeType;
import org.openebiz.core.common.cbc.MaximumQuantityType;
import org.openebiz.core.common.cbc.MinimumQuantityType;
import org.openebiz.core.common.cbc.PromisedDeliveryDateTimeType;
import org.openebiz.core.common.cbc.QuantityType;
import org.openebiz.core.common.cbc.RequestedDeliveryDateTimeType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delivery Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Delivery. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about Delivery</ccts:Definition>
 *           <ccts:ObjectClass>Delivery</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryType#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryType#getMinimumQuantity <em>Minimum Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryType#getMaximumQuantity <em>Maximum Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryType#getRequestedDeliveryDateTime <em>Requested Delivery Date Time</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryType#getPromisedDeliveryDateTime <em>Promised Delivery Date Time</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryType#getEstimatedDeliveryDateTime <em>Estimated Delivery Date Time</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryType#getActualDeliveryDateTime <em>Actual Delivery Date Time</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryType#getLatestDeliveryDateTime <em>Latest Delivery Date Time</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryType#getDeliveryAddress <em>Delivery Address</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryType#getOrderLineReference <em>Order Line Reference</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryType#getContact <em>Contact</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryType#getOriginatorParty <em>Originator Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryType#getDespatch <em>Despatch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeliveryType implements Serializable {
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
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected QuantityType quantity = null;

	/**
	 * The cached value of the '{@link #getMinimumQuantity() <em>Minimum Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumQuantity()
	 * @generated
	 * @ordered
	 */
	protected MinimumQuantityType minimumQuantity = null;

	/**
	 * The cached value of the '{@link #getMaximumQuantity() <em>Maximum Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumQuantity()
	 * @generated
	 * @ordered
	 */
	protected MaximumQuantityType maximumQuantity = null;

	/**
	 * The cached value of the '{@link #getRequestedDeliveryDateTime() <em>Requested Delivery Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedDeliveryDateTime()
	 * @generated
	 * @ordered
	 */
	protected RequestedDeliveryDateTimeType requestedDeliveryDateTime = null;

	/**
	 * The cached value of the '{@link #getPromisedDeliveryDateTime() <em>Promised Delivery Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPromisedDeliveryDateTime()
	 * @generated
	 * @ordered
	 */
	protected PromisedDeliveryDateTimeType promisedDeliveryDateTime = null;

	/**
	 * The cached value of the '{@link #getEstimatedDeliveryDateTime() <em>Estimated Delivery Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedDeliveryDateTime()
	 * @generated
	 * @ordered
	 */
	protected EstimatedDeliveryDateTimeType estimatedDeliveryDateTime = null;

	/**
	 * The cached value of the '{@link #getActualDeliveryDateTime() <em>Actual Delivery Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualDeliveryDateTime()
	 * @generated
	 * @ordered
	 */
	protected ActualDeliveryDateTimeType actualDeliveryDateTime = null;

	/**
	 * The cached value of the '{@link #getLatestDeliveryDateTime() <em>Latest Delivery Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatestDeliveryDateTime()
	 * @generated
	 * @ordered
	 */
	protected LatestDeliveryDateTimeType latestDeliveryDateTime = null;

	/**
	 * The cached value of the '{@link #getDeliveryAddress() <em>Delivery Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryAddress()
	 * @generated
	 * @ordered
	 */
	protected AddressType deliveryAddress = null;

	/**
	 * The cached value of the '{@link #getOrderLineReference() <em>Order Line Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderLineReference()
	 * @generated
	 * @ordered
	 */
	protected List orderLineReference = null;

	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected ContactType contact = null;

	/**
	 * The cached value of the '{@link #getOriginatorParty() <em>Originator Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginatorParty()
	 * @generated
	 * @ordered
	 */
	protected PartyType originatorParty = null;

	/**
	 * The cached value of the '{@link #getDespatch() <em>Despatch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDespatch()
	 * @generated
	 * @ordered
	 */
	protected DespatchType despatch = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public DeliveryType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.iD = this.getID();
		this.quantity = this.getQuantity();
		this.minimumQuantity = this.getMinimumQuantity();
		this.maximumQuantity = this.getMaximumQuantity();
		this.requestedDeliveryDateTime = this.getRequestedDeliveryDateTime();
		this.promisedDeliveryDateTime = this.getPromisedDeliveryDateTime();
		this.estimatedDeliveryDateTime = this.getEstimatedDeliveryDateTime();
		this.actualDeliveryDateTime = this.getActualDeliveryDateTime();
		this.latestDeliveryDateTime = this.getLatestDeliveryDateTime();
		this.deliveryAddress = this.getDeliveryAddress();
		this.orderLineReference = this.getOrderLineReference();
		this.contact = this.getContact();
		this.originatorParty = this.getOriginatorParty();
		this.despatch = this.getDespatch();
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
	 *               <ccts:DictionaryEntryName>Delivery. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identitfer for the Delivery</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryType#getID <em>ID</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The quantity in a Delivery</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(QuantityType)
	 * @generated
	 */
	public QuantityType getQuantity() {
		return (quantity == null) ? new QuantityType() : quantity;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryType#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	public void setQuantity(QuantityType newQuantity) {
		quantity = newQuantity;
	}

	/**
	 * Returns the value of the '<em><b>Minimum Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery. Minimum_ Quantity. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The minimum quantity in a Delivery</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Minimum</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Quantity</em>' containment reference.
	 * @see #setMinimumQuantity(MinimumQuantityType)
	 * @generated
	 */
	public MinimumQuantityType getMinimumQuantity() {
		return (minimumQuantity == null) ? new MinimumQuantityType()
				: minimumQuantity;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryType#getMinimumQuantity <em>Minimum Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Quantity</em>' containment reference.
	 * @see #getMinimumQuantity()
	 * @generated
	 */
	public void setMinimumQuantity(MinimumQuantityType newMinimumQuantity) {
		minimumQuantity = newMinimumQuantity;
	}

	/**
	 * Returns the value of the '<em><b>Maximum Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery. Maximum_ Quantity. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The maximum quantity in a Delivery</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Maximum</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Quantity</em>' containment reference.
	 * @see #setMaximumQuantity(MaximumQuantityType)
	 * @generated
	 */
	public MaximumQuantityType getMaximumQuantity() {
		return (maximumQuantity == null) ? new MaximumQuantityType()
				: maximumQuantity;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryType#getMaximumQuantity <em>Maximum Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Quantity</em>' containment reference.
	 * @see #getMaximumQuantity()
	 * @generated
	 */
	public void setMaximumQuantity(MaximumQuantityType newMaximumQuantity) {
		maximumQuantity = newMaximumQuantity;
	}

	/**
	 * Returns the value of the '<em><b>Requested Delivery Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery. Requested_ Delivery Date Time. Date Time</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The Delivery datetime requested by the Buyer</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Requested</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Delivery Date Time</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date Time</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date Time. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requested Delivery Date Time</em>' containment reference.
	 * @see #setRequestedDeliveryDateTime(RequestedDeliveryDateTimeType)
	 * @generated
	 */
	public RequestedDeliveryDateTimeType getRequestedDeliveryDateTime() {
		return (requestedDeliveryDateTime == null) ? new RequestedDeliveryDateTimeType()
				: requestedDeliveryDateTime;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryType#getRequestedDeliveryDateTime <em>Requested Delivery Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested Delivery Date Time</em>' containment reference.
	 * @see #getRequestedDeliveryDateTime()
	 * @generated
	 */
	public void setRequestedDeliveryDateTime(
			RequestedDeliveryDateTimeType newRequestedDeliveryDateTime) {
		requestedDeliveryDateTime = newRequestedDeliveryDateTime;
	}

	/**
	 * Returns the value of the '<em><b>Promised Delivery Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery. Promised_ Delivery Date Time. Date Time</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The Delivery datetime promised by the Seller</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Promised</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Delivery Date Time</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date Time</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date Time. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Promised Delivery Date Time</em>' containment reference.
	 * @see #setPromisedDeliveryDateTime(PromisedDeliveryDateTimeType)
	 * @generated
	 */
	public PromisedDeliveryDateTimeType getPromisedDeliveryDateTime() {
		return (promisedDeliveryDateTime == null) ? new PromisedDeliveryDateTimeType()
				: promisedDeliveryDateTime;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryType#getPromisedDeliveryDateTime <em>Promised Delivery Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Promised Delivery Date Time</em>' containment reference.
	 * @see #getPromisedDeliveryDateTime()
	 * @generated
	 */
	public void setPromisedDeliveryDateTime(
			PromisedDeliveryDateTimeType newPromisedDeliveryDateTime) {
		promisedDeliveryDateTime = newPromisedDeliveryDateTime;
	}

	/**
	 * Returns the value of the '<em><b>Estimated Delivery Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery. Estimated_ Delivery Date Time. Date Time</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The Delivery datetime estimated by the Seller or Despatch</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Estimated</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Delivery Date Time</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date Time</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date Time. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Estimated Delivery Date Time</em>' containment reference.
	 * @see #setEstimatedDeliveryDateTime(EstimatedDeliveryDateTimeType)
	 * @generated
	 */
	public EstimatedDeliveryDateTimeType getEstimatedDeliveryDateTime() {
		return (estimatedDeliveryDateTime == null) ? new EstimatedDeliveryDateTimeType()
				: estimatedDeliveryDateTime;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryType#getEstimatedDeliveryDateTime <em>Estimated Delivery Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Delivery Date Time</em>' containment reference.
	 * @see #getEstimatedDeliveryDateTime()
	 * @generated
	 */
	public void setEstimatedDeliveryDateTime(
			EstimatedDeliveryDateTimeType newEstimatedDeliveryDateTime) {
		estimatedDeliveryDateTime = newEstimatedDeliveryDateTime;
	}

	/**
	 * Returns the value of the '<em><b>Actual Delivery Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery. Actual_ Delivery Date Time. Date Time</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The actual Delivery datetime</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Actual</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Delivery Date Time</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date Time</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date Time. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Delivery Date Time</em>' containment reference.
	 * @see #setActualDeliveryDateTime(ActualDeliveryDateTimeType)
	 * @generated
	 */
	public ActualDeliveryDateTimeType getActualDeliveryDateTime() {
		return (actualDeliveryDateTime == null) ? new ActualDeliveryDateTimeType()
				: actualDeliveryDateTime;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryType#getActualDeliveryDateTime <em>Actual Delivery Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Delivery Date Time</em>' containment reference.
	 * @see #getActualDeliveryDateTime()
	 * @generated
	 */
	public void setActualDeliveryDateTime(
			ActualDeliveryDateTimeType newActualDeliveryDateTime) {
		actualDeliveryDateTime = newActualDeliveryDateTime;
	}

	/**
	 * Returns the value of the '<em><b>Latest Delivery Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery. Latest_ Delivery Date Time. Date Time</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The latest delivery datetime allowed by the Buyer.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Latest</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Delivery Date Time</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date Time</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date Time. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Latest Delivery Date Time</em>' containment reference.
	 * @see #setLatestDeliveryDateTime(LatestDeliveryDateTimeType)
	 * @generated
	 */
	public LatestDeliveryDateTimeType getLatestDeliveryDateTime() {
		return (latestDeliveryDateTime == null) ? new LatestDeliveryDateTimeType()
				: latestDeliveryDateTime;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryType#getLatestDeliveryDateTime <em>Latest Delivery Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latest Delivery Date Time</em>' containment reference.
	 * @see #getLatestDeliveryDateTime()
	 * @generated
	 */
	public void setLatestDeliveryDateTime(
			LatestDeliveryDateTimeType newLatestDeliveryDateTime) {
		latestDeliveryDateTime = newLatestDeliveryDateTime;
	}

	/**
	 * Returns the value of the '<em><b>Delivery Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery. Delivery_ Address. Address</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Delivery Address</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Delivery</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Address</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Address</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delivery Address</em>' containment reference.
	 * @see #setDeliveryAddress(AddressType)
	 * @generated
	 */
	public AddressType getDeliveryAddress() {
		return (deliveryAddress == null) ? new AddressType() : deliveryAddress;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryType#getDeliveryAddress <em>Delivery Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Address</em>' containment reference.
	 * @see #getDeliveryAddress()
	 * @generated
	 */
	public void setDeliveryAddress(AddressType newDeliveryAddress) {
		deliveryAddress = newDeliveryAddress;
	}

	/**
	 * Returns the value of the '<em><b>Order Line Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.OrderLineReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery. Order Line Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Order Line Reference</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Order Line Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Order Line Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order Line Reference</em>' containment reference list.
	 * @generated
	 */
	public List getOrderLineReference() {
		if (orderLineReference == null) {
			orderLineReference = new ArrayList<
					OrderLineReferenceType>();
		}
		return orderLineReference;
	}

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery. Contact</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Contact</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Contact</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Contact</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference.
	 * @see #setContact(ContactType)
	 * @generated
	 */
	public ContactType getContact() {
		return (contact == null) ? new ContactType() : contact;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryType#getContact <em>Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact</em>' containment reference.
	 * @see #getContact()
	 * @generated
	 */
	public void setContact(ContactType newContact) {
		contact = newContact;
	}

	/**
	 * Returns the value of the '<em><b>Originator Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery. Originator_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The party who originated the delivery</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Originator</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Originator Party</em>' containment reference.
	 * @see #setOriginatorParty(PartyType)
	 * @generated
	 */
	public PartyType getOriginatorParty() {
		return (originatorParty == null) ? new PartyType() : originatorParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryType#getOriginatorParty <em>Originator Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Originator Party</em>' containment reference.
	 * @see #getOriginatorParty()
	 * @generated
	 */
	public void setOriginatorParty(PartyType newOriginatorParty) {
		originatorParty = newOriginatorParty;
	}

	/**
	 * Returns the value of the '<em><b>Despatch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery. Despatch</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The party who despatched the delivery</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Despatch</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Despatch</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Despatch</em>' containment reference.
	 * @see #setDespatch(DespatchType)
	 * @generated
	 */
	public DespatchType getDespatch() {
		return (despatch == null) ? new DespatchType() : despatch;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryType#getDespatch <em>Despatch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Despatch</em>' containment reference.
	 * @see #getDespatch()
	 * @generated
	 */
	public void setDespatch(DespatchType newDespatch) {
		despatch = newDespatch;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.actualDeliveryDateTime == null) ? 0 : this.actualDeliveryDateTime.hashCode());
		result = PRIME * result + ((this.contact == null) ? 0 : this.contact.hashCode());
		result = PRIME * result + ((this.deliveryAddress == null) ? 0 : this.deliveryAddress.hashCode());
		result = PRIME * result + ((this.despatch == null) ? 0 : this.despatch.hashCode());
		result = PRIME * result + ((this.estimatedDeliveryDateTime == null) ? 0 : this.estimatedDeliveryDateTime.hashCode());
		result = PRIME * result + ((this.iD == null) ? 0 : this.iD.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.latestDeliveryDateTime == null) ? 0 : this.latestDeliveryDateTime.hashCode());
		result = PRIME * result + ((this.maximumQuantity == null) ? 0 : this.maximumQuantity.hashCode());
		result = PRIME * result + ((this.minimumQuantity == null) ? 0 : this.minimumQuantity.hashCode());
		result = PRIME * result + ((this.orderLineReference == null) ? 0 : this.orderLineReference.hashCode());
		result = PRIME * result + ((this.originatorParty == null) ? 0 : this.originatorParty.hashCode());
		result = PRIME * result + ((this.promisedDeliveryDateTime == null) ? 0 : this.promisedDeliveryDateTime.hashCode());
		result = PRIME * result + ((this.quantity == null) ? 0 : this.quantity.hashCode());
		result = PRIME * result + ((this.requestedDeliveryDateTime == null) ? 0 : this.requestedDeliveryDateTime.hashCode());
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
		final DeliveryType other = (DeliveryType) obj;
		if (this.actualDeliveryDateTime == null) {
			if (other.actualDeliveryDateTime != null)
				return false;
		} else if (!this.actualDeliveryDateTime.equals(other.actualDeliveryDateTime))
			return false;
		if (this.contact == null) {
			if (other.contact != null)
				return false;
		} else if (!this.contact.equals(other.contact))
			return false;
		if (this.deliveryAddress == null) {
			if (other.deliveryAddress != null)
				return false;
		} else if (!this.deliveryAddress.equals(other.deliveryAddress))
			return false;
		if (this.despatch == null) {
			if (other.despatch != null)
				return false;
		} else if (!this.despatch.equals(other.despatch))
			return false;
		if (this.estimatedDeliveryDateTime == null) {
			if (other.estimatedDeliveryDateTime != null)
				return false;
		} else if (!this.estimatedDeliveryDateTime.equals(other.estimatedDeliveryDateTime))
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
		if (this.latestDeliveryDateTime == null) {
			if (other.latestDeliveryDateTime != null)
				return false;
		} else if (!this.latestDeliveryDateTime.equals(other.latestDeliveryDateTime))
			return false;
		if (this.maximumQuantity == null) {
			if (other.maximumQuantity != null)
				return false;
		} else if (!this.maximumQuantity.equals(other.maximumQuantity))
			return false;
		if (this.minimumQuantity == null) {
			if (other.minimumQuantity != null)
				return false;
		} else if (!this.minimumQuantity.equals(other.minimumQuantity))
			return false;
		if (this.orderLineReference == null) {
			if (other.orderLineReference != null)
				return false;
		} else if (!this.orderLineReference.equals(other.orderLineReference))
			return false;
		if (this.originatorParty == null) {
			if (other.originatorParty != null)
				return false;
		} else if (!this.originatorParty.equals(other.originatorParty))
			return false;
		if (this.promisedDeliveryDateTime == null) {
			if (other.promisedDeliveryDateTime != null)
				return false;
		} else if (!this.promisedDeliveryDateTime.equals(other.promisedDeliveryDateTime))
			return false;
		if (this.quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!this.quantity.equals(other.quantity))
			return false;
		if (this.requestedDeliveryDateTime == null) {
			if (other.requestedDeliveryDateTime != null)
				return false;
		} else if (!this.requestedDeliveryDateTime.equals(other.requestedDeliveryDateTime))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // DeliveryType