/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.FamilyNameType;
import org.openebiz.core.common.cbc.FirstNameType;
import org.openebiz.core.common.cbc.JobTitleType;
import org.openebiz.core.common.cbc.MiddleNameType;
import org.openebiz.core.common.cbc.NameSuffixType;
import org.openebiz.core.common.cbc.OrganizationDepartmentType;
import org.openebiz.core.common.cbc.TitleType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Person. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about a person</ccts:Definition>
 *           <ccts:ObjectClass>Person</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.PersonType#getFirstName <em>First Name</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PersonType#getFamilyName <em>Family Name</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PersonType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PersonType#getMiddleName <em>Middle Name</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PersonType#getNameSuffix <em>Name Suffix</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PersonType#getJobTitle <em>Job Title</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.PersonType#getOrganizationDepartment <em>Organization Department</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface PersonType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Person. First. Name</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An Person's forename or first name</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Person</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>First</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Name</ccts:RepresentationTerm>
	 *               <ccts:DataType>Name. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First Name</em>' containment reference.
	 * @see #setFirstName(FirstNameType)
	 */
	FirstNameType getFirstName();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PersonType#getFirstName <em>First Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' containment reference.
	 * @see #getFirstName()
	 */
	void setFirstName(FirstNameType value);

	/**
	 * Returns the value of the '<em><b>Family Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Person. Family. Name</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An Person’s surname or family name</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Person</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Family</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Name</ccts:RepresentationTerm>
	 *               <ccts:DataType>Name. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Family Name</em>' containment reference.
	 * @see #setFamilyName(FamilyNameType)
	 */
	FamilyNameType getFamilyName();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PersonType#getFamilyName <em>Family Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family Name</em>' containment reference.
	 * @see #getFamilyName()
	 */
	void setFamilyName(FamilyNameType value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Person. Title. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An Person's address title e.g. Mr, Ms, Dr, Sir</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Person</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Title</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(TitleType)
	 */
	TitleType getTitle();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PersonType#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 */
	void setTitle(TitleType value);

	/**
	 * Returns the value of the '<em><b>Middle Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Person. Middle. Name</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An Person's middle name(s) and/or initial(s)</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Person</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Middle</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Name</ccts:RepresentationTerm>
	 *               <ccts:DataType>Name. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Middle Name</em>' containment reference.
	 * @see #setMiddleName(MiddleNameType)
	 */
	MiddleNameType getMiddleName();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PersonType#getMiddleName <em>Middle Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Middle Name</em>' containment reference.
	 * @see #getMiddleName()
	 */
	void setMiddleName(MiddleNameType value);

	/**
	 * Returns the value of the '<em><b>Name Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Person. Name Suffix. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A suffix to an Person's name e.g. PhD, OBE, Jnr</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Person</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Name Suffix</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Suffix</em>' containment reference.
	 * @see #setNameSuffix(NameSuffixType)
	 */
	NameSuffixType getNameSuffix();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PersonType#getNameSuffix <em>Name Suffix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Suffix</em>' containment reference.
	 * @see #getNameSuffix()
	 */
	void setNameSuffix(NameSuffixType value);

	/**
	 * Returns the value of the '<em><b>Job Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Person. Job Title. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An Person's job title within an organisation (for a particular role)</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Person</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Job Title</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Job Title</em>' containment reference.
	 * @see #setJobTitle(JobTitleType)
	 */
	JobTitleType getJobTitle();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PersonType#getJobTitle <em>Job Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Title</em>' containment reference.
	 * @see #getJobTitle()
	 */
	void setJobTitle(JobTitleType value);

	/**
	 * Returns the value of the '<em><b>Organization Department</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Person. Organization_ Department. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The department or sub-division of an organisation that the Person belongs to (for a particular role)</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Person</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Organization</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Department</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Department</em>' containment reference.
	 * @see #setOrganizationDepartment(OrganizationDepartmentType)
	 */
	OrganizationDepartmentType getOrganizationDepartment();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PersonType#getOrganizationDepartment <em>Organization Department</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Department</em>' containment reference.
	 * @see #getOrganizationDepartment()
	 */
	void setOrganizationDepartment(OrganizationDepartmentType value);

} // PersonType