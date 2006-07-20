/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

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
 * @generated
 */
public class DocumentResponseType implements Serializable {
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
	 * The cached value of the '{@link #getResponse() <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected ResponseType response = null;

	/**
	 * The cached value of the '{@link #getDocumentReference() <em>Document Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentReference()
	 * @generated
	 * @ordered
	 */
	protected DocumentReferenceType documentReference = null;

	/**
	 * The cached value of the '{@link #getIssuerParty() <em>Issuer Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuerParty()
	 * @generated
	 * @ordered
	 */
	protected PartyType issuerParty = null;

	/**
	 * The cached value of the '{@link #getRecipientParty() <em>Recipient Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipientParty()
	 * @generated
	 * @ordered
	 */
	protected PartyType recipientParty = null;

	/**
	 * The cached value of the '{@link #getLineResponse() <em>Line Response</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineResponse()
	 * @generated
	 * @ordered
	 */
	protected List lineResponse = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public DocumentResponseType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.response = this.getResponse();
		this.documentReference = this.getDocumentReference();
		this.issuerParty = this.getIssuerParty();
		this.recipientParty = this.getRecipientParty();
		this.lineResponse = this.getLineResponse();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getDocumentReference().getID().getValue());
		return sdisplay.toString();
	}
	
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
	 * @generated
	 */
	public ResponseType getResponse() {
		return (response == null) ? new ResponseType() : response;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DocumentResponseType#getResponse <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' containment reference.
	 * @see #getResponse()
	 * @generated
	 */
	public void setResponse(ResponseType newResponse) {
		response = newResponse;
	}

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
	 * @generated
	 */
	public DocumentReferenceType getDocumentReference() {
		return (documentReference == null) ? new DocumentReferenceType()
				: documentReference;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DocumentResponseType#getDocumentReference <em>Document Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Reference</em>' containment reference.
	 * @see #getDocumentReference()
	 * @generated
	 */
	public void setDocumentReference(DocumentReferenceType newDocumentReference) {
		documentReference = newDocumentReference;
	}

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
	 * @generated
	 */
	public PartyType getIssuerParty() {
		return (issuerParty == null) ? new PartyType() : issuerParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DocumentResponseType#getIssuerParty <em>Issuer Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuer Party</em>' containment reference.
	 * @see #getIssuerParty()
	 * @generated
	 */
	public void setIssuerParty(PartyType newIssuerParty) {
		issuerParty = newIssuerParty;
	}

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
	 * @generated
	 */
	public PartyType getRecipientParty() {
		return (recipientParty == null) ? new PartyType() : recipientParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DocumentResponseType#getRecipientParty <em>Recipient Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipient Party</em>' containment reference.
	 * @see #getRecipientParty()
	 * @generated
	 */
	public void setRecipientParty(PartyType newRecipientParty) {
		recipientParty = newRecipientParty;
	}

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
	 * @generated
	 */
	public List getLineResponse() {
		if (lineResponse == null) {
			lineResponse = new ArrayList<LineResponseType>();
		}
		return lineResponse;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.documentReference == null) ? 0 : this.documentReference.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.issuerParty == null) ? 0 : this.issuerParty.hashCode());
		result = PRIME * result + ((this.lineResponse == null) ? 0 : this.lineResponse.hashCode());
		result = PRIME * result + ((this.recipientParty == null) ? 0 : this.recipientParty.hashCode());
		result = PRIME * result + ((this.response == null) ? 0 : this.response.hashCode());
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
		final DocumentResponseType other = (DocumentResponseType) obj;
		if (this.documentReference == null) {
			if (other.documentReference != null)
				return false;
		} else if (!this.documentReference.equals(other.documentReference))
			return false;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.issuerParty == null) {
			if (other.issuerParty != null)
				return false;
		} else if (!this.issuerParty.equals(other.issuerParty))
			return false;
		if (this.lineResponse == null) {
			if (other.lineResponse != null)
				return false;
		} else if (!this.lineResponse.equals(other.lineResponse))
			return false;
		if (this.recipientParty == null) {
			if (other.recipientParty != null)
				return false;
		} else if (!this.recipientParty.equals(other.recipientParty))
			return false;
		if (this.response == null) {
			if (other.response != null)
				return false;
		} else if (!this.response.equals(other.response))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // DocumentResponseType