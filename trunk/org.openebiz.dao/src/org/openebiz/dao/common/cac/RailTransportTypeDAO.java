package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.TrainIDType;
import org.openebiz.core.common.cbc.RailCarIDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.RailTransportType;

public interface RailTransportTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		TrainIDType trainID;

		RailCarIDType railCarID;

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

		public TrainIDType getTrainID() {
			return this.trainID;
		}

		public void setTrainID(TrainIDType value) {
			this.trainID = value;
		}

		public RailCarIDType getRailCarID() {
			return this.railCarID;
		}

		public void setRailCarID(RailCarIDType value) {
			this.railCarID = value;
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

	public RailTransportType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(RailTransportType value);

	public void update(RailTransportType value);

	public RailTransportType merge(RailTransportType value);

	public void delete(RailTransportType value);

	public void delete(Long id);
}
