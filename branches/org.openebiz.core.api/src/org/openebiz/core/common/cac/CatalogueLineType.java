/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import java.util.List;

import org.openebiz.core.common.cbc.ActionCodeType;
import org.openebiz.core.common.cbc.ContentUnitQuantityType;
import org.openebiz.core.common.cbc.ContractSubdivisionType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.LifeCycleStatusCodeType;
import org.openebiz.core.common.cbc.MaximumOrderQuantityType;
import org.openebiz.core.common.cbc.MinimumOrderQuantityType;
import org.openebiz.core.common.cbc.OrderQuantityIncrementNumericType;
import org.openebiz.core.common.cbc.OrderableIndicatorType;
import org.openebiz.core.common.cbc.OrderingUnitMeasureIDType;
import org.openebiz.core.common.cbc.PackLevelCodeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalogue Line Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Catalogue Line. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>A catalogue line is the basic element of catalogue, it is something that can be bought.</ccts:Definition>
 *           <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getActionCode <em>Action Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getLifeCycleStatusCode <em>Life Cycle Status Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getContractSubdivision <em>Contract Subdivision</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getNote <em>Note</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getOrderableIndicator <em>Orderable Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getOrderingUnitMeasureID <em>Ordering Unit Measure ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getContentUnitQuantity <em>Content Unit Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getOrderQuantityIncrementNumeric <em>Order Quantity Increment Numeric</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getMinimumOrderQuantity <em>Minimum Order Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getMaximumOrderQuantity <em>Maximum Order Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getWarrantyInformation <em>Warranty Information</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getPackLevelCode <em>Pack Level Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getInformationValidityPeriod <em>Information Validity Period</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getValidityPeriod <em>Validity Period</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getItemComparison <em>Item Comparison</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getComponentRelatedItem <em>Component Related Item</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getAccessoryRelatedItem <em>Accessory Related Item</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getRequiredRelatedItem <em>Required Related Item</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getReplacementRelatedItem <em>Replacement Related Item</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getComplementaryRelatedItem <em>Complementary Related Item</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getRequiredItemLocationQuantity <em>Required Item Location Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getItem <em>Item</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface CatalogueLineType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A unique instance identifier for the line in this catalogue document.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:Examples>"1"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID</em>' containment reference.
	 * @see #setID(IDType)
	 */
	IDType getID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CatalogueLineType#getID <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' containment reference.
	 * @see #getID()
	 */
	void setID(IDType value);

	/**
	 * Returns the value of the '<em><b>Action Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Action. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Code indicating the action required for this item to synchronise with external repositories.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Action</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:Examples>"Replace", "Update", "Delete","Add"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Code</em>' containment reference.
	 * @see #setActionCode(ActionCodeType)
	 */
	ActionCodeType getActionCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CatalogueLineType#getActionCode <em>Action Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Code</em>' containment reference.
	 * @see #getActionCode()
	 */
	void setActionCode(ActionCodeType value);

	/**
	 * Returns the value of the '<em><b>Life Cycle Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Life Cycle Status. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Code indicating availability of this line</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Life Cycle Status</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:Examples>"new - announcement only", "new and available", "deleted - announcement only"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Life Cycle Status Code</em>' containment reference.
	 * @see #setLifeCycleStatusCode(LifeCycleStatusCodeType)
	 */
	LifeCycleStatusCodeType getLifeCycleStatusCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CatalogueLineType#getLifeCycleStatusCode <em>Life Cycle Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Life Cycle Status Code</em>' containment reference.
	 * @see #getLifeCycleStatusCode()
	 */
	void setLifeCycleStatusCode(LifeCycleStatusCodeType value);

	/**
	 * Returns the value of the '<em><b>Contract Subdivision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Contract Subdivision. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Identifies a sub-division of a contract or tender.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Contract Subdivision</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:Examples>"Installation", "Phase One", Support and Maintenance"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contract Subdivision</em>' containment reference.
	 * @see #setContractSubdivision(ContractSubdivisionType)
	 */
	ContractSubdivisionType getContractSubdivision();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CatalogueLineType#getContractSubdivision <em>Contract Subdivision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contract Subdivision</em>' containment reference.
	 * @see #getContractSubdivision()
	 */
	void setContractSubdivision(ContractSubdivisionType value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cbc.NoteType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Note. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Free text note used for non-structured information about the line in the specific catalogue document (intended to be human readable).</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Note</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 */
	List getNote();

	/**
	 * Returns the value of the '<em><b>Orderable Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Orderable. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Indicates if the line is orderable (that is, not just for information only)</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Orderable</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *               <ccts:Examples>TRUE means orderable, FALSE means not orderable</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Orderable Indicator</em>' containment reference.
	 * @see #setOrderableIndicator(OrderableIndicatorType)
	 */
	OrderableIndicatorType getOrderableIndicator();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CatalogueLineType#getOrderableIndicator <em>Orderable Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orderable Indicator</em>' containment reference.
	 * @see #getOrderableIndicator()
	 */
	void setOrderableIndicator(OrderableIndicatorType value);

	/**
	 * Returns the value of the '<em><b>Ordering Unit Measure ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Ordering_ Unit Measure. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The unit measure for ordering.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Ordering</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Unit Measure</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:Examples>order unit measure = box, content unit quantity = 10, representing a box of 10 items.</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ordering Unit Measure ID</em>' containment reference.
	 * @see #setOrderingUnitMeasureID(OrderingUnitMeasureIDType)
	 */
	OrderingUnitMeasureIDType getOrderingUnitMeasureID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CatalogueLineType#getOrderingUnitMeasureID <em>Ordering Unit Measure ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordering Unit Measure ID</em>' containment reference.
	 * @see #getOrderingUnitMeasureID()
	 */
	void setOrderingUnitMeasureID(OrderingUnitMeasureIDType value);

	/**
	 * Returns the value of the '<em><b>Content Unit Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Content_ Unit. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The quantity of the order unit of measure of the line.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Content</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Unit</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *               <ccts:Examples>If order unit measure identifier is "each", then content unit quantity is "1".</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Unit Quantity</em>' containment reference.
	 * @see #setContentUnitQuantity(ContentUnitQuantityType)
	 */
	ContentUnitQuantityType getContentUnitQuantity();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CatalogueLineType#getContentUnitQuantity <em>Content Unit Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Unit Quantity</em>' containment reference.
	 * @see #getContentUnitQuantity()
	 */
	void setContentUnitQuantity(ContentUnitQuantityType value);

	/**
	 * Returns the value of the '<em><b>Order Quantity Increment Numeric</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Order_ Quantity Increment. Numeric</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The number of items that can set the order quantity increments.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Order</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Quantity Increment</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Numeric</ccts:RepresentationTerm>
	 *               <ccts:DataType>Numeric. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order Quantity Increment Numeric</em>' containment reference.
	 * @see #setOrderQuantityIncrementNumeric(OrderQuantityIncrementNumericType)
	 */
	OrderQuantityIncrementNumericType getOrderQuantityIncrementNumeric();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CatalogueLineType#getOrderQuantityIncrementNumeric <em>Order Quantity Increment Numeric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Quantity Increment Numeric</em>' containment reference.
	 * @see #getOrderQuantityIncrementNumeric()
	 */
	void setOrderQuantityIncrementNumeric(
			OrderQuantityIncrementNumericType value);

	/**
	 * Returns the value of the '<em><b>Minimum Order Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Minimum_ Order. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The minimum amount of items that can be ordered</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Minimum</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Order</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *               <ccts:Examples>"10 boxes"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Order Quantity</em>' containment reference.
	 * @see #setMinimumOrderQuantity(MinimumOrderQuantityType)
	 */
	MinimumOrderQuantityType getMinimumOrderQuantity();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CatalogueLineType#getMinimumOrderQuantity <em>Minimum Order Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Order Quantity</em>' containment reference.
	 * @see #getMinimumOrderQuantity()
	 */
	void setMinimumOrderQuantity(MinimumOrderQuantityType value);

	/**
	 * Returns the value of the '<em><b>Maximum Order Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Maximum_ Order. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The maximum amount of items that can be ordered</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Maximum</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Order</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *               <ccts:Examples>"1 tonne"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Order Quantity</em>' containment reference.
	 * @see #setMaximumOrderQuantity(MaximumOrderQuantityType)
	 */
	MaximumOrderQuantityType getMaximumOrderQuantity();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CatalogueLineType#getMaximumOrderQuantity <em>Maximum Order Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Order Quantity</em>' containment reference.
	 * @see #getMaximumOrderQuantity()
	 */
	void setMaximumOrderQuantity(MaximumOrderQuantityType value);

	/**
	 * Returns the value of the '<em><b>Warranty Information</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cbc.WarrantyInformationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Warranty Information. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The text of the Seller Party's warranty details.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Warranty Information</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:Examples>"Unless specified otherwise and in addition to any rights the Customer may have under statute, Dell warrants to the Customer that Dell branded Products (excluding third party products and software), will be free from defects in materials and workmanship affecting normal use for a period of one year from invoice date ('Standard Warranty')."</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Warranty Information</em>' containment reference list.
	 */
	List getWarrantyInformation();

	/**
	 * Returns the value of the '<em><b>Pack Level Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Pack Level. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The level of packaging involved</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Pack Level</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Consumer Unit, Trading Unit</ccts:AlternativeBusinessTerms>
	 *               <ccts:Examples>"level 2", "Group 4"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pack Level Code</em>' containment reference.
	 * @see #setPackLevelCode(PackLevelCodeType)
	 */
	PackLevelCodeType getPackLevelCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CatalogueLineType#getPackLevelCode <em>Pack Level Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pack Level Code</em>' containment reference.
	 * @see #getPackLevelCode()
	 */
	void setPackLevelCode(PackLevelCodeType value);

	/**
	 * Returns the value of the '<em><b>Information Validity Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Information Validity_ Period. Period</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the party responsible for the integrity of the information provided about an item</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Information Validity</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Period</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Period</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Information Validity Period</em>' containment reference.
	 * @see #setInformationValidityPeriod(PeriodType)
	 */
	PeriodType getInformationValidityPeriod();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CatalogueLineType#getInformationValidityPeriod <em>Information Validity Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information Validity Period</em>' containment reference.
	 * @see #getInformationValidityPeriod()
	 */
	void setInformationValidityPeriod(PeriodType value);

	/**
	 * Returns the value of the '<em><b>Validity Period</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.PeriodType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Validity_ Period. Period</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An assocation to the period (assigned by the Seller Party) during which the information about the catalogue item is effective.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Validity</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Period</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Period</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validity Period</em>' containment reference list.
	 */
	List getValidityPeriod();

	/**
	 * Returns the value of the '<em><b>Item Comparison</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.ItemComparisonType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Item Comparison</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to comparative details for this item</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Item Comparison</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Item Comparison</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Comparison</em>' containment reference list.
	 */
	List getItemComparison();

	/**
	 * Returns the value of the '<em><b>Component Related Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.RelatedItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Component_ Related Item. Related Item</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association that describes any catalogue items that may be components of this item.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Component</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Related Item</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Related Item</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Related Item</em>' containment reference list.
	 */
	List getComponentRelatedItem();

	/**
	 * Returns the value of the '<em><b>Accessory Related Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.RelatedItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Accessory_ Related Item. Related Item</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association that describes any catalogue items that may be optional accessories to this item.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Accessory</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Related Item</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Related Item</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accessory Related Item</em>' containment reference list.
	 */
	List getAccessoryRelatedItem();

	/**
	 * Returns the value of the '<em><b>Required Related Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.RelatedItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Required_ Related Item. Related Item</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association that describes any catalogue items that may be required for this item.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Required</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Related Item</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Related Item</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Related Item</em>' containment reference list.
	 */
	List getRequiredRelatedItem();

	/**
	 * Returns the value of the '<em><b>Replacement Related Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.RelatedItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Replacement_ Related Item. Related Item</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association that describes any catalogue items that may be replacements for this item.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Replacement</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Related Item</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Related Item</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replacement Related Item</em>' containment reference list.
	 */
	List getReplacementRelatedItem();

	/**
	 * Returns the value of the '<em><b>Complementary Related Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.RelatedItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Complementary_ Related Item. Related Item</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association that describes any catalogue items that may complement this item.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Complementary</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Related Item</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Related Item</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Complementary Related Item</em>' containment reference list.
	 */
	List getComplementaryRelatedItem();

	/**
	 * Returns the value of the '<em><b>Required Item Location Quantity</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.ItemLocationQuantityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Required_ Item Location Quantity. Item Location Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the description of properties related to locations and quantities of the item.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Required</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Item Location Quantity</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Item Location Quantity</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Item Location Quantity</em>' containment reference list.
	 */
	List getRequiredItemLocationQuantity();

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Item</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Item itself.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Item</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Item</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference.
	 * @see #setItem(ItemType)
	 */
	ItemType getItem();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CatalogueLineType#getItem <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' containment reference.
	 * @see #getItem()
	 */
	void setItem(ItemType value);

} // CatalogueLineType