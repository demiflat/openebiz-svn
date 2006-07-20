/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.LogoReferenceIDType;
import org.openebiz.core.common.cbc.MarkAttentionIndicatorType;
import org.openebiz.core.common.cbc.MarkCareIndicatorType;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Party. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about an organisation, sub-organisation or individual fulfilling a role in a business process</ccts:Definition>
 *           <ccts:ObjectClass>Party</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.PartyType#getMarkCareIndicator <em>Mark Care Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PartyType#getMarkAttentionIndicator <em>Mark Attention Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PartyType#getLogoReferenceID <em>Logo Reference ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PartyType#getPartyIdentification <em>Party Identification</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PartyType#getPartyName <em>Party Name</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PartyType#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PartyType#getAddress <em>Address</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PartyType#getPartyTaxScheme <em>Party Tax Scheme</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PartyType#getPartyLegalEntity <em>Party Legal Entity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PartyType#getContact <em>Contact</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PartyType#getPerson <em>Person</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PartyType#getAgentParty <em>Agent Party</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartyType implements Serializable {
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
	 * The cached value of the '{@link #getMarkCareIndicator() <em>Mark Care Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkCareIndicator()
	 * @generated
	 * @ordered
	 */
	protected MarkCareIndicatorType markCareIndicator = null;

	/**
	 * The cached value of the '{@link #getMarkAttentionIndicator() <em>Mark Attention Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkAttentionIndicator()
	 * @generated
	 * @ordered
	 */
	protected MarkAttentionIndicatorType markAttentionIndicator = null;

	/**
	 * The cached value of the '{@link #getLogoReferenceID() <em>Logo Reference ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogoReferenceID()
	 * @generated
	 * @ordered
	 */
	protected LogoReferenceIDType logoReferenceID = null;

	/**
	 * The cached value of the '{@link #getPartyIdentification() <em>Party Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdentification()
	 * @generated
	 * @ordered
	 */
	protected List partyIdentification = null;

	/**
	 * The cached value of the '{@link #getPartyName() <em>Party Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyName()
	 * @generated
	 * @ordered
	 */
	protected List partyName = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected LanguageType language = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected AddressType address = null;

	/**
	 * The cached value of the '{@link #getPartyTaxScheme() <em>Party Tax Scheme</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyTaxScheme()
	 * @generated
	 * @ordered
	 */
	protected List partyTaxScheme = null;

	/**
	 * The cached value of the '{@link #getPartyLegalEntity() <em>Party Legal Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyLegalEntity()
	 * @generated
	 * @ordered
	 */
	protected List partyLegalEntity = null;

	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected ContactType contact = null;

	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected PersonType person = null;

	/**
	 * The cached value of the '{@link #getAgentParty() <em>Agent Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgentParty()
	 * @generated
	 * @ordered
	 */
	protected PartyType agentParty = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public PartyType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.markCareIndicator = this.getMarkCareIndicator();
		this.markAttentionIndicator = this.getMarkAttentionIndicator();
		this.logoReferenceID = this.getLogoReferenceID();
		this.partyIdentification = this.getPartyIdentification();
		this.partyName = this.getPartyName();
		this.language = this.getLanguage();
		this.address = this.getAddress();
		this.partyTaxScheme = this.getPartyTaxScheme();
		this.partyLegalEntity = this.getPartyLegalEntity();
		this.contact = this.getContact();
		this.person = this.getPerson();
		//this.agentParty = this.getAgentParty();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		// TODO: short party type display
		int size = 0;
		for(Iterator iter = this.getPartyName().iterator(); iter.hasNext(); ) {
			PartyNameType party = (PartyNameType) iter.next();
			sdisplay.append(party.getShortDisplay());
			if( size++ < this.getPartyName().size()) {
				sdisplay.append(", ");				
			}
		}
		return sdisplay.toString();
	}
	
	/**
	 * Returns the value of the '<em><b>Mark Care Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Party. Mark Care Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Indicates whether a party is C/O (care of)</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Mark Care Indicator</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mark Care Indicator</em>' containment reference.
	 * @see #setMarkCareIndicator(MarkCareIndicatorType)
	 * @generated
	 */
	public MarkCareIndicatorType getMarkCareIndicator() {
		return (markCareIndicator == null) ? new MarkCareIndicatorType()
				: markCareIndicator;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PartyType#getMarkCareIndicator <em>Mark Care Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mark Care Indicator</em>' containment reference.
	 * @see #getMarkCareIndicator()
	 * @generated
	 */
	public void setMarkCareIndicator(MarkCareIndicatorType newMarkCareIndicator) {
		markCareIndicator = newMarkCareIndicator;
	}

	/**
	 * Returns the value of the '<em><b>Mark Attention Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Party. Mark Attention Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Indicates whether a party is 'FAO' (for the attention of)</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Mark Attention Indicator</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mark Attention Indicator</em>' containment reference.
	 * @see #setMarkAttentionIndicator(MarkAttentionIndicatorType)
	 * @generated
	 */
	public MarkAttentionIndicatorType getMarkAttentionIndicator() {
		return (markAttentionIndicator == null) ? new MarkAttentionIndicatorType()
				: markAttentionIndicator;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PartyType#getMarkAttentionIndicator <em>Mark Attention Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mark Attention Indicator</em>' containment reference.
	 * @see #getMarkAttentionIndicator()
	 * @generated
	 */
	public void setMarkAttentionIndicator(
			MarkAttentionIndicatorType newMarkAttentionIndicator) {
		markAttentionIndicator = newMarkAttentionIndicator;
	}

	/**
	 * Returns the value of the '<em><b>Logo Reference ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Party. Logo Reference. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A Party's logo</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Logo Reference</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:Examples>http://www2.coca-cola.com/images/logo.gif</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Logo Reference ID</em>' containment reference.
	 * @see #setLogoReferenceID(LogoReferenceIDType)
	 * @generated
	 */
	public LogoReferenceIDType getLogoReferenceID() {
		return (logoReferenceID == null) ? new LogoReferenceIDType()
				: logoReferenceID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PartyType#getLogoReferenceID <em>Logo Reference ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logo Reference ID</em>' containment reference.
	 * @see #getLogoReferenceID()
	 * @generated
	 */
	public void setLogoReferenceID(LogoReferenceIDType newLogoReferenceID) {
		logoReferenceID = newLogoReferenceID;
	}

	/**
	 * Returns the value of the '<em><b>Party Identification</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.PartyIdentificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Party. Party Identification</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Party Identification</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Party Identification</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party Identification</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Party Identification</em>' containment reference list.
	 * @generated
	 */
	public List getPartyIdentification() {
		if (partyIdentification == null) {
			partyIdentification = new ArrayList<
					PartyIdentificationType>();
		}
		return partyIdentification;
	}

	/**
	 * Returns the value of the '<em><b>Party Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.PartyNameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Party. Party Name</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Party Name</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Party Name</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party Name</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Party Name</em>' containment reference list.
	 * @generated
	 */
	public List getPartyName() {
		if (partyName == null) {
			partyName = new ArrayList<PartyNameType>();
		}
		return partyName;
	}

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Party. Language</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Language</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Language</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Language</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' containment reference.
	 * @see #setLanguage(LanguageType)
	 * @generated
	 */
	public LanguageType getLanguage() {
		return (language == null) ? new LanguageType() : language;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PartyType#getLanguage <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' containment reference.
	 * @see #getLanguage()
	 * @generated
	 */
	public void setLanguage(LanguageType newLanguage) {
		language = newLanguage;
	}

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Party. Address</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Address</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Address</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Address</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(AddressType)
	 * @generated
	 */
	public AddressType getAddress() {
		return (address == null) ? new AddressType() : address;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PartyType#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	public void setAddress(AddressType newAddress) {
		address = newAddress;
	}

	/**
	 * Returns the value of the '<em><b>Party Tax Scheme</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.PartyTaxSchemeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Party. Party Tax Scheme</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Party Tax Scheme</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Party Tax Scheme</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party Tax Scheme</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Party Tax Scheme</em>' containment reference list.
	 * @generated
	 */
	public List getPartyTaxScheme() {
		if (partyTaxScheme == null) {
			partyTaxScheme = new ArrayList<PartyTaxSchemeType>();
		}
		return partyTaxScheme;
	}

	/**
	 * Returns the value of the '<em><b>Party Legal Entity</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.PartyLegalEntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Party. Party Legal Entity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Party Legal Entity</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Party Legal Entity</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party Legal Entity</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Party Legal Entity</em>' containment reference list.
	 * @generated
	 */
	public List getPartyLegalEntity() {
		if (partyLegalEntity == null) {
			partyLegalEntity = new ArrayList<
					PartyLegalEntityType>();
		}
		return partyLegalEntity;
	}

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Party. Contact</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Contact</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Contact</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Contact</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference.
	 * @see #setContact(ContactType)
	 * @generated
	 */
	public ContactType getContact() {
		return (contact == null) ? new ContactType() : contact;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PartyType#getContact <em>Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact</em>' containment reference.
	 * @see #getContact()
	 * @generated
	 */
	public void setContact(ContactType newContact) {
		contact = newContact;
	}

	/**
	 * Returns the value of the '<em><b>Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Party. Person</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to a Person.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Person</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Person</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person</em>' containment reference.
	 * @see #setPerson(PersonType)
	 * @generated
	 */
	public PersonType getPerson() {
		return (person == null) ? new PersonType() : person;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PartyType#getPerson <em>Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' containment reference.
	 * @see #getPerson()
	 * @generated
	 */
	public void setPerson(PersonType newPerson) {
		person = newPerson;
	}

	/**
	 * Returns the value of the '<em><b>Agent Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Party. Agent_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to another Party who acts as an agent for this Party.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Party</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Agent</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *               <ccts:Examples>Customs Broker</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Agent Party</em>' containment reference.
	 * @see #setAgentParty(PartyType)
	 * @generated
	 */
	public PartyType getAgentParty() {
		//return (agentParty == null) ? new PartyType() : agentParty;
			if (this.agentParty == null){
				this.agentParty = new PartyType();
			}
		return this.agentParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PartyType#getAgentParty <em>Agent Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent Party</em>' containment reference.
	 * @see #getAgentParty()
	 * @generated
	 */
	public void setAgentParty(PartyType newAgentParty) {
		agentParty = newAgentParty;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.address == null) ? 0 : this.address.hashCode());
		result = PRIME * result + ((this.agentParty == null) ? 0 : this.agentParty.hashCode());
		result = PRIME * result + ((this.contact == null) ? 0 : this.contact.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.language == null) ? 0 : this.language.hashCode());
		result = PRIME * result + ((this.logoReferenceID == null) ? 0 : this.logoReferenceID.hashCode());
		result = PRIME * result + ((this.markAttentionIndicator == null) ? 0 : this.markAttentionIndicator.hashCode());
		result = PRIME * result + ((this.markCareIndicator == null) ? 0 : this.markCareIndicator.hashCode());
		result = PRIME * result + ((this.partyIdentification == null) ? 0 : this.partyIdentification.hashCode());
		result = PRIME * result + ((this.partyLegalEntity == null) ? 0 : this.partyLegalEntity.hashCode());
		result = PRIME * result + ((this.partyName == null) ? 0 : this.partyName.hashCode());
		result = PRIME * result + ((this.partyTaxScheme == null) ? 0 : this.partyTaxScheme.hashCode());
		result = PRIME * result + ((this.person == null) ? 0 : this.person.hashCode());
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
		final PartyType other = (PartyType) obj;
		if (this.address == null) {
			if (other.address != null)
				return false;
		} else if (!this.address.equals(other.address))
			return false;
		if (this.agentParty == null) {
			if (other.agentParty != null)
				return false;
		} else if (!this.agentParty.equals(other.agentParty))
			return false;
		if (this.contact == null) {
			if (other.contact != null)
				return false;
		} else if (!this.contact.equals(other.contact))
			return false;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.language == null) {
			if (other.language != null)
				return false;
		} else if (!this.language.equals(other.language))
			return false;
		if (this.logoReferenceID == null) {
			if (other.logoReferenceID != null)
				return false;
		} else if (!this.logoReferenceID.equals(other.logoReferenceID))
			return false;
		if (this.markAttentionIndicator == null) {
			if (other.markAttentionIndicator != null)
				return false;
		} else if (!this.markAttentionIndicator.equals(other.markAttentionIndicator))
			return false;
		if (this.markCareIndicator == null) {
			if (other.markCareIndicator != null)
				return false;
		} else if (!this.markCareIndicator.equals(other.markCareIndicator))
			return false;
		if (this.partyIdentification == null) {
			if (other.partyIdentification != null)
				return false;
		} else if (!this.partyIdentification.equals(other.partyIdentification))
			return false;
		if (this.partyLegalEntity == null) {
			if (other.partyLegalEntity != null)
				return false;
		} else if (!this.partyLegalEntity.equals(other.partyLegalEntity))
			return false;
		if (this.partyName == null) {
			if (other.partyName != null)
				return false;
		} else if (!this.partyName.equals(other.partyName))
			return false;
		if (this.partyTaxScheme == null) {
			if (other.partyTaxScheme != null)
				return false;
		} else if (!this.partyTaxScheme.equals(other.partyTaxScheme))
			return false;
		if (this.person == null) {
			if (other.person != null)
				return false;
		} else if (!this.person.equals(other.person))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // PartyType