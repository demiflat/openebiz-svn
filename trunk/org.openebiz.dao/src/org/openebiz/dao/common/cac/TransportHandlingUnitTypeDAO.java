package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.TransportHandlingUnitTypeCodeType;
import org.openebiz.core.common.cbc.HandlingCodeType;
import org.openebiz.core.common.cac.TemperatureType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.TransportHandlingUnitType;

public interface TransportHandlingUnitTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		TransportHandlingUnitTypeCodeType transportHandlingUnitTypeCode;

		HandlingCodeType handlingCode;

		TemperatureType minimumTemperature;

		TemperatureType maximumTemperature;

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

		public TransportHandlingUnitTypeCodeType getTransportHandlingUnitTypeCode() {
			return this.transportHandlingUnitTypeCode;
		}

		public void setTransportHandlingUnitTypeCode(
				TransportHandlingUnitTypeCodeType value) {
			this.transportHandlingUnitTypeCode = value;
		}

		public HandlingCodeType getHandlingCode() {
			return this.handlingCode;
		}

		public void setHandlingCode(HandlingCodeType value) {
			this.handlingCode = value;
		}

		public TemperatureType getMinimumTemperature() {
			return this.minimumTemperature;
		}

		public void setMinimumTemperature(TemperatureType value) {
			this.minimumTemperature = value;
		}

		public TemperatureType getMaximumTemperature() {
			return this.maximumTemperature;
		}

		public void setMaximumTemperature(TemperatureType value) {
			this.maximumTemperature = value;
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

	public TransportHandlingUnitType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(TransportHandlingUnitType value);

	public void update(TransportHandlingUnitType value);

	public TransportHandlingUnitType merge(TransportHandlingUnitType value);

	public void delete(TransportHandlingUnitType value);

	public void delete(Long id);
}
