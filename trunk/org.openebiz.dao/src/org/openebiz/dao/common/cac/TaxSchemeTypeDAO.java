package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.TaxTypeCodeType;
import org.openebiz.core.common.cbc.CurrencyCodeType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.TaxSchemeType;

public interface TaxSchemeTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		TaxTypeCodeType taxTypeCode;

		CurrencyCodeType currencyCode;

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

		public TaxTypeCodeType getTaxTypeCode() {
			return this.taxTypeCode;
		}

		public void setTaxTypeCode(TaxTypeCodeType value) {
			this.taxTypeCode = value;
		}

		public CurrencyCodeType getCurrencyCode() {
			return this.currencyCode;
		}

		public void setCurrencyCode(CurrencyCodeType value) {
			this.currencyCode = value;
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

	public TaxSchemeType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(TaxSchemeType value);

	public void update(TaxSchemeType value);

	public TaxSchemeType merge(TaxSchemeType value);

	public void delete(TaxSchemeType value);

	public void delete(Long id);
}
