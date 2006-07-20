/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.ccts;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

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
 * @generated
 */
public class ComponentType implements Serializable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Open E-Biz - Darrell Kundel"; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getComponentType() <em>Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentType()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentType() <em>Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentType()
	 * @generated
	 * @ordered
	 */
	protected String componentType = COMPONENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDictionaryEntryName() <em>Dictionary Entry Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDictionaryEntryName()
	 * @generated
	 * @ordered
	 */
	protected static final String DICTIONARY_ENTRY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDictionaryEntryName() <em>Dictionary Entry Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDictionaryEntryName()
	 * @generated
	 * @ordered
	 */
	protected String dictionaryEntryName = DICTIONARY_ENTRY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefinition() <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFINITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected String definition = DEFINITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final String CARDINALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected String cardinality = CARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjectClassQualifier() <em>Object Class Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectClassQualifier()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_CLASS_QUALIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectClassQualifier() <em>Object Class Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectClassQualifier()
	 * @generated
	 * @ordered
	 */
	protected String objectClassQualifier = OBJECT_CLASS_QUALIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjectClass() <em>Object Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectClass()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectClass() <em>Object Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectClass()
	 * @generated
	 * @ordered
	 */
	protected String objectClass = OBJECT_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropertyTermQualifier() <em>Property Term Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyTermQualifier()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_TERM_QUALIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyTermQualifier() <em>Property Term Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyTermQualifier()
	 * @generated
	 * @ordered
	 */
	protected String propertyTermQualifier = PROPERTY_TERM_QUALIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropertyTermPossessiveNoun() <em>Property Term Possessive Noun</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyTermPossessiveNoun()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_TERM_POSSESSIVE_NOUN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyTermPossessiveNoun() <em>Property Term Possessive Noun</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyTermPossessiveNoun()
	 * @generated
	 * @ordered
	 */
	protected String propertyTermPossessiveNoun = PROPERTY_TERM_POSSESSIVE_NOUN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropertyTermPrimaryNoun() <em>Property Term Primary Noun</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyTermPrimaryNoun()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_TERM_PRIMARY_NOUN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyTermPrimaryNoun() <em>Property Term Primary Noun</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyTermPrimaryNoun()
	 * @generated
	 * @ordered
	 */
	protected String propertyTermPrimaryNoun = PROPERTY_TERM_PRIMARY_NOUN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropertyTerm() <em>Property Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyTerm()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_TERM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyTerm() <em>Property Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyTerm()
	 * @generated
	 * @ordered
	 */
	protected String propertyTerm = PROPERTY_TERM_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepresentationTerm() <em>Representation Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentationTerm()
	 * @generated
	 * @ordered
	 */
	protected static final String REPRESENTATION_TERM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepresentationTerm() <em>Representation Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentationTerm()
	 * @generated
	 * @ordered
	 */
	protected String representationTerm = REPRESENTATION_TERM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataTypeQualifier() <em>Data Type Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypeQualifier()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_TYPE_QUALIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataTypeQualifier() <em>Data Type Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypeQualifier()
	 * @generated
	 * @ordered
	 */
	protected String dataTypeQualifier = DATA_TYPE_QUALIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected String dataType = DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssociatedObjectClassQualifier() <em>Associated Object Class Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedObjectClassQualifier()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSOCIATED_OBJECT_CLASS_QUALIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssociatedObjectClassQualifier() <em>Associated Object Class Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedObjectClassQualifier()
	 * @generated
	 * @ordered
	 */
	protected String associatedObjectClassQualifier = ASSOCIATED_OBJECT_CLASS_QUALIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssociatedObjectClass() <em>Associated Object Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedObjectClass()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSOCIATED_OBJECT_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssociatedObjectClass() <em>Associated Object Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedObjectClass()
	 * @generated
	 * @ordered
	 */
	protected String associatedObjectClass = ASSOCIATED_OBJECT_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlternativeBusinessTerms() <em>Alternative Business Terms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeBusinessTerms()
	 * @generated
	 * @ordered
	 */
	protected static final String ALTERNATIVE_BUSINESS_TERMS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlternativeBusinessTerms() <em>Alternative Business Terms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeBusinessTerms()
	 * @generated
	 * @ordered
	 */
	protected String alternativeBusinessTerms = ALTERNATIVE_BUSINESS_TERMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getExamples() <em>Examples</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExamples()
	 * @generated
	 * @ordered
	 */
	protected static final String EXAMPLES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExamples() <em>Examples</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExamples()
	 * @generated
	 * @ordered
	 */
	protected String examples = EXAMPLES_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimitiveType() <em>Primitive Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveType()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIMITIVE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimitiveType() <em>Primitive Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveType()
	 * @generated
	 * @ordered
	 */
	protected String primitiveType = PRIMITIVE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPossibleValue() <em>Possible Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleValue()
	 * @generated
	 * @ordered
	 */
	protected static final String POSSIBLE_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPossibleValue() <em>Possible Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleValue()
	 * @generated
	 * @ordered
	 */
	protected String possibleValue = POSSIBLE_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContentComponentRestriction() <em>Content Component Restriction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentComponentRestriction()
	 * @generated
	 * @ordered
	 */
	protected List contentComponentRestriction = null;

	/**
	 * The cached value of the '{@link #getRestrictionValue() <em>Restriction Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestrictionValue()
	 * @generated
	 * @ordered
	 */
	protected List restrictionValue = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType() {
		super();
	}

	/**
	 * Returns the value of the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Component Type</em>' attribute
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Type</em>' attribute.
	 * @see #setComponentType(String)
	 * @generated
	 */
	public String getComponentType() {
		return (componentType == null) ? new String() : componentType;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ComponentType#getComponentType <em>Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Type</em>' attribute.
	 * @see #getComponentType()
	 * @generated
	 */
	public void setComponentType(String newComponentType) {
		componentType = newComponentType;
	}

	/**
	 * Returns the value of the '<em><b>Dictionary Entry Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Dictionary Entry Name</em>' attribute
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dictionary Entry Name</em>' attribute.
	 * @see #setDictionaryEntryName(String)
	 * @generated
	 */
	public String getDictionaryEntryName() {
		return (dictionaryEntryName == null) ? new String()
				: dictionaryEntryName;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ComponentType#getDictionaryEntryName <em>Dictionary Entry Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dictionary Entry Name</em>' attribute.
	 * @see #getDictionaryEntryName()
	 * @generated
	 */
	public void setDictionaryEntryName(String newDictionaryEntryName) {
		dictionaryEntryName = newDictionaryEntryName;
	}

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Version</em>' attribute
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @generated
	 */
	public String getVersion() {
		return (version == null) ? new String() : version;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ComponentType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	public void setVersion(String newVersion) {
		version = newVersion;
	}

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Definition</em>' attribute
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' attribute.
	 * @see #setDefinition(String)
	 * @generated
	 */
	public String getDefinition() {
		return (definition == null) ? new String() : definition;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ComponentType#getDefinition <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' attribute.
	 * @see #getDefinition()
	 * @generated
	 */
	public void setDefinition(String newDefinition) {
		definition = newDefinition;
	}

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Cardinality</em>' attribute
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see #setCardinality(String)
	 * @generated
	 */
	public String getCardinality() {
		return (cardinality == null) ? new String() : cardinality;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ComponentType#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see #getCardinality()
	 * @generated
	 */
	public void setCardinality(String newCardinality) {
		cardinality = newCardinality;
	}

	/**
	 * Returns the value of the '<em><b>Object Class Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Object Class Qualifier</em>' attribute
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Class Qualifier</em>' attribute.
	 * @see #setObjectClassQualifier(String)
	 * @generated
	 */
	public String getObjectClassQualifier() {
		return (objectClassQualifier == null) ? new String()
				: objectClassQualifier;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ComponentType#getObjectClassQualifier <em>Object Class Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Class Qualifier</em>' attribute.
	 * @see #getObjectClassQualifier()
	 * @generated
	 */
	public void setObjectClassQualifier(String newObjectClassQualifier) {
		objectClassQualifier = newObjectClassQualifier;
	}

	/**
	 * Returns the value of the '<em><b>Object Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Object Class</em>' attribute
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Class</em>' attribute.
	 * @see #setObjectClass(String)
	 * @generated
	 */
	public String getObjectClass() {
		return (objectClass == null) ? new String() : objectClass;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ComponentType#getObjectClass <em>Object Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Class</em>' attribute.
	 * @see #getObjectClass()
	 * @generated
	 */
	public void setObjectClass(String newObjectClass) {
		objectClass = newObjectClass;
	}

	/**
	 * Returns the value of the '<em><b>Property Term Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Property Term Qualifier</em>' attribute
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Term Qualifier</em>' attribute.
	 * @see #setPropertyTermQualifier(String)
	 * @generated
	 */
	public String getPropertyTermQualifier() {
		return (propertyTermQualifier == null) ? new String()
				: propertyTermQualifier;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ComponentType#getPropertyTermQualifier <em>Property Term Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Term Qualifier</em>' attribute.
	 * @see #getPropertyTermQualifier()
	 * @generated
	 */
	public void setPropertyTermQualifier(String newPropertyTermQualifier) {
		propertyTermQualifier = newPropertyTermQualifier;
	}

	/**
	 * Returns the value of the '<em><b>Property Term Possessive Noun</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Property Term Possessive Noun</em>' attribute
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Term Possessive Noun</em>' attribute.
	 * @see #setPropertyTermPossessiveNoun(String)
	 * @generated
	 */
	public String getPropertyTermPossessiveNoun() {
		return (propertyTermPossessiveNoun == null) ? new String()
				: propertyTermPossessiveNoun;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ComponentType#getPropertyTermPossessiveNoun <em>Property Term Possessive Noun</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Term Possessive Noun</em>' attribute.
	 * @see #getPropertyTermPossessiveNoun()
	 * @generated
	 */
	public void setPropertyTermPossessiveNoun(
			String newPropertyTermPossessiveNoun) {
		propertyTermPossessiveNoun = newPropertyTermPossessiveNoun;
	}

	/**
	 * Returns the value of the '<em><b>Property Term Primary Noun</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Property Term Primary Noun</em>' attribute
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Term Primary Noun</em>' attribute.
	 * @see #setPropertyTermPrimaryNoun(String)
	 * @generated
	 */
	public String getPropertyTermPrimaryNoun() {
		return (propertyTermPrimaryNoun == null) ? new String()
				: propertyTermPrimaryNoun;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ComponentType#getPropertyTermPrimaryNoun <em>Property Term Primary Noun</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Term Primary Noun</em>' attribute.
	 * @see #getPropertyTermPrimaryNoun()
	 * @generated
	 */
	public void setPropertyTermPrimaryNoun(String newPropertyTermPrimaryNoun) {
		propertyTermPrimaryNoun = newPropertyTermPrimaryNoun;
	}

	/**
	 * Returns the value of the '<em><b>Property Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Property Term</em>' attribute
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Term</em>' attribute.
	 * @see #setPropertyTerm(String)
	 * @generated
	 */
	public String getPropertyTerm() {
		return (propertyTerm == null) ? new String() : propertyTerm;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ComponentType#getPropertyTerm <em>Property Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Term</em>' attribute.
	 * @see #getPropertyTerm()
	 * @generated
	 */
	public void setPropertyTerm(String newPropertyTerm) {
		propertyTerm = newPropertyTerm;
	}

	/**
	 * Returns the value of the '<em><b>Representation Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Representation Term</em>' attribute
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation Term</em>' attribute.
	 * @see #setRepresentationTerm(String)
	 * @generated
	 */
	public String getRepresentationTerm() {
		return (representationTerm == null) ? new String() : representationTerm;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ComponentType#getRepresentationTerm <em>Representation Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation Term</em>' attribute.
	 * @see #getRepresentationTerm()
	 * @generated
	 */
	public void setRepresentationTerm(String newRepresentationTerm) {
		representationTerm = newRepresentationTerm;
	}

	/**
	 * Returns the value of the '<em><b>Data Type Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Data Type Qualifier</em>' attribute
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type Qualifier</em>' attribute.
	 * @see #setDataTypeQualifier(String)
	 * @generated
	 */
	public String getDataTypeQualifier() {
		return (dataTypeQualifier == null) ? new String() : dataTypeQualifier;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ComponentType#getDataTypeQualifier <em>Data Type Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type Qualifier</em>' attribute.
	 * @see #getDataTypeQualifier()
	 * @generated
	 */
	public void setDataTypeQualifier(String newDataTypeQualifier) {
		dataTypeQualifier = newDataTypeQualifier;
	}

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Data Type</em>' attribute
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see #setDataType(String)
	 * @generated
	 */
	public String getDataType() {
		return (dataType == null) ? new String() : dataType;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ComponentType#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see #getDataType()
	 * @generated
	 */
	public void setDataType(String newDataType) {
		dataType = newDataType;
	}

	/**
	 * Returns the value of the '<em><b>Associated Object Class Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Associated Object Class Qualifier</em>' attribute
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated Object Class Qualifier</em>' attribute.
	 * @see #setAssociatedObjectClassQualifier(String)
	 * @generated
	 */
	public String getAssociatedObjectClassQualifier() {
		return (associatedObjectClassQualifier == null) ? new String()
				: associatedObjectClassQualifier;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ComponentType#getAssociatedObjectClassQualifier <em>Associated Object Class Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associated Object Class Qualifier</em>' attribute.
	 * @see #getAssociatedObjectClassQualifier()
	 * @generated
	 */
	public void setAssociatedObjectClassQualifier(
			String newAssociatedObjectClassQualifier) {
		associatedObjectClassQualifier = newAssociatedObjectClassQualifier;
	}

	/**
	 * Returns the value of the '<em><b>Associated Object Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Associated Object Class</em>' attribute
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated Object Class</em>' attribute.
	 * @see #setAssociatedObjectClass(String)
	 * @generated
	 */
	public String getAssociatedObjectClass() {
		return (associatedObjectClass == null) ? new String()
				: associatedObjectClass;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ComponentType#getAssociatedObjectClass <em>Associated Object Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associated Object Class</em>' attribute.
	 * @see #getAssociatedObjectClass()
	 * @generated
	 */
	public void setAssociatedObjectClass(String newAssociatedObjectClass) {
		associatedObjectClass = newAssociatedObjectClass;
	}

	/**
	 * Returns the value of the '<em><b>Alternative Business Terms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Alternative Business Terms</em>' attribute
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative Business Terms</em>' attribute.
	 * @see #setAlternativeBusinessTerms(String)
	 * @generated
	 */
	public String getAlternativeBusinessTerms() {
		return (alternativeBusinessTerms == null) ? new String()
				: alternativeBusinessTerms;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ComponentType#getAlternativeBusinessTerms <em>Alternative Business Terms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternative Business Terms</em>' attribute.
	 * @see #getAlternativeBusinessTerms()
	 * @generated
	 */
	public void setAlternativeBusinessTerms(String newAlternativeBusinessTerms) {
		alternativeBusinessTerms = newAlternativeBusinessTerms;
	}

	/**
	 * Returns the value of the '<em><b>Examples</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Examples</em>' attribute
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Examples</em>' attribute.
	 * @see #setExamples(String)
	 * @generated
	 */
	public String getExamples() {
		return (examples == null) ? new String() : examples;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ComponentType#getExamples <em>Examples</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Examples</em>' attribute.
	 * @see #getExamples()
	 * @generated
	 */
	public void setExamples(String newExamples) {
		examples = newExamples;
	}

	/**
	 * Returns the value of the '<em><b>Primitive Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Primitive Type</em>' attribute
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Type</em>' attribute.
	 * @see #setPrimitiveType(String)
	 * @generated
	 */
	public String getPrimitiveType() {
		return (primitiveType == null) ? new String() : primitiveType;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ComponentType#getPrimitiveType <em>Primitive Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Type</em>' attribute.
	 * @see #getPrimitiveType()
	 * @generated
	 */
	public void setPrimitiveType(String newPrimitiveType) {
		primitiveType = newPrimitiveType;
	}

	/**
	 * Returns the value of the '<em><b>Possible Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Possible Value</em>' attribute
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possible Value</em>' attribute.
	 * @see #setPossibleValue(String)
	 * @generated
	 */
	public String getPossibleValue() {
		return (possibleValue == null) ? new String() : possibleValue;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.ccts.ComponentType#getPossibleValue <em>Possible Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Possible Value</em>' attribute.
	 * @see #getPossibleValue()
	 * @generated
	 */
	public void setPossibleValue(String newPossibleValue) {
		possibleValue = newPossibleValue;
	}

	/**
	 * Returns the value of the '<em><b>Content Component Restriction</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.ccts.ContentComponentRestrictionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Content Component Restriction</em>' containment reference list
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Component Restriction</em>' containment reference list.
	 * @generated
	 */
	public List getContentComponentRestriction() {
		if (contentComponentRestriction == null) {
			contentComponentRestriction = new ArrayList<
					ContentComponentRestrictionType>();
		}
		return contentComponentRestriction;
	}

	/**
	 * Returns the value of the '<em><b>Restriction Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Restriction Value</em>' attribute list
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restriction Value</em>' attribute list.
	 * @generated
	 */
	public List getRestrictionValue() {
		if (restrictionValue == null) {
			restrictionValue = new ArrayList<String>();
		}
		return restrictionValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (componentType: "); //$NON-NLS-1$
		result.append(componentType);
		result.append(", dictionaryEntryName: "); //$NON-NLS-1$
		result.append(dictionaryEntryName);
		result.append(", version: "); //$NON-NLS-1$
		result.append(version);
		result.append(", definition: "); //$NON-NLS-1$
		result.append(definition);
		result.append(", cardinality: "); //$NON-NLS-1$
		result.append(cardinality);
		result.append(", objectClassQualifier: "); //$NON-NLS-1$
		result.append(objectClassQualifier);
		result.append(", objectClass: "); //$NON-NLS-1$
		result.append(objectClass);
		result.append(", propertyTermQualifier: "); //$NON-NLS-1$
		result.append(propertyTermQualifier);
		result.append(", propertyTermPossessiveNoun: "); //$NON-NLS-1$
		result.append(propertyTermPossessiveNoun);
		result.append(", propertyTermPrimaryNoun: "); //$NON-NLS-1$
		result.append(propertyTermPrimaryNoun);
		result.append(", propertyTerm: "); //$NON-NLS-1$
		result.append(propertyTerm);
		result.append(", representationTerm: "); //$NON-NLS-1$
		result.append(representationTerm);
		result.append(", dataTypeQualifier: "); //$NON-NLS-1$
		result.append(dataTypeQualifier);
		result.append(", dataType: "); //$NON-NLS-1$
		result.append(dataType);
		result.append(", associatedObjectClassQualifier: "); //$NON-NLS-1$
		result.append(associatedObjectClassQualifier);
		result.append(", associatedObjectClass: "); //$NON-NLS-1$
		result.append(associatedObjectClass);
		result.append(", alternativeBusinessTerms: "); //$NON-NLS-1$
		result.append(alternativeBusinessTerms);
		result.append(", examples: "); //$NON-NLS-1$
		result.append(examples);
		result.append(", primitiveType: "); //$NON-NLS-1$
		result.append(primitiveType);
		result.append(", possibleValue: "); //$NON-NLS-1$
		result.append(possibleValue);
		result.append(", restrictionValue: "); //$NON-NLS-1$
		result.append(restrictionValue);
		result.append(')');
		return result.toString();
	}

} // ComponentType