/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.ElectronicMailType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.NameType;
import org.openebiz.core.common.cbc.NoteType;
import org.openebiz.core.common.cbc.TelefaxType;
import org.openebiz.core.common.cbc.TelephoneType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Contact. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about a contactable person or organisation department</ccts:Definition>
 *           <ccts:ObjectClass>Contact</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.ContactType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ContactType#getName <em>Name</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ContactType#getTelephone <em>Telephone</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ContactType#getTelefax <em>Telefax</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ContactType#getElectronicMail <em>Electronic Mail</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ContactType#getNote <em>Note</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ContactType#getOtherCommunication <em>Other Communication</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContactType implements Serializable {
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
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected NameType name = null;

	/**
	 * The cached value of the '{@link #getTelephone() <em>Telephone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephone()
	 * @generated
	 * @ordered
	 */
	protected TelephoneType telephone = null;

	/**
	 * The cached value of the '{@link #getTelefax() <em>Telefax</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefax()
	 * @generated
	 * @ordered
	 */
	protected TelefaxType telefax = null;

	/**
	 * The cached value of the '{@link #getElectronicMail() <em>Electronic Mail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectronicMail()
	 * @generated
	 * @ordered
	 */
	protected ElectronicMailType electronicMail = null;

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
	 * The cached value of the '{@link #getOtherCommunication() <em>Other Communication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCommunication()
	 * @generated
	 * @ordered
	 */
	protected List otherCommunication = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ContactType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.iD = this.getID();
		this.name = this.getName();
		this.telephone = this.getTelephone();
		this.telefax = this.getTelefax();
		this.electronicMail = this.getElectronicMail();
		this.note = this.getNote();
		this.otherCommunication = this.getOtherCommunication();
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
	 *               <ccts:DictionaryEntryName>Contact. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An identifier for the Contact</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Contact</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:Examples>"Receivals Clerk"</ccts:Examples>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ContactType#getID <em>ID</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Contact. Name</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The name of the Contact</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Contact</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Name</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Name</ccts:RepresentationTerm>
	 *               <ccts:DataType>Name. Type</ccts:DataType>
	 *               <ccts:Examples>"Delivery Dock"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(NameType)
	 * @generated
	 */
	public NameType getName() {
		return (name == null) ? new NameType() : name;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ContactType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	public void setName(NameType newName) {
		name = newName;
	}

	/**
	 * Returns the value of the '<em><b>Telephone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Contact. Telephone. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The telephone number of the Contact</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Contact</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Telephone</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telephone</em>' containment reference.
	 * @see #setTelephone(TelephoneType)
	 * @generated
	 */
	public TelephoneType getTelephone() {
		return (telephone == null) ? new TelephoneType() : telephone;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ContactType#getTelephone <em>Telephone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telephone</em>' containment reference.
	 * @see #getTelephone()
	 * @generated
	 */
	public void setTelephone(TelephoneType newTelephone) {
		telephone = newTelephone;
	}

	/**
	 * Returns the value of the '<em><b>Telefax</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Contact. Telefax. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The fax number of the Contact</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Contact</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Telefax</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telefax</em>' containment reference.
	 * @see #setTelefax(TelefaxType)
	 * @generated
	 */
	public TelefaxType getTelefax() {
		return (telefax == null) ? new TelefaxType() : telefax;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ContactType#getTelefax <em>Telefax</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telefax</em>' containment reference.
	 * @see #getTelefax()
	 * @generated
	 */
	public void setTelefax(TelefaxType newTelefax) {
		telefax = newTelefax;
	}

	/**
	 * Returns the value of the '<em><b>Electronic Mail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Contact. Electronic Mail. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The Email address of the Contact</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Contact</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Electronic Mail</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Electronic Mail</em>' containment reference.
	 * @see #setElectronicMail(ElectronicMailType)
	 * @generated
	 */
	public ElectronicMailType getElectronicMail() {
		return (electronicMail == null) ? new ElectronicMailType()
				: electronicMail;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ContactType#getElectronicMail <em>Electronic Mail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Electronic Mail</em>' containment reference.
	 * @see #getElectronicMail()
	 * @generated
	 */
	public void setElectronicMail(ElectronicMailType newElectronicMail) {
		electronicMail = newElectronicMail;
	}

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Contact. Note. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A note describing the circumstances in which the Contact can be used such as 'Emergency' or 'After Hours'</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Contact</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ContactType#getNote <em>Note</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Other Communication</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.CommunicationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Contact. Other_ Communication. Communication</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Other Communication</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Contact</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Other</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Communication</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Communication</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Communication</em>' containment reference list.
	 * @generated
	 */
	public List getOtherCommunication() {
		if (otherCommunication == null) {
			otherCommunication = new ArrayList<CommunicationType>();
		}
		return otherCommunication;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.electronicMail == null) ? 0 : this.electronicMail.hashCode());
		result = PRIME * result + ((this.iD == null) ? 0 : this.iD.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.name == null) ? 0 : this.name.hashCode());
		result = PRIME * result + ((this.note == null) ? 0 : this.note.hashCode());
		result = PRIME * result + ((this.otherCommunication == null) ? 0 : this.otherCommunication.hashCode());
		result = PRIME * result + ((this.telefax == null) ? 0 : this.telefax.hashCode());
		result = PRIME * result + ((this.telephone == null) ? 0 : this.telephone.hashCode());
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
		final ContactType other = (ContactType) obj;
		if (this.electronicMail == null) {
			if (other.electronicMail != null)
				return false;
		} else if (!this.electronicMail.equals(other.electronicMail))
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
		if (this.name == null) {
			if (other.name != null)
				return false;
		} else if (!this.name.equals(other.name))
			return false;
		if (this.note == null) {
			if (other.note != null)
				return false;
		} else if (!this.note.equals(other.note))
			return false;
		if (this.otherCommunication == null) {
			if (other.otherCommunication != null)
				return false;
		} else if (!this.otherCommunication.equals(other.otherCommunication))
			return false;
		if (this.telefax == null) {
			if (other.telefax != null)
				return false;
		} else if (!this.telefax.equals(other.telefax))
			return false;
		if (this.telephone == null) {
			if (other.telephone != null)
				return false;
		} else if (!this.telephone.equals(other.telephone))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // ContactType