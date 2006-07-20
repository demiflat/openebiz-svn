/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
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
import java.io.Serializable;

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
 * @generated
 */
public class ExchangeRateType implements Serializable {
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
	 * The cached value of the '{@link #getSourceCurrencyCode() <em>Source Currency Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCurrencyCode()
	 * @generated
	 * @ordered
	 */
	protected SourceCurrencyCodeType sourceCurrencyCode = null;

	/**
	 * The cached value of the '{@link #getSourceCurrencyBaseRate() <em>Source Currency Base Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCurrencyBaseRate()
	 * @generated
	 * @ordered
	 */
	protected SourceCurrencyBaseRateType sourceCurrencyBaseRate = null;

	/**
	 * The cached value of the '{@link #getTargetCurrencyCode() <em>Target Currency Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCurrencyCode()
	 * @generated
	 * @ordered
	 */
	protected TargetCurrencyCodeType targetCurrencyCode = null;

	/**
	 * The cached value of the '{@link #getTargetCurrencyBaseRate() <em>Target Currency Base Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCurrencyBaseRate()
	 * @generated
	 * @ordered
	 */
	protected TargetCurrencyBaseRateType targetCurrencyBaseRate = null;

	/**
	 * The cached value of the '{@link #getExchangeMarketID() <em>Exchange Market ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangeMarketID()
	 * @generated
	 * @ordered
	 */
	protected ExchangeMarketIDType exchangeMarketID = null;

	/**
	 * The cached value of the '{@link #getCalculationRate() <em>Calculation Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculationRate()
	 * @generated
	 * @ordered
	 */
	protected CalculationRateType calculationRate = null;

	/**
	 * The cached value of the '{@link #getOperatorCode() <em>Operator Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatorCode()
	 * @generated
	 * @ordered
	 */
	protected OperatorCodeType operatorCode = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateType date = null;

	/**
	 * The cached value of the '{@link #getForeignExchangeContract() <em>Foreign Exchange Contract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignExchangeContract()
	 * @generated
	 * @ordered
	 */
	protected ContractType foreignExchangeContract = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ExchangeRateType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.sourceCurrencyCode = this.getSourceCurrencyCode();
		this.sourceCurrencyBaseRate = this.getSourceCurrencyBaseRate();
		this.targetCurrencyCode = this.getTargetCurrencyCode();
		this.targetCurrencyBaseRate = this.getTargetCurrencyBaseRate();
		this.exchangeMarketID = this.getExchangeMarketID();
		this.calculationRate = this.getCalculationRate();
		this.operatorCode = this.getOperatorCode();
		this.date = this.getDate();
		this.foreignExchangeContract = this.getForeignExchangeContract();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getSourceCurrencyBaseRate().getValue().toPlainString());
		sdisplay.append(" / ");
		sdisplay.append(this.getTargetCurrencyBaseRate().getValue().toPlainString());
		return sdisplay.toString();
	}
	
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
	 * @generated
	 */
	public SourceCurrencyCodeType getSourceCurrencyCode() {
		return (sourceCurrencyCode == null) ? new SourceCurrencyCodeType()
				: sourceCurrencyCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ExchangeRateType#getSourceCurrencyCode <em>Source Currency Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Currency Code</em>' containment reference.
	 * @see #getSourceCurrencyCode()
	 * @generated
	 */
	public void setSourceCurrencyCode(
			SourceCurrencyCodeType newSourceCurrencyCode) {
		sourceCurrencyCode = newSourceCurrencyCode;
	}

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
	 * @generated
	 */
	public SourceCurrencyBaseRateType getSourceCurrencyBaseRate() {
		return (sourceCurrencyBaseRate == null) ? new SourceCurrencyBaseRateType()
				: sourceCurrencyBaseRate;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ExchangeRateType#getSourceCurrencyBaseRate <em>Source Currency Base Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Currency Base Rate</em>' containment reference.
	 * @see #getSourceCurrencyBaseRate()
	 * @generated
	 */
	public void setSourceCurrencyBaseRate(
			SourceCurrencyBaseRateType newSourceCurrencyBaseRate) {
		sourceCurrencyBaseRate = newSourceCurrencyBaseRate;
	}

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
	 * @generated
	 */
	public TargetCurrencyCodeType getTargetCurrencyCode() {
		return (targetCurrencyCode == null) ? new TargetCurrencyCodeType()
				: targetCurrencyCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ExchangeRateType#getTargetCurrencyCode <em>Target Currency Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Currency Code</em>' containment reference.
	 * @see #getTargetCurrencyCode()
	 * @generated
	 */
	public void setTargetCurrencyCode(
			TargetCurrencyCodeType newTargetCurrencyCode) {
		targetCurrencyCode = newTargetCurrencyCode;
	}

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
	 * @generated
	 */
	public TargetCurrencyBaseRateType getTargetCurrencyBaseRate() {
		return (targetCurrencyBaseRate == null) ? new TargetCurrencyBaseRateType()
				: targetCurrencyBaseRate;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ExchangeRateType#getTargetCurrencyBaseRate <em>Target Currency Base Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Currency Base Rate</em>' containment reference.
	 * @see #getTargetCurrencyBaseRate()
	 * @generated
	 */
	public void setTargetCurrencyBaseRate(
			TargetCurrencyBaseRateType newTargetCurrencyBaseRate) {
		targetCurrencyBaseRate = newTargetCurrencyBaseRate;
	}

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
	 * @generated
	 */
	public ExchangeMarketIDType getExchangeMarketID() {
		return (exchangeMarketID == null) ? new ExchangeMarketIDType()
				: exchangeMarketID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ExchangeRateType#getExchangeMarketID <em>Exchange Market ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchange Market ID</em>' containment reference.
	 * @see #getExchangeMarketID()
	 * @generated
	 */
	public void setExchangeMarketID(ExchangeMarketIDType newExchangeMarketID) {
		exchangeMarketID = newExchangeMarketID;
	}

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
	 * @generated
	 */
	public CalculationRateType getCalculationRate() {
		return (calculationRate == null) ? new CalculationRateType()
				: calculationRate;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ExchangeRateType#getCalculationRate <em>Calculation Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculation Rate</em>' containment reference.
	 * @see #getCalculationRate()
	 * @generated
	 */
	public void setCalculationRate(CalculationRateType newCalculationRate) {
		calculationRate = newCalculationRate;
	}

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
	 * @generated
	 */
	public OperatorCodeType getOperatorCode() {
		return (operatorCode == null) ? new OperatorCodeType() : operatorCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ExchangeRateType#getOperatorCode <em>Operator Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator Code</em>' containment reference.
	 * @see #getOperatorCode()
	 * @generated
	 */
	public void setOperatorCode(OperatorCodeType newOperatorCode) {
		operatorCode = newOperatorCode;
	}

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
	 * @generated
	 */
	public DateType getDate() {
		return (date == null) ? new DateType() : date;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ExchangeRateType#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	public void setDate(DateType newDate) {
		date = newDate;
	}

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
	 * @generated
	 */
	public ContractType getForeignExchangeContract() {
		return (foreignExchangeContract == null) ? new ContractType()
				: foreignExchangeContract;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ExchangeRateType#getForeignExchangeContract <em>Foreign Exchange Contract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Exchange Contract</em>' containment reference.
	 * @see #getForeignExchangeContract()
	 * @generated
	 */
	public void setForeignExchangeContract(
			ContractType newForeignExchangeContract) {
		foreignExchangeContract = newForeignExchangeContract;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.calculationRate == null) ? 0 : this.calculationRate.hashCode());
		result = PRIME * result + ((this.date == null) ? 0 : this.date.hashCode());
		result = PRIME * result + ((this.exchangeMarketID == null) ? 0 : this.exchangeMarketID.hashCode());
		result = PRIME * result + ((this.foreignExchangeContract == null) ? 0 : this.foreignExchangeContract.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.operatorCode == null) ? 0 : this.operatorCode.hashCode());
		result = PRIME * result + ((this.sourceCurrencyBaseRate == null) ? 0 : this.sourceCurrencyBaseRate.hashCode());
		result = PRIME * result + ((this.sourceCurrencyCode == null) ? 0 : this.sourceCurrencyCode.hashCode());
		result = PRIME * result + ((this.targetCurrencyBaseRate == null) ? 0 : this.targetCurrencyBaseRate.hashCode());
		result = PRIME * result + ((this.targetCurrencyCode == null) ? 0 : this.targetCurrencyCode.hashCode());
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
		final ExchangeRateType other = (ExchangeRateType) obj;
		if (this.calculationRate == null) {
			if (other.calculationRate != null)
				return false;
		} else if (!this.calculationRate.equals(other.calculationRate))
			return false;
		if (this.date == null) {
			if (other.date != null)
				return false;
		} else if (!this.date.equals(other.date))
			return false;
		if (this.exchangeMarketID == null) {
			if (other.exchangeMarketID != null)
				return false;
		} else if (!this.exchangeMarketID.equals(other.exchangeMarketID))
			return false;
		if (this.foreignExchangeContract == null) {
			if (other.foreignExchangeContract != null)
				return false;
		} else if (!this.foreignExchangeContract.equals(other.foreignExchangeContract))
			return false;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.operatorCode == null) {
			if (other.operatorCode != null)
				return false;
		} else if (!this.operatorCode.equals(other.operatorCode))
			return false;
		if (this.sourceCurrencyBaseRate == null) {
			if (other.sourceCurrencyBaseRate != null)
				return false;
		} else if (!this.sourceCurrencyBaseRate.equals(other.sourceCurrencyBaseRate))
			return false;
		if (this.sourceCurrencyCode == null) {
			if (other.sourceCurrencyCode != null)
				return false;
		} else if (!this.sourceCurrencyCode.equals(other.sourceCurrencyCode))
			return false;
		if (this.targetCurrencyBaseRate == null) {
			if (other.targetCurrencyBaseRate != null)
				return false;
		} else if (!this.targetCurrencyBaseRate.equals(other.targetCurrencyBaseRate))
			return false;
		if (this.targetCurrencyCode == null) {
			if (other.targetCurrencyCode != null)
				return false;
		} else if (!this.targetCurrencyCode.equals(other.targetCurrencyCode))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // ExchangeRateType