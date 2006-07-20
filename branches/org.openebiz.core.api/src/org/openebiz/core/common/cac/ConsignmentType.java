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
import org.openebiz.core.common.cbc.DeclaredCustomsValueAmountType;
import org.openebiz.core.common.cbc.GrossVolumeMeasureType;
import org.openebiz.core.common.cbc.GrossWeightMeasureType;
import org.openebiz.core.common.cbc.HazardousRiskIndicatorType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.InsurancePremiumAmountType;
import org.openebiz.core.common.cbc.LoadingLengthMeasureType;
import org.openebiz.core.common.cbc.NetNetWeightMeasureType;
import org.openebiz.core.common.cbc.NetVolumeMeasureType;
import org.openebiz.core.common.cbc.NetWeightMeasureType;
import org.openebiz.core.common.cbc.TariffCodeType;
import org.openebiz.core.common.cbc.TotalInvoiceAmountType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consignment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Consignment. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>A separately identifiable collection of goods items (available to be) transported from one consignor to one consignee via one or more modes of transport.</ccts:Definition>
 *           <ccts:ObjectClass>Consignment</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getSummaryDescription <em>Summary Description</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getTotalInvoiceAmount <em>Total Invoice Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getDeclaredCustomsValueAmount <em>Declared Customs Value Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getTariffDescription <em>Tariff Description</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getTariffCode <em>Tariff Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getInsurancePremiumAmount <em>Insurance Premium Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getGrossWeightMeasure <em>Gross Weight Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getNetWeightMeasure <em>Net Weight Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getNetNetWeightMeasure <em>Net Net Weight Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getChargeableWeightMeasure <em>Chargeable Weight Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getGrossVolumeMeasure <em>Gross Volume Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getNetVolumeMeasure <em>Net Volume Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getLoadingLengthMeasure <em>Loading Length Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getHazardousRiskIndicator <em>Hazardous Risk Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getConsigneeParty <em>Consignee Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getExporterParty <em>Exporter Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getConsignorParty <em>Consignor Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getImporterParty <em>Importer Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getCarrierParty <em>Carrier Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getFreightForwarderParty <em>Freight Forwarder Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getNotifyParty <em>Notify Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getOriginalDespatchParty <em>Original Despatch Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getFinalDeliveryParty <em>Final Delivery Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getOriginalDepartureCountry <em>Original Departure Country</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getFinalDestinationCountry <em>Final Destination Country</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getTransitCountry <em>Transit Country</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getOriginalDespatchTransportationService <em>Original Despatch Transportation Service</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getFinalDeliveryTransportationService <em>Final Delivery Transportation Service</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getDeliveryTerms <em>Delivery Terms</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getPaymentTerms <em>Payment Terms</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getFreightAllowanceCharge <em>Freight Allowance Charge</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface ConsignmentType {
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
	 *               <ccts:DictionaryEntryName>Consignment. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Unique number assigned to goods, both for import and export.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Unique consignment reference number (UCR)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID</em>' containment reference.
	 * @see #setID(IDType)
	 */
	IDType getID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getID <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' containment reference.
	 * @see #getID()
	 */
	void setID(IDType value);

	/**
	 * Returns the value of the '<em><b>Summary Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cbc.SummaryDescriptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Summary Description. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>General descriptive text that is not part of any remarks.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Summary Description</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Summary Description</em>' containment reference list.
	 */
	List getSummaryDescription();

	/**
	 * Returns the value of the '<em><b>Total Invoice Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Total_ Invoice Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Total of all invoice amounts declared in a single consignment.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Total</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Invoice Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Invoice Amount</em>' containment reference.
	 * @see #setTotalInvoiceAmount(TotalInvoiceAmountType)
	 */
	TotalInvoiceAmountType getTotalInvoiceAmount();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getTotalInvoiceAmount <em>Total Invoice Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Invoice Amount</em>' containment reference.
	 * @see #getTotalInvoiceAmount()
	 */
	void setTotalInvoiceAmount(TotalInvoiceAmountType value);

	/**
	 * Returns the value of the '<em><b>Declared Customs Value Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Declared_ Customs Value. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Amount declared for customs purposes of those goods in a consignment whether or not they are subject to the same customs procedure, tariff/statistical heading, country information and duty regime.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Declared</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Customs Value</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Declared Customs Value Amount</em>' containment reference.
	 * @see #setDeclaredCustomsValueAmount(DeclaredCustomsValueAmountType)
	 */
	DeclaredCustomsValueAmountType getDeclaredCustomsValueAmount();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getDeclaredCustomsValueAmount <em>Declared Customs Value Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declared Customs Value Amount</em>' containment reference.
	 * @see #getDeclaredCustomsValueAmount()
	 */
	void setDeclaredCustomsValueAmount(DeclaredCustomsValueAmountType value);

	/**
	 * Returns the value of the '<em><b>Tariff Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cbc.TariffDescriptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Tariff Description. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Free text specification of tariff applied to a consignment.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Tariff Description</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tariff Description</em>' containment reference list.
	 */
	List getTariffDescription();

	/**
	 * Returns the value of the '<em><b>Tariff Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Tariff Code. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Code specifying a tariff applied to a consignment.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Tariff Code</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Tariff code number (WCO ID 145)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tariff Code</em>' containment reference.
	 * @see #setTariffCode(TariffCodeType)
	 */
	TariffCodeType getTariffCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getTariffCode <em>Tariff Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tariff Code</em>' containment reference.
	 * @see #getTariffCode()
	 */
	void setTariffCode(TariffCodeType value);

	/**
	 * Returns the value of the '<em><b>Insurance Premium Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Insurance Premium Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Amount of premium payable to the insurance company for insuring the goods.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Insurance Premium Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Insurance Cost</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insurance Premium Amount</em>' containment reference.
	 * @see #setInsurancePremiumAmount(InsurancePremiumAmountType)
	 */
	InsurancePremiumAmountType getInsurancePremiumAmount();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getInsurancePremiumAmount <em>Insurance Premium Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insurance Premium Amount</em>' containment reference.
	 * @see #getInsurancePremiumAmount()
	 */
	void setInsurancePremiumAmount(InsurancePremiumAmountType value);

	/**
	 * Returns the value of the '<em><b>Gross Weight Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Gross_ Weight. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Total weight (mass) of goods including packaging but excluding the carrier's equipment for a declaration.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Gross</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Weight</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Total gross weight (WCO ID 131)</ccts:AlternativeBusinessTerms>
	 *               <ccts:Examples>Total cube of all goods items referred to as one consignment.</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gross Weight Measure</em>' containment reference.
	 * @see #setGrossWeightMeasure(GrossWeightMeasureType)
	 */
	GrossWeightMeasureType getGrossWeightMeasure();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getGrossWeightMeasure <em>Gross Weight Measure</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Consignment. Net_ Weight. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Total net weight (mass) of all the goods items referred to as one consignment.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getNetWeightMeasure <em>Net Weight Measure</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Consignment. Net Net_ Weight. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Weight (mass) of the goods themselves without any packing.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Net Net</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Weight</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Net Net Weight Measure</em>' containment reference.
	 * @see #setNetNetWeightMeasure(NetNetWeightMeasureType)
	 */
	NetNetWeightMeasureType getNetNetWeightMeasure();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getNetNetWeightMeasure <em>Net Net Weight Measure</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Consignment. Chargeable_ Weight. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Gross weight (mass) on which a charge is to be based.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Chargeable</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Weight</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Chargeable Weight. Basis.Measure</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Chargeable Weight Measure</em>' containment reference.
	 * @see #setChargeableWeightMeasure(ChargeableWeightMeasureType)
	 */
	ChargeableWeightMeasureType getChargeableWeightMeasure();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getChargeableWeightMeasure <em>Chargeable Weight Measure</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Consignment. Gross_ Volume. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Total cube of all goods items referred to as one consignment.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Gross</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Volume</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Cube</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gross Volume Measure</em>' containment reference.
	 * @see #setGrossVolumeMeasure(GrossVolumeMeasureType)
	 */
	GrossVolumeMeasureType getGrossVolumeMeasure();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getGrossVolumeMeasure <em>Gross Volume Measure</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Consignment. Net_ Volume. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition/>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getNetVolumeMeasure <em>Net Volume Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net Volume Measure</em>' containment reference.
	 * @see #getNetVolumeMeasure()
	 */
	void setNetVolumeMeasure(NetVolumeMeasureType value);

	/**
	 * Returns the value of the '<em><b>Loading Length Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Loading_ Length. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Total length in a means of transport or a piece of transport equipment whereby the complete width and height over that length is needed for loading all the consignments referred to as one consolidation.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Loading</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Length</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loading Length Measure</em>' containment reference.
	 * @see #setLoadingLengthMeasure(LoadingLengthMeasureType)
	 */
	LoadingLengthMeasureType getLoadingLengthMeasure();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getLoadingLengthMeasure <em>Loading Length Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loading Length Measure</em>' containment reference.
	 * @see #getLoadingLengthMeasure()
	 */
	void setLoadingLengthMeasure(LoadingLengthMeasureType value);

	/**
	 * Returns the value of the '<em><b>Remarks</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cbc.RemarksType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Remarks. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Remarks concerning the complete consignment to be printed on the transport document.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Remarks</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remarks</em>' containment reference list.
	 */
	List getRemarks();

	/**
	 * Returns the value of the '<em><b>Hazardous Risk Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Hazardous Risk Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Indication that the transport is subject to an international regulation concerning the carriage of dangerous goods or not.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Hazardous Risk Indicator</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Dangerous Goods RID Indicator</ccts:AlternativeBusinessTerms>
	 *               <ccts:Examples>default is negative</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hazardous Risk Indicator</em>' containment reference.
	 * @see #setHazardousRiskIndicator(HazardousRiskIndicatorType)
	 */
	HazardousRiskIndicatorType getHazardousRiskIndicator();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getHazardousRiskIndicator <em>Hazardous Risk Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hazardous Risk Indicator</em>' containment reference.
	 * @see #getHazardousRiskIndicator()
	 */
	void setHazardousRiskIndicator(HazardousRiskIndicatorType value);

	/**
	 * Returns the value of the '<em><b>Consignee Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Consignee_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>party to which goods are consigned.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Consignee</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Consignee (WCO ID 51 and 52)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consignee Party</em>' containment reference.
	 * @see #setConsigneeParty(PartyType)
	 */
	PartyType getConsigneeParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getConsigneeParty <em>Consignee Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consignee Party</em>' containment reference.
	 * @see #getConsigneeParty()
	 */
	void setConsigneeParty(PartyType value);

	/**
	 * Returns the value of the '<em><b>Exporter Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Exporter_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the party who makes - or on whose behalf - the export declaration - is made - and who is the owner of the goods or has similar right of disposal over them at the time when the declaration is accepted.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Exporter</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Exporter (WCO ID 41 and 42)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exporter Party</em>' containment reference.
	 * @see #setExporterParty(PartyType)
	 */
	PartyType getExporterParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getExporterParty <em>Exporter Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exporter Party</em>' containment reference.
	 * @see #getExporterParty()
	 */
	void setExporterParty(PartyType value);

	/**
	 * Returns the value of the '<em><b>Consignor Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Consignor_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the party consigning goods as stipulated in the transport contract by the party ordering transport.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Consignor</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Consignor (WCO ID 71 and 72)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consignor Party</em>' containment reference.
	 * @see #setConsignorParty(PartyType)
	 */
	PartyType getConsignorParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getConsignorParty <em>Consignor Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consignor Party</em>' containment reference.
	 * @see #getConsignorParty()
	 */
	void setConsignorParty(PartyType value);

	/**
	 * Returns the value of the '<em><b>Importer Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Importer_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the party who makes-or on whose behalf a Customs clearing agent or other authorized person makes- an import declaration. This may include a person who has possession of the goods or to whom the goods are consigned.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Importer</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Importer (WCO ID 39 and 40)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Importer Party</em>' containment reference.
	 * @see #setImporterParty(PartyType)
	 */
	PartyType getImporterParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getImporterParty <em>Importer Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importer Party</em>' containment reference.
	 * @see #getImporterParty()
	 */
	void setImporterParty(PartyType value);

	/**
	 * Returns the value of the '<em><b>Carrier Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Carrier_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the party providing the transport of goods between named points.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Carrier</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Transport Company, Shipping Line, NVOCC, Airline,  Haulier, Courier, Carrier (WCO ID 49 and 50)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Carrier Party</em>' containment reference.
	 * @see #setCarrierParty(PartyType)
	 */
	PartyType getCarrierParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getCarrierParty <em>Carrier Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Party</em>' containment reference.
	 * @see #getCarrierParty()
	 */
	void setCarrierParty(PartyType value);

	/**
	 * Returns the value of the '<em><b>Freight Forwarder Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Freight Forwarder_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the party combining individual smaller consignments into a single larger shipment (so called consolidated shipment) that is sent to a counterpart who mirrors the consolidator's activity by dividing the consolidated consignment into its original components.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Freight Forwarder</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Consolidator (WCO ID 192 AND 193)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Freight Forwarder Party</em>' containment reference.
	 * @see #setFreightForwarderParty(PartyType)
	 */
	PartyType getFreightForwarderParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getFreightForwarderParty <em>Freight Forwarder Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Freight Forwarder Party</em>' containment reference.
	 * @see #getFreightForwarderParty()
	 */
	void setFreightForwarderParty(PartyType value);

	/**
	 * Returns the value of the '<em><b>Notify Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Notify_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the party to be notified.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Notify</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>WCO ID 57 and 58</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notify Party</em>' containment reference.
	 * @see #setNotifyParty(PartyType)
	 */
	PartyType getNotifyParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getNotifyParty <em>Notify Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notify Party</em>' containment reference.
	 * @see #getNotifyParty()
	 */
	void setNotifyParty(PartyType value);

	/**
	 * Returns the value of the '<em><b>Original Despatch Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Original Despatch_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition/>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Original Despatch</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Original Despatch Party</em>' containment reference.
	 * @see #setOriginalDespatchParty(PartyType)
	 */
	PartyType getOriginalDespatchParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getOriginalDespatchParty <em>Original Despatch Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Despatch Party</em>' containment reference.
	 * @see #getOriginalDespatchParty()
	 */
	void setOriginalDespatchParty(PartyType value);

	/**
	 * Returns the value of the '<em><b>Final Delivery Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Final Delivery_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition/>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Final Delivery</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Final Delivery Party</em>' containment reference.
	 * @see #setFinalDeliveryParty(PartyType)
	 */
	PartyType getFinalDeliveryParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getFinalDeliveryParty <em>Final Delivery Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Delivery Party</em>' containment reference.
	 * @see #getFinalDeliveryParty()
	 */
	void setFinalDeliveryParty(PartyType value);

	/**
	 * Returns the value of the '<em><b>Original Departure Country</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Original Departure_ Country. Country</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the country from which the goods are originally exported without any commercial transaction taken place in intermediate countries.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Original Departure</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Country</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Country</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Country of origin (WCO ID 062)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Original Departure Country</em>' containment reference.
	 * @see #setOriginalDepartureCountry(CountryType)
	 */
	CountryType getOriginalDepartureCountry();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getOriginalDepartureCountry <em>Original Departure Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Departure Country</em>' containment reference.
	 * @see #getOriginalDepartureCountry()
	 */
	void setOriginalDepartureCountry(CountryType value);

	/**
	 * Returns the value of the '<em><b>Final Destination Country</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Final Destination_ Country. Country</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Name of the country to which the goods are to be delivered to the final consignee or buyer.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Final Destination</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Country</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Country</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Ultimate Destination Country, Country of Final Arrival, Country of Destination</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Final Destination Country</em>' containment reference.
	 * @see #setFinalDestinationCountry(CountryType)
	 */
	CountryType getFinalDestinationCountry();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getFinalDestinationCountry <em>Final Destination Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Destination Country</em>' containment reference.
	 * @see #getFinalDestinationCountry()
	 */
	void setFinalDestinationCountry(CountryType value);

	/**
	 * Returns the value of the '<em><b>Transit Country</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.CountryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Transit_ Country. Country</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the countries through which goods or passengers are routed between the country of original departure and final destination.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Transit</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Country</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Country</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Country(ies) of routing (WCO ID 064)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transit Country</em>' containment reference list.
	 */
	List getTransitCountry();

	/**
	 * Returns the value of the '<em><b>Original Despatch Transportation Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Original Despatch_ Transportation Service. Transportation Service</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The service for pick-up from the consignor under the transport contract.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Original Despatch</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Transportation Service</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Transportation Service</ccts:AssociatedObjectClass>
	 *               <ccts:Examples>"Door-to-door", "Pier-to-door"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Original Despatch Transportation Service</em>' containment reference.
	 * @see #setOriginalDespatchTransportationService(TransportationServiceType)
	 */
	TransportationServiceType getOriginalDespatchTransportationService();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getOriginalDespatchTransportationService <em>Original Despatch Transportation Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Despatch Transportation Service</em>' containment reference.
	 * @see #getOriginalDespatchTransportationService()
	 */
	void setOriginalDespatchTransportationService(
			TransportationServiceType value);

	/**
	 * Returns the value of the '<em><b>Final Delivery Transportation Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Final Delivery_ Transportation Service. Transportation Service</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The service for delivery to the consignee under the transport contract.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Final Delivery</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Transportation Service</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Transportation Service</ccts:AssociatedObjectClass>
	 *               <ccts:Examples>"Door-to-door", "Pier-to-door"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Final Delivery Transportation Service</em>' containment reference.
	 * @see #setFinalDeliveryTransportationService(TransportationServiceType)
	 */
	TransportationServiceType getFinalDeliveryTransportationService();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getFinalDeliveryTransportationService <em>Final Delivery Transportation Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Delivery Transportation Service</em>' containment reference.
	 * @see #getFinalDeliveryTransportationService()
	 */
	void setFinalDeliveryTransportationService(TransportationServiceType value);

	/**
	 * Returns the value of the '<em><b>Delivery Terms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Delivery Terms</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>All the conditions agreed upon between a seller and a buyer with regard to the delivery of goods and/or services, e.g. CIF, FOB, or EXW from the INCOTERMS Terms of Delivery.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Delivery Terms</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Delivery Terms</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Trade Terms, INCOTERMS</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delivery Terms</em>' containment reference.
	 * @see #setDeliveryTerms(DeliveryTermsType)
	 */
	DeliveryTermsType getDeliveryTerms();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getDeliveryTerms <em>Delivery Terms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Terms</em>' containment reference.
	 * @see #getDeliveryTerms()
	 */
	void setDeliveryTerms(DeliveryTermsType value);

	/**
	 * Returns the value of the '<em><b>Payment Terms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Payment Terms</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The conditions of payment between the parties in a transaction.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Payment Terms</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Payment Terms</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Terms</em>' containment reference.
	 * @see #setPaymentTerms(PaymentTermsType)
	 */
	PaymentTermsType getPaymentTerms();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getPaymentTerms <em>Payment Terms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Terms</em>' containment reference.
	 * @see #getPaymentTerms()
	 */
	void setPaymentTerms(PaymentTermsType value);

	/**
	 * Returns the value of the '<em><b>Freight Allowance Charge</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.AllowanceChargeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Freight_ Allowance Charge. Allowance Charge</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Costs incurred by the shipper in moving goods, by whatever means, from one place to another under the terms of the contract of carriage. In addition to transport costs, this may include such elements as packing, documentation, loading, unloading, and insurance (to the extent that they relate to the freight costs).</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
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

} // ConsignmentType