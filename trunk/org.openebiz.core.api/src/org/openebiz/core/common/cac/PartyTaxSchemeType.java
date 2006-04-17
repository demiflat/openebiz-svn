/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.CompanyIDType;
import org.openebiz.core.common.cbc.ExemptionReasonType;
import org.openebiz.core.common.cbc.RegistrationNameType;
import org.openebiz.core.common.cbc.TaxLevelCodeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party Tax Scheme Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Party Tax Scheme. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about a Party's Tax Scheme</ccts:Definition>
 *           <ccts:ObjectClass>Party Tax Scheme</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.PartyTaxSchemeType#getRegistrationName <em>Registration Name</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PartyTaxSchemeType#getCompanyID <em>Company ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PartyTaxSchemeType#getTaxLevelCode <em>Tax Level Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PartyTaxSchemeType#getExemptionReason <em>Exemption Reason</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PartyTaxSchemeType#getRegistrationAddress <em>Registration Address</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PartyTaxSchemeType#getTaxScheme <em>Tax Scheme</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface PartyTaxSchemeType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Registration Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Party Tax Scheme. Registration Name. Name</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The official name of the Party as registered with the relevant fiscal authority</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party Tax Scheme</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Registration Name</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Name</ccts:RepresentationTerm>
	 *               <ccts:DataType>Name. Type</ccts:DataType>
	 *               <ccts:Examples>"Microsoft Corporation"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Registration Name</em>' containment reference.
	 * @see #setRegistrationName(RegistrationNameType)
	 */
	RegistrationNameType getRegistrationName();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PartyTaxSchemeType#getRegistrationName <em>Registration Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registration Name</em>' containment reference.
	 * @see #getRegistrationName()
	 */
	void setRegistrationName(RegistrationNameType value);

	/**
	 * Returns the value of the '<em><b>Company ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Party Tax Scheme. Company Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier assigned for tax purposes to a Party by the taxation authority</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party Tax Scheme</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Company Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>VAT Number</ccts:AlternativeBusinessTerms>
	 *               <ccts:Examples>"3556625"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Company ID</em>' containment reference.
	 * @see #setCompanyID(CompanyIDType)
	 */
	CompanyIDType getCompanyID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PartyTaxSchemeType#getCompanyID <em>Company ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Company ID</em>' containment reference.
	 * @see #getCompanyID()
	 */
	void setCompanyID(CompanyIDType value);

	/**
	 * Returns the value of the '<em><b>Tax Level Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Party Tax Scheme. Tax Level. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The section or role within the tax scheme that applies to The Party</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party Tax Scheme</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Tax Level</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tax Level Code</em>' containment reference.
	 * @see #setTaxLevelCode(TaxLevelCodeType)
	 */
	TaxLevelCodeType getTaxLevelCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PartyTaxSchemeType#getTaxLevelCode <em>Tax Level Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Level Code</em>' containment reference.
	 * @see #getTaxLevelCode()
	 */
	void setTaxLevelCode(TaxLevelCodeType value);

	/**
	 * Returns the value of the '<em><b>Exemption Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Party Tax Scheme. Exemption Reason. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A reason for a Party's exemption from tax</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party Tax Scheme</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Exemption Reason</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exemption Reason</em>' containment reference.
	 * @see #setExemptionReason(ExemptionReasonType)
	 */
	ExemptionReasonType getExemptionReason();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PartyTaxSchemeType#getExemptionReason <em>Exemption Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exemption Reason</em>' containment reference.
	 * @see #getExemptionReason()
	 */
	void setExemptionReason(ExemptionReasonType value);

	/**
	 * Returns the value of the '<em><b>Registration Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Party Tax Scheme. Registration_ Address. Address</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Registered Address (for tax purposes)</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party Tax Scheme</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Registration</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Address</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Address</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Registration Address</em>' containment reference.
	 * @see #setRegistrationAddress(AddressType)
	 */
	AddressType getRegistrationAddress();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PartyTaxSchemeType#getRegistrationAddress <em>Registration Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registration Address</em>' containment reference.
	 * @see #getRegistrationAddress()
	 */
	void setRegistrationAddress(AddressType value);

	/**
	 * Returns the value of the '<em><b>Tax Scheme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Party Tax Scheme. Tax Scheme</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Tax Scheme</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party Tax Scheme</ccts:ObjectClass>
	 * 
	 *               <ccts:PropertyTerm>Tax Scheme</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Tax Scheme</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tax Scheme</em>' containment reference.
	 * @see #setTaxScheme(TaxSchemeType)
	 */
	TaxSchemeType getTaxScheme();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PartyTaxSchemeType#getTaxScheme <em>Tax Scheme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Scheme</em>' containment reference.
	 * @see #getTaxScheme()
	 */
	void setTaxScheme(TaxSchemeType value);

} // PartyTaxSchemeType