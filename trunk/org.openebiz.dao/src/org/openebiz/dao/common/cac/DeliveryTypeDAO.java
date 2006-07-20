package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cac.AddressType;
import org.openebiz.core.common.cac.ContactType;
import org.openebiz.core.common.cac.PartyType;
import org.openebiz.core.common.cac.DespatchType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.DeliveryType;

public interface DeliveryTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		AddressType deliveryAddress;

		ContactType contact;

		PartyType originatorParty;

		DespatchType despatch;

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

		public AddressType getDeliveryAddress() {
			return this.deliveryAddress;
		}

		public void setDeliveryAddress(AddressType value) {
			this.deliveryAddress = value;
		}

		public ContactType getContact() {
			return this.contact;
		}

		public void setContact(ContactType value) {
			this.contact = value;
		}

		public PartyType getOriginatorParty() {
			return this.originatorParty;
		}

		public void setOriginatorParty(PartyType value) {
			this.originatorParty = value;
		}

		public DespatchType getDespatch() {
			return this.despatch;
		}

		public void setDespatch(DespatchType value) {
			this.despatch = value;
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

	public DeliveryType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(DeliveryType value);

	public void update(DeliveryType value);

	public DeliveryType merge(DeliveryType value);

	public void delete(DeliveryType value);

	public void delete(Long id);
}
