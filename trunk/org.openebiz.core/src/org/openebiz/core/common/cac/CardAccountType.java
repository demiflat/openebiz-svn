/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.CV2IDType;
import org.openebiz.core.common.cbc.CardTypeCodeType;
import org.openebiz.core.common.cbc.ChipApplicationIDType;
import org.openebiz.core.common.cbc.ChipCodeType;
import org.openebiz.core.common.cbc.ExpiryDateType;
import org.openebiz.core.common.cbc.HolderNameType;
import org.openebiz.core.common.cbc.IssueNumberIDType;
import org.openebiz.core.common.cbc.IssuerIDType;
import org.openebiz.core.common.cbc.NetworkIDType;
import org.openebiz.core.common.cbc.PrimaryAccountNumberIDType;
import org.openebiz.core.common.cbc.ValidityStartDateType;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card Account Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Card Account. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about a credit card, debit card or charge card</ccts:Definition>
 *           <ccts:ObjectClass>Card Account</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.CardAccountType#getPrimaryAccountNumberID <em>Primary Account Number ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CardAccountType#getNetworkID <em>Network ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CardAccountType#getCardTypeCode <em>Card Type Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CardAccountType#getValidityStartDate <em>Validity Start Date</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CardAccountType#getExpiryDate <em>Expiry Date</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CardAccountType#getIssuerID <em>Issuer ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CardAccountType#getIssueNumberID <em>Issue Number ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CardAccountType#getCV2ID <em>CV2ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CardAccountType#getChipCode <em>Chip Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CardAccountType#getChipApplicationID <em>Chip Application ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CardAccountType#getHolderName <em>Holder Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CardAccountType implements Serializable {
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
	 * The cached value of the '{@link #getPrimaryAccountNumberID() <em>Primary Account Number ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryAccountNumberID()
	 * @generated
	 * @ordered
	 */
	protected PrimaryAccountNumberIDType primaryAccountNumberID = null;

	/**
	 * The cached value of the '{@link #getNetworkID() <em>Network ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkID()
	 * @generated
	 * @ordered
	 */
	protected NetworkIDType networkID = null;

	/**
	 * The cached value of the '{@link #getCardTypeCode() <em>Card Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardTypeCode()
	 * @generated
	 * @ordered
	 */
	protected CardTypeCodeType cardTypeCode = null;

	/**
	 * The cached value of the '{@link #getValidityStartDate() <em>Validity Start Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidityStartDate()
	 * @generated
	 * @ordered
	 */
	protected ValidityStartDateType validityStartDate = null;

	/**
	 * The cached value of the '{@link #getExpiryDate() <em>Expiry Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiryDate()
	 * @generated
	 * @ordered
	 */
	protected ExpiryDateType expiryDate = null;

	/**
	 * The cached value of the '{@link #getIssuerID() <em>Issuer ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuerID()
	 * @generated
	 * @ordered
	 */
	protected IssuerIDType issuerID = null;

	/**
	 * The cached value of the '{@link #getIssueNumberID() <em>Issue Number ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueNumberID()
	 * @generated
	 * @ordered
	 */
	protected IssueNumberIDType issueNumberID = null;

	/**
	 * The cached value of the '{@link #getCV2ID() <em>CV2ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCV2ID()
	 * @generated
	 * @ordered
	 */
	protected CV2IDType cV2ID = null;

	/**
	 * The cached value of the '{@link #getChipCode() <em>Chip Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChipCode()
	 * @generated
	 * @ordered
	 */
	protected ChipCodeType chipCode = null;

	/**
	 * The cached value of the '{@link #getChipApplicationID() <em>Chip Application ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChipApplicationID()
	 * @generated
	 * @ordered
	 */
	protected ChipApplicationIDType chipApplicationID = null;

	/**
	 * The cached value of the '{@link #getHolderName() <em>Holder Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHolderName()
	 * @generated
	 * @ordered
	 */
	protected HolderNameType holderName = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public CardAccountType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.primaryAccountNumberID = this.getPrimaryAccountNumberID();
		this.networkID = this.getNetworkID();
		this.cardTypeCode = this.getCardTypeCode();
		this.validityStartDate = this.getValidityStartDate();
		this.expiryDate = this.getExpiryDate();
		this.issuerID = this.getIssuerID();
		this.issueNumberID = this.getIssueNumberID();
		this.cV2ID = this.getCV2ID();
		this.chipCode = this.getChipCode();
		this.chipApplicationID = this.getChipApplicationID();
		this.holderName = this.getHolderName();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getCardTypeCode().getValue());
		return sdisplay.toString();
	}
	
	/**
	 * Returns the value of the '<em><b>Primary Account Number ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Card Account. Primary_ Account Number. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The card number; the Primary Account Number (PAN)</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Card Account</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Primary</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Account Number</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:Examples>4558 0167 3488 1234</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Primary Account Number ID</em>' containment reference.
	 * @see #setPrimaryAccountNumberID(PrimaryAccountNumberIDType)
	 * @generated
	 */
	public PrimaryAccountNumberIDType getPrimaryAccountNumberID() {
		return (primaryAccountNumberID == null) ? new PrimaryAccountNumberIDType()
				: primaryAccountNumberID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CardAccountType#getPrimaryAccountNumberID <em>Primary Account Number ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Account Number ID</em>' containment reference.
	 * @see #getPrimaryAccountNumberID()
	 * @generated
	 */
	public void setPrimaryAccountNumberID(
			PrimaryAccountNumberIDType newPrimaryAccountNumberID) {
		primaryAccountNumberID = newPrimaryAccountNumberID;
	}

	/**
	 * Returns the value of the '<em><b>Network ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Card Account. Network. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The card network provider</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Card Account</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Network</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:Examples>“VISA”, “MasterCard”, “American Express”</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Network ID</em>' containment reference.
	 * @see #setNetworkID(NetworkIDType)
	 * @generated
	 */
	public NetworkIDType getNetworkID() {
		return (networkID == null) ? new NetworkIDType() : networkID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CardAccountType#getNetworkID <em>Network ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network ID</em>' containment reference.
	 * @see #getNetworkID()
	 * @generated
	 */
	public void setNetworkID(NetworkIDType newNetworkID) {
		networkID = newNetworkID;
	}

	/**
	 * Returns the value of the '<em><b>Card Type Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Card Account. Card Type. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The type of card</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Card Account</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Card Type</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:Examples>“Debit Card”, “Credit Card”, “Procurement Card”</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Card Type Code</em>' containment reference.
	 * @see #setCardTypeCode(CardTypeCodeType)
	 * @generated
	 */
	public CardTypeCodeType getCardTypeCode() {
		return (cardTypeCode == null) ? new CardTypeCodeType() : cardTypeCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CardAccountType#getCardTypeCode <em>Card Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Type Code</em>' containment reference.
	 * @see #getCardTypeCode()
	 * @generated
	 */
	public void setCardTypeCode(CardTypeCodeType newCardTypeCode) {
		cardTypeCode = newCardTypeCode;
	}

	/**
	 * Returns the value of the '<em><b>Validity Start Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Card Account. Validity Start Date. Date</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The date from which the card is valid</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Card Account</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Validity Start Date</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validity Start Date</em>' containment reference.
	 * @see #setValidityStartDate(ValidityStartDateType)
	 * @generated
	 */
	public ValidityStartDateType getValidityStartDate() {
		return (validityStartDate == null) ? new ValidityStartDateType()
				: validityStartDate;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CardAccountType#getValidityStartDate <em>Validity Start Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validity Start Date</em>' containment reference.
	 * @see #getValidityStartDate()
	 * @generated
	 */
	public void setValidityStartDate(ValidityStartDateType newValidityStartDate) {
		validityStartDate = newValidityStartDate;
	}

	/**
	 * Returns the value of the '<em><b>Expiry Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Card Account. Expiry Date. Date</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The date up to which the card is valid</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Card Account</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Expiry Date</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expiry Date</em>' containment reference.
	 * @see #setExpiryDate(ExpiryDateType)
	 * @generated
	 */
	public ExpiryDateType getExpiryDate() {
		return (expiryDate == null) ? new ExpiryDateType() : expiryDate;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CardAccountType#getExpiryDate <em>Expiry Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiry Date</em>' containment reference.
	 * @see #getExpiryDate()
	 * @generated
	 */
	public void setExpiryDate(ExpiryDateType newExpiryDate) {
		expiryDate = newExpiryDate;
	}

	/**
	 * Returns the value of the '<em><b>Issuer ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Card Account. Issuer. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the card issuer: the Bank Identification Number (BIN)</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Card Account</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Issuer</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issuer ID</em>' containment reference.
	 * @see #setIssuerID(IssuerIDType)
	 * @generated
	 */
	public IssuerIDType getIssuerID() {
		return (issuerID == null) ? new IssuerIDType() : issuerID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CardAccountType#getIssuerID <em>Issuer ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuer ID</em>' containment reference.
	 * @see #getIssuerID()
	 * @generated
	 */
	public void setIssuerID(IssuerIDType newIssuerID) {
		issuerID = newIssuerID;
	}

	/**
	 * Returns the value of the '<em><b>Issue Number ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Card Account. Issue Number. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The card issue number</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Card Account</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Issue Number</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue Number ID</em>' containment reference.
	 * @see #setIssueNumberID(IssueNumberIDType)
	 * @generated
	 */
	public IssueNumberIDType getIssueNumberID() {
		return (issueNumberID == null) ? new IssueNumberIDType()
				: issueNumberID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CardAccountType#getIssueNumberID <em>Issue Number ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Number ID</em>' containment reference.
	 * @see #getIssueNumberID()
	 * @generated
	 */
	public void setIssueNumberID(IssueNumberIDType newIssueNumberID) {
		issueNumberID = newIssueNumberID;
	}

	/**
	 * Returns the value of the '<em><b>CV2ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Card Account. CV2. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The Card Verification Value (number on reverse of card)</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Card Account</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>CV2</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CV2ID</em>' containment reference.
	 * @see #setCV2ID(CV2IDType)
	 * @generated
	 */
	public CV2IDType getCV2ID() {
		return (cV2ID == null) ? new CV2IDType() : cV2ID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CardAccountType#getCV2ID <em>CV2ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CV2ID</em>' containment reference.
	 * @see #getCV2ID()
	 * @generated
	 */
	public void setCV2ID(CV2IDType newCV2ID) {
		cV2ID = newCV2ID;
	}

	/**
	 * Returns the value of the '<em><b>Chip Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Card Account. Chip. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The distinction between CHIP and MAG STRIPE cards</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Card Account</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Chip</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Chip Code</em>' containment reference.
	 * @see #setChipCode(ChipCodeType)
	 * @generated
	 */
	public ChipCodeType getChipCode() {
		return (chipCode == null) ? new ChipCodeType() : chipCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CardAccountType#getChipCode <em>Chip Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chip Code</em>' containment reference.
	 * @see #getChipCode()
	 * @generated
	 */
	public void setChipCode(ChipCodeType newChipCode) {
		chipCode = newChipCode;
	}

	/**
	 * Returns the value of the '<em><b>Chip Application ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Card Account. Chip Application. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An identifier for the application (AID) on a chip card that provides the information quoted</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Card Account</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Chip Application</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Chip Application ID</em>' containment reference.
	 * @see #setChipApplicationID(ChipApplicationIDType)
	 * @generated
	 */
	public ChipApplicationIDType getChipApplicationID() {
		return (chipApplicationID == null) ? new ChipApplicationIDType()
				: chipApplicationID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CardAccountType#getChipApplicationID <em>Chip Application ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chip Application ID</em>' containment reference.
	 * @see #getChipApplicationID()
	 * @generated
	 */
	public void setChipApplicationID(ChipApplicationIDType newChipApplicationID) {
		chipApplicationID = newChipApplicationID;
	}

	/**
	 * Returns the value of the '<em><b>Holder Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Card Account. Holder. Name</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The name of the cardholder</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Card Account</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Holder</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Name</ccts:RepresentationTerm>
	 *               <ccts:DataType>Name. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Holder Name</em>' containment reference.
	 * @see #setHolderName(HolderNameType)
	 * @generated
	 */
	public HolderNameType getHolderName() {
		return (holderName == null) ? new HolderNameType() : holderName;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CardAccountType#getHolderName <em>Holder Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Holder Name</em>' containment reference.
	 * @see #getHolderName()
	 * @generated
	 */
	public void setHolderName(HolderNameType newHolderName) {
		holderName = newHolderName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.cV2ID == null) ? 0 : this.cV2ID.hashCode());
		result = PRIME * result + ((this.cardTypeCode == null) ? 0 : this.cardTypeCode.hashCode());
		result = PRIME * result + ((this.chipApplicationID == null) ? 0 : this.chipApplicationID.hashCode());
		result = PRIME * result + ((this.chipCode == null) ? 0 : this.chipCode.hashCode());
		result = PRIME * result + ((this.expiryDate == null) ? 0 : this.expiryDate.hashCode());
		result = PRIME * result + ((this.holderName == null) ? 0 : this.holderName.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.issueNumberID == null) ? 0 : this.issueNumberID.hashCode());
		result = PRIME * result + ((this.issuerID == null) ? 0 : this.issuerID.hashCode());
		result = PRIME * result + ((this.networkID == null) ? 0 : this.networkID.hashCode());
		result = PRIME * result + ((this.primaryAccountNumberID == null) ? 0 : this.primaryAccountNumberID.hashCode());
		result = PRIME * result + ((this.validityStartDate == null) ? 0 : this.validityStartDate.hashCode());
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
		final CardAccountType other = (CardAccountType) obj;
		if (this.cV2ID == null) {
			if (other.cV2ID != null)
				return false;
		} else if (!this.cV2ID.equals(other.cV2ID))
			return false;
		if (this.cardTypeCode == null) {
			if (other.cardTypeCode != null)
				return false;
		} else if (!this.cardTypeCode.equals(other.cardTypeCode))
			return false;
		if (this.chipApplicationID == null) {
			if (other.chipApplicationID != null)
				return false;
		} else if (!this.chipApplicationID.equals(other.chipApplicationID))
			return false;
		if (this.chipCode == null) {
			if (other.chipCode != null)
				return false;
		} else if (!this.chipCode.equals(other.chipCode))
			return false;
		if (this.expiryDate == null) {
			if (other.expiryDate != null)
				return false;
		} else if (!this.expiryDate.equals(other.expiryDate))
			return false;
		if (this.holderName == null) {
			if (other.holderName != null)
				return false;
		} else if (!this.holderName.equals(other.holderName))
			return false;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.issueNumberID == null) {
			if (other.issueNumberID != null)
				return false;
		} else if (!this.issueNumberID.equals(other.issueNumberID))
			return false;
		if (this.issuerID == null) {
			if (other.issuerID != null)
				return false;
		} else if (!this.issuerID.equals(other.issuerID))
			return false;
		if (this.networkID == null) {
			if (other.networkID != null)
				return false;
		} else if (!this.networkID.equals(other.networkID))
			return false;
		if (this.primaryAccountNumberID == null) {
			if (other.primaryAccountNumberID != null)
				return false;
		} else if (!this.primaryAccountNumberID.equals(other.primaryAccountNumberID))
			return false;
		if (this.validityStartDate == null) {
			if (other.validityStartDate != null)
				return false;
		} else if (!this.validityStartDate.equals(other.validityStartDate))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // CardAccountType