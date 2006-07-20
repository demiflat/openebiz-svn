/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.businessdocs;

import org.openebiz.core.common.cac.DocumentDistributionType;
import org.openebiz.core.common.cac.DocumentReferenceType;
import org.openebiz.core.common.cac.PartyType;
import org.openebiz.core.common.cac.ShipmentType;
import org.openebiz.core.common.cac.SignatureType;

import org.openebiz.core.common.cbc.DescriptionType;
import org.openebiz.core.common.cbc.GUIDType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.IssueDateType;
import org.openebiz.core.common.cbc.IssueTimeType;
import org.openebiz.core.common.cbc.NameType;
import org.openebiz.core.common.cbc.NoteType;
import org.openebiz.core.common.cbc.OtherInstructionType;
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
 *           <ccts:DictionaryEntryName>Packing List. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>A document stating the detail of how goods are packed.</ccts:Definition>
 *           <ccts:ObjectClass>Packing List</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.businessdocs.PackingListType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.PackingListType#getGUID <em>GUID</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.PackingListType#getIssueDate <em>Issue Date</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.PackingListType#getIssueTime <em>Issue Time</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.PackingListType#getName <em>Name</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.PackingListType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.PackingListType#getNote <em>Note</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.PackingListType#getVersionID <em>Version ID</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.PackingListType#getOtherInstruction <em>Other Instruction</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.PackingListType#getConsignorParty <em>Consignor Party</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.PackingListType#getCarrierParty <em>Carrier Party</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.PackingListType#getFreightForwarderParty <em>Freight Forwarder Party</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.PackingListType#getShipment <em>Shipment</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.PackingListType#getDocumentReference <em>Document Reference</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.PackingListType#getDocumentDistribution <em>Document Distribution</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.PackingListType#getSignature <em>Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackingListType implements Serializable {
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
	 * The cached value of the '{@link #getName() <em>Name</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected NameType name = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected DescriptionType description = null;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected NoteType note = null;

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
	 * The cached value of the '{@link #getOtherInstruction() <em>Other Instruction</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherInstruction()
	 * @generated
	 * @ordered
	 */
	protected OtherInstructionType otherInstruction = null;

	/**
	 * The cached value of the '{@link #getConsignorParty() <em>Consignor Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsignorParty()
	 * @generated
	 * @ordered
	 */
	protected PartyType consignorParty = null;

	/**
	 * The cached value of the '{@link #getCarrierParty() <em>Carrier Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierParty()
	 * @generated
	 * @ordered
	 */
	protected PartyType carrierParty = null;

	/**
	 * The cached value of the '{@link #getFreightForwarderParty() <em>Freight Forwarder Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreightForwarderParty()
	 * @generated
	 * @ordered
	 */
	protected PartyType freightForwarderParty = null;

	/**
	 * The cached value of the '{@link #getShipment() <em>Shipment</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipment()
	 * @generated
	 * @ordered
	 */
	protected ShipmentType shipment = null;

	/**
	 * The cached value of the '{@link #getDocumentReference() <em>Document Reference</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentReference()
	 * @generated
	 * @ordered
	 */
	protected List  documentReference = null;

	/**
	 * The cached value of the '{@link #getDocumentDistribution() <em>Document Distribution</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentDistribution()
	 * @generated
	 * @ordered
	 */
	protected List  documentDistribution = null;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected List  signature = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackingListType() {
		super();
		this.init();
	}
	
	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.carrierParty = this.getCarrierParty();
		this.consignorParty = this.getConsignorParty();
		this.description = this.getDescription();
		this.documentDistribution = this.getDocumentDistribution();
		this.documentReference = this.getDocumentReference();
		this.freightForwarderParty = this.getFreightForwarderParty();
		this.gUID = this.getGUID();
		this.iD = this.getID(); 
		this.issueDate = this.getIssueDate();
		this.issueTime = this.getIssueTime();
		this.name = this.getName();
		this.note = this.getNote();
		this.otherInstruction = this.getOtherInstruction();
		this.shipment = this.getShipment();
		this.signature = this.getSignature();
	}

	/**
	 * Returns the value of the '<em><b>ID</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Packing List. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Unique Identifier of the Packing List. Reference number to identify a packing list.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Packing List</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Packing List Number</ccts:AlternativeBusinessTerms>
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
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.packinglist.PackingListType#getID <em>ID</em>}'
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
	 *               <ccts:DictionaryEntryName>Packing List. Globally Unique Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Globally Unique Identifier of one instance of the Packing List.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Packing List</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.packinglist.PackingListType#getGUID <em>GUID</em>}'
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
	 *               <ccts:DictionaryEntryName>Packing List. Issue Date. Date</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Date of issue of a packing list.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Packing List</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.packinglist.PackingListType#getIssueDate <em>Issue Date</em>}'
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
	 *               <ccts:DictionaryEntryName>Packing List. Issue Time. Time</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Time of issue of a packing list.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Packing List</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.packinglist.PackingListType#getIssueTime <em>Issue Time</em>}'
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
	 * Returns the value of the '<em><b>Name</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Packing List. Name</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Name of a Packing List.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Packing List</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Name</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Name</ccts:RepresentationTerm>
	 *               <ccts:DataType>Name. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>'
	 * @see #setName(NameType)
	 * @generated
	 */
	public NameType getName() {
		return (name == null) ? new NameType() : name;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.packinglist.PackingListType#getName <em>Name</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>'
	 * @see #getName()
	 * @generated
	 */
	public void setName(NameType newName) {
		name = newName;
	}

	/**
	 * Returns the value of the '<em><b>Description</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Packing List. Description. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Textual description of a Packing List.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Packing List</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Description</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>'
	 * @see #setDescription(DescriptionType)
	 * @generated
	 */
	public DescriptionType getDescription() {
		return (description == null) ? new DescriptionType() : description;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.packinglist.PackingListType#getDescription <em>Description</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>'
	 * @see #getDescription()
	 * @generated
	 */
	public void setDescription(DescriptionType newDescription) {
		description = newDescription;
	}

	/**
	 * Returns the value of the '<em><b>Note</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Packing List. Note. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Textual note associated with a Packing List.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Packing List</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Note</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>'
	 * @see #setNote(NoteType)
	 * @generated
	 */
	public NoteType getNote() {
		return (note == null) ? new NoteType() : note;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.packinglist.PackingListType#getNote <em>Note</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>'
	 * @see #getNote()
	 * @generated
	 */
	public void setNote(NoteType newNote) {
		note = newNote;
	}

	/**
	 * Returns the value of the '<em><b>Version ID</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Packing List. Version Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Version identifier of a Packing List.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Packing List</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.packinglist.PackingListType#getVersionID <em>Version ID</em>}'
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
	 * Returns the value of the '<em><b>Other Instruction</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Packing List. Other_ Instruction. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Contains other free text based instructions related to the shipment to the forwarders or carriers. This should only be used where such information cannot be represented in other structured information entities within the document.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Packing List</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Other</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Instruction</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Instruction</em>'
	 * @see #setOtherInstruction(OtherInstructionType)
	 * @generated
	 */
	public OtherInstructionType getOtherInstruction() {
		return (otherInstruction == null) ? new OtherInstructionType()
				: otherInstruction;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.packinglist.PackingListType#getOtherInstruction <em>Other Instruction</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Instruction</em>'
	 * @see #getOtherInstruction()
	 * @generated
	 */
	public void setOtherInstruction(OtherInstructionType newOtherInstruction) {
		otherInstruction = newOtherInstruction;
	}

	/**
	 * Returns the value of the '<em><b>Consignor Party</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Packing List. Consignor_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the party consigning goods as stipulated in the transport contract by the party ordering transport.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Packing List</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Consignor</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Consignor (WCO ID 71 and 72)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consignor Party</em>'
	 * @see #setConsignorParty(PartyType)
	 * @generated
	 */
	public PartyType getConsignorParty() {
		return (consignorParty == null) ? new PartyType() : consignorParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.packinglist.PackingListType#getConsignorParty <em>Consignor Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consignor Party</em>'
	 * @see #getConsignorParty()
	 * @generated
	 */
	public void setConsignorParty(PartyType newConsignorParty) {
		consignorParty = newConsignorParty;
	}

	/**
	 * Returns the value of the '<em><b>Carrier Party</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Packing List. Carrier_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the party providing the transport of goods between named points.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Packing List</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Carrier</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Transport Company, Shipping Line, NVOCC, Airline,  Haulier, Courier, Carrier (WCO ID 49 and 50)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Carrier Party</em>'
	 * @see #setCarrierParty(PartyType)
	 * @generated
	 */
	public PartyType getCarrierParty() {
		return (carrierParty == null) ? new PartyType() : carrierParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.packinglist.PackingListType#getCarrierParty <em>Carrier Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Party</em>'
	 * @see #getCarrierParty()
	 * @generated
	 */
	public void setCarrierParty(PartyType newCarrierParty) {
		carrierParty = newCarrierParty;
	}

	/**
	 * Returns the value of the '<em><b>Freight Forwarder Party</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Packing List. Freight Forwarder_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the party combining individual smaller shipments into a single larger consignment (so called consolidated consignment) that is sent to a counterpart who mirrors the consolidator's activity by dividing the consolidated consignment into its original components.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Packing List</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Freight Forwarder</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Consolidator (WCO ID 192 AND 193)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Freight Forwarder Party</em>'
	 * @see #setFreightForwarderParty(PartyType)
	 * @generated
	 */
	public PartyType getFreightForwarderParty() {
		return (freightForwarderParty == null) ? new PartyType()
				: freightForwarderParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.packinglist.PackingListType#getFreightForwarderParty <em>Freight Forwarder Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Freight Forwarder Party</em>'
	 * @see #getFreightForwarderParty()
	 * @generated
	 */
	public void setFreightForwarderParty(PartyType newFreightForwarderParty) {
		freightForwarderParty = newFreightForwarderParty;
	}

	/**
	 * Returns the value of the '<em><b>Shipment</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Packing List. Shipment</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Information about the separately identifiable collection of goods items (available to be) transported from one consignor to one consignee via one or more modes of transport.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Packing List</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Shipment</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Shipment</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shipment</em>'
	 * @see #setShipment(ShipmentType)
	 * @generated
	 */
	public ShipmentType getShipment() {
		return (shipment == null) ? new ShipmentType() : shipment;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.packinglist.PackingListType#getShipment <em>Shipment</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment</em>'
	 * @see #getShipment()
	 * @generated
	 */
	public void setShipment(ShipmentType newShipment) {
		shipment = newShipment;
	}

	/**
	 * Returns the value of the '<em><b>Document Reference</b></em>'
	 * The list contents are of type {@link org.openebiz.core.common.cac.DocumentReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Packing List. Document Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Other documents that supplement with the packing list to faciliate the logistics request</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Packing List</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Document Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Document Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Reference</em>'
	 * @generated
	 */
	public List getDocumentReference() {
		if (documentReference == null) {
			documentReference = new ArrayList<
					DocumentReferenceType>();
		}
		return documentReference;
	}

	/**
	 * Returns the value of the '<em><b>Document Distribution</b></em>'
	 * The list contents are of type {@link org.openebiz.core.common.cac.DocumentDistributionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Packing List. Document Distribution</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Contain information on the distribution list of the documents</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Packing List</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Document Distribution</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Document Distribution</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Distribution</em>'
	 * @generated
	 */
	public List getDocumentDistribution() {
		if (documentDistribution == null) {
			documentDistribution = new ArrayList<
					DocumentDistributionType>();
		}
		return documentDistribution;
	}

	/**
	 * Returns the value of the '<em><b>Signature</b></em>'
	 * The list contents are of type {@link org.openebiz.core.common.cac.SignatureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Packing List. Signature</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>One or more signatures applied to the document instance</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Packing List</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Signature</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Signature</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature</em>'
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
		result = PRIME * result + ((this.carrierParty == null) ? 0 : this.carrierParty.hashCode());
		result = PRIME * result + ((this.consignorParty == null) ? 0 : this.consignorParty.hashCode());
		result = PRIME * result + ((this.description == null) ? 0 : this.description.hashCode());
		result = PRIME * result + ((this.documentDistribution == null) ? 0 : this.documentDistribution.hashCode());
		result = PRIME * result + ((this.documentReference == null) ? 0 : this.documentReference.hashCode());
		result = PRIME * result + ((this.freightForwarderParty == null) ? 0 : this.freightForwarderParty.hashCode());
		result = PRIME * result + ((this.gUID == null) ? 0 : this.gUID.hashCode());
		result = PRIME * result + ((this.iD == null) ? 0 : this.iD.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.issueDate == null) ? 0 : this.issueDate.hashCode());
		result = PRIME * result + ((this.issueTime == null) ? 0 : this.issueTime.hashCode());
		result = PRIME * result + ((this.name == null) ? 0 : this.name.hashCode());
		result = PRIME * result + ((this.note == null) ? 0 : this.note.hashCode());
		result = PRIME * result + ((this.otherInstruction == null) ? 0 : this.otherInstruction.hashCode());
		result = PRIME * result + ((this.shipment == null) ? 0 : this.shipment.hashCode());
		result = PRIME * result + ((this.signature == null) ? 0 : this.signature.hashCode());
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
		final PackingListType other = (PackingListType) obj;
		if (this.carrierParty == null) {
			if (other.carrierParty != null)
				return false;
		} else if (!this.carrierParty.equals(other.carrierParty))
			return false;
		if (this.consignorParty == null) {
			if (other.consignorParty != null)
				return false;
		} else if (!this.consignorParty.equals(other.consignorParty))
			return false;
		if (this.description == null) {
			if (other.description != null)
				return false;
		} else if (!this.description.equals(other.description))
			return false;
		if (this.documentDistribution == null) {
			if (other.documentDistribution != null)
				return false;
		} else if (!this.documentDistribution.equals(other.documentDistribution))
			return false;
		if (this.documentReference == null) {
			if (other.documentReference != null)
				return false;
		} else if (!this.documentReference.equals(other.documentReference))
			return false;
		if (this.freightForwarderParty == null) {
			if (other.freightForwarderParty != null)
				return false;
		} else if (!this.freightForwarderParty.equals(other.freightForwarderParty))
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
		if (this.name == null) {
			if (other.name != null)
				return false;
		} else if (!this.name.equals(other.name))
			return false;
		if (this.note == null) {
			if (other.note != null)
				return false;
		} else if (!this.note.equals(other.note))
			return false;
		if (this.otherInstruction == null) {
			if (other.otherInstruction != null)
				return false;
		} else if (!this.otherInstruction.equals(other.otherInstruction))
			return false;
		if (this.shipment == null) {
			if (other.shipment != null)
				return false;
		} else if (!this.shipment.equals(other.shipment))
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
		if (this.versionID == null) {
			if (other.versionID != null)
				return false;
		} else if (!this.versionID.equals(other.versionID))
			return false;
		return true;
	}

} // PackingListType