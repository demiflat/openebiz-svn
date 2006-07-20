package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.TransportEmergencyCardCodeType;
import org.openebiz.core.common.cbc.PackingCriteriaCodeType;
import org.openebiz.core.common.cbc.RegulationCodeType;
import org.openebiz.core.common.cbc.InhalationToxicityZoneCodeType;
import org.openebiz.core.common.cbc.TransportAuthorizationCodeType;
import org.openebiz.core.common.cac.TemperatureType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.HazardousGoodsTransitType;

public interface HazardousGoodsTransitTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		TransportEmergencyCardCodeType transportEmergencyCardCode;

		PackingCriteriaCodeType packingCriteriaCode;

		RegulationCodeType regulationCode;

		InhalationToxicityZoneCodeType inhalationToxicityZoneCode;

		TransportAuthorizationCodeType transportAuthorizationCode;

		TemperatureType maximumTemperature;

		TemperatureType minimumTemperature;

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

		public TransportEmergencyCardCodeType getTransportEmergencyCardCode() {
			return this.transportEmergencyCardCode;
		}

		public void setTransportEmergencyCardCode(
				TransportEmergencyCardCodeType value) {
			this.transportEmergencyCardCode = value;
		}

		public PackingCriteriaCodeType getPackingCriteriaCode() {
			return this.packingCriteriaCode;
		}

		public void setPackingCriteriaCode(PackingCriteriaCodeType value) {
			this.packingCriteriaCode = value;
		}

		public RegulationCodeType getRegulationCode() {
			return this.regulationCode;
		}

		public void setRegulationCode(RegulationCodeType value) {
			this.regulationCode = value;
		}

		public InhalationToxicityZoneCodeType getInhalationToxicityZoneCode() {
			return this.inhalationToxicityZoneCode;
		}

		public void setInhalationToxicityZoneCode(
				InhalationToxicityZoneCodeType value) {
			this.inhalationToxicityZoneCode = value;
		}

		public TransportAuthorizationCodeType getTransportAuthorizationCode() {
			return this.transportAuthorizationCode;
		}

		public void setTransportAuthorizationCode(
				TransportAuthorizationCodeType value) {
			this.transportAuthorizationCode = value;
		}

		public TemperatureType getMaximumTemperature() {
			return this.maximumTemperature;
		}

		public void setMaximumTemperature(TemperatureType value) {
			this.maximumTemperature = value;
		}

		public TemperatureType getMinimumTemperature() {
			return this.minimumTemperature;
		}

		public void setMinimumTemperature(TemperatureType value) {
			this.minimumTemperature = value;
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

	public HazardousGoodsTransitType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(HazardousGoodsTransitType value);

	public void update(HazardousGoodsTransitType value);

	public HazardousGoodsTransitType merge(HazardousGoodsTransitType value);

	public void delete(HazardousGoodsTransitType value);

	public void delete(Long id);
}
