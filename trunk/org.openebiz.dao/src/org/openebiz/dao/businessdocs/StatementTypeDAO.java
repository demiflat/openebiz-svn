package org.openebiz.dao.businessdocs;

import org.openebiz.core.common.cbc.NoteType;
import org.openebiz.core.common.cbc.DocumentCurrencyCodeType;
import org.openebiz.core.common.cac.PeriodType;
import org.openebiz.core.common.cac.SupplierPartyType;
import org.openebiz.core.common.cac.CustomerPartyType;
import org.openebiz.core.common.cac.PartyType;
import org.openebiz.core.common.cac.PaymentMeansType;
import org.openebiz.core.common.cbc.GUIDType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.businessdocs.StatementType;

public interface StatementTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		NoteType note;

		DocumentCurrencyCodeType documentCurrencyCode;

		PeriodType statementPeriod;

		SupplierPartyType creditorSupplierParty;

		CustomerPartyType debtorCustomerParty;

		CustomerPartyType buyerCustomerParty;

		SupplierPartyType sellerSupplierParty;

		CustomerPartyType originatorCustomerParty;

		PartyType payeeParty;

		PaymentMeansType paymentMeans;

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

		public DocumentCurrencyCodeType getDocumentCurrencyCode() {
			return this.documentCurrencyCode;
		}

		public void setDocumentCurrencyCode(DocumentCurrencyCodeType value) {
			this.documentCurrencyCode = value;
		}

		public PeriodType getStatementPeriod() {
			return this.statementPeriod;
		}

		public void setStatementPeriod(PeriodType value) {
			this.statementPeriod = value;
		}

		public SupplierPartyType getCreditorSupplierParty() {
			return this.creditorSupplierParty;
		}

		public void setCreditorSupplierParty(SupplierPartyType value) {
			this.creditorSupplierParty = value;
		}

		public CustomerPartyType getDebtorCustomerParty() {
			return this.debtorCustomerParty;
		}

		public void setDebtorCustomerParty(CustomerPartyType value) {
			this.debtorCustomerParty = value;
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

		public PaymentMeansType getPaymentMeans() {
			return this.paymentMeans;
		}

		public void setPaymentMeans(PaymentMeansType value) {
			this.paymentMeans = value;
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

	public StatementType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(StatementType value);

	public void update(StatementType value);

	public StatementType merge(StatementType value);

	public void delete(StatementType value);

	public void delete(Long id);
}
