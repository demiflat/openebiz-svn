package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.SourceCurrencyCodeType;
import org.openebiz.core.common.cbc.TargetCurrencyCodeType;
import org.openebiz.core.common.cbc.ExchangeMarketIDType;
import org.openebiz.core.common.cbc.OperatorCodeType;
import org.openebiz.core.common.cac.ContractType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.ExchangeRateType;

public interface ExchangeRateTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		SourceCurrencyCodeType sourceCurrencyCode;

		TargetCurrencyCodeType targetCurrencyCode;

		ExchangeMarketIDType exchangeMarketID;

		OperatorCodeType operatorCode;

		ContractType foreignExchangeContract;

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

		public SourceCurrencyCodeType getSourceCurrencyCode() {
			return this.sourceCurrencyCode;
		}

		public void setSourceCurrencyCode(SourceCurrencyCodeType value) {
			this.sourceCurrencyCode = value;
		}

		public TargetCurrencyCodeType getTargetCurrencyCode() {
			return this.targetCurrencyCode;
		}

		public void setTargetCurrencyCode(TargetCurrencyCodeType value) {
			this.targetCurrencyCode = value;
		}

		public ExchangeMarketIDType getExchangeMarketID() {
			return this.exchangeMarketID;
		}

		public void setExchangeMarketID(ExchangeMarketIDType value) {
			this.exchangeMarketID = value;
		}

		public OperatorCodeType getOperatorCode() {
			return this.operatorCode;
		}

		public void setOperatorCode(OperatorCodeType value) {
			this.operatorCode = value;
		}

		public ContractType getForeignExchangeContract() {
			return this.foreignExchangeContract;
		}

		public void setForeignExchangeContract(ContractType value) {
			this.foreignExchangeContract = value;
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

	public ExchangeRateType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(ExchangeRateType value);

	public void update(ExchangeRateType value);

	public ExchangeRateType merge(ExchangeRateType value);

	public void delete(ExchangeRateType value);

	public void delete(Long id);
}
