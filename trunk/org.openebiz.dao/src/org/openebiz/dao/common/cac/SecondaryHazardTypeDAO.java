package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.EmergencyProceduresCodeType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.SecondaryHazardType;

public interface SecondaryHazardTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		EmergencyProceduresCodeType emergencyProceduresCode;

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

		public EmergencyProceduresCodeType getEmergencyProceduresCode() {
			return this.emergencyProceduresCode;
		}

		public void setEmergencyProceduresCode(EmergencyProceduresCodeType value) {
			this.emergencyProceduresCode = value;
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

	public SecondaryHazardType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(SecondaryHazardType value);

	public void update(SecondaryHazardType value);

	public SecondaryHazardType merge(SecondaryHazardType value);

	public void delete(SecondaryHazardType value);

	public void delete(Long id);
}
