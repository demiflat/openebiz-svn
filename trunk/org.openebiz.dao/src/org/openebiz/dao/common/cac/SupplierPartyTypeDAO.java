package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.CustomerAssignedAccountIDType;
import org.openebiz.core.common.cbc.SupplierAssignedAccountIDType;
import org.openebiz.core.common.cac.PartyType;
import org.openebiz.core.common.cac.ContactType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.SupplierPartyType;

public interface SupplierPartyTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		CustomerAssignedAccountIDType customerAssignedAccountID;

		SupplierAssignedAccountIDType supplierAssignedAccountID;

		PartyType party;

		ContactType shippingContact;

		ContactType accountsContact;

		ContactType orderContact;

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

		public CustomerAssignedAccountIDType getCustomerAssignedAccountID() {
			return this.customerAssignedAccountID;
		}

		public void setCustomerAssignedAccountID(
				CustomerAssignedAccountIDType value) {
			this.customerAssignedAccountID = value;
		}

		public SupplierAssignedAccountIDType getSupplierAssignedAccountID() {
			return this.supplierAssignedAccountID;
		}

		public void setSupplierAssignedAccountID(
				SupplierAssignedAccountIDType value) {
			this.supplierAssignedAccountID = value;
		}

		public PartyType getParty() {
			return this.party;
		}

		public void setParty(PartyType value) {
			this.party = value;
		}

		public ContactType getShippingContact() {
			return this.shippingContact;
		}

		public void setShippingContact(ContactType value) {
			this.shippingContact = value;
		}

		public ContactType getAccountsContact() {
			return this.accountsContact;
		}

		public void setAccountsContact(ContactType value) {
			this.accountsContact = value;
		}

		public ContactType getOrderContact() {
			return this.orderContact;
		}

		public void setOrderContact(ContactType value) {
			this.orderContact = value;
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

	public SupplierPartyType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(SupplierPartyType value);

	public void update(SupplierPartyType value);

	public SupplierPartyType merge(SupplierPartyType value);

	public void delete(SupplierPartyType value);

	public void delete(Long id);
}
