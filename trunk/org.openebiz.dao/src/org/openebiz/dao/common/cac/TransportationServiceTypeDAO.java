package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.ServiceCodeType;
import org.openebiz.core.common.cbc.TariffClassCodeType;
import org.openebiz.core.common.cbc.FreightRateClassCodeType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.TransportationServiceType;

public interface TransportationServiceTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		ServiceCodeType serviceCode;

		TariffClassCodeType tariffClassCode;

		FreightRateClassCodeType freightRateClassCode;

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

		public ServiceCodeType getServiceCode() {
			return this.serviceCode;
		}

		public void setServiceCode(ServiceCodeType value) {
			this.serviceCode = value;
		}

		public TariffClassCodeType getTariffClassCode() {
			return this.tariffClassCode;
		}

		public void setTariffClassCode(TariffClassCodeType value) {
			this.tariffClassCode = value;
		}

		public FreightRateClassCodeType getFreightRateClassCode() {
			return this.freightRateClassCode;
		}

		public void setFreightRateClassCode(FreightRateClassCodeType value) {
			this.freightRateClassCode = value;
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

	public TransportationServiceType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(TransportationServiceType value);

	public void update(TransportationServiceType value);

	public TransportationServiceType merge(TransportationServiceType value);

	public void delete(TransportationServiceType value);

	public void delete(Long id);
}
