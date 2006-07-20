package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cac.LineReferenceType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.LineResponseType;

public interface LineResponseTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		LineReferenceType lineReference;

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

		public LineReferenceType getLineReference() {
			return this.lineReference;
		}

		public void setLineReference(LineReferenceType value) {
			this.lineReference = value;
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

	public LineResponseType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(LineResponseType value);

	public void update(LineResponseType value);

	public LineResponseType merge(LineResponseType value);

	public void delete(LineResponseType value);

	public void delete(Long id);
}
