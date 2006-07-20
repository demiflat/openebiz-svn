/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.FreightRateClassCodeType;
import org.openebiz.core.common.cbc.PriorityType;
import org.openebiz.core.common.cbc.ServiceCodeType;
import org.openebiz.core.common.cbc.TariffClassCodeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transportation Service Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Transportation Service. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition/>
 *           <ccts:ObjectClass>Transportation Service</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.TransportationServiceType#getServiceCode <em>Service Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportationServiceType#getTariffClassCode <em>Tariff Class Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportationServiceType#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportationServiceType#getFreightRateClassCode <em>Freight Rate Class Code</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface TransportationServiceType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Service Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transportation Service. Service. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A code which describes the general type of service required for the transportation of goods. Specifically, it identifies the extent of the transportation service. E.g. door-to-door, port-to-port.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transportation Service</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Service</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Code</em>' containment reference.
	 * @see #setServiceCode(ServiceCodeType)
	 */
	ServiceCodeType getServiceCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportationServiceType#getServiceCode <em>Service Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Code</em>' containment reference.
	 * @see #getServiceCode()
	 */
	void setServiceCode(ServiceCodeType value);

	/**
	 * Returns the value of the '<em><b>Tariff Class Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transportation Service. Tariff Class. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Specification of a tariff class applicable to a transportation service.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transportation Service</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Tariff Class</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Tariff Class Specifier</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tariff Class Code</em>' containment reference.
	 * @see #setTariffClassCode(TariffClassCodeType)
	 */
	TariffClassCodeType getTariffClassCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportationServiceType#getTariffClassCode <em>Tariff Class Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tariff Class Code</em>' containment reference.
	 * @see #getTariffClassCode()
	 */
	void setTariffClassCode(TariffClassCodeType value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transportation Service. Priority. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Statement indicating priority of requested transportion service.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transportation Service</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Priority</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(PriorityType)
	 */
	PriorityType getPriority();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportationServiceType#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 */
	void setPriority(PriorityType value);

	/**
	 * Returns the value of the '<em><b>Freight Rate Class Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transportation Service. Freight Rate Class. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Code to indicate applicable rate class for freight.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transportation Service</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Freight Rate Class</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Charge Basis</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Freight Rate Class Code</em>' containment reference.
	 * @see #setFreightRateClassCode(FreightRateClassCodeType)
	 */
	FreightRateClassCodeType getFreightRateClassCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportationServiceType#getFreightRateClassCode <em>Freight Rate Class Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Freight Rate Class Code</em>' containment reference.
	 * @see #getFreightRateClassCode()
	 */
	void setFreightRateClassCode(FreightRateClassCodeType value);

} // TransportationServiceType