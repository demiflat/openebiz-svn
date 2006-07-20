package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cac.LocationType;
import org.openebiz.core.common.cac.CountryType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.PortType;

public interface PortTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		LocationType location;

		CountryType country;

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

		public LocationType getLocation() {
			return this.location;
		}

		public void setLocation(LocationType value) {
			this.location = value;
		}

		public CountryType getCountry() {
			return this.country;
		}

		public void setCountry(CountryType value) {
			this.country = value;
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

	public PortType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(PortType value);

	public void update(PortType value);

	public PortType merge(PortType value);

	public void delete(PortType value);

	public void delete(Long id);
}
