/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.BatchQuantityType;
import org.openebiz.core.common.cbc.ConsumerUnitQuantityType;
import org.openebiz.core.common.cbc.HazardousRiskIndicatorType;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delivery Unit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Delivery Unit. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about a Delivery Unit</ccts:Definition>
 *           <ccts:ObjectClass>Delivery Unit</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryUnitType#getBatchQuantity <em>Batch Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryUnitType#getConsumerUnitQuantity <em>Consumer Unit Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryUnitType#getHazardousRiskIndicator <em>Hazardous Risk Indicator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeliveryUnitType implements Serializable {
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
	 * The cached value of the '{@link #getBatchQuantity() <em>Batch Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatchQuantity()
	 * @generated
	 * @ordered
	 */
	protected BatchQuantityType batchQuantity = null;

	/**
	 * The cached value of the '{@link #getConsumerUnitQuantity() <em>Consumer Unit Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumerUnitQuantity()
	 * @generated
	 * @ordered
	 */
	protected ConsumerUnitQuantityType consumerUnitQuantity = null;

	/**
	 * The cached value of the '{@link #getHazardousRiskIndicator() <em>Hazardous Risk Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazardousRiskIndicator()
	 * @generated
	 * @ordered
	 */
	protected HazardousRiskIndicatorType hazardousRiskIndicator = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public DeliveryUnitType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.batchQuantity = this.getBatchQuantity();
		this.consumerUnitQuantity = this.getConsumerUnitQuantity();
		this.hazardousRiskIndicator = this.getHazardousRiskIndicator();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getBatchQuantity().getValue().toPlainString());
		sdisplay.append(" | ");
		sdisplay.append(this.getConsumerUnitQuantity().getValue().toPlainString());
		return sdisplay.toString();
	}
	
	/**
	 * Returns the value of the '<em><b>Batch Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery Unit. Batch Quantity. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The quantity of ordered Items that constitutes a batch for delivery purposes</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery Unit</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Batch Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *               <ccts:Examples>"100 units", "by the dozen"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Batch Quantity</em>' containment reference.
	 * @see #setBatchQuantity(BatchQuantityType)
	 * @generated
	 */
	public BatchQuantityType getBatchQuantity() {
		return (batchQuantity == null) ? new BatchQuantityType()
				: batchQuantity;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryUnitType#getBatchQuantity <em>Batch Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Batch Quantity</em>' containment reference.
	 * @see #getBatchQuantity()
	 * @generated
	 */
	public void setBatchQuantity(BatchQuantityType newBatchQuantity) {
		batchQuantity = newBatchQuantity;
	}

	/**
	 * Returns the value of the '<em><b>Consumer Unit Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery Unit. Consumer_ Unit. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The quantity of consumer units in the Delivery Unit</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery Unit</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Consumer</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Unit</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *               <ccts:Examples>"packs of 10"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consumer Unit Quantity</em>' containment reference.
	 * @see #setConsumerUnitQuantity(ConsumerUnitQuantityType)
	 * @generated
	 */
	public ConsumerUnitQuantityType getConsumerUnitQuantity() {
		return (consumerUnitQuantity == null) ? new ConsumerUnitQuantityType()
				: consumerUnitQuantity;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryUnitType#getConsumerUnitQuantity <em>Consumer Unit Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumer Unit Quantity</em>' containment reference.
	 * @see #getConsumerUnitQuantity()
	 * @generated
	 */
	public void setConsumerUnitQuantity(
			ConsumerUnitQuantityType newConsumerUnitQuantity) {
		consumerUnitQuantity = newConsumerUnitQuantity;
	}

	/**
	 * Returns the value of the '<em><b>Hazardous Risk Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery Unit. Hazardous Risk Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Indicates whether the Item as delivered is hazardous</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery Unit</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Hazardous Risk Indicator</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *               <ccts:Examples>Default is negative</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hazardous Risk Indicator</em>' containment reference.
	 * @see #setHazardousRiskIndicator(HazardousRiskIndicatorType)
	 * @generated
	 */
	public HazardousRiskIndicatorType getHazardousRiskIndicator() {
		return (hazardousRiskIndicator == null) ? new HazardousRiskIndicatorType()
				: hazardousRiskIndicator;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryUnitType#getHazardousRiskIndicator <em>Hazardous Risk Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hazardous Risk Indicator</em>' containment reference.
	 * @see #getHazardousRiskIndicator()
	 * @generated
	 */
	public void setHazardousRiskIndicator(
			HazardousRiskIndicatorType newHazardousRiskIndicator) {
		hazardousRiskIndicator = newHazardousRiskIndicator;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.batchQuantity == null) ? 0 : this.batchQuantity.hashCode());
		result = PRIME * result + ((this.consumerUnitQuantity == null) ? 0 : this.consumerUnitQuantity.hashCode());
		result = PRIME * result + ((this.hazardousRiskIndicator == null) ? 0 : this.hazardousRiskIndicator.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
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
		final DeliveryUnitType other = (DeliveryUnitType) obj;
		if (this.batchQuantity == null) {
			if (other.batchQuantity != null)
				return false;
		} else if (!this.batchQuantity.equals(other.batchQuantity))
			return false;
		if (this.consumerUnitQuantity == null) {
			if (other.consumerUnitQuantity != null)
				return false;
		} else if (!this.consumerUnitQuantity.equals(other.consumerUnitQuantity))
			return false;
		if (this.hazardousRiskIndicator == null) {
			if (other.hazardousRiskIndicator != null)
				return false;
		} else if (!this.hazardousRiskIndicator.equals(other.hazardousRiskIndicator))
			return false;
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
		return true;
	}

} // DeliveryUnitType