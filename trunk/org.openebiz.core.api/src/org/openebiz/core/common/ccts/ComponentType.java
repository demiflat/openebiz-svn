/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.ccts;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.ccts.ComponentType#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.ComponentType#getDictionaryEntryName <em>Dictionary Entry Name</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.ComponentType#getVersion <em>Version</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.ComponentType#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.ComponentType#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.ComponentType#getObjectClassQualifier <em>Object Class Qualifier</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.ComponentType#getObjectClass <em>Object Class</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.ComponentType#getPropertyTermQualifier <em>Property Term Qualifier</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.ComponentType#getPropertyTermPossessiveNoun <em>Property Term Possessive Noun</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.ComponentType#getPropertyTermPrimaryNoun <em>Property Term Primary Noun</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.ComponentType#getPropertyTerm <em>Property Term</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.ComponentType#getRepresentationTerm <em>Representation Term</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.ComponentType#getDataTypeQualifier <em>Data Type Qualifier</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.ComponentType#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.ComponentType#getAssociatedObjectClassQualifier <em>Associated Object Class Qualifier</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.ComponentType#getAssociatedObjectClass <em>Associated Object Class</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.ComponentType#getAlternativeBusinessTerms <em>Alternative Business Terms</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.ComponentType#getExamples <em>Examples</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.ComponentType#getPrimitiveType <em>Primitive Type</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.ComponentType#getPossibleValue <em>Possible Value</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.ComponentType#getContentComponentRestriction <em>Content Component Restriction</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.ComponentType#getRestrictionValue <em>Restriction Value</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface ComponentType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Type</em>' attribute.
	 * @see #setComponentType(String)
	 */
	String getComponentType();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ComponentType#getComponentType <em>Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Type</em>' attribute.
	 * @see #getComponentType()
	 */
	void setComponentType(String value);

	/**
	 * Returns the value of the '<em><b>Dictionary Entry Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dictionary Entry Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dictionary Entry Name</em>' attribute.
	 * @see #setDictionaryEntryName(String)
	 */
	String getDictionaryEntryName();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ComponentType#getDictionaryEntryName <em>Dictionary Entry Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dictionary Entry Name</em>' attribute.
	 * @see #getDictionaryEntryName()
	 */
	void setDictionaryEntryName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ComponentType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' attribute.
	 * @see #setDefinition(String)
	 */
	String getDefinition();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ComponentType#getDefinition <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' attribute.
	 * @see #getDefinition()
	 */
	void setDefinition(String value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see #setCardinality(String)
	 */
	String getCardinality();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ComponentType#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see #getCardinality()
	 */
	void setCardinality(String value);

	/**
	 * Returns the value of the '<em><b>Object Class Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Class Qualifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Class Qualifier</em>' attribute.
	 * @see #setObjectClassQualifier(String)
	 */
	String getObjectClassQualifier();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ComponentType#getObjectClassQualifier <em>Object Class Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Class Qualifier</em>' attribute.
	 * @see #getObjectClassQualifier()
	 */
	void setObjectClassQualifier(String value);

	/**
	 * Returns the value of the '<em><b>Object Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Class</em>' attribute.
	 * @see #setObjectClass(String)
	 */
	String getObjectClass();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ComponentType#getObjectClass <em>Object Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Class</em>' attribute.
	 * @see #getObjectClass()
	 */
	void setObjectClass(String value);

	/**
	 * Returns the value of the '<em><b>Property Term Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Term Qualifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Term Qualifier</em>' attribute.
	 * @see #setPropertyTermQualifier(String)
	 */
	String getPropertyTermQualifier();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ComponentType#getPropertyTermQualifier <em>Property Term Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Term Qualifier</em>' attribute.
	 * @see #getPropertyTermQualifier()
	 */
	void setPropertyTermQualifier(String value);

	/**
	 * Returns the value of the '<em><b>Property Term Possessive Noun</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Term Possessive Noun</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Term Possessive Noun</em>' attribute.
	 * @see #setPropertyTermPossessiveNoun(String)
	 */
	String getPropertyTermPossessiveNoun();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ComponentType#getPropertyTermPossessiveNoun <em>Property Term Possessive Noun</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Term Possessive Noun</em>' attribute.
	 * @see #getPropertyTermPossessiveNoun()
	 */
	void setPropertyTermPossessiveNoun(String value);

	/**
	 * Returns the value of the '<em><b>Property Term Primary Noun</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Term Primary Noun</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Term Primary Noun</em>' attribute.
	 * @see #setPropertyTermPrimaryNoun(String)
	 */
	String getPropertyTermPrimaryNoun();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ComponentType#getPropertyTermPrimaryNoun <em>Property Term Primary Noun</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Term Primary Noun</em>' attribute.
	 * @see #getPropertyTermPrimaryNoun()
	 */
	void setPropertyTermPrimaryNoun(String value);

	/**
	 * Returns the value of the '<em><b>Property Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Term</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Term</em>' attribute.
	 * @see #setPropertyTerm(String)
	 */
	String getPropertyTerm();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ComponentType#getPropertyTerm <em>Property Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Term</em>' attribute.
	 * @see #getPropertyTerm()
	 */
	void setPropertyTerm(String value);

	/**
	 * Returns the value of the '<em><b>Representation Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation Term</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation Term</em>' attribute.
	 * @see #setRepresentationTerm(String)
	 */
	String getRepresentationTerm();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ComponentType#getRepresentationTerm <em>Representation Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation Term</em>' attribute.
	 * @see #getRepresentationTerm()
	 */
	void setRepresentationTerm(String value);

	/**
	 * Returns the value of the '<em><b>Data Type Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type Qualifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type Qualifier</em>' attribute.
	 * @see #setDataTypeQualifier(String)
	 */
	String getDataTypeQualifier();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ComponentType#getDataTypeQualifier <em>Data Type Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type Qualifier</em>' attribute.
	 * @see #getDataTypeQualifier()
	 */
	void setDataTypeQualifier(String value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see #setDataType(String)
	 */
	String getDataType();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ComponentType#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see #getDataType()
	 */
	void setDataType(String value);

	/**
	 * Returns the value of the '<em><b>Associated Object Class Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associated Object Class Qualifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated Object Class Qualifier</em>' attribute.
	 * @see #setAssociatedObjectClassQualifier(String)
	 */
	String getAssociatedObjectClassQualifier();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ComponentType#getAssociatedObjectClassQualifier <em>Associated Object Class Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associated Object Class Qualifier</em>' attribute.
	 * @see #getAssociatedObjectClassQualifier()
	 */
	void setAssociatedObjectClassQualifier(String value);

	/**
	 * Returns the value of the '<em><b>Associated Object Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associated Object Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated Object Class</em>' attribute.
	 * @see #setAssociatedObjectClass(String)
	 */
	String getAssociatedObjectClass();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ComponentType#getAssociatedObjectClass <em>Associated Object Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associated Object Class</em>' attribute.
	 * @see #getAssociatedObjectClass()
	 */
	void setAssociatedObjectClass(String value);

	/**
	 * Returns the value of the '<em><b>Alternative Business Terms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternative Business Terms</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative Business Terms</em>' attribute.
	 * @see #setAlternativeBusinessTerms(String)
	 */
	String getAlternativeBusinessTerms();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ComponentType#getAlternativeBusinessTerms <em>Alternative Business Terms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternative Business Terms</em>' attribute.
	 * @see #getAlternativeBusinessTerms()
	 */
	void setAlternativeBusinessTerms(String value);

	/**
	 * Returns the value of the '<em><b>Examples</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Examples</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Examples</em>' attribute.
	 * @see #setExamples(String)
	 */
	String getExamples();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ComponentType#getExamples <em>Examples</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Examples</em>' attribute.
	 * @see #getExamples()
	 */
	void setExamples(String value);

	/**
	 * Returns the value of the '<em><b>Primitive Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Type</em>' attribute.
	 * @see #setPrimitiveType(String)
	 */
	String getPrimitiveType();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ComponentType#getPrimitiveType <em>Primitive Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Type</em>' attribute.
	 * @see #getPrimitiveType()
	 */
	void setPrimitiveType(String value);

	/**
	 * Returns the value of the '<em><b>Possible Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Possible Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possible Value</em>' attribute.
	 * @see #setPossibleValue(String)
	 */
	String getPossibleValue();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ComponentType#getPossibleValue <em>Possible Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Possible Value</em>' attribute.
	 * @see #getPossibleValue()
	 */
	void setPossibleValue(String value);

	/**
	 * Returns the value of the '<em><b>Content Component Restriction</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.ccts.ContentComponentRestrictionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Component Restriction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Component Restriction</em>' containment reference list.
	 */
	List getContentComponentRestriction();

	/**
	 * Returns the value of the '<em><b>Restriction Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restriction Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restriction Value</em>' attribute list.
	 */
	List getRestrictionValue();

} // ComponentType