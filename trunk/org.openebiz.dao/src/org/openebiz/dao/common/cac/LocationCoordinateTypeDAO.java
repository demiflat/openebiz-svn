package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.CoordinateSystemCodeType;
import org.openebiz.core.common.cbc.LatitudeDirectionCodeType;
import org.openebiz.core.common.cbc.LongitudeDirectionCodeType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.LocationCoordinateType;

public interface LocationCoordinateTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		CoordinateSystemCodeType coordinateSystemCode;

		LatitudeDirectionCodeType latitudeDirectionCode;

		LongitudeDirectionCodeType longitudeDirectionCode;

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

		public CoordinateSystemCodeType getCoordinateSystemCode() {
			return this.coordinateSystemCode;
		}

		public void setCoordinateSystemCode(CoordinateSystemCodeType value) {
			this.coordinateSystemCode = value;
		}

		public LatitudeDirectionCodeType getLatitudeDirectionCode() {
			return this.latitudeDirectionCode;
		}

		public void setLatitudeDirectionCode(LatitudeDirectionCodeType value) {
			this.latitudeDirectionCode = value;
		}

		public LongitudeDirectionCodeType getLongitudeDirectionCode() {
			return this.longitudeDirectionCode;
		}

		public void setLongitudeDirectionCode(LongitudeDirectionCodeType value) {
			this.longitudeDirectionCode = value;
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

	public LocationCoordinateType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(LocationCoordinateType value);

	public void update(LocationCoordinateType value);

	public LocationCoordinateType merge(LocationCoordinateType value);

	public void delete(LocationCoordinateType value);

	public void delete(Long id);
}
