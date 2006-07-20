/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cbc;

import org.openebiz.core.common.mimetype.BinaryObjectMimeCodeContentType;
import org.openebiz.core.common.udt.BinaryObjectType;
import java.io.Serializable;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Embedded Document Binary Object Type</b></em>'.
 * <!-- end-user-doc -->
 * 
 * 
 * @generated
 */
public class EmbeddedDocumentBinaryObjectType implements Serializable {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = "Open E-Biz - Darrell Kundel"; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final long serialVersionUID = 1L;

	protected BinaryObjectType holder = new BinaryObjectType();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EmbeddedDocumentBinaryObjectType() {
		super();
	}

	/**
	 * @return the holder
	 */
	public BinaryObjectType getHolder() {
		return this.holder;
	}

	/**
	 * @param holder
	 *            the holder to set
	 */
	public void setHolder(BinaryObjectType holder) {
		this.holder = holder;
	}

	/**
	 * @param obj
	 * @return
	 * @see org.openebiz.core.common.udt.BinaryObjectType#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		return this.holder.equals(obj);
	}

	/**
	 * @return
	 * @see org.openebiz.core.common.udt.BinaryObjectType#getCharacterSetCode()
	 */
	public String getCharacterSetCode() {
		return (this.holder.getCharacterSetCode() != null) ? this.holder.getCharacterSetCode() : new String();
	}

	/**
	 * @return
	 * @see org.openebiz.core.common.udt.BinaryObjectType#getEncodingCode()
	 */
	public String getEncodingCode() {
		return (this.holder.getEncodingCode() != null) ? this.holder.getEncodingCode() : new String();
	}

	/**
	 * @return
	 * @see org.openebiz.core.common.udt.BinaryObjectType#getFilename()
	 */
	public String getFilename() {
		return (this.holder.getFilename() != null) ? this.holder.getFilename() : new String();
	}

	/**
	 * @return
	 * @see org.openebiz.core.common.udt.BinaryObjectType#getFormat()
	 */
	public String getFormat() {
		return (this.holder.getFormat() != null) ? this.holder.getFormat() : new String();
	}

	/**
	 * @return
	 * @see org.openebiz.core.common.udt.BinaryObjectType#getInternalId()
	 */
	public Long getInternalId() {
		return this.holder.getInternalId();
	}

	/**
	 * @return
	 * @see org.openebiz.core.common.udt.BinaryObjectType#getMimeCode()
	 */
	public BinaryObjectMimeCodeContentType getMimeCode() {
		return (this.holder.getMimeCode() != null) ? this.holder.getMimeCode() : new BinaryObjectMimeCodeContentType();
	}

	/**
	 * @return
	 * @see org.openebiz.core.common.udt.BinaryObjectType#getUri()
	 */
	public String getUri() {
		return (this.holder.getUri() != null ) ? this.holder.getUri() : new String();
	}

	/**
	 * @return
	 * @see org.openebiz.core.common.udt.BinaryObjectType#getValue()
	 */
	public byte[] getValue() {
		return this.holder.getValue();
	}

	/**
	 * @return
	 * @see org.openebiz.core.common.udt.BinaryObjectType#getVersion()
	 */
	public Integer getVersion() {
		return this.holder.getVersion();
	}

	/**
	 * 
	 * @see org.openebiz.core.common.udt.BinaryObjectType#init()
	 */
	public void init() {
		this.holder.init();
	}

	/**
	 * @param newCharacterSetCode
	 * @see org.openebiz.core.common.udt.BinaryObjectType#setCharacterSetCode(java.lang.String)
	 */
	public void setCharacterSetCode(String newCharacterSetCode) {
		this.holder.setCharacterSetCode(newCharacterSetCode);
	}

	/**
	 * @param newEncodingCode
	 * @see org.openebiz.core.common.udt.BinaryObjectType#setEncodingCode(java.lang.String)
	 */
	public void setEncodingCode(String newEncodingCode) {
		this.holder.setEncodingCode(newEncodingCode);
	}

	/**
	 * @param newFilename
	 * @see org.openebiz.core.common.udt.BinaryObjectType#setFilename(java.lang.String)
	 */
	public void setFilename(String newFilename) {
		this.holder.setFilename(newFilename);
	}

	/**
	 * @param newFormat
	 * @see org.openebiz.core.common.udt.BinaryObjectType#setFormat(java.lang.String)
	 */
	public void setFormat(String newFormat) {
		this.holder.setFormat(newFormat);
	}

	/**
	 * @param internalId
	 * @see org.openebiz.core.common.udt.BinaryObjectType#setInternalId(java.lang.Long)
	 */
	public void setInternalId(Long internalId) {
		this.holder.setInternalId(internalId);
	}

	/**
	 * @param newMimeCode
	 * @see org.openebiz.core.common.udt.BinaryObjectType#setMimeCode(org.openebiz.core.common.mimetype.BinaryObjectMimeCodeContentType)
	 */
	public void setMimeCode(BinaryObjectMimeCodeContentType newMimeCode) {
		this.holder.setMimeCode(newMimeCode);
	}

	/**
	 * @param newUri
	 * @see org.openebiz.core.common.udt.BinaryObjectType#setUri(java.lang.String)
	 */
	public void setUri(String newUri) {
		this.holder.setUri(newUri);
	}

	/**
	 * @param newValue
	 * @see org.openebiz.core.common.udt.BinaryObjectType#setValue(byte[])
	 */
	public void setValue(byte[] newValue) {
		this.holder.setValue(newValue);
	}

	/**
	 * @param version
	 * @see org.openebiz.core.common.udt.BinaryObjectType#setVersion(java.lang.Integer)
	 */
	public void setVersion(Integer version) {
		this.holder.setVersion(version);
	}

	/**
	 * @return
	 * @see org.openebiz.core.common.udt.BinaryObjectType#getSize()
	 */
	public String getSize() {
		return this.holder.getSize();
	}

} // EmbeddedDocumentBinaryObjectType
