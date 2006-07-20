/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.ChargeableWeightMeasureType;
import org.openebiz.core.common.cbc.CustomsStatusCodeType;
import org.openebiz.core.common.cbc.CustomsTariffQuantityType;
import org.openebiz.core.common.cbc.DeclaredCustomsValueAmountType;
import org.openebiz.core.common.cbc.DeclaredForCarriageValueAmountType;
import org.openebiz.core.common.cbc.DeclaredStatisticsValueAmountType;
import org.openebiz.core.common.cbc.DescriptionType;
import org.openebiz.core.common.cbc.FreeOnBoardValueAmountType;
import org.openebiz.core.common.cbc.GrossVolumeMeasureType;
import org.openebiz.core.common.cbc.GrossWeightMeasureType;
import org.openebiz.core.common.cbc.HazardousRiskIndicatorType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.InsuranceValueAmountType;
import org.openebiz.core.common.cbc.NetNetWeightMeasureType;
import org.openebiz.core.common.cbc.NetVolumeMeasureType;
import org.openebiz.core.common.cbc.NetWeightMeasureType;
import org.openebiz.core.common.cbc.PreferenceCriterionCodeType;
import org.openebiz.core.common.cbc.QuantityNumericType;
import org.openebiz.core.common.cbc.RequiredCustomsIDType;
import org.openebiz.core.common.cbc.SequenceNumberIDType;
import org.openebiz.core.common.cbc.ValueAmountType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goods Item Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Goods Item. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>A separately identifiable quantity of products of a single product type</ccts:Definition>
 *           <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getSequenceNumberID <em>Sequence Number ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getHazardousRiskIndicator <em>Hazardous Risk Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getDeclaredCustomsValueAmount <em>Declared Customs Value Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getDeclaredForCarriageValueAmount <em>Declared For Carriage Value Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getDeclaredStatisticsValueAmount <em>Declared Statistics Value Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getFreeOnBoardValueAmount <em>Free On Board Value Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getInsuranceValueAmount <em>Insurance Value Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getValueAmount <em>Value Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getGrossWeightMeasure <em>Gross Weight Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getNetWeightMeasure <em>Net Weight Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getNetNetWeightMeasure <em>Net Net Weight Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getChargeableWeightMeasure <em>Chargeable Weight Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getGrossVolumeMeasure <em>Gross Volume Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getNetVolumeMeasure <em>Net Volume Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getQuantityNumeric <em>Quantity Numeric</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getPreferenceCriterionCode <em>Preference Criterion Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getRequiredCustomsID <em>Required Customs ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getCustomsStatusCode <em>Customs Status Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getCustomsTariffQuantity <em>Customs Tariff Quantity</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getItem <em>Item</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getGoodsItemContainer <em>Goods Item Container</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getFreightAllowanceCharge <em>Freight Allowance Charge</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getInvoiceLine <em>Invoice Line</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getContainedGoodsItem <em>Contained Goods Item</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.GoodsItemType#getOriginAddress <em>Origin Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GoodsItemType implements Serializable {
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
	 * The cached value of the '{@link #getSequenceNumberID() <em>Sequence Number ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumberID()
	 * @generated
	 * @ordered
	 */
	protected SequenceNumberIDType sequenceNumberID = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected List description = null;

	/**
	 * The cached value of the '{@link #getHazardousRiskIndicator() <em>Hazardous Risk Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazardousRiskIndicator()
	 * @generated
	 * @ordered
	 */
	protected HazardousRiskIndicatorType hazardousRiskIndicator = null;

	/**
	 * The cached value of the '{@link #getDeclaredCustomsValueAmount() <em>Declared Customs Value Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaredCustomsValueAmount()
	 * @generated
	 * @ordered
	 */
	protected DeclaredCustomsValueAmountType declaredCustomsValueAmount = null;

	/**
	 * The cached value of the '{@link #getDeclaredForCarriageValueAmount() <em>Declared For Carriage Value Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaredForCarriageValueAmount()
	 * @generated
	 * @ordered
	 */
	protected DeclaredForCarriageValueAmountType declaredForCarriageValueAmount = null;

	/**
	 * The cached value of the '{@link #getDeclaredStatisticsValueAmount() <em>Declared Statistics Value Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaredStatisticsValueAmount()
	 * @generated
	 * @ordered
	 */
	protected DeclaredStatisticsValueAmountType declaredStatisticsValueAmount = null;

	/**
	 * The cached value of the '{@link #getFreeOnBoardValueAmount() <em>Free On Board Value Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreeOnBoardValueAmount()
	 * @generated
	 * @ordered
	 */
	protected FreeOnBoardValueAmountType freeOnBoardValueAmount = null;

	/**
	 * The cached value of the '{@link #getInsuranceValueAmount() <em>Insurance Value Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsuranceValueAmount()
	 * @generated
	 * @ordered
	 */
	protected InsuranceValueAmountType insuranceValueAmount = null;

	/**
	 * The cached value of the '{@link #getValueAmount() <em>Value Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueAmount()
	 * @generated
	 * @ordered
	 */
	protected ValueAmountType valueAmount = null;

	/**
	 * The cached value of the '{@link #getGrossWeightMeasure() <em>Gross Weight Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrossWeightMeasure()
	 * @generated
	 * @ordered
	 */
	protected GrossWeightMeasureType grossWeightMeasure = null;

	/**
	 * The cached value of the '{@link #getNetWeightMeasure() <em>Net Weight Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetWeightMeasure()
	 * @generated
	 * @ordered
	 */
	protected NetWeightMeasureType netWeightMeasure = null;

	/**
	 * The cached value of the '{@link #getNetNetWeightMeasure() <em>Net Net Weight Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetNetWeightMeasure()
	 * @generated
	 * @ordered
	 */
	protected NetNetWeightMeasureType netNetWeightMeasure = null;

	/**
	 * The cached value of the '{@link #getChargeableWeightMeasure() <em>Chargeable Weight Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeableWeightMeasure()
	 * @generated
	 * @ordered
	 */
	protected ChargeableWeightMeasureType chargeableWeightMeasure = null;

	/**
	 * The cached value of the '{@link #getGrossVolumeMeasure() <em>Gross Volume Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrossVolumeMeasure()
	 * @generated
	 * @ordered
	 */
	protected GrossVolumeMeasureType grossVolumeMeasure = null;

	/**
	 * The cached value of the '{@link #getNetVolumeMeasure() <em>Net Volume Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetVolumeMeasure()
	 * @generated
	 * @ordered
	 */
	protected NetVolumeMeasureType netVolumeMeasure = null;

	/**
	 * The cached value of the '{@link #getQuantityNumeric() <em>Quantity Numeric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityNumeric()
	 * @generated
	 * @ordered
	 */
	protected QuantityNumericType quantityNumeric = null;

	/**
	 * The cached value of the '{@link #getPreferenceCriterionCode() <em>Preference Criterion Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferenceCriterionCode()
	 * @generated
	 * @ordered
	 */
	protected PreferenceCriterionCodeType preferenceCriterionCode = null;

	/**
	 * The cached value of the '{@link #getRequiredCustomsID() <em>Required Customs ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredCustomsID()
	 * @generated
	 * @ordered
	 */
	protected RequiredCustomsIDType requiredCustomsID = null;

	/**
	 * The cached value of the '{@link #getCustomsStatusCode() <em>Customs Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomsStatusCode()
	 * @generated
	 * @ordered
	 */
	protected CustomsStatusCodeType customsStatusCode = null;

	/**
	 * The cached value of the '{@link #getCustomsTariffQuantity() <em>Customs Tariff Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomsTariffQuantity()
	 * @generated
	 * @ordered
	 */
	protected CustomsTariffQuantityType customsTariffQuantity = null;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected List item = null;

	/**
	 * The cached value of the '{@link #getGoodsItemContainer() <em>Goods Item Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoodsItemContainer()
	 * @generated
	 * @ordered
	 */
	protected List goodsItemContainer = null;

	/**
	 * The cached value of the '{@link #getFreightAllowanceCharge() <em>Freight Allowance Charge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreightAllowanceCharge()
	 * @generated
	 * @ordered
	 */
	protected List freightAllowanceCharge = null;

	/**
	 * The cached value of the '{@link #getInvoiceLine() <em>Invoice Line</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceLine()
	 * @generated
	 * @ordered
	 */
	protected List invoiceLine = null;

	/**
	 * The cached value of the '{@link #getTemperature() <em>Temperature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected List temperature = null;

	/**
	 * The cached value of the '{@link #getContainedGoodsItem() <em>Contained Goods Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedGoodsItem()
	 * @generated
	 * @ordered
	 */
	protected List containedGoodsItem = null;

	/**
	 * The cached value of the '{@link #getOriginAddress() <em>Origin Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginAddress()
	 * @generated
	 * @ordered
	 */
	protected AddressType originAddress = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public GoodsItemType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.iD = this.getID();
		this.sequenceNumberID = this.getSequenceNumberID();
		this.description = this.getDescription();
		this.hazardousRiskIndicator = this.getHazardousRiskIndicator();
		this.declaredCustomsValueAmount = this.getDeclaredCustomsValueAmount();
		this.declaredForCarriageValueAmount = this.getDeclaredForCarriageValueAmount();
		this.declaredStatisticsValueAmount = this.getDeclaredStatisticsValueAmount();
		this.freeOnBoardValueAmount = this.getFreeOnBoardValueAmount();
		this.insuranceValueAmount = this.getInsuranceValueAmount();
		this.valueAmount = this.getValueAmount();
		this.grossWeightMeasure = this.getGrossWeightMeasure();
		this.netWeightMeasure = this.getNetWeightMeasure();
		this.netNetWeightMeasure = this.getNetNetWeightMeasure();
		this.chargeableWeightMeasure = this.getChargeableWeightMeasure();
		this.grossVolumeMeasure = this.getGrossVolumeMeasure();
		this.netVolumeMeasure = this.getNetVolumeMeasure();
		this.quantityNumeric = this.getQuantityNumeric();
		this.preferenceCriterionCode = this.getPreferenceCriterionCode();
		this.requiredCustomsID = this.getRequiredCustomsID();
		this.customsStatusCode = this.getCustomsStatusCode();
		this.customsTariffQuantity = this.getCustomsTariffQuantity();
		this.item = this.getItem();
		this.goodsItemContainer = this.getGoodsItemContainer();
		this.freightAllowanceCharge = this.getFreightAllowanceCharge();
		this.invoiceLine = this.getInvoiceLine();
		this.temperature = this.getTemperature();
		this.containedGoodsItem = this.getContainedGoodsItem();
		this.originAddress = this.getOriginAddress();
	}

	/**
	 * Returns the value of the '<em><b>ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition/>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getID <em>ID</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Sequence Number ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Sequence Number. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Sequence number differentiating a specific goods item within a consignment.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Sequence Number</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Customs item number (WCO ID 021), Sequence Position</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence Number ID</em>' containment reference.
	 * @see #setSequenceNumberID(SequenceNumberIDType)
	 * @generated
	 */
	public SequenceNumberIDType getSequenceNumberID() {
		return (sequenceNumberID == null) ? new SequenceNumberIDType()
				: sequenceNumberID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getSequenceNumberID <em>Sequence Number ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Number ID</em>' containment reference.
	 * @see #getSequenceNumberID()
	 * @generated
	 */
	public void setSequenceNumberID(SequenceNumberIDType newSequenceNumberID) {
		sequenceNumberID = newSequenceNumberID;
	}

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cbc.DescriptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Description. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Plain language description of the nature of a goods item sufficient to identify it for customs, statistical or transport purposes.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Description</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Description of goods (WCO ID 137)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference list.
	 * @generated
	 */
	public List getDescription() {
		if (description == null) {
			description = new ArrayList<DescriptionType>();
		}
		return description;
	}

	/**
	 * Returns the value of the '<em><b>Hazardous Risk Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Hazardous Risk Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Indicator as to whether the goods item includes hazardous items (dangerous goods).</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Hazardous Risk Indicator</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *               <ccts:Examples>default is negative</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hazardous Risk Indicator</em>' containment reference.
	 * @see #setHazardousRiskIndicator(HazardousRiskIndicatorType)
	 * @generated
	 */
	public HazardousRiskIndicatorType getHazardousRiskIndicator() {
		return (hazardousRiskIndicator == null) ? new HazardousRiskIndicatorType()
				: hazardousRiskIndicator;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getHazardousRiskIndicator <em>Hazardous Risk Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hazardous Risk Indicator</em>' containment reference.
	 * @see #getHazardousRiskIndicator()
	 * @generated
	 */
	public void setHazardousRiskIndicator(
			HazardousRiskIndicatorType newHazardousRiskIndicator) {
		hazardousRiskIndicator = newHazardousRiskIndicator;
	}

	/**
	 * Returns the value of the '<em><b>Declared Customs Value Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Declared_ Customs Value. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Amount declared for Customs purposes of those goods in a consignment which are subject to the same Customs procedure, and have the same tariff/statistical heading, country information and duty regime.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Declared</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Customs Value</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>For Customs Value (WCO ID 108)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Declared Customs Value Amount</em>' containment reference.
	 * @see #setDeclaredCustomsValueAmount(DeclaredCustomsValueAmountType)
	 * @generated
	 */
	public DeclaredCustomsValueAmountType getDeclaredCustomsValueAmount() {
		return (declaredCustomsValueAmount == null) ? new DeclaredCustomsValueAmountType()
				: declaredCustomsValueAmount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getDeclaredCustomsValueAmount <em>Declared Customs Value Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declared Customs Value Amount</em>' containment reference.
	 * @see #getDeclaredCustomsValueAmount()
	 * @generated
	 */
	public void setDeclaredCustomsValueAmount(
			DeclaredCustomsValueAmountType newDeclaredCustomsValueAmount) {
		declaredCustomsValueAmount = newDeclaredCustomsValueAmount;
	}

	/**
	 * Returns the value of the '<em><b>Declared For Carriage Value Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Declared_ For Carriage Value. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Value, declared by the shipper or his agent solely for the purpose of varying the carrier's level of liability from that provided in the contract of carriage, in case of loss or damage to goods or delayed delivery.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Declared</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>For Carriage Value</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Interest in delivery, declared value for carriage</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Declared For Carriage Value Amount</em>' containment reference.
	 * @see #setDeclaredForCarriageValueAmount(DeclaredForCarriageValueAmountType)
	 * @generated
	 */
	public DeclaredForCarriageValueAmountType getDeclaredForCarriageValueAmount() {
		return (declaredForCarriageValueAmount == null) ? new DeclaredForCarriageValueAmountType()
				: declaredForCarriageValueAmount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getDeclaredForCarriageValueAmount <em>Declared For Carriage Value Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declared For Carriage Value Amount</em>' containment reference.
	 * @see #getDeclaredForCarriageValueAmount()
	 * @generated
	 */
	public void setDeclaredForCarriageValueAmount(
			DeclaredForCarriageValueAmountType newDeclaredForCarriageValueAmount) {
		declaredForCarriageValueAmount = newDeclaredForCarriageValueAmount;
	}

	/**
	 * Returns the value of the '<em><b>Declared Statistics Value Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Declared_ Statistics Value. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Value declared for statistical purposes of those goods in a consignment which have the same statistical heading.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Declared</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Statistics Value</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Statistical Value (WCO ID 114)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Declared Statistics Value Amount</em>' containment reference.
	 * @see #setDeclaredStatisticsValueAmount(DeclaredStatisticsValueAmountType)
	 * @generated
	 */
	public DeclaredStatisticsValueAmountType getDeclaredStatisticsValueAmount() {
		return (declaredStatisticsValueAmount == null) ? new DeclaredStatisticsValueAmountType()
				: declaredStatisticsValueAmount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getDeclaredStatisticsValueAmount <em>Declared Statistics Value Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declared Statistics Value Amount</em>' containment reference.
	 * @see #getDeclaredStatisticsValueAmount()
	 * @generated
	 */
	public void setDeclaredStatisticsValueAmount(
			DeclaredStatisticsValueAmountType newDeclaredStatisticsValueAmount) {
		declaredStatisticsValueAmount = newDeclaredStatisticsValueAmount;
	}

	/**
	 * Returns the value of the '<em><b>Free On Board Value Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Free On Board Value. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Monetary amount that has to be or has been paid as calculated under the applicable trade delivery.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Free On Board Value</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>FOB Value</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Free On Board Value Amount</em>' containment reference.
	 * @see #setFreeOnBoardValueAmount(FreeOnBoardValueAmountType)
	 * @generated
	 */
	public FreeOnBoardValueAmountType getFreeOnBoardValueAmount() {
		return (freeOnBoardValueAmount == null) ? new FreeOnBoardValueAmountType()
				: freeOnBoardValueAmount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getFreeOnBoardValueAmount <em>Free On Board Value Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free On Board Value Amount</em>' containment reference.
	 * @see #getFreeOnBoardValueAmount()
	 * @generated
	 */
	public void setFreeOnBoardValueAmount(
			FreeOnBoardValueAmountType newFreeOnBoardValueAmount) {
		freeOnBoardValueAmount = newFreeOnBoardValueAmount;
	}

	/**
	 * Returns the value of the '<em><b>Insurance Value Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Insurance Value. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The amount covered by an insurance for a particular goods item.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Insurance Value</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Value Insured</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insurance Value Amount</em>' containment reference.
	 * @see #setInsuranceValueAmount(InsuranceValueAmountType)
	 * @generated
	 */
	public InsuranceValueAmountType getInsuranceValueAmount() {
		return (insuranceValueAmount == null) ? new InsuranceValueAmountType()
				: insuranceValueAmount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getInsuranceValueAmount <em>Insurance Value Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insurance Value Amount</em>' containment reference.
	 * @see #getInsuranceValueAmount()
	 * @generated
	 */
	public void setInsuranceValueAmount(
			InsuranceValueAmountType newInsuranceValueAmount) {
		insuranceValueAmount = newInsuranceValueAmount;
	}

	/**
	 * Returns the value of the '<em><b>Value Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Value. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>To specify the amount on which a duty or tax or fee will be assessed</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Value</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Duty/tax/fee assessment basis in value (WCO ID 116)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Amount</em>' containment reference.
	 * @see #setValueAmount(ValueAmountType)
	 * @generated
	 */
	public ValueAmountType getValueAmount() {
		return (valueAmount == null) ? new ValueAmountType() : valueAmount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getValueAmount <em>Value Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Amount</em>' containment reference.
	 * @see #getValueAmount()
	 * @generated
	 */
	public void setValueAmount(ValueAmountType newValueAmount) {
		valueAmount = newValueAmount;
	}

	/**
	 * Returns the value of the '<em><b>Gross Weight Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Gross_ Weight. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Weight (mass) of goods including packaging but excluding the carrier's equipment.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Gross</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Weight</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Actual Gross Weight</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gross Weight Measure</em>' containment reference.
	 * @see #setGrossWeightMeasure(GrossWeightMeasureType)
	 * @generated
	 */
	public GrossWeightMeasureType getGrossWeightMeasure() {
		return (grossWeightMeasure == null) ? new GrossWeightMeasureType()
				: grossWeightMeasure;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getGrossWeightMeasure <em>Gross Weight Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gross Weight Measure</em>' containment reference.
	 * @see #getGrossWeightMeasure()
	 * @generated
	 */
	public void setGrossWeightMeasure(
			GrossWeightMeasureType newGrossWeightMeasure) {
		grossWeightMeasure = newGrossWeightMeasure;
	}

	/**
	 * Returns the value of the '<em><b>Net Weight Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Net_ Weight. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Weight (mass) of goods item excluding all packing but including any packaging that normally goes with the goods.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Net</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Weight</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Net Weight Measure</em>' containment reference.
	 * @see #setNetWeightMeasure(NetWeightMeasureType)
	 * @generated
	 */
	public NetWeightMeasureType getNetWeightMeasure() {
		return (netWeightMeasure == null) ? new NetWeightMeasureType()
				: netWeightMeasure;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getNetWeightMeasure <em>Net Weight Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net Weight Measure</em>' containment reference.
	 * @see #getNetWeightMeasure()
	 * @generated
	 */
	public void setNetWeightMeasure(NetWeightMeasureType newNetWeightMeasure) {
		netWeightMeasure = newNetWeightMeasure;
	}

	/**
	 * Returns the value of the '<em><b>Net Net Weight Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Net Net_ Weight. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Weight (mass) of goods without any packaging.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Net Net</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Weight</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Customs Weight (WCO ID 128)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Net Net Weight Measure</em>' containment reference.
	 * @see #setNetNetWeightMeasure(NetNetWeightMeasureType)
	 * @generated
	 */
	public NetNetWeightMeasureType getNetNetWeightMeasure() {
		return (netNetWeightMeasure == null) ? new NetNetWeightMeasureType()
				: netNetWeightMeasure;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getNetNetWeightMeasure <em>Net Net Weight Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net Net Weight Measure</em>' containment reference.
	 * @see #getNetNetWeightMeasure()
	 * @generated
	 */
	public void setNetNetWeightMeasure(
			NetNetWeightMeasureType newNetNetWeightMeasure) {
		netNetWeightMeasure = newNetNetWeightMeasure;
	}

	/**
	 * Returns the value of the '<em><b>Chargeable Weight Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Chargeable_ Weight. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Gross weight (mass) on which a charge is to be based.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Chargeable</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Weight</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Chargeable Weight Measure</em>' containment reference.
	 * @see #setChargeableWeightMeasure(ChargeableWeightMeasureType)
	 * @generated
	 */
	public ChargeableWeightMeasureType getChargeableWeightMeasure() {
		return (chargeableWeightMeasure == null) ? new ChargeableWeightMeasureType()
				: chargeableWeightMeasure;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getChargeableWeightMeasure <em>Chargeable Weight Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chargeable Weight Measure</em>' containment reference.
	 * @see #getChargeableWeightMeasure()
	 * @generated
	 */
	public void setChargeableWeightMeasure(
			ChargeableWeightMeasureType newChargeableWeightMeasure) {
		chargeableWeightMeasure = newChargeableWeightMeasure;
	}

	/**
	 * Returns the value of the '<em><b>Gross Volume Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Gross_ Volume. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Measurement normally arrived at by multiplying the maximum length, width and height of the goods item.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Gross</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Volume</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Volume, Gross Measurement Cube (GMC), Cube (WCO ID 134)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gross Volume Measure</em>' containment reference.
	 * @see #setGrossVolumeMeasure(GrossVolumeMeasureType)
	 * @generated
	 */
	public GrossVolumeMeasureType getGrossVolumeMeasure() {
		return (grossVolumeMeasure == null) ? new GrossVolumeMeasureType()
				: grossVolumeMeasure;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getGrossVolumeMeasure <em>Gross Volume Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gross Volume Measure</em>' containment reference.
	 * @see #getGrossVolumeMeasure()
	 * @generated
	 */
	public void setGrossVolumeMeasure(
			GrossVolumeMeasureType newGrossVolumeMeasure) {
		grossVolumeMeasure = newGrossVolumeMeasure;
	}

	/**
	 * Returns the value of the '<em><b>Net Volume Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Net_ Volume. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The volume contained by a goods item excluding the volume of any packaging material.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Net</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Volume</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Net Volume Measure</em>' containment reference.
	 * @see #setNetVolumeMeasure(NetVolumeMeasureType)
	 * @generated
	 */
	public NetVolumeMeasureType getNetVolumeMeasure() {
		return (netVolumeMeasure == null) ? new NetVolumeMeasureType()
				: netVolumeMeasure;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getNetVolumeMeasure <em>Net Volume Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net Volume Measure</em>' containment reference.
	 * @see #getNetVolumeMeasure()
	 * @generated
	 */
	public void setNetVolumeMeasure(NetVolumeMeasureType newNetVolumeMeasure) {
		netVolumeMeasure = newNetVolumeMeasure;
	}

	/**
	 * Returns the value of the '<em><b>Quantity Numeric</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Quantity. Numeric</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Number of goods item.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Numeric</ccts:RepresentationTerm>
	 *               <ccts:DataType>Numeric. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity Numeric</em>' containment reference.
	 * @see #setQuantityNumeric(QuantityNumericType)
	 * @generated
	 */
	public QuantityNumericType getQuantityNumeric() {
		return (quantityNumeric == null) ? new QuantityNumericType()
				: quantityNumeric;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getQuantityNumeric <em>Quantity Numeric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Numeric</em>' containment reference.
	 * @see #getQuantityNumeric()
	 * @generated
	 */
	public void setQuantityNumeric(QuantityNumericType newQuantityNumeric) {
		quantityNumeric = newQuantityNumeric;
	}

	/**
	 * Returns the value of the '<em><b>Preference Criterion Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Preference Criterion. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Specifies the treatment preference for this good according to international trading agreements.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Preference Criterion</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:Examples>"Preference Criterion" is used in the following manner in the paper CO of another country (e.g.):
	 * "A" - The good is "wholly obtained or produced entirely" in the territory of one or more of the NAFTA countries as reference in Article 415. Note: The purchase of a good in the territory does not necessarily render it "wholly obtained or produced".  If the good is an agricultural good, see also criterion F and Annex 703.2. (Reference: Article 401(a), 415).
	 * "B" - ...
	 * "C" - ...
	 * "D" - ...
	 * "E" - ...
	 * "F" - The good is an originating agricultural good under preference criterion A,B, or C above and is not subjected to quantitative restriction in the importing NAFTA country because....
	 * Thus, the column "Preference Criterion" will indicate either A, B, C,...</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Preference Criterion Code</em>' containment reference.
	 * @see #setPreferenceCriterionCode(PreferenceCriterionCodeType)
	 * @generated
	 */
	public PreferenceCriterionCodeType getPreferenceCriterionCode() {
		return (preferenceCriterionCode == null) ? new PreferenceCriterionCodeType()
				: preferenceCriterionCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getPreferenceCriterionCode <em>Preference Criterion Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preference Criterion Code</em>' containment reference.
	 * @see #getPreferenceCriterionCode()
	 * @generated
	 */
	public void setPreferenceCriterionCode(
			PreferenceCriterionCodeType newPreferenceCriterionCode) {
		preferenceCriterionCode = newPreferenceCriterionCode;
	}

	/**
	 * Returns the value of the '<em><b>Required Customs ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Required_ Customs Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Additional tariff codes required to specify a type of goods for Customs, transport, statistical or other regulatory purposes.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Required</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Customs Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Tariff code extensions (WCO ID 255)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Customs ID</em>' containment reference.
	 * @see #setRequiredCustomsID(RequiredCustomsIDType)
	 * @generated
	 */
	public RequiredCustomsIDType getRequiredCustomsID() {
		return (requiredCustomsID == null) ? new RequiredCustomsIDType()
				: requiredCustomsID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getRequiredCustomsID <em>Required Customs ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Customs ID</em>' containment reference.
	 * @see #getRequiredCustomsID()
	 * @generated
	 */
	public void setRequiredCustomsID(RequiredCustomsIDType newRequiredCustomsID) {
		requiredCustomsID = newRequiredCustomsID;
	}

	/**
	 * Returns the value of the '<em><b>Customs Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Customs Status. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Status of goods as identified by customs for regulation purposes.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Customs Status</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Customs status of goods (WCO ID 094)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Customs Status Code</em>' containment reference.
	 * @see #setCustomsStatusCode(CustomsStatusCodeType)
	 * @generated
	 */
	public CustomsStatusCodeType getCustomsStatusCode() {
		return (customsStatusCode == null) ? new CustomsStatusCodeType()
				: customsStatusCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getCustomsStatusCode <em>Customs Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customs Status Code</em>' containment reference.
	 * @see #getCustomsStatusCode()
	 * @generated
	 */
	public void setCustomsStatusCode(CustomsStatusCodeType newCustomsStatusCode) {
		customsStatusCode = newCustomsStatusCode;
	}

	/**
	 * Returns the value of the '<em><b>Customs Tariff Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Customs Tariff Quantity. Quantity</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Quantity of the goods in the unit as required by Customs for tariff, statistical or fiscal purposes.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Customs Tariff Quantity</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Quantity</ccts:RepresentationTerm>
	 *               <ccts:DataType>Quantity. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Customs Tariff Quantity</em>' containment reference.
	 * @see #setCustomsTariffQuantity(CustomsTariffQuantityType)
	 * @generated
	 */
	public CustomsTariffQuantityType getCustomsTariffQuantity() {
		return (customsTariffQuantity == null) ? new CustomsTariffQuantityType()
				: customsTariffQuantity;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getCustomsTariffQuantity <em>Customs Tariff Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customs Tariff Quantity</em>' containment reference.
	 * @see #getCustomsTariffQuantity()
	 * @generated
	 */
	public void setCustomsTariffQuantity(
			CustomsTariffQuantityType newCustomsTariffQuantity) {
		customsTariffQuantity = newCustomsTariffQuantity;
	}

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.ItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Item</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Association to a description of the good or service</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Item</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Item</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @generated
	 */
	public List getItem() {
		if (item == null) {
			item = new ArrayList<ItemType>();
		}
		return item;
	}

	/**
	 * Returns the value of the '<em><b>Goods Item Container</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.GoodsItemContainerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Goods Item Container</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Association to describe the transporting of a goods item in a unit of transport equipment (eg container)</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Goods Item Container</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Goods Item Container</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Goods Item Container</em>' containment reference list.
	 * @generated
	 */
	public List getGoodsItemContainer() {
		if (goodsItemContainer == null) {
			goodsItemContainer = new ArrayList<
					GoodsItemContainerType>();
		}
		return goodsItemContainer;
	}

	/**
	 * Returns the value of the '<em><b>Freight Allowance Charge</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.AllowanceChargeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Freight_ Allowance Charge. Allowance Charge</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Costs incurred by the shipper in moving goods, by whatever means, from one place to another under the terms of the contract of carriage. In addition to transport costs, this may include such elements as packing, documentation, loading, unloading, and insurance (to the extent that they relate to the freight costs).</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Freight</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Allowance Charge</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Allowance Charge</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Freight Costs</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Freight Allowance Charge</em>' containment reference list.
	 * @generated
	 */
	public List getFreightAllowanceCharge() {
		if (freightAllowanceCharge == null) {
			freightAllowanceCharge = new ArrayList<
					AllowanceChargeType>();
		}
		return freightAllowanceCharge;
	}

	/**
	 * Returns the value of the '<em><b>Invoice Line</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.InvoiceLineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Invoice Line</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Association to information directly relating to a line item of an invoice.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Invoice Line</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Invoice Line</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invoice Line</em>' containment reference list.
	 * @generated
	 */
	public List getInvoiceLine() {
		if (invoiceLine == null) {
			invoiceLine = new ArrayList<InvoiceLineType>();
		}
		return invoiceLine;
	}

	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.TemperatureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Temperature</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Any termperatures associated with the goods.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Temperature</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Temperature</ccts:AssociatedObjectClass>
	 *               <ccts:Examples>maximum, storage, minimum</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Temperature</em>' containment reference list.
	 * @generated
	 */
	public List getTemperature() {
		if (temperature == null) {
			temperature = new ArrayList<TemperatureType>();
		}
		return temperature;
	}

	/**
	 * Returns the value of the '<em><b>Contained Goods Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.GoodsItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Contained_ Goods Item. Goods Item</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Associates with any other goods items contained in this goods item.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Contained</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Goods Item</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Goods Item</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contained Goods Item</em>' containment reference list.
	 * @generated
	 */
	public List getContainedGoodsItem() {
		if (containedGoodsItem == null) {
			containedGoodsItem = new ArrayList<GoodsItemType>();
		}
		return containedGoodsItem;
	}

	/**
	 * Returns the value of the '<em><b>Origin Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Goods Item. Origin_ Address. Address</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Region in which the goods have been produced or manufactured, according to criteria laid down for the purposes of application of the Customs tariff, or quantitative restrictions, or of any other measure related to trade</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Goods Item</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Origin</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Address</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Address</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Region of origin (WCO ID 066)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Origin Address</em>' containment reference.
	 * @see #setOriginAddress(AddressType)
	 * @generated
	 */
	public AddressType getOriginAddress() {
		return (originAddress == null) ? new AddressType() : originAddress;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.GoodsItemType#getOriginAddress <em>Origin Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Address</em>' containment reference.
	 * @see #getOriginAddress()
	 * @generated
	 */
	public void setOriginAddress(AddressType newOriginAddress) {
		originAddress = newOriginAddress;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.chargeableWeightMeasure == null) ? 0 : this.chargeableWeightMeasure.hashCode());
		result = PRIME * result + ((this.containedGoodsItem == null) ? 0 : this.containedGoodsItem.hashCode());
		result = PRIME * result + ((this.customsStatusCode == null) ? 0 : this.customsStatusCode.hashCode());
		result = PRIME * result + ((this.customsTariffQuantity == null) ? 0 : this.customsTariffQuantity.hashCode());
		result = PRIME * result + ((this.declaredCustomsValueAmount == null) ? 0 : this.declaredCustomsValueAmount.hashCode());
		result = PRIME * result + ((this.declaredForCarriageValueAmount == null) ? 0 : this.declaredForCarriageValueAmount.hashCode());
		result = PRIME * result + ((this.declaredStatisticsValueAmount == null) ? 0 : this.declaredStatisticsValueAmount.hashCode());
		result = PRIME * result + ((this.description == null) ? 0 : this.description.hashCode());
		result = PRIME * result + ((this.freeOnBoardValueAmount == null) ? 0 : this.freeOnBoardValueAmount.hashCode());
		result = PRIME * result + ((this.freightAllowanceCharge == null) ? 0 : this.freightAllowanceCharge.hashCode());
		result = PRIME * result + ((this.goodsItemContainer == null) ? 0 : this.goodsItemContainer.hashCode());
		result = PRIME * result + ((this.grossVolumeMeasure == null) ? 0 : this.grossVolumeMeasure.hashCode());
		result = PRIME * result + ((this.grossWeightMeasure == null) ? 0 : this.grossWeightMeasure.hashCode());
		result = PRIME * result + ((this.hazardousRiskIndicator == null) ? 0 : this.hazardousRiskIndicator.hashCode());
		result = PRIME * result + ((this.iD == null) ? 0 : this.iD.hashCode());
		result = PRIME * result + ((this.insuranceValueAmount == null) ? 0 : this.insuranceValueAmount.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.invoiceLine == null) ? 0 : this.invoiceLine.hashCode());
		result = PRIME * result + ((this.item == null) ? 0 : this.item.hashCode());
		result = PRIME * result + ((this.netNetWeightMeasure == null) ? 0 : this.netNetWeightMeasure.hashCode());
		result = PRIME * result + ((this.netVolumeMeasure == null) ? 0 : this.netVolumeMeasure.hashCode());
		result = PRIME * result + ((this.netWeightMeasure == null) ? 0 : this.netWeightMeasure.hashCode());
		result = PRIME * result + ((this.originAddress == null) ? 0 : this.originAddress.hashCode());
		result = PRIME * result + ((this.preferenceCriterionCode == null) ? 0 : this.preferenceCriterionCode.hashCode());
		result = PRIME * result + ((this.quantityNumeric == null) ? 0 : this.quantityNumeric.hashCode());
		result = PRIME * result + ((this.requiredCustomsID == null) ? 0 : this.requiredCustomsID.hashCode());
		result = PRIME * result + ((this.sequenceNumberID == null) ? 0 : this.sequenceNumberID.hashCode());
		result = PRIME * result + ((this.temperature == null) ? 0 : this.temperature.hashCode());
		result = PRIME * result + ((this.valueAmount == null) ? 0 : this.valueAmount.hashCode());
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
		final GoodsItemType other = (GoodsItemType) obj;
		if (this.chargeableWeightMeasure == null) {
			if (other.chargeableWeightMeasure != null)
				return false;
		} else if (!this.chargeableWeightMeasure.equals(other.chargeableWeightMeasure))
			return false;
		if (this.containedGoodsItem == null) {
			if (other.containedGoodsItem != null)
				return false;
		} else if (!this.containedGoodsItem.equals(other.containedGoodsItem))
			return false;
		if (this.customsStatusCode == null) {
			if (other.customsStatusCode != null)
				return false;
		} else if (!this.customsStatusCode.equals(other.customsStatusCode))
			return false;
		if (this.customsTariffQuantity == null) {
			if (other.customsTariffQuantity != null)
				return false;
		} else if (!this.customsTariffQuantity.equals(other.customsTariffQuantity))
			return false;
		if (this.declaredCustomsValueAmount == null) {
			if (other.declaredCustomsValueAmount != null)
				return false;
		} else if (!this.declaredCustomsValueAmount.equals(other.declaredCustomsValueAmount))
			return false;
		if (this.declaredForCarriageValueAmount == null) {
			if (other.declaredForCarriageValueAmount != null)
				return false;
		} else if (!this.declaredForCarriageValueAmount.equals(other.declaredForCarriageValueAmount))
			return false;
		if (this.declaredStatisticsValueAmount == null) {
			if (other.declaredStatisticsValueAmount != null)
				return false;
		} else if (!this.declaredStatisticsValueAmount.equals(other.declaredStatisticsValueAmount))
			return false;
		if (this.description == null) {
			if (other.description != null)
				return false;
		} else if (!this.description.equals(other.description))
			return false;
		if (this.freeOnBoardValueAmount == null) {
			if (other.freeOnBoardValueAmount != null)
				return false;
		} else if (!this.freeOnBoardValueAmount.equals(other.freeOnBoardValueAmount))
			return false;
		if (this.freightAllowanceCharge == null) {
			if (other.freightAllowanceCharge != null)
				return false;
		} else if (!this.freightAllowanceCharge.equals(other.freightAllowanceCharge))
			return false;
		if (this.goodsItemContainer == null) {
			if (other.goodsItemContainer != null)
				return false;
		} else if (!this.goodsItemContainer.equals(other.goodsItemContainer))
			return false;
		if (this.grossVolumeMeasure == null) {
			if (other.grossVolumeMeasure != null)
				return false;
		} else if (!this.grossVolumeMeasure.equals(other.grossVolumeMeasure))
			return false;
		if (this.grossWeightMeasure == null) {
			if (other.grossWeightMeasure != null)
				return false;
		} else if (!this.grossWeightMeasure.equals(other.grossWeightMeasure))
			return false;
		if (this.hazardousRiskIndicator == null) {
			if (other.hazardousRiskIndicator != null)
				return false;
		} else if (!this.hazardousRiskIndicator.equals(other.hazardousRiskIndicator))
			return false;
		if (this.iD == null) {
			if (other.iD != null)
				return false;
		} else if (!this.iD.equals(other.iD))
			return false;
		if (this.insuranceValueAmount == null) {
			if (other.insuranceValueAmount != null)
				return false;
		} else if (!this.insuranceValueAmount.equals(other.insuranceValueAmount))
			return false;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.invoiceLine == null) {
			if (other.invoiceLine != null)
				return false;
		} else if (!this.invoiceLine.equals(other.invoiceLine))
			return false;
		if (this.item == null) {
			if (other.item != null)
				return false;
		} else if (!this.item.equals(other.item))
			return false;
		if (this.netNetWeightMeasure == null) {
			if (other.netNetWeightMeasure != null)
				return false;
		} else if (!this.netNetWeightMeasure.equals(other.netNetWeightMeasure))
			return false;
		if (this.netVolumeMeasure == null) {
			if (other.netVolumeMeasure != null)
				return false;
		} else if (!this.netVolumeMeasure.equals(other.netVolumeMeasure))
			return false;
		if (this.netWeightMeasure == null) {
			if (other.netWeightMeasure != null)
				return false;
		} else if (!this.netWeightMeasure.equals(other.netWeightMeasure))
			return false;
		if (this.originAddress == null) {
			if (other.originAddress != null)
				return false;
		} else if (!this.originAddress.equals(other.originAddress))
			return false;
		if (this.preferenceCriterionCode == null) {
			if (other.preferenceCriterionCode != null)
				return false;
		} else if (!this.preferenceCriterionCode.equals(other.preferenceCriterionCode))
			return false;
		if (this.quantityNumeric == null) {
			if (other.quantityNumeric != null)
				return false;
		} else if (!this.quantityNumeric.equals(other.quantityNumeric))
			return false;
		if (this.requiredCustomsID == null) {
			if (other.requiredCustomsID != null)
				return false;
		} else if (!this.requiredCustomsID.equals(other.requiredCustomsID))
			return false;
		if (this.sequenceNumberID == null) {
			if (other.sequenceNumberID != null)
				return false;
		} else if (!this.sequenceNumberID.equals(other.sequenceNumberID))
			return false;
		if (this.temperature == null) {
			if (other.temperature != null)
				return false;
		} else if (!this.temperature.equals(other.temperature))
			return false;
		if (this.valueAmount == null) {
			if (other.valueAmount != null)
				return false;
		} else if (!this.valueAmount.equals(other.valueAmount))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // GoodsItemType