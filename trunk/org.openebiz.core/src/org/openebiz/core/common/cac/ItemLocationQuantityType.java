/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.HazardousRiskIndicatorType;
import org.openebiz.core.common.cbc.LeadTimeMeasureType;
import org.openebiz.core.common.cbc.MaximumQuantityType;
import org.openebiz.core.common.cbc.MinimumQuantityType;
import org.openebiz.core.common.cbc.TradingRestrictionsType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Location Quantity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Item Location Quantity. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about the properites of an Item as they relate to specific quantities  and/or specific locations</ccts:Definition>
 *           <ccts:ObjectClass>Item Location Quantity</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.ItemLocationQuantityType#getLeadTimeMeasure <em>Lead Time Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemLocationQuantityType#getMinimumQuantity <em>Minimum Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemLocationQuantityType#getMaximumQuantity <em>Maximum Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemLocationQuantityType#getHazardousRiskIndicator <em>Hazardous Risk Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemLocationQuantityType#getTradingRestrictions <em>Trading Restrictions</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemLocationQuantityType#getApplicableTerritoryAddress <em>Applicable Territory Address</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemLocationQuantityType#getBasePrice <em>Base Price</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemLocationQuantityType#getDeliveryUnit <em>Delivery Unit</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemLocationQuantityType#getApplicableTaxCategory <em>Applicable Tax Category</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemLocationQuantityType implements Serializable {
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
	 * The cached value of the '{@link #getLeadTimeMeasure() <em>Lead Time Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeadTimeMeasure()
	 * @generated
	 * @ordered
	 */
	protected LeadTimeMeasureType leadTimeMeasure = null;

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
	 * The cached value of the '{@link #getHazardousRiskIndicator() <em>Hazardous Risk Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazardousRiskIndicator()
	 * @generated
	 * @ordered
	 */
	protected HazardousRiskIndicatorType hazardousRiskIndicator = null;

	/**
	 * The cached value of the '{@link #getTradingRestrictions() <em>Trading Restrictions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTradingRestrictions()
	 * @generated
	 * @ordered
	 */
	protected List tradingRestrictions = null;

	/**
	 * The cached value of the '{@link #getApplicableTerritoryAddress() <em>Applicable Territory Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicableTerritoryAddress()
	 * @generated
	 * @ordered
	 */
	protected List applicableTerritoryAddress = null;

	/**
	 * The cached value of the '{@link #getBasePrice() <em>Base Price</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePrice()
	 * @generated
	 * @ordered
	 */
	protected BasePriceType basePrice = null;

	/**
	 * The cached value of the '{@link #getDeliveryUnit() <em>Delivery Unit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryUnit()
	 * @generated
	 * @ordered
	 */
	protected List deliveryUnit = null;

	/**
	 * The cached value of the '{@link #getApplicableTaxCategory() <em>Applicable Tax Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicableTaxCategory()
	 * @generated
	 * @ordered
	 */
	protected List applicableTaxCategory = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ItemLocationQuantityType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.leadTimeMeasure = this.getLeadTimeMeasure();
		this.minimumQuantity = this.getMinimumQuantity();
		this.maximumQuantity = this.getMaximumQuantity();
		this.hazardousRiskIndicator = this.getHazardousRiskIndicator();
		this.tradingRestrictions = this.getTradingRestrictions();
		this.applicableTerritoryAddress = this.getApplicableTerritoryAddress();
		this.basePrice = this.getBasePrice();
		this.deliveryUnit = this.getDeliveryUnit();
		this.applicableTaxCategory = this.getApplicableTaxCategory();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		return sdisplay.toString();
	}
	
	/**
	 * Returns the value of the '<em><b>Lead Time Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item Location Quantity. Lead Time. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The time taken from the time of order to the time of delivery for an Item</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item Location Quantity</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Lead Time</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
	 *               <ccts:Examples>"2 days", "24 hours"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lead Time Measure</em>' containment reference.
	 * @see #setLeadTimeMeasure(LeadTimeMeasureType)
	 * @generated
	 */
	public LeadTimeMeasureType getLeadTimeMeasure() {
		return (leadTimeMeasure == null) ? new LeadTimeMeasureType()
				: leadTimeMeasure;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemLocationQuantityType#getLeadTimeMeasure <em>Lead Time Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lead Time Measure</em>' containment reference.
	 * @see #getLeadTimeMeasure()
	 * @generated
	 */
	public void setLeadTimeMeasure(LeadTimeMeasureType newLeadTimeMeasure) {
		leadTimeMeasure = newLeadTimeMeasure;
	}

	/**
	 * Returns the value of the '<em><b>Minimum Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item Location Quantity. Minimum_ Quantity. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The minimum quantity that can be ordered (to qualify for a specific price)</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item Location Quantity</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Minimum</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *               <ccts:Examples>"10 boxes", "1 carton", "1000 sheets"</ccts:Examples>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemLocationQuantityType#getMinimumQuantity <em>Minimum Quantity</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Item Location Quantity. Maximum_ Quantity. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The maximum quantity that can be ordered (to qualify for a specific price)</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item Location Quantity</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Maximum</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *               <ccts:Examples>"10 boxes", "1 carton", "1000 sheets"</ccts:Examples>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemLocationQuantityType#getMaximumQuantity <em>Maximum Quantity</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Hazardous Risk Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item Location Quantity. Hazardous Risk Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Indicates whether the Item as delivered is hazardous</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item Location Quantity</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemLocationQuantityType#getHazardousRiskIndicator <em>Hazardous Risk Indicator</em>}' containment reference.
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

	/**
	 * Returns the value of the '<em><b>Trading Restrictions</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cbc.TradingRestrictionsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item Location Quantity. Trading Restrictions. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A description of trade restrictions that apply to the Item or quantities of the Item</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item Location Quantity</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Trading Restrictions</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:Examples>"not for export"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trading Restrictions</em>' containment reference list.
	 * @generated
	 */
	public List getTradingRestrictions() {
		if (tradingRestrictions == null) {
			tradingRestrictions = new ArrayList<
					TradingRestrictionsType>();
		}
		return tradingRestrictions;
	}

	/**
	 * Returns the value of the '<em><b>Applicable Territory Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.AddressType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item Location Quantity. Applicable Territory_ Address. Address</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Territory (Address)</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item Location Quantity</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Applicable Territory</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Address</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Address</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applicable Territory Address</em>' containment reference list.
	 * @generated
	 */
	public List getApplicableTerritoryAddress() {
		if (applicableTerritoryAddress == null) {
			applicableTerritoryAddress = new ArrayList<
					AddressType>();
		}
		return applicableTerritoryAddress;
	}

	/**
	 * Returns the value of the '<em><b>Base Price</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item Location Quantity. Base Price</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Base Price</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item Location Quantity</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Base Price</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Base Price</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Price</em>' containment reference.
	 * @see #setBasePrice(BasePriceType)
	 * @generated
	 */
	public BasePriceType getBasePrice() {
		return (basePrice == null) ? new BasePriceType() : basePrice;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemLocationQuantityType#getBasePrice <em>Base Price</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Price</em>' containment reference.
	 * @see #getBasePrice()
	 * @generated
	 */
	public void setBasePrice(BasePriceType newBasePrice) {
		basePrice = newBasePrice;
	}

	/**
	 * Returns the value of the '<em><b>Delivery Unit</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.DeliveryUnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item Location Quantity. Delivery Unit</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Delivery Unit</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item Location Quantity</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Delivery Unit</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Delivery Unit</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delivery Unit</em>' containment reference list.
	 * @generated
	 */
	public List getDeliveryUnit() {
		if (deliveryUnit == null) {
			deliveryUnit = new ArrayList<DeliveryUnitType>();
		}
		return deliveryUnit;
	}

	/**
	 * Returns the value of the '<em><b>Applicable Tax Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.TaxCategoryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item Location Quantity. Applicable_ Tax Category. Tax Category</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Tax Category</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item Location Quantity</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Applicable</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Tax Category</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Tax Category</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applicable Tax Category</em>' containment reference list.
	 * @generated
	 */
	public List getApplicableTaxCategory() {
		if (applicableTaxCategory == null) {
			applicableTaxCategory = new ArrayList<
					TaxCategoryType>();
		}
		return applicableTaxCategory;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.applicableTaxCategory == null) ? 0 : this.applicableTaxCategory.hashCode());
		result = PRIME * result + ((this.applicableTerritoryAddress == null) ? 0 : this.applicableTerritoryAddress.hashCode());
		result = PRIME * result + ((this.basePrice == null) ? 0 : this.basePrice.hashCode());
		result = PRIME * result + ((this.deliveryUnit == null) ? 0 : this.deliveryUnit.hashCode());
		result = PRIME * result + ((this.hazardousRiskIndicator == null) ? 0 : this.hazardousRiskIndicator.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.leadTimeMeasure == null) ? 0 : this.leadTimeMeasure.hashCode());
		result = PRIME * result + ((this.maximumQuantity == null) ? 0 : this.maximumQuantity.hashCode());
		result = PRIME * result + ((this.minimumQuantity == null) ? 0 : this.minimumQuantity.hashCode());
		result = PRIME * result + ((this.tradingRestrictions == null) ? 0 : this.tradingRestrictions.hashCode());
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
		final ItemLocationQuantityType other = (ItemLocationQuantityType) obj;
		if (this.applicableTaxCategory == null) {
			if (other.applicableTaxCategory != null)
				return false;
		} else if (!this.applicableTaxCategory.equals(other.applicableTaxCategory))
			return false;
		if (this.applicableTerritoryAddress == null) {
			if (other.applicableTerritoryAddress != null)
				return false;
		} else if (!this.applicableTerritoryAddress.equals(other.applicableTerritoryAddress))
			return false;
		if (this.basePrice == null) {
			if (other.basePrice != null)
				return false;
		} else if (!this.basePrice.equals(other.basePrice))
			return false;
		if (this.deliveryUnit == null) {
			if (other.deliveryUnit != null)
				return false;
		} else if (!this.deliveryUnit.equals(other.deliveryUnit))
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
		if (this.leadTimeMeasure == null) {
			if (other.leadTimeMeasure != null)
				return false;
		} else if (!this.leadTimeMeasure.equals(other.leadTimeMeasure))
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
		if (this.tradingRestrictions == null) {
			if (other.tradingRestrictions != null)
				return false;
		} else if (!this.tradingRestrictions.equals(other.tradingRestrictions))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // ItemLocationQuantityType