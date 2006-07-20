package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.CompanyIDType;
import org.openebiz.core.common.cbc.TaxLevelCodeType;
import org.openebiz.core.common.cac.AddressType;
import org.openebiz.core.common.cac.TaxSchemeType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.PartyTaxSchemeType;

public interface PartyTaxSchemeTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		CompanyIDType companyID;

		TaxLevelCodeType taxLevelCode;

		AddressType registrationAddress;

		TaxSchemeType taxScheme;

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

		public TaxLevelCodeType getTaxLevelCode() {
			return this.taxLevelCode;
		}

		public void setTaxLevelCode(TaxLevelCodeType value) {
			this.taxLevelCode = value;
		}

		public AddressType getRegistrationAddress() {
			return this.registrationAddress;
		}

		public void setRegistrationAddress(AddressType value) {
			this.registrationAddress = value;
		}

		public TaxSchemeType getTaxScheme() {
			return this.taxScheme;
		}

		public void setTaxScheme(TaxSchemeType value) {
			this.taxScheme = value;
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

	public PartyTaxSchemeType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(PartyTaxSchemeType value);

	public void update(PartyTaxSchemeType value);

	public PartyTaxSchemeType merge(PartyTaxSchemeType value);

	public void delete(PartyTaxSchemeType value);

	public void delete(Long id);
}
