package org.openebiz.dao.businessdocs;

import org.openebiz.core.common.cbc.DescriptionType;
import org.openebiz.core.common.cbc.NoteType;
import org.openebiz.core.common.cbc.VersionIDType;
import org.openebiz.core.common.cac.PartyType;
import org.openebiz.core.common.cac.ShipmentType;
import org.openebiz.core.common.cbc.GUIDType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.businessdocs.PackingListType;

public interface PackingListTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		DescriptionType description;

		NoteType note;

		VersionIDType versionID;

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

		public DescriptionType getDescription() {
			return this.description;
		}

		public void setDescription(DescriptionType value) {
			this.description = value;
		}

		public NoteType getNote() {
			return this.note;
		}

		public void setNote(NoteType value) {
			this.note = value;
		}

		public VersionIDType getVersionID() {
			return this.versionID;
		}

		public void setVersionID(VersionIDType value) {
			this.versionID = value;
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

	public PackingListType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(PackingListType value);

	public void update(PackingListType value);

	public PackingListType merge(PackingListType value);

	public void delete(PackingListType value);

	public void delete(Long id);
}
