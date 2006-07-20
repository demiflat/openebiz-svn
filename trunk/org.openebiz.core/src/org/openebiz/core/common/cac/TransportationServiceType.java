/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.FreightRateClassCodeType;
import org.openebiz.core.common.cbc.PriorityType;
import org.openebiz.core.common.cbc.ServiceCodeType;
import org.openebiz.core.common.cbc.TariffClassCodeType;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transportation Service Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Transportation Service. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition/>
 *           <ccts:ObjectClass>Transportation Service</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.TransportationServiceType#getServiceCode <em>Service Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportationServiceType#getTariffClassCode <em>Tariff Class Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportationServiceType#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportationServiceType#getFreightRateClassCode <em>Freight Rate Class Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransportationServiceType implements Serializable {
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
	 * The cached value of the '{@link #getServiceCode() <em>Service Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceCode()
	 * @generated
	 * @ordered
	 */
	protected ServiceCodeType serviceCode = null;

	/**
	 * The cached value of the '{@link #getTariffClassCode() <em>Tariff Class Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTariffClassCode()
	 * @generated
	 * @ordered
	 */
	protected TariffClassCodeType tariffClassCode = null;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected PriorityType priority = null;

	/**
	 * The cached value of the '{@link #getFreightRateClassCode() <em>Freight Rate Class Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreightRateClassCode()
	 * @generated
	 * @ordered
	 */
	protected FreightRateClassCodeType freightRateClassCode = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public TransportationServiceType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.serviceCode = this.getServiceCode();
		this.tariffClassCode = this.getTariffClassCode();
		this.priority = this.getPriority();
		this.freightRateClassCode = this.getFreightRateClassCode();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getServiceCode().getValue());
		return sdisplay.toString();
	}

	/**
	 * Returns the value of the '<em><b>Service Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transportation Service. Service. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A code which describes the general type of service required for the transportation of goods. Specifically, it identifies the extent of the transportation service. E.g. door-to-door, port-to-port.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transportation Service</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Service</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Code</em>' containment reference.
	 * @see #setServiceCode(ServiceCodeType)
	 * @generated
	 */
	public ServiceCodeType getServiceCode() {
		return (serviceCode == null) ? new ServiceCodeType() : serviceCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportationServiceType#getServiceCode <em>Service Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Code</em>' containment reference.
	 * @see #getServiceCode()
	 * @generated
	 */
	public void setServiceCode(ServiceCodeType newServiceCode) {
		serviceCode = newServiceCode;
	}

	/**
	 * Returns the value of the '<em><b>Tariff Class Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transportation Service. Tariff Class. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Specification of a tariff class applicable to a transportation service.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transportation Service</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Tariff Class</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Tariff Class Specifier</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tariff Class Code</em>' containment reference.
	 * @see #setTariffClassCode(TariffClassCodeType)
	 * @generated
	 */
	public TariffClassCodeType getTariffClassCode() {
		return (tariffClassCode == null) ? new TariffClassCodeType()
				: tariffClassCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportationServiceType#getTariffClassCode <em>Tariff Class Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tariff Class Code</em>' containment reference.
	 * @see #getTariffClassCode()
	 * @generated
	 */
	public void setTariffClassCode(TariffClassCodeType newTariffClassCode) {
		tariffClassCode = newTariffClassCode;
	}

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transportation Service. Priority. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Statement indicating priority of requested transportion service.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transportation Service</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Priority</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(PriorityType)
	 * @generated
	 */
	public PriorityType getPriority() {
		return (priority == null) ? new PriorityType() : priority;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportationServiceType#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	public void setPriority(PriorityType newPriority) {
		priority = newPriority;
	}

	/**
	 * Returns the value of the '<em><b>Freight Rate Class Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transportation Service. Freight Rate Class. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Code to indicate applicable rate class for freight.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transportation Service</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Freight Rate Class</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Charge Basis</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Freight Rate Class Code</em>' containment reference.
	 * @see #setFreightRateClassCode(FreightRateClassCodeType)
	 * @generated
	 */
	public FreightRateClassCodeType getFreightRateClassCode() {
		return (freightRateClassCode == null) ? new FreightRateClassCodeType()
				: freightRateClassCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportationServiceType#getFreightRateClassCode <em>Freight Rate Class Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Freight Rate Class Code</em>' containment reference.
	 * @see #getFreightRateClassCode()
	 * @generated
	 */
	public void setFreightRateClassCode(
			FreightRateClassCodeType newFreightRateClassCode) {
		freightRateClassCode = newFreightRateClassCode;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.freightRateClassCode == null) ? 0 : this.freightRateClassCode.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.priority == null) ? 0 : this.priority.hashCode());
		result = PRIME * result + ((this.serviceCode == null) ? 0 : this.serviceCode.hashCode());
		result = PRIME * result + ((this.tariffClassCode == null) ? 0 : this.tariffClassCode.hashCode());
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
		final TransportationServiceType other = (TransportationServiceType) obj;
		if (this.freightRateClassCode == null) {
			if (other.freightRateClassCode != null)
				return false;
		} else if (!this.freightRateClassCode.equals(other.freightRateClassCode))
			return false;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.priority == null) {
			if (other.priority != null)
				return false;
		} else if (!this.priority.equals(other.priority))
			return false;
		if (this.serviceCode == null) {
			if (other.serviceCode != null)
				return false;
		} else if (!this.serviceCode.equals(other.serviceCode))
			return false;
		if (this.tariffClassCode == null) {
			if (other.tariffClassCode != null)
				return false;
		} else if (!this.tariffClassCode.equals(other.tariffClassCode))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // TransportationServiceType