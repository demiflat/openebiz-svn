package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.LocationTypeCodeType;
import org.openebiz.core.common.cac.AddressType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.LocationType;

public interface LocationTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		LocationTypeCodeType locationTypeCode;

		AddressType address;

		IDType ID;

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

		public LocationTypeCodeType getLocationTypeCode() {
			return this.locationTypeCode;
		}

		public void setLocationTypeCode(LocationTypeCodeType value) {
			this.locationTypeCode = value;
		}

		public AddressType getAddress() {
			return this.address;
		}

		public void setAddress(AddressType value) {
			this.address = value;
		}

		public IDType getID() {
			return this.ID;
		}

		public void setID(IDType value) {
			this.ID = value;
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

	public LocationType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(LocationType value);

	public void update(LocationType value);

	public LocationType merge(LocationType value);

	public void delete(LocationType value);

	public void delete(Long id);
}
