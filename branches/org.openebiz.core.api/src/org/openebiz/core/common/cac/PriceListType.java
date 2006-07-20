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
import org.openebiz.core.common.cbc.StatusCodeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Price List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Price List. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about a Price List</ccts:Definition>
 *           <ccts:ObjectClass>Price List</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.PriceListType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PriceListType#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PriceListType#getValidityPeriod <em>Validity Period</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PriceListType#getPreviousPriceList <em>Previous Price List</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface PriceListType {
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
	 *               <ccts:DictionaryEntryName>Price List. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the Price List</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Price List</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PriceListType#getID <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' containment reference.
	 * @see #getID()
	 */
	void setID(IDType value);

	/**
	 * Returns the value of the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Price List. Status. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Identifies whether the price list is an 'original', 'copy', 'revision' or  'cancellation'</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Price List</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Status</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:Examples>"new - announcement only", "new and available", "deleted - announcement only"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Code</em>' containment reference.
	 * @see #setStatusCode(StatusCodeType)
	 */
	StatusCodeType getStatusCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PriceListType#getStatusCode <em>Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Code</em>' containment reference.
	 * @see #getStatusCode()
	 */
	void setStatusCode(StatusCodeType value);

	/**
	 * Returns the value of the '<em><b>Validity Period</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.PeriodType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Price List. Validity_ Period. Period</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Validity Period</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Price List</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Validity</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Period</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Period</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validity Period</em>' containment reference list.
	 */
	List getValidityPeriod();

	/**
	 * Returns the value of the '<em><b>Previous Price List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Price List. Previous_ Price List. Price List</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Previous Price List</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Price List</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Previous</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Price List</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Price List</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Previous Price List</em>' containment reference.
	 * @see #setPreviousPriceList(PriceListType)
	 */
	PriceListType getPreviousPriceList();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PriceListType#getPreviousPriceList <em>Previous Price List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Price List</em>' containment reference.
	 * @see #getPreviousPriceList()
	 */
	void setPreviousPriceList(PriceListType value);

} // PriceListType