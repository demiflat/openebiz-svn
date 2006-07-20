/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.AmountType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.NoteType;
import org.openebiz.core.common.cbc.PenaltySurchargePercentType;
import org.openebiz.core.common.cbc.ReferenceEventCodeType;
import org.openebiz.core.common.cbc.SettlementDiscountPercentType;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Terms Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Payment Terms. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about Payment Terms</ccts:Definition>
 *           <ccts:ObjectClass>Payment Terms</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.PaymentTermsType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PaymentTermsType#getNote <em>Note</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PaymentTermsType#getReferenceEventCode <em>Reference Event Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PaymentTermsType#getSettlementDiscountPercent <em>Settlement Discount Percent</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PaymentTermsType#getPenaltySurchargePercent <em>Penalty Surcharge Percent</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PaymentTermsType#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PaymentTermsType#getSettlementPeriod <em>Settlement Period</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PaymentTermsType#getPenaltyPeriod <em>Penalty Period</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PaymentTermsType#getPaymentMeans <em>Payment Means</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PaymentTermsType implements Serializable {
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
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected NoteType note = null;

	/**
	 * The cached value of the '{@link #getReferenceEventCode() <em>Reference Event Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceEventCode()
	 * @generated
	 * @ordered
	 */
	protected ReferenceEventCodeType referenceEventCode = null;

	/**
	 * The cached value of the '{@link #getSettlementDiscountPercent() <em>Settlement Discount Percent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettlementDiscountPercent()
	 * @generated
	 * @ordered
	 */
	protected SettlementDiscountPercentType settlementDiscountPercent = null;

	/**
	 * The cached value of the '{@link #getPenaltySurchargePercent() <em>Penalty Surcharge Percent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenaltySurchargePercent()
	 * @generated
	 * @ordered
	 */
	protected PenaltySurchargePercentType penaltySurchargePercent = null;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected AmountType amount = null;

	/**
	 * The cached value of the '{@link #getSettlementPeriod() <em>Settlement Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettlementPeriod()
	 * @generated
	 * @ordered
	 */
	protected PeriodType settlementPeriod = null;

	/**
	 * The cached value of the '{@link #getPenaltyPeriod() <em>Penalty Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenaltyPeriod()
	 * @generated
	 * @ordered
	 */
	protected PeriodType penaltyPeriod = null;

	/**
	 * The cached value of the '{@link #getPaymentMeans() <em>Payment Means</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMeans()
	 * @generated
	 * @ordered
	 */
	protected PaymentMeansType paymentMeans = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public PaymentTermsType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.iD = this.getID();
		this.note = this.getNote();
		this.referenceEventCode = this.getReferenceEventCode();
		this.settlementDiscountPercent = this.getSettlementDiscountPercent();
		this.penaltySurchargePercent = this.getPenaltySurchargePercent();
		this.amount = this.getAmount();
		this.settlementPeriod = this.getSettlementPeriod();
		this.penaltyPeriod = this.getPenaltyPeriod();
		this.paymentMeans = this.getPaymentMeans();
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
	 *               <ccts:DictionaryEntryName>Payment Terms. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the Payment Terms</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment Terms</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentTermsType#getID <em>ID</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment Terms. Note. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Free form text applying to the Payment Terms. This element may contain notes or any other similar information that is not contained explicitly in another structure.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment Terms</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Note</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference.
	 * @see #setNote(NoteType)
	 * @generated
	 */
	public NoteType getNote() {
		return (note == null) ? new NoteType() : note;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentTermsType#getNote <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' containment reference.
	 * @see #getNote()
	 * @generated
	 */
	public void setNote(NoteType newNote) {
		note = newNote;
	}

	/**
	 * Returns the value of the '<em><b>Reference Event Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment Terms. Reference_ Event. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the event from which terms are offered for a length of time, identified by a standard code.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment Terms</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Reference</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Event</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Event Code</em>' containment reference.
	 * @see #setReferenceEventCode(ReferenceEventCodeType)
	 * @generated
	 */
	public ReferenceEventCodeType getReferenceEventCode() {
		return (referenceEventCode == null) ? new ReferenceEventCodeType()
				: referenceEventCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentTermsType#getReferenceEventCode <em>Reference Event Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Event Code</em>' containment reference.
	 * @see #getReferenceEventCode()
	 * @generated
	 */
	public void setReferenceEventCode(
			ReferenceEventCodeType newReferenceEventCode) {
		referenceEventCode = newReferenceEventCode;
	}

	/**
	 * Returns the value of the '<em><b>Settlement Discount Percent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment Terms. Settlement_ Discount Percent. Percent</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The settlement discount rate (percentage) offered for payment within the settlement period</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment Terms</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Settlement</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Discount Percent</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Percent</ccts:RepresentationTerm>
	 *               <ccts:DataType>Percent. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Settlement Discount Percent</em>' containment reference.
	 * @see #setSettlementDiscountPercent(SettlementDiscountPercentType)
	 * @generated
	 */
	public SettlementDiscountPercentType getSettlementDiscountPercent() {
		return (settlementDiscountPercent == null) ? new SettlementDiscountPercentType()
				: settlementDiscountPercent;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentTermsType#getSettlementDiscountPercent <em>Settlement Discount Percent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Settlement Discount Percent</em>' containment reference.
	 * @see #getSettlementDiscountPercent()
	 * @generated
	 */
	public void setSettlementDiscountPercent(
			SettlementDiscountPercentType newSettlementDiscountPercent) {
		settlementDiscountPercent = newSettlementDiscountPercent;
	}

	/**
	 * Returns the value of the '<em><b>Penalty Surcharge Percent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment Terms. Penalty_ Surcharge Percent. Percent</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The penalty rate (percentage) charged for late payment</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment Terms</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Penalty</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Surcharge Percent</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Percent</ccts:RepresentationTerm>
	 *               <ccts:DataType>Percent. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Penalty Surcharge Percent</em>' containment reference.
	 * @see #setPenaltySurchargePercent(PenaltySurchargePercentType)
	 * @generated
	 */
	public PenaltySurchargePercentType getPenaltySurchargePercent() {
		return (penaltySurchargePercent == null) ? new PenaltySurchargePercentType()
				: penaltySurchargePercent;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentTermsType#getPenaltySurchargePercent <em>Penalty Surcharge Percent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Penalty Surcharge Percent</em>' containment reference.
	 * @see #getPenaltySurchargePercent()
	 * @generated
	 */
	public void setPenaltySurchargePercent(
			PenaltySurchargePercentType newPenaltySurchargePercent) {
		penaltySurchargePercent = newPenaltySurchargePercent;
	}

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment Terms. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The payment amount for the Payment Terms</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment Terms</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount</em>' containment reference.
	 * @see #setAmount(AmountType)
	 * @generated
	 */
	public AmountType getAmount() {
		return (amount == null) ? new AmountType() : amount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentTermsType#getAmount <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' containment reference.
	 * @see #getAmount()
	 * @generated
	 */
	public void setAmount(AmountType newAmount) {
		amount = newAmount;
	}

	/**
	 * Returns the value of the '<em><b>Settlement Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment Terms. Settlement_ Period. Period</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Settlement Period</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment Terms</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Settlement</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Period</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Period</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Settlement Period</em>' containment reference.
	 * @see #setSettlementPeriod(PeriodType)
	 * @generated
	 */
	public PeriodType getSettlementPeriod() {
		return (settlementPeriod == null) ? new PeriodType() : settlementPeriod;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentTermsType#getSettlementPeriod <em>Settlement Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Settlement Period</em>' containment reference.
	 * @see #getSettlementPeriod()
	 * @generated
	 */
	public void setSettlementPeriod(PeriodType newSettlementPeriod) {
		settlementPeriod = newSettlementPeriod;
	}

	/**
	 * Returns the value of the '<em><b>Penalty Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment Terms. Penalty_ Period. Period</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Penalty Period</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment Terms</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Penalty</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Period</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Period</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Penalty Period</em>' containment reference.
	 * @see #setPenaltyPeriod(PeriodType)
	 * @generated
	 */
	public PeriodType getPenaltyPeriod() {
		return (penaltyPeriod == null) ? new PeriodType() : penaltyPeriod;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentTermsType#getPenaltyPeriod <em>Penalty Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Penalty Period</em>' containment reference.
	 * @see #getPenaltyPeriod()
	 * @generated
	 */
	public void setPenaltyPeriod(PeriodType newPenaltyPeriod) {
		penaltyPeriod = newPenaltyPeriod;
	}

	/**
	 * Returns the value of the '<em><b>Payment Means</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Payment Terms. Payment Means</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Payment Means</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Payment Terms</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Payment Means</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Payment Means</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Means</em>' containment reference.
	 * @see #setPaymentMeans(PaymentMeansType)
	 * @generated
	 */
	public PaymentMeansType getPaymentMeans() {
		return (paymentMeans == null) ? new PaymentMeansType() : paymentMeans;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PaymentTermsType#getPaymentMeans <em>Payment Means</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Means</em>' containment reference.
	 * @see #getPaymentMeans()
	 * @generated
	 */
	public void setPaymentMeans(PaymentMeansType newPaymentMeans) {
		paymentMeans = newPaymentMeans;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.amount == null) ? 0 : this.amount.hashCode());
		result = PRIME * result + ((this.iD == null) ? 0 : this.iD.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.note == null) ? 0 : this.note.hashCode());
		result = PRIME * result + ((this.paymentMeans == null) ? 0 : this.paymentMeans.hashCode());
		result = PRIME * result + ((this.penaltyPeriod == null) ? 0 : this.penaltyPeriod.hashCode());
		result = PRIME * result + ((this.penaltySurchargePercent == null) ? 0 : this.penaltySurchargePercent.hashCode());
		result = PRIME * result + ((this.referenceEventCode == null) ? 0 : this.referenceEventCode.hashCode());
		result = PRIME * result + ((this.settlementDiscountPercent == null) ? 0 : this.settlementDiscountPercent.hashCode());
		result = PRIME * result + ((this.settlementPeriod == null) ? 0 : this.settlementPeriod.hashCode());
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
		final PaymentTermsType other = (PaymentTermsType) obj;
		if (this.amount == null) {
			if (other.amount != null)
				return false;
		} else if (!this.amount.equals(other.amount))
			return false;
		if (this.iD == null) {
			if (other.iD != null)
				return false;
		} else if (!this.iD.equals(other.iD))
			return false;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.note == null) {
			if (other.note != null)
				return false;
		} else if (!this.note.equals(other.note))
			return false;
		if (this.paymentMeans == null) {
			if (other.paymentMeans != null)
				return false;
		} else if (!this.paymentMeans.equals(other.paymentMeans))
			return false;
		if (this.penaltyPeriod == null) {
			if (other.penaltyPeriod != null)
				return false;
		} else if (!this.penaltyPeriod.equals(other.penaltyPeriod))
			return false;
		if (this.penaltySurchargePercent == null) {
			if (other.penaltySurchargePercent != null)
				return false;
		} else if (!this.penaltySurchargePercent.equals(other.penaltySurchargePercent))
			return false;
		if (this.referenceEventCode == null) {
			if (other.referenceEventCode != null)
				return false;
		} else if (!this.referenceEventCode.equals(other.referenceEventCode))
			return false;
		if (this.settlementDiscountPercent == null) {
			if (other.settlementDiscountPercent != null)
				return false;
		} else if (!this.settlementDiscountPercent.equals(other.settlementDiscountPercent))
			return false;
		if (this.settlementPeriod == null) {
			if (other.settlementPeriod != null)
				return false;
		} else if (!this.settlementPeriod.equals(other.settlementPeriod))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // PaymentTermsType