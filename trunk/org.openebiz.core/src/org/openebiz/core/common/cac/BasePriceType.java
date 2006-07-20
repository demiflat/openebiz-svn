/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.BaseQuantityType;
import org.openebiz.core.common.cbc.OrderableUnitFactorRateType;
import org.openebiz.core.common.cbc.PriceAmountType;
import org.openebiz.core.common.cbc.PriceChangeReasonType;
import org.openebiz.core.common.cbc.PriceTypeType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Price Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Base Price. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about the price of an item of goods or service net of all taxes, charges and discounts</ccts:Definition>
 *           <ccts:ObjectClass>Base Price</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.BasePriceType#getPriceAmount <em>Price Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.BasePriceType#getBaseQuantity <em>Base Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.BasePriceType#getPriceChangeReason <em>Price Change Reason</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.BasePriceType#getPriceType <em>Price Type</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.BasePriceType#getOrderableUnitFactorRate <em>Orderable Unit Factor Rate</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.BasePriceType#getValidityPeriod <em>Validity Period</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.BasePriceType#getPriceList <em>Price List</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.BasePriceType#getAllowanceCharge <em>Allowance Charge</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BasePriceType implements Serializable {
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
	 * The cached value of the '{@link #getPriceAmount() <em>Price Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriceAmount()
	 * @generated
	 * @ordered
	 */
	protected PriceAmountType priceAmount = null;

	/**
	 * The cached value of the '{@link #getBaseQuantity() <em>Base Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseQuantity()
	 * @generated
	 * @ordered
	 */
	protected BaseQuantityType baseQuantity = null;

	/**
	 * The cached value of the '{@link #getPriceChangeReason() <em>Price Change Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriceChangeReason()
	 * @generated
	 * @ordered
	 */
	protected List priceChangeReason = null;

	/**
	 * The cached value of the '{@link #getPriceType() <em>Price Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriceType()
	 * @generated
	 * @ordered
	 */
	protected PriceTypeType priceType = null;

	/**
	 * The cached value of the '{@link #getOrderableUnitFactorRate() <em>Orderable Unit Factor Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderableUnitFactorRate()
	 * @generated
	 * @ordered
	 */
	protected OrderableUnitFactorRateType orderableUnitFactorRate = null;

	/**
	 * The cached value of the '{@link #getValidityPeriod() <em>Validity Period</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidityPeriod()
	 * @generated
	 * @ordered
	 */
	protected List validityPeriod = null;

	/**
	 * The cached value of the '{@link #getPriceList() <em>Price List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriceList()
	 * @generated
	 * @ordered
	 */
	protected PriceListType priceList = null;

	/**
	 * The cached value of the '{@link #getAllowanceCharge() <em>Allowance Charge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowanceCharge()
	 * @generated
	 * @ordered
	 */
	protected List allowanceCharge = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public BasePriceType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.priceAmount = this.getPriceAmount();
		this.baseQuantity = this.getBaseQuantity();
		this.priceChangeReason = this.getPriceChangeReason();
		this.priceType = this.getPriceType();
		this.orderableUnitFactorRate = this.getOrderableUnitFactorRate();
		this.validityPeriod = this.getValidityPeriod();
		this.priceList = this.getPriceList();
		this.allowanceCharge = this.getAllowanceCharge();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getPriceAmount().getValue().toPlainString());
		return sdisplay.toString();
	}
	
	/**
	 * Returns the value of the '<em><b>Price Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Base Price. Price Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The Base Price amount</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Base Price</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Price Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>unit price</ccts:AlternativeBusinessTerms>
	 *               <ccts:Examples>23.45</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Price Amount</em>' containment reference.
	 * @see #setPriceAmount(PriceAmountType)
	 * @generated
	 */
	public PriceAmountType getPriceAmount() {
		return (priceAmount == null) ? new PriceAmountType() : priceAmount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.BasePriceType#getPriceAmount <em>Price Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price Amount</em>' containment reference.
	 * @see #getPriceAmount()
	 * @generated
	 */
	public void setPriceAmount(PriceAmountType newPriceAmount) {
		priceAmount = newPriceAmount;
	}

	/**
	 * Returns the value of the '<em><b>Base Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Base Price. Base_ Quantity. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The actual quantity to which the Base Price applies</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Base Price</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Base</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Quantity</em>' containment reference.
	 * @see #setBaseQuantity(BaseQuantityType)
	 * @generated
	 */
	public BaseQuantityType getBaseQuantity() {
		return (baseQuantity == null) ? new BaseQuantityType() : baseQuantity;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.BasePriceType#getBaseQuantity <em>Base Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Quantity</em>' containment reference.
	 * @see #getBaseQuantity()
	 * @generated
	 */
	public void setBaseQuantity(BaseQuantityType newBaseQuantity) {
		baseQuantity = newBaseQuantity;
	}

	/**
	 * Returns the value of the '<em><b>Price Change Reason</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cbc.PriceChangeReasonType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Base Price. Price Change Reason. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The reason for the Price expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Base Price</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Price Change Reason</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:Examples>"Clearance of old stock", "New contract applies"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Price Change Reason</em>' containment reference list.
	 * @generated
	 */
	public List getPriceChangeReason() {
		if (priceChangeReason == null) {
			priceChangeReason = new ArrayList<
					PriceChangeReasonType>();
		}
		return priceChangeReason;
	}

	/**
	 * Returns the value of the '<em><b>Price Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Base Price. Price Type. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The Price type</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Base Price</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Price Type</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:Examples>retail, wholesale, discount, contract</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Price Type</em>' containment reference.
	 * @see #setPriceType(PriceTypeType)
	 * @generated
	 */
	public PriceTypeType getPriceType() {
		return (priceType == null) ? new PriceTypeType() : priceType;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.BasePriceType#getPriceType <em>Price Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price Type</em>' containment reference.
	 * @see #getPriceType()
	 * @generated
	 */
	public void setPriceType(PriceTypeType newPriceType) {
		priceType = newPriceType;
	}

	/**
	 * Returns the value of the '<em><b>Orderable Unit Factor Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Base Price. Orderable Unit Factor. Rate</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The factor by which the base price unit can be converted to the orderable unit</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Base Price</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Orderable Unit Factor</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Rate</ccts:RepresentationTerm>
	 *               <ccts:DataType>Rate. Type</ccts:DataType>
	 *               <ccts:Examples>Nails are priced by weight but ordered by quantity.  So this would say how many nails per kilo</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Orderable Unit Factor Rate</em>' containment reference.
	 * @see #setOrderableUnitFactorRate(OrderableUnitFactorRateType)
	 * @generated
	 */
	public OrderableUnitFactorRateType getOrderableUnitFactorRate() {
		return (orderableUnitFactorRate == null) ? new OrderableUnitFactorRateType()
				: orderableUnitFactorRate;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.BasePriceType#getOrderableUnitFactorRate <em>Orderable Unit Factor Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orderable Unit Factor Rate</em>' containment reference.
	 * @see #getOrderableUnitFactorRate()
	 * @generated
	 */
	public void setOrderableUnitFactorRate(
			OrderableUnitFactorRateType newOrderableUnitFactorRate) {
		orderableUnitFactorRate = newOrderableUnitFactorRate;
	}

	/**
	 * Returns the value of the '<em><b>Validity Period</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.PeriodType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Base Price. Validity_ Period. Period</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Validity Period</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Base Price</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Validity</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Period</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Period</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validity Period</em>' containment reference list.
	 * @generated
	 */
	public List getValidityPeriod() {
		if (validityPeriod == null) {
			validityPeriod = new ArrayList<PeriodType>();
		}
		return validityPeriod;
	}

	/**
	 * Returns the value of the '<em><b>Price List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Base Price. Price List</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Price List</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Base Price</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Price List</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Price List</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Price List</em>' containment reference.
	 * @see #setPriceList(PriceListType)
	 * @generated
	 */
	public PriceListType getPriceList() {
		return (priceList == null) ? new PriceListType() : priceList;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.BasePriceType#getPriceList <em>Price List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price List</em>' containment reference.
	 * @see #getPriceList()
	 * @generated
	 */
	public void setPriceList(PriceListType newPriceList) {
		priceList = newPriceList;
	}

	/**
	 * Returns the value of the '<em><b>Allowance Charge</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.AllowanceChargeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Base Price. Allowance Charge</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Allowance Charge</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Base Price</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Allowance Charge</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Allowance Charge</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allowance Charge</em>' containment reference list.
	 * @generated
	 */
	public List getAllowanceCharge() {
		if (allowanceCharge == null) {
			allowanceCharge = new ArrayList<AllowanceChargeType>();
		}
		return allowanceCharge;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.allowanceCharge == null) ? 0 : this.allowanceCharge.hashCode());
		result = PRIME * result + ((this.baseQuantity == null) ? 0 : this.baseQuantity.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.orderableUnitFactorRate == null) ? 0 : this.orderableUnitFactorRate.hashCode());
		result = PRIME * result + ((this.priceAmount == null) ? 0 : this.priceAmount.hashCode());
		result = PRIME * result + ((this.priceChangeReason == null) ? 0 : this.priceChangeReason.hashCode());
		result = PRIME * result + ((this.priceList == null) ? 0 : this.priceList.hashCode());
		result = PRIME * result + ((this.priceType == null) ? 0 : this.priceType.hashCode());
		result = PRIME * result + ((this.validityPeriod == null) ? 0 : this.validityPeriod.hashCode());
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
		final BasePriceType other = (BasePriceType) obj;
		if (this.allowanceCharge == null) {
			if (other.allowanceCharge != null)
				return false;
		} else if (!this.allowanceCharge.equals(other.allowanceCharge))
			return false;
		if (this.baseQuantity == null) {
			if (other.baseQuantity != null)
				return false;
		} else if (!this.baseQuantity.equals(other.baseQuantity))
			return false;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.orderableUnitFactorRate == null) {
			if (other.orderableUnitFactorRate != null)
				return false;
		} else if (!this.orderableUnitFactorRate.equals(other.orderableUnitFactorRate))
			return false;
		if (this.priceAmount == null) {
			if (other.priceAmount != null)
				return false;
		} else if (!this.priceAmount.equals(other.priceAmount))
			return false;
		if (this.priceChangeReason == null) {
			if (other.priceChangeReason != null)
				return false;
		} else if (!this.priceChangeReason.equals(other.priceChangeReason))
			return false;
		if (this.priceList == null) {
			if (other.priceList != null)
				return false;
		} else if (!this.priceList.equals(other.priceList))
			return false;
		if (this.priceType == null) {
			if (other.priceType != null)
				return false;
		} else if (!this.priceType.equals(other.priceType))
			return false;
		if (this.validityPeriod == null) {
			if (other.validityPeriod != null)
				return false;
		} else if (!this.validityPeriod.equals(other.validityPeriod))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // BasePriceType