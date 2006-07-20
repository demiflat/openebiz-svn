/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.udt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *             <ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2">UDT0000020</ccts:UniqueID>
 *             <ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2">UDT</ccts:CategoryCode>
 *             <ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Name. Type</ccts:DictionaryEntryName>
 *             <ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2">1.0</ccts:VersionID>
 *             <ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2">A character string that consititues the distinctive designation of a person, place, thing or concept.</ccts:Definition>
 *             <ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Name</ccts:RepresentationTermName>
 *             <ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2">string</ccts:PrimitiveType>
 *             <xsd:BuiltinType>string</xsd:BuiltinType>
 *          
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.udt.NameType#getValue <em>Value</em>}</li>
 *   <li>{@link org.openebiz.core.common.udt.NameType#getLanguageID <em>Language ID</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface NameType {
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
	 * @see #setValue(String)
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.udt.NameType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Language ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                      <ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2">UDT0000020-SC2</ccts:UniqueID>
	 *                      <ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2">SC</ccts:CategoryCode>
	 *                      <ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Language. Identifier</ccts:DictionaryEntryName>
	 *                      <ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2">The identifier of the language used in the content component.</ccts:Definition>
	 *                      <ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2">Language</ccts:ObjectClass>
	 *                      <ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identification</ccts:PropertyTermName>
	 *                      <ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identifier</ccts:RepresentationTermName>
	 *                      <ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2">string</ccts:PrimitiveType>
	 *                      <xsd:BuiltinType>language</xsd:BuiltinType>
	 *                   
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language ID</em>' attribute.
	 * @see #setLanguageID(String)
	 */
	String getLanguageID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.udt.NameType#getLanguageID <em>Language ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language ID</em>' attribute.
	 * @see #getLanguageID()
	 */
	void setLanguageID(String value);

} // NameType