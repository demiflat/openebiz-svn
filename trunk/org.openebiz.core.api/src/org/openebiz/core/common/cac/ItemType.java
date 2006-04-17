/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import java.util.List;

import org.openebiz.core.common.cbc.AdditionalInformationType;
import org.openebiz.core.common.cbc.CatalogueIndicatorType;
import org.openebiz.core.common.cbc.DescriptionType;
import org.openebiz.core.common.cbc.HazardousRiskIndicatorType;
import org.openebiz.core.common.cbc.NameType;
import org.openebiz.core.common.cbc.PackQuantityType;
import org.openebiz.core.common.cbc.PackSizeNumericType;

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
 */
public interface ItemType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

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
	 */
	DescriptionType getDescription();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 */
	void setDescription(DescriptionType value);

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
	 */
	PackQuantityType getPackQuantity();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemType#getPackQuantity <em>Pack Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pack Quantity</em>' containment reference.
	 * @see #getPackQuantity()
	 */
	void setPackQuantity(PackQuantityType value);

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
	 */
	PackSizeNumericType getPackSizeNumeric();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemType#getPackSizeNumeric <em>Pack Size Numeric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pack Size Numeric</em>' containment reference.
	 * @see #getPackSizeNumeric()
	 */
	void setPackSizeNumeric(PackSizeNumericType value);

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
	 */
	CatalogueIndicatorType getCatalogueIndicator();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemType#getCatalogueIndicator <em>Catalogue Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalogue Indicator</em>' containment reference.
	 * @see #getCatalogueIndicator()
	 */
	void setCatalogueIndicator(CatalogueIndicatorType value);

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
	 */
	NameType getName();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 */
	void setName(NameType value);

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
	 */
	HazardousRiskIndicatorType getHazardousRiskIndicator();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemType#getHazardousRiskIndicator <em>Hazardous Risk Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hazardous Risk Indicator</em>' containment reference.
	 * @see #getHazardousRiskIndicator()
	 */
	void setHazardousRiskIndicator(HazardousRiskIndicatorType value);

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
	 */
	AdditionalInformationType getAdditionalInformation();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemType#getAdditionalInformation <em>Additional Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Information</em>' containment reference.
	 * @see #getAdditionalInformation()
	 */
	void setAdditionalInformation(AdditionalInformationType value);

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
	 */
	List getKeyword();

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
	 */
	List getBrandName();

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
	 */
	List getModelName();

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
	 */
	ItemIdentificationType getBuyersItemIdentification();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemType#getBuyersItemIdentification <em>Buyers Item Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buyers Item Identification</em>' containment reference.
	 * @see #getBuyersItemIdentification()
	 */
	void setBuyersItemIdentification(ItemIdentificationType value);

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
	 */
	ItemIdentificationType getSellersItemIdentification();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemType#getSellersItemIdentification <em>Sellers Item Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sellers Item Identification</em>' containment reference.
	 * @see #getSellersItemIdentification()
	 */
	void setSellersItemIdentification(ItemIdentificationType value);

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
	 */
	ItemIdentificationType getManufacturersItemIdentification();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemType#getManufacturersItemIdentification <em>Manufacturers Item Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturers Item Identification</em>' containment reference.
	 * @see #getManufacturersItemIdentification()
	 */
	void setManufacturersItemIdentification(ItemIdentificationType value);

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
	 */
	ItemIdentificationType getStandardItemIdentification();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemType#getStandardItemIdentification <em>Standard Item Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Item Identification</em>' containment reference.
	 * @see #getStandardItemIdentification()
	 */
	void setStandardItemIdentification(ItemIdentificationType value);

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
	 */
	ItemIdentificationType getCatalogueItemIdentification();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemType#getCatalogueItemIdentification <em>Catalogue Item Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalogue Item Identification</em>' containment reference.
	 * @see #getCatalogueItemIdentification()
	 */
	void setCatalogueItemIdentification(ItemIdentificationType value);

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
	 */
	List getAdditionalItemIdentification();

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
	 */
	DocumentReferenceType getCatalogueDocumentReference();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemType#getCatalogueDocumentReference <em>Catalogue Document Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalogue Document Reference</em>' containment reference.
	 * @see #getCatalogueDocumentReference()
	 */
	void setCatalogueDocumentReference(DocumentReferenceType value);

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
	 */
	LotIdentificationType getLotIdentification();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemType#getLotIdentification <em>Lot Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lot Identification</em>' containment reference.
	 * @see #getLotIdentification()
	 */
	void setLotIdentification(LotIdentificationType value);

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
	 */
	CountryType getOriginCountry();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemType#getOriginCountry <em>Origin Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Country</em>' containment reference.
	 * @see #getOriginCountry()
	 */
	void setOriginCountry(CountryType value);

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
	 */
	CommodityClassificationType getCommodityClassification();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemType#getCommodityClassification <em>Commodity Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commodity Classification</em>' containment reference.
	 * @see #getCommodityClassification()
	 */
	void setCommodityClassification(CommodityClassificationType value);

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
	 */
	List getTransactionConditions();

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
	 */
	List getHazardousItem();

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
	 */
	List getClassifiedTaxCategory();

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
	 */
	List getAdditionalItemProperty();

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
	 */
	List getManufacturerParty();

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
	 */
	PartyType getInformationContentProviderParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemType#getInformationContentProviderParty <em>Information Content Provider Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information Content Provider Party</em>' containment reference.
	 * @see #getInformationContentProviderParty()
	 */
	void setInformationContentProviderParty(PartyType value);

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
	 */
	List getOriginAddress();

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
	 */
	List getItemInstance();

} // ItemType