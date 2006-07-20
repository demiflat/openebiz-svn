/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import java.util.List;

import org.openebiz.core.common.cbc.NameType;
import org.openebiz.core.common.cbc.ValueType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Item Property. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about specific Item Properties</ccts:Definition>
 *           <ccts:ObjectClass>Item Property</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.ItemPropertyType#getName <em>Name</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemPropertyType#getValue <em>Value</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemPropertyType#getUsabilityPeriod <em>Usability Period</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemPropertyType#getItemPropertyGroup <em>Item Property Group</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface ItemPropertyType {
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
	 *               <ccts:DictionaryEntryName>Item Property. Name</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The name of the Item Property</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item Property</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Name</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Name</ccts:RepresentationTerm>
	 *               <ccts:DataType>Name. Type</ccts:DataType>
	 *               <ccts:Examples>"Energy Rating", "Collar Size", "Fat Content"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(NameType)
	 */
	NameType getName();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemPropertyType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 */
	void setName(NameType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item Property. Value. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The Item Property value</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item Property</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Value</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:Examples>"100 watts", "15 European", "20% +/- 5%"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(ValueType)
	 */
	ValueType getValue();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemPropertyType#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 */
	void setValue(ValueType value);

	/**
	 * Returns the value of the '<em><b>Usability Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item Property. Usability_ Period. Period</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Period</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item Property</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Usability</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Period</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Period</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usability Period</em>' containment reference.
	 * @see #setUsabilityPeriod(PeriodType)
	 */
	PeriodType getUsabilityPeriod();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemPropertyType#getUsabilityPeriod <em>Usability Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usability Period</em>' containment reference.
	 * @see #getUsabilityPeriod()
	 */
	void setUsabilityPeriod(PeriodType value);

	/**
	 * Returns the value of the '<em><b>Item Property Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.ItemPropertyGroupType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item Property. Item Property Group</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Item Property Group</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item Property</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Item Property Group</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Item Property Group</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Property Group</em>' containment reference list.
	 */
	List getItemPropertyGroup();

} // ItemPropertyType