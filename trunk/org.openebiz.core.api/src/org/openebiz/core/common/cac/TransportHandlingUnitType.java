/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import java.util.List;

import org.openebiz.core.common.cbc.HandlingCodeType;
import org.openebiz.core.common.cbc.HandlingInstructionsType;
import org.openebiz.core.common.cbc.HazardousRiskIndicatorType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.TotalGoodsItemQuantityType;
import org.openebiz.core.common.cbc.TotalPackageQuantityType;
import org.openebiz.core.common.cbc.TotalTransportEquipmentQuantityType;
import org.openebiz.core.common.cbc.TransportHandlingUnitTypeCodeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transport Handling Unit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Transport Handling Unit. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>A uniquely identifiable physical unit consisting of one or more packages (not necessarily containing the same articles) for enabling physical handling during the  transport process.</ccts:Definition>
 *           <ccts:ObjectClass>Transport Handling Unit</ccts:ObjectClass>
 *           <ccts:AlternativeBusinessTerms>Logistics Unit, Handling Unit, THU</ccts:AlternativeBusinessTerms>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getTransportHandlingUnitTypeCode <em>Transport Handling Unit Type Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getHandlingCode <em>Handling Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getHandlingInstructions <em>Handling Instructions</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getHazardousRiskIndicator <em>Hazardous Risk Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getTotalGoodsItemQuantity <em>Total Goods Item Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getDamageRemarks <em>Damage Remarks</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getShippingMarks <em>Shipping Marks</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getTotalTransportEquipmentQuantity <em>Total Transport Equipment Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getTotalPackageQuantity <em>Total Package Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getDespatchLine <em>Despatch Line</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getActualPackage <em>Actual Package</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getReceivedReceiptLine <em>Received Receipt Line</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getTransportEquipment <em>Transport Equipment</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getHazardousGoodsTransit <em>Hazardous Goods Transit</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getMeasurementDimension <em>Measurement Dimension</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getMinimumTemperature <em>Minimum Temperature</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getMaximumTemperature <em>Maximum Temperature</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface TransportHandlingUnitType {
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
	 *               <ccts:DictionaryEntryName>Transport Handling Unit. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the Transport Handling Unit</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Handling Unit</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getID <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' containment reference.
	 * @see #getID()
	 */
	void setID(IDType value);

	/**
	 * Returns the value of the '<em><b>Transport Handling Unit Type Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Handling Unit. Transport Handling Unit Type. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The type of Transport Handling Unit expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Handling Unit</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Transport Handling Unit Type</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transport Handling Unit Type Code</em>' containment reference.
	 * @see #setTransportHandlingUnitTypeCode(TransportHandlingUnitTypeCodeType)
	 */
	TransportHandlingUnitTypeCodeType getTransportHandlingUnitTypeCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getTransportHandlingUnitTypeCode <em>Transport Handling Unit Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Handling Unit Type Code</em>' containment reference.
	 * @see #getTransportHandlingUnitTypeCode()
	 */
	void setTransportHandlingUnitTypeCode(
			TransportHandlingUnitTypeCodeType value);

	/**
	 * Returns the value of the '<em><b>Handling Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Handling Unit. Handling Code. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The handling required for a Shipment expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Handling Unit</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getHandlingCode <em>Handling Code</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Transport Handling Unit. Handling Instructions. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Free form text describing Handling Instructions for a Shipment</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Handling Unit</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getHandlingInstructions <em>Handling Instructions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handling Instructions</em>' containment reference.
	 * @see #getHandlingInstructions()
	 */
	void setHandlingInstructions(HandlingInstructionsType value);

	/**
	 * Returns the value of the '<em><b>Hazardous Risk Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Handling Unit. Hazardous Risk Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An indicator as to whether the shipment contains hazardous materials</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Handling Unit</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Hazardous Risk Indicator</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *               <ccts:Examples>Default is negative</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hazardous Risk Indicator</em>' containment reference.
	 * @see #setHazardousRiskIndicator(HazardousRiskIndicatorType)
	 */
	HazardousRiskIndicatorType getHazardousRiskIndicator();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getHazardousRiskIndicator <em>Hazardous Risk Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hazardous Risk Indicator</em>' containment reference.
	 * @see #getHazardousRiskIndicator()
	 */
	void setHazardousRiskIndicator(HazardousRiskIndicatorType value);

	/**
	 * Returns the value of the '<em><b>Total Goods Item Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Handling Unit. Total_ Goods Item Quantity. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The total number of goods items in the Transport Handling Unit</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Handling Unit</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getTotalGoodsItemQuantity <em>Total Goods Item Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Goods Item Quantity</em>' containment reference.
	 * @see #getTotalGoodsItemQuantity()
	 */
	void setTotalGoodsItemQuantity(TotalGoodsItemQuantityType value);

	/**
	 * Returns the value of the '<em><b>Damage Remarks</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cbc.DamageRemarksType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Handling Unit. Damage Remarks. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Description of a type of damage.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Handling Unit</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Damage Remarks</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Damage Remarks</em>' containment reference list.
	 */
	List getDamageRemarks();

	/**
	 * Returns the value of the '<em><b>Shipping Marks</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cbc.ShippingMarksType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Handling Unit. Shipping Marks. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Free form description of the marks and numbers on a transport unit or package.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Handling Unit</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Shipping Marks</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Marks and Numbers, Shipping Marks</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shipping Marks</em>' containment reference list.
	 */
	List getShippingMarks();

	/**
	 * Returns the value of the '<em><b>Total Transport Equipment Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Handling Unit. Total_ Transport Equipment Quantity. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Count of the number of pieces of transport equipment in a THU, such as containers and similar unit load devices.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Handling Unit</ccts:ObjectClass>
	 * 
	 *               <ccts:PropertyTermQualifier>Total</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Transport Equipment Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Number of containers (WCO ID 150)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Transport Equipment Quantity</em>' containment reference.
	 * @see #setTotalTransportEquipmentQuantity(TotalTransportEquipmentQuantityType)
	 */
	TotalTransportEquipmentQuantityType getTotalTransportEquipmentQuantity();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getTotalTransportEquipmentQuantity <em>Total Transport Equipment Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Transport Equipment Quantity</em>' containment reference.
	 * @see #getTotalTransportEquipmentQuantity()
	 */
	void setTotalTransportEquipmentQuantity(
			TotalTransportEquipmentQuantityType value);

	/**
	 * Returns the value of the '<em><b>Total Package Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Handling Unit. Total_ Package Quantity. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Count of total number of packages of the entire THU.</ccts:Definition>
	 * 
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Handling Unit</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Total</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Package Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Package Quantity</em>' containment reference.
	 * @see #setTotalPackageQuantity(TotalPackageQuantityType)
	 */
	TotalPackageQuantityType getTotalPackageQuantity();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getTotalPackageQuantity <em>Total Package Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Package Quantity</em>' containment reference.
	 * @see #getTotalPackageQuantity()
	 */
	void setTotalPackageQuantity(TotalPackageQuantityType value);

	/**
	 * Returns the value of the '<em><b>Despatch Line</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.DespatchLineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Handling Unit. Despatch Line</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Handling Unit Despatch Line</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Handling Unit</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Despatch Line</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Despatch Line</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Despatch Line</em>' containment reference list.
	 */
	List getDespatchLine();

	/**
	 * Returns the value of the '<em><b>Actual Package</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.PackageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Handling Unit. Actual_ Package. Package</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Actual Package</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Handling Unit</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Actual</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Package</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Package</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Package</em>' containment reference list.
	 */
	List getActualPackage();

	/**
	 * Returns the value of the '<em><b>Received Receipt Line</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.ReceiptLineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Handling Unit. Received_ Receipt Line. Receipt Line</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Receipt Line</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Handling Unit</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Received</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Receipt Line</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Receipt Line</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Received Receipt Line</em>' containment reference list.
	 */
	List getReceivedReceiptLine();

	/**
	 * Returns the value of the '<em><b>Transport Equipment</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.TransportEquipmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Handling Unit. Transport Equipment</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Transport Equipment</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Handling Unit</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Transport Equipment</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Transport Equipment</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transport Equipment</em>' containment reference list.
	 */
	List getTransportEquipment();

	/**
	 * Returns the value of the '<em><b>Hazardous Goods Transit</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.HazardousGoodsTransitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Handling Unit. Hazardous Goods Transit</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to information about the transportation of hazardous goods.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Handling Unit</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Hazardous Goods Transit</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Hazardous Goods Transit</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hazardous Goods Transit</em>' containment reference list.
	 */
	List getHazardousGoodsTransit();

	/**
	 * Returns the value of the '<em><b>Measurement Dimension</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.DimensionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Handling Unit. Measurement_ Dimension. Dimension</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Dimension</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Handling Unit</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Measurement</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Dimension</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Dimension</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measurement Dimension</em>' containment reference list.
	 */
	List getMeasurementDimension();

	/**
	 * Returns the value of the '<em><b>Minimum Temperature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Handling Unit. Minimum_ Temperature. Temperature</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The minimum required operating temperature</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Handling Unit</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Minimum</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Temperature</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Temperature</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Temperature</em>' containment reference.
	 * @see #setMinimumTemperature(TemperatureType)
	 */
	TemperatureType getMinimumTemperature();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getMinimumTemperature <em>Minimum Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Temperature</em>' containment reference.
	 * @see #getMinimumTemperature()
	 */
	void setMinimumTemperature(TemperatureType value);

	/**
	 * Returns the value of the '<em><b>Maximum Temperature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Handling Unit. Maximum_ Temperature. Temperature</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The maximum required operating termperature</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Handling Unit</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Maximum</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Temperature</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Temperature</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Temperature</em>' containment reference.
	 * @see #setMaximumTemperature(TemperatureType)
	 */
	TemperatureType getMaximumTemperature();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportHandlingUnitType#getMaximumTemperature <em>Maximum Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Temperature</em>' containment reference.
	 * @see #getMaximumTemperature()
	 */
	void setMaximumTemperature(TemperatureType value);

} // TransportHandlingUnitType