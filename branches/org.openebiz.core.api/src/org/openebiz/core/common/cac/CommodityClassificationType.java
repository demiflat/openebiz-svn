/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.CargoTypeCodeType;
import org.openebiz.core.common.cbc.CommodityCodeType;
import org.openebiz.core.common.cbc.ItemClassificationCodeType;
import org.openebiz.core.common.cbc.NatureCodeType;

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
 */
public interface CommodityClassificationType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

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
	 */
	NatureCodeType getNatureCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CommodityClassificationType#getNatureCode <em>Nature Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature Code</em>' containment reference.
	 * @see #getNatureCode()
	 */
	void setNatureCode(NatureCodeType value);

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
	 */
	CargoTypeCodeType getCargoTypeCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CommodityClassificationType#getCargoTypeCode <em>Cargo Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cargo Type Code</em>' containment reference.
	 * @see #getCargoTypeCode()
	 */
	void setCargoTypeCode(CargoTypeCodeType value);

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
	 */
	CommodityCodeType getCommodityCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CommodityClassificationType#getCommodityCode <em>Commodity Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commodity Code</em>' containment reference.
	 * @see #getCommodityCode()
	 */
	void setCommodityCode(CommodityCodeType value);

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
	 */
	ItemClassificationCodeType getItemClassificationCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CommodityClassificationType#getItemClassificationCode <em>Item Classification Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Classification Code</em>' containment reference.
	 * @see #getItemClassificationCode()
	 */
	void setItemClassificationCode(ItemClassificationCodeType value);

} // CommodityClassificationType