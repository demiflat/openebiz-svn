/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.sdt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Longitude Direction Code Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>DT</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Longitude Direction_ Code. Type</ccts:DictionaryEntryName>
 *           <ccts:Version>2</ccts:Version>
 *           <ccts:Definition>The possible directions of longitude</ccts:Definition>
 *           <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
 *           <ccts:DataTypeQualifier>Longitude Direction</ccts:DataTypeQualifier>
 *           <ccts:DataType>Code. Type</ccts:DataType>
 *         </ccts:Component>
 *         <ccts:Instance xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2"/>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.sdt.LongitudeDirectionCodeType#getValue <em>Value</em>}</li>
 *   <li>{@link org.openebiz.core.common.sdt.LongitudeDirectionCodeType#getLanguageID <em>Language ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.sdt.LongitudeDirectionCodeType#getListAgencyID <em>List Agency ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.sdt.LongitudeDirectionCodeType#getListAgencyName <em>List Agency Name</em>}</li>
 *   <li>{@link org.openebiz.core.common.sdt.LongitudeDirectionCodeType#getListID <em>List ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.sdt.LongitudeDirectionCodeType#getListName <em>List Name</em>}</li>
 *   <li>{@link org.openebiz.core.common.sdt.LongitudeDirectionCodeType#getListSchemeURI <em>List Scheme URI</em>}</li>
 *   <li>{@link org.openebiz.core.common.sdt.LongitudeDirectionCodeType#getListURI <em>List URI</em>}</li>
 *   <li>{@link org.openebiz.core.common.sdt.LongitudeDirectionCodeType#getListVersionID <em>List Version ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.sdt.LongitudeDirectionCodeType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface LongitudeDirectionCodeType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
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
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.sdt.LongitudeDirectionCodeType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Language ID</b></em>' attribute.
	 * The default value is <code>"en"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *                 <ccts:ComponentType>SC</ccts:ComponentType>
	 *                 <ccts:DictionaryEntryName>Longitude Direction_ Language. Identifier</ccts:DictionaryEntryName>
	 *                 <ccts:Version/>
	 *                 <ccts:Definition/>
	 *                 <ccts:PrimitiveType>String</ccts:PrimitiveType>
	 *               </ccts:Component>
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language ID</em>' attribute.
	 * @see #setLanguageID(String)
	 * @generated
	 */
	String getLanguageID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.sdt.LongitudeDirectionCodeType#getLanguageID <em>Language ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language ID</em>' attribute.
	 * @see #getLanguageID()
	 * @generated
	 */
	void setLanguageID(String value);

	/**
	 * Returns the value of the '<em><b>List Agency ID</b></em>' attribute.
	 * The default value is <code>"UBL"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *                 <ccts:ComponentType>SC</ccts:ComponentType>
	 *                 <ccts:DictionaryEntryName>Longitude Direction_ Code List. Agency. Identifier</ccts:DictionaryEntryName>
	 *                 <ccts:Version/>
	 *                 <ccts:Definition/>
	 *                 <ccts:PrimitiveType>String</ccts:PrimitiveType>
	 *               </ccts:Component>
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>List Agency ID</em>' attribute.
	 * @see #setListAgencyID(String)
	 * @generated
	 */
	String getListAgencyID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.sdt.LongitudeDirectionCodeType#getListAgencyID <em>List Agency ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Agency ID</em>' attribute.
	 * @see #getListAgencyID()
	 * @generated
	 */
	void setListAgencyID(String value);

	/**
	 * Returns the value of the '<em><b>List Agency Name</b></em>' attribute.
	 * The default value is <code>"OASIS Universal Business Language"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *                 <ccts:ComponentType>SC</ccts:ComponentType>
	 *                 <ccts:DictionaryEntryName>Longitude Direction_ Code List. Agency Name. Text</ccts:DictionaryEntryName>
	 *                 <ccts:Version/>
	 *                 <ccts:Definition/>
	 *                 <ccts:PrimitiveType>String</ccts:PrimitiveType>
	 *               </ccts:Component>
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>List Agency Name</em>' attribute.
	 * @see #setListAgencyName(String)
	 * @generated
	 */
	String getListAgencyName();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.sdt.LongitudeDirectionCodeType#getListAgencyName <em>List Agency Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Agency Name</em>' attribute.
	 * @see #getListAgencyName()
	 * @generated
	 */
	void setListAgencyName(String value);

	/**
	 * Returns the value of the '<em><b>List ID</b></em>' attribute.
	 * The default value is <code>"Longitude Direction"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *                 <ccts:ComponentType>SC</ccts:ComponentType>
	 *                 <ccts:DictionaryEntryName>Longitude Direction_ Code List. Identifier</ccts:DictionaryEntryName>
	 *                 <ccts:Version/>
	 *                 <ccts:Definition/>
	 *                 <ccts:PrimitiveType>String</ccts:PrimitiveType>
	 *               </ccts:Component>
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>List ID</em>' attribute.
	 * @see #setListID(String)
	 * @generated
	 */
	String getListID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.sdt.LongitudeDirectionCodeType#getListID <em>List ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List ID</em>' attribute.
	 * @see #getListID()
	 * @generated
	 */
	void setListID(String value);

	/**
	 * Returns the value of the '<em><b>List Name</b></em>' attribute.
	 * The default value is <code>"Longitude Direction"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *                 <ccts:ComponentType>SC</ccts:ComponentType>
	 *                 <ccts:DictionaryEntryName>Longitude Direction_ Code List. Name. Text</ccts:DictionaryEntryName>
	 *                 <ccts:Version/>
	 *                 <ccts:Definition/>
	 *                 <ccts:PrimitiveType>String</ccts:PrimitiveType>
	 *               </ccts:Component>
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>List Name</em>' attribute.
	 * @see #setListName(String)
	 * @generated
	 */
	String getListName();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.sdt.LongitudeDirectionCodeType#getListName <em>List Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Name</em>' attribute.
	 * @see #getListName()
	 * @generated
	 */
	void setListName(String value);

	/**
	 * Returns the value of the '<em><b>List Scheme URI</b></em>' attribute.
	 * The default value is <code>"urn:oasis:names:specification:ubl:schema:xsd:LongitudeDirectionCode-1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *                 <ccts:ComponentType>SC</ccts:ComponentType>
	 *                 <ccts:DictionaryEntryName>Longitude Direction_ Code List Scheme. Uniform Resource. Identifier</ccts:DictionaryEntryName>
	 *                 <ccts:Version/>
	 *                 <ccts:Definition/>
	 *                 <ccts:PrimitiveType>String</ccts:PrimitiveType>
	 *               </ccts:Component>
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>List Scheme URI</em>' attribute.
	 * @see #setListSchemeURI(String)
	 * @generated
	 */
	String getListSchemeURI();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.sdt.LongitudeDirectionCodeType#getListSchemeURI <em>List Scheme URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Scheme URI</em>' attribute.
	 * @see #getListSchemeURI()
	 * @generated
	 */
	void setListSchemeURI(String value);

	/**
	 * Returns the value of the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *                 <ccts:ComponentType>SC</ccts:ComponentType>
	 *                 <ccts:DictionaryEntryName>Longitude Direction_ Code List. Uniform Resource. Identifier</ccts:DictionaryEntryName>
	 *                 <ccts:Version/>
	 *                 <ccts:Definition/>
	 *                 <ccts:PrimitiveType>String</ccts:PrimitiveType>
	 *               </ccts:Component>
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>List URI</em>' attribute.
	 * @see #setListURI(String)
	 * @generated
	 */
	String getListURI();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.sdt.LongitudeDirectionCodeType#getListURI <em>List URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List URI</em>' attribute.
	 * @see #getListURI()
	 * @generated
	 */
	void setListURI(String value);

	/**
	 * Returns the value of the '<em><b>List Version ID</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *                 <ccts:ComponentType>SC</ccts:ComponentType>
	 *                 <ccts:DictionaryEntryName>Longitude Direction_ Code List. Version. Identifier</ccts:DictionaryEntryName>
	 *                 <ccts:Version/>
	 *                 <ccts:Definition/>
	 *                 <ccts:PrimitiveType>String</ccts:PrimitiveType>
	 *               </ccts:Component>
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>List Version ID</em>' attribute.
	 * @see #setListVersionID(String)
	 * @generated
	 */
	String getListVersionID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.sdt.LongitudeDirectionCodeType#getListVersionID <em>List Version ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Version ID</em>' attribute.
	 * @see #getListVersionID()
	 * @generated
	 */
	void setListVersionID(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *                 <ccts:ComponentType>SC</ccts:ComponentType>
	 *                 <ccts:DictionaryEntryName>Longitude Direction_ Code. Name. Text</ccts:DictionaryEntryName>
	 *                 <ccts:Version/>
	 *                 <ccts:Definition/>
	 *                 <ccts:PrimitiveType>String</ccts:PrimitiveType>
	 *               </ccts:Component>
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.sdt.LongitudeDirectionCodeType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // LongitudeDirectionCodeType