/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.PackageLevelCodeType;
import org.openebiz.core.common.cbc.PackagingTypeCodeType;
import org.openebiz.core.common.cbc.PackingMaterialType;
import org.openebiz.core.common.cbc.QuantityType;
import org.openebiz.core.common.cbc.ReturnableMaterialIndicatorType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Package. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about a Package</ccts:Definition>
 *           <ccts:ObjectClass>Package</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.PackageType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PackageType#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PackageType#getReturnableMaterialIndicator <em>Returnable Material Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PackageType#getPackageLevelCode <em>Package Level Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PackageType#getPackagingTypeCode <em>Packaging Type Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PackageType#getPackingMaterial <em>Packing Material</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PackageType#getContainedPackage <em>Contained Package</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PackageType#getGoodsItem <em>Goods Item</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PackageType#getMeasurementDimension <em>Measurement Dimension</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PackageType#getDeliveryUnit <em>Delivery Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageType implements Serializable {
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
	 * The cached value of the '{@link #getReturnableMaterialIndicator() <em>Returnable Material Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnableMaterialIndicator()
	 * @generated
	 * @ordered
	 */
	protected ReturnableMaterialIndicatorType returnableMaterialIndicator = null;

	/**
	 * The cached value of the '{@link #getPackageLevelCode() <em>Package Level Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageLevelCode()
	 * @generated
	 * @ordered
	 */
	protected PackageLevelCodeType packageLevelCode = null;

	/**
	 * The cached value of the '{@link #getPackagingTypeCode() <em>Packaging Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagingTypeCode()
	 * @generated
	 * @ordered
	 */
	protected PackagingTypeCodeType packagingTypeCode = null;

	/**
	 * The cached value of the '{@link #getPackingMaterial() <em>Packing Material</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackingMaterial()
	 * @generated
	 * @ordered
	 */
	protected List packingMaterial = null;

	/**
	 * The cached value of the '{@link #getContainedPackage() <em>Contained Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedPackage()
	 * @generated
	 * @ordered
	 */
	protected PackageType containedPackage = null;

	/**
	 * The cached value of the '{@link #getGoodsItem() <em>Goods Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoodsItem()
	 * @generated
	 * @ordered
	 */
	protected List goodsItem = null;

	/**
	 * The cached value of the '{@link #getMeasurementDimension() <em>Measurement Dimension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementDimension()
	 * @generated
	 * @ordered
	 */
	protected List measurementDimension = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public PackageType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.iD = this.getID();
		this.quantity = this.getQuantity();
		this.returnableMaterialIndicator = this.getReturnableMaterialIndicator();
		this.packageLevelCode = this.getPackageLevelCode();
		this.packagingTypeCode = this.getPackagingTypeCode();
		this.packingMaterial = this.getPackingMaterial();
		this.containedPackage = this.getContainedPackage();
		this.goodsItem = this.getGoodsItem();
		this.measurementDimension = this.getMeasurementDimension();
		this.deliveryUnit = this.getDeliveryUnit();
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
	 *               <ccts:DictionaryEntryName>Package. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the Package</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Package</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PackageType#getID <em>ID</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Package. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The quantity (of Items) contained in the Package</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Package</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PackageType#getQuantity <em>Quantity</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Returnable Material Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Package. Returnable Material Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Indicates whether the packaging material is returnable (true) or not (false).</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Package</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Returnable Material Indicator</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Returnable Material Indicator</em>' containment reference.
	 * @see #setReturnableMaterialIndicator(ReturnableMaterialIndicatorType)
	 * @generated
	 */
	public ReturnableMaterialIndicatorType getReturnableMaterialIndicator() {
		return (returnableMaterialIndicator == null) ? new ReturnableMaterialIndicatorType()
				: returnableMaterialIndicator;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PackageType#getReturnableMaterialIndicator <em>Returnable Material Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returnable Material Indicator</em>' containment reference.
	 * @see #getReturnableMaterialIndicator()
	 * @generated
	 */
	public void setReturnableMaterialIndicator(
			ReturnableMaterialIndicatorType newReturnableMaterialIndicator) {
		returnableMaterialIndicator = newReturnableMaterialIndicator;
	}

	/**
	 * Returns the value of the '<em><b>Package Level Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Package. Package Level. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Code specifying a level of packaging.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Package</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Package Level</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package Level Code</em>' containment reference.
	 * @see #setPackageLevelCode(PackageLevelCodeType)
	 * @generated
	 */
	public PackageLevelCodeType getPackageLevelCode() {
		return (packageLevelCode == null) ? new PackageLevelCodeType()
				: packageLevelCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PackageType#getPackageLevelCode <em>Package Level Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Level Code</em>' containment reference.
	 * @see #getPackageLevelCode()
	 * @generated
	 */
	public void setPackageLevelCode(PackageLevelCodeType newPackageLevelCode) {
		packageLevelCode = newPackageLevelCode;
	}

	/**
	 * Returns the value of the '<em><b>Packaging Type Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Package. Packaging Type. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Code specifying the type of packaging of an item.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Package</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Packaging Type</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Package classification code</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packaging Type Code</em>' containment reference.
	 * @see #setPackagingTypeCode(PackagingTypeCodeType)
	 * @generated
	 */
	public PackagingTypeCodeType getPackagingTypeCode() {
		return (packagingTypeCode == null) ? new PackagingTypeCodeType()
				: packagingTypeCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PackageType#getPackagingTypeCode <em>Packaging Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packaging Type Code</em>' containment reference.
	 * @see #getPackagingTypeCode()
	 * @generated
	 */
	public void setPackagingTypeCode(PackagingTypeCodeType newPackagingTypeCode) {
		packagingTypeCode = newPackagingTypeCode;
	}

	/**
	 * Returns the value of the '<em><b>Packing Material</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cbc.PackingMaterialType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Package. Packing Material. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Description of the type of packaging of an item.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Package</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Packing Material</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packing Material</em>' containment reference list.
	 * @generated
	 */
	public List getPackingMaterial() {
		if (packingMaterial == null) {
			packingMaterial = new ArrayList<PackingMaterialType>();
		}
		return packingMaterial;
	}

	/**
	 * Returns the value of the '<em><b>Contained Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Package. Contained_ Package. Package</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Contained Package; used to describe a Package within a Package</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Package</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Contained</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Package</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Package</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contained Package</em>' containment reference.
	 * @see #setContainedPackage(PackageType)
	 * @generated
	 */
	public PackageType getContainedPackage() {
		return (containedPackage == null) ? new PackageType()
				: containedPackage;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PackageType#getContainedPackage <em>Contained Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained Package</em>' containment reference.
	 * @see #getContainedPackage()
	 * @generated
	 */
	public void setContainedPackage(PackageType newContainedPackage) {
		containedPackage = newContainedPackage;
	}

	/**
	 * Returns the value of the '<em><b>Goods Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.GoodsItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Package. Goods Item</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Goods Item</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Package</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Goods Item</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Goods Item</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Goods Item</em>' containment reference list.
	 * @generated
	 */
	public List getGoodsItem() {
		if (goodsItem == null) {
			goodsItem = new ArrayList<GoodsItemType>();
		}
		return goodsItem;
	}

	/**
	 * Returns the value of the '<em><b>Measurement Dimension</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.DimensionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Package. Measurement_ Dimension. Dimension</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to describe the measurement dimensions of the package</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Package</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Measurement</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Dimension</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Dimension</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measurement Dimension</em>' containment reference list.
	 * @generated
	 */
	public List getMeasurementDimension() {
		if (measurementDimension == null) {
			measurementDimension = new ArrayList<DimensionType>();
		}
		return measurementDimension;
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
	 *               <ccts:DictionaryEntryName>Package. Delivery Unit</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Delivery Units in the package</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Package</ccts:ObjectClass>
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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.containedPackage == null) ? 0 : this.containedPackage.hashCode());
		result = PRIME * result + ((this.deliveryUnit == null) ? 0 : this.deliveryUnit.hashCode());
		result = PRIME * result + ((this.goodsItem == null) ? 0 : this.goodsItem.hashCode());
		result = PRIME * result + ((this.iD == null) ? 0 : this.iD.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.measurementDimension == null) ? 0 : this.measurementDimension.hashCode());
		result = PRIME * result + ((this.packageLevelCode == null) ? 0 : this.packageLevelCode.hashCode());
		result = PRIME * result + ((this.packagingTypeCode == null) ? 0 : this.packagingTypeCode.hashCode());
		result = PRIME * result + ((this.packingMaterial == null) ? 0 : this.packingMaterial.hashCode());
		result = PRIME * result + ((this.quantity == null) ? 0 : this.quantity.hashCode());
		result = PRIME * result + ((this.returnableMaterialIndicator == null) ? 0 : this.returnableMaterialIndicator.hashCode());
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
		final PackageType other = (PackageType) obj;
		if (this.containedPackage == null) {
			if (other.containedPackage != null)
				return false;
		} else if (!this.containedPackage.equals(other.containedPackage))
			return false;
		if (this.deliveryUnit == null) {
			if (other.deliveryUnit != null)
				return false;
		} else if (!this.deliveryUnit.equals(other.deliveryUnit))
			return false;
		if (this.goodsItem == null) {
			if (other.goodsItem != null)
				return false;
		} else if (!this.goodsItem.equals(other.goodsItem))
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
		if (this.measurementDimension == null) {
			if (other.measurementDimension != null)
				return false;
		} else if (!this.measurementDimension.equals(other.measurementDimension))
			return false;
		if (this.packageLevelCode == null) {
			if (other.packageLevelCode != null)
				return false;
		} else if (!this.packageLevelCode.equals(other.packageLevelCode))
			return false;
		if (this.packagingTypeCode == null) {
			if (other.packagingTypeCode != null)
				return false;
		} else if (!this.packagingTypeCode.equals(other.packagingTypeCode))
			return false;
		if (this.packingMaterial == null) {
			if (other.packingMaterial != null)
				return false;
		} else if (!this.packingMaterial.equals(other.packingMaterial))
			return false;
		if (this.quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!this.quantity.equals(other.quantity))
			return false;
		if (this.returnableMaterialIndicator == null) {
			if (other.returnableMaterialIndicator != null)
				return false;
		} else if (!this.returnableMaterialIndicator.equals(other.returnableMaterialIndicator))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // PackageType