/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.LossRiskResponsibilityCodeType;
import org.openebiz.core.common.cbc.LossRiskType;
import org.openebiz.core.common.cbc.RelevantLocationConditionsType;
import org.openebiz.core.common.cbc.SpecialTermsType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delivery Terms Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Delivery Terms. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about Delivery Terms</ccts:Definition>
 *           <ccts:ObjectClass>Delivery Terms</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryTermsType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryTermsType#getRelevantLocationConditions <em>Relevant Location Conditions</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryTermsType#getSpecialTerms <em>Special Terms</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryTermsType#getLossRiskResponsibilityCode <em>Loss Risk Responsibility Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryTermsType#getLossRisk <em>Loss Risk</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryTermsType#getAllowanceCharge <em>Allowance Charge</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface DeliveryTermsType {
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
	 *               <ccts:DictionaryEntryName>Delivery Terms. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the Delivery Terms</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery Terms</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:Examples>CIF, FOB, or EXW from the INCOTERMS Terms of Delivery. (2000 version preferred.)</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID</em>' containment reference.
	 * @see #setID(IDType)
	 */
	IDType getID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryTermsType#getID <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' containment reference.
	 * @see #getID()
	 */
	void setID(IDType value);

	/**
	 * Returns the value of the '<em><b>Relevant Location Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery Terms. Relevant_ Location Conditions. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Information about the delivery location relevant to the Delivery Terms</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery Terms</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Relevant</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Location Conditions</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:Examples>"Warehouse accepts 24 x 7</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relevant Location Conditions</em>' containment reference.
	 * @see #setRelevantLocationConditions(RelevantLocationConditionsType)
	 */
	RelevantLocationConditionsType getRelevantLocationConditions();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryTermsType#getRelevantLocationConditions <em>Relevant Location Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relevant Location Conditions</em>' containment reference.
	 * @see #getRelevantLocationConditions()
	 */
	void setRelevantLocationConditions(RelevantLocationConditionsType value);

	/**
	 * Returns the value of the '<em><b>Special Terms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery Terms. Special_ Terms. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A description of special conditions relating to the Delivery Terms</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery Terms</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Special</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Terms</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Special Terms</em>' containment reference.
	 * @see #setSpecialTerms(SpecialTermsType)
	 */
	SpecialTermsType getSpecialTerms();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryTermsType#getSpecialTerms <em>Special Terms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Special Terms</em>' containment reference.
	 * @see #getSpecialTerms()
	 */
	void setSpecialTerms(SpecialTermsType value);

	/**
	 * Returns the value of the '<em><b>Loss Risk Responsibility Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery Terms. Loss Risk Responsibility. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An identifier for the responsibility for loss risk in the context of the Delivery Terms; expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery Terms</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Loss Risk Responsibility</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loss Risk Responsibility Code</em>' containment reference.
	 * @see #setLossRiskResponsibilityCode(LossRiskResponsibilityCodeType)
	 */
	LossRiskResponsibilityCodeType getLossRiskResponsibilityCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryTermsType#getLossRiskResponsibilityCode <em>Loss Risk Responsibility Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loss Risk Responsibility Code</em>' containment reference.
	 * @see #getLossRiskResponsibilityCode()
	 */
	void setLossRiskResponsibilityCode(LossRiskResponsibilityCodeType value);

	/**
	 * Returns the value of the '<em><b>Loss Risk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery Terms. Loss Risk. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A description of the loss risk in the context of the Delivery Terms</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery Terms</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Loss Risk</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loss Risk</em>' containment reference.
	 * @see #setLossRisk(LossRiskType)
	 */
	LossRiskType getLossRisk();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryTermsType#getLossRisk <em>Loss Risk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loss Risk</em>' containment reference.
	 * @see #getLossRisk()
	 */
	void setLossRisk(LossRiskType value);

	/**
	 * Returns the value of the '<em><b>Allowance Charge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery Terms. Allowance Charge</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Allowance Charge</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery Terms</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Allowance Charge</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Allowance Charge</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allowance Charge</em>' containment reference.
	 * @see #setAllowanceCharge(AllowanceChargeType)
	 */
	AllowanceChargeType getAllowanceCharge();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryTermsType#getAllowanceCharge <em>Allowance Charge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowance Charge</em>' containment reference.
	 * @see #getAllowanceCharge()
	 */
	void setAllowanceCharge(AllowanceChargeType value);

} // DeliveryTermsType