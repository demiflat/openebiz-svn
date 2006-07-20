package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.PriorityLevelCodeType;
import org.openebiz.core.common.cbc.HandlingCodeType;
import org.openebiz.core.common.cbc.InformationType;
import org.openebiz.core.common.cac.ConsignmentType;
import org.openebiz.core.common.cac.ContractType;
import org.openebiz.core.common.cac.DeliveryType;
import org.openebiz.core.common.cac.AddressType;
import org.openebiz.core.common.cac.PortType;
import org.openebiz.core.common.cac.CountryType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.ShipmentType;

public interface ShipmentTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		PriorityLevelCodeType priorityLevelCode;

		HandlingCodeType handlingCode;

		InformationType information;

		ConsignmentType consignment;

		ContractType transportContract;

		DeliveryType delivery;

		AddressType originAddress;

		PortType firstArrivalPort;

		PortType lastExitPort;

		CountryType exportCountry;

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

		public PriorityLevelCodeType getPriorityLevelCode() {
			return this.priorityLevelCode;
		}

		public void setPriorityLevelCode(PriorityLevelCodeType value) {
			this.priorityLevelCode = value;
		}

		public HandlingCodeType getHandlingCode() {
			return this.handlingCode;
		}

		public void setHandlingCode(HandlingCodeType value) {
			this.handlingCode = value;
		}

		public InformationType getInformation() {
			return this.information;
		}

		public void setInformation(InformationType value) {
			this.information = value;
		}

		public ConsignmentType getConsignment() {
			return this.consignment;
		}

		public void setConsignment(ConsignmentType value) {
			this.consignment = value;
		}

		public ContractType getTransportContract() {
			return this.transportContract;
		}

		public void setTransportContract(ContractType value) {
			this.transportContract = value;
		}

		public DeliveryType getDelivery() {
			return this.delivery;
		}

		public void setDelivery(DeliveryType value) {
			this.delivery = value;
		}

		public AddressType getOriginAddress() {
			return this.originAddress;
		}

		public void setOriginAddress(AddressType value) {
			this.originAddress = value;
		}

		public PortType getFirstArrivalPort() {
			return this.firstArrivalPort;
		}

		public void setFirstArrivalPort(PortType value) {
			this.firstArrivalPort = value;
		}

		public PortType getLastExitPort() {
			return this.lastExitPort;
		}

		public void setLastExitPort(PortType value) {
			this.lastExitPort = value;
		}

		public CountryType getExportCountry() {
			return this.exportCountry;
		}

		public void setExportCountry(CountryType value) {
			this.exportCountry = value;
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

	public ShipmentType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(ShipmentType value);

	public void update(ShipmentType value);

	public ShipmentType merge(ShipmentType value);

	public void delete(ShipmentType value);

	public void delete(Long id);
}
