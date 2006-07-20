/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.businessdocs;

import org.openebiz.core.common.cac.AttachmentType;
import org.openebiz.core.common.cac.PartyType;
import org.openebiz.core.common.cac.SignatureType;

import org.openebiz.core.common.cbc.DocumentQualifierCodeType;
import org.openebiz.core.common.cbc.DocumentQualifierType;
import org.openebiz.core.common.cbc.GUIDType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.IssueDateType;
import org.openebiz.core.common.cbc.IssueTimeType;
import org.openebiz.core.common.cbc.NoteType;
import org.openebiz.core.common.cbc.ParentDocumentIDType;
import org.openebiz.core.common.cbc.ParentDocumentQualifierCodeType;

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
 *           <ccts:DictionaryEntryName>Attached Document. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>a document to indicate the application’s response to a transaction.</ccts:Definition>
 *           <ccts:ObjectClass>Attached Document</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.businessdocs.AttachedDocumentType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.AttachedDocumentType#getGUID <em>GUID</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.AttachedDocumentType#getIssueDate <em>Issue Date</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.AttachedDocumentType#getIssueTime <em>Issue Time</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.AttachedDocumentType#getNote <em>Note</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.AttachedDocumentType#getDocumentQualifierCode <em>Document Qualifier Code</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.AttachedDocumentType#getDocumentQualifier <em>Document Qualifier</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.AttachedDocumentType#getParentDocumentID <em>Parent Document ID</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.AttachedDocumentType#getParentDocumentQualifierCode <em>Parent Document Qualifier Code</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.AttachedDocumentType#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.AttachedDocumentType#getSenderParty <em>Sender Party</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.AttachedDocumentType#getReceiverParty <em>Receiver Party</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.AttachedDocumentType#getAttachment <em>Attachment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttachedDocumentType implements Serializable {
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
	 * The cached value of the '{@link #getNote() <em>Note</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected List  note = null;

	/**
	 * The cached value of the '{@link #getDocumentQualifierCode() <em>Document Qualifier Code</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentQualifierCode()
	 * @generated
	 * @ordered
	 */
	protected DocumentQualifierCodeType documentQualifierCode = null;

	/**
	 * The cached value of the '{@link #getDocumentQualifier() <em>Document Qualifier</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentQualifier()
	 * @generated
	 * @ordered
	 */
	protected DocumentQualifierType documentQualifier = null;

	/**
	 * The cached value of the '{@link #getParentDocumentID() <em>Parent Document ID</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentDocumentID()
	 * @generated
	 * @ordered
	 */
	protected ParentDocumentIDType parentDocumentID = null;

	/**
	 * The cached value of the '{@link #getParentDocumentQualifierCode() <em>Parent Document Qualifier Code</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentDocumentQualifierCode()
	 * @generated
	 * @ordered
	 */
	protected ParentDocumentQualifierCodeType parentDocumentQualifierCode = null;

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
	 * The cached value of the '{@link #getSenderParty() <em>Sender Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSenderParty()
	 * @generated
	 * @ordered
	 */
	protected PartyType senderParty = null;

	/**
	 * The cached value of the '{@link #getReceiverParty() <em>Receiver Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverParty()
	 * @generated
	 * @ordered
	 */
	protected PartyType receiverParty = null;

	/**
	 * The cached value of the '{@link #getAttachment() <em>Attachment</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment()
	 * @generated
	 * @ordered
	 */
	protected AttachmentType attachment = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachedDocumentType() {
		super();
		this.init();
	}
	
	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.attachment = this.getAttachment();
		this.documentQualifier = this.getDocumentQualifier();
		this.documentQualifierCode = this.getDocumentQualifierCode();
		this.gUID = this.getGUID();
		this.iD = this.getID();
		this.issueDate = this.getIssueDate();
		this.issueTime =  this.getIssueTime();
		this.note = this.getNote();
		this.parentDocumentID = this.getParentDocumentID();
		this.parentDocumentQualifierCode = this.getParentDocumentQualifierCode();
		this.receiverParty = this.getReceiverParty();
		this.senderParty = this.getSenderParty();
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
	 *               <ccts:DictionaryEntryName>Attached Document. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An identifier for the Attached Document. Used as a reference for a business document (the parent)</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Attached Document</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.attacheddocument.AttachedDocumentType#getID <em>ID</em>}'
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
	 *               <ccts:DictionaryEntryName>Attached Document. Globally Unique Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A computer-generated universally unique identifier (GUID) for the document instance.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Attached Document</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.attacheddocument.AttachedDocumentType#getGUID <em>GUID</em>}'
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
	 *               <ccts:DictionaryEntryName>Attached Document. Issue Date. Date</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>a date denoting when the Attached Document was issued.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Attached Document</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.attacheddocument.AttachedDocumentType#getIssueDate <em>Issue Date</em>}'
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
	 *               <ccts:DictionaryEntryName>Attached Document. Issue Time. Time</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>a time denoting when the Attached Document was issued.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Attached Document</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.attacheddocument.AttachedDocumentType#getIssueTime <em>Issue Time</em>}'
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
	 * Returns the value of the '<em><b>Note</b></em>'
	 * The list contents are of type {@link org.openebiz.core.common.cbc.NoteType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Attached Document. Note. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>contains any free form text pertinent to the entire document or to the document message itself. This element may contain notes or any other similar information that is not contained explicitly in another structure.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Attached Document</ccts:ObjectClass>
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
	 * Returns the value of the '<em><b>Document Qualifier Code</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Attached Document. Document Qualifier Code. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Qualifies the type of document using a code set.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Attached Document</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Document Qualifier Code</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Qualifier Code</em>'
	 * @see #setDocumentQualifierCode(DocumentQualifierCodeType)
	 * @generated
	 */
	public DocumentQualifierCodeType getDocumentQualifierCode() {
		return (documentQualifierCode == null) ? new DocumentQualifierCodeType()
				: documentQualifierCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.attacheddocument.AttachedDocumentType#getDocumentQualifierCode <em>Document Qualifier Code</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Qualifier Code</em>'
	 * @see #getDocumentQualifierCode()
	 * @generated
	 */
	public void setDocumentQualifierCode(
			DocumentQualifierCodeType newDocumentQualifierCode) {
		documentQualifierCode = newDocumentQualifierCode;
	}

	/**
	 * Returns the value of the '<em><b>Document Qualifier</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Attached Document. Document Qualifier. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Qualifies types of document as text</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Attached Document</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Document Qualifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Qualifier</em>'
	 * @see #setDocumentQualifier(DocumentQualifierType)
	 * @generated
	 */
	public DocumentQualifierType getDocumentQualifier() {
		return (documentQualifier == null) ? new DocumentQualifierType()
				: documentQualifier;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.attacheddocument.AttachedDocumentType#getDocumentQualifier <em>Document Qualifier</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Qualifier</em>'
	 * @see #getDocumentQualifier()
	 * @generated
	 */
	public void setDocumentQualifier(DocumentQualifierType newDocumentQualifier) {
		documentQualifier = newDocumentQualifier;
	}

	/**
	 * Returns the value of the '<em><b>Parent Document ID</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Attached Document. Parent_ Document Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Identifies the parent document.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Attached Document</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Parent</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Document Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Document ID</em>'
	 * @see #setParentDocumentID(ParentDocumentIDType)
	 * @generated
	 */
	public ParentDocumentIDType getParentDocumentID() {
		return (parentDocumentID == null) ? new ParentDocumentIDType()
				: parentDocumentID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.attacheddocument.AttachedDocumentType#getParentDocumentID <em>Parent Document ID</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Document ID</em>'
	 * @see #getParentDocumentID()
	 * @generated
	 */
	public void setParentDocumentID(ParentDocumentIDType newParentDocumentID) {
		parentDocumentID = newParentDocumentID;
	}

	/**
	 * Returns the value of the '<em><b>Parent Document Qualifier Code</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Attached Document. Parent_ Document Qualifier Code. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Identifies the type of parent document.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Attached Document</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Parent</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Document Qualifier Code</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Document Qualifier Code</em>'
	 * @see #setParentDocumentQualifierCode(ParentDocumentQualifierCodeType)
	 * @generated
	 */
	public ParentDocumentQualifierCodeType getParentDocumentQualifierCode() {
		return (parentDocumentQualifierCode == null) ? new ParentDocumentQualifierCodeType()
				: parentDocumentQualifierCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.attacheddocument.AttachedDocumentType#getParentDocumentQualifierCode <em>Parent Document Qualifier Code</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Document Qualifier Code</em>'
	 * @see #getParentDocumentQualifierCode()
	 * @generated
	 */
	public void setParentDocumentQualifierCode(
			ParentDocumentQualifierCodeType newParentDocumentQualifierCode) {
		parentDocumentQualifierCode = newParentDocumentQualifierCode;
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
	 *               <ccts:DictionaryEntryName>Attached Document. Signature</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>associates the Attached Document with zero or more signatures.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Attached Document</ccts:ObjectClass>
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

	/**
	 * Returns the value of the '<em><b>Sender Party</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Attached Document. Sender_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Party sending this document.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Attached Document</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Sender</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sender Party</em>'
	 * @see #setSenderParty(PartyType)
	 * @generated
	 */
	public PartyType getSenderParty() {
		return (senderParty == null) ? new PartyType() : senderParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.attacheddocument.AttachedDocumentType#getSenderParty <em>Sender Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender Party</em>'
	 * @see #getSenderParty()
	 * @generated
	 */
	public void setSenderParty(PartyType newSenderParty) {
		senderParty = newSenderParty;
	}

	/**
	 * Returns the value of the '<em><b>Receiver Party</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Attached Document. Receiver_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Party receiving this document.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Attached Document</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Receiver</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiver Party</em>'
	 * @see #setReceiverParty(PartyType)
	 * @generated
	 */
	public PartyType getReceiverParty() {
		return (receiverParty == null) ? new PartyType() : receiverParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.attacheddocument.AttachedDocumentType#getReceiverParty <em>Receiver Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver Party</em>'
	 * @see #getReceiverParty()
	 * @generated
	 */
	public void setReceiverParty(PartyType newReceiverParty) {
		receiverParty = newReceiverParty;
	}

	/**
	 * Returns the value of the '<em><b>Attachment</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Attached Document. Attachment</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An attachement containing the document content</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Attached Document</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Attachment</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Attachment</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attachment</em>'
	 * @see #setAttachment(AttachmentType)
	 * @generated
	 */
	public AttachmentType getAttachment() {
		return (attachment == null) ? new AttachmentType() : attachment;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.attacheddocument.AttachedDocumentType#getAttachment <em>Attachment</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment</em>'
	 * @see #getAttachment()
	 * @generated
	 */
	public void setAttachment(AttachmentType newAttachment) {
		attachment = newAttachment;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.attachment == null) ? 0 : this.attachment.hashCode());
		result = PRIME * result + ((this.documentQualifier == null) ? 0 : this.documentQualifier.hashCode());
		result = PRIME * result + ((this.documentQualifierCode == null) ? 0 : this.documentQualifierCode.hashCode());
		result = PRIME * result + ((this.gUID == null) ? 0 : this.gUID.hashCode());
		result = PRIME * result + ((this.iD == null) ? 0 : this.iD.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.issueDate == null) ? 0 : this.issueDate.hashCode());
		result = PRIME * result + ((this.issueTime == null) ? 0 : this.issueTime.hashCode());
		result = PRIME * result + ((this.note == null) ? 0 : this.note.hashCode());
		result = PRIME * result + ((this.parentDocumentID == null) ? 0 : this.parentDocumentID.hashCode());
		result = PRIME * result + ((this.parentDocumentQualifierCode == null) ? 0 : this.parentDocumentQualifierCode.hashCode());
		result = PRIME * result + ((this.receiverParty == null) ? 0 : this.receiverParty.hashCode());
		result = PRIME * result + ((this.senderParty == null) ? 0 : this.senderParty.hashCode());
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
		final AttachedDocumentType other = (AttachedDocumentType) obj;
		if (this.attachment == null) {
			if (other.attachment != null)
				return false;
		} else if (!this.attachment.equals(other.attachment))
			return false;
		if (this.documentQualifier == null) {
			if (other.documentQualifier != null)
				return false;
		} else if (!this.documentQualifier.equals(other.documentQualifier))
			return false;
		if (this.documentQualifierCode == null) {
			if (other.documentQualifierCode != null)
				return false;
		} else if (!this.documentQualifierCode.equals(other.documentQualifierCode))
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
		if (this.note == null) {
			if (other.note != null)
				return false;
		} else if (!this.note.equals(other.note))
			return false;
		if (this.parentDocumentID == null) {
			if (other.parentDocumentID != null)
				return false;
		} else if (!this.parentDocumentID.equals(other.parentDocumentID))
			return false;
		if (this.parentDocumentQualifierCode == null) {
			if (other.parentDocumentQualifierCode != null)
				return false;
		} else if (!this.parentDocumentQualifierCode.equals(other.parentDocumentQualifierCode))
			return false;
		if (this.receiverParty == null) {
			if (other.receiverParty != null)
				return false;
		} else if (!this.receiverParty.equals(other.receiverParty))
			return false;
		if (this.senderParty == null) {
			if (other.senderParty != null)
				return false;
		} else if (!this.senderParty.equals(other.senderParty))
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

} // AttachedDocumentType