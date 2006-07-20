package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.AttributeIDType;
import org.openebiz.core.common.cbc.DescriptionType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.DimensionType;

public interface DimensionTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		AttributeIDType attributeID;

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

		public AttributeIDType getAttributeID() {
			return this.attributeID;
		}

		public void setAttributeID(AttributeIDType value) {
			this.attributeID = value;
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

	public DimensionType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(DimensionType value);

	public void update(DimensionType value);

	public DimensionType merge(DimensionType value);

	public void delete(DimensionType value);

	public void delete(Long id);
}
