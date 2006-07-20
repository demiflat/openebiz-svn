/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.FamilyNameType;
import org.openebiz.core.common.cbc.FirstNameType;
import org.openebiz.core.common.cbc.JobTitleType;
import org.openebiz.core.common.cbc.MiddleNameType;
import org.openebiz.core.common.cbc.NameSuffixType;
import org.openebiz.core.common.cbc.OrganizationDepartmentType;
import org.openebiz.core.common.cbc.TitleType;
import java.io.Serializable;

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
 * @generated
 */
public class PersonType implements Serializable {
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
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected FirstNameType firstName = null;

	/**
	 * The cached value of the '{@link #getFamilyName() <em>Family Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyName()
	 * @generated
	 * @ordered
	 */
	protected FamilyNameType familyName = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected TitleType title = null;

	/**
	 * The cached value of the '{@link #getMiddleName() <em>Middle Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiddleName()
	 * @generated
	 * @ordered
	 */
	protected MiddleNameType middleName = null;

	/**
	 * The cached value of the '{@link #getNameSuffix() <em>Name Suffix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSuffix()
	 * @generated
	 * @ordered
	 */
	protected NameSuffixType nameSuffix = null;

	/**
	 * The cached value of the '{@link #getJobTitle() <em>Job Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobTitle()
	 * @generated
	 * @ordered
	 */
	protected JobTitleType jobTitle = null;

	/**
	 * The cached value of the '{@link #getOrganizationDepartment() <em>Organization Department</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationDepartment()
	 * @generated
	 * @ordered
	 */
	protected OrganizationDepartmentType organizationDepartment = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public PersonType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.firstName = this.getFirstName();
		this.familyName = this.getFamilyName();
		this.title = this.getTitle();
		this.middleName = this.getMiddleName();
		this.nameSuffix = this.getNameSuffix();
		this.jobTitle = this.getJobTitle();
		this.organizationDepartment = this.getOrganizationDepartment();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getFamilyName().getValue());
		sdisplay.append(", ");
		sdisplay.append(this.getFirstName().getValue());
		return sdisplay.toString();
	}
	
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
	 * @generated
	 */
	public FirstNameType getFirstName() {
		return (firstName == null) ? new FirstNameType() : firstName;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PersonType#getFirstName <em>First Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' containment reference.
	 * @see #getFirstName()
	 * @generated
	 */
	public void setFirstName(FirstNameType newFirstName) {
		firstName = newFirstName;
	}

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
	 * @generated
	 */
	public FamilyNameType getFamilyName() {
		return (familyName == null) ? new FamilyNameType() : familyName;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PersonType#getFamilyName <em>Family Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family Name</em>' containment reference.
	 * @see #getFamilyName()
	 * @generated
	 */
	public void setFamilyName(FamilyNameType newFamilyName) {
		familyName = newFamilyName;
	}

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
	 * @generated
	 */
	public TitleType getTitle() {
		return (title == null) ? new TitleType() : title;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PersonType#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	public void setTitle(TitleType newTitle) {
		title = newTitle;
	}

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
	 * @generated
	 */
	public MiddleNameType getMiddleName() {
		return (middleName == null) ? new MiddleNameType() : middleName;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PersonType#getMiddleName <em>Middle Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Middle Name</em>' containment reference.
	 * @see #getMiddleName()
	 * @generated
	 */
	public void setMiddleName(MiddleNameType newMiddleName) {
		middleName = newMiddleName;
	}

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
	 * @generated
	 */
	public NameSuffixType getNameSuffix() {
		return (nameSuffix == null) ? new NameSuffixType() : nameSuffix;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PersonType#getNameSuffix <em>Name Suffix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Suffix</em>' containment reference.
	 * @see #getNameSuffix()
	 * @generated
	 */
	public void setNameSuffix(NameSuffixType newNameSuffix) {
		nameSuffix = newNameSuffix;
	}

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
	 * @generated
	 */
	public JobTitleType getJobTitle() {
		return (jobTitle == null) ? new JobTitleType() : jobTitle;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PersonType#getJobTitle <em>Job Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Title</em>' containment reference.
	 * @see #getJobTitle()
	 * @generated
	 */
	public void setJobTitle(JobTitleType newJobTitle) {
		jobTitle = newJobTitle;
	}

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
	 * @generated
	 */
	public OrganizationDepartmentType getOrganizationDepartment() {
		return (organizationDepartment == null) ? new OrganizationDepartmentType()
				: organizationDepartment;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.PersonType#getOrganizationDepartment <em>Organization Department</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Department</em>' containment reference.
	 * @see #getOrganizationDepartment()
	 * @generated
	 */
	public void setOrganizationDepartment(
			OrganizationDepartmentType newOrganizationDepartment) {
		organizationDepartment = newOrganizationDepartment;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.familyName == null) ? 0 : this.familyName.hashCode());
		result = PRIME * result + ((this.firstName == null) ? 0 : this.firstName.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.jobTitle == null) ? 0 : this.jobTitle.hashCode());
		result = PRIME * result + ((this.middleName == null) ? 0 : this.middleName.hashCode());
		result = PRIME * result + ((this.nameSuffix == null) ? 0 : this.nameSuffix.hashCode());
		result = PRIME * result + ((this.organizationDepartment == null) ? 0 : this.organizationDepartment.hashCode());
		result = PRIME * result + ((this.title == null) ? 0 : this.title.hashCode());
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
		final PersonType other = (PersonType) obj;
		if (this.familyName == null) {
			if (other.familyName != null)
				return false;
		} else if (!this.familyName.equals(other.familyName))
			return false;
		if (this.firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!this.firstName.equals(other.firstName))
			return false;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.jobTitle == null) {
			if (other.jobTitle != null)
				return false;
		} else if (!this.jobTitle.equals(other.jobTitle))
			return false;
		if (this.middleName == null) {
			if (other.middleName != null)
				return false;
		} else if (!this.middleName.equals(other.middleName))
			return false;
		if (this.nameSuffix == null) {
			if (other.nameSuffix != null)
				return false;
		} else if (!this.nameSuffix.equals(other.nameSuffix))
			return false;
		if (this.organizationDepartment == null) {
			if (other.organizationDepartment != null)
				return false;
		} else if (!this.organizationDepartment.equals(other.organizationDepartment))
			return false;
		if (this.title == null) {
			if (other.title != null)
				return false;
		} else if (!this.title.equals(other.title))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // PersonType