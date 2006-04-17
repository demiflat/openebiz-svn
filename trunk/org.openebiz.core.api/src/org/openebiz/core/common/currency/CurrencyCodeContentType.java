/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.currency;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Code Content Type</b></em>',
 * and utility methods for working with them. <!-- end-user-doc -->
 * 
 * @see org.openebiz.core.common.currency.impl.CurrencyPackageImpl#getCurrencyCodeContentType()
 */
public final class CurrencyCodeContentType extends
		InternalCurrencyCodeContentType {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	public static final String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

	/**
	 * The '<em><b>CNY</b></em>' literal value. <!-- begin-user-doc -->
	 * <!-- end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * <ccts:CodeName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Yuan
	 * Renminbi</ccts:CodeName> <ccts:CodeDescription
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2"/>
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @see #CNY_LITERAL
	 * @ordered
	 */
	public static final int CNY = 0;

	/**
	 * The '<em><b>USD</b></em>' literal value. <!-- begin-user-doc -->
	 * <!-- end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * <ccts:CodeName xmlns:ccts="urn:un:unece:uncefact:documentation:2">US
	 * Dollar</ccts:CodeName> <ccts:CodeDescription
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2"/>
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @see #USD_LITERAL
	 * @ordered
	 */
	public static final int USD = 1;

	/**
	 * The '<em><b>EUR</b></em>' literal value. <!-- begin-user-doc -->
	 * <!-- end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * <ccts:CodeName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Euro</ccts:CodeName>
	 * <ccts:CodeDescription
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2">On 1 January 1999, the
	 * euro will become the currency of those Member states of the European
	 * Union which adopt the single currency in accordance with the Treaty
	 * establishing the European Community. This code has been issued now so
	 * that technical preparations can be started. The code element 'EU' has
	 * been reserved by the ISO 3166 Maintenance Agency for use within ISO 4217
	 * where 'R' has been appended to make an acceptable mnemonic code.</ccts:CodeDescription>
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @see #EUR_LITERAL
	 * @ordered
	 */
	public static final int EUR = 2;

	/**
	 * The '<em><b>GBP</b></em>' literal value. <!-- begin-user-doc -->
	 * <!-- end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * <ccts:CodeName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Pound
	 * Sterling</ccts:CodeName> <ccts:CodeDescription
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2"/>
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @see #GBP_LITERAL
	 * @ordered
	 */
	public static final int GBP = 3;

	/**
	 * The '<em><b>HKD</b></em>' literal value. <!-- begin-user-doc -->
	 * <!-- end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * <ccts:CodeName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Honk
	 * Kong Dollar</ccts:CodeName> <ccts:CodeDescription
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2"/>
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @see #HKD_LITERAL
	 * @ordered
	 */
	public static final int HKD = 4;

	/**
	 * The '<em><b>CNY</b></em>' literal object. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #CNY
	 * @ordered
	 */
	public static final CurrencyCodeContentType CNY_LITERAL = new CurrencyCodeContentType(
			CNY, "CNY", "CNY"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>USD</b></em>' literal object. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #USD
	 * @ordered
	 */
	public static final CurrencyCodeContentType USD_LITERAL = new CurrencyCodeContentType(
			USD, "USD", "USD"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>EUR</b></em>' literal object. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #EUR
	 * @ordered
	 */
	public static final CurrencyCodeContentType EUR_LITERAL = new CurrencyCodeContentType(
			EUR, "EUR", "EUR"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>GBP</b></em>' literal object. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #GBP
	 * @ordered
	 */
	public static final CurrencyCodeContentType GBP_LITERAL = new CurrencyCodeContentType(
			GBP, "GBP", "GBP"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>HKD</b></em>' literal object. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #HKD
	 * @ordered
	 */
	public static final CurrencyCodeContentType HKD_LITERAL = new CurrencyCodeContentType(
			HKD, "HKD", "HKD"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * An array of all the '<em><b>Code Content Type</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	private static final CurrencyCodeContentType[] VALUES_ARRAY = new CurrencyCodeContentType[] {
			CNY_LITERAL, USD_LITERAL, EUR_LITERAL, GBP_LITERAL, HKD_LITERAL, };

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
	public static CurrencyCodeContentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CurrencyCodeContentType result = VALUES_ARRAY[i];
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
	public static CurrencyCodeContentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CurrencyCodeContentType result = VALUES_ARRAY[i];
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
	public static CurrencyCodeContentType get(int value) {
		switch (value) {
		case CNY:
			return CNY_LITERAL;
		case USD:
			return USD_LITERAL;
		case EUR:
			return EUR_LITERAL;
		case GBP:
			return GBP_LITERAL;
		case HKD:
			return HKD_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 */
	private CurrencyCodeContentType(int value, String name, String literal) {
		super(value, name, literal);
	}

} // CurrencyCodeContentType

/**
 * A private implementation class to construct the instances. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 */
class InternalCurrencyCodeContentType {
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
	protected InternalCurrencyCodeContentType(int value, String name) {
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
	protected InternalCurrencyCodeContentType(int value, String name,
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
