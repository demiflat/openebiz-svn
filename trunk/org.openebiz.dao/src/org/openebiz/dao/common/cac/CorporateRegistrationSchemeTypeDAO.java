package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.CorporateRegistrationTypeCodeType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.CorporateRegistrationSchemeType;

public interface CorporateRegistrationSchemeTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		CorporateRegistrationTypeCodeType corporateRegistrationTypeCode;

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

		public CorporateRegistrationTypeCodeType getCorporateRegistrationTypeCode() {
			return this.corporateRegistrationTypeCode;
		}

		public void setCorporateRegistrationTypeCode(
				CorporateRegistrationTypeCodeType value) {
			this.corporateRegistrationTypeCode = value;
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

	public CorporateRegistrationSchemeType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(CorporateRegistrationSchemeType value);

	public void update(CorporateRegistrationSchemeType value);

	public CorporateRegistrationSchemeType merge(
			CorporateRegistrationSchemeType value);

	public void delete(CorporateRegistrationSchemeType value);

	public void delete(Long id);
}
