/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.CalculationRateType;
import org.openebiz.core.common.cbc.DateType;
import org.openebiz.core.common.cbc.ExchangeMarketIDType;
import org.openebiz.core.common.cbc.OperatorCodeType;
import org.openebiz.core.common.cbc.SourceCurrencyBaseRateType;
import org.openebiz.core.common.cbc.SourceCurrencyCodeType;
import org.openebiz.core.common.cbc.TargetCurrencyBaseRateType;
import org.openebiz.core.common.cbc.TargetCurrencyCodeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exchange Rate Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Exchange Rate. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about Exchange Rate</ccts:Definition>
 *           <ccts:ObjectClass>Exchange Rate</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.ExchangeRateType#getSourceCurrencyCode <em>Source Currency Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ExchangeRateType#getSourceCurrencyBaseRate <em>Source Currency Base Rate</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ExchangeRateType#getTargetCurrencyCode <em>Target Currency Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ExchangeRateType#getTargetCurrencyBaseRate <em>Target Currency Base Rate</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ExchangeRateType#getExchangeMarketID <em>Exchange Market ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ExchangeRateType#getCalculationRate <em>Calculation Rate</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ExchangeRateType#getOperatorCode <em>Operator Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ExchangeRateType#getDate <em>Date</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ExchangeRateType#getForeignExchangeContract <em>Foreign Exchange Contract</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface ExchangeRateType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Source Currency Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Exchange Rate. Source_ Currency. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The reference currency for the Exchange Rate; the currency from which the exchange is being made (CC Definition)</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Exchange Rate</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Source</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Currency</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Currency_ Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Currency Code</em>' containment reference.
	 * @see #setSourceCurrencyCode(SourceCurrencyCodeType)
	 */
	SourceCurrencyCodeType getSourceCurrencyCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ExchangeRateType#getSourceCurrencyCode <em>Source Currency Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Currency Code</em>' containment reference.
	 * @see #getSourceCurrencyCode()
	 */
	void setSourceCurrencyCode(SourceCurrencyCodeType value);

	/**
	 * Returns the value of the '<em><b>Source Currency Base Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Exchange Rate. Source_ Currency Base Rate. Rate</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The unit base of the source currency for currencies with small denominations.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Exchange Rate</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Source</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Currency Base Rate</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Rate</ccts:RepresentationTerm>
	 *               <ccts:DataType>Rate. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Currency Base Rate</em>' containment reference.
	 * @see #setSourceCurrencyBaseRate(SourceCurrencyBaseRateType)
	 */
	SourceCurrencyBaseRateType getSourceCurrencyBaseRate();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ExchangeRateType#getSourceCurrencyBaseRate <em>Source Currency Base Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Currency Base Rate</em>' containment reference.
	 * @see #getSourceCurrencyBaseRate()
	 */
	void setSourceCurrencyBaseRate(SourceCurrencyBaseRateType value);

	/**
	 * Returns the value of the '<em><b>Target Currency Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Exchange Rate. Target_ Currency. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The target currency for the Exchange Rate; the currency to which the exchange is being made (CC Definition)</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Exchange Rate</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Target</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Currency</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Currency_ Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Currency Code</em>' containment reference.
	 * @see #setTargetCurrencyCode(TargetCurrencyCodeType)
	 */
	TargetCurrencyCodeType getTargetCurrencyCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ExchangeRateType#getTargetCurrencyCode <em>Target Currency Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Currency Code</em>' containment reference.
	 * @see #getTargetCurrencyCode()
	 */
	void setTargetCurrencyCode(TargetCurrencyCodeType value);

	/**
	 * Returns the value of the '<em><b>Target Currency Base Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Exchange Rate. Target_ Currency Base Rate. Rate</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The unit base of the target currency for currencies with small denominations.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Exchange Rate</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Target</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Currency Base Rate</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Rate</ccts:RepresentationTerm>
	 *               <ccts:DataType>Rate. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Currency Base Rate</em>' containment reference.
	 * @see #setTargetCurrencyBaseRate(TargetCurrencyBaseRateType)
	 */
	TargetCurrencyBaseRateType getTargetCurrencyBaseRate();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ExchangeRateType#getTargetCurrencyBaseRate <em>Target Currency Base Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Currency Base Rate</em>' containment reference.
	 * @see #getTargetCurrencyBaseRate()
	 */
	void setTargetCurrencyBaseRate(TargetCurrencyBaseRateType value);

	/**
	 * Returns the value of the '<em><b>Exchange Market ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Exchange Rate. Exchange Market Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the currency exchange market used as the source of the Exchange Rate</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Exchange Rate</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Exchange Market Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exchange Market ID</em>' containment reference.
	 * @see #setExchangeMarketID(ExchangeMarketIDType)
	 */
	ExchangeMarketIDType getExchangeMarketID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ExchangeRateType#getExchangeMarketID <em>Exchange Market ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchange Market ID</em>' containment reference.
	 * @see #getExchangeMarketID()
	 */
	void setExchangeMarketID(ExchangeMarketIDType value);

	/**
	 * Returns the value of the '<em><b>Calculation Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Exchange Rate. Calculation Rate. Rate</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The factor applied to the source currency to calculate the target currency</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Exchange Rate</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Calculation Rate</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Rate</ccts:RepresentationTerm>
	 *               <ccts:DataType>Rate. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Calculation Rate</em>' containment reference.
	 * @see #setCalculationRate(CalculationRateType)
	 */
	CalculationRateType getCalculationRate();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ExchangeRateType#getCalculationRate <em>Calculation Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculation Rate</em>' containment reference.
	 * @see #getCalculationRate()
	 */
	void setCalculationRate(CalculationRateType value);

	/**
	 * Returns the value of the '<em><b>Operator Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Exchange Rate. Operator. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An identifier for whether the Calculation Rate should be used to multiply or to divide; expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Exchange Rate</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Operator</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operator Code</em>' containment reference.
	 * @see #setOperatorCode(OperatorCodeType)
	 */
	OperatorCodeType getOperatorCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ExchangeRateType#getOperatorCode <em>Operator Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator Code</em>' containment reference.
	 * @see #getOperatorCode()
	 */
	void setOperatorCode(OperatorCodeType value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Exchange Rate. Date</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The date of the Exchange</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Exchange Rate</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Date</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateType)
	 */
	DateType getDate();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ExchangeRateType#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 */
	void setDate(DateType value);

	/**
	 * Returns the value of the '<em><b>Foreign Exchange Contract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Exchange Rate. Foreign Exchange_ Contract. Contract</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Foreign Exchange Contract</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Exchange Rate</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Foreign Exchange</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Contract</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Contract</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Foreign Exchange Contract</em>' containment reference.
	 * @see #setForeignExchangeContract(ContractType)
	 */
	ContractType getForeignExchangeContract();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ExchangeRateType#getForeignExchangeContract <em>Foreign Exchange Contract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Exchange Contract</em>' containment reference.
	 * @see #getForeignExchangeContract()
	 */
	void setForeignExchangeContract(ContractType value);

} // ExchangeRateType