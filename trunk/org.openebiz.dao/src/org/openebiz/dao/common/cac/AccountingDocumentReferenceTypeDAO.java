package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.DocumentCurrencyCodeType;
import org.openebiz.core.common.cbc.TaxCurrencyCodeType;
import org.openebiz.core.common.cac.PaymentMeansType;
import org.openebiz.core.common.cac.AccountingDocumentReferenceLineType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.AccountingDocumentReferenceType;

public interface AccountingDocumentReferenceTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		DocumentCurrencyCodeType documentCurrencyCode;

		TaxCurrencyCodeType taxCurrencyCode;

		PaymentMeansType paymentMeans;

		AccountingDocumentReferenceLineType accountingDocumentReferenceLine;

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

		public PaymentMeansType getPaymentMeans() {
			return this.paymentMeans;
		}

		public void setPaymentMeans(PaymentMeansType value) {
			this.paymentMeans = value;
		}

		public AccountingDocumentReferenceLineType getAccountingDocumentReferenceLine() {
			return this.accountingDocumentReferenceLine;
		}

		public void setAccountingDocumentReferenceLine(
				AccountingDocumentReferenceLineType value) {
			this.accountingDocumentReferenceLine = value;
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

	public AccountingDocumentReferenceType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(AccountingDocumentReferenceType value);

	public void update(AccountingDocumentReferenceType value);

	public AccountingDocumentReferenceType merge(
			AccountingDocumentReferenceType value);

	public void delete(AccountingDocumentReferenceType value);

	public void delete(Long id);
}
