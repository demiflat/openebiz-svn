package org.openebiz.dao.common.cac;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.ItemComparisonType;

public interface ItemComparisonTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

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

	public ItemComparisonType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(ItemComparisonType value);

	public void update(ItemComparisonType value);

	public ItemComparisonType merge(ItemComparisonType value);

	public void delete(ItemComparisonType value);

	public void delete(Long id);
}
