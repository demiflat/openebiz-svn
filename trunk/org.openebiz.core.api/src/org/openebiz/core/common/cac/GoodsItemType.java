/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import java.util.List;

import org.openebiz.core.common.cbc.ChargeableWeightMeasureType;
import org.openebiz.core.common.cbc.CustomsStatusCodeType;
import org.openebiz.core.common.cbc.CustomsTariffQuantityType;
import org.openebiz.core.common.cbc.DeclaredCustomsValueAmountType;
import org.openebiz.core.common.cbc.DeclaredForCarriageValueAmountType;
import org.openebiz.core.common.cbc.DeclaredStatisticsValueAmountType;
import org.openebiz.core.common.cbc.FreeOnBoardValueAmountType;
import org.openebiz.core.common.cbc.GrossVolumeMeasureType;
import org.openebiz.core.common.cbc.GrossWeightMeasureType;
import org.openebiz.core.common.cbc.HazardousRiskIndicatorType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.InsuranceValueAmountType;
import org.openebiz.core.common.cbc.NetNetWeightMeasureType;
import org.openebiz.core.common.cbc.NetVolumeMeasureType;
import org.openebiz.core.common.cbc.NetWeightMeasureType;
import org.openebiz.core.common.cbc.PreferenceCriterionCodeType;
import org.openebiz.core.common.cbc.QuantityNumericType;
import org.openebiz.core.common.cbc.RequiredCustomsIDType;
import org.openebiz.core.common.cbc.SequenceNumberIDType;
import org.openebiz.core.common.cbc.ValueAmountType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goods Item Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Goods Item. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>A separately identifiable quantity of products of a single product type</ccts:Definition>
 *           <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getSequenceNumberID <em>Sequence Number ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getHazardousRiskIndicator <em>Hazardous Risk Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getDeclaredCustomsValueAmount <em>Declared Customs Value Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getDeclaredForCarriageValueAmount <em>Declared For Carriage Value Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getDeclaredStatisticsValueAmount <em>Declared Statistics Value Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getFreeOnBoardValueAmount <em>Free On Board Value Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getInsuranceValueAmount <em>Insurance Value Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getValueAmount <em>Value Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getGrossWeightMeasure <em>Gross Weight Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getNetWeightMeasure <em>Net Weight Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getNetNetWeightMeasure <em>Net Net Weight Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getChargeableWeightMeasure <em>Chargeable Weight Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getGrossVolumeMeasure <em>Gross Volume Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getNetVolumeMeasure <em>Net Volume Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getQuantityNumeric <em>Quantity Numeric</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getPreferenceCriterionCode <em>Preference Criterion Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getRequiredCustomsID <em>Required Customs ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getCustomsStatusCode <em>Customs Status Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getCustomsTariffQuantity <em>Customs Tariff Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getItem <em>Item</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getGoodsItemContainer <em>Goods Item Container</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getFreightAllowanceCharge <em>Freight Allowance Charge</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getInvoiceLine <em>Invoice Line</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getContainedGoodsItem <em>Contained Goods Item</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getOriginAddress <em>Origin Address</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface GoodsItemType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition/>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID</em>' containment reference.
	 * @see #setID(IDType)
	 */
	IDType getID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getID <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' containment reference.
	 * @see #getID()
	 */
	void setID(IDType value);

	/**
	 * Returns the value of the '<em><b>Sequence Number ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Sequence Number. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Sequence number differentiating a specific goods item within a consignment.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Sequence Number</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Customs item number (WCO ID 021), Sequence Position</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence Number ID</em>' containment reference.
	 * @see #setSequenceNumberID(SequenceNumberIDType)
	 */
	SequenceNumberIDType getSequenceNumberID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getSequenceNumberID <em>Sequence Number ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Number ID</em>' containment reference.
	 * @see #getSequenceNumberID()
	 */
	void setSequenceNumberID(SequenceNumberIDType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cbc.DescriptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Description. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Plain language description of the nature of a goods item sufficient to identify it for customs, statistical or transport purposes.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Description</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Description of goods (WCO ID 137)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference list.
	 */
	List getDescription();

	/**
	 * Returns the value of the '<em><b>Hazardous Risk Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Hazardous Risk Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Indicator as to whether the goods item includes hazardous items (dangerous goods).</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Hazardous Risk Indicator</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *               <ccts:Examples>default is negative</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hazardous Risk Indicator</em>' containment reference.
	 * @see #setHazardousRiskIndicator(HazardousRiskIndicatorType)
	 */
	HazardousRiskIndicatorType getHazardousRiskIndicator();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getHazardousRiskIndicator <em>Hazardous Risk Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hazardous Risk Indicator</em>' containment reference.
	 * @see #getHazardousRiskIndicator()
	 */
	void setHazardousRiskIndicator(HazardousRiskIndicatorType value);

	/**
	 * Returns the value of the '<em><b>Declared Customs Value Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Declared_ Customs Value. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Amount declared for Customs purposes of those goods in a consignment which are subject to the same Customs procedure, and have the same tariff/statistical heading, country information and duty regime.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Declared</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Customs Value</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>For Customs Value (WCO ID 108)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Declared Customs Value Amount</em>' containment reference.
	 * @see #setDeclaredCustomsValueAmount(DeclaredCustomsValueAmountType)
	 */
	DeclaredCustomsValueAmountType getDeclaredCustomsValueAmount();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getDeclaredCustomsValueAmount <em>Declared Customs Value Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declared Customs Value Amount</em>' containment reference.
	 * @see #getDeclaredCustomsValueAmount()
	 */
	void setDeclaredCustomsValueAmount(DeclaredCustomsValueAmountType value);

	/**
	 * Returns the value of the '<em><b>Declared For Carriage Value Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Declared_ For Carriage Value. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Value, declared by the shipper or his agent solely for the purpose of varying the carrier's level of liability from that provided in the contract of carriage, in case of loss or damage to goods or delayed delivery.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Declared</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>For Carriage Value</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Interest in delivery, declared value for carriage</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Declared For Carriage Value Amount</em>' containment reference.
	 * @see #setDeclaredForCarriageValueAmount(DeclaredForCarriageValueAmountType)
	 */
	DeclaredForCarriageValueAmountType getDeclaredForCarriageValueAmount();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getDeclaredForCarriageValueAmount <em>Declared For Carriage Value Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declared For Carriage Value Amount</em>' containment reference.
	 * @see #getDeclaredForCarriageValueAmount()
	 */
	void setDeclaredForCarriageValueAmount(
			DeclaredForCarriageValueAmountType value);

	/**
	 * Returns the value of the '<em><b>Declared Statistics Value Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Declared_ Statistics Value. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Value declared for statistical purposes of those goods in a consignment which have the same statistical heading.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Declared</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Statistics Value</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Statistical Value (WCO ID 114)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Declared Statistics Value Amount</em>' containment reference.
	 * @see #setDeclaredStatisticsValueAmount(DeclaredStatisticsValueAmountType)
	 */
	DeclaredStatisticsValueAmountType getDeclaredStatisticsValueAmount();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getDeclaredStatisticsValueAmount <em>Declared Statistics Value Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declared Statistics Value Amount</em>' containment reference.
	 * @see #getDeclaredStatisticsValueAmount()
	 */
	void setDeclaredStatisticsValueAmount(
			DeclaredStatisticsValueAmountType value);

	/**
	 * Returns the value of the '<em><b>Free On Board Value Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Free On Board Value. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Monetary amount that has to be or has been paid as calculated under the applicable trade delivery.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Free On Board Value</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>FOB Value</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Free On Board Value Amount</em>' containment reference.
	 * @see #setFreeOnBoardValueAmount(FreeOnBoardValueAmountType)
	 */
	FreeOnBoardValueAmountType getFreeOnBoardValueAmount();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getFreeOnBoardValueAmount <em>Free On Board Value Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free On Board Value Amount</em>' containment reference.
	 * @see #getFreeOnBoardValueAmount()
	 */
	void setFreeOnBoardValueAmount(FreeOnBoardValueAmountType value);

	/**
	 * Returns the value of the '<em><b>Insurance Value Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Insurance Value. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The amount covered by an insurance for a particular goods item.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Insurance Value</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Value Insured</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insurance Value Amount</em>' containment reference.
	 * @see #setInsuranceValueAmount(InsuranceValueAmountType)
	 */
	InsuranceValueAmountType getInsuranceValueAmount();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getInsuranceValueAmount <em>Insurance Value Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insurance Value Amount</em>' containment reference.
	 * @see #getInsuranceValueAmount()
	 */
	void setInsuranceValueAmount(InsuranceValueAmountType value);

	/**
	 * Returns the value of the '<em><b>Value Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Value. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>To specify the amount on which a duty or tax or fee will be assessed</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Value</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Duty/tax/fee assessment basis in value (WCO ID 116)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Amount</em>' containment reference.
	 * @see #setValueAmount(ValueAmountType)
	 */
	ValueAmountType getValueAmount();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getValueAmount <em>Value Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Amount</em>' containment reference.
	 * @see #getValueAmount()
	 */
	void setValueAmount(ValueAmountType value);

	/**
	 * Returns the value of the '<em><b>Gross Weight Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Gross_ Weight. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Weight (mass) of goods including packaging but excluding the carrier's equipment.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Gross</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Weight</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Actual Gross Weight</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gross Weight Measure</em>' containment reference.
	 * @see #setGrossWeightMeasure(GrossWeightMeasureType)
	 */
	GrossWeightMeasureType getGrossWeightMeasure();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getGrossWeightMeasure <em>Gross Weight Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gross Weight Measure</em>' containment reference.
	 * @see #getGrossWeightMeasure()
	 */
	void setGrossWeightMeasure(GrossWeightMeasureType value);

	/**
	 * Returns the value of the '<em><b>Net Weight Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Net_ Weight. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Weight (mass) of goods item excluding all packing but including any packaging that normally goes with the goods.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Net</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Weight</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Net Weight Measure</em>' containment reference.
	 * @see #setNetWeightMeasure(NetWeightMeasureType)
	 */
	NetWeightMeasureType getNetWeightMeasure();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getNetWeightMeasure <em>Net Weight Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net Weight Measure</em>' containment reference.
	 * @see #getNetWeightMeasure()
	 */
	void setNetWeightMeasure(NetWeightMeasureType value);

	/**
	 * Returns the value of the '<em><b>Net Net Weight Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Net Net_ Weight. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Weight (mass) of goods without any packaging.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Net Net</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Weight</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Customs Weight (WCO ID 128)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Net Net Weight Measure</em>' containment reference.
	 * @see #setNetNetWeightMeasure(NetNetWeightMeasureType)
	 */
	NetNetWeightMeasureType getNetNetWeightMeasure();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getNetNetWeightMeasure <em>Net Net Weight Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net Net Weight Measure</em>' containment reference.
	 * @see #getNetNetWeightMeasure()
	 */
	void setNetNetWeightMeasure(NetNetWeightMeasureType value);

	/**
	 * Returns the value of the '<em><b>Chargeable Weight Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Chargeable_ Weight. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Gross weight (mass) on which a charge is to be based.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Chargeable</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Weight</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Chargeable Weight Measure</em>' containment reference.
	 * @see #setChargeableWeightMeasure(ChargeableWeightMeasureType)
	 */
	ChargeableWeightMeasureType getChargeableWeightMeasure();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getChargeableWeightMeasure <em>Chargeable Weight Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chargeable Weight Measure</em>' containment reference.
	 * @see #getChargeableWeightMeasure()
	 */
	void setChargeableWeightMeasure(ChargeableWeightMeasureType value);

	/**
	 * Returns the value of the '<em><b>Gross Volume Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Gross_ Volume. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Measurement normally arrived at by multiplying the maximum length, width and height of the goods item.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Gross</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Volume</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Volume, Gross Measurement Cube (GMC), Cube (WCO ID 134)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gross Volume Measure</em>' containment reference.
	 * @see #setGrossVolumeMeasure(GrossVolumeMeasureType)
	 */
	GrossVolumeMeasureType getGrossVolumeMeasure();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getGrossVolumeMeasure <em>Gross Volume Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gross Volume Measure</em>' containment reference.
	 * @see #getGrossVolumeMeasure()
	 */
	void setGrossVolumeMeasure(GrossVolumeMeasureType value);

	/**
	 * Returns the value of the '<em><b>Net Volume Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Net_ Volume. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The volume contained by a goods item excluding the volume of any packaging material.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Net</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Volume</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Net Volume Measure</em>' containment reference.
	 * @see #setNetVolumeMeasure(NetVolumeMeasureType)
	 */
	NetVolumeMeasureType getNetVolumeMeasure();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getNetVolumeMeasure <em>Net Volume Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net Volume Measure</em>' containment reference.
	 * @see #getNetVolumeMeasure()
	 */
	void setNetVolumeMeasure(NetVolumeMeasureType value);

	/**
	 * Returns the value of the '<em><b>Quantity Numeric</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Quantity. Numeric</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Number of goods item.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Numeric</ccts:RepresentationTerm>
	 *               <ccts:DataType>Numeric. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity Numeric</em>' containment reference.
	 * @see #setQuantityNumeric(QuantityNumericType)
	 */
	QuantityNumericType getQuantityNumeric();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getQuantityNumeric <em>Quantity Numeric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Numeric</em>' containment reference.
	 * @see #getQuantityNumeric()
	 */
	void setQuantityNumeric(QuantityNumericType value);

	/**
	 * Returns the value of the '<em><b>Preference Criterion Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Preference Criterion. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Specifies the treatment preference for this good according to international trading agreements.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Preference Criterion</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:Examples>"Preference Criterion" is used in the following manner in the paper CO of another country (e.g.):
	 * "A" - The good is "wholly obtained or produced entirely" in the territory of one or more of the NAFTA countries as reference in Article 415. Note: The purchase of a good in the territory does not necessarily render it "wholly obtained or produced".  If the good is an agricultural good, see also criterion F and Annex 703.2. (Reference: Article 401(a), 415).
	 * "B" - ...
	 * "C" - ...
	 * "D" - ...
	 * "E" - ...
	 * "F" - The good is an originating agricultural good under preference criterion A,B, or C above and is not subjected to quantitative restriction in the importing NAFTA country because....
	 * Thus, the column "Preference Criterion" will indicate either A, B, C,...</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Preference Criterion Code</em>' containment reference.
	 * @see #setPreferenceCriterionCode(PreferenceCriterionCodeType)
	 */
	PreferenceCriterionCodeType getPreferenceCriterionCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getPreferenceCriterionCode <em>Preference Criterion Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preference Criterion Code</em>' containment reference.
	 * @see #getPreferenceCriterionCode()
	 */
	void setPreferenceCriterionCode(PreferenceCriterionCodeType value);

	/**
	 * Returns the value of the '<em><b>Required Customs ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Required_ Customs Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Additional tariff codes required to specify a type of goods for Customs, transport, statistical or other regulatory purposes.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Required</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Customs Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Tariff code extensions (WCO ID 255)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Customs ID</em>' containment reference.
	 * @see #setRequiredCustomsID(RequiredCustomsIDType)
	 */
	RequiredCustomsIDType getRequiredCustomsID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getRequiredCustomsID <em>Required Customs ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Customs ID</em>' containment reference.
	 * @see #getRequiredCustomsID()
	 */
	void setRequiredCustomsID(RequiredCustomsIDType value);

	/**
	 * Returns the value of the '<em><b>Customs Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Customs Status. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Status of goods as identified by customs for regulation purposes.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Customs Status</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Customs status of goods (WCO ID 094)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Customs Status Code</em>' containment reference.
	 * @see #setCustomsStatusCode(CustomsStatusCodeType)
	 */
	CustomsStatusCodeType getCustomsStatusCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getCustomsStatusCode <em>Customs Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customs Status Code</em>' containment reference.
	 * @see #getCustomsStatusCode()
	 */
	void setCustomsStatusCode(CustomsStatusCodeType value);

	/**
	 * Returns the value of the '<em><b>Customs Tariff Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Customs Tariff Quantity. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Quantity of the goods in the unit as required by Customs for tariff, statistical or fiscal purposes.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Customs Tariff Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Customs Tariff Quantity</em>' containment reference.
	 * @see #setCustomsTariffQuantity(CustomsTariffQuantityType)
	 */
	CustomsTariffQuantityType getCustomsTariffQuantity();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getCustomsTariffQuantity <em>Customs Tariff Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customs Tariff Quantity</em>' containment reference.
	 * @see #getCustomsTariffQuantity()
	 */
	void setCustomsTariffQuantity(CustomsTariffQuantityType value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.ItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Item</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Association to a description of the good or service</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Item</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Item</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 */
	List getItem();

	/**
	 * Returns the value of the '<em><b>Goods Item Container</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.GoodsItemContainerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Goods Item Container</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Association to describe the transporting of a goods item in a unit of transport equipment (eg container)</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Goods Item Container</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Goods Item Container</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Goods Item Container</em>' containment reference list.
	 */
	List getGoodsItemContainer();

	/**
	 * Returns the value of the '<em><b>Freight Allowance Charge</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.AllowanceChargeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Freight_ Allowance Charge. Allowance Charge</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Costs incurred by the shipper in moving goods, by whatever means, from one place to another under the terms of the contract of carriage. In addition to transport costs, this may include such elements as packing, documentation, loading, unloading, and insurance (to the extent that they relate to the freight costs).</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Freight</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Allowance Charge</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Allowance Charge</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Freight Costs</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Freight Allowance Charge</em>' containment reference list.
	 */
	List getFreightAllowanceCharge();

	/**
	 * Returns the value of the '<em><b>Invoice Line</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.InvoiceLineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Invoice Line</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Association to information directly relating to a line item of an invoice.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Invoice Line</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Invoice Line</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invoice Line</em>' containment reference list.
	 */
	List getInvoiceLine();

	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.TemperatureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Temperature</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Any termperatures associated with the goods.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Temperature</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Temperature</ccts:AssociatedObjectClass>
	 *               <ccts:Examples>maximum, storage, minimum</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Temperature</em>' containment reference list.
	 */
	List getTemperature();

	/**
	 * Returns the value of the '<em><b>Contained Goods Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.GoodsItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Contained_ Goods Item. Goods Item</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Associates with any other goods items contained in this goods item.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Contained</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Goods Item</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Goods Item</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contained Goods Item</em>' containment reference list.
	 */
	List getContainedGoodsItem();

	/**
	 * Returns the value of the '<em><b>Origin Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Origin_ Address. Address</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Region in which the goods have been produced or manufactured, according to criteria laid down for the purposes of application of the Customs tariff, or quantitative restrictions, or of any other measure related to trade</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Origin</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Address</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Address</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Region of origin (WCO ID 066)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Origin Address</em>' containment reference.
	 * @see #setOriginAddress(AddressType)
	 */
	AddressType getOriginAddress();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getOriginAddress <em>Origin Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Address</em>' containment reference.
	 * @see #getOriginAddress()
	 */
	void setOriginAddress(AddressType value);

} // GoodsItemType