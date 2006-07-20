/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.NoteType;
import org.openebiz.core.common.cbc.SubstitutionStatusCodeType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

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
 * @generated
 */
public class OrderLineType implements Serializable {
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
	 * The cached value of the '{@link #getSubstitutionStatusCode() <em>Substitution Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitutionStatusCode()
	 * @generated
	 * @ordered
	 */
	protected SubstitutionStatusCodeType substitutionStatusCode = null;

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
	 * The cached value of the '{@link #getLineItem() <em>Line Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineItem()
	 * @generated
	 * @ordered
	 */
	protected LineItemType lineItem = null;

	/**
	 * The cached value of the '{@link #getSellerProposedLineItem() <em>Seller Proposed Line Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSellerProposedLineItem()
	 * @generated
	 * @ordered
	 */
	protected List sellerProposedLineItem = null;

	/**
	 * The cached value of the '{@link #getSellerSubstitutedLineItem() <em>Seller Substituted Line Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSellerSubstitutedLineItem()
	 * @generated
	 * @ordered
	 */
	protected List sellerSubstitutedLineItem = null;

	/**
	 * The cached value of the '{@link #getBuyerProposedLineItem() <em>Buyer Proposed Line Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuyerProposedLineItem()
	 * @generated
	 * @ordered
	 */
	protected List buyerProposedLineItem = null;

	/**
	 * The cached value of the '{@link #getQuotationLineReference() <em>Quotation Line Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuotationLineReference()
	 * @generated
	 * @ordered
	 */
	protected LineReferenceType quotationLineReference = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public OrderLineType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.substitutionStatusCode = this.getSubstitutionStatusCode();
		this.note = this.getNote();
		this.lineItem = this.getLineItem();
		this.sellerProposedLineItem = this.getSellerProposedLineItem();
		this.sellerSubstitutedLineItem = this.getSellerSubstitutedLineItem();
		this.buyerProposedLineItem = this.getBuyerProposedLineItem();
		this.quotationLineReference = this.getQuotationLineReference();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getLineItem().getID().getValue());
		return sdisplay.toString();
	}
	
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
	 * @generated
	 */
	public SubstitutionStatusCodeType getSubstitutionStatusCode() {
		return (substitutionStatusCode == null) ? new SubstitutionStatusCodeType()
				: substitutionStatusCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.OrderLineType#getSubstitutionStatusCode <em>Substitution Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substitution Status Code</em>' containment reference.
	 * @see #getSubstitutionStatusCode()
	 * @generated
	 */
	public void setSubstitutionStatusCode(
			SubstitutionStatusCodeType newSubstitutionStatusCode) {
		substitutionStatusCode = newSubstitutionStatusCode;
	}

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
	 * @generated
	 */
	public NoteType getNote() {
		return (note == null) ? new NoteType() : note;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.OrderLineType#getNote <em>Note</em>}' containment reference.
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
	 * @generated
	 */
	public LineItemType getLineItem() {
		return (lineItem == null) ? new LineItemType() : lineItem;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.OrderLineType#getLineItem <em>Line Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Item</em>' containment reference.
	 * @see #getLineItem()
	 * @generated
	 */
	public void setLineItem(LineItemType newLineItem) {
		lineItem = newLineItem;
	}

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
	 * @generated
	 */
	public List getSellerProposedLineItem() {
		if (sellerProposedLineItem == null) {
			sellerProposedLineItem = new ArrayList<LineItemType>();
		}
		return sellerProposedLineItem;
	}

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
	 * @generated
	 */
	public List getSellerSubstitutedLineItem() {
		if (sellerSubstitutedLineItem == null) {
			sellerSubstitutedLineItem = new ArrayList<
					LineItemType>();
		}
		return sellerSubstitutedLineItem;
	}

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
	 * @generated
	 */
	public List getBuyerProposedLineItem() {
		if (buyerProposedLineItem == null) {
			buyerProposedLineItem = new ArrayList<LineItemType>();
		}
		return buyerProposedLineItem;
	}

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
	 * @generated
	 */
	public LineReferenceType getQuotationLineReference() {
		return (quotationLineReference == null) ? new LineReferenceType()
				: quotationLineReference;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.OrderLineType#getQuotationLineReference <em>Quotation Line Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quotation Line Reference</em>' containment reference.
	 * @see #getQuotationLineReference()
	 * @generated
	 */
	public void setQuotationLineReference(
			LineReferenceType newQuotationLineReference) {
		quotationLineReference = newQuotationLineReference;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.buyerProposedLineItem == null) ? 0 : this.buyerProposedLineItem.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.lineItem == null) ? 0 : this.lineItem.hashCode());
		result = PRIME * result + ((this.note == null) ? 0 : this.note.hashCode());
		result = PRIME * result + ((this.quotationLineReference == null) ? 0 : this.quotationLineReference.hashCode());
		result = PRIME * result + ((this.sellerProposedLineItem == null) ? 0 : this.sellerProposedLineItem.hashCode());
		result = PRIME * result + ((this.sellerSubstitutedLineItem == null) ? 0 : this.sellerSubstitutedLineItem.hashCode());
		result = PRIME * result + ((this.substitutionStatusCode == null) ? 0 : this.substitutionStatusCode.hashCode());
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
		final OrderLineType other = (OrderLineType) obj;
		if (this.buyerProposedLineItem == null) {
			if (other.buyerProposedLineItem != null)
				return false;
		} else if (!this.buyerProposedLineItem.equals(other.buyerProposedLineItem))
			return false;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.lineItem == null) {
			if (other.lineItem != null)
				return false;
		} else if (!this.lineItem.equals(other.lineItem))
			return false;
		if (this.note == null) {
			if (other.note != null)
				return false;
		} else if (!this.note.equals(other.note))
			return false;
		if (this.quotationLineReference == null) {
			if (other.quotationLineReference != null)
				return false;
		} else if (!this.quotationLineReference.equals(other.quotationLineReference))
			return false;
		if (this.sellerProposedLineItem == null) {
			if (other.sellerProposedLineItem != null)
				return false;
		} else if (!this.sellerProposedLineItem.equals(other.sellerProposedLineItem))
			return false;
		if (this.sellerSubstitutedLineItem == null) {
			if (other.sellerSubstitutedLineItem != null)
				return false;
		} else if (!this.sellerSubstitutedLineItem.equals(other.sellerSubstitutedLineItem))
			return false;
		if (this.substitutionStatusCode == null) {
			if (other.substitutionStatusCode != null)
				return false;
		} else if (!this.substitutionStatusCode.equals(other.substitutionStatusCode))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // OrderLineType