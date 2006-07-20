/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.PaymentChannelCodeType;
import org.openebiz.core.common.cbc.PaymentDueDateType;
import org.openebiz.core.common.cbc.PaymentMeansCodeType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Means Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Payment Means. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about Payment Means</ccts:Definition>
 *           <ccts:ObjectClass>Payment Means</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.PaymentMeansType#getPaymentMeansCode <em>Payment Means Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PaymentMeansType#getPaymentDueDate <em>Payment Due Date</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PaymentMeansType#getPaymentChannelCode <em>Payment Channel Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PaymentMeansType#getCardAccount <em>Card Account</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PaymentMeansType#getPayerFinancialAccount <em>Payer Financial Account</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PaymentMeansType#getPayeeFinancialAccount <em>Payee Financial Account</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PaymentMeansType#getCreditAccount <em>Credit Account</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PaymentMeansType#getPayment <em>Payment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PaymentMeansType implements Serializable {
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
	 * The cached value of the '{@link #getPaymentMeansCode() <em>Payment Means Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMeansCode()
	 * @generated
	 * @ordered
	 */
	protected PaymentMeansCodeType paymentMeansCode = null;

	/**
	 * The cached value of the '{@link #getPaymentDueDate() <em>Payment Due Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentDueDate()
	 * @generated
	 * @ordered
	 */
	protected PaymentDueDateType paymentDueDate = null;

	/**
	 * The cached value of the '{@link #getPaymentChannelCode() <em>Payment Channel Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentChannelCode()
	 * @generated
	 * @ordered
	 */
	protected PaymentChannelCodeType paymentChannelCode = null;

	/**
	 * The cached value of the '{@link #getCardAccount() <em>Card Account</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardAccount()
	 * @generated
	 * @ordered
	 */
	protected CardAccountType cardAccount = null;

	/**
	 * The cached value of the '{@link #getPayerFinancialAccount() <em>Payer Financial Account</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayerFinancialAccount()
	 * @generated
	 * @ordered
	 */
	protected FinancialAccountType payerFinancialAccount = null;

	/**
	 * The cached value of the '{@link #getPayeeFinancialAccount() <em>Payee Financial Account</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayeeFinancialAccount()
	 * @generated
	 * @ordered
	 */
	protected FinancialAccountType payeeFinancialAccount = null;

	/**
	 * The cached value of the '{@link #getCreditAccount() <em>Credit Account</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditAccount()
	 * @generated
	 * @ordered
	 */
	protected CreditAccountType creditAccount = null;

	/**
	 * The cached value of the '{@link #getPayment() <em>Payment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment()
	 * @generated
	 * @ordered
	 */
	protected List payment = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public PaymentMeansType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.paymentMeansCode = this.getPaymentMeansCode();
		this.paymentDueDate = this.getPaymentDueDate();
		this.paymentChannelCode = this.getPaymentChannelCode();
		this.cardAccount = this.getCardAccount();
		this.payerFinancialAccount = this.getPayerFinancialAccount();
		this.payeeFinancialAccount = this.getPayeeFinancialAccount();
		this.creditAccount = this.getCreditAccount();
		this.payment = this.getPayment();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getPaymentMeansCode().getValue());
		return sdisplay.toString();
	}
	
	/**
	 * Returns the value of the '<em><b>Payment Means Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment Means. Payment Means. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the Payment Means</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment Means</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Payment Means</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Means Code</em>' containment reference.
	 * @see #setPaymentMeansCode(PaymentMeansCodeType)
	 * @generated
	 */
	public PaymentMeansCodeType getPaymentMeansCode() {
		return (paymentMeansCode == null) ? new PaymentMeansCodeType()
				: paymentMeansCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentMeansType#getPaymentMeansCode <em>Payment Means Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Means Code</em>' containment reference.
	 * @see #getPaymentMeansCode()
	 * @generated
	 */
	public void setPaymentMeansCode(PaymentMeansCodeType newPaymentMeansCode) {
		paymentMeansCode = newPaymentMeansCode;
	}

	/**
	 * Returns the value of the '<em><b>Payment Due Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment Means. Payment Due Date. Date</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The date on which payment is due for the Payment Means</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment Means</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Payment Due Date</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Due Date</em>' containment reference.
	 * @see #setPaymentDueDate(PaymentDueDateType)
	 * @generated
	 */
	public PaymentDueDateType getPaymentDueDate() {
		return (paymentDueDate == null) ? new PaymentDueDateType()
				: paymentDueDate;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentMeansType#getPaymentDueDate <em>Payment Due Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Due Date</em>' containment reference.
	 * @see #getPaymentDueDate()
	 * @generated
	 */
	public void setPaymentDueDate(PaymentDueDateType newPaymentDueDate) {
		paymentDueDate = newPaymentDueDate;
	}

	/**
	 * Returns the value of the '<em><b>Payment Channel Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment Means. Payment Channel. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The Payment Channel expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment Means</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Payment Channel</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Channel Code</em>' containment reference.
	 * @see #setPaymentChannelCode(PaymentChannelCodeType)
	 * @generated
	 */
	public PaymentChannelCodeType getPaymentChannelCode() {
		return (paymentChannelCode == null) ? new PaymentChannelCodeType()
				: paymentChannelCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentMeansType#getPaymentChannelCode <em>Payment Channel Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Channel Code</em>' containment reference.
	 * @see #getPaymentChannelCode()
	 * @generated
	 */
	public void setPaymentChannelCode(
			PaymentChannelCodeType newPaymentChannelCode) {
		paymentChannelCode = newPaymentChannelCode;
	}

	/**
	 * Returns the value of the '<em><b>Card Account</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment Means. Card Account</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Card Account</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment Means</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Card Account</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Card Account</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Card Account</em>' containment reference.
	 * @see #setCardAccount(CardAccountType)
	 * @generated
	 */
	public CardAccountType getCardAccount() {
		return (cardAccount == null) ? new CardAccountType() : cardAccount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentMeansType#getCardAccount <em>Card Account</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Account</em>' containment reference.
	 * @see #getCardAccount()
	 * @generated
	 */
	public void setCardAccount(CardAccountType newCardAccount) {
		cardAccount = newCardAccount;
	}

	/**
	 * Returns the value of the '<em><b>Payer Financial Account</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment Means. Payer_ Financial Account. Financial Account</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Payer's Financial Account</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment Means</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Payer</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Financial Account</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Financial Account</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payer Financial Account</em>' containment reference.
	 * @see #setPayerFinancialAccount(FinancialAccountType)
	 * @generated
	 */
	public FinancialAccountType getPayerFinancialAccount() {
		return (payerFinancialAccount == null) ? new FinancialAccountType()
				: payerFinancialAccount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentMeansType#getPayerFinancialAccount <em>Payer Financial Account</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payer Financial Account</em>' containment reference.
	 * @see #getPayerFinancialAccount()
	 * @generated
	 */
	public void setPayerFinancialAccount(
			FinancialAccountType newPayerFinancialAccount) {
		payerFinancialAccount = newPayerFinancialAccount;
	}

	/**
	 * Returns the value of the '<em><b>Payee Financial Account</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment Means. Payee_ Financial Account. Financial Account</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Payee's Financial Account</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment Means</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Payee</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Financial Account</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Financial Account</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payee Financial Account</em>' containment reference.
	 * @see #setPayeeFinancialAccount(FinancialAccountType)
	 * @generated
	 */
	public FinancialAccountType getPayeeFinancialAccount() {
		return (payeeFinancialAccount == null) ? new FinancialAccountType()
				: payeeFinancialAccount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentMeansType#getPayeeFinancialAccount <em>Payee Financial Account</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payee Financial Account</em>' containment reference.
	 * @see #getPayeeFinancialAccount()
	 * @generated
	 */
	public void setPayeeFinancialAccount(
			FinancialAccountType newPayeeFinancialAccount) {
		payeeFinancialAccount = newPayeeFinancialAccount;
	}

	/**
	 * Returns the value of the '<em><b>Credit Account</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment Means. Credit Account</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Credit Account</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment Means</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Credit Account</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Credit Account</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Credit Account</em>' containment reference.
	 * @see #setCreditAccount(CreditAccountType)
	 * @generated
	 */
	public CreditAccountType getCreditAccount() {
		return (creditAccount == null) ? new CreditAccountType()
				: creditAccount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentMeansType#getCreditAccount <em>Credit Account</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit Account</em>' containment reference.
	 * @see #getCreditAccount()
	 * @generated
	 */
	public void setCreditAccount(CreditAccountType newCreditAccount) {
		creditAccount = newCreditAccount;
	}

	/**
	 * Returns the value of the '<em><b>Payment</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.PaymentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment Means. Payment</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Payment</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment Means</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Payment</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Payment</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment</em>' containment reference list.
	 * @generated
	 */
	public List getPayment() {
		if (payment == null) {
			payment = new ArrayList<PaymentType>();
		}
		return payment;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.cardAccount == null) ? 0 : this.cardAccount.hashCode());
		result = PRIME * result + ((this.creditAccount == null) ? 0 : this.creditAccount.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.payeeFinancialAccount == null) ? 0 : this.payeeFinancialAccount.hashCode());
		result = PRIME * result + ((this.payerFinancialAccount == null) ? 0 : this.payerFinancialAccount.hashCode());
		result = PRIME * result + ((this.payment == null) ? 0 : this.payment.hashCode());
		result = PRIME * result + ((this.paymentChannelCode == null) ? 0 : this.paymentChannelCode.hashCode());
		result = PRIME * result + ((this.paymentDueDate == null) ? 0 : this.paymentDueDate.hashCode());
		result = PRIME * result + ((this.paymentMeansCode == null) ? 0 : this.paymentMeansCode.hashCode());
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
		final PaymentMeansType other = (PaymentMeansType) obj;
		if (this.cardAccount == null) {
			if (other.cardAccount != null)
				return false;
		} else if (!this.cardAccount.equals(other.cardAccount))
			return false;
		if (this.creditAccount == null) {
			if (other.creditAccount != null)
				return false;
		} else if (!this.creditAccount.equals(other.creditAccount))
			return false;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.payeeFinancialAccount == null) {
			if (other.payeeFinancialAccount != null)
				return false;
		} else if (!this.payeeFinancialAccount.equals(other.payeeFinancialAccount))
			return false;
		if (this.payerFinancialAccount == null) {
			if (other.payerFinancialAccount != null)
				return false;
		} else if (!this.payerFinancialAccount.equals(other.payerFinancialAccount))
			return false;
		if (this.payment == null) {
			if (other.payment != null)
				return false;
		} else if (!this.payment.equals(other.payment))
			return false;
		if (this.paymentChannelCode == null) {
			if (other.paymentChannelCode != null)
				return false;
		} else if (!this.paymentChannelCode.equals(other.paymentChannelCode))
			return false;
		if (this.paymentDueDate == null) {
			if (other.paymentDueDate != null)
				return false;
		} else if (!this.paymentDueDate.equals(other.paymentDueDate))
			return false;
		if (this.paymentMeansCode == null) {
			if (other.paymentMeansCode != null)
				return false;
		} else if (!this.paymentMeansCode.equals(other.paymentMeansCode))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // PaymentMeansType