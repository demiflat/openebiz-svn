/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.EmbeddedDocumentBinaryObjectType;
import org.openebiz.core.common.cbc.MIMEReferenceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Attachment. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about an attached document. An attachment can be referred to externally (with the URI element), internally (with the MIME reference element) or contained within the document itself (with the EmbeddedDocument element).</ccts:Definition>
 *           <ccts:ObjectClass>Attachment</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.AttachmentType#getMIMEReference <em>MIME Reference</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AttachmentType#getEmbeddedDocumentBinaryObject <em>Embedded Document Binary Object</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.AttachmentType#getExternalReference <em>External Reference</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface AttachmentType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>MIME Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Attachment. MIME Reference . Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Refers to a document in the same MIME package as the actual document</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Attachment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>MIME Reference </ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MIME Reference</em>' containment reference.
	 * @see #setMIMEReference(MIMEReferenceType)
	 */
	MIMEReferenceType getMIMEReference();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AttachmentType#getMIMEReference <em>MIME Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MIME Reference</em>' containment reference.
	 * @see #getMIMEReference()
	 */
	void setMIMEReference(MIMEReferenceType value);

	/**
	 * Returns the value of the '<em><b>Embedded Document Binary Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Attachment. Embedded Document . Binary Object</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Contains an embedded document as a BLOB,</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Attachment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Embedded Document </ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Binary Object</ccts:RepresentationTerm>
	 *               <ccts:DataType>Binary Object. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Embedded Document Binary Object</em>' containment reference.
	 * @see #setEmbeddedDocumentBinaryObject(EmbeddedDocumentBinaryObjectType)
	 */
	EmbeddedDocumentBinaryObjectType getEmbeddedDocumentBinaryObject();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AttachmentType#getEmbeddedDocumentBinaryObject <em>Embedded Document Binary Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Embedded Document Binary Object</em>' containment reference.
	 * @see #getEmbeddedDocumentBinaryObject()
	 */
	void setEmbeddedDocumentBinaryObject(EmbeddedDocumentBinaryObjectType value);

	/**
	 * Returns the value of the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Attachment. External Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An attached document, external refered to, refered in the MIME location or embedded.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Attachment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>External Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>External Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External Reference</em>' containment reference.
	 * @see #setExternalReference(ExternalReferenceType)
	 */
	ExternalReferenceType getExternalReference();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AttachmentType#getExternalReference <em>External Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Reference</em>' containment reference.
	 * @see #getExternalReference()
	 */
	void setExternalReference(ExternalReferenceType value);

} // AttachmentType