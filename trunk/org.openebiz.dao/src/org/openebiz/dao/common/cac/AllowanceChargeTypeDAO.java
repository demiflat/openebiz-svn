package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.ReasonCodeType;
import org.openebiz.core.common.cbc.AccountingCostCodeType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.AllowanceChargeType;

public interface AllowanceChargeTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		ReasonCodeType reasonCode;

		AccountingCostCodeType accountingCostCode;

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

		public ReasonCodeType getReasonCode() {
			return this.reasonCode;
		}

		public void setReasonCode(ReasonCodeType value) {
			this.reasonCode = value;
		}

		public AccountingCostCodeType getAccountingCostCode() {
			return this.accountingCostCode;
		}

		public void setAccountingCostCode(AccountingCostCodeType value) {
			this.accountingCostCode = value;
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

	public AllowanceChargeType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(AllowanceChargeType value);

	public void update(AllowanceChargeType value);

	public AllowanceChargeType merge(AllowanceChargeType value);

	public void delete(AllowanceChargeType value);

	public void delete(Long id);
}
