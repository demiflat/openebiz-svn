package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cac.BasePriceType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.ItemLocationQuantityType;

public interface ItemLocationQuantityTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		BasePriceType basePrice;

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

		public BasePriceType getBasePrice() {
			return this.basePrice;
		}

		public void setBasePrice(BasePriceType value) {
			this.basePrice = value;
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

	public ItemLocationQuantityType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(ItemLocationQuantityType value);

	public void update(ItemLocationQuantityType value);

	public ItemLocationQuantityType merge(ItemLocationQuantityType value);

	public void delete(ItemLocationQuantityType value);

	public void delete(Long id);
}
