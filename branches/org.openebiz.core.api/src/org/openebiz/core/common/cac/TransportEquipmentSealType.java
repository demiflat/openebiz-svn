/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.ConditionType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.SealIssuerTypeCodeType;
import org.openebiz.core.common.cbc.SealStatusCodeType;
import org.openebiz.core.common.cbc.SealingPartyTypeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transport Equipment Seal Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Transport Equipment Seal. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 * 
 *           <ccts:Definition>Information about a Transport Equipment Seal.  A security device attached to the doors of a shipping container.</ccts:Definition>
 *           <ccts:ObjectClass>Transport Equipment Seal</ccts:ObjectClass>
 *           <ccts:AlternativeBusinessTerms>Container Seal</ccts:AlternativeBusinessTerms>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentSealType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentSealType#getSealIssuerTypeCode <em>Seal Issuer Type Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentSealType#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentSealType#getSealStatusCode <em>Seal Status Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentSealType#getSealingPartyType <em>Sealing Party Type</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface TransportEquipmentSealType {
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
	 *               <ccts:DictionaryEntryName>Transport Equipment Seal. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the seal</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment Seal</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:Examples>"ACS1234"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID</em>' containment reference.
	 * @see #setID(IDType)
	 */
	IDType getID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportEquipmentSealType#getID <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' containment reference.
	 * @see #getID()
	 */
	void setID(IDType value);

	/**
	 * Returns the value of the '<em><b>Seal Issuer Type Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Equipment Seal. Seal Issuer Type. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The type of party that issues and is responsible for a seal; expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment Seal</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Seal Issuer Type</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Seal Issuer Type Code</em>' containment reference.
	 * @see #setSealIssuerTypeCode(SealIssuerTypeCodeType)
	 */
	SealIssuerTypeCodeType getSealIssuerTypeCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportEquipmentSealType#getSealIssuerTypeCode <em>Seal Issuer Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seal Issuer Type Code</em>' containment reference.
	 * @see #getSealIssuerTypeCode()
	 */
	void setSealIssuerTypeCode(SealIssuerTypeCodeType value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Equipment Seal. Condition. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Information about the condition of a seal</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment Seal</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Condition</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(ConditionType)
	 */
	ConditionType getCondition();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportEquipmentSealType#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 */
	void setCondition(ConditionType value);

	/**
	 * Returns the value of the '<em><b>Seal Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Equipment Seal. Seal Status. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The status of a seal expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment Seal</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Seal Status</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Seal Status Code</em>' containment reference.
	 * @see #setSealStatusCode(SealStatusCodeType)
	 */
	SealStatusCodeType getSealStatusCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportEquipmentSealType#getSealStatusCode <em>Seal Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seal Status Code</em>' containment reference.
	 * @see #getSealStatusCode()
	 */
	void setSealStatusCode(SealStatusCodeType value);

	/**
	 * Returns the value of the '<em><b>Sealing Party Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Equipment Seal. Sealing Party Type. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Textual description of the role of a sealing party.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment Seal</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Sealing Party Type</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Sealing Party</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sealing Party Type</em>' containment reference.
	 * @see #setSealingPartyType(SealingPartyTypeType)
	 */
	SealingPartyTypeType getSealingPartyType();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportEquipmentSealType#getSealingPartyType <em>Sealing Party Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sealing Party Type</em>' containment reference.
	 * @see #getSealingPartyType()
	 */
	void setSealingPartyType(SealingPartyTypeType value);

} // TransportEquipmentSealType