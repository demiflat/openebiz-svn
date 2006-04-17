/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.VesselIDType;
import org.openebiz.core.common.cbc.VesselNameType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maritime Transport Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Maritime Transport. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Describes a water (including sea, river and canal) transport vessel.</ccts:Definition>
 *           <ccts:ObjectClass>Maritime Transport</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.MaritimeTransportType#getVesselID <em>Vessel ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.MaritimeTransportType#getVesselName <em>Vessel Name</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface MaritimeTransportType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Vessel ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Maritime Transport. Vessel Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>To identify a specific vessel</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Maritime Transport</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Vessel Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Lloyds Number, Registration Number (WCO ID 167)</ccts:AlternativeBusinessTerms>
	 *               <ccts:Examples>International Maritime Organisation number of a vessel</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vessel ID</em>' containment reference.
	 * @see #setVesselID(VesselIDType)
	 */
	VesselIDType getVesselID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.MaritimeTransportType#getVesselID <em>Vessel ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vessel ID</em>' containment reference.
	 * @see #getVesselID()
	 */
	void setVesselID(VesselIDType value);

	/**
	 * Returns the value of the '<em><b>Vessel Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Maritime Transport. Vessel Name. Name</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The name of the vessel</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Maritime Transport</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Vessel Name</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Name</ccts:RepresentationTerm>
	 *               <ccts:DataType>Name. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Ships Name</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vessel Name</em>' containment reference.
	 * @see #setVesselName(VesselNameType)
	 */
	VesselNameType getVesselName();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.MaritimeTransportType#getVesselName <em>Vessel Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vessel Name</em>' containment reference.
	 * @see #getVesselName()
	 */
	void setVesselName(VesselNameType value);

} // MaritimeTransportType