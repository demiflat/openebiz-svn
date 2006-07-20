/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.AttributeIDType;
import org.openebiz.core.common.cbc.DescriptionCodeType;
import org.openebiz.core.common.cbc.DescriptionType;
import org.openebiz.core.common.cbc.PositionCodeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Physical Attribute. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about Physical Attributes</ccts:Definition>
 *           <ccts:ObjectClass>Physical Attribute</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.PhysicalAttributeType#getAttributeID <em>Attribute ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PhysicalAttributeType#getPositionCode <em>Position Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PhysicalAttributeType#getDescriptionCode <em>Description Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PhysicalAttributeType#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface PhysicalAttributeType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Attribute ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Physical Attribute. Attribute Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the Physical Attribute</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Physical Attribute</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Attribute Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:Examples>"colour" "style"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute ID</em>' containment reference.
	 * @see #setAttributeID(AttributeIDType)
	 */
	AttributeIDType getAttributeID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PhysicalAttributeType#getAttributeID <em>Attribute ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute ID</em>' containment reference.
	 * @see #getAttributeID()
	 */
	void setAttributeID(AttributeIDType value);

	/**
	 * Returns the value of the '<em><b>Position Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Physical Attribute. Position. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The position of the Physical Attribute expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Physical Attribute</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Position</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position Code</em>' containment reference.
	 * @see #setPositionCode(PositionCodeType)
	 */
	PositionCodeType getPositionCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PhysicalAttributeType#getPositionCode <em>Position Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Code</em>' containment reference.
	 * @see #getPositionCode()
	 */
	void setPositionCode(PositionCodeType value);

	/**
	 * Returns the value of the '<em><b>Description Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Physical Attribute. Description Code. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The description of the Physical Attribute expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Physical Attribute</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Description Code</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:Examples>"XXL","Small"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description Code</em>' containment reference.
	 * @see #setDescriptionCode(DescriptionCodeType)
	 */
	DescriptionCodeType getDescriptionCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PhysicalAttributeType#getDescriptionCode <em>Description Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Code</em>' containment reference.
	 * @see #getDescriptionCode()
	 */
	void setDescriptionCode(DescriptionCodeType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Physical Attribute. Description. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The description of the Physical Attribute expressed in text</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Physical Attribute</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PhysicalAttributeType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 */
	void setDescription(DescriptionType value);

} // PhysicalAttributeType