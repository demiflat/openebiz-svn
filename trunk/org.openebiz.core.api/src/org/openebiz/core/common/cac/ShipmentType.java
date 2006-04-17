/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import java.util.List;

import org.openebiz.core.common.cbc.DeclaredCustomsValueAmountType;
import org.openebiz.core.common.cbc.DeclaredForCarriageValueAmountType;
import org.openebiz.core.common.cbc.DeclaredStatisticsValueAmountType;
import org.openebiz.core.common.cbc.FreeOnBoardValueAmountType;
import org.openebiz.core.common.cbc.GrossVolumeMeasureType;
import org.openebiz.core.common.cbc.GrossWeightMeasureType;
import org.openebiz.core.common.cbc.HandlingCodeType;
import org.openebiz.core.common.cbc.HandlingInstructionsType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.InformationType;
import org.openebiz.core.common.cbc.InsuranceValueAmountType;
import org.openebiz.core.common.cbc.NetNetWeightMeasureType;
import org.openebiz.core.common.cbc.NetVolumeMeasureType;
import org.openebiz.core.common.cbc.NetWeightMeasureType;
import org.openebiz.core.common.cbc.PriorityLevelCodeType;
import org.openebiz.core.common.cbc.TotalGoodsItemQuantityType;
import org.openebiz.core.common.cbc.TotalTransportHandlingUnitQuantityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Shipment. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about a Shipment</ccts:Definition>
 *           <ccts:ObjectClass>Shipment</ccts:ObjectClass>
 *           <ccts:AlternativeBusinessTerms>Consignment</ccts:AlternativeBusinessTerms>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getPriorityLevelCode <em>Priority Level Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getHandlingCode <em>Handling Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getHandlingInstructions <em>Handling Instructions</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getInformation <em>Information</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getGrossWeightMeasure <em>Gross Weight Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getNetWeightMeasure <em>Net Weight Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getNetNetWeightMeasure <em>Net Net Weight Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getGrossVolumeMeasure <em>Gross Volume Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getNetVolumeMeasure <em>Net Volume Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getTotalGoodsItemQuantity <em>Total Goods Item Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getTotalTransportHandlingUnitQuantity <em>Total Transport Handling Unit Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getInsuranceValueAmount <em>Insurance Value Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getDeclaredCustomsValueAmount <em>Declared Customs Value Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getDeclaredForCarriageValueAmount <em>Declared For Carriage Value Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getDeclaredStatisticsValueAmount <em>Declared Statistics Value Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getFreeOnBoardValueAmount <em>Free On Board Value Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getSpecialInstructions <em>Special Instructions</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getDeliveryInstructions <em>Delivery Instructions</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getConsignment <em>Consignment</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getTransportContract <em>Transport Contract</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getGoodsItem <em>Goods Item</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getShipmentStage <em>Shipment Stage</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getDelivery <em>Delivery</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getTransportHandlingUnit <em>Transport Handling Unit</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getOriginAddress <em>Origin Address</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getFirstArrivalPort <em>First Arrival Port</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getLastExitPort <em>Last Exit Port</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getExportCountry <em>Export Country</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentType#getFreightAllowanceCharge <em>Freight Allowance Charge</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface ShipmentType {
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
	 *               <ccts:DictionaryEntryName>Shipment. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for a Shipment</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Waybill Number</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID</em>' containment reference.
	 * @see #setID(IDType)
	 */
	IDType getID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getID <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' containment reference.
	 * @see #getID()
	 */
	void setID(IDType value);

	/**
	 * Returns the value of the '<em><b>Priority Level Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Priority Level. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The priority or level of service required for a Shipment expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Priority Level</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Service Level, Service Priority</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority Level Code</em>' containment reference.
	 * @see #setPriorityLevelCode(PriorityLevelCodeType)
	 */
	PriorityLevelCodeType getPriorityLevelCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getPriorityLevelCode <em>Priority Level Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority Level Code</em>' containment reference.
	 * @see #getPriorityLevelCode()
	 */
	void setPriorityLevelCode(PriorityLevelCodeType value);

	/**
	 * Returns the value of the '<em><b>Handling Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Handling Code. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The handling required for a Shipment expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Handling Code</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Special Handling</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Handling Code</em>' containment reference.
	 * @see #setHandlingCode(HandlingCodeType)
	 */
	HandlingCodeType getHandlingCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getHandlingCode <em>Handling Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handling Code</em>' containment reference.
	 * @see #getHandlingCode()
	 */
	void setHandlingCode(HandlingCodeType value);

	/**
	 * Returns the value of the '<em><b>Handling Instructions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Handling Instructions. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Free form text describing Handling Instructions for a Shipment</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Handling Instructions</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Handling Instructions</em>' containment reference.
	 * @see #setHandlingInstructions(HandlingInstructionsType)
	 */
	HandlingInstructionsType getHandlingInstructions();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getHandlingInstructions <em>Handling Instructions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handling Instructions</em>' containment reference.
	 * @see #getHandlingInstructions()
	 */
	void setHandlingInstructions(HandlingInstructionsType value);

	/**
	 * Returns the value of the '<em><b>Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Information. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Free form text applying to a Shipment. This element may contain notes or any other similar information that is not contained explicitly in another structure.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Information</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Information</em>' containment reference.
	 * @see #setInformation(InformationType)
	 */
	InformationType getInformation();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getInformation <em>Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information</em>' containment reference.
	 * @see #getInformation()
	 */
	void setInformation(InformationType value);

	/**
	 * Returns the value of the '<em><b>Gross Weight Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Gross_ Weight. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The total gross weight of a Shipment; the weight of the goods + packaging + transport equipment</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Gross</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Weight</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gross Weight Measure</em>' containment reference.
	 * @see #setGrossWeightMeasure(GrossWeightMeasureType)
	 */
	GrossWeightMeasureType getGrossWeightMeasure();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getGrossWeightMeasure <em>Gross Weight Measure</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Shipment. Net_ Weight. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The total net weight of a Shipment; the weight of the goods + packaging</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getNetWeightMeasure <em>Net Weight Measure</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Shipment. Net Net_ Weight. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The weight of the goods net of packaging and transport equipment</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getNetNetWeightMeasure <em>Net Net Weight Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net Net Weight Measure</em>' containment reference.
	 * @see #getNetNetWeightMeasure()
	 */
	void setNetNetWeightMeasure(NetNetWeightMeasureType value);

	/**
	 * Returns the value of the '<em><b>Gross Volume Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Gross_ Volume. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The total volume of the goods in a Shipment + packaging</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Gross</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Volume</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gross Volume Measure</em>' containment reference.
	 * @see #setGrossVolumeMeasure(GrossVolumeMeasureType)
	 */
	GrossVolumeMeasureType getGrossVolumeMeasure();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getGrossVolumeMeasure <em>Gross Volume Measure</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Shipment. Net_ Volume. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The volume of a Shipment net of packaging and transport equipment</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getNetVolumeMeasure <em>Net Volume Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net Volume Measure</em>' containment reference.
	 * @see #getNetVolumeMeasure()
	 */
	void setNetVolumeMeasure(NetVolumeMeasureType value);

	/**
	 * Returns the value of the '<em><b>Total Goods Item Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Total_ Goods Item Quantity. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Count of the total number of goods items within a shipment.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Total</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Goods Item Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Goods Item Quantity</em>' containment reference.
	 * @see #setTotalGoodsItemQuantity(TotalGoodsItemQuantityType)
	 */
	TotalGoodsItemQuantityType getTotalGoodsItemQuantity();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getTotalGoodsItemQuantity <em>Total Goods Item Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Goods Item Quantity</em>' containment reference.
	 * @see #getTotalGoodsItemQuantity()
	 */
	void setTotalGoodsItemQuantity(TotalGoodsItemQuantityType value);

	/**
	 * Returns the value of the '<em><b>Total Transport Handling Unit Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Total_ Transport Handling Unit Quantity. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Count of the number of pieces of transport handling equipment in a shipment, such as pallets, boxes,cases.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Total</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Transport Handling Unit Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Number of THUs</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Transport Handling Unit Quantity</em>' containment reference.
	 * @see #setTotalTransportHandlingUnitQuantity(TotalTransportHandlingUnitQuantityType)
	 */
	TotalTransportHandlingUnitQuantityType getTotalTransportHandlingUnitQuantity();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getTotalTransportHandlingUnitQuantity <em>Total Transport Handling Unit Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Transport Handling Unit Quantity</em>' containment reference.
	 * @see #getTotalTransportHandlingUnitQuantity()
	 */
	void setTotalTransportHandlingUnitQuantity(
			TotalTransportHandlingUnitQuantityType value);

	/**
	 * Returns the value of the '<em><b>Insurance Value Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Insurance Value. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The total sum covered by an insurance for the shipment</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getInsuranceValueAmount <em>Insurance Value Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insurance Value Amount</em>' containment reference.
	 * @see #getInsuranceValueAmount()
	 */
	void setInsuranceValueAmount(InsuranceValueAmountType value);

	/**
	 * Returns the value of the '<em><b>Declared Customs Value Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Declared_ Customs Value. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Amount declared for customs purposes of those goods in a shipment which are subject to the same customs procedure, and have the same tariff/statistical heading, country information and duty regime.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getDeclaredCustomsValueAmount <em>Declared Customs Value Amount</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Shipment. Declared_ For Carriage Value. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Value, declared by the shipper or his agent solely for the purpose of varying the carrier's level of liability from that provided in the contract of carriage, in case of loss or damage to goods or delayed delivery.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Declared</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>For Carriage Value</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Declared value for carriage, Interest in delivery</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Declared For Carriage Value Amount</em>' containment reference.
	 * @see #setDeclaredForCarriageValueAmount(DeclaredForCarriageValueAmountType)
	 */
	DeclaredForCarriageValueAmountType getDeclaredForCarriageValueAmount();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getDeclaredForCarriageValueAmount <em>Declared For Carriage Value Amount</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Shipment. Declared_ Statistics Value. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Value declared for statistical purposes of those goods in a consignment which have the same statistical heading.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Declared</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Statistics Value</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Statistical Value</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Declared Statistics Value Amount</em>' containment reference.
	 * @see #setDeclaredStatisticsValueAmount(DeclaredStatisticsValueAmountType)
	 */
	DeclaredStatisticsValueAmountType getDeclaredStatisticsValueAmount();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getDeclaredStatisticsValueAmount <em>Declared Statistics Value Amount</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Shipment. Free On Board Value. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Monetary amount that has to be or has been paid as calculated under the applicable trade delivery.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getFreeOnBoardValueAmount <em>Free On Board Value Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free On Board Value Amount</em>' containment reference.
	 * @see #getFreeOnBoardValueAmount()
	 */
	void setFreeOnBoardValueAmount(FreeOnBoardValueAmountType value);

	/**
	 * Returns the value of the '<em><b>Special Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cbc.SpecialInstructionsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Special Instructions. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Special instructions relating to a shipment.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Special Instructions</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Special Instructions</em>' containment reference list.
	 */
	List getSpecialInstructions();

	/**
	 * Returns the value of the '<em><b>Delivery Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cbc.DeliveryInstructionsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Delivery Instructions. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Delivery instructions relating to a shipment.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Delivery Instructions</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delivery Instructions</em>' containment reference list.
	 */
	List getDeliveryInstructions();

	/**
	 * Returns the value of the '<em><b>Consignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Consignment</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Consignment covering the shipment.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Consignment</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Consignment</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consignment</em>' containment reference.
	 * @see #setConsignment(ConsignmentType)
	 */
	ConsignmentType getConsignment();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getConsignment <em>Consignment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consignment</em>' containment reference.
	 * @see #getConsignment()
	 */
	void setConsignment(ConsignmentType value);

	/**
	 * Returns the value of the '<em><b>Transport Contract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Transport_ Contract. Contract</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Transport Contact</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Transport</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Contract</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Contract</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transport Contract</em>' containment reference.
	 * @see #setTransportContract(ContractType)
	 */
	ContractType getTransportContract();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getTransportContract <em>Transport Contract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Contract</em>' containment reference.
	 * @see #getTransportContract()
	 */
	void setTransportContract(ContractType value);

	/**
	 * Returns the value of the '<em><b>Goods Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.GoodsItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Goods Item</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Goods Item (for Bulk Goods)</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Goods Item</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Goods Item</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Goods Item</em>' containment reference list.
	 */
	List getGoodsItem();

	/**
	 * Returns the value of the '<em><b>Shipment Stage</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.ShipmentStageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Shipment Stage</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Shipment Stage</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Shipment Stage</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Shipment Stage</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shipment Stage</em>' containment reference list.
	 */
	List getShipmentStage();

	/**
	 * Returns the value of the '<em><b>Delivery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Delivery</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Delivery</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Delivery</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Delivery</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delivery</em>' containment reference.
	 * @see #setDelivery(DeliveryType)
	 */
	DeliveryType getDelivery();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getDelivery <em>Delivery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery</em>' containment reference.
	 * @see #getDelivery()
	 */
	void setDelivery(DeliveryType value);

	/**
	 * Returns the value of the '<em><b>Transport Handling Unit</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.TransportHandlingUnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Transport Handling Unit</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Transport Handling Unit used for loose and containerized goods.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Transport Handling Unit</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Transport Handling Unit</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transport Handling Unit</em>' containment reference list.
	 */
	List getTransportHandlingUnit();

	/**
	 * Returns the value of the '<em><b>Origin Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Origin_ Address. Address</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the region in which the goods have been produced or manufactured, according to criteria laid down for the purposes of application of the Customs tariff, or quantitative restrictions, or of any other measure related to trade</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Origin</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Address</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Address</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Origin Address</em>' containment reference.
	 * @see #setOriginAddress(AddressType)
	 */
	AddressType getOriginAddress();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getOriginAddress <em>Origin Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Address</em>' containment reference.
	 * @see #getOriginAddress()
	 */
	void setOriginAddress(AddressType value);

	/**
	 * Returns the value of the '<em><b>First Arrival Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. First Arrival_ Port. Port</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>To identify the first arrival location. This would be a port for sea, airport for air and border post for land crossing.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>First Arrival</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Port</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Port</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First Arrival Port</em>' containment reference.
	 * @see #setFirstArrivalPort(PortType)
	 */
	PortType getFirstArrivalPort();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getFirstArrivalPort <em>First Arrival Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Arrival Port</em>' containment reference.
	 * @see #getFirstArrivalPort()
	 */
	void setFirstArrivalPort(PortType value);

	/**
	 * Returns the value of the '<em><b>Last Exit Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Last Exit_ Port. Port</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>To identify the final exporting location. This would be a port for sea, airport for air and border post for land crossing.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Last Exit</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Port</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Port</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Exit Port</em>' containment reference.
	 * @see #setLastExitPort(PortType)
	 */
	PortType getLastExitPort();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getLastExitPort <em>Last Exit Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Exit Port</em>' containment reference.
	 * @see #getLastExitPort()
	 */
	void setLastExitPort(PortType value);

	/**
	 * Returns the value of the '<em><b>Export Country</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Export_ Country. Country</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>To identify the country from which the goods are originally exported without any commercial transaction taken place in intermediate countries.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Export</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Country</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Country</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Country of exportation (WCO ID 062)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Export Country</em>' containment reference.
	 * @see #setExportCountry(CountryType)
	 */
	CountryType getExportCountry();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentType#getExportCountry <em>Export Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Export Country</em>' containment reference.
	 * @see #getExportCountry()
	 */
	void setExportCountry(CountryType value);

	/**
	 * Returns the value of the '<em><b>Freight Allowance Charge</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.AllowanceChargeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment. Freight_ Allowance Charge. Allowance Charge</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Costs incurred by the shipper in moving goods, by whatever means, from one place to another under the terms of the contract of carriage. In addition to transport costs, this may include such elements as packing, documentation, loading, unloading, and insurance (to the extent that they relate to the freight costs).</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment</ccts:ObjectClass>
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

} // ShipmentType