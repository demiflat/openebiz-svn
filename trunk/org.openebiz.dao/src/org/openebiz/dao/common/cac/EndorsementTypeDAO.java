package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.DocumentIDType;
import org.openebiz.core.common.cac.EndorserPartyType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.EndorsementType;

public interface EndorsementTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		DocumentIDType documentID;

		EndorserPartyType endorserParty;

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

		public DocumentIDType getDocumentID() {
			return this.documentID;
		}

		public void setDocumentID(DocumentIDType value) {
			this.documentID = value;
		}

		public EndorserPartyType getEndorserParty() {
			return this.endorserParty;
		}

		public void setEndorserParty(EndorserPartyType value) {
			this.endorserParty = value;
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

	public EndorsementType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(EndorsementType value);

	public void update(EndorsementType value);

	public EndorsementType merge(EndorsementType value);

	public void delete(EndorsementType value);

	public void delete(Long id);
}
