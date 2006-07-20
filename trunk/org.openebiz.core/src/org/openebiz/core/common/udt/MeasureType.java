/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.udt;

import org.openebiz.core.common.unit.UnitCodeContentType;

import java.math.BigDecimal;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *             <ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2">UDT0000013</ccts:UniqueID>
 *             <ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2">UDT</ccts:CategoryCode>
 *             <ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Measure. Type</ccts:DictionaryEntryName>
 *             <ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2">1.0</ccts:VersionID>
 *             <ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2">A numeric value determined by measuring an object along with the specified unit of measure.</ccts:Definition>
 *             <ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Measure</ccts:RepresentationTermName>
 *             <ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Type</ccts:PropertyTermName>
 *             <ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2">decimal</ccts:PrimitiveType>
 *             <xsd:BuiltinType>decimal</xsd:BuiltinType>
 *          
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.udt.MeasureType#getValue <em>Value</em>}</li>
 *   <li>{@link org.openebiz.core.common.udt.MeasureType#getUnitCode <em>Unit Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeasureType implements Serializable {
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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitCode() <em>Unit Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitCode()
	 * @generated
	 * @ordered
	 */
	protected static final UnitCodeContentType UNIT_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitCode() <em>Unit Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitCode()
	 * @generated
	 * @ordered
	 */
	protected UnitCodeContentType unitCode = UNIT_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureType() {
		super();
		this.init();
	}
	
	/**
	 * Initializes the ID value field to a unique context sensitive value
	 */
	public void init() {
		this.unitCode = this.getUnitCode();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getValue().toPlainString());
		return sdisplay.toString();
	}
	
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Value</em>' attribute
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BigDecimal)
	 * @generated
	 */
	public BigDecimal getValue() {
		return (value == null) ? new BigDecimal(0) : value;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.udt.MeasureType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	public void setValue(BigDecimal newValue) {
		value = newValue;
	}

	/**
	 * Returns the value of the '<em><b>Unit Code</b></em>' attribute.
	 * The default value is <code>"00"</code>.
	 * The literals are from the enumeration {@link org.openebiz.core.common.unit.UnitCodeContentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                      <ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2">UDT0000013-SC2</ccts:UniqueID>
	 *                      <ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2">SC</ccts:CategoryCode>
	 *                      <ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Measure Unit. Code</ccts:DictionaryEntryName>
	 *                      <ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2">The type of unit of measure.</ccts:Definition>
	 *                      <ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2">Measure Unit</ccts:ObjectClass>
	 *                      <ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Code</ccts:PropertyTermName>
	 *                      <ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2">Code</ccts:RepresentationTermName>
	 *                      <ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2">string</ccts:PrimitiveType>
	 *                      <xsd:BuiltinType>normalizedString</xsd:BuiltinType>
	 *                      <ccts:UsageRule xmlns:ccts="urn:un:unece:uncefact:documentation:2">Reference UN/ECE Rec 20 and X12 355.</ccts:UsageRule>
	 *                   
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit Code</em>' attribute.
	 * @see org.openebiz.core.common.unit.UnitCodeContentType
	 * @see #setUnitCode(UnitCodeContentType)
	 * @generated
	 */
	public UnitCodeContentType getUnitCode() {
		return (unitCode == null) ? new UnitCodeContentType() : unitCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.udt.MeasureType#getUnitCode <em>Unit Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Code</em>' attribute.
	 * @see org.openebiz.core.common.unit.UnitCodeContentType
	 * @see #getUnitCode()
	 * @generated
	 */
	public void setUnitCode(UnitCodeContentType newUnitCode) {
		unitCode = newUnitCode == null ? UNIT_CODE_EDEFAULT : newUnitCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (value: "); //$NON-NLS-1$
		result.append(value);
		result.append(", unitCode: "); //$NON-NLS-1$
		result.append(unitCode);
		result.append(')');
		return result.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.unitCode == null) ? 0 : this.unitCode.hashCode());
		result = PRIME * result + ((this.value == null) ? 0 : this.value.hashCode());
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
		final MeasureType other = (MeasureType) obj;
		if (this.unitCode == null) {
			if (other.unitCode != null)
				return false;
		} else if (!this.unitCode.equals(other.unitCode))
			return false;
		if (this.value == null) {
			if (other.value != null)
				return false;
		} else if (!this.value.equals(other.value))
			return false;
		return true;
	}

} // MeasureType