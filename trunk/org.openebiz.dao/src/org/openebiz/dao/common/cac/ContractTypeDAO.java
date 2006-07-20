package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.ContractTypeCodeType;
import org.openebiz.core.common.cac.PeriodType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.ContractType;

public interface ContractTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		ContractTypeCodeType contractTypeCode;

		PeriodType validityPeriod;

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

		public ContractTypeCodeType getContractTypeCode() {
			return this.contractTypeCode;
		}

		public void setContractTypeCode(ContractTypeCodeType value) {
			this.contractTypeCode = value;
		}

		public PeriodType getValidityPeriod() {
			return this.validityPeriod;
		}

		public void setValidityPeriod(PeriodType value) {
			this.validityPeriod = value;
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

	public ContractType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(ContractType value);

	public void update(ContractType value);

	public ContractType merge(ContractType value);

	public void delete(ContractType value);

	public void delete(Long id);
}
