package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.CompanyIDType;
import org.openebiz.core.common.cac.AddressType;
import org.openebiz.core.common.cac.CorporateRegistrationSchemeType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.PartyLegalEntityType;

public interface PartyLegalEntityTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		CompanyIDType companyID;

		AddressType registrationAddress;

		CorporateRegistrationSchemeType corporateRegistrationScheme;

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

		public CompanyIDType getCompanyID() {
			return this.companyID;
		}

		public void setCompanyID(CompanyIDType value) {
			this.companyID = value;
		}

		public AddressType getRegistrationAddress() {
			return this.registrationAddress;
		}

		public void setRegistrationAddress(AddressType value) {
			this.registrationAddress = value;
		}

		public CorporateRegistrationSchemeType getCorporateRegistrationScheme() {
			return this.corporateRegistrationScheme;
		}

		public void setCorporateRegistrationScheme(
				CorporateRegistrationSchemeType value) {
			this.corporateRegistrationScheme = value;
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

	public PartyLegalEntityType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(PartyLegalEntityType value);

	public void update(PartyLegalEntityType value);

	public PartyLegalEntityType merge(PartyLegalEntityType value);

	public void delete(PartyLegalEntityType value);

	public void delete(Long id);
}
