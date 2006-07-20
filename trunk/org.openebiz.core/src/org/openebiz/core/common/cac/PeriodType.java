/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.DescriptionCodeType;
import org.openebiz.core.common.cbc.DurationMeasureType;
import org.openebiz.core.common.cbc.EndDateTimeType;
import org.openebiz.core.common.cbc.StartDateTimeType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Period Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Period. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about a Period of time</ccts:Definition>
 *           <ccts:ObjectClass>Period</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.PeriodType#getStartDateTime <em>Start Date Time</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PeriodType#getEndDateTime <em>End Date Time</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PeriodType#getDurationMeasure <em>Duration Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PeriodType#getDescriptionCode <em>Description Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PeriodType implements Serializable {
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
	 * The cached value of the '{@link #getStartDateTime() <em>Start Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDateTime()
	 * @generated
	 * @ordered
	 */
	protected StartDateTimeType startDateTime = null;

	/**
	 * The cached value of the '{@link #getEndDateTime() <em>End Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDateTime()
	 * @generated
	 * @ordered
	 */
	protected EndDateTimeType endDateTime = null;

	/**
	 * The cached value of the '{@link #getDurationMeasure() <em>Duration Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationMeasure()
	 * @generated
	 * @ordered
	 */
	protected DurationMeasureType durationMeasure = null;

	/**
	 * The cached value of the '{@link #getDescriptionCode() <em>Description Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionCode()
	 * @generated
	 * @ordered
	 */
	protected List descriptionCode = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public PeriodType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.startDateTime = this.getStartDateTime();
		this.endDateTime = this.getEndDateTime();
		this.durationMeasure = this.getDurationMeasure();
		this.descriptionCode = this.getDescriptionCode();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getStartDateTime().getValue() != null ? this.getStartDateTime().getValue().getYear() : "");
		sdisplay.append('/');
		sdisplay.append(this.getStartDateTime().getValue() != null ? this.getStartDateTime().getValue().getDayOfMonth() : "");
		sdisplay.append('/');
		sdisplay.append(this.getStartDateTime().getValue() != null ? this.getStartDateTime().getValue().getDayOfWeek() : "");
		sdisplay.append(" | ");
		sdisplay.append(this.getStartDateTime().getValue() != null ? this.getEndDateTime().getValue().getYear() : "");
		sdisplay.append('/');
		sdisplay.append(this.getStartDateTime().getValue() != null ? this.getEndDateTime().getValue().getDayOfMonth() : "");
		sdisplay.append('/');
		sdisplay.append(this.getStartDateTime().getValue() != null ? this.getEndDateTime().getValue().getDayOfWeek() : "");
		return sdisplay.toString();
	}
	
	/**
	 * Returns the value of the '<em><b>Start Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Period. Start Date Time. Date Time</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The start date/time of the Period</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Period</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Start Date Time</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date Time</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date Time. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Date Time</em>' containment reference.
	 * @see #setStartDateTime(StartDateTimeType)
	 * @generated
	 */
	public StartDateTimeType getStartDateTime() {
		return (startDateTime == null) ? new StartDateTimeType()
				: startDateTime;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PeriodType#getStartDateTime <em>Start Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date Time</em>' containment reference.
	 * @see #getStartDateTime()
	 * @generated
	 */
	public void setStartDateTime(StartDateTimeType newStartDateTime) {
		startDateTime = newStartDateTime;
	}

	/**
	 * Returns the value of the '<em><b>End Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Period. End Date Time. Date Time</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The end date/time of the Period</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Period</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>End Date Time</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date Time</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date Time. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Date Time</em>' containment reference.
	 * @see #setEndDateTime(EndDateTimeType)
	 * @generated
	 */
	public EndDateTimeType getEndDateTime() {
		return (endDateTime == null) ? new EndDateTimeType() : endDateTime;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PeriodType#getEndDateTime <em>End Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date Time</em>' containment reference.
	 * @see #getEndDateTime()
	 * @generated
	 */
	public void setEndDateTime(EndDateTimeType newEndDateTime) {
		endDateTime = newEndDateTime;
	}

	/**
	 * Returns the value of the '<em><b>Duration Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Period. Duration. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The duration of a Period expressed as a code; ISO 8601</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Period</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Duration</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration Measure</em>' containment reference.
	 * @see #setDurationMeasure(DurationMeasureType)
	 * @generated
	 */
	public DurationMeasureType getDurationMeasure() {
		return (durationMeasure == null) ? new DurationMeasureType()
				: durationMeasure;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PeriodType#getDurationMeasure <em>Duration Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Measure</em>' containment reference.
	 * @see #getDurationMeasure()
	 * @generated
	 */
	public void setDurationMeasure(DurationMeasureType newDurationMeasure) {
		durationMeasure = newDurationMeasure;
	}

	/**
	 * Returns the value of the '<em><b>Description Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cbc.DescriptionCodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Period. Description. Code</ccts:DictionaryEntryName>
	 * 
	 *               <ccts:Version/>
	 *               <ccts:Definition>A decription of the Period expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Period</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Description</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description Code</em>' containment reference list.
	 * @generated
	 */
	public List getDescriptionCode() {
		if (descriptionCode == null) {
			descriptionCode = new ArrayList<DescriptionCodeType>();
		}
		return descriptionCode;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.descriptionCode == null) ? 0 : this.descriptionCode.hashCode());
		result = PRIME * result + ((this.durationMeasure == null) ? 0 : this.durationMeasure.hashCode());
		result = PRIME * result + ((this.endDateTime == null) ? 0 : this.endDateTime.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.startDateTime == null) ? 0 : this.startDateTime.hashCode());
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
		final PeriodType other = (PeriodType) obj;
		if (this.descriptionCode == null) {
			if (other.descriptionCode != null)
				return false;
		} else if (!this.descriptionCode.equals(other.descriptionCode))
			return false;
		if (this.durationMeasure == null) {
			if (other.durationMeasure != null)
				return false;
		} else if (!this.durationMeasure.equals(other.durationMeasure))
			return false;
		if (this.endDateTime == null) {
			if (other.endDateTime != null)
				return false;
		} else if (!this.endDateTime.equals(other.endDateTime))
			return false;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.startDateTime == null) {
			if (other.startDateTime != null)
				return false;
		} else if (!this.startDateTime.equals(other.startDateTime))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // PeriodType