/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.CompanyIDType;
import org.openebiz.core.common.cbc.RegistrationNameType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party Legal Entity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Party Legal Entity. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>information directly relating to the legal registration that is applicable to a party.</ccts:Definition>
 *           <ccts:ObjectClass>Party Legal Entity</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.PartyLegalEntityType#getRegistrationName <em>Registration Name</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PartyLegalEntityType#getCompanyID <em>Company ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PartyLegalEntityType#getRegistrationAddress <em>Registration Address</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PartyLegalEntityType#getCorporateRegistrationScheme <em>Corporate Registration Scheme</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface PartyLegalEntityType {
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
	 *               <ccts:DictionaryEntryName>Party Legal Entity. Registration Name. Name</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the name of a party as registered with the legal authority.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party Legal Entity</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PartyLegalEntityType#getRegistrationName <em>Registration Name</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Party Legal Entity. Company Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>identifies a company as registered with the company registration scheme</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party Legal Entity</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Company Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Business Registration Number, Company Number</ccts:AlternativeBusinessTerms>
	 *               <ccts:Examples>"3556625"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Company ID</em>' containment reference.
	 * @see #setCompanyID(CompanyIDType)
	 */
	CompanyIDType getCompanyID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PartyLegalEntityType#getCompanyID <em>Company ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Company ID</em>' containment reference.
	 * @see #getCompanyID()
	 */
	void setCompanyID(CompanyIDType value);

	/**
	 * Returns the value of the '<em><b>Registration Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Party Legal Entity. Registration_ Address. Address</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>associates with the registered address of the party within a Corporate Registration Scheme.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party Legal Entity</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PartyLegalEntityType#getRegistrationAddress <em>Registration Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registration Address</em>' containment reference.
	 * @see #getRegistrationAddress()
	 */
	void setRegistrationAddress(AddressType value);

	/**
	 * Returns the value of the '<em><b>Corporate Registration Scheme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Party Legal Entity. Corporate Registration Scheme</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>associates with the party with a Corporate Registration Scheme.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party Legal Entity</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Corporate Registration Scheme</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Corporate Registration Scheme</ccts:AssociatedObjectClass>
	 * 
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Corporate Registration Scheme</em>' containment reference.
	 * @see #setCorporateRegistrationScheme(CorporateRegistrationSchemeType)
	 */
	CorporateRegistrationSchemeType getCorporateRegistrationScheme();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PartyLegalEntityType#getCorporateRegistrationScheme <em>Corporate Registration Scheme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corporate Registration Scheme</em>' containment reference.
	 * @see #getCorporateRegistrationScheme()
	 */
	void setCorporateRegistrationScheme(CorporateRegistrationSchemeType value);

} // PartyLegalEntityType