/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import java.util.List;

import org.openebiz.core.common.cbc.ApprovalStatusType;
import org.openebiz.core.common.cbc.DocumentIDType;

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
 */
public interface EndorsementType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

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
	 */
	DocumentIDType getDocumentID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.EndorsementType#getDocumentID <em>Document ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document ID</em>' containment reference.
	 * @see #getDocumentID()
	 */
	void setDocumentID(DocumentIDType value);

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
	 */
	ApprovalStatusType getApprovalStatus();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.EndorsementType#getApprovalStatus <em>Approval Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approval Status</em>' containment reference.
	 * @see #getApprovalStatus()
	 */
	void setApprovalStatus(ApprovalStatusType value);

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
	 */
	List getRemarks();

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
	 */
	EndorserPartyType getEndorserParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.EndorsementType#getEndorserParty <em>Endorser Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endorser Party</em>' containment reference.
	 * @see #getEndorserParty()
	 */
	void setEndorserParty(EndorserPartyType value);

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
	 */
	List getSignature();

} // EndorsementType