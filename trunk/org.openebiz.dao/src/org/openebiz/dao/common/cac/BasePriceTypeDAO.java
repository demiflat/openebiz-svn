package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cac.PriceListType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.BasePriceType;

public interface BasePriceTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		PriceListType priceList;

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

		public PriceListType getPriceList() {
			return this.priceList;
		}

		public void setPriceList(PriceListType value) {
			this.priceList = value;
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

	public BasePriceType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(BasePriceType value);

	public void update(BasePriceType value);

	public BasePriceType merge(BasePriceType value);

	public void delete(BasePriceType value);

	public void delete(Long id);
}
