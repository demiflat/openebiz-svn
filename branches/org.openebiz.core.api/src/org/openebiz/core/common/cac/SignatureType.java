/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.CanonicalizationMethodType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.NoteType;
import org.openebiz.core.common.cbc.SignatureMethodType;
import org.openebiz.core.common.cbc.ValidationDateTimeType;
import org.openebiz.core.common.cbc.ValidatorIDType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signature Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Signature. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>information about signature used to sign a document.</ccts:Definition>
 *           <ccts:ObjectClass>Signature</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.SignatureType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.SignatureType#getNote <em>Note</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.SignatureType#getValidationDateTime <em>Validation Date Time</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.SignatureType#getValidatorID <em>Validator ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.SignatureType#getCanonicalizationMethod <em>Canonicalization Method</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.SignatureType#getSignatureMethod <em>Signature Method</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.SignatureType#getSignatoryParty <em>Signatory Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.SignatureType#getDigitalSignatureAttachment <em>Digital Signature Attachment</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.SignatureType#getOriginalDocumentReference <em>Original Document Reference</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface SignatureType {
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
	 *               <ccts:DictionaryEntryName>Signature. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>a reference to identfy the section (or line) of the document to which the response applies</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Signature</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SignatureType#getID <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' containment reference.
	 * @see #getID()
	 */
	void setID(IDType value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Signature. Note. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the description of the response to the transaction document.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Signature</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Note</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference.
	 * @see #setNote(NoteType)
	 */
	NoteType getNote();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SignatureType#getNote <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' containment reference.
	 * @see #getNote()
	 */
	void setNote(NoteType value);

	/**
	 * Returns the value of the '<em><b>Validation Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Signature. Validation Date Time. Date Time</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Specifies the date and time when the signature was approved</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Signature</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Validation Date Time</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date Time</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date Time. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validation Date Time</em>' containment reference.
	 * @see #setValidationDateTime(ValidationDateTimeType)
	 */
	ValidationDateTimeType getValidationDateTime();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SignatureType#getValidationDateTime <em>Validation Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Date Time</em>' containment reference.
	 * @see #getValidationDateTime()
	 */
	void setValidationDateTime(ValidationDateTimeType value);

	/**
	 * Returns the value of the '<em><b>Validator ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Signature. Validator Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Identifies the organisation, person or server that has validated the signature</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Signature</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Validator Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validator ID</em>' containment reference.
	 * @see #setValidatorID(ValidatorIDType)
	 */
	ValidatorIDType getValidatorID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SignatureType#getValidatorID <em>Validator ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validator ID</em>' containment reference.
	 * @see #getValidatorID()
	 */
	void setValidatorID(ValidatorIDType value);

	/**
	 * Returns the value of the '<em><b>Canonicalization Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Signature. Canonicalization Method. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the description of the response to the transaction document.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Signature</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Canonicalization Method</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Canonicalization Method</em>' containment reference.
	 * @see #setCanonicalizationMethod(CanonicalizationMethodType)
	 */
	CanonicalizationMethodType getCanonicalizationMethod();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SignatureType#getCanonicalizationMethod <em>Canonicalization Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Canonicalization Method</em>' containment reference.
	 * @see #getCanonicalizationMethod()
	 */
	void setCanonicalizationMethod(CanonicalizationMethodType value);

	/**
	 * Returns the value of the '<em><b>Signature Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Signature. Signature Method. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the description of the response to the transaction document.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Signature</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Signature Method</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature Method</em>' containment reference.
	 * @see #setSignatureMethod(SignatureMethodType)
	 */
	SignatureMethodType getSignatureMethod();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SignatureType#getSignatureMethod <em>Signature Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature Method</em>' containment reference.
	 * @see #getSignatureMethod()
	 */
	void setSignatureMethod(SignatureMethodType value);

	/**
	 * Returns the value of the '<em><b>Signatory Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Signature. Signatory_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Identifies the party that signed the document</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Signature</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Signatory</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signatory Party</em>' containment reference.
	 * @see #setSignatoryParty(PartyType)
	 */
	PartyType getSignatoryParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SignatureType#getSignatoryParty <em>Signatory Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signatory Party</em>' containment reference.
	 * @see #getSignatoryParty()
	 */
	void setSignatoryParty(PartyType value);

	/**
	 * Returns the value of the '<em><b>Digital Signature Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Signature. Digital Signature_ Attachment. Attachment</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Refers to the actual encoded signature (e.g. in XMLDSIG format)</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Signature</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Digital Signature</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Attachment</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Attachment</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Digital Signature Attachment</em>' containment reference.
	 * @see #setDigitalSignatureAttachment(AttachmentType)
	 */
	AttachmentType getDigitalSignatureAttachment();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SignatureType#getDigitalSignatureAttachment <em>Digital Signature Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Digital Signature Attachment</em>' containment reference.
	 * @see #getDigitalSignatureAttachment()
	 */
	void setDigitalSignatureAttachment(AttachmentType value);

	/**
	 * Returns the value of the '<em><b>Original Document Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Signature. Original_ Document Reference. Document Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A reference to the actual document that the signature applies to. For evidenciary purposes this may be the document image that the signatory party saw when applying their signature.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Signature</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Original</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Document Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Document Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Original Document Reference</em>' containment reference.
	 * @see #setOriginalDocumentReference(DocumentReferenceType)
	 */
	DocumentReferenceType getOriginalDocumentReference();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SignatureType#getOriginalDocumentReference <em>Original Document Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Document Reference</em>' containment reference.
	 * @see #getOriginalDocumentReference()
	 */
	void setOriginalDocumentReference(DocumentReferenceType value);

} // SignatureType