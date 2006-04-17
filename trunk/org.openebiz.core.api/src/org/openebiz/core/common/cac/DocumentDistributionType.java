/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.MaximumCopiesNumericType;
import org.openebiz.core.common.cbc.PrintQualifierType;

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
 */
public interface DocumentDistributionType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

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
	 */
	PrintQualifierType getPrintQualifier();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DocumentDistributionType#getPrintQualifier <em>Print Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Print Qualifier</em>' containment reference.
	 * @see #getPrintQualifier()
	 */
	void setPrintQualifier(PrintQualifierType value);

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
	 */
	MaximumCopiesNumericType getMaximumCopiesNumeric();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DocumentDistributionType#getMaximumCopiesNumeric <em>Maximum Copies Numeric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Copies Numeric</em>' containment reference.
	 * @see #getMaximumCopiesNumeric()
	 */
	void setMaximumCopiesNumeric(MaximumCopiesNumericType value);

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
	 */
	PartyType getParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.DocumentDistributionType#getParty <em>Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' containment reference.
	 * @see #getParty()
	 */
	void setParty(PartyType value);

} // DocumentDistributionType