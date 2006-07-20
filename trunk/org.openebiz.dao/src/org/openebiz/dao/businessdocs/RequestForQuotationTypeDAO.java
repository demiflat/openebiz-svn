package org.openebiz.dao.businessdocs;

import org.openebiz.core.common.cbc.NoteType;
import org.openebiz.core.common.cbc.TransactionCurrencyCodeType;
import org.openebiz.core.common.cbc.PricingCurrencyCodeType;
import org.openebiz.core.common.cac.DocumentReferenceType;
import org.openebiz.core.common.cac.CustomerPartyType;
import org.openebiz.core.common.cac.SupplierPartyType;
import org.openebiz.core.common.cac.CountryType;
import org.openebiz.core.common.cbc.GUIDType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.businessdocs.RequestForQuotationType;

public interface RequestForQuotationTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		NoteType note;

		TransactionCurrencyCodeType transactionCurrencyCode;

		PricingCurrencyCodeType pricingCurrencyCode;

		DocumentReferenceType catalogueDocumentReference;

		CustomerPartyType originatorCustomerParty;

		SupplierPartyType sellerSupplierParty;

		CountryType destinationCountry;

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

		public TransactionCurrencyCodeType getTransactionCurrencyCode() {
			return this.transactionCurrencyCode;
		}

		public void setTransactionCurrencyCode(TransactionCurrencyCodeType value) {
			this.transactionCurrencyCode = value;
		}

		public PricingCurrencyCodeType getPricingCurrencyCode() {
			return this.pricingCurrencyCode;
		}

		public void setPricingCurrencyCode(PricingCurrencyCodeType value) {
			this.pricingCurrencyCode = value;
		}

		public DocumentReferenceType getCatalogueDocumentReference() {
			return this.catalogueDocumentReference;
		}

		public void setCatalogueDocumentReference(DocumentReferenceType value) {
			this.catalogueDocumentReference = value;
		}

		public CustomerPartyType getOriginatorCustomerParty() {
			return this.originatorCustomerParty;
		}

		public void setOriginatorCustomerParty(CustomerPartyType value) {
			this.originatorCustomerParty = value;
		}

		public SupplierPartyType getSellerSupplierParty() {
			return this.sellerSupplierParty;
		}

		public void setSellerSupplierParty(SupplierPartyType value) {
			this.sellerSupplierParty = value;
		}

		public CountryType getDestinationCountry() {
			return this.destinationCountry;
		}

		public void setDestinationCountry(CountryType value) {
			this.destinationCountry = value;
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

	public RequestForQuotationType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(RequestForQuotationType value);

	public void update(RequestForQuotationType value);

	public RequestForQuotationType merge(RequestForQuotationType value);

	public void delete(RequestForQuotationType value);

	public void delete(Long id);
}
