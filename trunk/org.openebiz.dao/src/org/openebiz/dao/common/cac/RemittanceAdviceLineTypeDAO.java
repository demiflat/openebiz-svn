package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.NoteType;
import org.openebiz.core.common.cac.SupplierPartyType;
import org.openebiz.core.common.cac.CustomerPartyType;
import org.openebiz.core.common.cac.PartyType;
import org.openebiz.core.common.cac.ExchangeRateType;
import org.openebiz.core.common.cbc.GUIDType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.RemittanceAdviceLineType;

public interface RemittanceAdviceLineTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		NoteType note;

		SupplierPartyType creditorSupplierParty;

		SupplierPartyType debtorSupplierParty;

		CustomerPartyType buyerCustomerParty;

		SupplierPartyType sellerSupplierParty;

		CustomerPartyType originatorCustomerParty;

		PartyType payeeParty;

		ExchangeRateType exchangeRate;

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

		public NoteType getNote() {
			return this.note;
		}

		public void setNote(NoteType value) {
			this.note = value;
		}

		public SupplierPartyType getCreditorSupplierParty() {
			return this.creditorSupplierParty;
		}

		public void setCreditorSupplierParty(SupplierPartyType value) {
			this.creditorSupplierParty = value;
		}

		public SupplierPartyType getDebtorSupplierParty() {
			return this.debtorSupplierParty;
		}

		public void setDebtorSupplierParty(SupplierPartyType value) {
			this.debtorSupplierParty = value;
		}

		public CustomerPartyType getBuyerCustomerParty() {
			return this.buyerCustomerParty;
		}

		public void setBuyerCustomerParty(CustomerPartyType value) {
			this.buyerCustomerParty = value;
		}

		public SupplierPartyType getSellerSupplierParty() {
			return this.sellerSupplierParty;
		}

		public void setSellerSupplierParty(SupplierPartyType value) {
			this.sellerSupplierParty = value;
		}

		public CustomerPartyType getOriginatorCustomerParty() {
			return this.originatorCustomerParty;
		}

		public void setOriginatorCustomerParty(CustomerPartyType value) {
			this.originatorCustomerParty = value;
		}

		public PartyType getPayeeParty() {
			return this.payeeParty;
		}

		public void setPayeeParty(PartyType value) {
			this.payeeParty = value;
		}

		public ExchangeRateType getExchangeRate() {
			return this.exchangeRate;
		}

		public void setExchangeRate(ExchangeRateType value) {
			this.exchangeRate = value;
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

	public RemittanceAdviceLineType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(RemittanceAdviceLineType value);

	public void update(RemittanceAdviceLineType value);

	public RemittanceAdviceLineType merge(RemittanceAdviceLineType value);

	public void delete(RemittanceAdviceLineType value);

	public void delete(Long id);
}
