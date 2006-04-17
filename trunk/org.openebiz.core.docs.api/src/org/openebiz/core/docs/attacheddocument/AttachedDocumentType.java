/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.docs.attacheddocument;

import java.util.List;

import org.openebiz.core.common.cac.AttachmentType;
import org.openebiz.core.common.cac.PartyType;

import org.openebiz.core.common.cbc.DocumentQualifierCodeType;
import org.openebiz.core.common.cbc.DocumentQualifierType;
import org.openebiz.core.common.cbc.GUIDType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.IssueDateType;
import org.openebiz.core.common.cbc.IssueTimeType;
import org.openebiz.core.common.cbc.ParentDocumentIDType;
import org.openebiz.core.common.cbc.ParentDocumentQualifierCodeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attached Document Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Attached Document. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>a document to indicate the application’s response to a transaction.</ccts:Definition>
 *           <ccts:ObjectClass>Attached Document</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.docs.attacheddocument.AttachedDocumentType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.docs.attacheddocument.AttachedDocumentType#getGUID <em>GUID</em>}</li>
 *   <li>{@link org.openebiz.core.docs.attacheddocument.AttachedDocumentType#getIssueDate <em>Issue Date</em>}</li>
 *   <li>{@link org.openebiz.core.docs.attacheddocument.AttachedDocumentType#getIssueTime <em>Issue Time</em>}</li>
 *   <li>{@link org.openebiz.core.docs.attacheddocument.AttachedDocumentType#getNote <em>Note</em>}</li>
 *   <li>{@link org.openebiz.core.docs.attacheddocument.AttachedDocumentType#getDocumentQualifierCode <em>Document Qualifier Code</em>}</li>
 *   <li>{@link org.openebiz.core.docs.attacheddocument.AttachedDocumentType#getDocumentQualifier <em>Document Qualifier</em>}</li>
 *   <li>{@link org.openebiz.core.docs.attacheddocument.AttachedDocumentType#getParentDocumentID <em>Parent Document ID</em>}</li>
 *   <li>{@link org.openebiz.core.docs.attacheddocument.AttachedDocumentType#getParentDocumentQualifierCode <em>Parent Document Qualifier Code</em>}</li>
 *   <li>{@link org.openebiz.core.docs.attacheddocument.AttachedDocumentType#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.openebiz.core.docs.attacheddocument.AttachedDocumentType#getSenderParty <em>Sender Party</em>}</li>
 *   <li>{@link org.openebiz.core.docs.attacheddocument.AttachedDocumentType#getReceiverParty <em>Receiver Party</em>}</li>
 *   <li>{@link org.openebiz.core.docs.attacheddocument.AttachedDocumentType#getAttachment <em>Attachment</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface AttachedDocumentType {
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
	 *               <ccts:DictionaryEntryName>Attached Document. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An identifier for the Attached Document. Used as a reference for a business document (the parent)</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Attached Document</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID</em>' containment reference.
	 * @see #setID(IDType)
	 */
	IDType getID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.attacheddocument.AttachedDocumentType#getID <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' containment reference.
	 * @see #getID()
	 */
	void setID(IDType value);

	/**
	 * Returns the value of the '<em><b>GUID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Attached Document. Globally Unique Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A computer-generated universally unique identifier (GUID) for the document instance.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Attached Document</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Globally Unique Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GUID</em>' containment reference.
	 * @see #setGUID(GUIDType)
	 */
	GUIDType getGUID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.attacheddocument.AttachedDocumentType#getGUID <em>GUID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GUID</em>' containment reference.
	 * @see #getGUID()
	 */
	void setGUID(GUIDType value);

	/**
	 * Returns the value of the '<em><b>Issue Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Attached Document. Issue Date. Date</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>a date denoting when the Attached Document was issued.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Attached Document</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Issue Date</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue Date</em>' containment reference.
	 * @see #setIssueDate(IssueDateType)
	 */
	IssueDateType getIssueDate();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.attacheddocument.AttachedDocumentType#getIssueDate <em>Issue Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Date</em>' containment reference.
	 * @see #getIssueDate()
	 */
	void setIssueDate(IssueDateType value);

	/**
	 * Returns the value of the '<em><b>Issue Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Attached Document. Issue Time. Time</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>a time denoting when the Attached Document was issued.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Attached Document</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Issue Time</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Time</ccts:RepresentationTerm>
	 *               <ccts:DataType>Time. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue Time</em>' containment reference.
	 * @see #setIssueTime(IssueTimeType)
	 */
	IssueTimeType getIssueTime();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.attacheddocument.AttachedDocumentType#getIssueTime <em>Issue Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Time</em>' containment reference.
	 * @see #getIssueTime()
	 */
	void setIssueTime(IssueTimeType value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cbc.NoteType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Attached Document. Note. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>contains any free form text pertinent to the entire document or to the document message itself. This element may contain notes or any other similar information that is not contained explicitly in another structure.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Attached Document</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Note</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 */
	List getNote();

	/**
	 * Returns the value of the '<em><b>Document Qualifier Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Attached Document. Document Qualifier Code. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Qualifies the type of document using a code set.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Attached Document</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Document Qualifier Code</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Qualifier Code</em>' containment reference.
	 * @see #setDocumentQualifierCode(DocumentQualifierCodeType)
	 */
	DocumentQualifierCodeType getDocumentQualifierCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.attacheddocument.AttachedDocumentType#getDocumentQualifierCode <em>Document Qualifier Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Qualifier Code</em>' containment reference.
	 * @see #getDocumentQualifierCode()
	 */
	void setDocumentQualifierCode(DocumentQualifierCodeType value);

	/**
	 * Returns the value of the '<em><b>Document Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Attached Document. Document Qualifier. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Qualifies types of document as text</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Attached Document</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Document Qualifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Qualifier</em>' containment reference.
	 * @see #setDocumentQualifier(DocumentQualifierType)
	 */
	DocumentQualifierType getDocumentQualifier();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.attacheddocument.AttachedDocumentType#getDocumentQualifier <em>Document Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Qualifier</em>' containment reference.
	 * @see #getDocumentQualifier()
	 */
	void setDocumentQualifier(DocumentQualifierType value);

	/**
	 * Returns the value of the '<em><b>Parent Document ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Attached Document. Parent_ Document Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Identifies the parent document.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Attached Document</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Parent</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Document Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Document ID</em>' containment reference.
	 * @see #setParentDocumentID(ParentDocumentIDType)
	 */
	ParentDocumentIDType getParentDocumentID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.attacheddocument.AttachedDocumentType#getParentDocumentID <em>Parent Document ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Document ID</em>' containment reference.
	 * @see #getParentDocumentID()
	 */
	void setParentDocumentID(ParentDocumentIDType value);

	/**
	 * Returns the value of the '<em><b>Parent Document Qualifier Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Attached Document. Parent_ Document Qualifier Code. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Identifies the type of parent document.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Attached Document</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Parent</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Document Qualifier Code</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Document Qualifier Code</em>' containment reference.
	 * @see #setParentDocumentQualifierCode(ParentDocumentQualifierCodeType)
	 */
	ParentDocumentQualifierCodeType getParentDocumentQualifierCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.attacheddocument.AttachedDocumentType#getParentDocumentQualifierCode <em>Parent Document Qualifier Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Document Qualifier Code</em>' containment reference.
	 * @see #getParentDocumentQualifierCode()
	 */
	void setParentDocumentQualifierCode(ParentDocumentQualifierCodeType value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.SignatureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Attached Document. Signature</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>associates the Attached Document with zero or more signatures.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Attached Document</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Signature</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Signature</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature</em>' containment reference list.
	 */
	List getSignature();

	/**
	 * Returns the value of the '<em><b>Sender Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Attached Document. Sender_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Party sending this document.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Attached Document</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Sender</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sender Party</em>' containment reference.
	 * @see #setSenderParty(PartyType)
	 */
	PartyType getSenderParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.attacheddocument.AttachedDocumentType#getSenderParty <em>Sender Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender Party</em>' containment reference.
	 * @see #getSenderParty()
	 */
	void setSenderParty(PartyType value);

	/**
	 * Returns the value of the '<em><b>Receiver Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Attached Document. Receiver_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Party receiving this document.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Attached Document</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Receiver</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiver Party</em>' containment reference.
	 * @see #setReceiverParty(PartyType)
	 */
	PartyType getReceiverParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.attacheddocument.AttachedDocumentType#getReceiverParty <em>Receiver Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver Party</em>' containment reference.
	 * @see #getReceiverParty()
	 */
	void setReceiverParty(PartyType value);

	/**
	 * Returns the value of the '<em><b>Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Attached Document. Attachment</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An attachement containing the document content</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Attached Document</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Attachment</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Attachment</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attachment</em>' containment reference.
	 * @see #setAttachment(AttachmentType)
	 */
	AttachmentType getAttachment();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.attacheddocument.AttachedDocumentType#getAttachment <em>Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment</em>' containment reference.
	 * @see #getAttachment()
	 */
	void setAttachment(AttachmentType value);

} // AttachedDocumentType