/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.currency;

import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Code Content Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openebiz.core.common.currency.CurrencyPackage#getCurrencyCodeContentType()
 * @generated
 */
public final class CurrencyCodeContentType implements Serializable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Open E-Biz - Darrell Kundel"; //$NON-NLS-1$

	/**
	 *  The internal surrogate id
	 */
	protected Long internalId = null;

	/**
	 *  The db version number
	 */
	protected Integer version = null;

	/**
	 * The name of the enumerator.
	 */
	private String name;

	/**
	 * The <code>int</code> value of the enumerator.
	 */
	private int value;

	/**
	 * The literal value of the enumerator.
	 */
	private String literal;

	/**
	 * @return the literal
	 */
	public String getLiteral() {
		return this.literal;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return this.value;
	}

	/**
	 * @return the internalId
	 */
	public Long getInternalId() {
		return this.internalId;
	}

	/**
	 * @return the version
	 */
	public Integer getVersion() {
		return this.version;
	}

	/**
	 * @param literal the literal to set
	 */
	protected void setLiteral(String literal) {
		this.literal = literal;
	}

	/**
	 * @param name the name to set
	 */
	protected void setName(String name) {
		this.name = name;
	}

	/**
	 * @param value the value to set
	 */
	protected void setValue(int value) {
		this.value = value;
	}

	/**
	 * @param internalId the internalId to set
	 */
	protected void setInternalId(Long internalId) {
		this.internalId = internalId;
	}

	/**
	 * @param version the version to set
	 */
	protected void setVersion(Integer version) {
		this.version = version;
	}
	
	/**
	 * @param value
	 * 		The mimecode value to lookup
	 */
	public static CurrencyCodeContentType lookup(String value) {
		// TODO check the db and/or some static mem location for the enumeration of possible values
		// current implementation relies on the validatity of the multipart to return the correct mimetype
		CurrencyCodeContentType currencycode = new CurrencyCodeContentType();
		currencycode.literal = value;
		currencycode.name = value;
		return currencycode;
	}
	
	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * @return the literal.
	 */
	public final String toString() {
		return literal;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.literal == null) ? 0 : this.literal.hashCode());
		result = PRIME * result + ((this.name == null) ? 0 : this.name.hashCode());
		result = PRIME * result + this.value;
		result = PRIME * result + ((this.version == null) ? 0 : this.version.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final CurrencyCodeContentType other = (CurrencyCodeContentType) obj;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.literal == null) {
			if (other.literal != null)
				return false;
		} else if (!this.literal.equals(other.literal))
			return false;
		if (this.name == null) {
			if (other.name != null)
				return false;
		} else if (!this.name.equals(other.name))
			return false;
		if (this.value != other.value)
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

}
