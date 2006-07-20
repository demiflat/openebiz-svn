package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.CountrySubentityCodeType;
import org.openebiz.core.common.cac.CountryType;
import org.openebiz.core.common.cac.LocationCoordinateType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.AddressType;

public interface AddressTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		CountrySubentityCodeType countrySubentityCode;

		CountryType country;

		LocationCoordinateType locationCoordinate;

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

		public CountrySubentityCodeType getCountrySubentityCode() {
			return this.countrySubentityCode;
		}

		public void setCountrySubentityCode(CountrySubentityCodeType value) {
			this.countrySubentityCode = value;
		}

		public CountryType getCountry() {
			return this.country;
		}

		public void setCountry(CountryType value) {
			this.country = value;
		}

		public LocationCoordinateType getLocationCoordinate() {
			return this.locationCoordinate;
		}

		public void setLocationCoordinate(LocationCoordinateType value) {
			this.locationCoordinate = value;
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

	public AddressType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(AddressType value);

	public void update(AddressType value);

	public AddressType merge(AddressType value);

	public void delete(AddressType value);

	public void delete(Long id);
}
