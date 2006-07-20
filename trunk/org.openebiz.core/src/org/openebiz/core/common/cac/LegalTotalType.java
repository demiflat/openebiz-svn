/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.LineExtensionAmountType;
import org.openebiz.core.common.cbc.LineExtensionRoundingAmountType;
import org.openebiz.core.common.cbc.PrepaidAmountType;
import org.openebiz.core.common.cbc.TaxExclusiveAmountType;
import org.openebiz.core.common.cbc.TaxInclusiveAmountType;
import org.openebiz.core.common.cbc.ToBePaidAmountType;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legal Total Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Legal Total. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about Legal Totals (as opposed to Tax Totals)</ccts:Definition>
 *           <ccts:ObjectClass>Legal Total</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.LegalTotalType#getLineExtensionAmount <em>Line Extension Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LegalTotalType#getTaxExclusiveAmount <em>Tax Exclusive Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LegalTotalType#getTaxInclusiveAmount <em>Tax Inclusive Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LegalTotalType#getPrepaidAmount <em>Prepaid Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LegalTotalType#getLineExtensionRoundingAmount <em>Line Extension Rounding Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.LegalTotalType#getToBePaidAmount <em>To Be Paid Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LegalTotalType implements Serializable {
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

	/*
	 * Basic Entity support code for surrogate id's
	 */
	protected Long internalId = null;

	protected Integer version = null;

	/**
	 * @return Returns the internalId.
	 */
	public Long getInternalId() {
		return this.internalId;
	}

	/**
	 * @param internalId The internalId to set.
	 */
	public void setInternalId(Long internalId) {
		this.internalId = internalId;
	}

	/**
	 * @return Returns the version.
	 */
	public Integer getVersion() {
		return this.version;
	}

	/**
	 * @param version The version to set.
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}

	/**
	 * The cached value of the '{@link #getLineExtensionAmount() <em>Line Extension Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineExtensionAmount()
	 * @generated
	 * @ordered
	 */
	protected LineExtensionAmountType lineExtensionAmount = null;

	/**
	 * The cached value of the '{@link #getTaxExclusiveAmount() <em>Tax Exclusive Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxExclusiveAmount()
	 * @generated
	 * @ordered
	 */
	protected TaxExclusiveAmountType taxExclusiveAmount = null;

	/**
	 * The cached value of the '{@link #getTaxInclusiveAmount() <em>Tax Inclusive Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxInclusiveAmount()
	 * @generated
	 * @ordered
	 */
	protected TaxInclusiveAmountType taxInclusiveAmount = null;

	/**
	 * The cached value of the '{@link #getPrepaidAmount() <em>Prepaid Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrepaidAmount()
	 * @generated
	 * @ordered
	 */
	protected PrepaidAmountType prepaidAmount = null;

	/**
	 * The cached value of the '{@link #getLineExtensionRoundingAmount() <em>Line Extension Rounding Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineExtensionRoundingAmount()
	 * @generated
	 * @ordered
	 */
	protected LineExtensionRoundingAmountType lineExtensionRoundingAmount = null;

	/**
	 * The cached value of the '{@link #getToBePaidAmount() <em>To Be Paid Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToBePaidAmount()
	 * @generated
	 * @ordered
	 */
	protected ToBePaidAmountType toBePaidAmount = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public LegalTotalType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.lineExtensionAmount = this.getLineExtensionAmount();
		this.taxExclusiveAmount = this.getTaxExclusiveAmount();
		this.taxInclusiveAmount = this.getTaxInclusiveAmount();
		this.prepaidAmount = this.getPrepaidAmount();
		this.lineExtensionRoundingAmount = this.getLineExtensionRoundingAmount();
		this.toBePaidAmount = this.getToBePaidAmount();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getPrepaidAmount().getValue().toPlainString());
		sdisplay.append(" / ");
		sdisplay.append(this.getToBePaidAmount().getValue().toPlainString());
		return sdisplay.toString();
	}
	
	/**
	 * Returns the value of the '<em><b>Line Extension Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Legal Total. Line Extension Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The total of Line Extention Amounts net of tax and settlement discounts, but inclusive of any applicable rounding amount</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Legal Total</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Line Extension Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Extension Amount</em>' containment reference.
	 * @see #setLineExtensionAmount(LineExtensionAmountType)
	 * @generated
	 */
	public LineExtensionAmountType getLineExtensionAmount() {
		return (lineExtensionAmount == null) ? new LineExtensionAmountType()
				: lineExtensionAmount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LegalTotalType#getLineExtensionAmount <em>Line Extension Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Extension Amount</em>' containment reference.
	 * @see #getLineExtensionAmount()
	 * @generated
	 */
	public void setLineExtensionAmount(
			LineExtensionAmountType newLineExtensionAmount) {
		lineExtensionAmount = newLineExtensionAmount;
	}

	/**
	 * Returns the value of the '<em><b>Tax Exclusive Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Legal Total. Tax Exclusive Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The total amount exclusive of texes</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Legal Total</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Tax Exclusive Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tax Exclusive Amount</em>' containment reference.
	 * @see #setTaxExclusiveAmount(TaxExclusiveAmountType)
	 * @generated
	 */
	public TaxExclusiveAmountType getTaxExclusiveAmount() {
		return (taxExclusiveAmount == null) ? new TaxExclusiveAmountType()
				: taxExclusiveAmount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LegalTotalType#getTaxExclusiveAmount <em>Tax Exclusive Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Exclusive Amount</em>' containment reference.
	 * @see #getTaxExclusiveAmount()
	 * @generated
	 */
	public void setTaxExclusiveAmount(
			TaxExclusiveAmountType newTaxExclusiveAmount) {
		taxExclusiveAmount = newTaxExclusiveAmount;
	}

	/**
	 * Returns the value of the '<em><b>Tax Inclusive Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Legal Total. Tax Inclusive Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The total amount inclusive of taxes</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Legal Total</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Tax Inclusive Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tax Inclusive Amount</em>' containment reference.
	 * @see #setTaxInclusiveAmount(TaxInclusiveAmountType)
	 * @generated
	 */
	public TaxInclusiveAmountType getTaxInclusiveAmount() {
		return (taxInclusiveAmount == null) ? new TaxInclusiveAmountType()
				: taxInclusiveAmount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LegalTotalType#getTaxInclusiveAmount <em>Tax Inclusive Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Inclusive Amount</em>' containment reference.
	 * @see #getTaxInclusiveAmount()
	 * @generated
	 */
	public void setTaxInclusiveAmount(
			TaxInclusiveAmountType newTaxInclusiveAmount) {
		taxInclusiveAmount = newTaxInclusiveAmount;
	}

	/**
	 * Returns the value of the '<em><b>Prepaid Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Legal Total. Prepaid Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The total prepaid amount</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Legal Total</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Prepaid Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prepaid Amount</em>' containment reference.
	 * @see #setPrepaidAmount(PrepaidAmountType)
	 * @generated
	 */
	public PrepaidAmountType getPrepaidAmount() {
		return (prepaidAmount == null) ? new PrepaidAmountType()
				: prepaidAmount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LegalTotalType#getPrepaidAmount <em>Prepaid Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prepaid Amount</em>' containment reference.
	 * @see #getPrepaidAmount()
	 * @generated
	 */
	public void setPrepaidAmount(PrepaidAmountType newPrepaidAmount) {
		prepaidAmount = newPrepaidAmount;
	}

	/**
	 * Returns the value of the '<em><b>Line Extension Rounding Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Legal Total. Line Extension_ Rounding Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The rounding amount (positive or negative) added to the calculated Line Extention Total Amount to produce the rounded Line Extention Total Amount</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Legal Total</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Line Extension</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Rounding Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Extension Rounding Amount</em>' containment reference.
	 * @see #setLineExtensionRoundingAmount(LineExtensionRoundingAmountType)
	 * @generated
	 */
	public LineExtensionRoundingAmountType getLineExtensionRoundingAmount() {
		return (lineExtensionRoundingAmount == null) ? new LineExtensionRoundingAmountType()
				: lineExtensionRoundingAmount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LegalTotalType#getLineExtensionRoundingAmount <em>Line Extension Rounding Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Extension Rounding Amount</em>' containment reference.
	 * @see #getLineExtensionRoundingAmount()
	 * @generated
	 */
	public void setLineExtensionRoundingAmount(
			LineExtensionRoundingAmountType newLineExtensionRoundingAmount) {
		lineExtensionRoundingAmount = newLineExtensionRoundingAmount;
	}

	/**
	 * Returns the value of the '<em><b>To Be Paid Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Legal Total. To Be Paid Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The total amount to be paid</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Legal Total</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>To Be Paid Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Be Paid Amount</em>' containment reference.
	 * @see #setToBePaidAmount(ToBePaidAmountType)
	 * @generated
	 */
	public ToBePaidAmountType getToBePaidAmount() {
		return (toBePaidAmount == null) ? new ToBePaidAmountType()
				: toBePaidAmount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.LegalTotalType#getToBePaidAmount <em>To Be Paid Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Be Paid Amount</em>' containment reference.
	 * @see #getToBePaidAmount()
	 * @generated
	 */
	public void setToBePaidAmount(ToBePaidAmountType newToBePaidAmount) {
		toBePaidAmount = newToBePaidAmount;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.lineExtensionAmount == null) ? 0 : this.lineExtensionAmount.hashCode());
		result = PRIME * result + ((this.lineExtensionRoundingAmount == null) ? 0 : this.lineExtensionRoundingAmount.hashCode());
		result = PRIME * result + ((this.prepaidAmount == null) ? 0 : this.prepaidAmount.hashCode());
		result = PRIME * result + ((this.taxExclusiveAmount == null) ? 0 : this.taxExclusiveAmount.hashCode());
		result = PRIME * result + ((this.taxInclusiveAmount == null) ? 0 : this.taxInclusiveAmount.hashCode());
		result = PRIME * result + ((this.toBePaidAmount == null) ? 0 : this.toBePaidAmount.hashCode());
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
		final LegalTotalType other = (LegalTotalType) obj;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.lineExtensionAmount == null) {
			if (other.lineExtensionAmount != null)
				return false;
		} else if (!this.lineExtensionAmount.equals(other.lineExtensionAmount))
			return false;
		if (this.lineExtensionRoundingAmount == null) {
			if (other.lineExtensionRoundingAmount != null)
				return false;
		} else if (!this.lineExtensionRoundingAmount.equals(other.lineExtensionRoundingAmount))
			return false;
		if (this.prepaidAmount == null) {
			if (other.prepaidAmount != null)
				return false;
		} else if (!this.prepaidAmount.equals(other.prepaidAmount))
			return false;
		if (this.taxExclusiveAmount == null) {
			if (other.taxExclusiveAmount != null)
				return false;
		} else if (!this.taxExclusiveAmount.equals(other.taxExclusiveAmount))
			return false;
		if (this.taxInclusiveAmount == null) {
			if (other.taxInclusiveAmount != null)
				return false;
		} else if (!this.taxInclusiveAmount.equals(other.taxInclusiveAmount))
			return false;
		if (this.toBePaidAmount == null) {
			if (other.toBePaidAmount != null)
				return false;
		} else if (!this.toBePaidAmount.equals(other.toBePaidAmount))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // LegalTotalType