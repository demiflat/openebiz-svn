/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.docs.certificateoforigin;

import java.util.List;

import org.openebiz.core.common.cac.CertificateOfOriginApplicationType;
import org.openebiz.core.common.cac.EndorsementType;
import org.openebiz.core.common.cac.PartyType;

import org.openebiz.core.common.cbc.GUIDType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.IssueDateType;
import org.openebiz.core.common.cbc.IssueTimeType;
import org.openebiz.core.common.cbc.VersionIDType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Certificate Of Origin Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Certificate Of Origin. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>A document that describes the Certificate of Origin</ccts:Definition>
 *           <ccts:ObjectClass>Certificate Of Origin</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.docs.certificateoforigin.CertificateOfOriginType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.docs.certificateoforigin.CertificateOfOriginType#getGUID <em>GUID</em>}</li>
 *   <li>{@link org.openebiz.core.docs.certificateoforigin.CertificateOfOriginType#getIssueDate <em>Issue Date</em>}</li>
 *   <li>{@link org.openebiz.core.docs.certificateoforigin.CertificateOfOriginType#getIssueTime <em>Issue Time</em>}</li>
 *   <li>{@link org.openebiz.core.docs.certificateoforigin.CertificateOfOriginType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openebiz.core.docs.certificateoforigin.CertificateOfOriginType#getNote <em>Note</em>}</li>
 *   <li>{@link org.openebiz.core.docs.certificateoforigin.CertificateOfOriginType#getVersionID <em>Version ID</em>}</li>
 *   <li>{@link org.openebiz.core.docs.certificateoforigin.CertificateOfOriginType#getExporterParty <em>Exporter Party</em>}</li>
 *   <li>{@link org.openebiz.core.docs.certificateoforigin.CertificateOfOriginType#getImporterParty <em>Importer Party</em>}</li>
 *   <li>{@link org.openebiz.core.docs.certificateoforigin.CertificateOfOriginType#getEndorserParty <em>Endorser Party</em>}</li>
 *   <li>{@link org.openebiz.core.docs.certificateoforigin.CertificateOfOriginType#getCertificateOfOriginApplication <em>Certificate Of Origin Application</em>}</li>
 *   <li>{@link org.openebiz.core.docs.certificateoforigin.CertificateOfOriginType#getIssuerEndorsement <em>Issuer Endorsement</em>}</li>
 *   <li>{@link org.openebiz.core.docs.certificateoforigin.CertificateOfOriginType#getEmbassyEndorsement <em>Embassy Endorsement</em>}</li>
 *   <li>{@link org.openebiz.core.docs.certificateoforigin.CertificateOfOriginType#getInsuranceEndorsement <em>Insurance Endorsement</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface CertificateOfOriginType {
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
	 *               <ccts:DictionaryEntryName>Certificate Of Origin. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Unique Identifier of the Certificate Of Origin.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Certificate Of Origin</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.docs.certificateoforigin.CertificateOfOriginType#getID <em>ID</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Certificate Of Origin. Globally Unique Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Globally Unique Identifier of the Certificate Of Origin.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Certificate Of Origin</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.docs.certificateoforigin.CertificateOfOriginType#getGUID <em>GUID</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Certificate Of Origin. Issue Date. Date</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Date on which the Certificate Of Origin was issued.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Certificate Of Origin</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.docs.certificateoforigin.CertificateOfOriginType#getIssueDate <em>Issue Date</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Certificate Of Origin. Issue Time. Time</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Time at which the Certificate Of Origin was issued.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Certificate Of Origin</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.docs.certificateoforigin.CertificateOfOriginType#getIssueTime <em>Issue Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Time</em>' containment reference.
	 * @see #getIssueTime()
	 */
	void setIssueTime(IssueTimeType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cbc.DescriptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Certificate Of Origin. Description. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Textual description of a Certificate Of Origin.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Certificate Of Origin</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Description</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference list.
	 */
	List getDescription();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cbc.NoteType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Certificate Of Origin. Note. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Textual note associated with a Certificate Of Origin.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Certificate Of Origin</ccts:ObjectClass>
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
	 * Returns the value of the '<em><b>Version ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Certificate Of Origin. Version Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Version identifier of a Certificate Of Origin.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Certificate Of Origin</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Version Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version ID</em>' containment reference.
	 * @see #setVersionID(VersionIDType)
	 */
	VersionIDType getVersionID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.certificateoforigin.CertificateOfOriginType#getVersionID <em>Version ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version ID</em>' containment reference.
	 * @see #getVersionID()
	 */
	void setVersionID(VersionIDType value);

	/**
	 * Returns the value of the '<em><b>Exporter Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Certificate Of Origin. Exporter_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the party who makes - or on whose behalf - the export declaration - is made - and who is the owner of the goods or has similar right of disposal over them at the time when the declaration is accepted.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Certificate Of Origin</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Exporter</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Exporter (WCO ID 41 and 42)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exporter Party</em>' containment reference.
	 * @see #setExporterParty(PartyType)
	 */
	PartyType getExporterParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.certificateoforigin.CertificateOfOriginType#getExporterParty <em>Exporter Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exporter Party</em>' containment reference.
	 * @see #getExporterParty()
	 */
	void setExporterParty(PartyType value);

	/**
	 * Returns the value of the '<em><b>Importer Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Certificate Of Origin. Importer_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the party who makes-or on whose behalf a Customs clearing agent or other authorized person makes- an import declaration. This may include a person who has possession of the goods or to whom the goods are consigned.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Certificate Of Origin</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Importer</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Importer (WCO ID 39 and 40)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Importer Party</em>' containment reference.
	 * @see #setImporterParty(PartyType)
	 */
	PartyType getImporterParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.certificateoforigin.CertificateOfOriginType#getImporterParty <em>Importer Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importer Party</em>' containment reference.
	 * @see #getImporterParty()
	 */
	void setImporterParty(PartyType value);

	/**
	 * Returns the value of the '<em><b>Endorser Party</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.EndorserPartyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Certificate Of Origin. Endorser Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The party providing the endorsement</ccts:Definition>
	 *               <ccts:Cardinality>1..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Certificate Of Origin</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Endorser Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Endorser Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endorser Party</em>' containment reference list.
	 */
	List getEndorserParty();

	/**
	 * Returns the value of the '<em><b>Certificate Of Origin Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Certificate Of Origin. Certificate Of Origin Application</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Details of the application of a CO</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Certificate Of Origin</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Certificate Of Origin Application</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Certificate Of Origin Application</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Certificate Of Origin Application</em>' containment reference.
	 * @see #setCertificateOfOriginApplication(CertificateOfOriginApplicationType)
	 */
	CertificateOfOriginApplicationType getCertificateOfOriginApplication();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.certificateoforigin.CertificateOfOriginType#getCertificateOfOriginApplication <em>Certificate Of Origin Application</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate Of Origin Application</em>' containment reference.
	 * @see #getCertificateOfOriginApplication()
	 */
	void setCertificateOfOriginApplication(
			CertificateOfOriginApplicationType value);

	/**
	 * Returns the value of the '<em><b>Issuer Endorsement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Certificate Of Origin. Issuer_ Endorsement. Endorsement</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Issuer Endorsement details</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Certificate Of Origin</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Issuer</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Endorsement</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Endorsement</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issuer Endorsement</em>' containment reference.
	 * @see #setIssuerEndorsement(EndorsementType)
	 */
	EndorsementType getIssuerEndorsement();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.certificateoforigin.CertificateOfOriginType#getIssuerEndorsement <em>Issuer Endorsement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuer Endorsement</em>' containment reference.
	 * @see #getIssuerEndorsement()
	 */
	void setIssuerEndorsement(EndorsementType value);

	/**
	 * Returns the value of the '<em><b>Embassy Endorsement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Certificate Of Origin. Embassy_ Endorsement. Endorsement</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Embassy Endorsement details</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Certificate Of Origin</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Embassy</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Endorsement</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Endorsement</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Embassy Endorsement</em>' containment reference.
	 * @see #setEmbassyEndorsement(EndorsementType)
	 */
	EndorsementType getEmbassyEndorsement();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.certificateoforigin.CertificateOfOriginType#getEmbassyEndorsement <em>Embassy Endorsement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Embassy Endorsement</em>' containment reference.
	 * @see #getEmbassyEndorsement()
	 */
	void setEmbassyEndorsement(EndorsementType value);

	/**
	 * Returns the value of the '<em><b>Insurance Endorsement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Certificate Of Origin. Insurance_ Endorsement. Endorsement</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Insurance Endorsement details</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Certificate Of Origin</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Insurance</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Endorsement</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Endorsement</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insurance Endorsement</em>' containment reference.
	 * @see #setInsuranceEndorsement(EndorsementType)
	 */
	EndorsementType getInsuranceEndorsement();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.certificateoforigin.CertificateOfOriginType#getInsuranceEndorsement <em>Insurance Endorsement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insurance Endorsement</em>' containment reference.
	 * @see #getInsuranceEndorsement()
	 */
	void setInsuranceEndorsement(EndorsementType value);

} // CertificateOfOriginType