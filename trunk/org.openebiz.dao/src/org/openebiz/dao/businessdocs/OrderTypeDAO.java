package org.openebiz.dao.businessdocs;

import org.openebiz.core.common.cbc.SalesOrderIDType;
import org.openebiz.core.common.cbc.NoteType;
import org.openebiz.core.common.cbc.RequestedInvoiceCurrencyCodeType;
import org.openebiz.core.common.cbc.DocumentCurrencyCodeType;
import org.openebiz.core.common.cbc.PricingCurrencyCodeType;
import org.openebiz.core.common.cbc.TaxCurrencyCodeType;
import org.openebiz.core.common.cbc.AccountingCostCodeType;
import org.openebiz.core.common.cac.DocumentReferenceType;
import org.openebiz.core.common.cac.CustomerPartyType;
import org.openebiz.core.common.cac.SupplierPartyType;
import org.openebiz.core.common.cac.PartyType;
import org.openebiz.core.common.cac.DeliveryTermsType;
import org.openebiz.core.common.cac.PaymentMeansType;
import org.openebiz.core.common.cac.TransactionConditionsType;
import org.openebiz.core.common.cac.CountryType;
import org.openebiz.core.common.cac.LegalTotalType;
import org.openebiz.core.common.cbc.GUIDType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.businessdocs.OrderType;

public interface OrderTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		SalesOrderIDType salesOrderID;

		NoteType note;

		RequestedInvoiceCurrencyCodeType requestedInvoiceCurrencyCode;

		DocumentCurrencyCodeType documentCurrencyCode;

		PricingCurrencyCodeType pricingCurrencyCode;

		TaxCurrencyCodeType taxCurrencyCode;

		AccountingCostCodeType accountingCostCode;

		DocumentReferenceType quotationDocumentReference;

		DocumentReferenceType originatorDocumentReference;

		CustomerPartyType buyerCustomerParty;

		SupplierPartyType sellerSupplierParty;

		CustomerPartyType originatorCustomerParty;

		PartyType freightForwarderParty;

		DeliveryTermsType deliveryTerms;

		PaymentMeansType paymentMeans;

		TransactionConditionsType transactionConditions;

		CountryType destinationCountry;

		LegalTotalType legalTotal;

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

		public SalesOrderIDType getSalesOrderID() {
			return this.salesOrderID;
		}

		public void setSalesOrderID(SalesOrderIDType value) {
			this.salesOrderID = value;
		}

		public NoteType getNote() {
			return this.note;
		}

		public void setNote(NoteType value) {
			this.note = value;
		}

		public RequestedInvoiceCurrencyCodeType getRequestedInvoiceCurrencyCode() {
			return this.requestedInvoiceCurrencyCode;
		}

		public void setRequestedInvoiceCurrencyCode(
				RequestedInvoiceCurrencyCodeType value) {
			this.requestedInvoiceCurrencyCode = value;
		}

		public DocumentCurrencyCodeType getDocumentCurrencyCode() {
			return this.documentCurrencyCode;
		}

		public void setDocumentCurrencyCode(DocumentCurrencyCodeType value) {
			this.documentCurrencyCode = value;
		}

		public PricingCurrencyCodeType getPricingCurrencyCode() {
			return this.pricingCurrencyCode;
		}

		public void setPricingCurrencyCode(PricingCurrencyCodeType value) {
			this.pricingCurrencyCode = value;
		}

		public TaxCurrencyCodeType getTaxCurrencyCode() {
			return this.taxCurrencyCode;
		}

		public void setTaxCurrencyCode(TaxCurrencyCodeType value) {
			this.taxCurrencyCode = value;
		}

		public AccountingCostCodeType getAccountingCostCode() {
			return this.accountingCostCode;
		}

		public void setAccountingCostCode(AccountingCostCodeType value) {
			this.accountingCostCode = value;
		}

		public DocumentReferenceType getQuotationDocumentReference() {
			return this.quotationDocumentReference;
		}

		public void setQuotationDocumentReference(DocumentReferenceType value) {
			this.quotationDocumentReference = value;
		}

		public DocumentReferenceType getOriginatorDocumentReference() {
			return this.originatorDocumentReference;
		}

		public void setOriginatorDocumentReference(DocumentReferenceType value) {
			this.originatorDocumentReference = value;
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

		public PartyType getFreightForwarderParty() {
			return this.freightForwarderParty;
		}

		public void setFreightForwarderParty(PartyType value) {
			this.freightForwarderParty = value;
		}

		public DeliveryTermsType getDeliveryTerms() {
			return this.deliveryTerms;
		}

		public void setDeliveryTerms(DeliveryTermsType value) {
			this.deliveryTerms = value;
		}

		public PaymentMeansType getPaymentMeans() {
			return this.paymentMeans;
		}

		public void setPaymentMeans(PaymentMeansType value) {
			this.paymentMeans = value;
		}

		public TransactionConditionsType getTransactionConditions() {
			return this.transactionConditions;
		}

		public void setTransactionConditions(TransactionConditionsType value) {
			this.transactionConditions = value;
		}

		public CountryType getDestinationCountry() {
			return this.destinationCountry;
		}

		public void setDestinationCountry(CountryType value) {
			this.destinationCountry = value;
		}

		public LegalTotalType getLegalTotal() {
			return this.legalTotal;
		}

		public void setLegalTotal(LegalTotalType value) {
			this.legalTotal = value;
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

	public OrderType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(OrderType value);

	public void update(OrderType value);

	public OrderType merge(OrderType value);

	public void delete(OrderType value);

	public void delete(Long id);
}
