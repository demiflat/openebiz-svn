/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.AgencyIDType;
import org.openebiz.core.common.cbc.AgencyNameType;
import org.openebiz.core.common.cbc.DescriptionType;
import org.openebiz.core.common.cbc.GUIDType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.LanguageIDType;
import org.openebiz.core.common.cbc.LastRevisionDateTimeType;
import org.openebiz.core.common.cbc.NameType;
import org.openebiz.core.common.cbc.NoteType;
import org.openebiz.core.common.cbc.SchemeURIType;
import org.openebiz.core.common.cbc.StatusCodeType;
import org.openebiz.core.common.cbc.URIType;
import org.openebiz.core.common.cbc.VersionIDType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classification Scheme Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Classification Scheme. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about Classification Scheme; a scheme that defines a taxonomy for classifying goods or services</ccts:Definition>
 *           <ccts:ObjectClass>Classification Scheme</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.ClassificationSchemeType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ClassificationSchemeType#getGUID <em>GUID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ClassificationSchemeType#getLastRevisionDateTime <em>Last Revision Date Time</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ClassificationSchemeType#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ClassificationSchemeType#getNote <em>Note</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ClassificationSchemeType#getName <em>Name</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ClassificationSchemeType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ClassificationSchemeType#getAgencyID <em>Agency ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ClassificationSchemeType#getAgencyName <em>Agency Name</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ClassificationSchemeType#getVersionID <em>Version ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ClassificationSchemeType#getURI <em>URI</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ClassificationSchemeType#getSchemeURI <em>Scheme URI</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ClassificationSchemeType#getLanguageID <em>Language ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ClassificationSchemeType#getClassificationCategory <em>Classification Category</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassificationSchemeType implements Serializable {
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
	 * The cached value of the '{@link #getID() <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected IDType iD = null;

	/**
	 * The cached value of the '{@link #getGUID() <em>GUID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGUID()
	 * @generated
	 * @ordered
	 */
	protected GUIDType gUID = null;

	/**
	 * The cached value of the '{@link #getLastRevisionDateTime() <em>Last Revision Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRevisionDateTime()
	 * @generated
	 * @ordered
	 */
	protected LastRevisionDateTimeType lastRevisionDateTime = null;

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
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected NoteType note = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected NameType name = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected DescriptionType description = null;

	/**
	 * The cached value of the '{@link #getAgencyID() <em>Agency ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgencyID()
	 * @generated
	 * @ordered
	 */
	protected AgencyIDType agencyID = null;

	/**
	 * The cached value of the '{@link #getAgencyName() <em>Agency Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgencyName()
	 * @generated
	 * @ordered
	 */
	protected AgencyNameType agencyName = null;

	/**
	 * The cached value of the '{@link #getVersionID() <em>Version ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionID()
	 * @generated
	 * @ordered
	 */
	protected VersionIDType versionID = null;

	/**
	 * The cached value of the '{@link #getURI() <em>URI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURI()
	 * @generated
	 * @ordered
	 */
	protected URIType uRI = null;

	/**
	 * The cached value of the '{@link #getSchemeURI() <em>Scheme URI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemeURI()
	 * @generated
	 * @ordered
	 */
	protected SchemeURIType schemeURI = null;

	/**
	 * The cached value of the '{@link #getLanguageID() <em>Language ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageID()
	 * @generated
	 * @ordered
	 */
	protected LanguageIDType languageID = null;

	/**
	 * The cached value of the '{@link #getClassificationCategory() <em>Classification Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationCategory()
	 * @generated
	 * @ordered
	 */
	protected List classificationCategory = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ClassificationSchemeType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.iD = this.getID();
		this.gUID = this.getGUID();
		this.lastRevisionDateTime = this.getLastRevisionDateTime();
		this.statusCode = this.getStatusCode();
		this.note = this.getNote();
		this.name = this.getName();
		this.description = this.getDescription();
		this.agencyID = this.getAgencyID();
		this.agencyName = this.getAgencyName();
		this.versionID = this.getVersionID();
		this.uRI = this.getURI();
		this.schemeURI = this.getSchemeURI();
		this.languageID = this.getLanguageID();
		this.classificationCategory = this.getClassificationCategory();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getID().getValue());
		return sdisplay.toString();
	}
	
	/**
	 * Returns the value of the '<em><b>ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Classification Scheme. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An identifier for the classification scheme</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Classification Scheme</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID</em>' containment reference.
	 * @see #setID(IDType)
	 * @generated
	 */
	public IDType getID() {
		return (iD == null) ? new IDType() : iD;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ClassificationSchemeType#getID <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' containment reference.
	 * @see #getID()
	 * @generated
	 */
	public void setID(IDType newID) {
		iD = newID;
	}

	/**
	 * Returns the value of the '<em><b>GUID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Classification Scheme. Globally Unique Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A computer-generated universally unique identifier (GUID) for the document instance.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Classification Scheme</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Globally Unique Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GUID</em>' containment reference.
	 * @see #setGUID(GUIDType)
	 * @generated
	 */
	public GUIDType getGUID() {
		return (gUID == null) ? new GUIDType() : gUID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ClassificationSchemeType#getGUID <em>GUID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GUID</em>' containment reference.
	 * @see #getGUID()
	 * @generated
	 */
	public void setGUID(GUIDType newGUID) {
		gUID = newGUID;
	}

	/**
	 * Returns the value of the '<em><b>Last Revision Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Classification Scheme. Last Revision Date Time. Date Time</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The date or date/time at which the classification scheme was last revised.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Classification Scheme</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Last Revision Date Time</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date Time</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date Time. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Revision Date Time</em>' containment reference.
	 * @see #setLastRevisionDateTime(LastRevisionDateTimeType)
	 * @generated
	 */
	public LastRevisionDateTimeType getLastRevisionDateTime() {
		return (lastRevisionDateTime == null) ? new LastRevisionDateTimeType()
				: lastRevisionDateTime;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ClassificationSchemeType#getLastRevisionDateTime <em>Last Revision Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Revision Date Time</em>' containment reference.
	 * @see #getLastRevisionDateTime()
	 * @generated
	 */
	public void setLastRevisionDateTime(
			LastRevisionDateTimeType newLastRevisionDateTime) {
		lastRevisionDateTime = newLastRevisionDateTime;
	}

	/**
	 * Returns the value of the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Classification Scheme. Status. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Identifies whether the document is an 'original', 'copy', 'revision' or  'cancellation'.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Classification Scheme</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Status</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:Examples>original'</ccts:Examples>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ClassificationSchemeType#getStatusCode <em>Status Code</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Classification Scheme. Note. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Free form text applying to the Classification Scheme. This element may contain notes or any other similar information that is not contained explicitly in another structure.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Classification Scheme</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Note</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference.
	 * @see #setNote(NoteType)
	 * @generated
	 */
	public NoteType getNote() {
		return (note == null) ? new NoteType() : note;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ClassificationSchemeType#getNote <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' containment reference.
	 * @see #getNote()
	 * @generated
	 */
	public void setNote(NoteType newNote) {
		note = newNote;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Classification Scheme. Name</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The name of the Classification Scheme</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Classification Scheme</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Name</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Name</ccts:RepresentationTerm>
	 *               <ccts:DataType>Name. Type</ccts:DataType>
	 *               <ccts:Examples>"UNSPSC"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(NameType)
	 * @generated
	 */
	public NameType getName() {
		return (name == null) ? new NameType() : name;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ClassificationSchemeType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	public void setName(NameType newName) {
		name = newName;
	}

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Classification Scheme. Description. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A description of the Classification Scheme</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Classification Scheme</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Description</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:Examples>"an open, global multi-sector standard for classification of products and services"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(DescriptionType)
	 * @generated
	 */
	public DescriptionType getDescription() {
		return (description == null) ? new DescriptionType() : description;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ClassificationSchemeType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	public void setDescription(DescriptionType newDescription) {
		description = newDescription;
	}

	/**
	 * Returns the value of the '<em><b>Agency ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Classification Scheme. Agency. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the agency that maintains the Classification Scheme</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Classification Scheme</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Agency</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:Examples>Defaults to the UN/EDIFACT data element 3055 code list.</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Agency ID</em>' containment reference.
	 * @see #setAgencyID(AgencyIDType)
	 * @generated
	 */
	public AgencyIDType getAgencyID() {
		return (agencyID == null) ? new AgencyIDType() : agencyID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ClassificationSchemeType#getAgencyID <em>Agency ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agency ID</em>' containment reference.
	 * @see #getAgencyID()
	 * @generated
	 */
	public void setAgencyID(AgencyIDType newAgencyID) {
		agencyID = newAgencyID;
	}

	/**
	 * Returns the value of the '<em><b>Agency Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Classification Scheme. Agency Name. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The name of the agency that maintains the classification scheme</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Classification Scheme</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Agency Name</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Agency Name</em>' containment reference.
	 * @see #setAgencyName(AgencyNameType)
	 * @generated
	 */
	public AgencyNameType getAgencyName() {
		return (agencyName == null) ? new AgencyNameType() : agencyName;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ClassificationSchemeType#getAgencyName <em>Agency Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agency Name</em>' containment reference.
	 * @see #getAgencyName()
	 * @generated
	 */
	public void setAgencyName(AgencyNameType newAgencyName) {
		agencyName = newAgencyName;
	}

	/**
	 * Returns the value of the '<em><b>Version ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Classification Scheme. Version. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the version of the Classification Scheme</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Classification Scheme</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Version</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version ID</em>' containment reference.
	 * @see #setVersionID(VersionIDType)
	 * @generated
	 */
	public VersionIDType getVersionID() {
		return (versionID == null) ? new VersionIDType() : versionID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ClassificationSchemeType#getVersionID <em>Version ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version ID</em>' containment reference.
	 * @see #getVersionID()
	 * @generated
	 */
	public void setVersionID(VersionIDType newVersionID) {
		versionID = newVersionID;
	}

	/**
	 * Returns the value of the '<em><b>URI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Classification Scheme. Uniform Resource Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The Uniform Resource Identifier (URI) that identifies where the classification is located</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Classification Scheme</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Uniform Resource Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>URI</em>' containment reference.
	 * @see #setURI(URIType)
	 * @generated
	 */
	public URIType getURI() {
		return (uRI == null) ? new URIType() : uRI;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ClassificationSchemeType#getURI <em>URI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URI</em>' containment reference.
	 * @see #getURI()
	 * @generated
	 */
	public void setURI(URIType newURI) {
		uRI = newURI;
	}

	/**
	 * Returns the value of the '<em><b>Scheme URI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Classification Scheme. Scheme_ Uniform Resource Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The Uniform Resource Identifier (URI) that identifies where the classification scheme is located</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Classification Scheme</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Scheme</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Uniform Resource Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scheme URI</em>' containment reference.
	 * @see #setSchemeURI(SchemeURIType)
	 * @generated
	 */
	public SchemeURIType getSchemeURI() {
		return (schemeURI == null) ? new SchemeURIType() : schemeURI;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ClassificationSchemeType#getSchemeURI <em>Scheme URI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheme URI</em>' containment reference.
	 * @see #getSchemeURI()
	 * @generated
	 */
	public void setSchemeURI(SchemeURIType newSchemeURI) {
		schemeURI = newSchemeURI;
	}

	/**
	 * Returns the value of the '<em><b>Language ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Classification Scheme. Language. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the language of the Classification Scheme</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Classification Scheme</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Language</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language ID</em>' containment reference.
	 * @see #setLanguageID(LanguageIDType)
	 * @generated
	 */
	public LanguageIDType getLanguageID() {
		return (languageID == null) ? new LanguageIDType() : languageID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ClassificationSchemeType#getLanguageID <em>Language ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language ID</em>' containment reference.
	 * @see #getLanguageID()
	 * @generated
	 */
	public void setLanguageID(LanguageIDType newLanguageID) {
		languageID = newLanguageID;
	}

	/**
	 * Returns the value of the '<em><b>Classification Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.ClassificationCategoryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Classification Scheme. Classification Category</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Classification Category</ccts:Definition>
	 *               <ccts:Cardinality>1..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Classification Scheme</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Classification Category</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Classification Category</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classification Category</em>' containment reference list.
	 * @generated
	 */
	public List getClassificationCategory() {
		if (classificationCategory == null) {
			classificationCategory = new ArrayList<
					ClassificationCategoryType>();
		}
		return classificationCategory;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.agencyID == null) ? 0 : this.agencyID.hashCode());
		result = PRIME * result + ((this.agencyName == null) ? 0 : this.agencyName.hashCode());
		result = PRIME * result + ((this.classificationCategory == null) ? 0 : this.classificationCategory.hashCode());
		result = PRIME * result + ((this.description == null) ? 0 : this.description.hashCode());
		result = PRIME * result + ((this.gUID == null) ? 0 : this.gUID.hashCode());
		result = PRIME * result + ((this.iD == null) ? 0 : this.iD.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.languageID == null) ? 0 : this.languageID.hashCode());
		result = PRIME * result + ((this.lastRevisionDateTime == null) ? 0 : this.lastRevisionDateTime.hashCode());
		result = PRIME * result + ((this.name == null) ? 0 : this.name.hashCode());
		result = PRIME * result + ((this.note == null) ? 0 : this.note.hashCode());
		result = PRIME * result + ((this.schemeURI == null) ? 0 : this.schemeURI.hashCode());
		result = PRIME * result + ((this.statusCode == null) ? 0 : this.statusCode.hashCode());
		result = PRIME * result + ((this.uRI == null) ? 0 : this.uRI.hashCode());
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
		final ClassificationSchemeType other = (ClassificationSchemeType) obj;
		if (this.agencyID == null) {
			if (other.agencyID != null)
				return false;
		} else if (!this.agencyID.equals(other.agencyID))
			return false;
		if (this.agencyName == null) {
			if (other.agencyName != null)
				return false;
		} else if (!this.agencyName.equals(other.agencyName))
			return false;
		if (this.classificationCategory == null) {
			if (other.classificationCategory != null)
				return false;
		} else if (!this.classificationCategory.equals(other.classificationCategory))
			return false;
		if (this.description == null) {
			if (other.description != null)
				return false;
		} else if (!this.description.equals(other.description))
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
		if (this.languageID == null) {
			if (other.languageID != null)
				return false;
		} else if (!this.languageID.equals(other.languageID))
			return false;
		if (this.lastRevisionDateTime == null) {
			if (other.lastRevisionDateTime != null)
				return false;
		} else if (!this.lastRevisionDateTime.equals(other.lastRevisionDateTime))
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
		if (this.schemeURI == null) {
			if (other.schemeURI != null)
				return false;
		} else if (!this.schemeURI.equals(other.schemeURI))
			return false;
		if (this.statusCode == null) {
			if (other.statusCode != null)
				return false;
		} else if (!this.statusCode.equals(other.statusCode))
			return false;
		if (this.uRI == null) {
			if (other.uRI != null)
				return false;
		} else if (!this.uRI.equals(other.uRI))
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

} // ClassificationSchemeType