/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.MaximumCopiesNumericType;
import org.openebiz.core.common.cbc.PrintQualifierType;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Distribution Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Document Distribution. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>The details of the distribution of the document among business  partners</ccts:Definition>
 *           <ccts:ObjectClass>Document Distribution</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.DocumentDistributionType#getPrintQualifier <em>Print Qualifier</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DocumentDistributionType#getMaximumCopiesNumeric <em>Maximum Copies Numeric</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.DocumentDistributionType#getParty <em>Party</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentDistributionType implements Serializable {
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
	 * The cached value of the '{@link #getPrintQualifier() <em>Print Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintQualifier()
	 * @generated
	 * @ordered
	 */
	protected PrintQualifierType printQualifier = null;

	/**
	 * The cached value of the '{@link #getMaximumCopiesNumeric() <em>Maximum Copies Numeric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumCopiesNumeric()
	 * @generated
	 * @ordered
	 */
	protected MaximumCopiesNumericType maximumCopiesNumeric = null;

	/**
	 * The cached value of the '{@link #getParty() <em>Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParty()
	 * @generated
	 * @ordered
	 */
	protected PartyType party = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public DocumentDistributionType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.printQualifier = this.getPrintQualifier();
		this.maximumCopiesNumeric = this.getMaximumCopiesNumeric();
		this.party = this.getParty();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getMaximumCopiesNumeric().getValue().toPlainString());
		return sdisplay.toString();
	}
	
	/**
	 * Returns the value of the '<em><b>Print Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Document Distribution. Print Qualifier. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The access right to the partner for the document that is distributed</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Document Distribution</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Print Qualifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Print Qualifier</em>' containment reference.
	 * @see #setPrintQualifier(PrintQualifierType)
	 * @generated
	 */
	public PrintQualifierType getPrintQualifier() {
		return (printQualifier == null) ? new PrintQualifierType()
				: printQualifier;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DocumentDistributionType#getPrintQualifier <em>Print Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Print Qualifier</em>' containment reference.
	 * @see #getPrintQualifier()
	 * @generated
	 */
	public void setPrintQualifier(PrintQualifierType newPrintQualifier) {
		printQualifier = newPrintQualifier;
	}

	/**
	 * Returns the value of the '<em><b>Maximum Copies Numeric</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Document Distribution. Maximum_ Copies. Numeric</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Specifies the maximum number of copies of the document that the user can print</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Document Distribution</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Maximum</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Copies</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Numeric</ccts:RepresentationTerm>
	 *               <ccts:DataType>Numeric. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Copies Numeric</em>' containment reference.
	 * @see #setMaximumCopiesNumeric(MaximumCopiesNumericType)
	 * @generated
	 */
	public MaximumCopiesNumericType getMaximumCopiesNumeric() {
		return (maximumCopiesNumeric == null) ? new MaximumCopiesNumericType()
				: maximumCopiesNumeric;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DocumentDistributionType#getMaximumCopiesNumeric <em>Maximum Copies Numeric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Copies Numeric</em>' containment reference.
	 * @see #getMaximumCopiesNumeric()
	 * @generated
	 */
	public void setMaximumCopiesNumeric(
			MaximumCopiesNumericType newMaximumCopiesNumeric) {
		maximumCopiesNumeric = newMaximumCopiesNumeric;
	}

	/**
	 * Returns the value of the '<em><b>Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Document Distribution. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Details of the partner who can access the document</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Document Distribution</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Party</em>' containment reference.
	 * @see #setParty(PartyType)
	 * @generated
	 */
	public PartyType getParty() {
		return (party == null) ? new PartyType() : party;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DocumentDistributionType#getParty <em>Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' containment reference.
	 * @see #getParty()
	 * @generated
	 */
	public void setParty(PartyType newParty) {
		party = newParty;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.maximumCopiesNumeric == null) ? 0 : this.maximumCopiesNumeric.hashCode());
		result = PRIME * result + ((this.party == null) ? 0 : this.party.hashCode());
		result = PRIME * result + ((this.printQualifier == null) ? 0 : this.printQualifier.hashCode());
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
		final DocumentDistributionType other = (DocumentDistributionType) obj;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.maximumCopiesNumeric == null) {
			if (other.maximumCopiesNumeric != null)
				return false;
		} else if (!this.maximumCopiesNumeric.equals(other.maximumCopiesNumeric))
			return false;
		if (this.party == null) {
			if (other.party != null)
				return false;
		} else if (!this.party.equals(other.party))
			return false;
		if (this.printQualifier == null) {
			if (other.printQualifier != null)
				return false;
		} else if (!this.printQualifier.equals(other.printQualifier))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // DocumentDistributionType