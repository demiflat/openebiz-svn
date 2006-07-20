/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import java.util.List;

import org.openebiz.core.common.cbc.LogoReferenceIDType;
import org.openebiz.core.common.cbc.MarkAttentionIndicatorType;
import org.openebiz.core.common.cbc.MarkCareIndicatorType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Party. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about an organisation, sub-organisation or individual fulfilling a role in a business process</ccts:Definition>
 *           <ccts:ObjectClass>Party</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.PartyType#getMarkCareIndicator <em>Mark Care Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PartyType#getMarkAttentionIndicator <em>Mark Attention Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PartyType#getLogoReferenceID <em>Logo Reference ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PartyType#getPartyIdentification <em>Party Identification</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PartyType#getPartyName <em>Party Name</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PartyType#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PartyType#getAddress <em>Address</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PartyType#getPartyTaxScheme <em>Party Tax Scheme</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PartyType#getPartyLegalEntity <em>Party Legal Entity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PartyType#getContact <em>Contact</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PartyType#getPerson <em>Person</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PartyType#getAgentParty <em>Agent Party</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface PartyType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Mark Care Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Party. Mark Care Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Indicates whether a party is C/O (care of)</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Mark Care Indicator</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mark Care Indicator</em>' containment reference.
	 * @see #setMarkCareIndicator(MarkCareIndicatorType)
	 */
	MarkCareIndicatorType getMarkCareIndicator();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PartyType#getMarkCareIndicator <em>Mark Care Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mark Care Indicator</em>' containment reference.
	 * @see #getMarkCareIndicator()
	 */
	void setMarkCareIndicator(MarkCareIndicatorType value);

	/**
	 * Returns the value of the '<em><b>Mark Attention Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Party. Mark Attention Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Indicates whether a party is 'FAO' (for the attention of)</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Mark Attention Indicator</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mark Attention Indicator</em>' containment reference.
	 * @see #setMarkAttentionIndicator(MarkAttentionIndicatorType)
	 */
	MarkAttentionIndicatorType getMarkAttentionIndicator();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PartyType#getMarkAttentionIndicator <em>Mark Attention Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mark Attention Indicator</em>' containment reference.
	 * @see #getMarkAttentionIndicator()
	 */
	void setMarkAttentionIndicator(MarkAttentionIndicatorType value);

	/**
	 * Returns the value of the '<em><b>Logo Reference ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Party. Logo Reference. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A Party's logo</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Logo Reference</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:Examples>http://www2.coca-cola.com/images/logo.gif</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Logo Reference ID</em>' containment reference.
	 * @see #setLogoReferenceID(LogoReferenceIDType)
	 */
	LogoReferenceIDType getLogoReferenceID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PartyType#getLogoReferenceID <em>Logo Reference ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logo Reference ID</em>' containment reference.
	 * @see #getLogoReferenceID()
	 */
	void setLogoReferenceID(LogoReferenceIDType value);

	/**
	 * Returns the value of the '<em><b>Party Identification</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.PartyIdentificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Party. Party Identification</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Party Identification</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Party Identification</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party Identification</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Party Identification</em>' containment reference list.
	 */
	List getPartyIdentification();

	/**
	 * Returns the value of the '<em><b>Party Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.PartyNameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Party. Party Name</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Party Name</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Party Name</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party Name</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Party Name</em>' containment reference list.
	 */
	List getPartyName();

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Party. Language</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Language</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Language</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Language</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' containment reference.
	 * @see #setLanguage(LanguageType)
	 */
	LanguageType getLanguage();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PartyType#getLanguage <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' containment reference.
	 * @see #getLanguage()
	 */
	void setLanguage(LanguageType value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Party. Address</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Address</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Address</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Address</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(AddressType)
	 */
	AddressType getAddress();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PartyType#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 */
	void setAddress(AddressType value);

	/**
	 * Returns the value of the '<em><b>Party Tax Scheme</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.PartyTaxSchemeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Party. Party Tax Scheme</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Party Tax Scheme</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Party Tax Scheme</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party Tax Scheme</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Party Tax Scheme</em>' containment reference list.
	 */
	List getPartyTaxScheme();

	/**
	 * Returns the value of the '<em><b>Party Legal Entity</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.PartyLegalEntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Party. Party Legal Entity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Party Legal Entity</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Party Legal Entity</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party Legal Entity</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Party Legal Entity</em>' containment reference list.
	 */
	List getPartyLegalEntity();

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Party. Contact</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Contact</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Contact</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Contact</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference.
	 * @see #setContact(ContactType)
	 */
	ContactType getContact();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PartyType#getContact <em>Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact</em>' containment reference.
	 * @see #getContact()
	 */
	void setContact(ContactType value);

	/**
	 * Returns the value of the '<em><b>Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Party. Person</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to a Person.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Person</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Person</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person</em>' containment reference.
	 * @see #setPerson(PersonType)
	 */
	PersonType getPerson();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PartyType#getPerson <em>Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' containment reference.
	 * @see #getPerson()
	 */
	void setPerson(PersonType value);

	/**
	 * Returns the value of the '<em><b>Agent Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Party. Agent_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to another Party who acts as an agent for this Party.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Agent</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *               <ccts:Examples>Customs Broker</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Agent Party</em>' containment reference.
	 * @see #setAgentParty(PartyType)
	 */
	PartyType getAgentParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PartyType#getAgentParty <em>Agent Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent Party</em>' containment reference.
	 * @see #getAgentParty()
	 */
	void setAgentParty(PartyType value);

} // PartyType