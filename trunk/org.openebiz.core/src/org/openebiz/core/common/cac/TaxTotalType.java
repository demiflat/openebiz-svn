/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.RoundingAmountType;
import org.openebiz.core.common.cbc.TaxAmountType;
import org.openebiz.core.common.cbc.TaxEvidenceIndicatorType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tax Total Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Tax Total. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about a total amount of a particular type of tax</ccts:Definition>
 *           <ccts:ObjectClass>Tax Total</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.TaxTotalType#getTaxAmount <em>Tax Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TaxTotalType#getRoundingAmount <em>Rounding Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TaxTotalType#getTaxEvidenceIndicator <em>Tax Evidence Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TaxTotalType#getTaxSubTotal <em>Tax Sub Total</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaxTotalType implements Serializable {
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
	 * The cached value of the '{@link #getTaxAmount() <em>Tax Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAmount()
	 * @generated
	 * @ordered
	 */
	protected TaxAmountType taxAmount = null;

	/**
	 * The cached value of the '{@link #getRoundingAmount() <em>Rounding Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoundingAmount()
	 * @generated
	 * @ordered
	 */
	protected RoundingAmountType roundingAmount = null;

	/**
	 * The cached value of the '{@link #getTaxEvidenceIndicator() <em>Tax Evidence Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxEvidenceIndicator()
	 * @generated
	 * @ordered
	 */
	protected TaxEvidenceIndicatorType taxEvidenceIndicator = null;

	/**
	 * The cached value of the '{@link #getTaxSubTotal() <em>Tax Sub Total</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxSubTotal()
	 * @generated
	 * @ordered
	 */
	protected List taxSubTotal = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public TaxTotalType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.taxAmount = this.getTaxAmount();
		this.roundingAmount = this.getRoundingAmount();
		this.taxEvidenceIndicator = this.getTaxEvidenceIndicator();
		this.taxSubTotal = this.getTaxSubTotal();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getTaxAmount().getValue().toPlainString());
		return sdisplay.toString();
	}

	/**
	 * Returns the value of the '<em><b>Tax Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Tax Total. Tax Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The total tax amount for a tax type; the sum of each of the Tax Sub Totals for each Tax Category within the Tax Type</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Tax Total</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Tax Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tax Amount</em>' containment reference.
	 * @see #setTaxAmount(TaxAmountType)
	 * @generated
	 */
	public TaxAmountType getTaxAmount() {
		return (taxAmount == null) ? new TaxAmountType() : taxAmount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxTotalType#getTaxAmount <em>Tax Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Amount</em>' containment reference.
	 * @see #getTaxAmount()
	 * @generated
	 */
	public void setTaxAmount(TaxAmountType newTaxAmount) {
		taxAmount = newTaxAmount;
	}

	/**
	 * Returns the value of the '<em><b>Rounding Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Tax Total. Rounding Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The rounding amount (positive or negative) added to the calculated tax total to produce the rounded TotalTaxAmount</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Tax Total</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Rounding Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rounding Amount</em>' containment reference.
	 * @see #setRoundingAmount(RoundingAmountType)
	 * @generated
	 */
	public RoundingAmountType getRoundingAmount() {
		return (roundingAmount == null) ? new RoundingAmountType()
				: roundingAmount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxTotalType#getRoundingAmount <em>Rounding Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rounding Amount</em>' containment reference.
	 * @see #getRoundingAmount()
	 * @generated
	 */
	public void setRoundingAmount(RoundingAmountType newRoundingAmount) {
		roundingAmount = newRoundingAmount;
	}

	/**
	 * Returns the value of the '<em><b>Tax Evidence Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Tax Total. Tax Evidence Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An indicator as to whether these totals are recognized as legal evidence for taxation purposes.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Tax Total</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Tax Evidence Indicator</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *               <ccts:Examples>default is negative</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tax Evidence Indicator</em>' containment reference.
	 * @see #setTaxEvidenceIndicator(TaxEvidenceIndicatorType)
	 * @generated
	 */
	public TaxEvidenceIndicatorType getTaxEvidenceIndicator() {
		return (taxEvidenceIndicator == null) ? new TaxEvidenceIndicatorType()
				: taxEvidenceIndicator;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TaxTotalType#getTaxEvidenceIndicator <em>Tax Evidence Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Evidence Indicator</em>' containment reference.
	 * @see #getTaxEvidenceIndicator()
	 * @generated
	 */
	public void setTaxEvidenceIndicator(
			TaxEvidenceIndicatorType newTaxEvidenceIndicator) {
		taxEvidenceIndicator = newTaxEvidenceIndicator;
	}

	/**
	 * Returns the value of the '<em><b>Tax Sub Total</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.TaxSubTotalType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Tax Total. Tax Sub Total</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Tax Sub Total</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Tax Total</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Tax Sub Total</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Tax Sub Total</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tax Sub Total</em>' containment reference list.
	 * @generated
	 */
	public List getTaxSubTotal() {
		if (taxSubTotal == null) {
			taxSubTotal = new ArrayList<TaxSubTotalType>();
		}
		return taxSubTotal;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.roundingAmount == null) ? 0 : this.roundingAmount.hashCode());
		result = PRIME * result + ((this.taxAmount == null) ? 0 : this.taxAmount.hashCode());
		result = PRIME * result + ((this.taxEvidenceIndicator == null) ? 0 : this.taxEvidenceIndicator.hashCode());
		result = PRIME * result + ((this.taxSubTotal == null) ? 0 : this.taxSubTotal.hashCode());
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
		final TaxTotalType other = (TaxTotalType) obj;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.roundingAmount == null) {
			if (other.roundingAmount != null)
				return false;
		} else if (!this.roundingAmount.equals(other.roundingAmount))
			return false;
		if (this.taxAmount == null) {
			if (other.taxAmount != null)
				return false;
		} else if (!this.taxAmount.equals(other.taxAmount))
			return false;
		if (this.taxEvidenceIndicator == null) {
			if (other.taxEvidenceIndicator != null)
				return false;
		} else if (!this.taxEvidenceIndicator.equals(other.taxEvidenceIndicator))
			return false;
		if (this.taxSubTotal == null) {
			if (other.taxSubTotal != null)
				return false;
		} else if (!this.taxSubTotal.equals(other.taxSubTotal))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // TaxTotalType