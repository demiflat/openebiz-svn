/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.EmbeddedDocumentBinaryObjectType;
import org.openebiz.core.common.cbc.MIMEReferenceType;
import java.io.Serializable;

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
 * @generated
 */
public class AttachmentType implements Serializable {
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
	 * The cached value of the '{@link #getMIMEReference() <em>MIME Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMIMEReference()
	 * @generated
	 * @ordered
	 */
	protected MIMEReferenceType mIMEReference = null;

	/**
	 * The cached value of the '{@link #getEmbeddedDocumentBinaryObject() <em>Embedded Document Binary Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbeddedDocumentBinaryObject()
	 * @generated
	 * @ordered
	 */
	protected EmbeddedDocumentBinaryObjectType embeddedDocumentBinaryObject = null;

	/**
	 * The cached value of the '{@link #getExternalReference() <em>External Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalReference()
	 * @generated
	 * @ordered
	 */
	protected ExternalReferenceType externalReference = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public AttachmentType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.mIMEReference = this.getMIMEReference();
		this.embeddedDocumentBinaryObject = this.getEmbeddedDocumentBinaryObject();
		this.externalReference = this.getExternalReference();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getEmbeddedDocumentBinaryObject().getFilename());
		return sdisplay.toString();
	}
	
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
	 * @generated
	 */
	public MIMEReferenceType getMIMEReference() {
		return (mIMEReference == null) ? new MIMEReferenceType()
				: mIMEReference;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AttachmentType#getMIMEReference <em>MIME Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MIME Reference</em>' containment reference.
	 * @see #getMIMEReference()
	 * @generated
	 */
	public void setMIMEReference(MIMEReferenceType newMIMEReference) {
		mIMEReference = newMIMEReference;
	}

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
	 * @generated
	 */
	public EmbeddedDocumentBinaryObjectType getEmbeddedDocumentBinaryObject() {
		return (embeddedDocumentBinaryObject == null) ? new EmbeddedDocumentBinaryObjectType()
				: embeddedDocumentBinaryObject;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AttachmentType#getEmbeddedDocumentBinaryObject <em>Embedded Document Binary Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Embedded Document Binary Object</em>' containment reference.
	 * @see #getEmbeddedDocumentBinaryObject()
	 * @generated
	 */
	public void setEmbeddedDocumentBinaryObject(
			EmbeddedDocumentBinaryObjectType newEmbeddedDocumentBinaryObject) {
		embeddedDocumentBinaryObject = newEmbeddedDocumentBinaryObject;
	}

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
	 * @generated
	 */
	public ExternalReferenceType getExternalReference() {
		return (externalReference == null) ? new ExternalReferenceType()
				: externalReference;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.AttachmentType#getExternalReference <em>External Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Reference</em>' containment reference.
	 * @see #getExternalReference()
	 * @generated
	 */
	public void setExternalReference(ExternalReferenceType newExternalReference) {
		externalReference = newExternalReference;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.embeddedDocumentBinaryObject == null) ? 0 : this.embeddedDocumentBinaryObject.hashCode());
		result = PRIME * result + ((this.externalReference == null) ? 0 : this.externalReference.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.mIMEReference == null) ? 0 : this.mIMEReference.hashCode());
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
		final AttachmentType other = (AttachmentType) obj;
		if (this.embeddedDocumentBinaryObject == null) {
			if (other.embeddedDocumentBinaryObject != null)
				return false;
		} else if (!this.embeddedDocumentBinaryObject.equals(other.embeddedDocumentBinaryObject))
			return false;
		if (this.externalReference == null) {
			if (other.externalReference != null)
				return false;
		} else if (!this.externalReference.equals(other.externalReference))
			return false;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.mIMEReference == null) {
			if (other.mIMEReference != null)
				return false;
		} else if (!this.mIMEReference.equals(other.mIMEReference))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // AttachmentType