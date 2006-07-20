package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.DescriptionType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.ClassificationCategoryType;

public interface ClassificationCategoryTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		DescriptionType description;

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

		public DescriptionType getDescription() {
			return this.description;
		}

		public void setDescription(DescriptionType value) {
			this.description = value;
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

	public ClassificationCategoryType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(ClassificationCategoryType value);

	public void update(ClassificationCategoryType value);

	public ClassificationCategoryType merge(ClassificationCategoryType value);

	public void delete(ClassificationCategoryType value);

	public void delete(Long id);
}
