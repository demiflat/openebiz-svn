/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.CanonicalizationMethodType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.NoteType;
import org.openebiz.core.common.cbc.SignatureMethodType;
import org.openebiz.core.common.cbc.ValidationDateTimeType;
import org.openebiz.core.common.cbc.ValidatorIDType;
import java.io.Serializable;

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
 * @generated
 */
public class SignatureType implements Serializable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Open E-Biz - Darrell Kundel"; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * Basic Entity support code for surrogate id's
	 */
	protected Long internalId = null;

	protected Integer version = null;

	/**
	 * @return Returns the internalId.
	 */
	public Long getInternalId() {
		return this.internalId;
	}

	/**
	 * @param internalId The internalId to set.
	 */
	public void setInternalId(Long internalId) {
		this.internalId = internalId;
	}

	/**
	 * @return Returns the version.
	 */
	public Integer getVersion() {
		return this.version;
	}

	/**
	 * @param version The version to set.
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected IDType iD = null;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected NoteType note = null;

	/**
	 * The cached value of the '{@link #getValidationDateTime() <em>Validation Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationDateTime()
	 * @generated
	 * @ordered
	 */
	protected ValidationDateTimeType validationDateTime = null;

	/**
	 * The cached value of the '{@link #getValidatorID() <em>Validator ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidatorID()
	 * @generated
	 * @ordered
	 */
	protected ValidatorIDType validatorID = null;

	/**
	 * The cached value of the '{@link #getCanonicalizationMethod() <em>Canonicalization Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanonicalizationMethod()
	 * @generated
	 * @ordered
	 */
	protected CanonicalizationMethodType canonicalizationMethod = null;

	/**
	 * The cached value of the '{@link #getSignatureMethod() <em>Signature Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureMethod()
	 * @generated
	 * @ordered
	 */
	protected SignatureMethodType signatureMethod = null;

	/**
	 * The cached value of the '{@link #getSignatoryParty() <em>Signatory Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatoryParty()
	 * @generated
	 * @ordered
	 */
	protected PartyType signatoryParty = null;

	/**
	 * The cached value of the '{@link #getDigitalSignatureAttachment() <em>Digital Signature Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigitalSignatureAttachment()
	 * @generated
	 * @ordered
	 */
	protected AttachmentType digitalSignatureAttachment = null;

	/**
	 * The cached value of the '{@link #getOriginalDocumentReference() <em>Original Document Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalDocumentReference()
	 * @generated
	 * @ordered
	 */
	protected DocumentReferenceType originalDocumentReference = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public SignatureType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.iD = this.getID();
		this.note = this.getNote();
		this.validationDateTime = this.getValidationDateTime();
		this.validatorID = this.getValidatorID();
		this.canonicalizationMethod = this.getCanonicalizationMethod();
		this.signatureMethod = this.getSignatureMethod();
		this.signatoryParty = this.getSignatoryParty();
		this.digitalSignatureAttachment = this.getDigitalSignatureAttachment();
		this.originalDocumentReference = this.getOriginalDocumentReference();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getID().getValue());
		return sdisplay.toString();
	}

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
	 * @generated
	 */
	public IDType getID() {
		return (iD == null) ? new IDType() : iD;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SignatureType#getID <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' containment reference.
	 * @see #getID()
	 * @generated
	 */
	public void setID(IDType newID) {
		iD = newID;
	}

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
	 * @generated
	 */
	public NoteType getNote() {
		return (note == null) ? new NoteType() : note;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SignatureType#getNote <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' containment reference.
	 * @see #getNote()
	 * @generated
	 */
	public void setNote(NoteType newNote) {
		note = newNote;
	}

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
	 * @generated
	 */
	public ValidationDateTimeType getValidationDateTime() {
		return (validationDateTime == null) ? new ValidationDateTimeType()
				: validationDateTime;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SignatureType#getValidationDateTime <em>Validation Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Date Time</em>' containment reference.
	 * @see #getValidationDateTime()
	 * @generated
	 */
	public void setValidationDateTime(
			ValidationDateTimeType newValidationDateTime) {
		validationDateTime = newValidationDateTime;
	}

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
	 * @generated
	 */
	public ValidatorIDType getValidatorID() {
		return (validatorID == null) ? new ValidatorIDType() : validatorID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SignatureType#getValidatorID <em>Validator ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validator ID</em>' containment reference.
	 * @see #getValidatorID()
	 * @generated
	 */
	public void setValidatorID(ValidatorIDType newValidatorID) {
		validatorID = newValidatorID;
	}

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
	 * @generated
	 */
	public CanonicalizationMethodType getCanonicalizationMethod() {
		return (canonicalizationMethod == null) ? new CanonicalizationMethodType()
				: canonicalizationMethod;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SignatureType#getCanonicalizationMethod <em>Canonicalization Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Canonicalization Method</em>' containment reference.
	 * @see #getCanonicalizationMethod()
	 * @generated
	 */
	public void setCanonicalizationMethod(
			CanonicalizationMethodType newCanonicalizationMethod) {
		canonicalizationMethod = newCanonicalizationMethod;
	}

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
	 * @generated
	 */
	public SignatureMethodType getSignatureMethod() {
		return (signatureMethod == null) ? new SignatureMethodType()
				: signatureMethod;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SignatureType#getSignatureMethod <em>Signature Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature Method</em>' containment reference.
	 * @see #getSignatureMethod()
	 * @generated
	 */
	public void setSignatureMethod(SignatureMethodType newSignatureMethod) {
		signatureMethod = newSignatureMethod;
	}

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
	 * @generated
	 */
	public PartyType getSignatoryParty() {
		return (signatoryParty == null) ? new PartyType() : signatoryParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SignatureType#getSignatoryParty <em>Signatory Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signatory Party</em>' containment reference.
	 * @see #getSignatoryParty()
	 * @generated
	 */
	public void setSignatoryParty(PartyType newSignatoryParty) {
		signatoryParty = newSignatoryParty;
	}

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
	 * @generated
	 */
	public AttachmentType getDigitalSignatureAttachment() {
		return (digitalSignatureAttachment == null) ? new AttachmentType()
				: digitalSignatureAttachment;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SignatureType#getDigitalSignatureAttachment <em>Digital Signature Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Digital Signature Attachment</em>' containment reference.
	 * @see #getDigitalSignatureAttachment()
	 * @generated
	 */
	public void setDigitalSignatureAttachment(
			AttachmentType newDigitalSignatureAttachment) {
		digitalSignatureAttachment = newDigitalSignatureAttachment;
	}

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
	 * @generated
	 */
	public DocumentReferenceType getOriginalDocumentReference() {
		return (originalDocumentReference == null) ? new DocumentReferenceType()
				: originalDocumentReference;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.SignatureType#getOriginalDocumentReference <em>Original Document Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Document Reference</em>' containment reference.
	 * @see #getOriginalDocumentReference()
	 * @generated
	 */
	public void setOriginalDocumentReference(
			DocumentReferenceType newOriginalDocumentReference) {
		originalDocumentReference = newOriginalDocumentReference;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.canonicalizationMethod == null) ? 0 : this.canonicalizationMethod.hashCode());
		result = PRIME * result + ((this.digitalSignatureAttachment == null) ? 0 : this.digitalSignatureAttachment.hashCode());
		result = PRIME * result + ((this.iD == null) ? 0 : this.iD.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.note == null) ? 0 : this.note.hashCode());
		result = PRIME * result + ((this.originalDocumentReference == null) ? 0 : this.originalDocumentReference.hashCode());
		result = PRIME * result + ((this.signatoryParty == null) ? 0 : this.signatoryParty.hashCode());
		result = PRIME * result + ((this.signatureMethod == null) ? 0 : this.signatureMethod.hashCode());
		result = PRIME * result + ((this.validationDateTime == null) ? 0 : this.validationDateTime.hashCode());
		result = PRIME * result + ((this.validatorID == null) ? 0 : this.validatorID.hashCode());
		result = PRIME * result + ((this.version == null) ? 0 : this.version.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final SignatureType other = (SignatureType) obj;
		if (this.canonicalizationMethod == null) {
			if (other.canonicalizationMethod != null)
				return false;
		} else if (!this.canonicalizationMethod.equals(other.canonicalizationMethod))
			return false;
		if (this.digitalSignatureAttachment == null) {
			if (other.digitalSignatureAttachment != null)
				return false;
		} else if (!this.digitalSignatureAttachment.equals(other.digitalSignatureAttachment))
			return false;
		if (this.iD == null) {
			if (other.iD != null)
				return false;
		} else if (!this.iD.equals(other.iD))
			return false;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.note == null) {
			if (other.note != null)
				return false;
		} else if (!this.note.equals(other.note))
			return false;
		if (this.originalDocumentReference == null) {
			if (other.originalDocumentReference != null)
				return false;
		} else if (!this.originalDocumentReference.equals(other.originalDocumentReference))
			return false;
		if (this.signatoryParty == null) {
			if (other.signatoryParty != null)
				return false;
		} else if (!this.signatoryParty.equals(other.signatoryParty))
			return false;
		if (this.signatureMethod == null) {
			if (other.signatureMethod != null)
				return false;
		} else if (!this.signatureMethod.equals(other.signatureMethod))
			return false;
		if (this.validationDateTime == null) {
			if (other.validationDateTime != null)
				return false;
		} else if (!this.validationDateTime.equals(other.validationDateTime))
			return false;
		if (this.validatorID == null) {
			if (other.validatorID != null)
				return false;
		} else if (!this.validatorID.equals(other.validatorID))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // SignatureType