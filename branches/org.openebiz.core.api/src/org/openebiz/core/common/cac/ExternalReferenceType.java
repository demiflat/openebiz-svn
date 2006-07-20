/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.DocumentHashType;
import org.openebiz.core.common.cbc.ExpiryDateTimeType;
import org.openebiz.core.common.cbc.URIType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Reference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>External Reference. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>information directly relating to an external referece, meaning a doument stored in an other location</ccts:Definition>
 *           <ccts:ObjectClass>External Reference</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.ExternalReferenceType#getURI <em>URI</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ExternalReferenceType#getDocumentHash <em>Document Hash</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ExternalReferenceType#getExpiryDateTime <em>Expiry Date Time</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface ExternalReferenceType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>URI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>External Reference. Uniform Resource Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The Uniform Resource Identifier (URI) that identifies where the extenal document is located.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>External Reference</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Uniform Resource Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>URI</em>' containment reference.
	 * @see #setURI(URIType)
	 */
	URIType getURI();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ExternalReferenceType#getURI <em>URI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URI</em>' containment reference.
	 * @see #getURI()
	 */
	void setURI(URIType value);

	/**
	 * Returns the value of the '<em><b>Document Hash</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>External Reference. Document Hash. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Specifies the hash code for the external stored document</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>External Reference</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Document Hash</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Hash</em>' containment reference.
	 * @see #setDocumentHash(DocumentHashType)
	 */
	DocumentHashType getDocumentHash();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ExternalReferenceType#getDocumentHash <em>Document Hash</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Hash</em>' containment reference.
	 * @see #getDocumentHash()
	 */
	void setDocumentHash(DocumentHashType value);

	/**
	 * Returns the value of the '<em><b>Expiry Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>External Reference. Expiry Date Time. Date Time</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the date on which the document can no longe be found on the URI.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>External Reference</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Expiry Date Time</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date Time</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date Time. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expiry Date Time</em>' containment reference.
	 * @see #setExpiryDateTime(ExpiryDateTimeType)
	 */
	ExpiryDateTimeType getExpiryDateTime();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ExternalReferenceType#getExpiryDateTime <em>Expiry Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiry Date Time</em>' containment reference.
	 * @see #getExpiryDateTime()
	 */
	void setExpiryDateTime(ExpiryDateTimeType value);

} // ExternalReferenceType