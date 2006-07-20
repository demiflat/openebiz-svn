/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.ExpectedReceiptDateTimeType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.InstructionIDType;
import org.openebiz.core.common.cbc.PaidAmountType;
import org.openebiz.core.common.cbc.PaidDateTimeType;
import org.openebiz.core.common.cbc.ReceivedDateType;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Payment. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>information directly relating to a specific payment.</ccts:Definition>
 *           <ccts:ObjectClass>Payment</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.PaymentType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PaymentType#getPaidAmount <em>Paid Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PaymentType#getReceivedDate <em>Received Date</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PaymentType#getPaidDateTime <em>Paid Date Time</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PaymentType#getExpectedReceiptDateTime <em>Expected Receipt Date Time</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PaymentType#getInstructionID <em>Instruction ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PaymentType implements Serializable {
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
	 * The cached value of the '{@link #getID() <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected IDType iD = null;

	/**
	 * The cached value of the '{@link #getPaidAmount() <em>Paid Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaidAmount()
	 * @generated
	 * @ordered
	 */
	protected PaidAmountType paidAmount = null;

	/**
	 * The cached value of the '{@link #getReceivedDate() <em>Received Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedDate()
	 * @generated
	 * @ordered
	 */
	protected ReceivedDateType receivedDate = null;

	/**
	 * The cached value of the '{@link #getPaidDateTime() <em>Paid Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaidDateTime()
	 * @generated
	 * @ordered
	 */
	protected PaidDateTimeType paidDateTime = null;

	/**
	 * The cached value of the '{@link #getExpectedReceiptDateTime() <em>Expected Receipt Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedReceiptDateTime()
	 * @generated
	 * @ordered
	 */
	protected ExpectedReceiptDateTimeType expectedReceiptDateTime = null;

	/**
	 * The cached value of the '{@link #getInstructionID() <em>Instruction ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionID()
	 * @generated
	 * @ordered
	 */
	protected InstructionIDType instructionID = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public PaymentType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.iD = this.getID();
		this.paidAmount = this.getPaidAmount();
		this.receivedDate = this.getReceivedDate();
		this.paidDateTime = this.getPaidDateTime();
		this.expectedReceiptDateTime = this.getExpectedReceiptDateTime();
		this.instructionID = this.getInstructionID();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getID().getValue());
		return sdisplay.toString();
	}
	
	/**
	 * Returns the value of the '<em><b>ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the Payment</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID</em>' containment reference.
	 * @see #setID(IDType)
	 * @generated
	 */
	public IDType getID() {
		return (iD == null) ? new IDType() : iD;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentType#getID <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' containment reference.
	 * @see #getID()
	 * @generated
	 */
	public void setID(IDType newID) {
		iD = newID;
	}

	/**
	 * Returns the value of the '<em><b>Paid Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment. Paid Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The amount paid</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Paid Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Paid Amount</em>' containment reference.
	 * @see #setPaidAmount(PaidAmountType)
	 * @generated
	 */
	public PaidAmountType getPaidAmount() {
		return (paidAmount == null) ? new PaidAmountType() : paidAmount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentType#getPaidAmount <em>Paid Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paid Amount</em>' containment reference.
	 * @see #getPaidAmount()
	 * @generated
	 */
	public void setPaidAmount(PaidAmountType newPaidAmount) {
		paidAmount = newPaidAmount;
	}

	/**
	 * Returns the value of the '<em><b>Received Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment. Received Date. Date</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The date on which the Payment was received</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Received Date</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Received Date</em>' containment reference.
	 * @see #setReceivedDate(ReceivedDateType)
	 * @generated
	 */
	public ReceivedDateType getReceivedDate() {
		return (receivedDate == null) ? new ReceivedDateType() : receivedDate;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentType#getReceivedDate <em>Received Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Received Date</em>' containment reference.
	 * @see #getReceivedDate()
	 * @generated
	 */
	public void setReceivedDate(ReceivedDateType newReceivedDate) {
		receivedDate = newReceivedDate;
	}

	/**
	 * Returns the value of the '<em><b>Paid Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment. Paid Date Time. Date Time</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The date time at which the Payment was made</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Paid Date Time</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date Time</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date Time. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Paid Date Time</em>' containment reference.
	 * @see #setPaidDateTime(PaidDateTimeType)
	 * @generated
	 */
	public PaidDateTimeType getPaidDateTime() {
		return (paidDateTime == null) ? new PaidDateTimeType() : paidDateTime;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentType#getPaidDateTime <em>Paid Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paid Date Time</em>' containment reference.
	 * @see #getPaidDateTime()
	 * @generated
	 */
	public void setPaidDateTime(PaidDateTimeType newPaidDateTime) {
		paidDateTime = newPaidDateTime;
	}

	/**
	 * Returns the value of the '<em><b>Expected Receipt Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment. Expected_ Receipt Date Time. Date Time</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The datetime at which Payment is expected to reach the Payee</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Expected</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Receipt Date Time</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date Time</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date Time. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expected Receipt Date Time</em>' containment reference.
	 * @see #setExpectedReceiptDateTime(ExpectedReceiptDateTimeType)
	 * @generated
	 */
	public ExpectedReceiptDateTimeType getExpectedReceiptDateTime() {
		return (expectedReceiptDateTime == null) ? new ExpectedReceiptDateTimeType()
				: expectedReceiptDateTime;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentType#getExpectedReceiptDateTime <em>Expected Receipt Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Receipt Date Time</em>' containment reference.
	 * @see #getExpectedReceiptDateTime()
	 * @generated
	 */
	public void setExpectedReceiptDateTime(
			ExpectedReceiptDateTimeType newExpectedReceiptDateTime) {
		expectedReceiptDateTime = newExpectedReceiptDateTime;
	}

	/**
	 * Returns the value of the '<em><b>Instruction ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment. Instruction Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the Payment Instruction</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Instruction Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instruction ID</em>' containment reference.
	 * @see #setInstructionID(InstructionIDType)
	 * @generated
	 */
	public InstructionIDType getInstructionID() {
		return (instructionID == null) ? new InstructionIDType()
				: instructionID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentType#getInstructionID <em>Instruction ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction ID</em>' containment reference.
	 * @see #getInstructionID()
	 * @generated
	 */
	public void setInstructionID(InstructionIDType newInstructionID) {
		instructionID = newInstructionID;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.expectedReceiptDateTime == null) ? 0 : this.expectedReceiptDateTime.hashCode());
		result = PRIME * result + ((this.iD == null) ? 0 : this.iD.hashCode());
		result = PRIME * result + ((this.instructionID == null) ? 0 : this.instructionID.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.paidAmount == null) ? 0 : this.paidAmount.hashCode());
		result = PRIME * result + ((this.paidDateTime == null) ? 0 : this.paidDateTime.hashCode());
		result = PRIME * result + ((this.receivedDate == null) ? 0 : this.receivedDate.hashCode());
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
		final PaymentType other = (PaymentType) obj;
		if (this.expectedReceiptDateTime == null) {
			if (other.expectedReceiptDateTime != null)
				return false;
		} else if (!this.expectedReceiptDateTime.equals(other.expectedReceiptDateTime))
			return false;
		if (this.iD == null) {
			if (other.iD != null)
				return false;
		} else if (!this.iD.equals(other.iD))
			return false;
		if (this.instructionID == null) {
			if (other.instructionID != null)
				return false;
		} else if (!this.instructionID.equals(other.instructionID))
			return false;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.paidAmount == null) {
			if (other.paidAmount != null)
				return false;
		} else if (!this.paidAmount.equals(other.paidAmount))
			return false;
		if (this.paidDateTime == null) {
			if (other.paidDateTime != null)
				return false;
		} else if (!this.paidDateTime.equals(other.paidDateTime))
			return false;
		if (this.receivedDate == null) {
			if (other.receivedDate != null)
				return false;
		} else if (!this.receivedDate.equals(other.receivedDate))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // PaymentType