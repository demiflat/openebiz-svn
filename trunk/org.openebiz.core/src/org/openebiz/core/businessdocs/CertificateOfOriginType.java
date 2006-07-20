/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.businessdocs;

import org.openebiz.core.common.cac.CertificateOfOriginApplicationType;
import org.openebiz.core.common.cac.EndorsementType;
import org.openebiz.core.common.cac.EndorserPartyType;
import org.openebiz.core.common.cac.PartyType;

import org.openebiz.core.common.cbc.DescriptionType;
import org.openebiz.core.common.cbc.GUIDType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.IssueDateType;
import org.openebiz.core.common.cbc.IssueTimeType;
import org.openebiz.core.common.cbc.NoteType;
import org.openebiz.core.common.cbc.VersionIDType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
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
 *   <li>{@link org.openebiz.core.businessdocs.CertificateOfOriginType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.CertificateOfOriginType#getGUID <em>GUID</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.CertificateOfOriginType#getIssueDate <em>Issue Date</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.CertificateOfOriginType#getIssueTime <em>Issue Time</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.CertificateOfOriginType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.CertificateOfOriginType#getNote <em>Note</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.CertificateOfOriginType#getVersionID <em>Version ID</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.CertificateOfOriginType#getExporterParty <em>Exporter Party</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.CertificateOfOriginType#getImporterParty <em>Importer Party</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.CertificateOfOriginType#getEndorserParty <em>Endorser Party</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.CertificateOfOriginType#getCertificateOfOriginApplication <em>Certificate Of Origin Application</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.CertificateOfOriginType#getIssuerEndorsement <em>Issuer Endorsement</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.CertificateOfOriginType#getEmbassyEndorsement <em>Embassy Endorsement</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.CertificateOfOriginType#getInsuranceEndorsement <em>Insurance Endorsement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CertificateOfOriginType implements Serializable {
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

	/**
	 *  Basic surrogate id support
	 */

	/**
	 *  The internal surrogate id
	 */
	protected Long internalId = null;

	/**
	 *  The db version number
	 */
	protected Integer version = null;

	/**
	 * @return the internalId
	 */
	public Long getInternalId() {
		return this.internalId;
	}

	/**
	 * @return the version
	 */
	public Integer getVersion() {
		return this.version;
	}

	/**
	 * @param internalId the internalId to set
	 */
	protected void setInternalId(Long internalId) {
		this.internalId = internalId;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected IDType iD = null;

	/**
	 * The cached value of the '{@link #getGUID() <em>GUID</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGUID()
	 * @generated
	 * @ordered
	 */
	protected GUIDType gUID = null;

	/**
	 * The cached value of the '{@link #getIssueDate() <em>Issue Date</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueDate()
	 * @generated
	 * @ordered
	 */
	protected IssueDateType issueDate = null;

	/**
	 * The cached value of the '{@link #getIssueTime() <em>Issue Time</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueTime()
	 * @generated
	 * @ordered
	 */
	protected IssueTimeType issueTime = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected List  description = null;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected List  note = null;

	/**
	 * The cached value of the '{@link #getVersionID() <em>Version ID</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionID()
	 * @generated
	 * @ordered
	 */
	protected VersionIDType versionID = null;

	/**
	 * The cached value of the '{@link #getExporterParty() <em>Exporter Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExporterParty()
	 * @generated
	 * @ordered
	 */
	protected PartyType exporterParty = null;

	/**
	 * The cached value of the '{@link #getImporterParty() <em>Importer Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImporterParty()
	 * @generated
	 * @ordered
	 */
	protected PartyType importerParty = null;

	/**
	 * The cached value of the '{@link #getEndorserParty() <em>Endorser Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndorserParty()
	 * @generated
	 * @ordered
	 */
	protected List  endorserParty = null;

	/**
	 * The cached value of the '{@link #getCertificateOfOriginApplication() <em>Certificate Of Origin Application</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificateOfOriginApplication()
	 * @generated
	 * @ordered
	 */
	protected CertificateOfOriginApplicationType certificateOfOriginApplication = null;

	/**
	 * The cached value of the '{@link #getIssuerEndorsement() <em>Issuer Endorsement</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuerEndorsement()
	 * @generated
	 * @ordered
	 */
	protected EndorsementType issuerEndorsement = null;

	/**
	 * The cached value of the '{@link #getEmbassyEndorsement() <em>Embassy Endorsement</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbassyEndorsement()
	 * @generated
	 * @ordered
	 */
	protected EndorsementType embassyEndorsement = null;

	/**
	 * The cached value of the '{@link #getInsuranceEndorsement() <em>Insurance Endorsement</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsuranceEndorsement()
	 * @generated
	 * @ordered
	 */
	protected EndorsementType insuranceEndorsement = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CertificateOfOriginType() {
		super();
		this.init();
	}
	
	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.certificateOfOriginApplication = this.getCertificateOfOriginApplication();
		this.description = this.getDescription();
		this.embassyEndorsement = this.getEmbassyEndorsement();
		this.endorserParty = this.getEndorserParty();
		this.exporterParty = this.getExporterParty();
		this.gUID = this.getGUID();
		this.iD = this.getID();
		this.importerParty = this.getImporterParty();
		this.insuranceEndorsement = this.getInsuranceEndorsement();
		this.issueDate = this.getIssueDate();
		this.issuerEndorsement = this.getIssuerEndorsement();
		this.issueTime = this.getIssueTime();
		this.note = this.getNote();
		this.versionID = this.getVersionID();
	}

	/**
	 * Returns the value of the '<em><b>ID</b></em>'
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
	 * @return the value of the '<em>ID</em>'
	 * @see #setID(IDType)
	 * @generated
	 */
	public IDType getID() {
		return (iD == null) ? new IDType() : iD;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.certificateoforigin.CertificateOfOriginType#getID <em>ID</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>'
	 * @see #getID()
	 * @generated
	 */
	public void setID(IDType newID) {
		iD = newID;
	}

	/**
	 * Returns the value of the '<em><b>GUID</b></em>'
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
	 * @return the value of the '<em>GUID</em>'
	 * @see #setGUID(GUIDType)
	 * @generated
	 */
	public GUIDType getGUID() {
		return (gUID == null) ? new GUIDType() : gUID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.certificateoforigin.CertificateOfOriginType#getGUID <em>GUID</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GUID</em>'
	 * @see #getGUID()
	 * @generated
	 */
	public void setGUID(GUIDType newGUID) {
		gUID = newGUID;
	}

	/**
	 * Returns the value of the '<em><b>Issue Date</b></em>'
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
	 * @return the value of the '<em>Issue Date</em>'
	 * @see #setIssueDate(IssueDateType)
	 * @generated
	 */
	public IssueDateType getIssueDate() {
		return (issueDate == null) ? new IssueDateType() : issueDate;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.certificateoforigin.CertificateOfOriginType#getIssueDate <em>Issue Date</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Date</em>'
	 * @see #getIssueDate()
	 * @generated
	 */
	public void setIssueDate(IssueDateType newIssueDate) {
		issueDate = newIssueDate;
	}

	/**
	 * Returns the value of the '<em><b>Issue Time</b></em>'
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
	 * @return the value of the '<em>Issue Time</em>'
	 * @see #setIssueTime(IssueTimeType)
	 * @generated
	 */
	public IssueTimeType getIssueTime() {
		return (issueTime == null) ? new IssueTimeType() : issueTime;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.certificateoforigin.CertificateOfOriginType#getIssueTime <em>Issue Time</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Time</em>'
	 * @see #getIssueTime()
	 * @generated
	 */
	public void setIssueTime(IssueTimeType newIssueTime) {
		issueTime = newIssueTime;
	}

	/**
	 * Returns the value of the '<em><b>Description</b></em>'
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
	 * @return the value of the '<em>Description</em>'
	 * @generated
	 */
	public List getDescription() {
		if (description == null) {
			description = new ArrayList<DescriptionType>();
		}
		return description;
	}

	/**
	 * Returns the value of the '<em><b>Note</b></em>'
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
	 * @return the value of the '<em>Note</em>'
	 * @generated
	 */
	public List getNote() {
		if (note == null) {
			note = new ArrayList<NoteType>();
		}
		return note;
	}

	/**
	 * Returns the value of the '<em><b>Version ID</b></em>'
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
	 * @return the value of the '<em>Version ID</em>'
	 * @see #setVersionID(VersionIDType)
	 * @generated
	 */
	public VersionIDType getVersionID() {
		return (versionID == null) ? new VersionIDType() : versionID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.certificateoforigin.CertificateOfOriginType#getVersionID <em>Version ID</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version ID</em>'
	 * @see #getVersionID()
	 * @generated
	 */
	public void setVersionID(VersionIDType newVersionID) {
		versionID = newVersionID;
	}

	/**
	 * Returns the value of the '<em><b>Exporter Party</b></em>'
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
	 * @return the value of the '<em>Exporter Party</em>'
	 * @see #setExporterParty(PartyType)
	 * @generated
	 */
	public PartyType getExporterParty() {
		return (exporterParty == null) ? new PartyType() : exporterParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.certificateoforigin.CertificateOfOriginType#getExporterParty <em>Exporter Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exporter Party</em>'
	 * @see #getExporterParty()
	 * @generated
	 */
	public void setExporterParty(PartyType newExporterParty) {
		exporterParty = newExporterParty;
	}

	/**
	 * Returns the value of the '<em><b>Importer Party</b></em>'
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
	 * @return the value of the '<em>Importer Party</em>'
	 * @see #setImporterParty(PartyType)
	 * @generated
	 */
	public PartyType getImporterParty() {
		return (importerParty == null) ? new PartyType() : importerParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.certificateoforigin.CertificateOfOriginType#getImporterParty <em>Importer Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importer Party</em>'
	 * @see #getImporterParty()
	 * @generated
	 */
	public void setImporterParty(PartyType newImporterParty) {
		importerParty = newImporterParty;
	}

	/**
	 * Returns the value of the '<em><b>Endorser Party</b></em>'
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
	 * @return the value of the '<em>Endorser Party</em>'
	 * @generated
	 */
	public List getEndorserParty() {
		if (endorserParty == null) {
			endorserParty = new ArrayList<EndorserPartyType>();
		}
		return endorserParty;
	}

	/**
	 * Returns the value of the '<em><b>Certificate Of Origin Application</b></em>'
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
	 * @return the value of the '<em>Certificate Of Origin Application</em>'
	 * @see #setCertificateOfOriginApplication(CertificateOfOriginApplicationType)
	 * @generated
	 */
	public CertificateOfOriginApplicationType getCertificateOfOriginApplication() {
		return (certificateOfOriginApplication == null) ? new CertificateOfOriginApplicationType()
				: certificateOfOriginApplication;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.certificateoforigin.CertificateOfOriginType#getCertificateOfOriginApplication <em>Certificate Of Origin Application</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate Of Origin Application</em>'
	 * @see #getCertificateOfOriginApplication()
	 * @generated
	 */
	public void setCertificateOfOriginApplication(
			CertificateOfOriginApplicationType newCertificateOfOriginApplication) {
		certificateOfOriginApplication = newCertificateOfOriginApplication;
	}

	/**
	 * Returns the value of the '<em><b>Issuer Endorsement</b></em>'
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
	 * @return the value of the '<em>Issuer Endorsement</em>'
	 * @see #setIssuerEndorsement(EndorsementType)
	 * @generated
	 */
	public EndorsementType getIssuerEndorsement() {
		return (issuerEndorsement == null) ? new EndorsementType()
				: issuerEndorsement;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.certificateoforigin.CertificateOfOriginType#getIssuerEndorsement <em>Issuer Endorsement</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuer Endorsement</em>'
	 * @see #getIssuerEndorsement()
	 * @generated
	 */
	public void setIssuerEndorsement(EndorsementType newIssuerEndorsement) {
		issuerEndorsement = newIssuerEndorsement;
	}

	/**
	 * Returns the value of the '<em><b>Embassy Endorsement</b></em>'
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
	 * @return the value of the '<em>Embassy Endorsement</em>'
	 * @see #setEmbassyEndorsement(EndorsementType)
	 * @generated
	 */
	public EndorsementType getEmbassyEndorsement() {
		return (embassyEndorsement == null) ? new EndorsementType()
				: embassyEndorsement;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.certificateoforigin.CertificateOfOriginType#getEmbassyEndorsement <em>Embassy Endorsement</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Embassy Endorsement</em>'
	 * @see #getEmbassyEndorsement()
	 * @generated
	 */
	public void setEmbassyEndorsement(EndorsementType newEmbassyEndorsement) {
		embassyEndorsement = newEmbassyEndorsement;
	}

	/**
	 * Returns the value of the '<em><b>Insurance Endorsement</b></em>'
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
	 * @return the value of the '<em>Insurance Endorsement</em>'
	 * @see #setInsuranceEndorsement(EndorsementType)
	 * @generated
	 */
	public EndorsementType getInsuranceEndorsement() {
		return (insuranceEndorsement == null) ? new EndorsementType()
				: insuranceEndorsement;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.certificateoforigin.CertificateOfOriginType#getInsuranceEndorsement <em>Insurance Endorsement</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insurance Endorsement</em>'
	 * @see #getInsuranceEndorsement()
	 * @generated
	 */
	public void setInsuranceEndorsement(EndorsementType newInsuranceEndorsement) {
		insuranceEndorsement = newInsuranceEndorsement;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.certificateOfOriginApplication == null) ? 0 : this.certificateOfOriginApplication.hashCode());
		result = PRIME * result + ((this.description == null) ? 0 : this.description.hashCode());
		result = PRIME * result + ((this.embassyEndorsement == null) ? 0 : this.embassyEndorsement.hashCode());
		result = PRIME * result + ((this.endorserParty == null) ? 0 : this.endorserParty.hashCode());
		result = PRIME * result + ((this.exporterParty == null) ? 0 : this.exporterParty.hashCode());
		result = PRIME * result + ((this.gUID == null) ? 0 : this.gUID.hashCode());
		result = PRIME * result + ((this.iD == null) ? 0 : this.iD.hashCode());
		result = PRIME * result + ((this.importerParty == null) ? 0 : this.importerParty.hashCode());
		result = PRIME * result + ((this.insuranceEndorsement == null) ? 0 : this.insuranceEndorsement.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.issueDate == null) ? 0 : this.issueDate.hashCode());
		result = PRIME * result + ((this.issueTime == null) ? 0 : this.issueTime.hashCode());
		result = PRIME * result + ((this.issuerEndorsement == null) ? 0 : this.issuerEndorsement.hashCode());
		result = PRIME * result + ((this.note == null) ? 0 : this.note.hashCode());
		result = PRIME * result + ((this.version == null) ? 0 : this.version.hashCode());
		result = PRIME * result + ((this.versionID == null) ? 0 : this.versionID.hashCode());
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
		final CertificateOfOriginType other = (CertificateOfOriginType) obj;
		if (this.certificateOfOriginApplication == null) {
			if (other.certificateOfOriginApplication != null)
				return false;
		} else if (!this.certificateOfOriginApplication.equals(other.certificateOfOriginApplication))
			return false;
		if (this.description == null) {
			if (other.description != null)
				return false;
		} else if (!this.description.equals(other.description))
			return false;
		if (this.embassyEndorsement == null) {
			if (other.embassyEndorsement != null)
				return false;
		} else if (!this.embassyEndorsement.equals(other.embassyEndorsement))
			return false;
		if (this.endorserParty == null) {
			if (other.endorserParty != null)
				return false;
		} else if (!this.endorserParty.equals(other.endorserParty))
			return false;
		if (this.exporterParty == null) {
			if (other.exporterParty != null)
				return false;
		} else if (!this.exporterParty.equals(other.exporterParty))
			return false;
		if (this.gUID == null) {
			if (other.gUID != null)
				return false;
		} else if (!this.gUID.equals(other.gUID))
			return false;
		if (this.iD == null) {
			if (other.iD != null)
				return false;
		} else if (!this.iD.equals(other.iD))
			return false;
		if (this.importerParty == null) {
			if (other.importerParty != null)
				return false;
		} else if (!this.importerParty.equals(other.importerParty))
			return false;
		if (this.insuranceEndorsement == null) {
			if (other.insuranceEndorsement != null)
				return false;
		} else if (!this.insuranceEndorsement.equals(other.insuranceEndorsement))
			return false;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.issueDate == null) {
			if (other.issueDate != null)
				return false;
		} else if (!this.issueDate.equals(other.issueDate))
			return false;
		if (this.issueTime == null) {
			if (other.issueTime != null)
				return false;
		} else if (!this.issueTime.equals(other.issueTime))
			return false;
		if (this.issuerEndorsement == null) {
			if (other.issuerEndorsement != null)
				return false;
		} else if (!this.issuerEndorsement.equals(other.issuerEndorsement))
			return false;
		if (this.note == null) {
			if (other.note != null)
				return false;
		} else if (!this.note.equals(other.note))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		if (this.versionID == null) {
			if (other.versionID != null)
				return false;
		} else if (!this.versionID.equals(other.versionID))
			return false;
		return true;
	}

} // CertificateOfOriginType