package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cac.AddressType;
import org.openebiz.core.common.cac.PartyType;
import org.openebiz.core.common.cac.ContactType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.DespatchType;

public interface DespatchTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		AddressType despatchAddress;

		PartyType despatchParty;

		ContactType contact;

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

		public AddressType getDespatchAddress() {
			return this.despatchAddress;
		}

		public void setDespatchAddress(AddressType value) {
			this.despatchAddress = value;
		}

		public PartyType getDespatchParty() {
			return this.despatchParty;
		}

		public void setDespatchParty(PartyType value) {
			this.despatchParty = value;
		}

		public ContactType getContact() {
			return this.contact;
		}

		public void setContact(ContactType value) {
			this.contact = value;
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

	public DespatchType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(DespatchType value);

	public void update(DespatchType value);

	public DespatchType merge(DespatchType value);

	public void delete(DespatchType value);

	public void delete(Long id);
}
