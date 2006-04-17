/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
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
 */
public interface CardAccountType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

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
	 */
	PrimaryAccountNumberIDType getPrimaryAccountNumberID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CardAccountType#getPrimaryAccountNumberID <em>Primary Account Number ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Account Number ID</em>' containment reference.
	 * @see #getPrimaryAccountNumberID()
	 */
	void setPrimaryAccountNumberID(PrimaryAccountNumberIDType value);

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
	 */
	NetworkIDType getNetworkID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CardAccountType#getNetworkID <em>Network ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network ID</em>' containment reference.
	 * @see #getNetworkID()
	 */
	void setNetworkID(NetworkIDType value);

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
	 */
	CardTypeCodeType getCardTypeCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CardAccountType#getCardTypeCode <em>Card Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Type Code</em>' containment reference.
	 * @see #getCardTypeCode()
	 */
	void setCardTypeCode(CardTypeCodeType value);

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
	 */
	ValidityStartDateType getValidityStartDate();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CardAccountType#getValidityStartDate <em>Validity Start Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validity Start Date</em>' containment reference.
	 * @see #getValidityStartDate()
	 */
	void setValidityStartDate(ValidityStartDateType value);

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
	 */
	ExpiryDateType getExpiryDate();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CardAccountType#getExpiryDate <em>Expiry Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiry Date</em>' containment reference.
	 * @see #getExpiryDate()
	 */
	void setExpiryDate(ExpiryDateType value);

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
	 */
	IssuerIDType getIssuerID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CardAccountType#getIssuerID <em>Issuer ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuer ID</em>' containment reference.
	 * @see #getIssuerID()
	 */
	void setIssuerID(IssuerIDType value);

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
	 */
	IssueNumberIDType getIssueNumberID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CardAccountType#getIssueNumberID <em>Issue Number ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Number ID</em>' containment reference.
	 * @see #getIssueNumberID()
	 */
	void setIssueNumberID(IssueNumberIDType value);

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
	 */
	CV2IDType getCV2ID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CardAccountType#getCV2ID <em>CV2ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CV2ID</em>' containment reference.
	 * @see #getCV2ID()
	 */
	void setCV2ID(CV2IDType value);

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
	 */
	ChipCodeType getChipCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CardAccountType#getChipCode <em>Chip Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chip Code</em>' containment reference.
	 * @see #getChipCode()
	 */
	void setChipCode(ChipCodeType value);

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
	 */
	ChipApplicationIDType getChipApplicationID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CardAccountType#getChipApplicationID <em>Chip Application ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chip Application ID</em>' containment reference.
	 * @see #getChipApplicationID()
	 */
	void setChipApplicationID(ChipApplicationIDType value);

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
	 */
	HolderNameType getHolderName();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CardAccountType#getHolderName <em>Holder Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Holder Name</em>' containment reference.
	 * @see #getHolderName()
	 */
	void setHolderName(HolderNameType value);

} // CardAccountType