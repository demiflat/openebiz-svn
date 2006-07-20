package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.TransportModeCodeType;
import org.openebiz.core.common.cbc.TransportMeansTypeCodeType;
import org.openebiz.core.common.cbc.TransitDirectionCodeType;
import org.openebiz.core.common.cac.PeriodType;
import org.openebiz.core.common.cac.TransportMeansType;
import org.openebiz.core.common.cac.PortType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.ShipmentStageType;

public interface ShipmentStageTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		TransportModeCodeType transportModeCode;

		TransportMeansTypeCodeType transportMeansTypeCode;

		TransitDirectionCodeType transitDirectionCode;

		PeriodType transitPeriod;

		TransportMeansType transportMeans;

		PortType loadingPort;

		PortType unloadingPort;

		PortType transshipPort;

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

		public TransportModeCodeType getTransportModeCode() {
			return this.transportModeCode;
		}

		public void setTransportModeCode(TransportModeCodeType value) {
			this.transportModeCode = value;
		}

		public TransportMeansTypeCodeType getTransportMeansTypeCode() {
			return this.transportMeansTypeCode;
		}

		public void setTransportMeansTypeCode(TransportMeansTypeCodeType value) {
			this.transportMeansTypeCode = value;
		}

		public TransitDirectionCodeType getTransitDirectionCode() {
			return this.transitDirectionCode;
		}

		public void setTransitDirectionCode(TransitDirectionCodeType value) {
			this.transitDirectionCode = value;
		}

		public PeriodType getTransitPeriod() {
			return this.transitPeriod;
		}

		public void setTransitPeriod(PeriodType value) {
			this.transitPeriod = value;
		}

		public TransportMeansType getTransportMeans() {
			return this.transportMeans;
		}

		public void setTransportMeans(TransportMeansType value) {
			this.transportMeans = value;
		}

		public PortType getLoadingPort() {
			return this.loadingPort;
		}

		public void setLoadingPort(PortType value) {
			this.loadingPort = value;
		}

		public PortType getUnloadingPort() {
			return this.unloadingPort;
		}

		public void setUnloadingPort(PortType value) {
			this.unloadingPort = value;
		}

		public PortType getTransshipPort() {
			return this.transshipPort;
		}

		public void setTransshipPort(PortType value) {
			this.transshipPort = value;
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

	public ShipmentStageType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(ShipmentStageType value);

	public void update(ShipmentStageType value);

	public ShipmentStageType merge(ShipmentStageType value);

	public void delete(ShipmentStageType value);

	public void delete(Long id);
}
