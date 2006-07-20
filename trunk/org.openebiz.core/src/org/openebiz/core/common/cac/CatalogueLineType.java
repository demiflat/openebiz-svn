/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.ActionCodeType;
import org.openebiz.core.common.cbc.ContentUnitQuantityType;
import org.openebiz.core.common.cbc.ContractSubdivisionType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.LifeCycleStatusCodeType;
import org.openebiz.core.common.cbc.MaximumOrderQuantityType;
import org.openebiz.core.common.cbc.MinimumOrderQuantityType;
import org.openebiz.core.common.cbc.NoteType;
import org.openebiz.core.common.cbc.OrderQuantityIncrementNumericType;
import org.openebiz.core.common.cbc.OrderableIndicatorType;
import org.openebiz.core.common.cbc.OrderingUnitMeasureIDType;
import org.openebiz.core.common.cbc.PackLevelCodeType;
import org.openebiz.core.common.cbc.WarrantyInformationType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalogue Line Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Catalogue Line. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>A catalogue line is the basic element of catalogue, it is something that can be bought.</ccts:Definition>
 *           <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getActionCode <em>Action Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getLifeCycleStatusCode <em>Life Cycle Status Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getContractSubdivision <em>Contract Subdivision</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getNote <em>Note</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getOrderableIndicator <em>Orderable Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getOrderingUnitMeasureID <em>Ordering Unit Measure ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getContentUnitQuantity <em>Content Unit Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getOrderQuantityIncrementNumeric <em>Order Quantity Increment Numeric</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getMinimumOrderQuantity <em>Minimum Order Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getMaximumOrderQuantity <em>Maximum Order Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getWarrantyInformation <em>Warranty Information</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getPackLevelCode <em>Pack Level Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getInformationValidityPeriod <em>Information Validity Period</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getValidityPeriod <em>Validity Period</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getItemComparison <em>Item Comparison</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getComponentRelatedItem <em>Component Related Item</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getAccessoryRelatedItem <em>Accessory Related Item</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getRequiredRelatedItem <em>Required Related Item</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getReplacementRelatedItem <em>Replacement Related Item</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getComplementaryRelatedItem <em>Complementary Related Item</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getRequiredItemLocationQuantity <em>Required Item Location Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.CatalogueLineType#getItem <em>Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CatalogueLineType implements Serializable {
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
	 * The cached value of the '{@link #getActionCode() <em>Action Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionCode()
	 * @generated
	 * @ordered
	 */
	protected ActionCodeType actionCode = null;

	/**
	 * The cached value of the '{@link #getLifeCycleStatusCode() <em>Life Cycle Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifeCycleStatusCode()
	 * @generated
	 * @ordered
	 */
	protected LifeCycleStatusCodeType lifeCycleStatusCode = null;

	/**
	 * The cached value of the '{@link #getContractSubdivision() <em>Contract Subdivision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContractSubdivision()
	 * @generated
	 * @ordered
	 */
	protected ContractSubdivisionType contractSubdivision = null;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected List note = null;

	/**
	 * The cached value of the '{@link #getOrderableIndicator() <em>Orderable Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderableIndicator()
	 * @generated
	 * @ordered
	 */
	protected OrderableIndicatorType orderableIndicator = null;

	/**
	 * The cached value of the '{@link #getOrderingUnitMeasureID() <em>Ordering Unit Measure ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderingUnitMeasureID()
	 * @generated
	 * @ordered
	 */
	protected OrderingUnitMeasureIDType orderingUnitMeasureID = null;

	/**
	 * The cached value of the '{@link #getContentUnitQuantity() <em>Content Unit Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentUnitQuantity()
	 * @generated
	 * @ordered
	 */
	protected ContentUnitQuantityType contentUnitQuantity = null;

	/**
	 * The cached value of the '{@link #getOrderQuantityIncrementNumeric() <em>Order Quantity Increment Numeric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderQuantityIncrementNumeric()
	 * @generated
	 * @ordered
	 */
	protected OrderQuantityIncrementNumericType orderQuantityIncrementNumeric = null;

	/**
	 * The cached value of the '{@link #getMinimumOrderQuantity() <em>Minimum Order Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumOrderQuantity()
	 * @generated
	 * @ordered
	 */
	protected MinimumOrderQuantityType minimumOrderQuantity = null;

	/**
	 * The cached value of the '{@link #getMaximumOrderQuantity() <em>Maximum Order Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumOrderQuantity()
	 * @generated
	 * @ordered
	 */
	protected MaximumOrderQuantityType maximumOrderQuantity = null;

	/**
	 * The cached value of the '{@link #getWarrantyInformation() <em>Warranty Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarrantyInformation()
	 * @generated
	 * @ordered
	 */
	protected List warrantyInformation = null;

	/**
	 * The cached value of the '{@link #getPackLevelCode() <em>Pack Level Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackLevelCode()
	 * @generated
	 * @ordered
	 */
	protected PackLevelCodeType packLevelCode = null;

	/**
	 * The cached value of the '{@link #getInformationValidityPeriod() <em>Information Validity Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationValidityPeriod()
	 * @generated
	 * @ordered
	 */
	protected PeriodType informationValidityPeriod = null;

	/**
	 * The cached value of the '{@link #getValidityPeriod() <em>Validity Period</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidityPeriod()
	 * @generated
	 * @ordered
	 */
	protected List validityPeriod = null;

	/**
	 * The cached value of the '{@link #getItemComparison() <em>Item Comparison</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemComparison()
	 * @generated
	 * @ordered
	 */
	protected List itemComparison = null;

	/**
	 * The cached value of the '{@link #getComponentRelatedItem() <em>Component Related Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentRelatedItem()
	 * @generated
	 * @ordered
	 */
	protected List componentRelatedItem = null;

	/**
	 * The cached value of the '{@link #getAccessoryRelatedItem() <em>Accessory Related Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessoryRelatedItem()
	 * @generated
	 * @ordered
	 */
	protected List accessoryRelatedItem = null;

	/**
	 * The cached value of the '{@link #getRequiredRelatedItem() <em>Required Related Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredRelatedItem()
	 * @generated
	 * @ordered
	 */
	protected List requiredRelatedItem = null;

	/**
	 * The cached value of the '{@link #getReplacementRelatedItem() <em>Replacement Related Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacementRelatedItem()
	 * @generated
	 * @ordered
	 */
	protected List replacementRelatedItem = null;

	/**
	 * The cached value of the '{@link #getComplementaryRelatedItem() <em>Complementary Related Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplementaryRelatedItem()
	 * @generated
	 * @ordered
	 */
	protected List complementaryRelatedItem = null;

	/**
	 * The cached value of the '{@link #getRequiredItemLocationQuantity() <em>Required Item Location Quantity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredItemLocationQuantity()
	 * @generated
	 * @ordered
	 */
	protected List requiredItemLocationQuantity = null;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected ItemType item = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public CatalogueLineType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.iD = this.getID();
		this.actionCode = this.getActionCode();
		this.lifeCycleStatusCode = this.getLifeCycleStatusCode();
		this.contractSubdivision = this.getContractSubdivision();
		this.note = this.getNote();
		this.orderableIndicator = this.getOrderableIndicator();
		this.orderingUnitMeasureID = this.getOrderingUnitMeasureID();
		this.contentUnitQuantity = this.getContentUnitQuantity();
		this.orderQuantityIncrementNumeric = this.getOrderQuantityIncrementNumeric();
		this.minimumOrderQuantity = this.getMinimumOrderQuantity();
		this.maximumOrderQuantity = this.getMaximumOrderQuantity();
		this.warrantyInformation = this.getWarrantyInformation();
		this.packLevelCode = this.getPackLevelCode();
		this.informationValidityPeriod = this.getInformationValidityPeriod();
		this.validityPeriod = this.getValidityPeriod();
		this.itemComparison = this.getItemComparison();
		this.componentRelatedItem = this.getComponentRelatedItem();
		this.accessoryRelatedItem = this.getAccessoryRelatedItem();
		this.requiredRelatedItem = this.getRequiredRelatedItem();
		this.replacementRelatedItem = this.getReplacementRelatedItem();
		this.complementaryRelatedItem = this.getComplementaryRelatedItem();
		this.requiredItemLocationQuantity = this.getRequiredItemLocationQuantity();
		this.item = this.getItem();
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
	 *               <ccts:DictionaryEntryName>Catalogue Line. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A unique instance identifier for the line in this catalogue document.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:Examples>"1"</ccts:Examples>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CatalogueLineType#getID <em>ID</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Action Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Action. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Code indicating the action required for this item to synchronise with external repositories.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Action</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:Examples>"Replace", "Update", "Delete","Add"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Code</em>' containment reference.
	 * @see #setActionCode(ActionCodeType)
	 * @generated
	 */
	public ActionCodeType getActionCode() {
		return (actionCode == null) ? new ActionCodeType() : actionCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CatalogueLineType#getActionCode <em>Action Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Code</em>' containment reference.
	 * @see #getActionCode()
	 * @generated
	 */
	public void setActionCode(ActionCodeType newActionCode) {
		actionCode = newActionCode;
	}

	/**
	 * Returns the value of the '<em><b>Life Cycle Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Life Cycle Status. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Code indicating availability of this line</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Life Cycle Status</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:Examples>"new - announcement only", "new and available", "deleted - announcement only"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Life Cycle Status Code</em>' containment reference.
	 * @see #setLifeCycleStatusCode(LifeCycleStatusCodeType)
	 * @generated
	 */
	public LifeCycleStatusCodeType getLifeCycleStatusCode() {
		return (lifeCycleStatusCode == null) ? new LifeCycleStatusCodeType()
				: lifeCycleStatusCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CatalogueLineType#getLifeCycleStatusCode <em>Life Cycle Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Life Cycle Status Code</em>' containment reference.
	 * @see #getLifeCycleStatusCode()
	 * @generated
	 */
	public void setLifeCycleStatusCode(
			LifeCycleStatusCodeType newLifeCycleStatusCode) {
		lifeCycleStatusCode = newLifeCycleStatusCode;
	}

	/**
	 * Returns the value of the '<em><b>Contract Subdivision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Contract Subdivision. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Identifies a sub-division of a contract or tender.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Contract Subdivision</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:Examples>"Installation", "Phase One", Support and Maintenance"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contract Subdivision</em>' containment reference.
	 * @see #setContractSubdivision(ContractSubdivisionType)
	 * @generated
	 */
	public ContractSubdivisionType getContractSubdivision() {
		return (contractSubdivision == null) ? new ContractSubdivisionType()
				: contractSubdivision;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CatalogueLineType#getContractSubdivision <em>Contract Subdivision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contract Subdivision</em>' containment reference.
	 * @see #getContractSubdivision()
	 * @generated
	 */
	public void setContractSubdivision(
			ContractSubdivisionType newContractSubdivision) {
		contractSubdivision = newContractSubdivision;
	}

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cbc.NoteType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Note. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Free text note used for non-structured information about the line in the specific catalogue document (intended to be human readable).</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Note</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @generated
	 */
	public List getNote() {
		if (note == null) {
			note = new ArrayList<NoteType>();
		}
		return note;
	}

	/**
	 * Returns the value of the '<em><b>Orderable Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Orderable. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Indicates if the line is orderable (that is, not just for information only)</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Orderable</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *               <ccts:Examples>TRUE means orderable, FALSE means not orderable</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Orderable Indicator</em>' containment reference.
	 * @see #setOrderableIndicator(OrderableIndicatorType)
	 * @generated
	 */
	public OrderableIndicatorType getOrderableIndicator() {
		return (orderableIndicator == null) ? new OrderableIndicatorType()
				: orderableIndicator;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CatalogueLineType#getOrderableIndicator <em>Orderable Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orderable Indicator</em>' containment reference.
	 * @see #getOrderableIndicator()
	 * @generated
	 */
	public void setOrderableIndicator(
			OrderableIndicatorType newOrderableIndicator) {
		orderableIndicator = newOrderableIndicator;
	}

	/**
	 * Returns the value of the '<em><b>Ordering Unit Measure ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Ordering_ Unit Measure. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The unit measure for ordering.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Ordering</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Unit Measure</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:Examples>order unit measure = box, content unit quantity = 10, representing a box of 10 items.</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ordering Unit Measure ID</em>' containment reference.
	 * @see #setOrderingUnitMeasureID(OrderingUnitMeasureIDType)
	 * @generated
	 */
	public OrderingUnitMeasureIDType getOrderingUnitMeasureID() {
		return (orderingUnitMeasureID == null) ? new OrderingUnitMeasureIDType()
				: orderingUnitMeasureID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CatalogueLineType#getOrderingUnitMeasureID <em>Ordering Unit Measure ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordering Unit Measure ID</em>' containment reference.
	 * @see #getOrderingUnitMeasureID()
	 * @generated
	 */
	public void setOrderingUnitMeasureID(
			OrderingUnitMeasureIDType newOrderingUnitMeasureID) {
		orderingUnitMeasureID = newOrderingUnitMeasureID;
	}

	/**
	 * Returns the value of the '<em><b>Content Unit Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Content_ Unit. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The quantity of the order unit of measure of the line.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Content</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Unit</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *               <ccts:Examples>If order unit measure identifier is "each", then content unit quantity is "1".</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Unit Quantity</em>' containment reference.
	 * @see #setContentUnitQuantity(ContentUnitQuantityType)
	 * @generated
	 */
	public ContentUnitQuantityType getContentUnitQuantity() {
		return (contentUnitQuantity == null) ? new ContentUnitQuantityType()
				: contentUnitQuantity;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CatalogueLineType#getContentUnitQuantity <em>Content Unit Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Unit Quantity</em>' containment reference.
	 * @see #getContentUnitQuantity()
	 * @generated
	 */
	public void setContentUnitQuantity(
			ContentUnitQuantityType newContentUnitQuantity) {
		contentUnitQuantity = newContentUnitQuantity;
	}

	/**
	 * Returns the value of the '<em><b>Order Quantity Increment Numeric</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Order_ Quantity Increment. Numeric</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The number of items that can set the order quantity increments.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Order</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Quantity Increment</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Numeric</ccts:RepresentationTerm>
	 *               <ccts:DataType>Numeric. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order Quantity Increment Numeric</em>' containment reference.
	 * @see #setOrderQuantityIncrementNumeric(OrderQuantityIncrementNumericType)
	 * @generated
	 */
	public OrderQuantityIncrementNumericType getOrderQuantityIncrementNumeric() {
		return (orderQuantityIncrementNumeric == null) ? new OrderQuantityIncrementNumericType()
				: orderQuantityIncrementNumeric;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CatalogueLineType#getOrderQuantityIncrementNumeric <em>Order Quantity Increment Numeric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Quantity Increment Numeric</em>' containment reference.
	 * @see #getOrderQuantityIncrementNumeric()
	 * @generated
	 */
	public void setOrderQuantityIncrementNumeric(
			OrderQuantityIncrementNumericType newOrderQuantityIncrementNumeric) {
		orderQuantityIncrementNumeric = newOrderQuantityIncrementNumeric;
	}

	/**
	 * Returns the value of the '<em><b>Minimum Order Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Minimum_ Order. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The minimum amount of items that can be ordered</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Minimum</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Order</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *               <ccts:Examples>"10 boxes"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Order Quantity</em>' containment reference.
	 * @see #setMinimumOrderQuantity(MinimumOrderQuantityType)
	 * @generated
	 */
	public MinimumOrderQuantityType getMinimumOrderQuantity() {
		return (minimumOrderQuantity == null) ? new MinimumOrderQuantityType()
				: minimumOrderQuantity;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CatalogueLineType#getMinimumOrderQuantity <em>Minimum Order Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Order Quantity</em>' containment reference.
	 * @see #getMinimumOrderQuantity()
	 * @generated
	 */
	public void setMinimumOrderQuantity(
			MinimumOrderQuantityType newMinimumOrderQuantity) {
		minimumOrderQuantity = newMinimumOrderQuantity;
	}

	/**
	 * Returns the value of the '<em><b>Maximum Order Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Maximum_ Order. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The maximum amount of items that can be ordered</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Maximum</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Order</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *               <ccts:Examples>"1 tonne"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Order Quantity</em>' containment reference.
	 * @see #setMaximumOrderQuantity(MaximumOrderQuantityType)
	 * @generated
	 */
	public MaximumOrderQuantityType getMaximumOrderQuantity() {
		return (maximumOrderQuantity == null) ? new MaximumOrderQuantityType()
				: maximumOrderQuantity;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CatalogueLineType#getMaximumOrderQuantity <em>Maximum Order Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Order Quantity</em>' containment reference.
	 * @see #getMaximumOrderQuantity()
	 * @generated
	 */
	public void setMaximumOrderQuantity(
			MaximumOrderQuantityType newMaximumOrderQuantity) {
		maximumOrderQuantity = newMaximumOrderQuantity;
	}

	/**
	 * Returns the value of the '<em><b>Warranty Information</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cbc.WarrantyInformationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Warranty Information. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The text of the Seller Party's warranty details.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Warranty Information</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:Examples>"Unless specified otherwise and in addition to any rights the Customer may have under statute, Dell warrants to the Customer that Dell branded Products (excluding third party products and software), will be free from defects in materials and workmanship affecting normal use for a period of one year from invoice date ('Standard Warranty')."</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Warranty Information</em>' containment reference list.
	 * @generated
	 */
	public List getWarrantyInformation() {
		if (warrantyInformation == null) {
			warrantyInformation = new ArrayList<
					WarrantyInformationType>();
		}
		return warrantyInformation;
	}

	/**
	 * Returns the value of the '<em><b>Pack Level Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Pack Level. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The level of packaging involved</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Pack Level</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Consumer Unit, Trading Unit</ccts:AlternativeBusinessTerms>
	 *               <ccts:Examples>"level 2", "Group 4"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pack Level Code</em>' containment reference.
	 * @see #setPackLevelCode(PackLevelCodeType)
	 * @generated
	 */
	public PackLevelCodeType getPackLevelCode() {
		return (packLevelCode == null) ? new PackLevelCodeType()
				: packLevelCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CatalogueLineType#getPackLevelCode <em>Pack Level Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pack Level Code</em>' containment reference.
	 * @see #getPackLevelCode()
	 * @generated
	 */
	public void setPackLevelCode(PackLevelCodeType newPackLevelCode) {
		packLevelCode = newPackLevelCode;
	}

	/**
	 * Returns the value of the '<em><b>Information Validity Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Information Validity_ Period. Period</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the party responsible for the integrity of the information provided about an item</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Information Validity</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Period</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Period</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Information Validity Period</em>' containment reference.
	 * @see #setInformationValidityPeriod(PeriodType)
	 * @generated
	 */
	public PeriodType getInformationValidityPeriod() {
		return (informationValidityPeriod == null) ? new PeriodType()
				: informationValidityPeriod;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CatalogueLineType#getInformationValidityPeriod <em>Information Validity Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information Validity Period</em>' containment reference.
	 * @see #getInformationValidityPeriod()
	 * @generated
	 */
	public void setInformationValidityPeriod(
			PeriodType newInformationValidityPeriod) {
		informationValidityPeriod = newInformationValidityPeriod;
	}

	/**
	 * Returns the value of the '<em><b>Validity Period</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.PeriodType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Validity_ Period. Period</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An assocation to the period (assigned by the Seller Party) during which the information about the catalogue item is effective.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Validity</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Period</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Period</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validity Period</em>' containment reference list.
	 * @generated
	 */
	public List getValidityPeriod() {
		if (validityPeriod == null) {
			validityPeriod = new ArrayList<PeriodType>();
		}
		return validityPeriod;
	}

	/**
	 * Returns the value of the '<em><b>Item Comparison</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.ItemComparisonType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Item Comparison</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to comparative details for this item</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Item Comparison</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Item Comparison</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Comparison</em>' containment reference list.
	 * @generated
	 */
	public List getItemComparison() {
		if (itemComparison == null) {
			itemComparison = new ArrayList<ItemComparisonType>();
		}
		return itemComparison;
	}

	/**
	 * Returns the value of the '<em><b>Component Related Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.RelatedItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Component_ Related Item. Related Item</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association that describes any catalogue items that may be components of this item.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Component</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Related Item</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Related Item</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Related Item</em>' containment reference list.
	 * @generated
	 */
	public List getComponentRelatedItem() {
		if (componentRelatedItem == null) {
			componentRelatedItem = new ArrayList<RelatedItemType>();
		}
		return componentRelatedItem;
	}

	/**
	 * Returns the value of the '<em><b>Accessory Related Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.RelatedItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Accessory_ Related Item. Related Item</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association that describes any catalogue items that may be optional accessories to this item.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Accessory</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Related Item</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Related Item</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accessory Related Item</em>' containment reference list.
	 * @generated
	 */
	public List getAccessoryRelatedItem() {
		if (accessoryRelatedItem == null) {
			accessoryRelatedItem = new ArrayList<RelatedItemType>();
		}
		return accessoryRelatedItem;
	}

	/**
	 * Returns the value of the '<em><b>Required Related Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.RelatedItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Required_ Related Item. Related Item</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association that describes any catalogue items that may be required for this item.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Required</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Related Item</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Related Item</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Related Item</em>' containment reference list.
	 * @generated
	 */
	public List getRequiredRelatedItem() {
		if (requiredRelatedItem == null) {
			requiredRelatedItem = new ArrayList<RelatedItemType>();
		}
		return requiredRelatedItem;
	}

	/**
	 * Returns the value of the '<em><b>Replacement Related Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.RelatedItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Replacement_ Related Item. Related Item</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association that describes any catalogue items that may be replacements for this item.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Replacement</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Related Item</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Related Item</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replacement Related Item</em>' containment reference list.
	 * @generated
	 */
	public List getReplacementRelatedItem() {
		if (replacementRelatedItem == null) {
			replacementRelatedItem = new ArrayList<
					RelatedItemType>();
		}
		return replacementRelatedItem;
	}

	/**
	 * Returns the value of the '<em><b>Complementary Related Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.RelatedItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Complementary_ Related Item. Related Item</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association that describes any catalogue items that may complement this item.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Complementary</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Related Item</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Related Item</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Complementary Related Item</em>' containment reference list.
	 * @generated
	 */
	public List getComplementaryRelatedItem() {
		if (complementaryRelatedItem == null) {
			complementaryRelatedItem = new ArrayList<
					RelatedItemType>();
		}
		return complementaryRelatedItem;
	}

	/**
	 * Returns the value of the '<em><b>Required Item Location Quantity</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.ItemLocationQuantityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Required_ Item Location Quantity. Item Location Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the description of properties related to locations and quantities of the item.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Required</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Item Location Quantity</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Item Location Quantity</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Item Location Quantity</em>' containment reference list.
	 * @generated
	 */
	public List getRequiredItemLocationQuantity() {
		if (requiredItemLocationQuantity == null) {
			requiredItemLocationQuantity = new ArrayList<
					ItemLocationQuantityType>();
		}
		return requiredItemLocationQuantity;
	}

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Catalogue Line. Item</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Item itself.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Catalogue Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Item</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Item</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference.
	 * @see #setItem(ItemType)
	 * @generated
	 */
	public ItemType getItem() {
		return (item == null) ? new ItemType() : item;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.CatalogueLineType#getItem <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' containment reference.
	 * @see #getItem()
	 * @generated
	 */
	public void setItem(ItemType newItem) {
		item = newItem;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.accessoryRelatedItem == null) ? 0 : this.accessoryRelatedItem.hashCode());
		result = PRIME * result + ((this.actionCode == null) ? 0 : this.actionCode.hashCode());
		result = PRIME * result + ((this.complementaryRelatedItem == null) ? 0 : this.complementaryRelatedItem.hashCode());
		result = PRIME * result + ((this.componentRelatedItem == null) ? 0 : this.componentRelatedItem.hashCode());
		result = PRIME * result + ((this.contentUnitQuantity == null) ? 0 : this.contentUnitQuantity.hashCode());
		result = PRIME * result + ((this.contractSubdivision == null) ? 0 : this.contractSubdivision.hashCode());
		result = PRIME * result + ((this.iD == null) ? 0 : this.iD.hashCode());
		result = PRIME * result + ((this.informationValidityPeriod == null) ? 0 : this.informationValidityPeriod.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.item == null) ? 0 : this.item.hashCode());
		result = PRIME * result + ((this.itemComparison == null) ? 0 : this.itemComparison.hashCode());
		result = PRIME * result + ((this.lifeCycleStatusCode == null) ? 0 : this.lifeCycleStatusCode.hashCode());
		result = PRIME * result + ((this.maximumOrderQuantity == null) ? 0 : this.maximumOrderQuantity.hashCode());
		result = PRIME * result + ((this.minimumOrderQuantity == null) ? 0 : this.minimumOrderQuantity.hashCode());
		result = PRIME * result + ((this.note == null) ? 0 : this.note.hashCode());
		result = PRIME * result + ((this.orderQuantityIncrementNumeric == null) ? 0 : this.orderQuantityIncrementNumeric.hashCode());
		result = PRIME * result + ((this.orderableIndicator == null) ? 0 : this.orderableIndicator.hashCode());
		result = PRIME * result + ((this.orderingUnitMeasureID == null) ? 0 : this.orderingUnitMeasureID.hashCode());
		result = PRIME * result + ((this.packLevelCode == null) ? 0 : this.packLevelCode.hashCode());
		result = PRIME * result + ((this.replacementRelatedItem == null) ? 0 : this.replacementRelatedItem.hashCode());
		result = PRIME * result + ((this.requiredItemLocationQuantity == null) ? 0 : this.requiredItemLocationQuantity.hashCode());
		result = PRIME * result + ((this.requiredRelatedItem == null) ? 0 : this.requiredRelatedItem.hashCode());
		result = PRIME * result + ((this.validityPeriod == null) ? 0 : this.validityPeriod.hashCode());
		result = PRIME * result + ((this.version == null) ? 0 : this.version.hashCode());
		result = PRIME * result + ((this.warrantyInformation == null) ? 0 : this.warrantyInformation.hashCode());
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
		final CatalogueLineType other = (CatalogueLineType) obj;
		if (this.accessoryRelatedItem == null) {
			if (other.accessoryRelatedItem != null)
				return false;
		} else if (!this.accessoryRelatedItem.equals(other.accessoryRelatedItem))
			return false;
		if (this.actionCode == null) {
			if (other.actionCode != null)
				return false;
		} else if (!this.actionCode.equals(other.actionCode))
			return false;
		if (this.complementaryRelatedItem == null) {
			if (other.complementaryRelatedItem != null)
				return false;
		} else if (!this.complementaryRelatedItem.equals(other.complementaryRelatedItem))
			return false;
		if (this.componentRelatedItem == null) {
			if (other.componentRelatedItem != null)
				return false;
		} else if (!this.componentRelatedItem.equals(other.componentRelatedItem))
			return false;
		if (this.contentUnitQuantity == null) {
			if (other.contentUnitQuantity != null)
				return false;
		} else if (!this.contentUnitQuantity.equals(other.contentUnitQuantity))
			return false;
		if (this.contractSubdivision == null) {
			if (other.contractSubdivision != null)
				return false;
		} else if (!this.contractSubdivision.equals(other.contractSubdivision))
			return false;
		if (this.iD == null) {
			if (other.iD != null)
				return false;
		} else if (!this.iD.equals(other.iD))
			return false;
		if (this.informationValidityPeriod == null) {
			if (other.informationValidityPeriod != null)
				return false;
		} else if (!this.informationValidityPeriod.equals(other.informationValidityPeriod))
			return false;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.item == null) {
			if (other.item != null)
				return false;
		} else if (!this.item.equals(other.item))
			return false;
		if (this.itemComparison == null) {
			if (other.itemComparison != null)
				return false;
		} else if (!this.itemComparison.equals(other.itemComparison))
			return false;
		if (this.lifeCycleStatusCode == null) {
			if (other.lifeCycleStatusCode != null)
				return false;
		} else if (!this.lifeCycleStatusCode.equals(other.lifeCycleStatusCode))
			return false;
		if (this.maximumOrderQuantity == null) {
			if (other.maximumOrderQuantity != null)
				return false;
		} else if (!this.maximumOrderQuantity.equals(other.maximumOrderQuantity))
			return false;
		if (this.minimumOrderQuantity == null) {
			if (other.minimumOrderQuantity != null)
				return false;
		} else if (!this.minimumOrderQuantity.equals(other.minimumOrderQuantity))
			return false;
		if (this.note == null) {
			if (other.note != null)
				return false;
		} else if (!this.note.equals(other.note))
			return false;
		if (this.orderQuantityIncrementNumeric == null) {
			if (other.orderQuantityIncrementNumeric != null)
				return false;
		} else if (!this.orderQuantityIncrementNumeric.equals(other.orderQuantityIncrementNumeric))
			return false;
		if (this.orderableIndicator == null) {
			if (other.orderableIndicator != null)
				return false;
		} else if (!this.orderableIndicator.equals(other.orderableIndicator))
			return false;
		if (this.orderingUnitMeasureID == null) {
			if (other.orderingUnitMeasureID != null)
				return false;
		} else if (!this.orderingUnitMeasureID.equals(other.orderingUnitMeasureID))
			return false;
		if (this.packLevelCode == null) {
			if (other.packLevelCode != null)
				return false;
		} else if (!this.packLevelCode.equals(other.packLevelCode))
			return false;
		if (this.replacementRelatedItem == null) {
			if (other.replacementRelatedItem != null)
				return false;
		} else if (!this.replacementRelatedItem.equals(other.replacementRelatedItem))
			return false;
		if (this.requiredItemLocationQuantity == null) {
			if (other.requiredItemLocationQuantity != null)
				return false;
		} else if (!this.requiredItemLocationQuantity.equals(other.requiredItemLocationQuantity))
			return false;
		if (this.requiredRelatedItem == null) {
			if (other.requiredRelatedItem != null)
				return false;
		} else if (!this.requiredRelatedItem.equals(other.requiredRelatedItem))
			return false;
		if (this.validityPeriod == null) {
			if (other.validityPeriod != null)
				return false;
		} else if (!this.validityPeriod.equals(other.validityPeriod))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		if (this.warrantyInformation == null) {
			if (other.warrantyInformation != null)
				return false;
		} else if (!this.warrantyInformation.equals(other.warrantyInformation))
			return false;
		return true;
	}

} // CatalogueLineType