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
 * A representation of the model object '<em><b>Identifier Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *             <ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2">UDT0000011</ccts:UniqueID>
 *             <ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2">UDT</ccts:CategoryCode>
 *             <ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identifier. Type</ccts:DictionaryEntryName>
 *             <ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2">1.0</ccts:VersionID>
 *             <ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2">A character string to identify and distinguish uniquely, one instance of an object in an identification scheme from all other objects in the same scheme together with relevant supplementary information.</ccts:Definition>
 *             <ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identifier</ccts:RepresentationTermName>
 *             <ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2">string</ccts:PrimitiveType>
 *             <xsd:BuiltinType>normalizedString</xsd:BuiltinType>
 *             <ccts:UsageRule xmlns:ccts="urn:un:unece:uncefact:documentation:2">Other supplementary components in the CCT are captured as part of the token and name for the schema module containing the identifer list and thus, are not declared as attributes. </ccts:UsageRule>
 *          
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.udt.IdentifierType#getValue <em>Value</em>}</li>
 *   <li>{@link org.openebiz.core.common.udt.IdentifierType#getSchemeAgencyID <em>Scheme Agency ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.udt.IdentifierType#getSchemeAgencyName <em>Scheme Agency Name</em>}</li>
 *   <li>{@link org.openebiz.core.common.udt.IdentifierType#getSchemeDataURI <em>Scheme Data URI</em>}</li>
 *   <li>{@link org.openebiz.core.common.udt.IdentifierType#getSchemeID <em>Scheme ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.udt.IdentifierType#getSchemeName <em>Scheme Name</em>}</li>
 *   <li>{@link org.openebiz.core.common.udt.IdentifierType#getSchemeURI <em>Scheme URI</em>}</li>
 *   <li>{@link org.openebiz.core.common.udt.IdentifierType#getSchemeVersionID <em>Scheme Version ID</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface IdentifierType {
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
	 * Sets the value of the '{@link org.openebiz.core.common.udt.IdentifierType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Scheme Agency ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                   <ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2">UDT000011-SC4</ccts:UniqueID>
	 *                   <ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2">SC</ccts:CategoryCode>
	 *                   <ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identification Scheme Agency. Identifier</ccts:DictionaryEntryName>
	 *                   <ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2">The identification of the agency that maintains the identification scheme.</ccts:Definition>
	 *                   <ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identification Scheme Agency</ccts:ObjectClass>
	 *                   <ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identification</ccts:PropertyTermName>
	 *                   <ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identifier</ccts:RepresentationTermName>
	 *                   <ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2">string</ccts:PrimitiveType>
	 *                   <ccts:UsageRule xmlns:ccts="urn:un:unece:uncefact:documentation:2">Defaults to the UN/EDIFACT data element 3055 code list.</ccts:UsageRule>
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scheme Agency ID</em>' attribute.
	 * @see #setSchemeAgencyID(String)
	 */
	String getSchemeAgencyID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.udt.IdentifierType#getSchemeAgencyID <em>Scheme Agency ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheme Agency ID</em>' attribute.
	 * @see #getSchemeAgencyID()
	 */
	void setSchemeAgencyID(String value);

	/**
	 * Returns the value of the '<em><b>Scheme Agency Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                   <ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2">UDT000011-SC5</ccts:UniqueID>
	 *                   <ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2">SC</ccts:CategoryCode>
	 *                   <ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identification Scheme Agency. Name. Text</ccts:DictionaryEntryName>
	 *                   <ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2">The name of the agency that maintains the identification scheme.</ccts:Definition>
	 *                   <ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identification Scheme Agency</ccts:ObjectClass>
	 *                   <ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Agency Name</ccts:PropertyTermName>
	 *                   <ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Text</ccts:RepresentationTermName>
	 *                   <ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2">string</ccts:PrimitiveType>
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scheme Agency Name</em>' attribute.
	 * @see #setSchemeAgencyName(String)
	 */
	String getSchemeAgencyName();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.udt.IdentifierType#getSchemeAgencyName <em>Scheme Agency Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheme Agency Name</em>' attribute.
	 * @see #getSchemeAgencyName()
	 */
	void setSchemeAgencyName(String value);

	/**
	 * Returns the value of the '<em><b>Scheme Data URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                   <ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2">UDT0000011-SC7</ccts:UniqueID>
	 *                   <ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2">SC</ccts:CategoryCode>
	 *                   <ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identification Scheme Data. Uniform Resource. Identifier</ccts:DictionaryEntryName>
	 *                   <ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2">The Uniform Resource Identifier that identifies where the identification scheme data is located.</ccts:Definition>
	 *                   <ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identification Scheme Data</ccts:ObjectClass>
	 *                   <ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Uniform Resource Identifier</ccts:PropertyTermName>
	 *                   <ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identifier</ccts:RepresentationTermName>
	 *                   <ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2">string</ccts:PrimitiveType>
	 *                   <xsd:BuiltinType>anyURI</xsd:BuiltinType>
	 *                
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scheme Data URI</em>' attribute.
	 * @see #setSchemeDataURI(String)
	 */
	String getSchemeDataURI();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.udt.IdentifierType#getSchemeDataURI <em>Scheme Data URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheme Data URI</em>' attribute.
	 * @see #getSchemeDataURI()
	 */
	void setSchemeDataURI(String value);

	/**
	 * Returns the value of the '<em><b>Scheme ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                   <ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2">UDT000011-SC2</ccts:UniqueID>
	 *                   <ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2">SC</ccts:CategoryCode>
	 *                   <ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identification Scheme. Identifier</ccts:DictionaryEntryName>
	 *                   <ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2">The identification of the identification scheme.</ccts:Definition>
	 *                   <ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identification Scheme</ccts:ObjectClass>
	 *                   <ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identification</ccts:PropertyTermName>
	 *                   <ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identifier</ccts:RepresentationTermName>
	 *                   <ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2">string</ccts:PrimitiveType>
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scheme ID</em>' attribute.
	 * @see #setSchemeID(String)
	 */
	String getSchemeID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.udt.IdentifierType#getSchemeID <em>Scheme ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheme ID</em>' attribute.
	 * @see #getSchemeID()
	 */
	void setSchemeID(String value);

	/**
	 * Returns the value of the '<em><b>Scheme Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                   <ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2">UDT000011-SC3</ccts:UniqueID>
	 *                   <ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2">SC</ccts:CategoryCode>
	 *                   <ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identification Scheme. Name. Text</ccts:DictionaryEntryName>
	 *                   <ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2">The name of the identification scheme.</ccts:Definition>
	 *                   <ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identification Scheme</ccts:ObjectClass>
	 *                   <ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Name</ccts:PropertyTermName>
	 *                   <ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Text</ccts:RepresentationTermName>
	 *                   <ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2">string</ccts:PrimitiveType>
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scheme Name</em>' attribute.
	 * @see #setSchemeName(String)
	 */
	String getSchemeName();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.udt.IdentifierType#getSchemeName <em>Scheme Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheme Name</em>' attribute.
	 * @see #getSchemeName()
	 */
	void setSchemeName(String value);

	/**
	 * Returns the value of the '<em><b>Scheme URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                   <ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2">UDT0000011-SC8</ccts:UniqueID>
	 *                   <ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2">SC</ccts:CategoryCode>
	 *                   <ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identification Scheme. Uniform Resource. Identifier</ccts:DictionaryEntryName>
	 *                   <ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2">The Uniform Resource Identifier that identifies where the identification scheme is located.</ccts:Definition>
	 *                   <ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identification Scheme</ccts:ObjectClass>
	 *                   <ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Uniform Resource Identifier</ccts:PropertyTermName>
	 *                   <ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identifier</ccts:RepresentationTermName>
	 *                   <ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2">string</ccts:PrimitiveType>
	 *                   <xsd:BuiltinType>anyURI</xsd:BuiltinType>
	 *                
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scheme URI</em>' attribute.
	 * @see #setSchemeURI(String)
	 */
	String getSchemeURI();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.udt.IdentifierType#getSchemeURI <em>Scheme URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheme URI</em>' attribute.
	 * @see #getSchemeURI()
	 */
	void setSchemeURI(String value);

	/**
	 * Returns the value of the '<em><b>Scheme Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                   <ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2">UDT000011-SC6</ccts:UniqueID>
	 *                   <ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2">SC</ccts:CategoryCode>
	 *                   <ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identification Scheme. Version. Identifier</ccts:DictionaryEntryName>
	 *                   <ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2">The version of the identification scheme.</ccts:Definition>
	 *                   <ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identification Scheme</ccts:ObjectClass>
	 *                   <ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Version</ccts:PropertyTermName>
	 *                   <ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Identifier</ccts:RepresentationTermName>
	 *                   <ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2">string</ccts:PrimitiveType>
	 *                   <xsd:BuiltinType>normalizedString</xsd:BuiltinType>
	 *                
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scheme Version ID</em>' attribute.
	 * @see #setSchemeVersionID(String)
	 */
	String getSchemeVersionID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.udt.IdentifierType#getSchemeVersionID <em>Scheme Version ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheme Version ID</em>' attribute.
	 * @see #getSchemeVersionID()
	 */
	void setSchemeVersionID(String value);

} // IdentifierType