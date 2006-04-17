/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import java.util.List;

import org.openebiz.core.common.cbc.DurationMeasureType;
import org.openebiz.core.common.cbc.EndDateTimeType;
import org.openebiz.core.common.cbc.StartDateTimeType;

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
 */
public interface PeriodType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

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
	 */
	StartDateTimeType getStartDateTime();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PeriodType#getStartDateTime <em>Start Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date Time</em>' containment reference.
	 * @see #getStartDateTime()
	 */
	void setStartDateTime(StartDateTimeType value);

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
	 */
	EndDateTimeType getEndDateTime();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PeriodType#getEndDateTime <em>End Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date Time</em>' containment reference.
	 * @see #getEndDateTime()
	 */
	void setEndDateTime(EndDateTimeType value);

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
	 */
	DurationMeasureType getDurationMeasure();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PeriodType#getDurationMeasure <em>Duration Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Measure</em>' containment reference.
	 * @see #getDurationMeasure()
	 */
	void setDurationMeasure(DurationMeasureType value);

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
	 */
	List getDescriptionCode();

} // PeriodType