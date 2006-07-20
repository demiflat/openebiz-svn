/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.AttributeIDType;
import org.openebiz.core.common.cbc.DescriptionType;
import org.openebiz.core.common.cbc.MaximumMeasureType;
import org.openebiz.core.common.cbc.MeasureType;
import org.openebiz.core.common.cbc.MinimumMeasureType;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Dimension. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about a measureable dimension of an item</ccts:Definition>
 *           <ccts:ObjectClass>Dimension</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.DimensionType#getAttributeID <em>Attribute ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DimensionType#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DimensionType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DimensionType#getMinimumMeasure <em>Minimum Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DimensionType#getMaximumMeasure <em>Maximum Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DimensionType implements Serializable {
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
	 * The cached value of the '{@link #getAttributeID() <em>Attribute ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeID()
	 * @generated
	 * @ordered
	 */
	protected AttributeIDType attributeID = null;

	/**
	 * The cached value of the '{@link #getMeasure() <em>Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasure()
	 * @generated
	 * @ordered
	 */
	protected MeasureType measure = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected DescriptionType description = null;

	/**
	 * The cached value of the '{@link #getMinimumMeasure() <em>Minimum Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumMeasure()
	 * @generated
	 * @ordered
	 */
	protected MinimumMeasureType minimumMeasure = null;

	/**
	 * The cached value of the '{@link #getMaximumMeasure() <em>Maximum Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumMeasure()
	 * @generated
	 * @ordered
	 */
	protected MaximumMeasureType maximumMeasure = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public DimensionType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.attributeID = this.getAttributeID();
		this.measure = this.getMeasure();
		this.description = this.getDescription();
		this.minimumMeasure = this.getMinimumMeasure();
		this.maximumMeasure = this.getMaximumMeasure();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getMeasure().getValue().toPlainString());
		return sdisplay.toString();
	}
	
	/**
	 * Returns the value of the '<em><b>Attribute ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Dimension. Attribute Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An identifier for the attribute to which the measure applies</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Dimension</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Attribute Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute ID</em>' containment reference.
	 * @see #setAttributeID(AttributeIDType)
	 * @generated
	 */
	public AttributeIDType getAttributeID() {
		return (attributeID == null) ? new AttributeIDType() : attributeID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DimensionType#getAttributeID <em>Attribute ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute ID</em>' containment reference.
	 * @see #getAttributeID()
	 * @generated
	 */
	public void setAttributeID(AttributeIDType newAttributeID) {
		attributeID = newAttributeID;
	}

	/**
	 * Returns the value of the '<em><b>Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Dimension. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The measurement value</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Dimension</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Measure</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measure</em>' containment reference.
	 * @see #setMeasure(MeasureType)
	 * @generated
	 */
	public MeasureType getMeasure() {
		return (measure == null) ? new MeasureType() : measure;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DimensionType#getMeasure <em>Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure</em>' containment reference.
	 * @see #getMeasure()
	 * @generated
	 */
	public void setMeasure(MeasureType newMeasure) {
		measure = newMeasure;
	}

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Dimension. Description. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A description of the attribute or measurement of the attribute</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Dimension</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Description</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(DescriptionType)
	 * @generated
	 */
	public DescriptionType getDescription() {
		return (description == null) ? new DescriptionType() : description;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DimensionType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	public void setDescription(DescriptionType newDescription) {
		description = newDescription;
	}

	/**
	 * Returns the value of the '<em><b>Minimum Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Dimension. Minimum_ Measure. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The minimum value in a range of measurement</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Dimension</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Minimum</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Measure</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Measure</em>' containment reference.
	 * @see #setMinimumMeasure(MinimumMeasureType)
	 * @generated
	 */
	public MinimumMeasureType getMinimumMeasure() {
		return (minimumMeasure == null) ? new MinimumMeasureType()
				: minimumMeasure;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DimensionType#getMinimumMeasure <em>Minimum Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Measure</em>' containment reference.
	 * @see #getMinimumMeasure()
	 * @generated
	 */
	public void setMinimumMeasure(MinimumMeasureType newMinimumMeasure) {
		minimumMeasure = newMinimumMeasure;
	}

	/**
	 * Returns the value of the '<em><b>Maximum Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Dimension. Maximum_ Measure. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The maximum value in a range of measurement</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Dimension</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Maximum</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Measure</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Measure</em>' containment reference.
	 * @see #setMaximumMeasure(MaximumMeasureType)
	 * @generated
	 */
	public MaximumMeasureType getMaximumMeasure() {
		return (maximumMeasure == null) ? new MaximumMeasureType()
				: maximumMeasure;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DimensionType#getMaximumMeasure <em>Maximum Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Measure</em>' containment reference.
	 * @see #getMaximumMeasure()
	 * @generated
	 */
	public void setMaximumMeasure(MaximumMeasureType newMaximumMeasure) {
		maximumMeasure = newMaximumMeasure;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.attributeID == null) ? 0 : this.attributeID.hashCode());
		result = PRIME * result + ((this.description == null) ? 0 : this.description.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.maximumMeasure == null) ? 0 : this.maximumMeasure.hashCode());
		result = PRIME * result + ((this.measure == null) ? 0 : this.measure.hashCode());
		result = PRIME * result + ((this.minimumMeasure == null) ? 0 : this.minimumMeasure.hashCode());
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
		final DimensionType other = (DimensionType) obj;
		if (this.attributeID == null) {
			if (other.attributeID != null)
				return false;
		} else if (!this.attributeID.equals(other.attributeID))
			return false;
		if (this.description == null) {
			if (other.description != null)
				return false;
		} else if (!this.description.equals(other.description))
			return false;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.maximumMeasure == null) {
			if (other.maximumMeasure != null)
				return false;
		} else if (!this.maximumMeasure.equals(other.maximumMeasure))
			return false;
		if (this.measure == null) {
			if (other.measure != null)
				return false;
		} else if (!this.measure.equals(other.measure))
			return false;
		if (this.minimumMeasure == null) {
			if (other.minimumMeasure != null)
				return false;
		} else if (!this.minimumMeasure.equals(other.minimumMeasure))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // DimensionType