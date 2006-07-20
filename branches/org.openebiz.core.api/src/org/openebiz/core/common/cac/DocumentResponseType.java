/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Response Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Document Response. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>information about responses to a document (at the application level)</ccts:Definition>
 *           <ccts:ObjectClass>Document Response</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.DocumentResponseType#getResponse <em>Response</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DocumentResponseType#getDocumentReference <em>Document Reference</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DocumentResponseType#getIssuerParty <em>Issuer Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DocumentResponseType#getRecipientParty <em>Recipient Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DocumentResponseType#getLineResponse <em>Line Response</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface DocumentResponseType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Document Response. Response</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The response to the document</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Document Response</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Response</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Response</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response</em>' containment reference.
	 * @see #setResponse(ResponseType)
	 */
	ResponseType getResponse();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DocumentResponseType#getResponse <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' containment reference.
	 * @see #getResponse()
	 */
	void setResponse(ResponseType value);

	/**
	 * Returns the value of the '<em><b>Document Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Document Response. Document Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>associates the Line with a Document</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Document Response</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Document Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Document Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Reference</em>' containment reference.
	 * @see #setDocumentReference(DocumentReferenceType)
	 */
	DocumentReferenceType getDocumentReference();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DocumentResponseType#getDocumentReference <em>Document Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Reference</em>' containment reference.
	 * @see #getDocumentReference()
	 */
	void setDocumentReference(DocumentReferenceType value);

	/**
	 * Returns the value of the '<em><b>Issuer Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Document Response. Issuer_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The party who issued a document</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Document Response</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Issuer</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issuer Party</em>' containment reference.
	 * @see #setIssuerParty(PartyType)
	 */
	PartyType getIssuerParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DocumentResponseType#getIssuerParty <em>Issuer Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuer Party</em>' containment reference.
	 * @see #getIssuerParty()
	 */
	void setIssuerParty(PartyType value);

	/**
	 * Returns the value of the '<em><b>Recipient Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Document Response. Recipient_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The party to whom the document is intended</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Document Response</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Recipient</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recipient Party</em>' containment reference.
	 * @see #setRecipientParty(PartyType)
	 */
	PartyType getRecipientParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DocumentResponseType#getRecipientParty <em>Recipient Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipient Party</em>' containment reference.
	 * @see #getRecipientParty()
	 */
	void setRecipientParty(PartyType value);

	/**
	 * Returns the value of the '<em><b>Line Response</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.LineResponseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Document Response. Line Response</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Response to various lines in the document</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Document Response</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Line Response</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Line Response</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Response</em>' containment reference list.
	 */
	List getLineResponse();

} // DocumentResponseType