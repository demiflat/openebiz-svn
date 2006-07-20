package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.ReferenceIDType;
import org.openebiz.core.common.cbc.ResponseCodeType;
import org.openebiz.core.common.cbc.DescriptionType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.ResponseType;

public interface ResponseTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		ReferenceIDType referenceID;

		ResponseCodeType responseCode;

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

		public ReferenceIDType getReferenceID() {
			return this.referenceID;
		}

		public void setReferenceID(ReferenceIDType value) {
			this.referenceID = value;
		}

		public ResponseCodeType getResponseCode() {
			return this.responseCode;
		}

		public void setResponseCode(ResponseCodeType value) {
			this.responseCode = value;
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

	public ResponseType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(ResponseType value);

	public void update(ResponseType value);

	public ResponseType merge(ResponseType value);

	public void delete(ResponseType value);

	public void delete(Long id);
}
