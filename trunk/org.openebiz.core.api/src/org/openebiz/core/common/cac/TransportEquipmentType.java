/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import java.util.List;

import org.openebiz.core.common.cbc.DispositionCodeType;
import org.openebiz.core.common.cbc.FullnessIndicationCodeType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.InformationType;
import org.openebiz.core.common.cbc.LegalStatusIndicatorType;
import org.openebiz.core.common.cbc.OwnerTypeCodeType;
import org.openebiz.core.common.cbc.ProviderTypeCodeType;
import org.openebiz.core.common.cbc.RefrigerationOnIndicatorType;
import org.openebiz.core.common.cbc.ReturnabilityIndicatorType;
import org.openebiz.core.common.cbc.SizeTypeCodeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transport Equipment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Transport Equipment. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about Transport Equipment; a piece of equipment used to transport goods</ccts:Definition>
 *           <ccts:ObjectClass>Transport Equipment</ccts:ObjectClass>
 *           <ccts:AlternativeBusinessTerms>Shipping Container, Sea Container, Rail Wagon, Pallet, Trailer, Unit Load Device, ULD</ccts:AlternativeBusinessTerms>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentType#getProviderTypeCode <em>Provider Type Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentType#getOwnerTypeCode <em>Owner Type Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentType#getSizeTypeCode <em>Size Type Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentType#getDispositionCode <em>Disposition Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentType#getFullnessIndicationCode <em>Fullness Indication Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentType#getRefrigerationOnIndicator <em>Refrigeration On Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentType#getInformation <em>Information</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentType#getReturnabilityIndicator <em>Returnability Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentType#getLegalStatusIndicator <em>Legal Status Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentType#getMeasurementDimension <em>Measurement Dimension</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentType#getTransportEquipmentSeal <em>Transport Equipment Seal</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentType#getMinimumTemperature <em>Minimum Temperature</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentType#getMaximumTemperature <em>Maximum Temperature</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentType#getProviderParty <em>Provider Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentType#getLoadingProofParty <em>Loading Proof Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.TransportEquipmentType#getLoadingLocation <em>Loading Location</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface TransportEquipmentType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Equipment. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for Transport Equipment</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:Examples>"OCLU 1234567"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID</em>' containment reference.
	 * @see #setID(IDType)
	 */
	IDType getID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportEquipmentType#getID <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' containment reference.
	 * @see #getID()
	 */
	void setID(IDType value);

	/**
	 * Returns the value of the '<em><b>Provider Type Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Equipment. Provider Type. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An identifier for the type of provider for the Transport Equipment</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Provider Type</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider Type Code</em>' containment reference.
	 * @see #setProviderTypeCode(ProviderTypeCodeType)
	 */
	ProviderTypeCodeType getProviderTypeCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportEquipmentType#getProviderTypeCode <em>Provider Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Type Code</em>' containment reference.
	 * @see #getProviderTypeCode()
	 */
	void setProviderTypeCode(ProviderTypeCodeType value);

	/**
	 * Returns the value of the '<em><b>Owner Type Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Equipment. Owner Type. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An identifier for the type of owner of a piece of Transport Equipment</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Owner Type</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owner Type Code</em>' containment reference.
	 * @see #setOwnerTypeCode(OwnerTypeCodeType)
	 */
	OwnerTypeCodeType getOwnerTypeCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportEquipmentType#getOwnerTypeCode <em>Owner Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Type Code</em>' containment reference.
	 * @see #getOwnerTypeCode()
	 */
	void setOwnerTypeCode(OwnerTypeCodeType value);

	/**
	 * Returns the value of the '<em><b>Size Type Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Equipment. Size Type. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The size and type of a piece of Transport Equipment expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Size Type</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size Type Code</em>' containment reference.
	 * @see #setSizeTypeCode(SizeTypeCodeType)
	 */
	SizeTypeCodeType getSizeTypeCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportEquipmentType#getSizeTypeCode <em>Size Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Type Code</em>' containment reference.
	 * @see #getSizeTypeCode()
	 */
	void setSizeTypeCode(SizeTypeCodeType value);

	/**
	 * Returns the value of the '<em><b>Disposition Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Equipment. Disposition. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The current disposition of the Transport Equipment expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Disposition</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Status</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disposition Code</em>' containment reference.
	 * @see #setDispositionCode(DispositionCodeType)
	 */
	DispositionCodeType getDispositionCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportEquipmentType#getDispositionCode <em>Disposition Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disposition Code</em>' containment reference.
	 * @see #getDispositionCode()
	 */
	void setDispositionCode(DispositionCodeType value);

	/**
	 * Returns the value of the '<em><b>Fullness Indication Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Equipment. Fullness Indication. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A code indicating whether a piece of transport equipment is full, partially full or empty</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Fullness Indication</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fullness Indication Code</em>' containment reference.
	 * @see #setFullnessIndicationCode(FullnessIndicationCodeType)
	 */
	FullnessIndicationCodeType getFullnessIndicationCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportEquipmentType#getFullnessIndicationCode <em>Fullness Indication Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fullness Indication Code</em>' containment reference.
	 * @see #getFullnessIndicationCode()
	 */
	void setFullnessIndicationCode(FullnessIndicationCodeType value);

	/**
	 * Returns the value of the '<em><b>Refrigeration On Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Equipment. Refrigeration On Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Indicates whether refrigeration is on (true) or off (false) for the Transportation equipment</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Refrigeration On Indicator</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refrigeration On Indicator</em>' containment reference.
	 * @see #setRefrigerationOnIndicator(RefrigerationOnIndicatorType)
	 */
	RefrigerationOnIndicatorType getRefrigerationOnIndicator();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportEquipmentType#getRefrigerationOnIndicator <em>Refrigeration On Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refrigeration On Indicator</em>' containment reference.
	 * @see #getRefrigerationOnIndicator()
	 */
	void setRefrigerationOnIndicator(RefrigerationOnIndicatorType value);

	/**
	 * Returns the value of the '<em><b>Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Equipment. Information. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Additional information about the Transport Equipment</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Information</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Information</em>' containment reference.
	 * @see #setInformation(InformationType)
	 */
	InformationType getInformation();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportEquipmentType#getInformation <em>Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information</em>' containment reference.
	 * @see #getInformation()
	 */
	void setInformation(InformationType value);

	/**
	 * Returns the value of the '<em><b>Returnability Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Equipment. Returnability Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Indication as to whether or not a particular item of transport equipment is returnable.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Returnability Indicator</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Returnability Indicator</em>' containment reference.
	 * @see #setReturnabilityIndicator(ReturnabilityIndicatorType)
	 */
	ReturnabilityIndicatorType getReturnabilityIndicator();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportEquipmentType#getReturnabilityIndicator <em>Returnability Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returnability Indicator</em>' containment reference.
	 * @see #getReturnabilityIndicator()
	 */
	void setReturnabilityIndicator(ReturnabilityIndicatorType value);

	/**
	 * Returns the value of the '<em><b>Legal Status Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Equipment. Legal Status Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Legal status of the transport equipment with respect to the Container Convention code.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Legal Status Indicator</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Legal Status Indicator</em>' containment reference.
	 * @see #setLegalStatusIndicator(LegalStatusIndicatorType)
	 */
	LegalStatusIndicatorType getLegalStatusIndicator();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportEquipmentType#getLegalStatusIndicator <em>Legal Status Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legal Status Indicator</em>' containment reference.
	 * @see #getLegalStatusIndicator()
	 */
	void setLegalStatusIndicator(LegalStatusIndicatorType value);

	/**
	 * Returns the value of the '<em><b>Measurement Dimension</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.DimensionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Equipment. Measurement_ Dimension. Dimension</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Dimension</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Measurement</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Dimension</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Dimension</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measurement Dimension</em>' containment reference list.
	 */
	List getMeasurementDimension();

	/**
	 * Returns the value of the '<em><b>Transport Equipment Seal</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.TransportEquipmentSealType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Equipment. Transport Equipment Seal</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Transport Equiment Seal</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Transport Equipment Seal</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Transport Equipment Seal</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transport Equipment Seal</em>' containment reference list.
	 */
	List getTransportEquipmentSeal();

	/**
	 * Returns the value of the '<em><b>Minimum Temperature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Equipment. Minimum_ Temperature. Temperature</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The minimum required operating temperature for the container (Reefer)</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Minimum</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Temperature</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Temperature</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Temperature</em>' containment reference.
	 * @see #setMinimumTemperature(TemperatureType)
	 */
	TemperatureType getMinimumTemperature();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportEquipmentType#getMinimumTemperature <em>Minimum Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Temperature</em>' containment reference.
	 * @see #getMinimumTemperature()
	 */
	void setMinimumTemperature(TemperatureType value);

	/**
	 * Returns the value of the '<em><b>Maximum Temperature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Equipment. Maximum_ Temperature. Temperature</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The maximum required operating termperature for the container (Reefer)</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Maximum</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Temperature</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Temperature</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Temperature</em>' containment reference.
	 * @see #setMaximumTemperature(TemperatureType)
	 */
	TemperatureType getMaximumTemperature();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportEquipmentType#getMaximumTemperature <em>Maximum Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Temperature</em>' containment reference.
	 * @see #getMaximumTemperature()
	 */
	void setMaximumTemperature(TemperatureType value);

	/**
	 * Returns the value of the '<em><b>Provider Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Equipment. Provider_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition/>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Provider</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider Party</em>' containment reference.
	 * @see #setProviderParty(PartyType)
	 */
	PartyType getProviderParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportEquipmentType#getProviderParty <em>Provider Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Party</em>' containment reference.
	 * @see #getProviderParty()
	 */
	void setProviderParty(PartyType value);

	/**
	 * Returns the value of the '<em><b>Loading Proof Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Equipment. Loading Proof_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the authorized party responsible for certifying that the goods were loaded into the transport equipment</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Loading Proof</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Party responsible for proof of vanning (WCO ID 059)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loading Proof Party</em>' containment reference.
	 * @see #setLoadingProofParty(PartyType)
	 */
	PartyType getLoadingProofParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportEquipmentType#getLoadingProofParty <em>Loading Proof Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loading Proof Party</em>' containment reference.
	 * @see #getLoadingProofParty()
	 */
	void setLoadingProofParty(PartyType value);

	/**
	 * Returns the value of the '<em><b>Loading Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Transport Equipment. Loading_ Location. Location</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>To identify the location where the goods are loaded into the transport equipment.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Transport Equipment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Loading</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Location</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Location</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Vanning address (WCO ID 068), Stuffing location</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loading Location</em>' containment reference.
	 * @see #setLoadingLocation(LocationType)
	 */
	LocationType getLoadingLocation();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.TransportEquipmentType#getLoadingLocation <em>Loading Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loading Location</em>' containment reference.
	 * @see #getLoadingLocation()
	 */
	void setLoadingLocation(LocationType value);

} // TransportEquipmentType