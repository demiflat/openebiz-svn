/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.LossRiskResponsibilityCodeType;
import org.openebiz.core.common.cbc.LossRiskType;
import org.openebiz.core.common.cbc.RelevantLocationConditionsType;
import org.openebiz.core.common.cbc.SpecialTermsType;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delivery Terms Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Delivery Terms. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about Delivery Terms</ccts:Definition>
 *           <ccts:ObjectClass>Delivery Terms</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryTermsType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryTermsType#getRelevantLocationConditions <em>Relevant Location Conditions</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryTermsType#getSpecialTerms <em>Special Terms</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryTermsType#getLossRiskResponsibilityCode <em>Loss Risk Responsibility Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryTermsType#getLossRisk <em>Loss Risk</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DeliveryTermsType#getAllowanceCharge <em>Allowance Charge</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeliveryTermsType implements Serializable {
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
	 * The cached value of the '{@link #getRelevantLocationConditions() <em>Relevant Location Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelevantLocationConditions()
	 * @generated
	 * @ordered
	 */
	protected RelevantLocationConditionsType relevantLocationConditions = null;

	/**
	 * The cached value of the '{@link #getSpecialTerms() <em>Special Terms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialTerms()
	 * @generated
	 * @ordered
	 */
	protected SpecialTermsType specialTerms = null;

	/**
	 * The cached value of the '{@link #getLossRiskResponsibilityCode() <em>Loss Risk Responsibility Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLossRiskResponsibilityCode()
	 * @generated
	 * @ordered
	 */
	protected LossRiskResponsibilityCodeType lossRiskResponsibilityCode = null;

	/**
	 * The cached value of the '{@link #getLossRisk() <em>Loss Risk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLossRisk()
	 * @generated
	 * @ordered
	 */
	protected LossRiskType lossRisk = null;

	/**
	 * The cached value of the '{@link #getAllowanceCharge() <em>Allowance Charge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowanceCharge()
	 * @generated
	 * @ordered
	 */
	protected AllowanceChargeType allowanceCharge = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public DeliveryTermsType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.iD = this.getID();
		this.relevantLocationConditions = this.getRelevantLocationConditions();
		this.specialTerms = this.getSpecialTerms();
		this.lossRiskResponsibilityCode = this.getLossRiskResponsibilityCode();
		this.lossRisk = this.getLossRisk();
		this.allowanceCharge = this.getAllowanceCharge();
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
	 *               <ccts:DictionaryEntryName>Delivery Terms. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the Delivery Terms</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery Terms</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:Examples>CIF, FOB, or EXW from the INCOTERMS Terms of Delivery. (2000 version preferred.)</ccts:Examples>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryTermsType#getID <em>ID</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Relevant Location Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery Terms. Relevant_ Location Conditions. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Information about the delivery location relevant to the Delivery Terms</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery Terms</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Relevant</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Location Conditions</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:Examples>"Warehouse accepts 24 x 7</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relevant Location Conditions</em>' containment reference.
	 * @see #setRelevantLocationConditions(RelevantLocationConditionsType)
	 * @generated
	 */
	public RelevantLocationConditionsType getRelevantLocationConditions() {
		return (relevantLocationConditions == null) ? new RelevantLocationConditionsType()
				: relevantLocationConditions;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryTermsType#getRelevantLocationConditions <em>Relevant Location Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relevant Location Conditions</em>' containment reference.
	 * @see #getRelevantLocationConditions()
	 * @generated
	 */
	public void setRelevantLocationConditions(
			RelevantLocationConditionsType newRelevantLocationConditions) {
		relevantLocationConditions = newRelevantLocationConditions;
	}

	/**
	 * Returns the value of the '<em><b>Special Terms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery Terms. Special_ Terms. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A description of special conditions relating to the Delivery Terms</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery Terms</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Special</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Terms</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Special Terms</em>' containment reference.
	 * @see #setSpecialTerms(SpecialTermsType)
	 * @generated
	 */
	public SpecialTermsType getSpecialTerms() {
		return (specialTerms == null) ? new SpecialTermsType() : specialTerms;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryTermsType#getSpecialTerms <em>Special Terms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Special Terms</em>' containment reference.
	 * @see #getSpecialTerms()
	 * @generated
	 */
	public void setSpecialTerms(SpecialTermsType newSpecialTerms) {
		specialTerms = newSpecialTerms;
	}

	/**
	 * Returns the value of the '<em><b>Loss Risk Responsibility Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery Terms. Loss Risk Responsibility. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An identifier for the responsibility for loss risk in the context of the Delivery Terms; expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery Terms</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Loss Risk Responsibility</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loss Risk Responsibility Code</em>' containment reference.
	 * @see #setLossRiskResponsibilityCode(LossRiskResponsibilityCodeType)
	 * @generated
	 */
	public LossRiskResponsibilityCodeType getLossRiskResponsibilityCode() {
		return (lossRiskResponsibilityCode == null) ? new LossRiskResponsibilityCodeType()
				: lossRiskResponsibilityCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryTermsType#getLossRiskResponsibilityCode <em>Loss Risk Responsibility Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loss Risk Responsibility Code</em>' containment reference.
	 * @see #getLossRiskResponsibilityCode()
	 * @generated
	 */
	public void setLossRiskResponsibilityCode(
			LossRiskResponsibilityCodeType newLossRiskResponsibilityCode) {
		lossRiskResponsibilityCode = newLossRiskResponsibilityCode;
	}

	/**
	 * Returns the value of the '<em><b>Loss Risk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery Terms. Loss Risk. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A description of the loss risk in the context of the Delivery Terms</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery Terms</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Loss Risk</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loss Risk</em>' containment reference.
	 * @see #setLossRisk(LossRiskType)
	 * @generated
	 */
	public LossRiskType getLossRisk() {
		return (lossRisk == null) ? new LossRiskType() : lossRisk;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryTermsType#getLossRisk <em>Loss Risk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loss Risk</em>' containment reference.
	 * @see #getLossRisk()
	 * @generated
	 */
	public void setLossRisk(LossRiskType newLossRisk) {
		lossRisk = newLossRisk;
	}

	/**
	 * Returns the value of the '<em><b>Allowance Charge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Delivery Terms. Allowance Charge</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Allowance Charge</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Delivery Terms</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Allowance Charge</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Allowance Charge</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allowance Charge</em>' containment reference.
	 * @see #setAllowanceCharge(AllowanceChargeType)
	 * @generated
	 */
	public AllowanceChargeType getAllowanceCharge() {
		return (allowanceCharge == null) ? new AllowanceChargeType()
				: allowanceCharge;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DeliveryTermsType#getAllowanceCharge <em>Allowance Charge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowance Charge</em>' containment reference.
	 * @see #getAllowanceCharge()
	 * @generated
	 */
	public void setAllowanceCharge(AllowanceChargeType newAllowanceCharge) {
		allowanceCharge = newAllowanceCharge;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.allowanceCharge == null) ? 0 : this.allowanceCharge.hashCode());
		result = PRIME * result + ((this.iD == null) ? 0 : this.iD.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.lossRisk == null) ? 0 : this.lossRisk.hashCode());
		result = PRIME * result + ((this.lossRiskResponsibilityCode == null) ? 0 : this.lossRiskResponsibilityCode.hashCode());
		result = PRIME * result + ((this.relevantLocationConditions == null) ? 0 : this.relevantLocationConditions.hashCode());
		result = PRIME * result + ((this.specialTerms == null) ? 0 : this.specialTerms.hashCode());
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
		final DeliveryTermsType other = (DeliveryTermsType) obj;
		if (this.allowanceCharge == null) {
			if (other.allowanceCharge != null)
				return false;
		} else if (!this.allowanceCharge.equals(other.allowanceCharge))
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
		if (this.lossRisk == null) {
			if (other.lossRisk != null)
				return false;
		} else if (!this.lossRisk.equals(other.lossRisk))
			return false;
		if (this.lossRiskResponsibilityCode == null) {
			if (other.lossRiskResponsibilityCode != null)
				return false;
		} else if (!this.lossRiskResponsibilityCode.equals(other.lossRiskResponsibilityCode))
			return false;
		if (this.relevantLocationConditions == null) {
			if (other.relevantLocationConditions != null)
				return false;
		} else if (!this.relevantLocationConditions.equals(other.relevantLocationConditions))
			return false;
		if (this.specialTerms == null) {
			if (other.specialTerms != null)
				return false;
		} else if (!this.specialTerms.equals(other.specialTerms))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // DeliveryTermsType