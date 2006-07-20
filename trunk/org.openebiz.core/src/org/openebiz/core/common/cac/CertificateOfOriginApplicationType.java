/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.CertificateTypeType;
import org.openebiz.core.common.cbc.OriginalJobIDType;
import org.openebiz.core.common.cbc.PreviousJobIDType;
import org.openebiz.core.common.cbc.ReferenceIDType;
import org.openebiz.core.common.cbc.RemarksType;
import org.openebiz.core.common.cbc.StatusCodeType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

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
 * @generated
 */
public class CertificateOfOriginApplicationType implements Serializable {
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
	 * The cached value of the '{@link #getReferenceID() <em>Reference ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceID()
	 * @generated
	 * @ordered
	 */
	protected ReferenceIDType referenceID = null;

	/**
	 * The cached value of the '{@link #getCertificateType() <em>Certificate Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificateType()
	 * @generated
	 * @ordered
	 */
	protected CertificateTypeType certificateType = null;

	/**
	 * The cached value of the '{@link #getStatusCode() <em>Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusCode()
	 * @generated
	 * @ordered
	 */
	protected StatusCodeType statusCode = null;

	/**
	 * The cached value of the '{@link #getOriginalJobID() <em>Original Job ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalJobID()
	 * @generated
	 * @ordered
	 */
	protected OriginalJobIDType originalJobID = null;

	/**
	 * The cached value of the '{@link #getPreviousJobID() <em>Previous Job ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousJobID()
	 * @generated
	 * @ordered
	 */
	protected PreviousJobIDType previousJobID = null;

	/**
	 * The cached value of the '{@link #getRemarks() <em>Remarks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected RemarksType remarks = null;

	/**
	 * The cached value of the '{@link #getShipment() <em>Shipment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipment()
	 * @generated
	 * @ordered
	 */
	protected ShipmentType shipment = null;

	/**
	 * The cached value of the '{@link #getEndorserParty() <em>Endorser Party</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndorserParty()
	 * @generated
	 * @ordered
	 */
	protected List endorserParty = null;

	/**
	 * The cached value of the '{@link #getPreparationParty() <em>Preparation Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreparationParty()
	 * @generated
	 * @ordered
	 */
	protected PartyType preparationParty = null;

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
	 * The cached value of the '{@link #getIssuingCountry() <em>Issuing Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuingCountry()
	 * @generated
	 * @ordered
	 */
	protected CountryType issuingCountry = null;

	/**
	 * The cached value of the '{@link #getDocumentDistribution() <em>Document Distribution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentDistribution()
	 * @generated
	 * @ordered
	 */
	protected List documentDistribution = null;

	/**
	 * The cached value of the '{@link #getSupportingDocumentReference() <em>Supporting Document Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingDocumentReference()
	 * @generated
	 * @ordered
	 */
	protected List supportingDocumentReference = null;

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
	public CertificateOfOriginApplicationType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.referenceID = this.getReferenceID();
		this.certificateType = this.getCertificateType();
		this.statusCode = this.getStatusCode();
		this.originalJobID = this.getOriginalJobID();
		this.previousJobID = this.getPreviousJobID();
		this.remarks = this.getRemarks();
		this.shipment = this.getShipment();
		this.endorserParty = this.getEndorserParty();
		this.preparationParty = this.getPreparationParty();
		this.issuerParty = this.getIssuerParty();
		this.issuingCountry = this.getIssuingCountry();
		this.documentDistribution = this.getDocumentDistribution();
		this.supportingDocumentReference = this.getSupportingDocumentReference();
		this.signature = this.getSignature();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getReferenceID().getValue());
		return sdisplay.toString();
	}
	
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
	 * @generated
	 */
	public ReferenceIDType getReferenceID() {
		return (referenceID == null) ? new ReferenceIDType() : referenceID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CertificateOfOriginApplicationType#getReferenceID <em>Reference ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference ID</em>' containment reference.
	 * @see #getReferenceID()
	 * @generated
	 */
	public void setReferenceID(ReferenceIDType newReferenceID) {
		referenceID = newReferenceID;
	}

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
	 * @generated
	 */
	public CertificateTypeType getCertificateType() {
		return (certificateType == null) ? new CertificateTypeType()
				: certificateType;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CertificateOfOriginApplicationType#getCertificateType <em>Certificate Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate Type</em>' containment reference.
	 * @see #getCertificateType()
	 * @generated
	 */
	public void setCertificateType(CertificateTypeType newCertificateType) {
		certificateType = newCertificateType;
	}

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
	 * @generated
	 */
	public StatusCodeType getStatusCode() {
		return (statusCode == null) ? new StatusCodeType() : statusCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CertificateOfOriginApplicationType#getStatusCode <em>Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Code</em>' containment reference.
	 * @see #getStatusCode()
	 * @generated
	 */
	public void setStatusCode(StatusCodeType newStatusCode) {
		statusCode = newStatusCode;
	}

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
	 * @generated
	 */
	public OriginalJobIDType getOriginalJobID() {
		return (originalJobID == null) ? new OriginalJobIDType()
				: originalJobID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CertificateOfOriginApplicationType#getOriginalJobID <em>Original Job ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Job ID</em>' containment reference.
	 * @see #getOriginalJobID()
	 * @generated
	 */
	public void setOriginalJobID(OriginalJobIDType newOriginalJobID) {
		originalJobID = newOriginalJobID;
	}

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
	 * @generated
	 */
	public PreviousJobIDType getPreviousJobID() {
		return (previousJobID == null) ? new PreviousJobIDType()
				: previousJobID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CertificateOfOriginApplicationType#getPreviousJobID <em>Previous Job ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Job ID</em>' containment reference.
	 * @see #getPreviousJobID()
	 * @generated
	 */
	public void setPreviousJobID(PreviousJobIDType newPreviousJobID) {
		previousJobID = newPreviousJobID;
	}

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
	 * @generated
	 */
	public RemarksType getRemarks() {
		return (remarks == null) ? new RemarksType() : remarks;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CertificateOfOriginApplicationType#getRemarks <em>Remarks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' containment reference.
	 * @see #getRemarks()
	 * @generated
	 */
	public void setRemarks(RemarksType newRemarks) {
		remarks = newRemarks;
	}

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
	 * @generated
	 */
	public ShipmentType getShipment() {
		return (shipment == null) ? new ShipmentType() : shipment;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CertificateOfOriginApplicationType#getShipment <em>Shipment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment</em>' containment reference.
	 * @see #getShipment()
	 * @generated
	 */
	public void setShipment(ShipmentType newShipment) {
		shipment = newShipment;
	}

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
	 * @generated
	 */
	public List getEndorserParty() {
		if (endorserParty == null) {
			endorserParty = new ArrayList<EndorserPartyType>();
		}
		return endorserParty;
	}

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
	 * @generated
	 */
	public PartyType getPreparationParty() {
		return (preparationParty == null) ? new PartyType() : preparationParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CertificateOfOriginApplicationType#getPreparationParty <em>Preparation Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preparation Party</em>' containment reference.
	 * @see #getPreparationParty()
	 * @generated
	 */
	public void setPreparationParty(PartyType newPreparationParty) {
		preparationParty = newPreparationParty;
	}

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
	 * @generated
	 */
	public PartyType getIssuerParty() {
		return (issuerParty == null) ? new PartyType() : issuerParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CertificateOfOriginApplicationType#getIssuerParty <em>Issuer Party</em>}' containment reference.
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
	 * @generated
	 */
	public CountryType getIssuingCountry() {
		return (issuingCountry == null) ? new CountryType() : issuingCountry;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CertificateOfOriginApplicationType#getIssuingCountry <em>Issuing Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuing Country</em>' containment reference.
	 * @see #getIssuingCountry()
	 * @generated
	 */
	public void setIssuingCountry(CountryType newIssuingCountry) {
		issuingCountry = newIssuingCountry;
	}

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
	 * @generated
	 */
	public List getSupportingDocumentReference() {
		if (supportingDocumentReference == null) {
			supportingDocumentReference = new ArrayList<
					DocumentReferenceType>();
		}
		return supportingDocumentReference;
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
		result = PRIME * result + ((this.certificateType == null) ? 0 : this.certificateType.hashCode());
		result = PRIME * result + ((this.documentDistribution == null) ? 0 : this.documentDistribution.hashCode());
		result = PRIME * result + ((this.endorserParty == null) ? 0 : this.endorserParty.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.issuerParty == null) ? 0 : this.issuerParty.hashCode());
		result = PRIME * result + ((this.issuingCountry == null) ? 0 : this.issuingCountry.hashCode());
		result = PRIME * result + ((this.originalJobID == null) ? 0 : this.originalJobID.hashCode());
		result = PRIME * result + ((this.preparationParty == null) ? 0 : this.preparationParty.hashCode());
		result = PRIME * result + ((this.previousJobID == null) ? 0 : this.previousJobID.hashCode());
		result = PRIME * result + ((this.referenceID == null) ? 0 : this.referenceID.hashCode());
		result = PRIME * result + ((this.remarks == null) ? 0 : this.remarks.hashCode());
		result = PRIME * result + ((this.shipment == null) ? 0 : this.shipment.hashCode());
		result = PRIME * result + ((this.signature == null) ? 0 : this.signature.hashCode());
		result = PRIME * result + ((this.statusCode == null) ? 0 : this.statusCode.hashCode());
		result = PRIME * result + ((this.supportingDocumentReference == null) ? 0 : this.supportingDocumentReference.hashCode());
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
		final CertificateOfOriginApplicationType other = (CertificateOfOriginApplicationType) obj;
		if (this.certificateType == null) {
			if (other.certificateType != null)
				return false;
		} else if (!this.certificateType.equals(other.certificateType))
			return false;
		if (this.documentDistribution == null) {
			if (other.documentDistribution != null)
				return false;
		} else if (!this.documentDistribution.equals(other.documentDistribution))
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
		if (this.issuerParty == null) {
			if (other.issuerParty != null)
				return false;
		} else if (!this.issuerParty.equals(other.issuerParty))
			return false;
		if (this.issuingCountry == null) {
			if (other.issuingCountry != null)
				return false;
		} else if (!this.issuingCountry.equals(other.issuingCountry))
			return false;
		if (this.originalJobID == null) {
			if (other.originalJobID != null)
				return false;
		} else if (!this.originalJobID.equals(other.originalJobID))
			return false;
		if (this.preparationParty == null) {
			if (other.preparationParty != null)
				return false;
		} else if (!this.preparationParty.equals(other.preparationParty))
			return false;
		if (this.previousJobID == null) {
			if (other.previousJobID != null)
				return false;
		} else if (!this.previousJobID.equals(other.previousJobID))
			return false;
		if (this.referenceID == null) {
			if (other.referenceID != null)
				return false;
		} else if (!this.referenceID.equals(other.referenceID))
			return false;
		if (this.remarks == null) {
			if (other.remarks != null)
				return false;
		} else if (!this.remarks.equals(other.remarks))
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
		if (this.statusCode == null) {
			if (other.statusCode != null)
				return false;
		} else if (!this.statusCode.equals(other.statusCode))
			return false;
		if (this.supportingDocumentReference == null) {
			if (other.supportingDocumentReference != null)
				return false;
		} else if (!this.supportingDocumentReference.equals(other.supportingDocumentReference))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // CertificateOfOriginApplicationType