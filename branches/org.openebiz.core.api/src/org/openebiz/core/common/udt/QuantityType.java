/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.udt;

import java.math.BigDecimal;

import org.openebiz.core.common.unit.UnitCodeContentType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *             <ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2">UDT0000018</ccts:UniqueID>
 *             <ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2">UDT</ccts:CategoryCode>
 *             <ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Quantity. Type</ccts:DictionaryEntryName>
 *             <ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2">1.0</ccts:VersionID>
 *             <ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2">A counted number of non-monetary units possibly including fractions.</ccts:Definition>
 *             <ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Quantity</ccts:RepresentationTermName>
 *             <ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2">decimal</ccts:PrimitiveType>
 *             <xsd:BuiltinType>decimal</xsd:BuiltinType>
 *          
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.udt.QuantityType#getValue <em>Value</em>}</li>
 *   <li>{@link org.openebiz.core.common.udt.QuantityType#getUnitCode <em>Unit Code</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface QuantityType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BigDecimal)
	 */
	BigDecimal getValue();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.udt.QuantityType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 */
	void setValue(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Unit Code</b></em>' attribute.
	 * The default value is <code>"00"</code>.
	 * The literals are from the enumeration {@link org.openebiz.core.common.unit.UnitCodeContentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                      <ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2">UDT0000018-SC2</ccts:UniqueID>
	 *                      <ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2">SC</ccts:CategoryCode>
	 *                      <ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Quantity. Unit. Code</ccts:DictionaryEntryName>
	 *                      <ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2">The unit of the quantity</ccts:Definition>
	 *                      <ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2">Quantity</ccts:ObjectClass>
	 *                      <ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Unit Code</ccts:PropertyTermName>
	 *                      <ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Code</ccts:RepresentationTermName>
	 *                      <ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2">string</ccts:PrimitiveType>
	 *                      <xsd:BuiltinType>normalizedString</xsd:BuiltinType>
	 *                   
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit Code</em>' attribute.
	 * @see org.openebiz.core.common.unit.UnitCodeContentType
	 * @see #setUnitCode(UnitCodeContentType)
	 */
	UnitCodeContentType getUnitCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.udt.QuantityType#getUnitCode <em>Unit Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Code</em>' attribute.
	 * @see org.openebiz.core.common.unit.UnitCodeContentType
	 * @see #getUnitCode()
	 */
	void setUnitCode(UnitCodeContentType value);

} // QuantityType