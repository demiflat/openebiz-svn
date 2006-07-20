package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.ActionCodeType;
import org.openebiz.core.common.cbc.DescriptionType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.TransactionConditionsType;

public interface TransactionConditionsTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		ActionCodeType actionCode;

		DescriptionType description;

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

		public ActionCodeType getActionCode() {
			return this.actionCode;
		}

		public void setActionCode(ActionCodeType value) {
			this.actionCode = value;
		}

		public DescriptionType getDescription() {
			return this.description;
		}

		public void setDescription(DescriptionType value) {
			this.description = value;
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

	public TransactionConditionsType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(TransactionConditionsType value);

	public void update(TransactionConditionsType value);

	public TransactionConditionsType merge(TransactionConditionsType value);

	public void delete(TransactionConditionsType value);

	public void delete(Long id);
}
