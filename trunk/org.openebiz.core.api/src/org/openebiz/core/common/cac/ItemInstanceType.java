/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import java.util.List;

import org.openebiz.core.common.cbc.ManufactureDateTimeType;
import org.openebiz.core.common.cbc.ProductTraceIDType;
import org.openebiz.core.common.cbc.RegistrationDateTimeType;
import org.openebiz.core.common.cbc.RegistrationIDType;
import org.openebiz.core.common.cbc.SerialIDType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Instance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Item Instance. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about a specific instance of an Item</ccts:Definition>
 *           <ccts:ObjectClass>Item Instance</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.ItemInstanceType#getProductTraceID <em>Product Trace ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemInstanceType#getManufactureDateTime <em>Manufacture Date Time</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemInstanceType#getRegistrationDateTime <em>Registration Date Time</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemInstanceType#getRegistrationID <em>Registration ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemInstanceType#getSerialID <em>Serial ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ItemInstanceType#getAdditionalItemProperty <em>Additional Item Property</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface ItemInstanceType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Product Trace ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item Instance. Product_ Trace Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An identifier used for tracing the Item such as EPC number used in RFID</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item Instance</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Product</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Trace Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product Trace ID</em>' containment reference.
	 * @see #setProductTraceID(ProductTraceIDType)
	 */
	ProductTraceIDType getProductTraceID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemInstanceType#getProductTraceID <em>Product Trace ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Trace ID</em>' containment reference.
	 * @see #getProductTraceID()
	 */
	void setProductTraceID(ProductTraceIDType value);

	/**
	 * Returns the value of the '<em><b>Manufacture Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item Instance. Manufacture Date Time. Date Time</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The date of manufacture of the Item Instance</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item Instance</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Manufacture Date Time</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date Time</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date Time. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacture Date Time</em>' containment reference.
	 * @see #setManufactureDateTime(ManufactureDateTimeType)
	 */
	ManufactureDateTimeType getManufactureDateTime();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemInstanceType#getManufactureDateTime <em>Manufacture Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacture Date Time</em>' containment reference.
	 * @see #getManufactureDateTime()
	 */
	void setManufactureDateTime(ManufactureDateTimeType value);

	/**
	 * Returns the value of the '<em><b>Registration Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item Instance. Registration Date Time. Date Time</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The date of registration of the Item Instance</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item Instance</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Registration Date Time</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date Time</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date Time. Type</ccts:DataType>
	 *               <ccts:Examples>date of first registration of a car.</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Registration Date Time</em>' containment reference.
	 * @see #setRegistrationDateTime(RegistrationDateTimeType)
	 */
	RegistrationDateTimeType getRegistrationDateTime();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemInstanceType#getRegistrationDateTime <em>Registration Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registration Date Time</em>' containment reference.
	 * @see #getRegistrationDateTime()
	 */
	void setRegistrationDateTime(RegistrationDateTimeType value);

	/**
	 * Returns the value of the '<em><b>Registration ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item Instance. Registration Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The registration identifier for the Item Instance</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item Instance</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Registration Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:Examples>car registration or licensing number</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Registration ID</em>' containment reference.
	 * @see #setRegistrationID(RegistrationIDType)
	 */
	RegistrationIDType getRegistrationID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemInstanceType#getRegistrationID <em>Registration ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registration ID</em>' containment reference.
	 * @see #getRegistrationID()
	 */
	void setRegistrationID(RegistrationIDType value);

	/**
	 * Returns the value of the '<em><b>Serial ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item Instance. Serial Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The serial number of the Item Instance</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item Instance</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Serial Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:Examples>chassis number of a car</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Serial ID</em>' containment reference.
	 * @see #setSerialID(SerialIDType)
	 */
	SerialIDType getSerialID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ItemInstanceType#getSerialID <em>Serial ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial ID</em>' containment reference.
	 * @see #getSerialID()
	 */
	void setSerialID(SerialIDType value);

	/**
	 * Returns the value of the '<em><b>Additional Item Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.ItemPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Item Instance. Additional_ Item Property. Item Property</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Additional Item Property</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Item Instance</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Additional</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Item Property</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Item Property</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Item Property</em>' containment reference list.
	 */
	List getAdditionalItemProperty();

} // ItemInstanceType