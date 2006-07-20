/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.RoleCodeType;
import org.openebiz.core.common.cbc.SequenceNumericType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endorser Party Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Endorser Party. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>The party endorsing a document</ccts:Definition>
 *           <ccts:ObjectClass>Endorser Party</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.EndorserPartyType#getRoleCode <em>Role Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.EndorserPartyType#getSequenceNumeric <em>Sequence Numeric</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.EndorserPartyType#getParty <em>Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.EndorserPartyType#getSignatoryContact <em>Signatory Contact</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface EndorserPartyType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Role Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Endorser Party. Role. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The role of the party providing the endorsement, eg. Issuer, Embassy, Insurance, etc.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Endorser Party</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Role</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role Code</em>' containment reference.
	 * @see #setRoleCode(RoleCodeType)
	 */
	RoleCodeType getRoleCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.EndorserPartyType#getRoleCode <em>Role Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Code</em>' containment reference.
	 * @see #getRoleCode()
	 */
	void setRoleCode(RoleCodeType value);

	/**
	 * Returns the value of the '<em><b>Sequence Numeric</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Endorser Party. Sequence. Numeric</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The sequence in which the endorsements are to be applied</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Endorser Party</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Sequence</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Numeric</ccts:RepresentationTerm>
	 *               <ccts:DataType>Numeric. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence Numeric</em>' containment reference.
	 * @see #setSequenceNumeric(SequenceNumericType)
	 */
	SequenceNumericType getSequenceNumeric();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.EndorserPartyType#getSequenceNumeric <em>Sequence Numeric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Numeric</em>' containment reference.
	 * @see #getSequenceNumeric()
	 */
	void setSequenceNumeric(SequenceNumericType value);

	/**
	 * Returns the value of the '<em><b>Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Endorser Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Details of the party endorsing the application</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Endorser Party</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Party</em>' containment reference.
	 * @see #setParty(PartyType)
	 */
	PartyType getParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.EndorserPartyType#getParty <em>Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' containment reference.
	 * @see #getParty()
	 */
	void setParty(PartyType value);

	/**
	 * Returns the value of the '<em><b>Signatory Contact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Endorser Party. Signatory_ Contact. Contact</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Details of the individual represents the exporter who signs the Certificate of Origin application before submitting to the Issuer Party.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Endorser Party</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Signatory</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Contact</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Contact</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signatory Contact</em>' containment reference.
	 * @see #setSignatoryContact(ContactType)
	 */
	ContactType getSignatoryContact();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.EndorserPartyType#getSignatoryContact <em>Signatory Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signatory Contact</em>' containment reference.
	 * @see #getSignatoryContact()
	 */
	void setSignatoryContact(ContactType value);

} // EndorserPartyType