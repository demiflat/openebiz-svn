/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import java.util.List;

import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.LineExtensionAmountType;
import org.openebiz.core.common.cbc.NoteType;
import org.openebiz.core.common.cbc.QuantityType;
import org.openebiz.core.common.cbc.TotalTaxAmountType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quotation Line Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Quotation Line. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about a Quotation Line</ccts:Definition>
 *           <ccts:ObjectClass>Quotation Line</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.QuotationLineType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.QuotationLineType#getNote <em>Note</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.QuotationLineType#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.QuotationLineType#getLineExtensionAmount <em>Line Extension Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.QuotationLineType#getTotalTaxAmount <em>Total Tax Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.QuotationLineType#getLineItem <em>Line Item</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.QuotationLineType#getSellerProposedLineItem <em>Seller Proposed Line Item</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface QuotationLineType {
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
	 *               <ccts:DictionaryEntryName>Quotation Line. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the Quotation Line Item</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Quotation Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID</em>' containment reference.
	 * @see #setID(IDType)
	 */
	IDType getID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.QuotationLineType#getID <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' containment reference.
	 * @see #getID()
	 */
	void setID(IDType value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Quotation Line. Note. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Free form text applying to the Quotation Line. This element may contain notes or any other similar information that is not contained explicitly in another structure.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Quotation Line</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.QuotationLineType#getNote <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' containment reference.
	 * @see #getNote()
	 */
	void setNote(NoteType value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Quotation Line. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The quantity of the Item quoted</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Quotation Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(QuantityType)
	 */
	QuantityType getQuantity();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.QuotationLineType#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 */
	void setQuantity(QuantityType value);

	/**
	 * Returns the value of the '<em><b>Line Extension Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Quotation Line. Line Extension Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The total amount for the Quotation Line including Allowance Charges but net of taxes</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Quotation Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Line Extension Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Extension Amount</em>' containment reference.
	 * @see #setLineExtensionAmount(LineExtensionAmountType)
	 */
	LineExtensionAmountType getLineExtensionAmount();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.QuotationLineType#getLineExtensionAmount <em>Line Extension Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Extension Amount</em>' containment reference.
	 * @see #getLineExtensionAmount()
	 */
	void setLineExtensionAmount(LineExtensionAmountType value);

	/**
	 * Returns the value of the '<em><b>Total Tax Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Quotation Line. Total_ Tax Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The total tax amount for the Quotation Line</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Quotation Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Total</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Tax Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Tax Amount</em>' containment reference.
	 * @see #setTotalTaxAmount(TotalTaxAmountType)
	 */
	TotalTaxAmountType getTotalTaxAmount();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.QuotationLineType#getTotalTaxAmount <em>Total Tax Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Tax Amount</em>' containment reference.
	 * @see #getTotalTaxAmount()
	 */
	void setTotalTaxAmount(TotalTaxAmountType value);

	/**
	 * Returns the value of the '<em><b>Line Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Quotation Line. Line Item</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Line Item</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Quotation Line</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.QuotationLineType#getLineItem <em>Line Item</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Quotation Line. Seller Proposed_ Line Item. Line Item</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to a proposed substitute Line Item</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Quotation Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Seller Proposed</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Line Item</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Line Item</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Seller Proposed Line Item</em>' containment reference list.
	 */
	List getSellerProposedLineItem();

} // QuotationLineType