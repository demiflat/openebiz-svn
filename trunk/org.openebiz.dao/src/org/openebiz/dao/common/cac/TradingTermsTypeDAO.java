package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cac.AddressType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.TradingTermsType;

public interface TradingTermsTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		AddressType applicableAddress;

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

		public AddressType getApplicableAddress() {
			return this.applicableAddress;
		}

		public void setApplicableAddress(AddressType value) {
			this.applicableAddress = value;
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

	public TradingTermsType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(TradingTermsType value);

	public void update(TradingTermsType value);

	public TradingTermsType merge(TradingTermsType value);

	public void delete(TradingTermsType value);

	public void delete(Long id);
}
