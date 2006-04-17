/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.mimetype;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Binary Object Mime Code Content Type</b></em>',
 * and utility methods for working with them. <!-- end-user-doc -->
 * 
 * @see org.openebiz.core.common.mimetype.impl.MimetypePackageImpl#getBinaryObjectMimeCodeContentType()
 */
public final class BinaryObjectMimeCodeContentType extends
		InternalBinaryObjectMimeCodeContentType {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	public static final String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

	/**
	 * The '<em><b>Text Html</b></em>' literal value. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of '<em><b>Text Html</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #TEXT_HTML_LITERAL
	 * @ordered
	 */
	public static final int TEXT_HTML = 0;

	/**
	 * The '<em><b>Text Plain</b></em>' literal value. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of '<em><b>Text Plain</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #TEXT_PLAIN_LITERAL
	 * @ordered
	 */
	public static final int TEXT_PLAIN = 1;

	/**
	 * The '<em><b>Text Xml</b></em>' literal value. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of '<em><b>Text Xml</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #TEXT_XML_LITERAL
	 * @ordered
	 */
	public static final int TEXT_XML = 2;

	/**
	 * The '<em><b>Application Xhtml Xml</b></em>' literal value. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Application Xhtml Xml</b></em>' literal
	 * object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #APPLICATION_XHTML_XML_LITERAL
	 * @ordered
	 */
	public static final int APPLICATION_XHTML_XML = 3;

	/**
	 * The '<em><b>Application Xml</b></em>' literal value. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Application Xml</b></em>' literal object
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #APPLICATION_XML_LITERAL
	 * @ordered
	 */
	public static final int APPLICATION_XML = 4;

	/**
	 * The '<em><b>Multipart Form Data</b></em>' literal value. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Multipart Form Data</b></em>' literal
	 * object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #MULTIPART_FORM_DATA_LITERAL
	 * @ordered
	 */
	public static final int MULTIPART_FORM_DATA = 5;

	/**
	 * The '<em><b>Text Html</b></em>' literal object. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #TEXT_HTML
	 * @ordered
	 */
	public static final BinaryObjectMimeCodeContentType TEXT_HTML_LITERAL = new BinaryObjectMimeCodeContentType(
			TEXT_HTML, "textHtml", "text/html"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Text Plain</b></em>' literal object. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #TEXT_PLAIN
	 * @ordered
	 */
	public static final BinaryObjectMimeCodeContentType TEXT_PLAIN_LITERAL = new BinaryObjectMimeCodeContentType(
			TEXT_PLAIN, "textPlain", "text/plain"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Text Xml</b></em>' literal object. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #TEXT_XML
	 * @ordered
	 */
	public static final BinaryObjectMimeCodeContentType TEXT_XML_LITERAL = new BinaryObjectMimeCodeContentType(
			TEXT_XML, "textXml", "text/xml"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Application Xhtml Xml</b></em>' literal object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #APPLICATION_XHTML_XML
	 * @ordered
	 */
	public static final BinaryObjectMimeCodeContentType APPLICATION_XHTML_XML_LITERAL = new BinaryObjectMimeCodeContentType(
			APPLICATION_XHTML_XML,
			"applicationXhtmlXml", "application/xhtml+xml"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Application Xml</b></em>' literal object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #APPLICATION_XML
	 * @ordered
	 */
	public static final BinaryObjectMimeCodeContentType APPLICATION_XML_LITERAL = new BinaryObjectMimeCodeContentType(
			APPLICATION_XML, "applicationXml", "application/xml"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Multipart Form Data</b></em>' literal object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #MULTIPART_FORM_DATA
	 * @ordered
	 */
	public static final BinaryObjectMimeCodeContentType MULTIPART_FORM_DATA_LITERAL = new BinaryObjectMimeCodeContentType(
			MULTIPART_FORM_DATA, "multipartFormData", "multipart/form-data"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * An array of all the '<em><b>Binary Object Mime Code Content Type</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	private static final BinaryObjectMimeCodeContentType[] VALUES_ARRAY = new BinaryObjectMimeCodeContentType[] {
			TEXT_HTML_LITERAL, TEXT_PLAIN_LITERAL, TEXT_XML_LITERAL,
			APPLICATION_XHTML_XML_LITERAL, APPLICATION_XML_LITERAL,
			MULTIPART_FORM_DATA_LITERAL, };

	/**
	 * A public read-only list of all the '<em><b>Binary Object Mime Code Content Type</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays
			.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Binary Object Mime Code Content Type</b></em>'
	 * literal with the specified literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 */
	public static BinaryObjectMimeCodeContentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BinaryObjectMimeCodeContentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Binary Object Mime Code Content Type</b></em>'
	 * literal with the specified name. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 */
	public static BinaryObjectMimeCodeContentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BinaryObjectMimeCodeContentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Binary Object Mime Code Content Type</b></em>'
	 * literal with the specified integer value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 */
	public static BinaryObjectMimeCodeContentType get(int value) {
		switch (value) {
		case TEXT_HTML:
			return TEXT_HTML_LITERAL;
		case TEXT_PLAIN:
			return TEXT_PLAIN_LITERAL;
		case TEXT_XML:
			return TEXT_XML_LITERAL;
		case APPLICATION_XHTML_XML:
			return APPLICATION_XHTML_XML_LITERAL;
		case APPLICATION_XML:
			return APPLICATION_XML_LITERAL;
		case MULTIPART_FORM_DATA:
			return MULTIPART_FORM_DATA_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 */
	private BinaryObjectMimeCodeContentType(int value, String name,
			String literal) {
		super(value, name, literal);
	}

} // BinaryObjectMimeCodeContentType

/**
 * A private implementation class to construct the instances. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 */
class InternalBinaryObjectMimeCodeContentType {
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
	protected InternalBinaryObjectMimeCodeContentType(int value, String name) {
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
	protected InternalBinaryObjectMimeCodeContentType(int value, String name,
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
