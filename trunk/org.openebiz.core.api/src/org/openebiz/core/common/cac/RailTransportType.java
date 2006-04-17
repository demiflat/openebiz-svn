/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.RailCarIDType;
import org.openebiz.core.common.cbc.TrainIDType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rail Transport Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Rail Transport. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Describes a train</ccts:Definition>
 *           <ccts:ObjectClass>Rail Transport</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.RailTransportType#getTrainID <em>Train ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.RailTransportType#getRailCarID <em>Rail Car ID</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface RailTransportType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Train ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Rail Transport. Train Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Identifier for a train</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Rail Transport</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Train Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Train Number (WCO ID 167)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Train ID</em>' containment reference.
	 * @see #setTrainID(TrainIDType)
	 */
	TrainIDType getTrainID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.RailTransportType#getTrainID <em>Train ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train ID</em>' containment reference.
	 * @see #getTrainID()
	 */
	void setTrainID(TrainIDType value);

	/**
	 * Returns the value of the '<em><b>Rail Car ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Rail Transport. Rail Car Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifer for the rail car on the train used for the means of transport</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Rail Transport</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Rail Car Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rail Car ID</em>' containment reference.
	 * @see #setRailCarID(RailCarIDType)
	 */
	RailCarIDType getRailCarID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.RailTransportType#getRailCarID <em>Rail Car ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rail Car ID</em>' containment reference.
	 * @see #getRailCarID()
	 */
	void setRailCarID(RailCarIDType value);

} // RailTransportType