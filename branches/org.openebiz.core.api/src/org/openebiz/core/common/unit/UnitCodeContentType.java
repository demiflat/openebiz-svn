/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.unit;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Code Content Type</b></em>',
 * and utility methods for working with them. <!-- end-user-doc -->
 * 
 * @see org.openebiz.core.common.unit.impl.UnitPackageImpl#getUnitCodeContentType()
 */
public final class UnitCodeContentType extends InternalUnitCodeContentType {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	public static final String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

	/**
	 * The '<em><b>00</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * <ccts:CodeName xmlns:ccts="urn:un:unece:uncefact:documentation:2">unit
	 * name</ccts:CodeName> <ccts:CodeDescription
	 * xmlns:ccts="urn:un:unece:uncefact:documentation:2"/>
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @see #_00_LITERAL
	 * @ordered
	 */
	public static final int _00 = 0;

	/**
	 * The '<em><b>00</b></em>' literal object. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #_00
	 * @ordered
	 */
	public static final UnitCodeContentType _00_LITERAL = new UnitCodeContentType(
			_00, "_00", "00"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * An array of all the '<em><b>Code Content Type</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	private static final UnitCodeContentType[] VALUES_ARRAY = new UnitCodeContentType[] { _00_LITERAL, };

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
	public static UnitCodeContentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitCodeContentType result = VALUES_ARRAY[i];
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
	public static UnitCodeContentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitCodeContentType result = VALUES_ARRAY[i];
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
	public static UnitCodeContentType get(int value) {
		switch (value) {
		case _00:
			return _00_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 */
	private UnitCodeContentType(int value, String name, String literal) {
		super(value, name, literal);
	}

} // UnitCodeContentType

/**
 * A private implementation class to construct the instances. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 */
class InternalUnitCodeContentType {
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
	protected InternalUnitCodeContentType(int value, String name) {
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
	protected InternalUnitCodeContentType(int value, String name, String literal) {
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
