/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.language;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Code Content Type</b></em>',
 * and utility methods for working with them. <!-- end-user-doc -->
 * 
 * @see org.openebiz.core.common.language.impl.LanguagePackageImpl#getLanguageCodeContentType()
 */
public final class LanguageCodeContentType extends
		InternalLanguageCodeContentType {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	public static final String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

	/**
	 * The '<em><b>EN</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * <ccts:CodeName xmlns:ccts="urn:un:unece:uncefact:documentation:2">English</ccts:CodeName>
	 * <ccts:CodeDescription
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2"/>
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @see #EN_LITERAL
	 * @ordered
	 */
	public static final int EN = 0;

	/**
	 * The '<em><b>ZH</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * <ccts:CodeName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Chinese</ccts:CodeName>
	 * <ccts:CodeDescription
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2"/>
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @see #ZH_LITERAL
	 * @ordered
	 */
	public static final int ZH = 1;

	/**
	 * The '<em><b>EN</b></em>' literal object. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #EN
	 * @ordered
	 */
	public static final LanguageCodeContentType EN_LITERAL = new LanguageCodeContentType(
			EN, "EN", "EN"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>ZH</b></em>' literal object. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #ZH
	 * @ordered
	 */
	public static final LanguageCodeContentType ZH_LITERAL = new LanguageCodeContentType(
			ZH, "ZH", "ZH"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * An array of all the '<em><b>Code Content Type</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	private static final LanguageCodeContentType[] VALUES_ARRAY = new LanguageCodeContentType[] {
			EN_LITERAL, ZH_LITERAL, };

	/**
	 * A public read-only list of all the '<em><b>Code Content Type</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays
			.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Code Content Type</b></em>' literal with the
	 * specified literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	public static LanguageCodeContentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LanguageCodeContentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Code Content Type</b></em>' literal with the
	 * specified name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	public static LanguageCodeContentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LanguageCodeContentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Code Content Type</b></em>' literal with the
	 * specified integer value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	public static LanguageCodeContentType get(int value) {
		switch (value) {
		case EN:
			return EN_LITERAL;
		case ZH:
			return ZH_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 */
	private LanguageCodeContentType(int value, String name, String literal) {
		super(value, name, literal);
	}

} // LanguageCodeContentType

/**
 * A private implementation class to construct the instances. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 */
class InternalLanguageCodeContentType {
	/**
	 * The name of the enumerator.
	 */
	private final String name;

	/**
	 * The <code>int</code> value of the enumerator.
	 */
	private final int value;

	/**
	 * The literal value of the enumerator.
	 */
	private final String literal;

	/**
	 * Creates an initialized instance.
	 * 
	 * @param value
	 *            the <code>int</code> value of the enumerator.
	 * @param name
	 *            the name of the enumerator, which is also used as the literal
	 *            value.
	 */
	protected InternalLanguageCodeContentType(int value, String name) {
		this.name = literal = name;
		this.value = value;
	}

	/**
	 * Creates an initialized instance.
	 * 
	 * @param value
	 *            the <code>int</code> value of the enumerator.
	 * @param name
	 *            the name of the enumerator.
	 * @param literal
	 *            the literal value of the enumerator.
	 */
	protected InternalLanguageCodeContentType(int value, String name,
			String literal) {
		this.name = name;
		this.value = value;
		this.literal = literal;
	}

	/**
	 * Returns the name of the enumerator.
	 * 
	 * @return the name.
	 */
	public final String getName() {
		return name;
	}

	/**
	 * Returns the <code>int</code> value of the enumerator.
	 * 
	 * @return the value.
	 */
	public final int getValue() {
		return value;
	}

	/**
	 * Returns the literal value of the enumerator.
	 * 
	 * @return the literal.
	 */
	public final String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string
	 * representation.
	 * 
	 * @return the literal.
	 */
	public final String toString() {
		return literal;
	}
}
