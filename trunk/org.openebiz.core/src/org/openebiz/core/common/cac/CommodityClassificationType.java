/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.CargoTypeCodeType;
import org.openebiz.core.common.cbc.CommodityCodeType;
import org.openebiz.core.common.cbc.ItemClassificationCodeType;
import org.openebiz.core.common.cbc.NatureCodeType;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commodity Classification Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Commodity Classification. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about Commodity Classification</ccts:Definition>
 *           <ccts:ObjectClass>Commodity Classification</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.CommodityClassificationType#getNatureCode <em>Nature Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CommodityClassificationType#getCargoTypeCode <em>Cargo Type Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CommodityClassificationType#getCommodityCode <em>Commodity Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CommodityClassificationType#getItemClassificationCode <em>Item Classification Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommodityClassificationType implements Serializable {
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
	 * The cached value of the '{@link #getNatureCode() <em>Nature Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatureCode()
	 * @generated
	 * @ordered
	 */
	protected NatureCodeType natureCode = null;

	/**
	 * The cached value of the '{@link #getCargoTypeCode() <em>Cargo Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCargoTypeCode()
	 * @generated
	 * @ordered
	 */
	protected CargoTypeCodeType cargoTypeCode = null;

	/**
	 * The cached value of the '{@link #getCommodityCode() <em>Commodity Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommodityCode()
	 * @generated
	 * @ordered
	 */
	protected CommodityCodeType commodityCode = null;

	/**
	 * The cached value of the '{@link #getItemClassificationCode() <em>Item Classification Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemClassificationCode()
	 * @generated
	 * @ordered
	 */
	protected ItemClassificationCodeType itemClassificationCode = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public CommodityClassificationType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.natureCode = this.getNatureCode();
		this.cargoTypeCode = this.getCargoTypeCode();
		this.commodityCode = this.getCommodityCode();
		this.itemClassificationCode = this.getItemClassificationCode();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getCommodityCode().getValue());
		return sdisplay.toString();
	}
	
	/**
	 * Returns the value of the '<em><b>Nature Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Commodity Classification. Nature Code. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The high level nature of Classification issued by a specific maintenance agency expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Commodity Classification</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Nature Code</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:Examples>"wooden products"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nature Code</em>' containment reference.
	 * @see #setNatureCode(NatureCodeType)
	 * @generated
	 */
	public NatureCodeType getNatureCode() {
		return (natureCode == null) ? new NatureCodeType() : natureCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CommodityClassificationType#getNatureCode <em>Nature Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature Code</em>' containment reference.
	 * @see #getNatureCode()
	 * @generated
	 */
	public void setNatureCode(NatureCodeType newNatureCode) {
		natureCode = newNatureCode;
	}

	/**
	 * Returns the value of the '<em><b>Cargo Type Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Commodity Classification. Cargo Type. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The type of cargo expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Commodity Classification</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Cargo Type</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:Examples>"Refrigerated"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cargo Type Code</em>' containment reference.
	 * @see #setCargoTypeCode(CargoTypeCodeType)
	 * @generated
	 */
	public CargoTypeCodeType getCargoTypeCode() {
		return (cargoTypeCode == null) ? new CargoTypeCodeType()
				: cargoTypeCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CommodityClassificationType#getCargoTypeCode <em>Cargo Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cargo Type Code</em>' containment reference.
	 * @see #getCargoTypeCode()
	 * @generated
	 */
	public void setCargoTypeCode(CargoTypeCodeType newCargoTypeCode) {
		cargoTypeCode = newCargoTypeCode;
	}

	/**
	 * Returns the value of the '<em><b>Commodity Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Commodity Classification. Commodity Code. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The harmonized international commodity code for regulatory (customs and trade statistics) purposes.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Commodity Classification</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Commodity Code</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Harmonized Code</ccts:AlternativeBusinessTerms>
	 *               <ccts:Examples>"1102222883"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Commodity Code</em>' containment reference.
	 * @see #setCommodityCode(CommodityCodeType)
	 * @generated
	 */
	public CommodityCodeType getCommodityCode() {
		return (commodityCode == null) ? new CommodityCodeType()
				: commodityCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CommodityClassificationType#getCommodityCode <em>Commodity Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commodity Code</em>' containment reference.
	 * @see #getCommodityCode()
	 * @generated
	 */
	public void setCommodityCode(CommodityCodeType newCommodityCode) {
		commodityCode = newCommodityCode;
	}

	/**
	 * Returns the value of the '<em><b>Item Classification Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Commodity Classification. Item Classification. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The trade commodity classification expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Commodity Classification</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Item Classification</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>UN/SPSC Code</ccts:AlternativeBusinessTerms>
	 *               <ccts:Examples>"3440234"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Classification Code</em>' containment reference.
	 * @see #setItemClassificationCode(ItemClassificationCodeType)
	 * @generated
	 */
	public ItemClassificationCodeType getItemClassificationCode() {
		return (itemClassificationCode == null) ? new ItemClassificationCodeType()
				: itemClassificationCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CommodityClassificationType#getItemClassificationCode <em>Item Classification Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Classification Code</em>' containment reference.
	 * @see #getItemClassificationCode()
	 * @generated
	 */
	public void setItemClassificationCode(
			ItemClassificationCodeType newItemClassificationCode) {
		itemClassificationCode = newItemClassificationCode;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.cargoTypeCode == null) ? 0 : this.cargoTypeCode.hashCode());
		result = PRIME * result + ((this.commodityCode == null) ? 0 : this.commodityCode.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.itemClassificationCode == null) ? 0 : this.itemClassificationCode.hashCode());
		result = PRIME * result + ((this.natureCode == null) ? 0 : this.natureCode.hashCode());
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
		final CommodityClassificationType other = (CommodityClassificationType) obj;
		if (this.cargoTypeCode == null) {
			if (other.cargoTypeCode != null)
				return false;
		} else if (!this.cargoTypeCode.equals(other.cargoTypeCode))
			return false;
		if (this.commodityCode == null) {
			if (other.commodityCode != null)
				return false;
		} else if (!this.commodityCode.equals(other.commodityCode))
			return false;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.itemClassificationCode == null) {
			if (other.itemClassificationCode != null)
				return false;
		} else if (!this.itemClassificationCode.equals(other.itemClassificationCode))
			return false;
		if (this.natureCode == null) {
			if (other.natureCode != null)
				return false;
		} else if (!this.natureCode.equals(other.natureCode))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // CommodityClassificationType