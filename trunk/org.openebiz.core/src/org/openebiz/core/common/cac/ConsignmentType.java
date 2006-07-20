/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.ChargeableWeightMeasureType;
import org.openebiz.core.common.cbc.DeclaredCustomsValueAmountType;
import org.openebiz.core.common.cbc.GrossVolumeMeasureType;
import org.openebiz.core.common.cbc.GrossWeightMeasureType;
import org.openebiz.core.common.cbc.HazardousRiskIndicatorType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.InsurancePremiumAmountType;
import org.openebiz.core.common.cbc.LoadingLengthMeasureType;
import org.openebiz.core.common.cbc.NetNetWeightMeasureType;
import org.openebiz.core.common.cbc.NetVolumeMeasureType;
import org.openebiz.core.common.cbc.NetWeightMeasureType;
import org.openebiz.core.common.cbc.RemarksType;
import org.openebiz.core.common.cbc.SummaryDescriptionType;
import org.openebiz.core.common.cbc.TariffCodeType;
import org.openebiz.core.common.cbc.TariffDescriptionType;
import org.openebiz.core.common.cbc.TotalInvoiceAmountType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consignment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Consignment. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>A separately identifiable collection of goods items (available to be) transported from one consignor to one consignee via one or more modes of transport.</ccts:Definition>
 *           <ccts:ObjectClass>Consignment</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getSummaryDescription <em>Summary Description</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getTotalInvoiceAmount <em>Total Invoice Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getDeclaredCustomsValueAmount <em>Declared Customs Value Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getTariffDescription <em>Tariff Description</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getTariffCode <em>Tariff Code</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getInsurancePremiumAmount <em>Insurance Premium Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getGrossWeightMeasure <em>Gross Weight Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getNetWeightMeasure <em>Net Weight Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getNetNetWeightMeasure <em>Net Net Weight Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getChargeableWeightMeasure <em>Chargeable Weight Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getGrossVolumeMeasure <em>Gross Volume Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getNetVolumeMeasure <em>Net Volume Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getLoadingLengthMeasure <em>Loading Length Measure</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getHazardousRiskIndicator <em>Hazardous Risk Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getConsigneeParty <em>Consignee Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getExporterParty <em>Exporter Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getConsignorParty <em>Consignor Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getImporterParty <em>Importer Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getCarrierParty <em>Carrier Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getFreightForwarderParty <em>Freight Forwarder Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getNotifyParty <em>Notify Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getOriginalDespatchParty <em>Original Despatch Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getFinalDeliveryParty <em>Final Delivery Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getOriginalDepartureCountry <em>Original Departure Country</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getFinalDestinationCountry <em>Final Destination Country</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getTransitCountry <em>Transit Country</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getOriginalDespatchTransportationService <em>Original Despatch Transportation Service</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getFinalDeliveryTransportationService <em>Final Delivery Transportation Service</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getDeliveryTerms <em>Delivery Terms</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getPaymentTerms <em>Payment Terms</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.ConsignmentType#getFreightAllowanceCharge <em>Freight Allowance Charge</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConsignmentType implements Serializable {
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
	 * The cached value of the '{@link #getSummaryDescription() <em>Summary Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummaryDescription()
	 * @generated
	 * @ordered
	 */
	protected List summaryDescription = null;

	/**
	 * The cached value of the '{@link #getTotalInvoiceAmount() <em>Total Invoice Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalInvoiceAmount()
	 * @generated
	 * @ordered
	 */
	protected TotalInvoiceAmountType totalInvoiceAmount = null;

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
	 * The cached value of the '{@link #getTariffDescription() <em>Tariff Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTariffDescription()
	 * @generated
	 * @ordered
	 */
	protected List tariffDescription = null;

	/**
	 * The cached value of the '{@link #getTariffCode() <em>Tariff Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTariffCode()
	 * @generated
	 * @ordered
	 */
	protected TariffCodeType tariffCode = null;

	/**
	 * The cached value of the '{@link #getInsurancePremiumAmount() <em>Insurance Premium Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurancePremiumAmount()
	 * @generated
	 * @ordered
	 */
	protected InsurancePremiumAmountType insurancePremiumAmount = null;

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
	 * The cached value of the '{@link #getLoadingLengthMeasure() <em>Loading Length Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadingLengthMeasure()
	 * @generated
	 * @ordered
	 */
	protected LoadingLengthMeasureType loadingLengthMeasure = null;

	/**
	 * The cached value of the '{@link #getRemarks() <em>Remarks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected List remarks = null;

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
	 * The cached value of the '{@link #getConsigneeParty() <em>Consignee Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsigneeParty()
	 * @generated
	 * @ordered
	 */
	protected PartyType consigneeParty = null;

	/**
	 * The cached value of the '{@link #getExporterParty() <em>Exporter Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExporterParty()
	 * @generated
	 * @ordered
	 */
	protected PartyType exporterParty = null;

	/**
	 * The cached value of the '{@link #getConsignorParty() <em>Consignor Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsignorParty()
	 * @generated
	 * @ordered
	 */
	protected PartyType consignorParty = null;

	/**
	 * The cached value of the '{@link #getImporterParty() <em>Importer Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImporterParty()
	 * @generated
	 * @ordered
	 */
	protected PartyType importerParty = null;

	/**
	 * The cached value of the '{@link #getCarrierParty() <em>Carrier Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierParty()
	 * @generated
	 * @ordered
	 */
	protected PartyType carrierParty = null;

	/**
	 * The cached value of the '{@link #getFreightForwarderParty() <em>Freight Forwarder Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreightForwarderParty()
	 * @generated
	 * @ordered
	 */
	protected PartyType freightForwarderParty = null;

	/**
	 * The cached value of the '{@link #getNotifyParty() <em>Notify Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotifyParty()
	 * @generated
	 * @ordered
	 */
	protected PartyType notifyParty = null;

	/**
	 * The cached value of the '{@link #getOriginalDespatchParty() <em>Original Despatch Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalDespatchParty()
	 * @generated
	 * @ordered
	 */
	protected PartyType originalDespatchParty = null;

	/**
	 * The cached value of the '{@link #getFinalDeliveryParty() <em>Final Delivery Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalDeliveryParty()
	 * @generated
	 * @ordered
	 */
	protected PartyType finalDeliveryParty = null;

	/**
	 * The cached value of the '{@link #getOriginalDepartureCountry() <em>Original Departure Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalDepartureCountry()
	 * @generated
	 * @ordered
	 */
	protected CountryType originalDepartureCountry = null;

	/**
	 * The cached value of the '{@link #getFinalDestinationCountry() <em>Final Destination Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalDestinationCountry()
	 * @generated
	 * @ordered
	 */
	protected CountryType finalDestinationCountry = null;

	/**
	 * The cached value of the '{@link #getTransitCountry() <em>Transit Country</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitCountry()
	 * @generated
	 * @ordered
	 */
	protected List transitCountry = null;

	/**
	 * The cached value of the '{@link #getOriginalDespatchTransportationService() <em>Original Despatch Transportation Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalDespatchTransportationService()
	 * @generated
	 * @ordered
	 */
	protected TransportationServiceType originalDespatchTransportationService = null;

	/**
	 * The cached value of the '{@link #getFinalDeliveryTransportationService() <em>Final Delivery Transportation Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalDeliveryTransportationService()
	 * @generated
	 * @ordered
	 */
	protected TransportationServiceType finalDeliveryTransportationService = null;

	/**
	 * The cached value of the '{@link #getDeliveryTerms() <em>Delivery Terms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryTerms()
	 * @generated
	 * @ordered
	 */
	protected DeliveryTermsType deliveryTerms = null;

	/**
	 * The cached value of the '{@link #getPaymentTerms() <em>Payment Terms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentTerms()
	 * @generated
	 * @ordered
	 */
	protected PaymentTermsType paymentTerms = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ConsignmentType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.iD = this.getID();
		this.summaryDescription = this.getSummaryDescription();
		this.totalInvoiceAmount = this.getTotalInvoiceAmount();
		this.declaredCustomsValueAmount = this.getDeclaredCustomsValueAmount();
		this.tariffDescription = this.getTariffDescription();
		this.tariffCode = this.getTariffCode();
		this.insurancePremiumAmount = this.getInsurancePremiumAmount();
		this.grossWeightMeasure = this.getGrossWeightMeasure();
		this.netWeightMeasure = this.getNetWeightMeasure();
		this.netNetWeightMeasure = this.getNetNetWeightMeasure();
		this.chargeableWeightMeasure = this.getChargeableWeightMeasure();
		this.grossVolumeMeasure = this.getGrossVolumeMeasure();
		this.netVolumeMeasure = this.getNetVolumeMeasure();
		this.loadingLengthMeasure = this.getLoadingLengthMeasure();
		this.remarks = this.getRemarks();
		this.hazardousRiskIndicator = this.getHazardousRiskIndicator();
		this.consigneeParty = this.getConsigneeParty();
		this.exporterParty = this.getExporterParty();
		this.consignorParty = this.getConsignorParty();
		this.importerParty = this.getImporterParty();
		this.carrierParty = this.getCarrierParty();
		this.freightForwarderParty = this.getFreightForwarderParty();
		this.notifyParty = this.getNotifyParty();
		this.originalDespatchParty = this.getOriginalDespatchParty();
		this.finalDeliveryParty = this.getFinalDeliveryParty();
		this.originalDepartureCountry = this.getOriginalDepartureCountry();
		this.finalDestinationCountry = this.getFinalDestinationCountry();
		this.transitCountry = this.getTransitCountry();
		this.originalDespatchTransportationService = this.getOriginalDespatchTransportationService();
		this.finalDeliveryTransportationService = this.getFinalDeliveryTransportationService();
		this.deliveryTerms = this.getDeliveryTerms();
		this.paymentTerms = this.getPaymentTerms();
		this.freightAllowanceCharge = this.getFreightAllowanceCharge();
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
	 *               <ccts:DictionaryEntryName>Consignment. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Unique number assigned to goods, both for import and export.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Unique consignment reference number (UCR)</ccts:AlternativeBusinessTerms>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getID <em>ID</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Summary Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cbc.SummaryDescriptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Summary Description. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>General descriptive text that is not part of any remarks.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Summary Description</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Summary Description</em>' containment reference list.
	 * @generated
	 */
	public List getSummaryDescription() {
		if (summaryDescription == null) {
			summaryDescription = new ArrayList<
					SummaryDescriptionType>();
		}
		return summaryDescription;
	}

	/**
	 * Returns the value of the '<em><b>Total Invoice Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Total_ Invoice Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Total of all invoice amounts declared in a single consignment.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Total</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Invoice Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Invoice Amount</em>' containment reference.
	 * @see #setTotalInvoiceAmount(TotalInvoiceAmountType)
	 * @generated
	 */
	public TotalInvoiceAmountType getTotalInvoiceAmount() {
		return (totalInvoiceAmount == null) ? new TotalInvoiceAmountType()
				: totalInvoiceAmount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getTotalInvoiceAmount <em>Total Invoice Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Invoice Amount</em>' containment reference.
	 * @see #getTotalInvoiceAmount()
	 * @generated
	 */
	public void setTotalInvoiceAmount(
			TotalInvoiceAmountType newTotalInvoiceAmount) {
		totalInvoiceAmount = newTotalInvoiceAmount;
	}

	/**
	 * Returns the value of the '<em><b>Declared Customs Value Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Declared_ Customs Value. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Amount declared for customs purposes of those goods in a consignment whether or not they are subject to the same customs procedure, tariff/statistical heading, country information and duty regime.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Declared</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Customs Value</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getDeclaredCustomsValueAmount <em>Declared Customs Value Amount</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Tariff Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cbc.TariffDescriptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Tariff Description. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Free text specification of tariff applied to a consignment.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Tariff Description</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tariff Description</em>' containment reference list.
	 * @generated
	 */
	public List getTariffDescription() {
		if (tariffDescription == null) {
			tariffDescription = new ArrayList<
					TariffDescriptionType>();
		}
		return tariffDescription;
	}

	/**
	 * Returns the value of the '<em><b>Tariff Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Tariff Code. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Code specifying a tariff applied to a consignment.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Tariff Code</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Tariff code number (WCO ID 145)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tariff Code</em>' containment reference.
	 * @see #setTariffCode(TariffCodeType)
	 * @generated
	 */
	public TariffCodeType getTariffCode() {
		return (tariffCode == null) ? new TariffCodeType() : tariffCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getTariffCode <em>Tariff Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tariff Code</em>' containment reference.
	 * @see #getTariffCode()
	 * @generated
	 */
	public void setTariffCode(TariffCodeType newTariffCode) {
		tariffCode = newTariffCode;
	}

	/**
	 * Returns the value of the '<em><b>Insurance Premium Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Insurance Premium Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Amount of premium payable to the insurance company for insuring the goods.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Insurance Premium Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Insurance Cost</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insurance Premium Amount</em>' containment reference.
	 * @see #setInsurancePremiumAmount(InsurancePremiumAmountType)
	 * @generated
	 */
	public InsurancePremiumAmountType getInsurancePremiumAmount() {
		return (insurancePremiumAmount == null) ? new InsurancePremiumAmountType()
				: insurancePremiumAmount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getInsurancePremiumAmount <em>Insurance Premium Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insurance Premium Amount</em>' containment reference.
	 * @see #getInsurancePremiumAmount()
	 * @generated
	 */
	public void setInsurancePremiumAmount(
			InsurancePremiumAmountType newInsurancePremiumAmount) {
		insurancePremiumAmount = newInsurancePremiumAmount;
	}

	/**
	 * Returns the value of the '<em><b>Gross Weight Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Gross_ Weight. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Total weight (mass) of goods including packaging but excluding the carrier's equipment for a declaration.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Gross</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Weight</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Total gross weight (WCO ID 131)</ccts:AlternativeBusinessTerms>
	 *               <ccts:Examples>Total cube of all goods items referred to as one consignment.</ccts:Examples>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getGrossWeightMeasure <em>Gross Weight Measure</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Consignment. Net_ Weight. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Total net weight (mass) of all the goods items referred to as one consignment.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getNetWeightMeasure <em>Net Weight Measure</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Consignment. Net Net_ Weight. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Weight (mass) of the goods themselves without any packing.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Net Net</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Weight</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getNetNetWeightMeasure <em>Net Net Weight Measure</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Consignment. Chargeable_ Weight. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Gross weight (mass) on which a charge is to be based.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Chargeable</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Weight</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Chargeable Weight. Basis.Measure</ccts:AlternativeBusinessTerms>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getChargeableWeightMeasure <em>Chargeable Weight Measure</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Consignment. Gross_ Volume. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Total cube of all goods items referred to as one consignment.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Gross</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Volume</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Cube</ccts:AlternativeBusinessTerms>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getGrossVolumeMeasure <em>Gross Volume Measure</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Consignment. Net_ Volume. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition/>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getNetVolumeMeasure <em>Net Volume Measure</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Loading Length Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Loading_ Length. Measure</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Total length in a means of transport or a piece of transport equipment whereby the complete width and height over that length is needed for loading all the consignments referred to as one consolidation.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Loading</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Length</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Measure</ccts:RepresentationTerm>
	 *               <ccts:DataType>Measure. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loading Length Measure</em>' containment reference.
	 * @see #setLoadingLengthMeasure(LoadingLengthMeasureType)
	 * @generated
	 */
	public LoadingLengthMeasureType getLoadingLengthMeasure() {
		return (loadingLengthMeasure == null) ? new LoadingLengthMeasureType()
				: loadingLengthMeasure;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getLoadingLengthMeasure <em>Loading Length Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loading Length Measure</em>' containment reference.
	 * @see #getLoadingLengthMeasure()
	 * @generated
	 */
	public void setLoadingLengthMeasure(
			LoadingLengthMeasureType newLoadingLengthMeasure) {
		loadingLengthMeasure = newLoadingLengthMeasure;
	}

	/**
	 * Returns the value of the '<em><b>Remarks</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cbc.RemarksType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Remarks. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Remarks concerning the complete consignment to be printed on the transport document.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Remarks</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remarks</em>' containment reference list.
	 * @generated
	 */
	public List getRemarks() {
		if (remarks == null) {
			remarks = new ArrayList<RemarksType>();
		}
		return remarks;
	}

	/**
	 * Returns the value of the '<em><b>Hazardous Risk Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Hazardous Risk Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Indication that the transport is subject to an international regulation concerning the carriage of dangerous goods or not.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Hazardous Risk Indicator</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Dangerous Goods RID Indicator</ccts:AlternativeBusinessTerms>
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
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getHazardousRiskIndicator <em>Hazardous Risk Indicator</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Consignee Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Consignee_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>party to which goods are consigned.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Consignee</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Consignee (WCO ID 51 and 52)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consignee Party</em>' containment reference.
	 * @see #setConsigneeParty(PartyType)
	 * @generated
	 */
	public PartyType getConsigneeParty() {
		return (consigneeParty == null) ? new PartyType() : consigneeParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getConsigneeParty <em>Consignee Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consignee Party</em>' containment reference.
	 * @see #getConsigneeParty()
	 * @generated
	 */
	public void setConsigneeParty(PartyType newConsigneeParty) {
		consigneeParty = newConsigneeParty;
	}

	/**
	 * Returns the value of the '<em><b>Exporter Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Exporter_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the party who makes - or on whose behalf - the export declaration - is made - and who is the owner of the goods or has similar right of disposal over them at the time when the declaration is accepted.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Exporter</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Exporter (WCO ID 41 and 42)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exporter Party</em>' containment reference.
	 * @see #setExporterParty(PartyType)
	 * @generated
	 */
	public PartyType getExporterParty() {
		return (exporterParty == null) ? new PartyType() : exporterParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getExporterParty <em>Exporter Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exporter Party</em>' containment reference.
	 * @see #getExporterParty()
	 * @generated
	 */
	public void setExporterParty(PartyType newExporterParty) {
		exporterParty = newExporterParty;
	}

	/**
	 * Returns the value of the '<em><b>Consignor Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Consignor_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the party consigning goods as stipulated in the transport contract by the party ordering transport.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Consignor</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Consignor (WCO ID 71 and 72)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consignor Party</em>' containment reference.
	 * @see #setConsignorParty(PartyType)
	 * @generated
	 */
	public PartyType getConsignorParty() {
		return (consignorParty == null) ? new PartyType() : consignorParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getConsignorParty <em>Consignor Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consignor Party</em>' containment reference.
	 * @see #getConsignorParty()
	 * @generated
	 */
	public void setConsignorParty(PartyType newConsignorParty) {
		consignorParty = newConsignorParty;
	}

	/**
	 * Returns the value of the '<em><b>Importer Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Importer_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the party who makes-or on whose behalf a Customs clearing agent or other authorized person makes- an import declaration. This may include a person who has possession of the goods or to whom the goods are consigned.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Importer</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Importer (WCO ID 39 and 40)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Importer Party</em>' containment reference.
	 * @see #setImporterParty(PartyType)
	 * @generated
	 */
	public PartyType getImporterParty() {
		return (importerParty == null) ? new PartyType() : importerParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getImporterParty <em>Importer Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importer Party</em>' containment reference.
	 * @see #getImporterParty()
	 * @generated
	 */
	public void setImporterParty(PartyType newImporterParty) {
		importerParty = newImporterParty;
	}

	/**
	 * Returns the value of the '<em><b>Carrier Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Carrier_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the party providing the transport of goods between named points.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Carrier</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Transport Company, Shipping Line, NVOCC, Airline,  Haulier, Courier, Carrier (WCO ID 49 and 50)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Carrier Party</em>' containment reference.
	 * @see #setCarrierParty(PartyType)
	 * @generated
	 */
	public PartyType getCarrierParty() {
		return (carrierParty == null) ? new PartyType() : carrierParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getCarrierParty <em>Carrier Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Party</em>' containment reference.
	 * @see #getCarrierParty()
	 * @generated
	 */
	public void setCarrierParty(PartyType newCarrierParty) {
		carrierParty = newCarrierParty;
	}

	/**
	 * Returns the value of the '<em><b>Freight Forwarder Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Freight Forwarder_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the party combining individual smaller consignments into a single larger shipment (so called consolidated shipment) that is sent to a counterpart who mirrors the consolidator's activity by dividing the consolidated consignment into its original components.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Freight Forwarder</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Consolidator (WCO ID 192 AND 193)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Freight Forwarder Party</em>' containment reference.
	 * @see #setFreightForwarderParty(PartyType)
	 * @generated
	 */
	public PartyType getFreightForwarderParty() {
		return (freightForwarderParty == null) ? new PartyType()
				: freightForwarderParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getFreightForwarderParty <em>Freight Forwarder Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Freight Forwarder Party</em>' containment reference.
	 * @see #getFreightForwarderParty()
	 * @generated
	 */
	public void setFreightForwarderParty(PartyType newFreightForwarderParty) {
		freightForwarderParty = newFreightForwarderParty;
	}

	/**
	 * Returns the value of the '<em><b>Notify Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Notify_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the party to be notified.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Notify</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>WCO ID 57 and 58</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notify Party</em>' containment reference.
	 * @see #setNotifyParty(PartyType)
	 * @generated
	 */
	public PartyType getNotifyParty() {
		return (notifyParty == null) ? new PartyType() : notifyParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getNotifyParty <em>Notify Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notify Party</em>' containment reference.
	 * @see #getNotifyParty()
	 * @generated
	 */
	public void setNotifyParty(PartyType newNotifyParty) {
		notifyParty = newNotifyParty;
	}

	/**
	 * Returns the value of the '<em><b>Original Despatch Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Original Despatch_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition/>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Original Despatch</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Original Despatch Party</em>' containment reference.
	 * @see #setOriginalDespatchParty(PartyType)
	 * @generated
	 */
	public PartyType getOriginalDespatchParty() {
		return (originalDespatchParty == null) ? new PartyType()
				: originalDespatchParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getOriginalDespatchParty <em>Original Despatch Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Despatch Party</em>' containment reference.
	 * @see #getOriginalDespatchParty()
	 * @generated
	 */
	public void setOriginalDespatchParty(PartyType newOriginalDespatchParty) {
		originalDespatchParty = newOriginalDespatchParty;
	}

	/**
	 * Returns the value of the '<em><b>Final Delivery Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Final Delivery_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition/>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Final Delivery</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Final Delivery Party</em>' containment reference.
	 * @see #setFinalDeliveryParty(PartyType)
	 * @generated
	 */
	public PartyType getFinalDeliveryParty() {
		return (finalDeliveryParty == null) ? new PartyType()
				: finalDeliveryParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getFinalDeliveryParty <em>Final Delivery Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Delivery Party</em>' containment reference.
	 * @see #getFinalDeliveryParty()
	 * @generated
	 */
	public void setFinalDeliveryParty(PartyType newFinalDeliveryParty) {
		finalDeliveryParty = newFinalDeliveryParty;
	}

	/**
	 * Returns the value of the '<em><b>Original Departure Country</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Original Departure_ Country. Country</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the country from which the goods are originally exported without any commercial transaction taken place in intermediate countries.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Original Departure</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Country</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Country</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Country of origin (WCO ID 062)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Original Departure Country</em>' containment reference.
	 * @see #setOriginalDepartureCountry(CountryType)
	 * @generated
	 */
	public CountryType getOriginalDepartureCountry() {
		return (originalDepartureCountry == null) ? new CountryType()
				: originalDepartureCountry;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getOriginalDepartureCountry <em>Original Departure Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Departure Country</em>' containment reference.
	 * @see #getOriginalDepartureCountry()
	 * @generated
	 */
	public void setOriginalDepartureCountry(
			CountryType newOriginalDepartureCountry) {
		originalDepartureCountry = newOriginalDepartureCountry;
	}

	/**
	 * Returns the value of the '<em><b>Final Destination Country</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Final Destination_ Country. Country</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Name of the country to which the goods are to be delivered to the final consignee or buyer.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Final Destination</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Country</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Country</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Ultimate Destination Country, Country of Final Arrival, Country of Destination</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Final Destination Country</em>' containment reference.
	 * @see #setFinalDestinationCountry(CountryType)
	 * @generated
	 */
	public CountryType getFinalDestinationCountry() {
		return (finalDestinationCountry == null) ? new CountryType()
				: finalDestinationCountry;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getFinalDestinationCountry <em>Final Destination Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Destination Country</em>' containment reference.
	 * @see #getFinalDestinationCountry()
	 * @generated
	 */
	public void setFinalDestinationCountry(
			CountryType newFinalDestinationCountry) {
		finalDestinationCountry = newFinalDestinationCountry;
	}

	/**
	 * Returns the value of the '<em><b>Transit Country</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.CountryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Transit_ Country. Country</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>the countries through which goods or passengers are routed between the country of original departure and final destination.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Transit</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Country</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Country</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Country(ies) of routing (WCO ID 064)</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transit Country</em>' containment reference list.
	 * @generated
	 */
	public List getTransitCountry() {
		if (transitCountry == null) {
			transitCountry = new ArrayList<CountryType>();
		}
		return transitCountry;
	}

	/**
	 * Returns the value of the '<em><b>Original Despatch Transportation Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Original Despatch_ Transportation Service. Transportation Service</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The service for pick-up from the consignor under the transport contract.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Original Despatch</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Transportation Service</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Transportation Service</ccts:AssociatedObjectClass>
	 *               <ccts:Examples>"Door-to-door", "Pier-to-door"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Original Despatch Transportation Service</em>' containment reference.
	 * @see #setOriginalDespatchTransportationService(TransportationServiceType)
	 * @generated
	 */
	public TransportationServiceType getOriginalDespatchTransportationService() {
		return (originalDespatchTransportationService == null) ? new TransportationServiceType()
				: originalDespatchTransportationService;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getOriginalDespatchTransportationService <em>Original Despatch Transportation Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Despatch Transportation Service</em>' containment reference.
	 * @see #getOriginalDespatchTransportationService()
	 * @generated
	 */
	public void setOriginalDespatchTransportationService(
			TransportationServiceType newOriginalDespatchTransportationService) {
		originalDespatchTransportationService = newOriginalDespatchTransportationService;
	}

	/**
	 * Returns the value of the '<em><b>Final Delivery Transportation Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Final Delivery_ Transportation Service. Transportation Service</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The service for delivery to the consignee under the transport contract.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Final Delivery</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Transportation Service</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Transportation Service</ccts:AssociatedObjectClass>
	 *               <ccts:Examples>"Door-to-door", "Pier-to-door"</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Final Delivery Transportation Service</em>' containment reference.
	 * @see #setFinalDeliveryTransportationService(TransportationServiceType)
	 * @generated
	 */
	public TransportationServiceType getFinalDeliveryTransportationService() {
		return (finalDeliveryTransportationService == null) ? new TransportationServiceType()
				: finalDeliveryTransportationService;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getFinalDeliveryTransportationService <em>Final Delivery Transportation Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Delivery Transportation Service</em>' containment reference.
	 * @see #getFinalDeliveryTransportationService()
	 * @generated
	 */
	public void setFinalDeliveryTransportationService(
			TransportationServiceType newFinalDeliveryTransportationService) {
		finalDeliveryTransportationService = newFinalDeliveryTransportationService;
	}

	/**
	 * Returns the value of the '<em><b>Delivery Terms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Delivery Terms</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>All the conditions agreed upon between a seller and a buyer with regard to the delivery of goods and/or services, e.g. CIF, FOB, or EXW from the INCOTERMS Terms of Delivery.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Delivery Terms</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Delivery Terms</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Trade Terms, INCOTERMS</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delivery Terms</em>' containment reference.
	 * @see #setDeliveryTerms(DeliveryTermsType)
	 * @generated
	 */
	public DeliveryTermsType getDeliveryTerms() {
		return (deliveryTerms == null) ? new DeliveryTermsType()
				: deliveryTerms;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getDeliveryTerms <em>Delivery Terms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Terms</em>' containment reference.
	 * @see #getDeliveryTerms()
	 * @generated
	 */
	public void setDeliveryTerms(DeliveryTermsType newDeliveryTerms) {
		deliveryTerms = newDeliveryTerms;
	}

	/**
	 * Returns the value of the '<em><b>Payment Terms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Consignment. Payment Terms</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The conditions of payment between the parties in a transaction.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Payment Terms</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Payment Terms</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Terms</em>' containment reference.
	 * @see #setPaymentTerms(PaymentTermsType)
	 * @generated
	 */
	public PaymentTermsType getPaymentTerms() {
		return (paymentTerms == null) ? new PaymentTermsType() : paymentTerms;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.ConsignmentType#getPaymentTerms <em>Payment Terms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Terms</em>' containment reference.
	 * @see #getPaymentTerms()
	 * @generated
	 */
	public void setPaymentTerms(PaymentTermsType newPaymentTerms) {
		paymentTerms = newPaymentTerms;
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
	 *               <ccts:DictionaryEntryName>Consignment. Freight_ Allowance Charge. Allowance Charge</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Costs incurred by the shipper in moving goods, by whatever means, from one place to another under the terms of the contract of carriage. In addition to transport costs, this may include such elements as packing, documentation, loading, unloading, and insurance (to the extent that they relate to the freight costs).</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Consignment</ccts:ObjectClass>
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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.carrierParty == null) ? 0 : this.carrierParty.hashCode());
		result = PRIME * result + ((this.chargeableWeightMeasure == null) ? 0 : this.chargeableWeightMeasure.hashCode());
		result = PRIME * result + ((this.consigneeParty == null) ? 0 : this.consigneeParty.hashCode());
		result = PRIME * result + ((this.consignorParty == null) ? 0 : this.consignorParty.hashCode());
		result = PRIME * result + ((this.declaredCustomsValueAmount == null) ? 0 : this.declaredCustomsValueAmount.hashCode());
		result = PRIME * result + ((this.deliveryTerms == null) ? 0 : this.deliveryTerms.hashCode());
		result = PRIME * result + ((this.exporterParty == null) ? 0 : this.exporterParty.hashCode());
		result = PRIME * result + ((this.finalDeliveryParty == null) ? 0 : this.finalDeliveryParty.hashCode());
		result = PRIME * result + ((this.finalDeliveryTransportationService == null) ? 0 : this.finalDeliveryTransportationService.hashCode());
		result = PRIME * result + ((this.finalDestinationCountry == null) ? 0 : this.finalDestinationCountry.hashCode());
		result = PRIME * result + ((this.freightAllowanceCharge == null) ? 0 : this.freightAllowanceCharge.hashCode());
		result = PRIME * result + ((this.freightForwarderParty == null) ? 0 : this.freightForwarderParty.hashCode());
		result = PRIME * result + ((this.grossVolumeMeasure == null) ? 0 : this.grossVolumeMeasure.hashCode());
		result = PRIME * result + ((this.grossWeightMeasure == null) ? 0 : this.grossWeightMeasure.hashCode());
		result = PRIME * result + ((this.hazardousRiskIndicator == null) ? 0 : this.hazardousRiskIndicator.hashCode());
		result = PRIME * result + ((this.iD == null) ? 0 : this.iD.hashCode());
		result = PRIME * result + ((this.importerParty == null) ? 0 : this.importerParty.hashCode());
		result = PRIME * result + ((this.insurancePremiumAmount == null) ? 0 : this.insurancePremiumAmount.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.loadingLengthMeasure == null) ? 0 : this.loadingLengthMeasure.hashCode());
		result = PRIME * result + ((this.netNetWeightMeasure == null) ? 0 : this.netNetWeightMeasure.hashCode());
		result = PRIME * result + ((this.netVolumeMeasure == null) ? 0 : this.netVolumeMeasure.hashCode());
		result = PRIME * result + ((this.netWeightMeasure == null) ? 0 : this.netWeightMeasure.hashCode());
		result = PRIME * result + ((this.notifyParty == null) ? 0 : this.notifyParty.hashCode());
		result = PRIME * result + ((this.originalDepartureCountry == null) ? 0 : this.originalDepartureCountry.hashCode());
		result = PRIME * result + ((this.originalDespatchParty == null) ? 0 : this.originalDespatchParty.hashCode());
		result = PRIME * result + ((this.originalDespatchTransportationService == null) ? 0 : this.originalDespatchTransportationService.hashCode());
		result = PRIME * result + ((this.paymentTerms == null) ? 0 : this.paymentTerms.hashCode());
		result = PRIME * result + ((this.remarks == null) ? 0 : this.remarks.hashCode());
		result = PRIME * result + ((this.summaryDescription == null) ? 0 : this.summaryDescription.hashCode());
		result = PRIME * result + ((this.tariffCode == null) ? 0 : this.tariffCode.hashCode());
		result = PRIME * result + ((this.tariffDescription == null) ? 0 : this.tariffDescription.hashCode());
		result = PRIME * result + ((this.totalInvoiceAmount == null) ? 0 : this.totalInvoiceAmount.hashCode());
		result = PRIME * result + ((this.transitCountry == null) ? 0 : this.transitCountry.hashCode());
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
		final ConsignmentType other = (ConsignmentType) obj;
		if (this.carrierParty == null) {
			if (other.carrierParty != null)
				return false;
		} else if (!this.carrierParty.equals(other.carrierParty))
			return false;
		if (this.chargeableWeightMeasure == null) {
			if (other.chargeableWeightMeasure != null)
				return false;
		} else if (!this.chargeableWeightMeasure.equals(other.chargeableWeightMeasure))
			return false;
		if (this.consigneeParty == null) {
			if (other.consigneeParty != null)
				return false;
		} else if (!this.consigneeParty.equals(other.consigneeParty))
			return false;
		if (this.consignorParty == null) {
			if (other.consignorParty != null)
				return false;
		} else if (!this.consignorParty.equals(other.consignorParty))
			return false;
		if (this.declaredCustomsValueAmount == null) {
			if (other.declaredCustomsValueAmount != null)
				return false;
		} else if (!this.declaredCustomsValueAmount.equals(other.declaredCustomsValueAmount))
			return false;
		if (this.deliveryTerms == null) {
			if (other.deliveryTerms != null)
				return false;
		} else if (!this.deliveryTerms.equals(other.deliveryTerms))
			return false;
		if (this.exporterParty == null) {
			if (other.exporterParty != null)
				return false;
		} else if (!this.exporterParty.equals(other.exporterParty))
			return false;
		if (this.finalDeliveryParty == null) {
			if (other.finalDeliveryParty != null)
				return false;
		} else if (!this.finalDeliveryParty.equals(other.finalDeliveryParty))
			return false;
		if (this.finalDeliveryTransportationService == null) {
			if (other.finalDeliveryTransportationService != null)
				return false;
		} else if (!this.finalDeliveryTransportationService.equals(other.finalDeliveryTransportationService))
			return false;
		if (this.finalDestinationCountry == null) {
			if (other.finalDestinationCountry != null)
				return false;
		} else if (!this.finalDestinationCountry.equals(other.finalDestinationCountry))
			return false;
		if (this.freightAllowanceCharge == null) {
			if (other.freightAllowanceCharge != null)
				return false;
		} else if (!this.freightAllowanceCharge.equals(other.freightAllowanceCharge))
			return false;
		if (this.freightForwarderParty == null) {
			if (other.freightForwarderParty != null)
				return false;
		} else if (!this.freightForwarderParty.equals(other.freightForwarderParty))
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
		if (this.importerParty == null) {
			if (other.importerParty != null)
				return false;
		} else if (!this.importerParty.equals(other.importerParty))
			return false;
		if (this.insurancePremiumAmount == null) {
			if (other.insurancePremiumAmount != null)
				return false;
		} else if (!this.insurancePremiumAmount.equals(other.insurancePremiumAmount))
			return false;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.loadingLengthMeasure == null) {
			if (other.loadingLengthMeasure != null)
				return false;
		} else if (!this.loadingLengthMeasure.equals(other.loadingLengthMeasure))
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
		if (this.notifyParty == null) {
			if (other.notifyParty != null)
				return false;
		} else if (!this.notifyParty.equals(other.notifyParty))
			return false;
		if (this.originalDepartureCountry == null) {
			if (other.originalDepartureCountry != null)
				return false;
		} else if (!this.originalDepartureCountry.equals(other.originalDepartureCountry))
			return false;
		if (this.originalDespatchParty == null) {
			if (other.originalDespatchParty != null)
				return false;
		} else if (!this.originalDespatchParty.equals(other.originalDespatchParty))
			return false;
		if (this.originalDespatchTransportationService == null) {
			if (other.originalDespatchTransportationService != null)
				return false;
		} else if (!this.originalDespatchTransportationService.equals(other.originalDespatchTransportationService))
			return false;
		if (this.paymentTerms == null) {
			if (other.paymentTerms != null)
				return false;
		} else if (!this.paymentTerms.equals(other.paymentTerms))
			return false;
		if (this.remarks == null) {
			if (other.remarks != null)
				return false;
		} else if (!this.remarks.equals(other.remarks))
			return false;
		if (this.summaryDescription == null) {
			if (other.summaryDescription != null)
				return false;
		} else if (!this.summaryDescription.equals(other.summaryDescription))
			return false;
		if (this.tariffCode == null) {
			if (other.tariffCode != null)
				return false;
		} else if (!this.tariffCode.equals(other.tariffCode))
			return false;
		if (this.tariffDescription == null) {
			if (other.tariffDescription != null)
				return false;
		} else if (!this.tariffDescription.equals(other.tariffDescription))
			return false;
		if (this.totalInvoiceAmount == null) {
			if (other.totalInvoiceAmount != null)
				return false;
		} else if (!this.totalInvoiceAmount.equals(other.totalInvoiceAmount))
			return false;
		if (this.transitCountry == null) {
			if (other.transitCountry != null)
				return false;
		} else if (!this.transitCountry.equals(other.transitCountry))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // ConsignmentType