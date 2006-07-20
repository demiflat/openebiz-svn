package org.openebiz.dao.businessdocs;

import org.openebiz.core.common.cbc.InvoiceTypeCodeType;
import org.openebiz.core.common.cbc.NoteType;
import org.openebiz.core.common.cbc.TransactionCurrencyCodeType;
import org.openebiz.core.common.cbc.DocumentCurrencyCodeType;
import org.openebiz.core.common.cbc.TaxCurrencyCodeType;
import org.openebiz.core.common.cbc.PricingCurrencyCodeType;
import org.openebiz.core.common.cbc.AccountingCostCodeType;
import org.openebiz.core.common.cac.CustomerPartyType;
import org.openebiz.core.common.cac.SupplierPartyType;
import org.openebiz.core.common.cac.PartyType;
import org.openebiz.core.common.cac.PaymentMeansType;
import org.openebiz.core.common.cac.ExchangeRateType;
import org.openebiz.core.common.cac.LegalTotalType;
import org.openebiz.core.common.cbc.GUIDType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.businessdocs.SelfBilledInvoiceType;

public interface SelfBilledInvoiceTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		InvoiceTypeCodeType invoiceTypeCode;

		NoteType note;

		TransactionCurrencyCodeType transactionCurrencyCode;

		DocumentCurrencyCodeType documentCurrencyCode;

		TaxCurrencyCodeType taxCurrencyCode;

		PricingCurrencyCodeType pricingCurrencyCode;

		AccountingCostCodeType accountingCostCode;

		CustomerPartyType debtorCustomerParty;

		SupplierPartyType creditorSupplierParty;

		CustomerPartyType buyerCustomerParty;

		SupplierPartyType sellerSupplierParty;

		PartyType payeeParty;

		PaymentMeansType paymentMeans;

		ExchangeRateType exchangeRate;

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

		public InvoiceTypeCodeType getInvoiceTypeCode() {
			return this.invoiceTypeCode;
		}

		public void setInvoiceTypeCode(InvoiceTypeCodeType value) {
			this.invoiceTypeCode = value;
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

		public DocumentCurrencyCodeType getDocumentCurrencyCode() {
			return this.documentCurrencyCode;
		}

		public void setDocumentCurrencyCode(DocumentCurrencyCodeType value) {
			this.documentCurrencyCode = value;
		}

		public TaxCurrencyCodeType getTaxCurrencyCode() {
			return this.taxCurrencyCode;
		}

		public void setTaxCurrencyCode(TaxCurrencyCodeType value) {
			this.taxCurrencyCode = value;
		}

		public PricingCurrencyCodeType getPricingCurrencyCode() {
			return this.pricingCurrencyCode;
		}

		public void setPricingCurrencyCode(PricingCurrencyCodeType value) {
			this.pricingCurrencyCode = value;
		}

		public AccountingCostCodeType getAccountingCostCode() {
			return this.accountingCostCode;
		}

		public void setAccountingCostCode(AccountingCostCodeType value) {
			this.accountingCostCode = value;
		}

		public CustomerPartyType getDebtorCustomerParty() {
			return this.debtorCustomerParty;
		}

		public void setDebtorCustomerParty(CustomerPartyType value) {
			this.debtorCustomerParty = value;
		}

		public SupplierPartyType getCreditorSupplierParty() {
			return this.creditorSupplierParty;
		}

		public void setCreditorSupplierParty(SupplierPartyType value) {
			this.creditorSupplierParty = value;
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

		public ExchangeRateType getExchangeRate() {
			return this.exchangeRate;
		}

		public void setExchangeRate(ExchangeRateType value) {
			this.exchangeRate = value;
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

	public SelfBilledInvoiceType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(SelfBilledInvoiceType value);

	public void update(SelfBilledInvoiceType value);

	public SelfBilledInvoiceType merge(SelfBilledInvoiceType value);

	public void delete(SelfBilledInvoiceType value);

	public void delete(Long id);
}
