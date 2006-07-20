package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.TariffCodeType;
import org.openebiz.core.common.cac.PartyType;
import org.openebiz.core.common.cac.CountryType;
import org.openebiz.core.common.cac.TransportationServiceType;
import org.openebiz.core.common.cac.DeliveryTermsType;
import org.openebiz.core.common.cac.PaymentTermsType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.ConsignmentType;

public interface ConsignmentTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		TariffCodeType tariffCode;

		PartyType consigneeParty;

		PartyType exporterParty;

		PartyType consignorParty;

		PartyType importerParty;

		PartyType carrierParty;

		PartyType freightForwarderParty;

		PartyType notifyParty;

		PartyType originalDespatchParty;

		PartyType finalDeliveryParty;

		CountryType originalDepartureCountry;

		CountryType finalDestinationCountry;

		TransportationServiceType originalDespatchTransportationService;

		TransportationServiceType finalDeliveryTransportationService;

		DeliveryTermsType deliveryTerms;

		PaymentTermsType paymentTerms;

		IDType ID;

		int startFrom;

		int maxResults;

		Set<String> ascending;

		Set<String> descending;

		public Long getInternalId() {
			return this.internalId;
		}

		public void setInternalId(Long value) {
			this.internalId = value;
		}

		public Integer getVersion() {
			return this.version;
		}

		public void setVersion(Integer value) {
			this.version = value;
		}

		public TariffCodeType getTariffCode() {
			return this.tariffCode;
		}

		public void setTariffCode(TariffCodeType value) {
			this.tariffCode = value;
		}

		public PartyType getConsigneeParty() {
			return this.consigneeParty;
		}

		public void setConsigneeParty(PartyType value) {
			this.consigneeParty = value;
		}

		public PartyType getExporterParty() {
			return this.exporterParty;
		}

		public void setExporterParty(PartyType value) {
			this.exporterParty = value;
		}

		public PartyType getConsignorParty() {
			return this.consignorParty;
		}

		public void setConsignorParty(PartyType value) {
			this.consignorParty = value;
		}

		public PartyType getImporterParty() {
			return this.importerParty;
		}

		public void setImporterParty(PartyType value) {
			this.importerParty = value;
		}

		public PartyType getCarrierParty() {
			return this.carrierParty;
		}

		public void setCarrierParty(PartyType value) {
			this.carrierParty = value;
		}

		public PartyType getFreightForwarderParty() {
			return this.freightForwarderParty;
		}

		public void setFreightForwarderParty(PartyType value) {
			this.freightForwarderParty = value;
		}

		public PartyType getNotifyParty() {
			return this.notifyParty;
		}

		public void setNotifyParty(PartyType value) {
			this.notifyParty = value;
		}

		public PartyType getOriginalDespatchParty() {
			return this.originalDespatchParty;
		}

		public void setOriginalDespatchParty(PartyType value) {
			this.originalDespatchParty = value;
		}

		public PartyType getFinalDeliveryParty() {
			return this.finalDeliveryParty;
		}

		public void setFinalDeliveryParty(PartyType value) {
			this.finalDeliveryParty = value;
		}

		public CountryType getOriginalDepartureCountry() {
			return this.originalDepartureCountry;
		}

		public void setOriginalDepartureCountry(CountryType value) {
			this.originalDepartureCountry = value;
		}

		public CountryType getFinalDestinationCountry() {
			return this.finalDestinationCountry;
		}

		public void setFinalDestinationCountry(CountryType value) {
			this.finalDestinationCountry = value;
		}

		public TransportationServiceType getOriginalDespatchTransportationService() {
			return this.originalDespatchTransportationService;
		}

		public void setOriginalDespatchTransportationService(
				TransportationServiceType value) {
			this.originalDespatchTransportationService = value;
		}

		public TransportationServiceType getFinalDeliveryTransportationService() {
			return this.finalDeliveryTransportationService;
		}

		public void setFinalDeliveryTransportationService(
				TransportationServiceType value) {
			this.finalDeliveryTransportationService = value;
		}

		public DeliveryTermsType getDeliveryTerms() {
			return this.deliveryTerms;
		}

		public void setDeliveryTerms(DeliveryTermsType value) {
			this.deliveryTerms = value;
		}

		public PaymentTermsType getPaymentTerms() {
			return this.paymentTerms;
		}

		public void setPaymentTerms(PaymentTermsType value) {
			this.paymentTerms = value;
		}

		public IDType getID() {
			return this.ID;
		}

		public void setID(IDType value) {
			this.ID = value;
		}

		public void addAscendingOrder(String propertyName) {
			if (ascending == null)
				ascending = new HashSet<String>();
			ascending.add(propertyName);
			if ((descending != null) && (descending.contains(propertyName)))
				descending.remove(propertyName);
		}

		public void addDescendingOrder(String propertyName) {
			if (descending == null)
				descending = new HashSet<String>();
			descending.add(propertyName);
			if ((ascending != null) && (ascending.contains(propertyName)))
				ascending.remove(propertyName);
		}
	}

	public List getAll();

	public Iterator iterateAll();

	public ConsignmentType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(ConsignmentType value);

	public void update(ConsignmentType value);

	public ConsignmentType merge(ConsignmentType value);

	public void delete(ConsignmentType value);

	public void delete(Long id);
}
