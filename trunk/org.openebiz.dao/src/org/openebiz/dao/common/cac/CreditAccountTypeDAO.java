package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.AccountIDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.CreditAccountType;

public interface CreditAccountTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		AccountIDType accountID;

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

		public AccountIDType getAccountID() {
			return this.accountID;
		}

		public void setAccountID(AccountIDType value) {
			this.accountID = value;
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

	public CreditAccountType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(CreditAccountType value);

	public void update(CreditAccountType value);

	public CreditAccountType merge(CreditAccountType value);

	public void delete(CreditAccountType value);

	public void delete(Long id);
}
