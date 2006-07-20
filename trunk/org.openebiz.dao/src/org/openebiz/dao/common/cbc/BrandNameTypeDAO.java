
package org.openebiz.dao.common.cbc;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cbc.BrandNameType;

public interface BrandNameTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		String value;

		String languageID;

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

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getLanguageID() {
			return this.languageID;
		}

		public void setLanguageID(String value) {
			this.languageID = value;
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

	public BrandNameType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(BrandNameType value);

	public void update(BrandNameType value);

	public BrandNameType merge(BrandNameType value);

	public void delete(BrandNameType value);

	public void delete(Long id);
}
