/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.DocumentHashType;
import org.openebiz.core.common.cbc.ExpiryDateTimeType;
import org.openebiz.core.common.cbc.URIType;
import java.io.Serializable;

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
 * @generated
 */
public class ExternalReferenceType implements Serializable {
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
	 * The cached value of the '{@link #getURI() <em>URI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURI()
	 * @generated
	 * @ordered
	 */
	protected URIType uRI = null;

	/**
	 * The cached value of the '{@link #getDocumentHash() <em>Document Hash</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentHash()
	 * @generated
	 * @ordered
	 */
	protected DocumentHashType documentHash = null;

	/**
	 * The cached value of the '{@link #getExpiryDateTime() <em>Expiry Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiryDateTime()
	 * @generated
	 * @ordered
	 */
	protected ExpiryDateTimeType expiryDateTime = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ExternalReferenceType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.uRI = this.getURI();
		this.documentHash = this.getDocumentHash();
		this.expiryDateTime = this.getExpiryDateTime();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getURI().getValue());
		return sdisplay.toString();
	}
	
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
	 * @generated
	 */
	public URIType getURI() {
		return (uRI == null) ? new URIType() : uRI;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ExternalReferenceType#getURI <em>URI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URI</em>' containment reference.
	 * @see #getURI()
	 * @generated
	 */
	public void setURI(URIType newURI) {
		uRI = newURI;
	}

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
	 * @generated
	 */
	public DocumentHashType getDocumentHash() {
		return (documentHash == null) ? new DocumentHashType() : documentHash;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ExternalReferenceType#getDocumentHash <em>Document Hash</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Hash</em>' containment reference.
	 * @see #getDocumentHash()
	 * @generated
	 */
	public void setDocumentHash(DocumentHashType newDocumentHash) {
		documentHash = newDocumentHash;
	}

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
	 * @generated
	 */
	public ExpiryDateTimeType getExpiryDateTime() {
		return (expiryDateTime == null) ? new ExpiryDateTimeType()
				: expiryDateTime;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ExternalReferenceType#getExpiryDateTime <em>Expiry Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiry Date Time</em>' containment reference.
	 * @see #getExpiryDateTime()
	 * @generated
	 */
	public void setExpiryDateTime(ExpiryDateTimeType newExpiryDateTime) {
		expiryDateTime = newExpiryDateTime;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.documentHash == null) ? 0 : this.documentHash.hashCode());
		result = PRIME * result + ((this.expiryDateTime == null) ? 0 : this.expiryDateTime.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.uRI == null) ? 0 : this.uRI.hashCode());
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
		final ExternalReferenceType other = (ExternalReferenceType) obj;
		if (this.documentHash == null) {
			if (other.documentHash != null)
				return false;
		} else if (!this.documentHash.equals(other.documentHash))
			return false;
		if (this.expiryDateTime == null) {
			if (other.expiryDateTime != null)
				return false;
		} else if (!this.expiryDateTime.equals(other.expiryDateTime))
			return false;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.uRI == null) {
			if (other.uRI != null)
				return false;
		} else if (!this.uRI.equals(other.uRI))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // ExternalReferenceType