/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.BaseUnitMeasureType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.NameType;
import org.openebiz.core.common.cbc.PerUnitAmountType;
import org.openebiz.core.common.cbc.PercentType;
import org.openebiz.core.common.cbc.TierRangeType;
import org.openebiz.core.common.cbc.TierRatePercentType;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tax Category Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Tax Category. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information anout a Tax Category</ccts:Definition>
 *           <ccts:ObjectClass>Tax Category</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.TaxCategoryType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TaxCategoryType#getName <em>Name</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TaxCategoryType#getPercent <em>Percent</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TaxCategoryType#getBaseUnitMeasure <em>Base Unit Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TaxCategoryType#getPerUnitAmount <em>Per Unit Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TaxCategoryType#getTierRange <em>Tier Range</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TaxCategoryType#getTierRatePercent <em>Tier Rate Percent</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TaxCategoryType#getTaxScheme <em>Tax Scheme</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaxCategoryType implements Serializable {
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
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected NameType name = null;

	/**
	 * The cached value of the '{@link #getPercent() <em>Percent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercent()
	 * @generated
	 * @ordered
	 */
	protected PercentType percent = null;

	/**
	 * The cached value of the '{@link #getBaseUnitMeasure() <em>Base Unit Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseUnitMeasure()
	 * @generated
	 * @ordered
	 */
	protected BaseUnitMeasureType baseUnitMeasure = null;

	/**
	 * The cached value of the '{@link #getPerUnitAmount() <em>Per Unit Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerUnitAmount()
	 * @generated
	 * @ordered
	 */
	protected PerUnitAmountType perUnitAmount = null;

	/**
	 * The cached value of the '{@link #getTierRange() <em>Tier Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTierRange()
	 * @generated
	 * @ordered
	 */
	protected TierRangeType tierRange = null;

	/**
	 * The cached value of the '{@link #getTierRatePercent() <em>Tier Rate Percent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTierRatePercent()
	 * @generated
	 * @ordered
	 */
	protected TierRatePercentType tierRatePercent = null;

	/**
	 * The cached value of the '{@link #getTaxScheme() <em>Tax Scheme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxScheme()
	 * @generated
	 * @ordered
	 */
	protected TaxSchemeType taxScheme = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public TaxCategoryType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.iD = this.getID();
		this.name = this.getName();
		this.percent = this.getPercent();
		this.baseUnitMeasure = this.getBaseUnitMeasure();
		this.perUnitAmount = this.getPerUnitAmount();
		this.tierRange = this.getTierRange();
		this.tierRatePercent = this.getTierRatePercent();
		this.taxScheme = this.getTaxScheme();
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
	 *               <ccts:DictionaryEntryName>Tax Category. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the Tax Category</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Tax Category</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:Examples>"ZeroRatedGoods" "NotTaxable" "Standard Rate"</ccts:Examples>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxCategoryType#getID <em>ID</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Tax Category. Name</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The name of the Tax Category</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Tax Category</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Name</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Name</ccts:RepresentationTerm>
	 *               <ccts:DataType>Name. Type</ccts:DataType>
	 *               <ccts:Examples>"Luxury Goods","Wine Equalization", "Exempt"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(NameType)
	 * @generated
	 */
	public NameType getName() {
		return (name == null) ? new NameType() : name;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxCategoryType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	public void setName(NameType newName) {
		name = newName;
	}

	/**
	 * Returns the value of the '<em><b>Percent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Tax Category. Percent</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The Tax Rate for the category expressed as a percentage</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Tax Category</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Percent</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Percent</ccts:RepresentationTerm>
	 *               <ccts:DataType>Percent. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Percent</em>' containment reference.
	 * @see #setPercent(PercentType)
	 * @generated
	 */
	public PercentType getPercent() {
		return (percent == null) ? new PercentType() : percent;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxCategoryType#getPercent <em>Percent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percent</em>' containment reference.
	 * @see #getPercent()
	 * @generated
	 */
	public void setPercent(PercentType newPercent) {
		percent = newPercent;
	}

	/**
	 * Returns the value of the '<em><b>Base Unit Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Tax Category. Base Unit Measure. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Where a tax is applied at a certain rate per unit, the measure of units on which the tax calculation is based</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Tax Category</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Base Unit Measure</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Unit Measure</em>' containment reference.
	 * @see #setBaseUnitMeasure(BaseUnitMeasureType)
	 * @generated
	 */
	public BaseUnitMeasureType getBaseUnitMeasure() {
		return (baseUnitMeasure == null) ? new BaseUnitMeasureType()
				: baseUnitMeasure;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxCategoryType#getBaseUnitMeasure <em>Base Unit Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Unit Measure</em>' containment reference.
	 * @see #getBaseUnitMeasure()
	 * @generated
	 */
	public void setBaseUnitMeasure(BaseUnitMeasureType newBaseUnitMeasure) {
		baseUnitMeasure = newBaseUnitMeasure;
	}

	/**
	 * Returns the value of the '<em><b>Per Unit Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Tax Category. Per Unit Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Where a tax is applied at a certain rate per unit, the rate per unit applied</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Tax Category</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Per Unit Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Per Unit Amount</em>' containment reference.
	 * @see #setPerUnitAmount(PerUnitAmountType)
	 * @generated
	 */
	public PerUnitAmountType getPerUnitAmount() {
		return (perUnitAmount == null) ? new PerUnitAmountType()
				: perUnitAmount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxCategoryType#getPerUnitAmount <em>Per Unit Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Per Unit Amount</em>' containment reference.
	 * @see #getPerUnitAmount()
	 * @generated
	 */
	public void setPerUnitAmount(PerUnitAmountType newPerUnitAmount) {
		perUnitAmount = newPerUnitAmount;
	}

	/**
	 * Returns the value of the '<em><b>Tier Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Tax Category. Tier Range. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Where a tax is tiered, the range of tiers applied in the calculation of the Tax Sub Total for the Tax Category</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Tax Category</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Tier Range</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tier Range</em>' containment reference.
	 * @see #setTierRange(TierRangeType)
	 * @generated
	 */
	public TierRangeType getTierRange() {
		return (tierRange == null) ? new TierRangeType() : tierRange;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxCategoryType#getTierRange <em>Tier Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tier Range</em>' containment reference.
	 * @see #getTierRange()
	 * @generated
	 */
	public void setTierRange(TierRangeType newTierRange) {
		tierRange = newTierRange;
	}

	/**
	 * Returns the value of the '<em><b>Tier Rate Percent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Tax Category. Tier Rate. Percent</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Where a tax is tiered, the rate of tax applied to the range of tiers in the calculation of the Tax Sub Total for the Tax Category</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Tax Category</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Tier Rate</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Percent</ccts:RepresentationTerm>
	 *               <ccts:DataType>Percent. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tier Rate Percent</em>' containment reference.
	 * @see #setTierRatePercent(TierRatePercentType)
	 * @generated
	 */
	public TierRatePercentType getTierRatePercent() {
		return (tierRatePercent == null) ? new TierRatePercentType()
				: tierRatePercent;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxCategoryType#getTierRatePercent <em>Tier Rate Percent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tier Rate Percent</em>' containment reference.
	 * @see #getTierRatePercent()
	 * @generated
	 */
	public void setTierRatePercent(TierRatePercentType newTierRatePercent) {
		tierRatePercent = newTierRatePercent;
	}

	/**
	 * Returns the value of the '<em><b>Tax Scheme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Tax Category. Tax Scheme</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Tax Scheme</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Tax Category</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Tax Scheme</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Tax Scheme</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tax Scheme</em>' containment reference.
	 * @see #setTaxScheme(TaxSchemeType)
	 * @generated
	 */
	public TaxSchemeType getTaxScheme() {
		return (taxScheme == null) ? new TaxSchemeType() : taxScheme;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxCategoryType#getTaxScheme <em>Tax Scheme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Scheme</em>' containment reference.
	 * @see #getTaxScheme()
	 * @generated
	 */
	public void setTaxScheme(TaxSchemeType newTaxScheme) {
		taxScheme = newTaxScheme;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.baseUnitMeasure == null) ? 0 : this.baseUnitMeasure.hashCode());
		result = PRIME * result + ((this.iD == null) ? 0 : this.iD.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.name == null) ? 0 : this.name.hashCode());
		result = PRIME * result + ((this.perUnitAmount == null) ? 0 : this.perUnitAmount.hashCode());
		result = PRIME * result + ((this.percent == null) ? 0 : this.percent.hashCode());
		result = PRIME * result + ((this.taxScheme == null) ? 0 : this.taxScheme.hashCode());
		result = PRIME * result + ((this.tierRange == null) ? 0 : this.tierRange.hashCode());
		result = PRIME * result + ((this.tierRatePercent == null) ? 0 : this.tierRatePercent.hashCode());
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
		final TaxCategoryType other = (TaxCategoryType) obj;
		if (this.baseUnitMeasure == null) {
			if (other.baseUnitMeasure != null)
				return false;
		} else if (!this.baseUnitMeasure.equals(other.baseUnitMeasure))
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
		if (this.name == null) {
			if (other.name != null)
				return false;
		} else if (!this.name.equals(other.name))
			return false;
		if (this.perUnitAmount == null) {
			if (other.perUnitAmount != null)
				return false;
		} else if (!this.perUnitAmount.equals(other.perUnitAmount))
			return false;
		if (this.percent == null) {
			if (other.percent != null)
				return false;
		} else if (!this.percent.equals(other.percent))
			return false;
		if (this.taxScheme == null) {
			if (other.taxScheme != null)
				return false;
		} else if (!this.taxScheme.equals(other.taxScheme))
			return false;
		if (this.tierRange == null) {
			if (other.tierRange != null)
				return false;
		} else if (!this.tierRange.equals(other.tierRange))
			return false;
		if (this.tierRatePercent == null) {
			if (other.tierRatePercent != null)
				return false;
		} else if (!this.tierRatePercent.equals(other.tierRatePercent))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // TaxCategoryType