package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cac.PartyType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.DocumentDistributionType;

public interface DocumentDistributionTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		PartyType party;

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

		public PartyType getParty() {
			return this.party;
		}

		public void setParty(PartyType value) {
			this.party = value;
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

	public DocumentDistributionType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(DocumentDistributionType value);

	public void update(DocumentDistributionType value);

	public DocumentDistributionType merge(DocumentDistributionType value);

	public void delete(DocumentDistributionType value);

	public void delete(Long id);
}
