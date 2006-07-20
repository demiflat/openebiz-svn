/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.ApprovalStatusType;
import org.openebiz.core.common.cbc.DocumentIDType;
import org.openebiz.core.common.cbc.RemarksType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endorsement Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Endorsement. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Details of an endorsement on the document.</ccts:Definition>
 *           <ccts:ObjectClass>Endorsement</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.EndorsementType#getDocumentID <em>Document ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.EndorsementType#getApprovalStatus <em>Approval Status</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.EndorsementType#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.EndorsementType#getEndorserParty <em>Endorser Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.EndorsementType#getSignature <em>Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EndorsementType implements Serializable {
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
	 * The cached value of the '{@link #getDocumentID() <em>Document ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentID()
	 * @generated
	 * @ordered
	 */
	protected DocumentIDType documentID = null;

	/**
	 * The cached value of the '{@link #getApprovalStatus() <em>Approval Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalStatus()
	 * @generated
	 * @ordered
	 */
	protected ApprovalStatusType approvalStatus = null;

	/**
	 * The cached value of the '{@link #getRemarks() <em>Remarks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected List remarks = null;

	/**
	 * The cached value of the '{@link #getEndorserParty() <em>Endorser Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndorserParty()
	 * @generated
	 * @ordered
	 */
	protected EndorserPartyType endorserParty = null;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected List signature = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EndorsementType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.documentID = this.getDocumentID();
		this.approvalStatus = this.getApprovalStatus();
		this.remarks = this.getRemarks();
		this.endorserParty = this.getEndorserParty();
		this.signature = this.getSignature();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getApprovalStatus().getValue());
		return sdisplay.toString();
	}
	
	/**
	 * Returns the value of the '<em><b>Document ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Endorsement. Document. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>This identifies the endorsement</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Endorsement</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Document</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document ID</em>' containment reference.
	 * @see #setDocumentID(DocumentIDType)
	 * @generated
	 */
	public DocumentIDType getDocumentID() {
		return (documentID == null) ? new DocumentIDType() : documentID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.EndorsementType#getDocumentID <em>Document ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document ID</em>' containment reference.
	 * @see #getDocumentID()
	 * @generated
	 */
	public void setDocumentID(DocumentIDType newDocumentID) {
		documentID = newDocumentID;
	}

	/**
	 * Returns the value of the '<em><b>Approval Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Endorsement. Approval Status. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>This specifies the status of the endorsement</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Endorsement</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Approval Status</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Authentication Code</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Approval Status</em>' containment reference.
	 * @see #setApprovalStatus(ApprovalStatusType)
	 * @generated
	 */
	public ApprovalStatusType getApprovalStatus() {
		return (approvalStatus == null) ? new ApprovalStatusType()
				: approvalStatus;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.EndorsementType#getApprovalStatus <em>Approval Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approval Status</em>' containment reference.
	 * @see #getApprovalStatus()
	 * @generated
	 */
	public void setApprovalStatus(ApprovalStatusType newApprovalStatus) {
		approvalStatus = newApprovalStatus;
	}

	/**
	 * Returns the value of the '<em><b>Remarks</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cbc.RemarksType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Endorsement. Remarks. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The remarks by the endorsing party</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Endorsement</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Remarks</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remarks</em>' containment reference list.
	 * @generated
	 */
	public List getRemarks() {
		if (remarks == null) {
			remarks = new ArrayList<RemarksType>();
		}
		return remarks;
	}

	/**
	 * Returns the value of the '<em><b>Endorser Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Endorsement. Endorser Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The type of party providing the endorsement</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Endorsement</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Endorser Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Endorser Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endorser Party</em>' containment reference.
	 * @see #setEndorserParty(EndorserPartyType)
	 * @generated
	 */
	public EndorserPartyType getEndorserParty() {
		return (endorserParty == null) ? new EndorserPartyType()
				: endorserParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.EndorsementType#getEndorserParty <em>Endorser Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endorser Party</em>' containment reference.
	 * @see #getEndorserParty()
	 * @generated
	 */
	public void setEndorserParty(EndorserPartyType newEndorserParty) {
		endorserParty = newEndorserParty;
	}

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.SignatureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Endorsement. Signature</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>One or more signatures applied to the endorsement</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Endorsement</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Signature</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Signature</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature</em>' containment reference list.
	 * @generated
	 */
	public List getSignature() {
		if (signature == null) {
			signature = new ArrayList<SignatureType>();
		}
		return signature;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.approvalStatus == null) ? 0 : this.approvalStatus.hashCode());
		result = PRIME * result + ((this.documentID == null) ? 0 : this.documentID.hashCode());
		result = PRIME * result + ((this.endorserParty == null) ? 0 : this.endorserParty.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.remarks == null) ? 0 : this.remarks.hashCode());
		result = PRIME * result + ((this.signature == null) ? 0 : this.signature.hashCode());
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
		final EndorsementType other = (EndorsementType) obj;
		if (this.approvalStatus == null) {
			if (other.approvalStatus != null)
				return false;
		} else if (!this.approvalStatus.equals(other.approvalStatus))
			return false;
		if (this.documentID == null) {
			if (other.documentID != null)
				return false;
		} else if (!this.documentID.equals(other.documentID))
			return false;
		if (this.endorserParty == null) {
			if (other.endorserParty != null)
				return false;
		} else if (!this.endorserParty.equals(other.endorserParty))
			return false;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.remarks == null) {
			if (other.remarks != null)
				return false;
		} else if (!this.remarks.equals(other.remarks))
			return false;
		if (this.signature == null) {
			if (other.signature != null)
				return false;
		} else if (!this.signature.equals(other.signature))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // EndorsementType