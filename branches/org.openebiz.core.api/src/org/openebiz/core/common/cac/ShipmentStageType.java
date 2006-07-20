/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import java.util.List;

import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.OnCarriageIndicatorType;
import org.openebiz.core.common.cbc.PreCarriageIndicatorType;
import org.openebiz.core.common.cbc.TransitDirectionCodeType;
import org.openebiz.core.common.cbc.TransportMeansTypeCodeType;
import org.openebiz.core.common.cbc.TransportModeCodeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipment Stage Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Shipment Stage. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about a Shipment Stage</ccts:Definition>
 *           <ccts:ObjectClass>Shipment Stage</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentStageType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentStageType#getTransportModeCode <em>Transport Mode Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentStageType#getTransportMeansTypeCode <em>Transport Means Type Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentStageType#getTransitDirectionCode <em>Transit Direction Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentStageType#getPreCarriageIndicator <em>Pre Carriage Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentStageType#getOnCarriageIndicator <em>On Carriage Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentStageType#getTransitPeriod <em>Transit Period</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentStageType#getCarrierParty <em>Carrier Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentStageType#getTransportMeans <em>Transport Means</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentStageType#getLoadingPort <em>Loading Port</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentStageType#getUnloadingPort <em>Unloading Port</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ShipmentStageType#getTransshipPort <em>Transship Port</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface ShipmentStageType {
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
	 *               <ccts:DictionaryEntryName>Shipment Stage. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for a Shipment Stage</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment Stage</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:Examples>"1","2", etc..</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID</em>' containment reference.
	 * @see #setID(IDType)
	 */
	IDType getID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentStageType#getID <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' containment reference.
	 * @see #getID()
	 */
	void setID(IDType value);

	/**
	 * Returns the value of the '<em><b>Transport Mode Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment Stage. Transport Mode. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The method of transport used for a Shipment Stage</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment Stage</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Transport Mode</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transport Mode Code</em>' containment reference.
	 * @see #setTransportModeCode(TransportModeCodeType)
	 */
	TransportModeCodeType getTransportModeCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentStageType#getTransportModeCode <em>Transport Mode Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Mode Code</em>' containment reference.
	 * @see #getTransportModeCode()
	 */
	void setTransportModeCode(TransportModeCodeType value);

	/**
	 * Returns the value of the '<em><b>Transport Means Type Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment Stage. Transport Means Type. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The type of vehicle used for a Shipment Stage</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment Stage</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Transport Means Type</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transport Means Type Code</em>' containment reference.
	 * @see #setTransportMeansTypeCode(TransportMeansTypeCodeType)
	 */
	TransportMeansTypeCodeType getTransportMeansTypeCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentStageType#getTransportMeansTypeCode <em>Transport Means Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Means Type Code</em>' containment reference.
	 * @see #getTransportMeansTypeCode()
	 */
	void setTransportMeansTypeCode(TransportMeansTypeCodeType value);

	/**
	 * Returns the value of the '<em><b>Transit Direction Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment Stage. Transit Direction. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The direction of transit for a Shipment Stage</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment Stage</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Transit Direction</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transit Direction Code</em>' containment reference.
	 * @see #setTransitDirectionCode(TransitDirectionCodeType)
	 */
	TransitDirectionCodeType getTransitDirectionCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentStageType#getTransitDirectionCode <em>Transit Direction Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transit Direction Code</em>' containment reference.
	 * @see #getTransitDirectionCode()
	 */
	void setTransitDirectionCode(TransitDirectionCodeType value);

	/**
	 * Returns the value of the '<em><b>Pre Carriage Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment Stage. Pre Carriage Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An indicator as the whether the stage is before the main carriage of the shipment</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment Stage</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Pre Carriage Indicator</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *               <ccts:Examples>Truck delivery to wharf</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pre Carriage Indicator</em>' containment reference.
	 * @see #setPreCarriageIndicator(PreCarriageIndicatorType)
	 */
	PreCarriageIndicatorType getPreCarriageIndicator();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentStageType#getPreCarriageIndicator <em>Pre Carriage Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Carriage Indicator</em>' containment reference.
	 * @see #getPreCarriageIndicator()
	 */
	void setPreCarriageIndicator(PreCarriageIndicatorType value);

	/**
	 * Returns the value of the '<em><b>On Carriage Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment Stage. On Carriage Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An indicator as the whether the stage is after the main carriage of the shipment</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment Stage</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>On Carriage Indicator</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *               <ccts:Examples>Truck delivery from wharf</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Carriage Indicator</em>' containment reference.
	 * @see #setOnCarriageIndicator(OnCarriageIndicatorType)
	 */
	OnCarriageIndicatorType getOnCarriageIndicator();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentStageType#getOnCarriageIndicator <em>On Carriage Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Carriage Indicator</em>' containment reference.
	 * @see #getOnCarriageIndicator()
	 */
	void setOnCarriageIndicator(OnCarriageIndicatorType value);

	/**
	 * Returns the value of the '<em><b>Transit Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment Stage. Transit_ Period. Period</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Transit Period</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment Stage</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Transit</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Period</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Period</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transit Period</em>' containment reference.
	 * @see #setTransitPeriod(PeriodType)
	 */
	PeriodType getTransitPeriod();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentStageType#getTransitPeriod <em>Transit Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transit Period</em>' containment reference.
	 * @see #getTransitPeriod()
	 */
	void setTransitPeriod(PeriodType value);

	/**
	 * Returns the value of the '<em><b>Carrier Party</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.PartyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment Stage. Carrier_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Carrier</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment Stage</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Carrier</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Carrier Party</em>' containment reference list.
	 */
	List getCarrierParty();

	/**
	 * Returns the value of the '<em><b>Transport Means</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment Stage. Transport Means</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the means of transport</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment Stage</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Transport Means</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Transport Means</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transport Means</em>' containment reference.
	 * @see #setTransportMeans(TransportMeansType)
	 */
	TransportMeansType getTransportMeans();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentStageType#getTransportMeans <em>Transport Means</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Means</em>' containment reference.
	 * @see #getTransportMeans()
	 */
	void setTransportMeans(TransportMeansType value);

	/**
	 * Returns the value of the '<em><b>Loading Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 * 
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment Stage. Loading_ Port. Port</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the port of loading</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment Stage</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Loading</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Port</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Port</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loading Port</em>' containment reference.
	 * @see #setLoadingPort(PortType)
	 */
	PortType getLoadingPort();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentStageType#getLoadingPort <em>Loading Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loading Port</em>' containment reference.
	 * @see #getLoadingPort()
	 */
	void setLoadingPort(PortType value);

	/**
	 * Returns the value of the '<em><b>Unloading Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment Stage. Unloading_ Port. Port</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the port of unloading</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment Stage</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Unloading</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Port</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Port</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unloading Port</em>' containment reference.
	 * @see #setUnloadingPort(PortType)
	 */
	PortType getUnloadingPort();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentStageType#getUnloadingPort <em>Unloading Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unloading Port</em>' containment reference.
	 * @see #getUnloadingPort()
	 */
	void setUnloadingPort(PortType value);

	/**
	 * Returns the value of the '<em><b>Transship Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Shipment Stage. Transship_ Port. Port</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the port of transshipment</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Shipment Stage</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Transship</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Port</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Port</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transship Port</em>' containment reference.
	 * @see #setTransshipPort(PortType)
	 */
	PortType getTransshipPort();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ShipmentStageType#getTransshipPort <em>Transship Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transship Port</em>' containment reference.
	 * @see #getTransshipPort()
	 */
	void setTransshipPort(PortType value);

} // ShipmentStageType