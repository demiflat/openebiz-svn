/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.GloballyUniqueGUIDType;
import org.openebiz.core.common.cbc.LineIDType;
import org.openebiz.core.common.cbc.LineStatusCodeType;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Reference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Line Reference. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about a Line Reference</ccts:Definition>
 *           <ccts:ObjectClass>Line Reference</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.LineReferenceType#getLineID <em>Line ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LineReferenceType#getGloballyUniqueGUID <em>Globally Unique GUID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LineReferenceType#getLineStatusCode <em>Line Status Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LineReferenceType#getDocumentReference <em>Document Reference</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LineReferenceType#getAccountingDocumentReference <em>Accounting Document Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LineReferenceType implements Serializable {
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
	 * The cached value of the '{@link #getLineID() <em>Line ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineID()
	 * @generated
	 * @ordered
	 */
	protected LineIDType lineID = null;

	/**
	 * The cached value of the '{@link #getGloballyUniqueGUID() <em>Globally Unique GUID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGloballyUniqueGUID()
	 * @generated
	 * @ordered
	 */
	protected GloballyUniqueGUIDType globallyUniqueGUID = null;

	/**
	 * The cached value of the '{@link #getLineStatusCode() <em>Line Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStatusCode()
	 * @generated
	 * @ordered
	 */
	protected LineStatusCodeType lineStatusCode = null;

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
	 * The cached value of the '{@link #getAccountingDocumentReference() <em>Accounting Document Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountingDocumentReference()
	 * @generated
	 * @ordered
	 */
	protected AccountingDocumentReferenceType accountingDocumentReference = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public LineReferenceType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.lineID = this.getLineID();
		this.globallyUniqueGUID = this.getGloballyUniqueGUID();
		this.lineStatusCode = this.getLineStatusCode();
		this.documentReference = this.getDocumentReference();
		this.accountingDocumentReference = this.getAccountingDocumentReference();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getLineID().getValue());
		return sdisplay.toString();
	}
	
	/**
	 * Returns the value of the '<em><b>Line ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Line Reference. Line Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the Line assigned by the Document Issuer</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Line Reference</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Line Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line ID</em>' containment reference.
	 * @see #setLineID(LineIDType)
	 * @generated
	 */
	public LineIDType getLineID() {
		return (lineID == null) ? new LineIDType() : lineID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LineReferenceType#getLineID <em>Line ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line ID</em>' containment reference.
	 * @see #getLineID()
	 * @generated
	 */
	public void setLineID(LineIDType newLineID) {
		lineID = newLineID;
	}

	/**
	 * Returns the value of the '<em><b>Globally Unique GUID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Line Reference. Globally Unique_ Globally Unique Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A computer-generated globally unique identifier (GUID) for the Line Reference instance</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Line Reference</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Globally Unique</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Globally Unique Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Globally Unique GUID</em>' containment reference.
	 * @see #setGloballyUniqueGUID(GloballyUniqueGUIDType)
	 * @generated
	 */
	public GloballyUniqueGUIDType getGloballyUniqueGUID() {
		return (globallyUniqueGUID == null) ? new GloballyUniqueGUIDType()
				: globallyUniqueGUID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LineReferenceType#getGloballyUniqueGUID <em>Globally Unique GUID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Globally Unique GUID</em>' containment reference.
	 * @see #getGloballyUniqueGUID()
	 * @generated
	 */
	public void setGloballyUniqueGUID(
			GloballyUniqueGUIDType newGloballyUniqueGUID) {
		globallyUniqueGUID = newGloballyUniqueGUID;
	}

	/**
	 * Returns the value of the '<em><b>Line Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Line Reference. Line Status. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Identifies the status of the line with respect to its original state</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Line Reference</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Line Status</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Status Code</em>' containment reference.
	 * @see #setLineStatusCode(LineStatusCodeType)
	 * @generated
	 */
	public LineStatusCodeType getLineStatusCode() {
		return (lineStatusCode == null) ? new LineStatusCodeType()
				: lineStatusCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LineReferenceType#getLineStatusCode <em>Line Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Status Code</em>' containment reference.
	 * @see #getLineStatusCode()
	 * @generated
	 */
	public void setLineStatusCode(LineStatusCodeType newLineStatusCode) {
		lineStatusCode = newLineStatusCode;
	}

	/**
	 * Returns the value of the '<em><b>Document Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Line Reference. Document Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Document Reference</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Line Reference</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LineReferenceType#getDocumentReference <em>Document Reference</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Accounting Document Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Line Reference. Accounting Document Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>associates the Line with an Accounting Document</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Line Reference</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Accounting Document Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Accounting Document Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accounting Document Reference</em>' containment reference.
	 * @see #setAccountingDocumentReference(AccountingDocumentReferenceType)
	 * @generated
	 */
	public AccountingDocumentReferenceType getAccountingDocumentReference() {
		return (accountingDocumentReference == null) ? new AccountingDocumentReferenceType()
				: accountingDocumentReference;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LineReferenceType#getAccountingDocumentReference <em>Accounting Document Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accounting Document Reference</em>' containment reference.
	 * @see #getAccountingDocumentReference()
	 * @generated
	 */
	public void setAccountingDocumentReference(
			AccountingDocumentReferenceType newAccountingDocumentReference) {
		accountingDocumentReference = newAccountingDocumentReference;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.accountingDocumentReference == null) ? 0 : this.accountingDocumentReference.hashCode());
		result = PRIME * result + ((this.documentReference == null) ? 0 : this.documentReference.hashCode());
		result = PRIME * result + ((this.globallyUniqueGUID == null) ? 0 : this.globallyUniqueGUID.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.lineID == null) ? 0 : this.lineID.hashCode());
		result = PRIME * result + ((this.lineStatusCode == null) ? 0 : this.lineStatusCode.hashCode());
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
		final LineReferenceType other = (LineReferenceType) obj;
		if (this.accountingDocumentReference == null) {
			if (other.accountingDocumentReference != null)
				return false;
		} else if (!this.accountingDocumentReference.equals(other.accountingDocumentReference))
			return false;
		if (this.documentReference == null) {
			if (other.documentReference != null)
				return false;
		} else if (!this.documentReference.equals(other.documentReference))
			return false;
		if (this.globallyUniqueGUID == null) {
			if (other.globallyUniqueGUID != null)
				return false;
		} else if (!this.globallyUniqueGUID.equals(other.globallyUniqueGUID))
			return false;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.lineID == null) {
			if (other.lineID != null)
				return false;
		} else if (!this.lineID.equals(other.lineID))
			return false;
		if (this.lineStatusCode == null) {
			if (other.lineStatusCode != null)
				return false;
		} else if (!this.lineStatusCode.equals(other.lineStatusCode))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // LineReferenceType