package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.AircraftIDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.AirTransportType;

public interface AirTransportTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		AircraftIDType aircraftID;

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

		public AircraftIDType getAircraftID() {
			return this.aircraftID;
		}

		public void setAircraftID(AircraftIDType value) {
			this.aircraftID = value;
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

	public AirTransportType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(AirTransportType value);

	public void update(AirTransportType value);

	public AirTransportType merge(AirTransportType value);

	public void delete(AirTransportType value);

	public void delete(Long id);
}
