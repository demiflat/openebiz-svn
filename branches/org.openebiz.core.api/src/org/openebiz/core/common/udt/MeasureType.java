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
 * A representation of the model object '<em><b>Measure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *             <ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2">UDT0000013</ccts:UniqueID>
 *             <ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2">UDT</ccts:CategoryCode>
 *             <ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Measure. Type</ccts:DictionaryEntryName>
 *             <ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2">1.0</ccts:VersionID>
 *             <ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2">A numeric value determined by measuring an object along with the specified unit of measure.</ccts:Definition>
 *             <ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Measure</ccts:RepresentationTermName>
 *             <ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Type</ccts:PropertyTermName>
 *             <ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2">decimal</ccts:PrimitiveType>
 *             <xsd:BuiltinType>decimal</xsd:BuiltinType>
 *          
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.udt.MeasureType#getValue <em>Value</em>}</li>
 *   <li>{@link org.openebiz.core.common.udt.MeasureType#getUnitCode <em>Unit Code</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface MeasureType {
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
	 * Sets the value of the '{@link org.openebiz.core.common.udt.MeasureType#getValue <em>Value</em>}' attribute.
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
	 *                      <ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2">UDT0000013-SC2</ccts:UniqueID>
	 *                      <ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2">SC</ccts:CategoryCode>
	 *                      <ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Measure Unit. Code</ccts:DictionaryEntryName>
	 *                      <ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2">The type of unit of measure.</ccts:Definition>
	 *                      <ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2">Measure Unit</ccts:ObjectClass>
	 *                      <ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Code</ccts:PropertyTermName>
	 *                      <ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Code</ccts:RepresentationTermName>
	 *                      <ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2">string</ccts:PrimitiveType>
	 *                      <xsd:BuiltinType>normalizedString</xsd:BuiltinType>
	 *                      <ccts:UsageRule xmlns:ccts="urn:un:unece:uncefact:documentation:2">Reference UN/ECE Rec 20 and X12 355.</ccts:UsageRule>
	 *                   
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit Code</em>' attribute.
	 * @see org.openebiz.core.common.unit.UnitCodeContentType
	 * @see #setUnitCode(UnitCodeContentType)
	 */
	UnitCodeContentType getUnitCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.udt.MeasureType#getUnitCode <em>Unit Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Code</em>' attribute.
	 * @see org.openebiz.core.common.unit.UnitCodeContentType
	 * @see #getUnitCode()
	 */
	void setUnitCode(UnitCodeContentType value);

} // MeasureType