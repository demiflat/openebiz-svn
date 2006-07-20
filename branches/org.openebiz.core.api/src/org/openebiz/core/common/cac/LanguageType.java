/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.LocaleCodeType;
import org.openebiz.core.common.cbc.NameType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Language. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about Language</ccts:Definition>
 *           <ccts:ObjectClass>Language</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.LanguageType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LanguageType#getName <em>Name</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LanguageType#getLocaleCode <em>Locale Code</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface LanguageType {
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
	 *               <ccts:DictionaryEntryName>Language. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An identifier for a Language expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Language</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LanguageType#getID <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' containment reference.
	 * @see #getID()
	 */
	void setID(IDType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Language. Name</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The name of the Language</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Language</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Name</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Name</ccts:RepresentationTerm>
	 *               <ccts:DataType>Name. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(NameType)
	 */
	NameType getName();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LanguageType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 */
	void setName(NameType value);

	/**
	 * Returns the value of the '<em><b>Locale Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Language. Locale. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The locale where the Language is used expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Language</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Locale</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locale Code</em>' containment reference.
	 * @see #setLocaleCode(LocaleCodeType)
	 */
	LocaleCodeType getLocaleCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LanguageType#getLocaleCode <em>Locale Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locale Code</em>' containment reference.
	 * @see #getLocaleCode()
	 */
	void setLocaleCode(LocaleCodeType value);

} // LanguageType