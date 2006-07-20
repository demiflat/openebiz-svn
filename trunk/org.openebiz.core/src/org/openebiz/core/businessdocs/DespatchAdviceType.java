/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.businessdocs;

import org.openebiz.core.common.cac.CustomerPartyType;
import org.openebiz.core.common.cac.DespatchLineType;
import org.openebiz.core.common.cac.DocumentReferenceType;
import org.openebiz.core.common.cac.OrderReferenceType;
import org.openebiz.core.common.cac.ShipmentType;
import org.openebiz.core.common.cac.SignatureType;
import org.openebiz.core.common.cac.SupplierPartyType;

import org.openebiz.core.common.cbc.CopyIndicatorType;
import org.openebiz.core.common.cbc.DespatchAdviceTypeCodeType;
import org.openebiz.core.common.cbc.DocumentStatusCodeType;
import org.openebiz.core.common.cbc.GUIDType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.IssueDateType;
import org.openebiz.core.common.cbc.IssueTimeType;
import org.openebiz.core.common.cbc.NoteType;

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
 *           <ccts:DictionaryEntryName>Despatch Advice. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>The document used to describe the despatch or delivery of goods and services</ccts:Definition>
 *           <ccts:ObjectClass>Despatch Advice</ccts:ObjectClass>
 *           <ccts:AlternativeBusinessTerms>Ship Note, Dispatch Advice, Consignment Note</ccts:AlternativeBusinessTerms>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.businessdocs.DespatchAdviceType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DespatchAdviceType#getCopyIndicator <em>Copy Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DespatchAdviceType#getGUID <em>GUID</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DespatchAdviceType#getIssueDate <em>Issue Date</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DespatchAdviceType#getIssueTime <em>Issue Time</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DespatchAdviceType#getDocumentStatusCode <em>Document Status Code</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DespatchAdviceType#getDespatchAdviceTypeCode <em>Despatch Advice Type Code</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DespatchAdviceType#getNote <em>Note</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DespatchAdviceType#getOrderReference <em>Order Reference</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DespatchAdviceType#getAdditionalDocumentReference <em>Additional Document Reference</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DespatchAdviceType#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DespatchAdviceType#getBuyerCustomerParty <em>Buyer Customer Party</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DespatchAdviceType#getSellerSupplierParty <em>Seller Supplier Party</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DespatchAdviceType#getOriginatorCustomerParty <em>Originator Customer Party</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DespatchAdviceType#getShipment <em>Shipment</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.DespatchAdviceType#getDespatchLine <em>Despatch Line</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DespatchAdviceType implements Serializable {
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
	 * The cached value of the '{@link #getCopyIndicator() <em>Copy Indicator</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyIndicator()
	 * @generated
	 * @ordered
	 */
	protected CopyIndicatorType copyIndicator = null;

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
	 * The cached value of the '{@link #getDocumentStatusCode() <em>Document Status Code</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentStatusCode()
	 * @generated
	 * @ordered
	 */
	protected DocumentStatusCodeType documentStatusCode = null;

	/**
	 * The cached value of the '{@link #getDespatchAdviceTypeCode() <em>Despatch Advice Type Code</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDespatchAdviceTypeCode()
	 * @generated
	 * @ordered
	 */
	protected DespatchAdviceTypeCodeType despatchAdviceTypeCode = null;

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
	 * The cached value of the '{@link #getOrderReference() <em>Order Reference</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderReference()
	 * @generated
	 * @ordered
	 */
	protected List  orderReference = null;

	/**
	 * The cached value of the '{@link #getAdditionalDocumentReference() <em>Additional Document Reference</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalDocumentReference()
	 * @generated
	 * @ordered
	 */
	protected List  additionalDocumentReference = null;

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
	 * The cached value of the '{@link #getBuyerCustomerParty() <em>Buyer Customer Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuyerCustomerParty()
	 * @generated
	 * @ordered
	 */
	protected CustomerPartyType buyerCustomerParty = null;

	/**
	 * The cached value of the '{@link #getSellerSupplierParty() <em>Seller Supplier Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSellerSupplierParty()
	 * @generated
	 * @ordered
	 */
	protected SupplierPartyType sellerSupplierParty = null;

	/**
	 * The cached value of the '{@link #getOriginatorCustomerParty() <em>Originator Customer Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginatorCustomerParty()
	 * @generated
	 * @ordered
	 */
	protected CustomerPartyType originatorCustomerParty = null;

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
	 * The cached value of the '{@link #getDespatchLine() <em>Despatch Line</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDespatchLine()
	 * @generated
	 * @ordered
	 */
	protected List  despatchLine = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DespatchAdviceType() {
		super();
		this.init();
	}
	
	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.additionalDocumentReference = this.getAdditionalDocumentReference();
		this.buyerCustomerParty = this.getBuyerCustomerParty();
		this.copyIndicator = this.getCopyIndicator();
		this.despatchAdviceTypeCode = this.getDespatchAdviceTypeCode();
		this.despatchLine = this.getDespatchLine();
		this.documentStatusCode = this.getDocumentStatusCode();
		this.gUID = this.getGUID();
		this.iD = this.getID();
		this.issueDate = this.getIssueDate();
		this.issueTime = this.getIssueTime();
		this.note = this.getNote();
		this.orderReference = this.getOrderReference();
		this.originatorCustomerParty = this.getOriginatorCustomerParty();
		this.sellerSupplierParty = this.getSellerSupplierParty();
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
	 *               <ccts:DictionaryEntryName>Despatch Advice. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An identifier for the Despatch Advice assigned by Despatch (Party)</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Despatch Advice</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.despatchadvice.DespatchAdviceType#getID <em>ID</em>}'
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
	 * Returns the value of the '<em><b>Copy Indicator</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Despatch Advice. Copy Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Indicates whether the Despatch Advice is a copy (true) or not (false)</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Despatch Advice</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Copy Indicator</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copy Indicator</em>'
	 * @see #setCopyIndicator(CopyIndicatorType)
	 * @generated
	 */
	public CopyIndicatorType getCopyIndicator() {
		return (copyIndicator == null) ? new CopyIndicatorType()
				: copyIndicator;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.despatchadvice.DespatchAdviceType#getCopyIndicator <em>Copy Indicator</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy Indicator</em>'
	 * @see #getCopyIndicator()
	 * @generated
	 */
	public void setCopyIndicator(CopyIndicatorType newCopyIndicator) {
		copyIndicator = newCopyIndicator;
	}

	/**
	 * Returns the value of the '<em><b>GUID</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Despatch Advice. Globally Unique Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A computer-generated globally unique identifier (GUID) for the Despatch Advice instance</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Despatch Advice</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.despatchadvice.DespatchAdviceType#getGUID <em>GUID</em>}'
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
	 *               <ccts:DictionaryEntryName>Despatch Advice. Issue Date. Date</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The date assigned by Despatch (Party) on which the Despatch Advice was issued</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Despatch Advice</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.despatchadvice.DespatchAdviceType#getIssueDate <em>Issue Date</em>}'
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
	 *               <ccts:DictionaryEntryName>Despatch Advice. Issue Time. Time</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The time assigned by Despatch (Party) on which the Despatch Advice was issued</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Despatch Advice</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.despatchadvice.DespatchAdviceType#getIssueTime <em>Issue Time</em>}'
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
	 * Returns the value of the '<em><b>Document Status Code</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Despatch Advice. Document Status. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Identifies the status of the Despatch Advice with respect to its original state. This may be used if the document precedes the event and is subsequently found to be incorrect and in need of cancelling or revising.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Despatch Advice</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Document Status</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Document Status_ Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Status Code</em>'
	 * @see #setDocumentStatusCode(DocumentStatusCodeType)
	 * @generated
	 */
	public DocumentStatusCodeType getDocumentStatusCode() {
		return (documentStatusCode == null) ? new DocumentStatusCodeType()
				: documentStatusCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.despatchadvice.DespatchAdviceType#getDocumentStatusCode <em>Document Status Code</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Status Code</em>'
	 * @see #getDocumentStatusCode()
	 * @generated
	 */
	public void setDocumentStatusCode(
			DocumentStatusCodeType newDocumentStatusCode) {
		documentStatusCode = newDocumentStatusCode;
	}

	/**
	 * Returns the value of the '<em><b>Despatch Advice Type Code</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Despatch Advice. Despatch Advice Type. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Identifies the type of the Despatch Advice.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Despatch Advice</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Despatch Advice Type</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Despatch Advice Type Code</em>'
	 * @see #setDespatchAdviceTypeCode(DespatchAdviceTypeCodeType)
	 * @generated
	 */
	public DespatchAdviceTypeCodeType getDespatchAdviceTypeCode() {
		return (despatchAdviceTypeCode == null) ? new DespatchAdviceTypeCodeType()
				: despatchAdviceTypeCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.despatchadvice.DespatchAdviceType#getDespatchAdviceTypeCode <em>Despatch Advice Type Code</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Despatch Advice Type Code</em>'
	 * @see #getDespatchAdviceTypeCode()
	 * @generated
	 */
	public void setDespatchAdviceTypeCode(
			DespatchAdviceTypeCodeType newDespatchAdviceTypeCode) {
		despatchAdviceTypeCode = newDespatchAdviceTypeCode;
	}

	/**
	 * Returns the value of the '<em><b>Note</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Despatch Advice. Note. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Free form text applying to the Despatch Advice. This element may contain notes or any other similar information that is not contained explicitly in another structure.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Despatch Advice</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.despatchadvice.DespatchAdviceType#getNote <em>Note</em>}'
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
	 * Returns the value of the '<em><b>Order Reference</b></em>'
	 * The list contents are of type {@link org.openebiz.core.common.cac.OrderReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Despatch Advice. Order Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to an Order</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Despatch Advice</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Order Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Order Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order Reference</em>'
	 * @generated
	 */
	public List getOrderReference() {
		if (orderReference == null) {
			orderReference = new ArrayList<OrderReferenceType>();
		}
		return orderReference;
	}

	/**
	 * Returns the value of the '<em><b>Additional Document Reference</b></em>'
	 * The list contents are of type {@link org.openebiz.core.common.cac.DocumentReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Despatch Advice. Additional_ Document Reference. Document Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to other documents</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Despatch Advice</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Additional</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Document Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Document Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Document Reference</em>'
	 * @generated
	 */
	public List getAdditionalDocumentReference() {
		if (additionalDocumentReference == null) {
			additionalDocumentReference = new ArrayList<
					DocumentReferenceType>();
		}
		return additionalDocumentReference;
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
	 *               <ccts:DictionaryEntryName>Despatch Advice. Signature</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Associates the Despatch Advice with zero or more signatures.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Despatch Advice</ccts:ObjectClass>
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
	 * Returns the value of the '<em><b>Buyer Customer Party</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Despatch Advice. Buyer_ Customer Party. Customer Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Buyer</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Despatch Advice</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Buyer</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Customer Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Customer Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Buyer Customer Party</em>'
	 * @see #setBuyerCustomerParty(CustomerPartyType)
	 * @generated
	 */
	public CustomerPartyType getBuyerCustomerParty() {
		return (buyerCustomerParty == null) ? new CustomerPartyType()
				: buyerCustomerParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.despatchadvice.DespatchAdviceType#getBuyerCustomerParty <em>Buyer Customer Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buyer Customer Party</em>'
	 * @see #getBuyerCustomerParty()
	 * @generated
	 */
	public void setBuyerCustomerParty(CustomerPartyType newBuyerCustomerParty) {
		buyerCustomerParty = newBuyerCustomerParty;
	}

	/**
	 * Returns the value of the '<em><b>Seller Supplier Party</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Despatch Advice. Seller_ Supplier Party. Supplier Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Seller</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Despatch Advice</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Seller</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Supplier Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Supplier Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Seller Supplier Party</em>'
	 * @see #setSellerSupplierParty(SupplierPartyType)
	 * @generated
	 */
	public SupplierPartyType getSellerSupplierParty() {
		return (sellerSupplierParty == null) ? new SupplierPartyType()
				: sellerSupplierParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.despatchadvice.DespatchAdviceType#getSellerSupplierParty <em>Seller Supplier Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seller Supplier Party</em>'
	 * @see #getSellerSupplierParty()
	 * @generated
	 */
	public void setSellerSupplierParty(SupplierPartyType newSellerSupplierParty) {
		sellerSupplierParty = newSellerSupplierParty;
	}

	/**
	 * Returns the value of the '<em><b>Originator Customer Party</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Despatch Advice. Originator_ Customer Party. Customer Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Originator (Party)</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Despatch Advice</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Originator</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Customer Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Customer Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Originator Customer Party</em>'
	 * @see #setOriginatorCustomerParty(CustomerPartyType)
	 * @generated
	 */
	public CustomerPartyType getOriginatorCustomerParty() {
		return (originatorCustomerParty == null) ? new CustomerPartyType()
				: originatorCustomerParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.despatchadvice.DespatchAdviceType#getOriginatorCustomerParty <em>Originator Customer Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Originator Customer Party</em>'
	 * @see #getOriginatorCustomerParty()
	 * @generated
	 */
	public void setOriginatorCustomerParty(
			CustomerPartyType newOriginatorCustomerParty) {
		originatorCustomerParty = newOriginatorCustomerParty;
	}

	/**
	 * Returns the value of the '<em><b>Shipment</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Despatch Advice. Shipment</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to a Shipment detail</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Despatch Advice</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.despatchadvice.DespatchAdviceType#getShipment <em>Shipment</em>}'
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
	 * Returns the value of the '<em><b>Despatch Line</b></em>'
	 * The list contents are of type {@link org.openebiz.core.common.cac.DespatchLineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Despatch Advice. Despatch Line</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to one or more Despatch Advice Lines</ccts:Definition>
	 *               <ccts:Cardinality>1..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Despatch Advice</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Despatch Line</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Despatch Line</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Despatch Line</em>'
	 * @generated
	 */
	public List getDespatchLine() {
		if (despatchLine == null) {
			despatchLine = new ArrayList<DespatchLineType>();
		}
		return despatchLine;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.additionalDocumentReference == null) ? 0 : this.additionalDocumentReference.hashCode());
		result = PRIME * result + ((this.buyerCustomerParty == null) ? 0 : this.buyerCustomerParty.hashCode());
		result = PRIME * result + ((this.copyIndicator == null) ? 0 : this.copyIndicator.hashCode());
		result = PRIME * result + ((this.despatchAdviceTypeCode == null) ? 0 : this.despatchAdviceTypeCode.hashCode());
		result = PRIME * result + ((this.despatchLine == null) ? 0 : this.despatchLine.hashCode());
		result = PRIME * result + ((this.documentStatusCode == null) ? 0 : this.documentStatusCode.hashCode());
		result = PRIME * result + ((this.gUID == null) ? 0 : this.gUID.hashCode());
		result = PRIME * result + ((this.iD == null) ? 0 : this.iD.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.issueDate == null) ? 0 : this.issueDate.hashCode());
		result = PRIME * result + ((this.issueTime == null) ? 0 : this.issueTime.hashCode());
		result = PRIME * result + ((this.note == null) ? 0 : this.note.hashCode());
		result = PRIME * result + ((this.orderReference == null) ? 0 : this.orderReference.hashCode());
		result = PRIME * result + ((this.originatorCustomerParty == null) ? 0 : this.originatorCustomerParty.hashCode());
		result = PRIME * result + ((this.sellerSupplierParty == null) ? 0 : this.sellerSupplierParty.hashCode());
		result = PRIME * result + ((this.shipment == null) ? 0 : this.shipment.hashCode());
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
		final DespatchAdviceType other = (DespatchAdviceType) obj;
		if (this.additionalDocumentReference == null) {
			if (other.additionalDocumentReference != null)
				return false;
		} else if (!this.additionalDocumentReference.equals(other.additionalDocumentReference))
			return false;
		if (this.buyerCustomerParty == null) {
			if (other.buyerCustomerParty != null)
				return false;
		} else if (!this.buyerCustomerParty.equals(other.buyerCustomerParty))
			return false;
		if (this.copyIndicator == null) {
			if (other.copyIndicator != null)
				return false;
		} else if (!this.copyIndicator.equals(other.copyIndicator))
			return false;
		if (this.despatchAdviceTypeCode == null) {
			if (other.despatchAdviceTypeCode != null)
				return false;
		} else if (!this.despatchAdviceTypeCode.equals(other.despatchAdviceTypeCode))
			return false;
		if (this.despatchLine == null) {
			if (other.despatchLine != null)
				return false;
		} else if (!this.despatchLine.equals(other.despatchLine))
			return false;
		if (this.documentStatusCode == null) {
			if (other.documentStatusCode != null)
				return false;
		} else if (!this.documentStatusCode.equals(other.documentStatusCode))
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
		if (this.orderReference == null) {
			if (other.orderReference != null)
				return false;
		} else if (!this.orderReference.equals(other.orderReference))
			return false;
		if (this.originatorCustomerParty == null) {
			if (other.originatorCustomerParty != null)
				return false;
		} else if (!this.originatorCustomerParty.equals(other.originatorCustomerParty))
			return false;
		if (this.sellerSupplierParty == null) {
			if (other.sellerSupplierParty != null)
				return false;
		} else if (!this.sellerSupplierParty.equals(other.sellerSupplierParty))
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
		return true;
	}

} // DespatchAdviceType