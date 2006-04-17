/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import java.util.List;

import org.openebiz.core.common.cbc.NoteType;
import org.openebiz.core.common.cbc.SubstitutionStatusCodeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Line Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Order Line. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about an Order Line</ccts:Definition>
 *           <ccts:ObjectClass>Order Line</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.OrderLineType#getSubstitutionStatusCode <em>Substitution Status Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.OrderLineType#getNote <em>Note</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.OrderLineType#getLineItem <em>Line Item</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.OrderLineType#getSellerProposedLineItem <em>Seller Proposed Line Item</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.OrderLineType#getSellerSubstitutedLineItem <em>Seller Substituted Line Item</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.OrderLineType#getBuyerProposedLineItem <em>Buyer Proposed Line Item</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.OrderLineType#getQuotationLineReference <em>Quotation Line Reference</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface OrderLineType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Substitution Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order Line. Substitution Status. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A code indicating the substitution status of the Order Line.  Order Line may indicate that a substitute is proposed by the Buyer or by the Seller (in Order Response) or that a substitution has been made by the Seller (in Order Response)</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Substitution Status</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substitution Status Code</em>' containment reference.
	 * @see #setSubstitutionStatusCode(SubstitutionStatusCodeType)
	 */
	SubstitutionStatusCodeType getSubstitutionStatusCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.OrderLineType#getSubstitutionStatusCode <em>Substitution Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substitution Status Code</em>' containment reference.
	 * @see #getSubstitutionStatusCode()
	 */
	void setSubstitutionStatusCode(SubstitutionStatusCodeType value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order Line. Note. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Free form text applying to the Order Line. This element may contain notes or any other similar information that is not contained explicitly in another structure.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Note</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference.
	 * @see #setNote(NoteType)
	 */
	NoteType getNote();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.OrderLineType#getNote <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' containment reference.
	 * @see #getNote()
	 */
	void setNote(NoteType value);

	/**
	 * Returns the value of the '<em><b>Line Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order Line. Line Item</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Line Item</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Line Item</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Line Item</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Item</em>' containment reference.
	 * @see #setLineItem(LineItemType)
	 */
	LineItemType getLineItem();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.OrderLineType#getLineItem <em>Line Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Item</em>' containment reference.
	 * @see #getLineItem()
	 */
	void setLineItem(LineItemType value);

	/**
	 * Returns the value of the '<em><b>Seller Proposed Line Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.LineItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order Line. Seller Proposed_ Line Item. Line Item</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Substitute Line Items proposed by the Seller (in Order Response)</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Seller Proposed</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Line Item</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Line Item</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Seller Proposed Line Item</em>' containment reference list.
	 */
	List getSellerProposedLineItem();

	/**
	 * Returns the value of the '<em><b>Seller Substituted Line Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.LineItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order Line. Seller Substituted_ Line Item. Line Item</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>item(s) replaced by the seller - the original ordered quantity, pricing etc which may be different from the substituted item. It is assumed that hazard and shipment details etc will be the same.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Seller Substituted</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Line Item</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Line Item</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Seller Substituted Line Item</em>' containment reference list.
	 */
	List getSellerSubstitutedLineItem();

	/**
	 * Returns the value of the '<em><b>Buyer Proposed Line Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.LineItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order Line. Buyer Proposed_ Line Item. Line Item</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Possible alternatives, proposed by the Buyer, to the Line Item</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Buyer Proposed</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Line Item</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Line Item</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Buyer Proposed Line Item</em>' containment reference list.
	 */
	List getBuyerProposedLineItem();

	/**
	 * Returns the value of the '<em><b>Quotation Line Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order Line. Quotation_ Line Reference. Line Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to a Line Reference for the quotation</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Quotation</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Line Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Line Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quotation Line Reference</em>' containment reference.
	 * @see #setQuotationLineReference(LineReferenceType)
	 */
	LineReferenceType getQuotationLineReference();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.OrderLineType#getQuotationLineReference <em>Quotation Line Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quotation Line Reference</em>' containment reference.
	 * @see #getQuotationLineReference()
	 */
	void setQuotationLineReference(LineReferenceType value);

} // OrderLineType