/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import java.util.List;

import org.openebiz.core.common.cbc.CertificateTypeType;
import org.openebiz.core.common.cbc.OriginalJobIDType;
import org.openebiz.core.common.cbc.PreviousJobIDType;
import org.openebiz.core.common.cbc.ReferenceIDType;
import org.openebiz.core.common.cbc.RemarksType;
import org.openebiz.core.common.cbc.StatusCodeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Certificate Of Origin Application Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Certificate Of Origin Application. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>A document that contains information of CO applicantion.</ccts:Definition>
 *           <ccts:ObjectClass>Certificate Of Origin Application</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.CertificateOfOriginApplicationType#getReferenceID <em>Reference ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CertificateOfOriginApplicationType#getCertificateType <em>Certificate Type</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CertificateOfOriginApplicationType#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CertificateOfOriginApplicationType#getOriginalJobID <em>Original Job ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CertificateOfOriginApplicationType#getPreviousJobID <em>Previous Job ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CertificateOfOriginApplicationType#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CertificateOfOriginApplicationType#getShipment <em>Shipment</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CertificateOfOriginApplicationType#getEndorserParty <em>Endorser Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CertificateOfOriginApplicationType#getPreparationParty <em>Preparation Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CertificateOfOriginApplicationType#getIssuerParty <em>Issuer Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CertificateOfOriginApplicationType#getIssuingCountry <em>Issuing Country</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CertificateOfOriginApplicationType#getDocumentDistribution <em>Document Distribution</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CertificateOfOriginApplicationType#getSupportingDocumentReference <em>Supporting Document Reference</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CertificateOfOriginApplicationType#getSignature <em>Signature</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface CertificateOfOriginApplicationType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Reference ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Certificate Of Origin Application. Reference. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>holds the unique number that identifies the Despatch Advice, typically according to the seller's system that generated the Despatch Advice</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Certificate Of Origin Application</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Reference</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference ID</em>' containment reference.
	 * @see #setReferenceID(ReferenceIDType)
	 */
	ReferenceIDType getReferenceID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CertificateOfOriginApplicationType#getReferenceID <em>Reference ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference ID</em>' containment reference.
	 * @see #getReferenceID()
	 */
	void setReferenceID(ReferenceIDType value);

	/**
	 * Returns the value of the '<em><b>Certificate Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Certificate Of Origin Application. Certificate_ Type. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Type of CO. Type could be Ordinary, Re-export, Commonwealth Preferential etc.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Certificate Of Origin Application</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Certificate</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Type</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Certificate Type</em>' containment reference.
	 * @see #setCertificateType(CertificateTypeType)
	 */
	CertificateTypeType getCertificateType();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CertificateOfOriginApplicationType#getCertificateType <em>Certificate Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate Type</em>' containment reference.
	 * @see #getCertificateType()
	 */
	void setCertificateType(CertificateTypeType value);

	/**
	 * Returns the value of the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Certificate Of Origin Application. Status. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Indicates the status of the application (revision, replacement, etc)</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Certificate Of Origin Application</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Status</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Code</em>' containment reference.
	 * @see #setStatusCode(StatusCodeType)
	 */
	StatusCodeType getStatusCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CertificateOfOriginApplicationType#getStatusCode <em>Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Code</em>' containment reference.
	 * @see #getStatusCode()
	 */
	void setStatusCode(StatusCodeType value);

	/**
	 * Returns the value of the '<em><b>Original Job ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Certificate Of Origin Application. Original Job. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The latest Job Number given to the Origin application. This is used by the system to keep track of the amendments or cancellation of the origin application applied earlier.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Certificate Of Origin Application</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Original Job</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Original Job ID</em>' containment reference.
	 * @see #setOriginalJobID(OriginalJobIDType)
	 */
	OriginalJobIDType getOriginalJobID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CertificateOfOriginApplicationType#getOriginalJobID <em>Original Job ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Job ID</em>' containment reference.
	 * @see #getOriginalJobID()
	 */
	void setOriginalJobID(OriginalJobIDType value);

	/**
	 * Returns the value of the '<em><b>Previous Job ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Certificate Of Origin Application. Previous Job. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The previous Job Number assigned in case the application undergoes querry or change. This is used by the system to keep track of the amendments or cancellation of the origin application applied earlier.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Certificate Of Origin Application</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Previous Job</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Previous Job ID</em>' containment reference.
	 * @see #setPreviousJobID(PreviousJobIDType)
	 */
	PreviousJobIDType getPreviousJobID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CertificateOfOriginApplicationType#getPreviousJobID <em>Previous Job ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Job ID</em>' containment reference.
	 * @see #getPreviousJobID()
	 */
	void setPreviousJobID(PreviousJobIDType value);

	/**
	 * Returns the value of the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Certificate Of Origin Application. Remarks. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The remarks by the applicant for the Certificate of Origin Application</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Certificate Of Origin Application</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Remarks</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remarks</em>' containment reference.
	 * @see #setRemarks(RemarksType)
	 */
	RemarksType getRemarks();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CertificateOfOriginApplicationType#getRemarks <em>Remarks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' containment reference.
	 * @see #getRemarks()
	 */
	void setRemarks(RemarksType value);

	/**
	 * Returns the value of the '<em><b>Shipment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Certificate Of Origin Application. Shipment</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Information about the separately identifiable collection of goods items (available to be) transported from one consignor to one consignee via one or more modes of transport.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Certificate Of Origin Application</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Shipment</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Shipment</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shipment</em>' containment reference.
	 * @see #setShipment(ShipmentType)
	 */
	ShipmentType getShipment();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CertificateOfOriginApplicationType#getShipment <em>Shipment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment</em>' containment reference.
	 * @see #getShipment()
	 */
	void setShipment(ShipmentType value);

	/**
	 * Returns the value of the '<em><b>Endorser Party</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.EndorserPartyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Certificate Of Origin Application. Endorser Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The party providing the endorsement</ccts:Definition>
	 *               <ccts:Cardinality>1..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Certificate Of Origin Application</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Endorser Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Endorser Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endorser Party</em>' containment reference list.
	 */
	List getEndorserParty();

	/**
	 * Returns the value of the '<em><b>Preparation Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Certificate Of Origin Application. Preparation_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Details of an individual, a group or a body that prepares the Certificate of Origin application.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Certificate Of Origin Application</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Preparation</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Preparation Party</em>' containment reference.
	 * @see #setPreparationParty(PartyType)
	 */
	PartyType getPreparationParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CertificateOfOriginApplicationType#getPreparationParty <em>Preparation Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preparation Party</em>' containment reference.
	 * @see #getPreparationParty()
	 */
	void setPreparationParty(PartyType value);

	/**
	 * Returns the value of the '<em><b>Issuer Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Certificate Of Origin Application. Issuer_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Details of authorized organization that issued the Certificate of Origin.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Certificate Of Origin Application</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Issuer</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issuer Party</em>' containment reference.
	 * @see #setIssuerParty(PartyType)
	 */
	PartyType getIssuerParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CertificateOfOriginApplicationType#getIssuerParty <em>Issuer Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuer Party</em>' containment reference.
	 * @see #getIssuerParty()
	 */
	void setIssuerParty(PartyType value);

	/**
	 * Returns the value of the '<em><b>Issuing Country</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Certificate Of Origin Application. Issuing_ Country. Country</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The country for which the Certificate of Origin is issued.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Certificate Of Origin Application</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Issuing</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Country</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Country</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issuing Country</em>' containment reference.
	 * @see #setIssuingCountry(CountryType)
	 */
	CountryType getIssuingCountry();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CertificateOfOriginApplicationType#getIssuingCountry <em>Issuing Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuing Country</em>' containment reference.
	 * @see #getIssuingCountry()
	 */
	void setIssuingCountry(CountryType value);

	/**
	 * Returns the value of the '<em><b>Document Distribution</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.DocumentDistributionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Certificate Of Origin Application. Document Distribution</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The distribution of the Certificate of Origin to interested parties</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Certificate Of Origin Application</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Document Distribution</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Document Distribution</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Distribution</em>' containment reference list.
	 */
	List getDocumentDistribution();

	/**
	 * Returns the value of the '<em><b>Supporting Document Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.DocumentReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Certificate Of Origin Application. Supporting_ Document Reference. Document Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Information about a supporting document attached as a file by the applicant.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Certificate Of Origin Application</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Supporting</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Document Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Document Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supporting Document Reference</em>' containment reference list.
	 */
	List getSupportingDocumentReference();

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.SignatureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Certificate Of Origin Application. Signature</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>One or more signatures applied to the document instance</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Certificate Of Origin Application</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Signature</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Signature</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature</em>' containment reference list.
	 */
	List getSignature();

} // CertificateOfOriginApplicationType