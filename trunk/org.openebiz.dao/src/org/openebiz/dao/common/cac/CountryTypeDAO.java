package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.IdentificationCodeType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.CountryType;

public interface CountryTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		IdentificationCodeType identificationCode;

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

		public IdentificationCodeType getIdentificationCode() {
			return this.identificationCode;
		}

		public void setIdentificationCode(IdentificationCodeType value) {
			this.identificationCode = value;
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

	public CountryType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(CountryType value);

	public void update(CountryType value);

	public CountryType merge(CountryType value);

	public void delete(CountryType value);

	public void delete(Long id);
}
