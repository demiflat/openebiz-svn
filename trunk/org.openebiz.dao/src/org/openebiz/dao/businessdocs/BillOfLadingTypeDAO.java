package org.openebiz.dao.businessdocs;

import org.openebiz.core.common.cbc.CarrierAssignedIDType;
import org.openebiz.core.common.cbc.StatusCodeType;
import org.openebiz.core.common.cbc.ShippingOrderIDType;
import org.openebiz.core.common.cac.PartyType;
import org.openebiz.core.common.cac.ShipmentType;
import org.openebiz.core.common.cbc.GUIDType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.businessdocs.BillOfLadingType;

public interface BillOfLadingTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		CarrierAssignedIDType carrierAssignedID;

		StatusCodeType statusCode;

		ShippingOrderIDType shippingOrderID;

		PartyType consignorParty;

		PartyType carrierParty;

		PartyType freightForwarderParty;

		ShipmentType shipment;

		GUIDType GUID;

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

		public CarrierAssignedIDType getCarrierAssignedID() {
			return this.carrierAssignedID;
		}

		public void setCarrierAssignedID(CarrierAssignedIDType value) {
			this.carrierAssignedID = value;
		}

		public StatusCodeType getStatusCode() {
			return this.statusCode;
		}

		public void setStatusCode(StatusCodeType value) {
			this.statusCode = value;
		}

		public ShippingOrderIDType getShippingOrderID() {
			return this.shippingOrderID;
		}

		public void setShippingOrderID(ShippingOrderIDType value) {
			this.shippingOrderID = value;
		}

		public PartyType getConsignorParty() {
			return this.consignorParty;
		}

		public void setConsignorParty(PartyType value) {
			this.consignorParty = value;
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

		public ShipmentType getShipment() {
			return this.shipment;
		}

		public void setShipment(ShipmentType value) {
			this.shipment = value;
		}

		public GUIDType getGUID() {
			return this.GUID;
		}

		public void setGUID(GUIDType value) {
			this.GUID = value;
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

	public BillOfLadingType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(BillOfLadingType value);

	public void update(BillOfLadingType value);

	public BillOfLadingType merge(BillOfLadingType value);

	public void delete(BillOfLadingType value);

	public void delete(Long id);
}
