/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import java.util.List;

import org.openebiz.core.common.cbc.CodeValueType;
import org.openebiz.core.common.cbc.DescriptionType;
import org.openebiz.core.common.cbc.NameType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classification Category Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Classification Category. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about a Classification Category; a sub division of a Classification Scheme</ccts:Definition>
 *           <ccts:ObjectClass>Classification Category</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.ClassificationCategoryType#getName <em>Name</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ClassificationCategoryType#getCodeValue <em>Code Value</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ClassificationCategoryType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ClassificationCategoryType#getCategorizesClassificationCategory <em>Categorizes Classification Category</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface ClassificationCategoryType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Classification Category. Name</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The name of the Classification Category</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Classification Category</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Name</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Name</ccts:RepresentationTerm>
	 *               <ccts:DataType>Name. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Code List Name</ccts:AlternativeBusinessTerms>
	 *               <ccts:Examples>"UNSPSC Class", "UNSPSC Segment", "UNSPSC Family"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(NameType)
	 */
	NameType getName();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ClassificationCategoryType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 */
	void setName(NameType value);

	/**
	 * Returns the value of the '<em><b>Code Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Classification Category. Code Value. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The Classification Category value</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Classification Category</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Code Value</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Code Value</ccts:AlternativeBusinessTerms>
	 *               <ccts:Examples>3420001, 3273666, HSJJD-213</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code Value</em>' containment reference.
	 * @see #setCodeValue(CodeValueType)
	 */
	CodeValueType getCodeValue();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ClassificationCategoryType#getCodeValue <em>Code Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Value</em>' containment reference.
	 * @see #getCodeValue()
	 */
	void setCodeValue(CodeValueType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Classification Category. Description. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The description of the Classification Category</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Classification Category</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Description</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Code Name</ccts:AlternativeBusinessTerms>
	 *               <ccts:Examples>"Electrical Goods", "Wooden Toys"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(DescriptionType)
	 */
	DescriptionType getDescription();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ClassificationCategoryType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 */
	void setDescription(DescriptionType value);

	/**
	 * Returns the value of the '<em><b>Categorizes Classification Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.ClassificationCategoryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Classification Category. Categorizes_ Classification Category. Classification Category</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to sub categories within the Category</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Classification Category</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Categorizes</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Classification Category</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Classification Category</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Categorizes Classification Category</em>' containment reference list.
	 */
	List getCategorizesClassificationCategory();

} // ClassificationCategoryType