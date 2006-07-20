/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import java.util.List;

import org.openebiz.core.common.cbc.ContractTypeCodeType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.IssueDateType;
import org.openebiz.core.common.cbc.IssueTimeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Contract. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about a Contract</ccts:Definition>
 *           <ccts:ObjectClass>Contract</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.ContractType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ContractType#getIssueDate <em>Issue Date</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ContractType#getIssueTime <em>Issue Time</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ContractType#getContractTypeCode <em>Contract Type Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ContractType#getValidityPeriod <em>Validity Period</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ContractType#getContractDocumentReference <em>Contract Document Reference</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface ContractType {
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
	 *               <ccts:DictionaryEntryName>Contract. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the Contract</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Contract</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:Examples>"CC23"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID</em>' containment reference.
	 * @see #setID(IDType)
	 */
	IDType getID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ContractType#getID <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' containment reference.
	 * @see #getID()
	 */
	void setID(IDType value);

	/**
	 * Returns the value of the '<em><b>Issue Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Contract. Issue Date. Date</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The date on which the Contract was issued.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Contract</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Issue Date</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue Date</em>' containment reference.
	 * @see #setIssueDate(IssueDateType)
	 */
	IssueDateType getIssueDate();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ContractType#getIssueDate <em>Issue Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Date</em>' containment reference.
	 * @see #getIssueDate()
	 */
	void setIssueDate(IssueDateType value);

	/**
	 * Returns the value of the '<em><b>Issue Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Contract. Issue Time. Time</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The time at cwhich the Contract was issued.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Contract</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Issue Time</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Time</ccts:RepresentationTerm>
	 *               <ccts:DataType>Time. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue Time</em>' containment reference.
	 * @see #setIssueTime(IssueTimeType)
	 */
	IssueTimeType getIssueTime();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ContractType#getIssueTime <em>Issue Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Time</em>' containment reference.
	 * @see #getIssueTime()
	 */
	void setIssueTime(IssueTimeType value);

	/**
	 * Returns the value of the '<em><b>Contract Type Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Contract. Contract Type. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The type of Contract expressed as a code</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Contract</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Contract Type</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contract Type Code</em>' containment reference.
	 * @see #setContractTypeCode(ContractTypeCodeType)
	 */
	ContractTypeCodeType getContractTypeCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ContractType#getContractTypeCode <em>Contract Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contract Type Code</em>' containment reference.
	 * @see #getContractTypeCode()
	 */
	void setContractTypeCode(ContractTypeCodeType value);

	/**
	 * Returns the value of the '<em><b>Validity Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Contract. Validity_ Period. Period</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Validity Period</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Contract</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Validity</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Period</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Period</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validity Period</em>' containment reference.
	 * @see #setValidityPeriod(PeriodType)
	 */
	PeriodType getValidityPeriod();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ContractType#getValidityPeriod <em>Validity Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validity Period</em>' containment reference.
	 * @see #getValidityPeriod()
	 */
	void setValidityPeriod(PeriodType value);

	/**
	 * Returns the value of the '<em><b>Contract Document Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.DocumentReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Contract. Contract_ Document Reference. Document Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Contract Document Reference</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Contract</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Contract</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Document Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Document Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contract Document Reference</em>' containment reference list.
	 */
	List getContractDocumentReference();

} // ContractType