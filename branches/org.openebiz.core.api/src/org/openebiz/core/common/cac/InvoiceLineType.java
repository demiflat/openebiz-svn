/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import java.util.List;

import org.openebiz.core.common.cbc.AccountingCostCodeType;
import org.openebiz.core.common.cbc.GUIDType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.InvoicedQuantityType;
import org.openebiz.core.common.cbc.LineExtensionAmountType;
import org.openebiz.core.common.cbc.NoteType;
import org.openebiz.core.common.cbc.TaxPointDateType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoice Line Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Invoice Line. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about an Invoice Line</ccts:Definition>
 *           <ccts:ObjectClass>Invoice Line</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.InvoiceLineType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.InvoiceLineType#getGUID <em>GUID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.InvoiceLineType#getNote <em>Note</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.InvoiceLineType#getInvoicedQuantity <em>Invoiced Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.InvoiceLineType#getLineExtensionAmount <em>Line Extension Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.InvoiceLineType#getTaxPointDate <em>Tax Point Date</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.InvoiceLineType#getAccountingCostCode <em>Accounting Cost Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.InvoiceLineType#getOrderLineReference <em>Order Line Reference</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.InvoiceLineType#getDespatchLineReference <em>Despatch Line Reference</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.InvoiceLineType#getReceiptLineReference <em>Receipt Line Reference</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.InvoiceLineType#getDelivery <em>Delivery</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.InvoiceLineType#getPaymentTerms <em>Payment Terms</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.InvoiceLineType#getAllowanceCharge <em>Allowance Charge</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.InvoiceLineType#getTaxTotal <em>Tax Total</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.InvoiceLineType#getItem <em>Item</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.InvoiceLineType#getBasePrice <em>Base Price</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.InvoiceLineType#getDeliveryTerms <em>Delivery Terms</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.InvoiceLineType#getItemInstance <em>Item Instance</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface InvoiceLineType {
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
	 *               <ccts:DictionaryEntryName>Invoice Line. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the Invoice Line</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice Line</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.InvoiceLineType#getID <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' containment reference.
	 * @see #getID()
	 */
	void setID(IDType value);

	/**
	 * Returns the value of the '<em><b>GUID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice Line. Globally Unique Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A computer-generated globally unique identifier (GUID) for the Invoice Line instance</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Globally Unique Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GUID</em>' containment reference.
	 * @see #setGUID(GUIDType)
	 */
	GUIDType getGUID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.InvoiceLineType#getGUID <em>GUID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GUID</em>' containment reference.
	 * @see #getGUID()
	 */
	void setGUID(GUIDType value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice Line. Note. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Free form text applying to the Invoice Line. This element may contain notes or any other similar information that is not contained explicitly in another structure.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice Line</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.InvoiceLineType#getNote <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' containment reference.
	 * @see #getNote()
	 */
	void setNote(NoteType value);

	/**
	 * Returns the value of the '<em><b>Invoiced Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice Line. Invoiced_ Quantity. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The quantity (of Items) on the Invoice Line</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Invoiced</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invoiced Quantity</em>' containment reference.
	 * @see #setInvoicedQuantity(InvoicedQuantityType)
	 */
	InvoicedQuantityType getInvoicedQuantity();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.InvoiceLineType#getInvoicedQuantity <em>Invoiced Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoiced Quantity</em>' containment reference.
	 * @see #getInvoicedQuantity()
	 */
	void setInvoicedQuantity(InvoicedQuantityType value);

	/**
	 * Returns the value of the '<em><b>Line Extension Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice Line. Line Extension Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The total amount for the Invoice Line including Allowance Charges but net of taxes</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice Line</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.InvoiceLineType#getLineExtensionAmount <em>Line Extension Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Extension Amount</em>' containment reference.
	 * @see #getLineExtensionAmount()
	 */
	void setLineExtensionAmount(LineExtensionAmountType value);

	/**
	 * Returns the value of the '<em><b>Tax Point Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice Line. Tax Point Date. Date</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The date of the Invoice Line used to indicate the point at which tax becomes applicable.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Tax Point Date</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tax Point Date</em>' containment reference.
	 * @see #setTaxPointDate(TaxPointDateType)
	 */
	TaxPointDateType getTaxPointDate();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.InvoiceLineType#getTaxPointDate <em>Tax Point Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Point Date</em>' containment reference.
	 * @see #getTaxPointDate()
	 */
	void setTaxPointDate(TaxPointDateType value);

	/**
	 * Returns the value of the '<em><b>Accounting Cost Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice Line. Accounting_ Cost Code. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The Buyer's accounting code applied to the Invoice Line</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Accounting</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Cost Code</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accounting Cost Code</em>' containment reference.
	 * @see #setAccountingCostCode(AccountingCostCodeType)
	 */
	AccountingCostCodeType getAccountingCostCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.InvoiceLineType#getAccountingCostCode <em>Accounting Cost Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accounting Cost Code</em>' containment reference.
	 * @see #getAccountingCostCode()
	 */
	void setAccountingCostCode(AccountingCostCodeType value);

	/**
	 * Returns the value of the '<em><b>Order Line Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.OrderLineReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice Line. Order Line Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Order Line Reference</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Order Line Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Order Line Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order Line Reference</em>' containment reference list.
	 */
	List getOrderLineReference();

	/**
	 * Returns the value of the '<em><b>Despatch Line Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.LineReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice Line. Despatch_ Line Reference. Line Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Despatch Line Reference</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 * 
	 *               <ccts:ObjectClass>Invoice Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Despatch</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Line Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Line Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Despatch Line Reference</em>' containment reference list.
	 */
	List getDespatchLineReference();

	/**
	 * Returns the value of the '<em><b>Receipt Line Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.LineReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice Line. Receipt_ Line Reference. Line Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Receipt Line Reference</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Receipt</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Line Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Line Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receipt Line Reference</em>' containment reference list.
	 */
	List getReceiptLineReference();

	/**
	 * Returns the value of the '<em><b>Delivery</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.DeliveryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice Line. Delivery</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Delivery</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Delivery</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Delivery</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delivery</em>' containment reference list.
	 */
	List getDelivery();

	/**
	 * Returns the value of the '<em><b>Payment Terms</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.PaymentTermsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice Line. Payment Terms</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Payment Terms</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Payment Terms</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Payment Terms</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Terms</em>' containment reference list.
	 */
	List getPaymentTerms();

	/**
	 * Returns the value of the '<em><b>Allowance Charge</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.AllowanceChargeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice Line. Allowance Charge</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Allowance Charge</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Allowance Charge</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Allowance Charge</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allowance Charge</em>' containment reference list.
	 */
	List getAllowanceCharge();

	/**
	 * Returns the value of the '<em><b>Tax Total</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.TaxTotalType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice Line. Tax Total</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Tax Total</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Tax Total</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Tax Total</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tax Total</em>' containment reference list.
	 */
	List getTaxTotal();

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice Line. Item</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Item</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Item</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Item</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference.
	 * @see #setItem(ItemType)
	 */
	ItemType getItem();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.InvoiceLineType#getItem <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' containment reference.
	 * @see #getItem()
	 */
	void setItem(ItemType value);

	/**
	 * Returns the value of the '<em><b>Base Price</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice Line. Base Price</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Base Price</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Base Price</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Base Price</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Unit Price</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Price</em>' containment reference.
	 * @see #setBasePrice(BasePriceType)
	 */
	BasePriceType getBasePrice();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.InvoiceLineType#getBasePrice <em>Base Price</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Price</em>' containment reference.
	 * @see #getBasePrice()
	 */
	void setBasePrice(BasePriceType value);

	/**
	 * Returns the value of the '<em><b>Delivery Terms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice Line. Delivery Terms</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Delivery Terms</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Delivery Terms</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Delivery Terms</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delivery Terms</em>' containment reference.
	 * @see #setDeliveryTerms(DeliveryTermsType)
	 */
	DeliveryTermsType getDeliveryTerms();

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.InvoiceLineType#getDeliveryTerms <em>Delivery Terms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Terms</em>' containment reference.
	 * @see #getDeliveryTerms()
	 */
	void setDeliveryTerms(DeliveryTermsType value);

	/**
	 * Returns the value of the '<em><b>Item Instance</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.ItemInstanceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice Line. Item Instance</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Item Instance</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Item Instance</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Item Instance</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Instance</em>' containment reference list.
	 */
	List getItemInstance();

} // InvoiceLineType