package org.openebiz.dao.common.constants;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.unit.UnitCodeContentType;

public interface UnitCodeContentTypeDAO {

	public static class SearchCriteria {
		Long internalId;
		Integer version;
		String literal;
		String name;
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
		public String getLiteral() {
			return this.literal;
		}
		public void setLiteral(String value) {
			this.literal = value;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String value) {
			this.name = value;
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
	public UnitCodeContentType getById(Long id);
	public List findByCriteria(SearchCriteria criteria);
//	public void insert(UnitCodeContentType value);
//	public void update(UnitCodeContentType value);
//	public UnitCodeContentType merge(UnitCodeContentType value);
//	public void delete(UnitCodeContentType value);
//	public void delete(Long id);
}
