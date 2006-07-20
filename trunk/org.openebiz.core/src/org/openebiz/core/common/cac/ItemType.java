/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.AdditionalInformationType;
import org.openebiz.core.common.cbc.BrandNameType;
import org.openebiz.core.common.cbc.CatalogueIndicatorType;
import org.openebiz.core.common.cbc.DescriptionType;
import org.openebiz.core.common.cbc.HazardousRiskIndicatorType;
import org.openebiz.core.common.cbc.KeywordType;
import org.openebiz.core.common.cbc.ModelNameType;
import org.openebiz.core.common.cbc.NameType;
import org.openebiz.core.common.cbc.PackQuantityType;
import org.openebiz.core.common.cbc.PackSizeNumericType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Item. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>information directly relating to an item</ccts:Definition>
 *           <ccts:ObjectClass>Item</ccts:ObjectClass>
 *           <ccts:AlternativeBusinessTerms>article, product, goods item</ccts:AlternativeBusinessTerms>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.ItemType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemType#getPackQuantity <em>Pack Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemType#getPackSizeNumeric <em>Pack Size Numeric</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemType#getCatalogueIndicator <em>Catalogue Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemType#getName <em>Name</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemType#getHazardousRiskIndicator <em>Hazardous Risk Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemType#getAdditionalInformation <em>Additional Information</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemType#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemType#getBrandName <em>Brand Name</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemType#getModelName <em>Model Name</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemType#getBuyersItemIdentification <em>Buyers Item Identification</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemType#getSellersItemIdentification <em>Sellers Item Identification</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemType#getManufacturersItemIdentification <em>Manufacturers Item Identification</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemType#getStandardItemIdentification <em>Standard Item Identification</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemType#getCatalogueItemIdentification <em>Catalogue Item Identification</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemType#getAdditionalItemIdentification <em>Additional Item Identification</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemType#getCatalogueDocumentReference <em>Catalogue Document Reference</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemType#getLotIdentification <em>Lot Identification</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemType#getOriginCountry <em>Origin Country</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemType#getCommodityClassification <em>Commodity Classification</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemType#getTransactionConditions <em>Transaction Conditions</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemType#getHazardousItem <em>Hazardous Item</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemType#getClassifiedTaxCategory <em>Classified Tax Category</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemType#getAdditionalItemProperty <em>Additional Item Property</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemType#getManufacturerParty <em>Manufacturer Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemType#getInformationContentProviderParty <em>Information Content Provider Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemType#getOriginAddress <em>Origin Address</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemType#getItemInstance <em>Item Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemType implements Serializable {
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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected DescriptionType description = null;

	/**
	 * The cached value of the '{@link #getPackQuantity() <em>Pack Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackQuantity()
	 * @generated
	 * @ordered
	 */
	protected PackQuantityType packQuantity = null;

	/**
	 * The cached value of the '{@link #getPackSizeNumeric() <em>Pack Size Numeric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackSizeNumeric()
	 * @generated
	 * @ordered
	 */
	protected PackSizeNumericType packSizeNumeric = null;

	/**
	 * The cached value of the '{@link #getCatalogueIndicator() <em>Catalogue Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalogueIndicator()
	 * @generated
	 * @ordered
	 */
	protected CatalogueIndicatorType catalogueIndicator = null;

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
	 * The cached value of the '{@link #getHazardousRiskIndicator() <em>Hazardous Risk Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazardousRiskIndicator()
	 * @generated
	 * @ordered
	 */
	protected HazardousRiskIndicatorType hazardousRiskIndicator = null;

	/**
	 * The cached value of the '{@link #getAdditionalInformation() <em>Additional Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInformation()
	 * @generated
	 * @ordered
	 */
	protected AdditionalInformationType additionalInformation = null;

	/**
	 * The cached value of the '{@link #getKeyword() <em>Keyword</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyword()
	 * @generated
	 * @ordered
	 */
	protected List keyword = null;

	/**
	 * The cached value of the '{@link #getBrandName() <em>Brand Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrandName()
	 * @generated
	 * @ordered
	 */
	protected List brandName = null;

	/**
	 * The cached value of the '{@link #getModelName() <em>Model Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected List modelName = null;

	/**
	 * The cached value of the '{@link #getBuyersItemIdentification() <em>Buyers Item Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuyersItemIdentification()
	 * @generated
	 * @ordered
	 */
	protected ItemIdentificationType buyersItemIdentification = null;

	/**
	 * The cached value of the '{@link #getSellersItemIdentification() <em>Sellers Item Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSellersItemIdentification()
	 * @generated
	 * @ordered
	 */
	protected ItemIdentificationType sellersItemIdentification = null;

	/**
	 * The cached value of the '{@link #getManufacturersItemIdentification() <em>Manufacturers Item Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturersItemIdentification()
	 * @generated
	 * @ordered
	 */
	protected ItemIdentificationType manufacturersItemIdentification = null;

	/**
	 * The cached value of the '{@link #getStandardItemIdentification() <em>Standard Item Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardItemIdentification()
	 * @generated
	 * @ordered
	 */
	protected ItemIdentificationType standardItemIdentification = null;

	/**
	 * The cached value of the '{@link #getCatalogueItemIdentification() <em>Catalogue Item Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalogueItemIdentification()
	 * @generated
	 * @ordered
	 */
	protected ItemIdentificationType catalogueItemIdentification = null;

	/**
	 * The cached value of the '{@link #getAdditionalItemIdentification() <em>Additional Item Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalItemIdentification()
	 * @generated
	 * @ordered
	 */
	protected List additionalItemIdentification = null;

	/**
	 * The cached value of the '{@link #getCatalogueDocumentReference() <em>Catalogue Document Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalogueDocumentReference()
	 * @generated
	 * @ordered
	 */
	protected DocumentReferenceType catalogueDocumentReference = null;

	/**
	 * The cached value of the '{@link #getLotIdentification() <em>Lot Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLotIdentification()
	 * @generated
	 * @ordered
	 */
	protected LotIdentificationType lotIdentification = null;

	/**
	 * The cached value of the '{@link #getOriginCountry() <em>Origin Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginCountry()
	 * @generated
	 * @ordered
	 */
	protected CountryType originCountry = null;

	/**
	 * The cached value of the '{@link #getCommodityClassification() <em>Commodity Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommodityClassification()
	 * @generated
	 * @ordered
	 */
	protected CommodityClassificationType commodityClassification = null;

	/**
	 * The cached value of the '{@link #getTransactionConditions() <em>Transaction Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionConditions()
	 * @generated
	 * @ordered
	 */
	protected List transactionConditions = null;

	/**
	 * The cached value of the '{@link #getHazardousItem() <em>Hazardous Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazardousItem()
	 * @generated
	 * @ordered
	 */
	protected List hazardousItem = null;

	/**
	 * The cached value of the '{@link #getClassifiedTaxCategory() <em>Classified Tax Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifiedTaxCategory()
	 * @generated
	 * @ordered
	 */
	protected List classifiedTaxCategory = null;

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
	 * The cached value of the '{@link #getManufacturerParty() <em>Manufacturer Party</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturerParty()
	 * @generated
	 * @ordered
	 */
	protected List manufacturerParty = null;

	/**
	 * The cached value of the '{@link #getInformationContentProviderParty() <em>Information Content Provider Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationContentProviderParty()
	 * @generated
	 * @ordered
	 */
	protected PartyType informationContentProviderParty = null;

	/**
	 * The cached value of the '{@link #getOriginAddress() <em>Origin Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginAddress()
	 * @generated
	 * @ordered
	 */
	protected List originAddress = null;

	/**
	 * The cached value of the '{@link #getItemInstance() <em>Item Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemInstance()
	 * @generated
	 * @ordered
	 */
	protected List itemInstance = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ItemType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.description = this.getDescription();
		this.packQuantity = this.getPackQuantity();
		this.packSizeNumeric = this.getPackSizeNumeric();
		this.catalogueIndicator = this.getCatalogueIndicator();
		this.name = this.getName();
		this.hazardousRiskIndicator = this.getHazardousRiskIndicator();
		this.additionalInformation = this.getAdditionalInformation();
		this.keyword = this.getKeyword();
		this.brandName = this.getBrandName();
		this.modelName = this.getModelName();
		this.buyersItemIdentification = this.getBuyersItemIdentification();
		this.sellersItemIdentification = this.getSellersItemIdentification();
		this.manufacturersItemIdentification = this.getManufacturersItemIdentification();
		this.standardItemIdentification = this.getStandardItemIdentification();
		this.catalogueItemIdentification = this.getCatalogueItemIdentification();
		this.additionalItemIdentification = this.getAdditionalItemIdentification();
		this.catalogueDocumentReference = this.getCatalogueDocumentReference();
		this.lotIdentification = this.getLotIdentification();
		this.originCountry = this.getOriginCountry();
		this.commodityClassification = this.getCommodityClassification();
		this.transactionConditions = this.getTransactionConditions();
		this.hazardousItem = this.getHazardousItem();
		this.classifiedTaxCategory = this.getClassifiedTaxCategory();
		this.additionalItemProperty = this.getAdditionalItemProperty();
		this.manufacturerParty = this.getManufacturerParty();
		this.informationContentProviderParty = this.getInformationContentProviderParty();
		this.originAddress = this.getOriginAddress();
		this.itemInstance = this.getItemInstance();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getName().getValue());
		return sdisplay.toString();
	}
	
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item. Description. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>a free form field that can be used to give a text description of the item.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Description</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(DescriptionType)
	 * @generated
	 */
	public DescriptionType getDescription() {
		return (description == null) ? new DescriptionType() : description;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	public void setDescription(DescriptionType newDescription) {
		description = newDescription;
	}

	/**
	 * Returns the value of the '<em><b>Pack Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item. Pack Quantity. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the unit packaging quantity.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Pack Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pack Quantity</em>' containment reference.
	 * @see #setPackQuantity(PackQuantityType)
	 * @generated
	 */
	public PackQuantityType getPackQuantity() {
		return (packQuantity == null) ? new PackQuantityType() : packQuantity;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemType#getPackQuantity <em>Pack Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pack Quantity</em>' containment reference.
	 * @see #getPackQuantity()
	 * @generated
	 */
	public void setPackQuantity(PackQuantityType newPackQuantity) {
		packQuantity = newPackQuantity;
	}

	/**
	 * Returns the value of the '<em><b>Pack Size Numeric</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item. Pack Size. Numeric</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the number of items in a pack.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Pack Size</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Numeric</ccts:RepresentationTerm>
	 *               <ccts:DataType>Numeric. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pack Size Numeric</em>' containment reference.
	 * @see #setPackSizeNumeric(PackSizeNumericType)
	 * @generated
	 */
	public PackSizeNumericType getPackSizeNumeric() {
		return (packSizeNumeric == null) ? new PackSizeNumericType()
				: packSizeNumeric;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemType#getPackSizeNumeric <em>Pack Size Numeric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pack Size Numeric</em>' containment reference.
	 * @see #getPackSizeNumeric()
	 * @generated
	 */
	public void setPackSizeNumeric(PackSizeNumericType newPackSizeNumeric) {
		packSizeNumeric = newPackSizeNumeric;
	}

	/**
	 * Returns the value of the '<em><b>Catalogue Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item. Catalogue Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>an indicator that denotes whether the item was ordered from a catalogue (true) or not (false).</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Catalogue Indicator</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Catalogue Indicator</em>' containment reference.
	 * @see #setCatalogueIndicator(CatalogueIndicatorType)
	 * @generated
	 */
	public CatalogueIndicatorType getCatalogueIndicator() {
		return (catalogueIndicator == null) ? new CatalogueIndicatorType()
				: catalogueIndicator;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemType#getCatalogueIndicator <em>Catalogue Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalogue Indicator</em>' containment reference.
	 * @see #getCatalogueIndicator()
	 * @generated
	 */
	public void setCatalogueIndicator(
			CatalogueIndicatorType newCatalogueIndicator) {
		catalogueIndicator = newCatalogueIndicator;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item. Name</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>a shortname (optionally) given to an item, such as a name from a catalogue, as distinct to a description</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Name</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Name</ccts:RepresentationTerm>
	 *               <ccts:DataType>Name. Type</ccts:DataType>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemType#getName <em>Name</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Hazardous Risk Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item. Hazardous Risk Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An indicator as to whether the item as delivered is hazardous</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item</ccts:ObjectClass>
	 * 
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemType#getHazardousRiskIndicator <em>Hazardous Risk Indicator</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Additional Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item. Additional_ Information. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>To provide more details of the item (eg URL of a relevant web page).</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Additional</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Information</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Information</em>' containment reference.
	 * @see #setAdditionalInformation(AdditionalInformationType)
	 * @generated
	 */
	public AdditionalInformationType getAdditionalInformation() {
		return (additionalInformation == null) ? new AdditionalInformationType()
				: additionalInformation;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemType#getAdditionalInformation <em>Additional Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Information</em>' containment reference.
	 * @see #getAdditionalInformation()
	 * @generated
	 */
	public void setAdditionalInformation(
			AdditionalInformationType newAdditionalInformation) {
		additionalInformation = newAdditionalInformation;
	}

	/**
	 * Returns the value of the '<em><b>Keyword</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cbc.KeywordType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item. Keyword. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A Seller Party-defined search string for the item. Also could be synonyms.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Keyword</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Keyword</em>' containment reference list.
	 * @generated
	 */
	public List getKeyword() {
		if (keyword == null) {
			keyword = new ArrayList<KeywordType>();
		}
		return keyword;
	}

	/**
	 * Returns the value of the '<em><b>Brand Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cbc.BrandNameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item. Brand Name. Name</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The brand name for the item.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Brand Name</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Name</ccts:RepresentationTerm>
	 *               <ccts:DataType>Name. Type</ccts:DataType>
	 *               <ccts:Examples>Coca-Cola</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Brand Name</em>' containment reference list.
	 * @generated
	 */
	public List getBrandName() {
		if (brandName == null) {
			brandName = new ArrayList<BrandNameType>();
		}
		return brandName;
	}

	/**
	 * Returns the value of the '<em><b>Model Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cbc.ModelNameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item. Model Name. Name</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Model name for the item</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Model Name</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Name</ccts:RepresentationTerm>
	 *               <ccts:DataType>Name. Type</ccts:DataType>
	 *               <ccts:Examples>"VW Beetle"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Name</em>' containment reference list.
	 * @generated
	 */
	public List getModelName() {
		if (modelName == null) {
			modelName = new ArrayList<ModelNameType>();
		}
		return modelName;
	}

	/**
	 * Returns the value of the '<em><b>Buyers Item Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item. Buyers_ Item Identification. Item Identification</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>associates the item with its identification according to the buyers system.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Buyers</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Item Identification</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Item Identification</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Buyers Item Identification</em>' containment reference.
	 * @see #setBuyersItemIdentification(ItemIdentificationType)
	 * @generated
	 */
	public ItemIdentificationType getBuyersItemIdentification() {
		return (buyersItemIdentification == null) ? new ItemIdentificationType()
				: buyersItemIdentification;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemType#getBuyersItemIdentification <em>Buyers Item Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buyers Item Identification</em>' containment reference.
	 * @see #getBuyersItemIdentification()
	 * @generated
	 */
	public void setBuyersItemIdentification(
			ItemIdentificationType newBuyersItemIdentification) {
		buyersItemIdentification = newBuyersItemIdentification;
	}

	/**
	 * Returns the value of the '<em><b>Sellers Item Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item. Sellers_ Item Identification. Item Identification</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>associates the item with its identification according to the sellers system.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Sellers</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Item Identification</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Item Identification</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sellers Item Identification</em>' containment reference.
	 * @see #setSellersItemIdentification(ItemIdentificationType)
	 * @generated
	 */
	public ItemIdentificationType getSellersItemIdentification() {
		return (sellersItemIdentification == null) ? new ItemIdentificationType()
				: sellersItemIdentification;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemType#getSellersItemIdentification <em>Sellers Item Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sellers Item Identification</em>' containment reference.
	 * @see #getSellersItemIdentification()
	 * @generated
	 */
	public void setSellersItemIdentification(
			ItemIdentificationType newSellersItemIdentification) {
		sellersItemIdentification = newSellersItemIdentification;
	}

	/**
	 * Returns the value of the '<em><b>Manufacturers Item Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item. Manufacturers_ Item Identification. Item Identification</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>associates the item with its identification according to the manufacturers system.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Manufacturers</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Item Identification</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Item Identification</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturers Item Identification</em>' containment reference.
	 * @see #setManufacturersItemIdentification(ItemIdentificationType)
	 * @generated
	 */
	public ItemIdentificationType getManufacturersItemIdentification() {
		return (manufacturersItemIdentification == null) ? new ItemIdentificationType()
				: manufacturersItemIdentification;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemType#getManufacturersItemIdentification <em>Manufacturers Item Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturers Item Identification</em>' containment reference.
	 * @see #getManufacturersItemIdentification()
	 * @generated
	 */
	public void setManufacturersItemIdentification(
			ItemIdentificationType newManufacturersItemIdentification) {
		manufacturersItemIdentification = newManufacturersItemIdentification;
	}

	/**
	 * Returns the value of the '<em><b>Standard Item Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item. Standard_ Item Identification. Item Identification</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>associates the item with its identification according to a standard system.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Standard</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Item Identification</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Item Identification</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Standard Item Identification</em>' containment reference.
	 * @see #setStandardItemIdentification(ItemIdentificationType)
	 * @generated
	 */
	public ItemIdentificationType getStandardItemIdentification() {
		return (standardItemIdentification == null) ? new ItemIdentificationType()
				: standardItemIdentification;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemType#getStandardItemIdentification <em>Standard Item Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Item Identification</em>' containment reference.
	 * @see #getStandardItemIdentification()
	 * @generated
	 */
	public void setStandardItemIdentification(
			ItemIdentificationType newStandardItemIdentification) {
		standardItemIdentification = newStandardItemIdentification;
	}

	/**
	 * Returns the value of the '<em><b>Catalogue Item Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item. Catalogue_ Item Identification. Item Identification</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>associates the item with its identification according to a cataloging system.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Catalogue</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Item Identification</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Item Identification</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Catalogue Item Identification</em>' containment reference.
	 * @see #setCatalogueItemIdentification(ItemIdentificationType)
	 * @generated
	 */
	public ItemIdentificationType getCatalogueItemIdentification() {
		return (catalogueItemIdentification == null) ? new ItemIdentificationType()
				: catalogueItemIdentification;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemType#getCatalogueItemIdentification <em>Catalogue Item Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalogue Item Identification</em>' containment reference.
	 * @see #getCatalogueItemIdentification()
	 * @generated
	 */
	public void setCatalogueItemIdentification(
			ItemIdentificationType newCatalogueItemIdentification) {
		catalogueItemIdentification = newCatalogueItemIdentification;
	}

	/**
	 * Returns the value of the '<em><b>Additional Item Identification</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.ItemIdentificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item. Additional_ Item Identification. Item Identification</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>associates the item with other identification means</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Additional</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Item Identification</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Item Identification</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Item Identification</em>' containment reference list.
	 * @generated
	 */
	public List getAdditionalItemIdentification() {
		if (additionalItemIdentification == null) {
			additionalItemIdentification = new ArrayList<
					ItemIdentificationType>();
		}
		return additionalItemIdentification;
	}

	/**
	 * Returns the value of the '<em><b>Catalogue Document Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item. Catalogue_ Document Reference. Document Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>associates the item with the catalogue from which the item was selected.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Catalogue</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Document Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Document Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Catalogue Document Reference</em>' containment reference.
	 * @see #setCatalogueDocumentReference(DocumentReferenceType)
	 * @generated
	 */
	public DocumentReferenceType getCatalogueDocumentReference() {
		return (catalogueDocumentReference == null) ? new DocumentReferenceType()
				: catalogueDocumentReference;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemType#getCatalogueDocumentReference <em>Catalogue Document Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalogue Document Reference</em>' containment reference.
	 * @see #getCatalogueDocumentReference()
	 * @generated
	 */
	public void setCatalogueDocumentReference(
			DocumentReferenceType newCatalogueDocumentReference) {
		catalogueDocumentReference = newCatalogueDocumentReference;
	}

	/**
	 * Returns the value of the '<em><b>Lot Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item. Lot Identification</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>associates the item with its lot identification (the identification that allows recall of the item if necessary)</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Lot Identification</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Lot Identification</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lot Identification</em>' containment reference.
	 * @see #setLotIdentification(LotIdentificationType)
	 * @generated
	 */
	public LotIdentificationType getLotIdentification() {
		return (lotIdentification == null) ? new LotIdentificationType()
				: lotIdentification;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemType#getLotIdentification <em>Lot Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lot Identification</em>' containment reference.
	 * @see #getLotIdentification()
	 * @generated
	 */
	public void setLotIdentification(LotIdentificationType newLotIdentification) {
		lotIdentification = newLotIdentification;
	}

	/**
	 * Returns the value of the '<em><b>Origin Country</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item. Origin_ Country. Country</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>associates the item with its country of origin</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Origin</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Country</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Country</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Origin Country</em>' containment reference.
	 * @see #setOriginCountry(CountryType)
	 * @generated
	 */
	public CountryType getOriginCountry() {
		return (originCountry == null) ? new CountryType() : originCountry;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemType#getOriginCountry <em>Origin Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Country</em>' containment reference.
	 * @see #getOriginCountry()
	 * @generated
	 */
	public void setOriginCountry(CountryType newOriginCountry) {
		originCountry = newOriginCountry;
	}

	/**
	 * Returns the value of the '<em><b>Commodity Classification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item. Commodity Classification</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>associates the item with its classification(s) according to a commodity classifying system.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Commodity Classification</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Commodity Classification</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Commodity Classification</em>' containment reference.
	 * @see #setCommodityClassification(CommodityClassificationType)
	 * @generated
	 */
	public CommodityClassificationType getCommodityClassification() {
		return (commodityClassification == null) ? new CommodityClassificationType()
				: commodityClassification;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemType#getCommodityClassification <em>Commodity Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commodity Classification</em>' containment reference.
	 * @see #getCommodityClassification()
	 * @generated
	 */
	public void setCommodityClassification(
			CommodityClassificationType newCommodityClassification) {
		commodityClassification = newCommodityClassification;
	}

	/**
	 * Returns the value of the '<em><b>Transaction Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.TransactionConditionsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item. Transaction Conditions</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>associates the item with sales conditions appertaining to it.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Transaction Conditions</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Transaction Conditions</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transaction Conditions</em>' containment reference list.
	 * @generated
	 */
	public List getTransactionConditions() {
		if (transactionConditions == null) {
			transactionConditions = new ArrayList<
					TransactionConditionsType>();
		}
		return transactionConditions;
	}

	/**
	 * Returns the value of the '<em><b>Hazardous Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.HazardousItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item. Hazardous Item</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>associates the item with its hazardous item information.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Hazardous Item</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Hazardous Item</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hazardous Item</em>' containment reference list.
	 * @generated
	 */
	public List getHazardousItem() {
		if (hazardousItem == null) {
			hazardousItem = new ArrayList<HazardousItemType>();
		}
		return hazardousItem;
	}

	/**
	 * Returns the value of the '<em><b>Classified Tax Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.TaxCategoryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item. Classified_ Tax Category. Tax Category</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>classifies the item using one or more categories of taxes</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Classified</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Tax Category</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Tax Category</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classified Tax Category</em>' containment reference list.
	 * @generated
	 */
	public List getClassifiedTaxCategory() {
		if (classifiedTaxCategory == null) {
			classifiedTaxCategory = new ArrayList<
					TaxCategoryType>();
		}
		return classifiedTaxCategory;
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
	 *               <ccts:DictionaryEntryName>Item. Additional_ Item Property. Item Property</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>associates the item with a set of additional properties</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item</ccts:ObjectClass>
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

	/**
	 * Returns the value of the '<em><b>Manufacturer Party</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.PartyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item. Manufacturer_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>associates the manufacturer of the item.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Manufacturer</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer Party</em>' containment reference list.
	 * @generated
	 */
	public List getManufacturerParty() {
		if (manufacturerParty == null) {
			manufacturerParty = new ArrayList<PartyType>();
		}
		return manufacturerParty;
	}

	/**
	 * Returns the value of the '<em><b>Information Content Provider Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item. Information Content Provider_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>associates the item with the party responsible for the technical specifications of the item.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Information Content Provider</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Information Content Provider Party</em>' containment reference.
	 * @see #setInformationContentProviderParty(PartyType)
	 * @generated
	 */
	public PartyType getInformationContentProviderParty() {
		return (informationContentProviderParty == null) ? new PartyType()
				: informationContentProviderParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemType#getInformationContentProviderParty <em>Information Content Provider Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information Content Provider Party</em>' containment reference.
	 * @see #getInformationContentProviderParty()
	 * @generated
	 */
	public void setInformationContentProviderParty(
			PartyType newInformationContentProviderParty) {
		informationContentProviderParty = newInformationContentProviderParty;
	}

	/**
	 * Returns the value of the '<em><b>Origin Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.AddressType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item. Origin_ Address. Address</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>associates the item with the region of origin (ie not the country)</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Origin</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Address</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Address</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Origin Address</em>' containment reference list.
	 * @generated
	 */
	public List getOriginAddress() {
		if (originAddress == null) {
			originAddress = new ArrayList<AddressType>();
		}
		return originAddress;
	}

	/**
	 * Returns the value of the '<em><b>Item Instance</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.ItemInstanceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item. Item Instance</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Item Instance</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Item Instance</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Item Instance</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Instance</em>' containment reference list.
	 * @generated
	 */
	public List getItemInstance() {
		if (itemInstance == null) {
			itemInstance = new ArrayList<ItemInstanceType>();
		}
		return itemInstance;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.additionalInformation == null) ? 0 : this.additionalInformation.hashCode());
		result = PRIME * result + ((this.additionalItemIdentification == null) ? 0 : this.additionalItemIdentification.hashCode());
		result = PRIME * result + ((this.additionalItemProperty == null) ? 0 : this.additionalItemProperty.hashCode());
		result = PRIME * result + ((this.brandName == null) ? 0 : this.brandName.hashCode());
		result = PRIME * result + ((this.buyersItemIdentification == null) ? 0 : this.buyersItemIdentification.hashCode());
		result = PRIME * result + ((this.catalogueDocumentReference == null) ? 0 : this.catalogueDocumentReference.hashCode());
		result = PRIME * result + ((this.catalogueIndicator == null) ? 0 : this.catalogueIndicator.hashCode());
		result = PRIME * result + ((this.catalogueItemIdentification == null) ? 0 : this.catalogueItemIdentification.hashCode());
		result = PRIME * result + ((this.classifiedTaxCategory == null) ? 0 : this.classifiedTaxCategory.hashCode());
		result = PRIME * result + ((this.commodityClassification == null) ? 0 : this.commodityClassification.hashCode());
		result = PRIME * result + ((this.description == null) ? 0 : this.description.hashCode());
		result = PRIME * result + ((this.hazardousItem == null) ? 0 : this.hazardousItem.hashCode());
		result = PRIME * result + ((this.hazardousRiskIndicator == null) ? 0 : this.hazardousRiskIndicator.hashCode());
		result = PRIME * result + ((this.informationContentProviderParty == null) ? 0 : this.informationContentProviderParty.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.itemInstance == null) ? 0 : this.itemInstance.hashCode());
		result = PRIME * result + ((this.keyword == null) ? 0 : this.keyword.hashCode());
		result = PRIME * result + ((this.lotIdentification == null) ? 0 : this.lotIdentification.hashCode());
		result = PRIME * result + ((this.manufacturerParty == null) ? 0 : this.manufacturerParty.hashCode());
		result = PRIME * result + ((this.manufacturersItemIdentification == null) ? 0 : this.manufacturersItemIdentification.hashCode());
		result = PRIME * result + ((this.modelName == null) ? 0 : this.modelName.hashCode());
		result = PRIME * result + ((this.name == null) ? 0 : this.name.hashCode());
		result = PRIME * result + ((this.originAddress == null) ? 0 : this.originAddress.hashCode());
		result = PRIME * result + ((this.originCountry == null) ? 0 : this.originCountry.hashCode());
		result = PRIME * result + ((this.packQuantity == null) ? 0 : this.packQuantity.hashCode());
		result = PRIME * result + ((this.packSizeNumeric == null) ? 0 : this.packSizeNumeric.hashCode());
		result = PRIME * result + ((this.sellersItemIdentification == null) ? 0 : this.sellersItemIdentification.hashCode());
		result = PRIME * result + ((this.standardItemIdentification == null) ? 0 : this.standardItemIdentification.hashCode());
		result = PRIME * result + ((this.transactionConditions == null) ? 0 : this.transactionConditions.hashCode());
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
		final ItemType other = (ItemType) obj;
		if (this.additionalInformation == null) {
			if (other.additionalInformation != null)
				return false;
		} else if (!this.additionalInformation.equals(other.additionalInformation))
			return false;
		if (this.additionalItemIdentification == null) {
			if (other.additionalItemIdentification != null)
				return false;
		} else if (!this.additionalItemIdentification.equals(other.additionalItemIdentification))
			return false;
		if (this.additionalItemProperty == null) {
			if (other.additionalItemProperty != null)
				return false;
		} else if (!this.additionalItemProperty.equals(other.additionalItemProperty))
			return false;
		if (this.brandName == null) {
			if (other.brandName != null)
				return false;
		} else if (!this.brandName.equals(other.brandName))
			return false;
		if (this.buyersItemIdentification == null) {
			if (other.buyersItemIdentification != null)
				return false;
		} else if (!this.buyersItemIdentification.equals(other.buyersItemIdentification))
			return false;
		if (this.catalogueDocumentReference == null) {
			if (other.catalogueDocumentReference != null)
				return false;
		} else if (!this.catalogueDocumentReference.equals(other.catalogueDocumentReference))
			return false;
		if (this.catalogueIndicator == null) {
			if (other.catalogueIndicator != null)
				return false;
		} else if (!this.catalogueIndicator.equals(other.catalogueIndicator))
			return false;
		if (this.catalogueItemIdentification == null) {
			if (other.catalogueItemIdentification != null)
				return false;
		} else if (!this.catalogueItemIdentification.equals(other.catalogueItemIdentification))
			return false;
		if (this.classifiedTaxCategory == null) {
			if (other.classifiedTaxCategory != null)
				return false;
		} else if (!this.classifiedTaxCategory.equals(other.classifiedTaxCategory))
			return false;
		if (this.commodityClassification == null) {
			if (other.commodityClassification != null)
				return false;
		} else if (!this.commodityClassification.equals(other.commodityClassification))
			return false;
		if (this.description == null) {
			if (other.description != null)
				return false;
		} else if (!this.description.equals(other.description))
			return false;
		if (this.hazardousItem == null) {
			if (other.hazardousItem != null)
				return false;
		} else if (!this.hazardousItem.equals(other.hazardousItem))
			return false;
		if (this.hazardousRiskIndicator == null) {
			if (other.hazardousRiskIndicator != null)
				return false;
		} else if (!this.hazardousRiskIndicator.equals(other.hazardousRiskIndicator))
			return false;
		if (this.informationContentProviderParty == null) {
			if (other.informationContentProviderParty != null)
				return false;
		} else if (!this.informationContentProviderParty.equals(other.informationContentProviderParty))
			return false;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.itemInstance == null) {
			if (other.itemInstance != null)
				return false;
		} else if (!this.itemInstance.equals(other.itemInstance))
			return false;
		if (this.keyword == null) {
			if (other.keyword != null)
				return false;
		} else if (!this.keyword.equals(other.keyword))
			return false;
		if (this.lotIdentification == null) {
			if (other.lotIdentification != null)
				return false;
		} else if (!this.lotIdentification.equals(other.lotIdentification))
			return false;
		if (this.manufacturerParty == null) {
			if (other.manufacturerParty != null)
				return false;
		} else if (!this.manufacturerParty.equals(other.manufacturerParty))
			return false;
		if (this.manufacturersItemIdentification == null) {
			if (other.manufacturersItemIdentification != null)
				return false;
		} else if (!this.manufacturersItemIdentification.equals(other.manufacturersItemIdentification))
			return false;
		if (this.modelName == null) {
			if (other.modelName != null)
				return false;
		} else if (!this.modelName.equals(other.modelName))
			return false;
		if (this.name == null) {
			if (other.name != null)
				return false;
		} else if (!this.name.equals(other.name))
			return false;
		if (this.originAddress == null) {
			if (other.originAddress != null)
				return false;
		} else if (!this.originAddress.equals(other.originAddress))
			return false;
		if (this.originCountry == null) {
			if (other.originCountry != null)
				return false;
		} else if (!this.originCountry.equals(other.originCountry))
			return false;
		if (this.packQuantity == null) {
			if (other.packQuantity != null)
				return false;
		} else if (!this.packQuantity.equals(other.packQuantity))
			return false;
		if (this.packSizeNumeric == null) {
			if (other.packSizeNumeric != null)
				return false;
		} else if (!this.packSizeNumeric.equals(other.packSizeNumeric))
			return false;
		if (this.sellersItemIdentification == null) {
			if (other.sellersItemIdentification != null)
				return false;
		} else if (!this.sellersItemIdentification.equals(other.sellersItemIdentification))
			return false;
		if (this.standardItemIdentification == null) {
			if (other.standardItemIdentification != null)
				return false;
		} else if (!this.standardItemIdentification.equals(other.standardItemIdentification))
			return false;
		if (this.transactionConditions == null) {
			if (other.transactionConditions != null)
				return false;
		} else if (!this.transactionConditions.equals(other.transactionConditions))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // ItemType