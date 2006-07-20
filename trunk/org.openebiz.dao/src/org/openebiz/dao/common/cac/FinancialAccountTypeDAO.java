package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.AccountTypeCodeType;
import org.openebiz.core.common.cbc.CurrencyCodeType;
import org.openebiz.core.common.cac.BranchType;
import org.openebiz.core.common.cac.CountryType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.FinancialAccountType;

public interface FinancialAccountTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		AccountTypeCodeType accountTypeCode;

		CurrencyCodeType currencyCode;

		BranchType financialInstitutionBranch;

		CountryType country;

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

		public AccountTypeCodeType getAccountTypeCode() {
			return this.accountTypeCode;
		}

		public void setAccountTypeCode(AccountTypeCodeType value) {
			this.accountTypeCode = value;
		}

		public CurrencyCodeType getCurrencyCode() {
			return this.currencyCode;
		}

		public void setCurrencyCode(CurrencyCodeType value) {
			this.currencyCode = value;
		}

		public BranchType getFinancialInstitutionBranch() {
			return this.financialInstitutionBranch;
		}

		public void setFinancialInstitutionBranch(BranchType value) {
			this.financialInstitutionBranch = value;
		}

		public CountryType getCountry() {
			return this.country;
		}

		public void setCountry(CountryType value) {
			this.country = value;
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

	public FinancialAccountType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(FinancialAccountType value);

	public void update(FinancialAccountType value);

	public FinancialAccountType merge(FinancialAccountType value);

	public void delete(FinancialAccountType value);

	public void delete(Long id);
}
