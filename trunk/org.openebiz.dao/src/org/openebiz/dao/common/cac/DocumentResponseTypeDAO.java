package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cac.ResponseType;
import org.openebiz.core.common.cac.DocumentReferenceType;
import org.openebiz.core.common.cac.PartyType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.DocumentResponseType;

public interface DocumentResponseTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		ResponseType response;

		DocumentReferenceType documentReference;

		PartyType issuerParty;

		PartyType recipientParty;

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

		public ResponseType getResponse() {
			return this.response;
		}

		public void setResponse(ResponseType value) {
			this.response = value;
		}

		public DocumentReferenceType getDocumentReference() {
			return this.documentReference;
		}

		public void setDocumentReference(DocumentReferenceType value) {
			this.documentReference = value;
		}

		public PartyType getIssuerParty() {
			return this.issuerParty;
		}

		public void setIssuerParty(PartyType value) {
			this.issuerParty = value;
		}

		public PartyType getRecipientParty() {
			return this.recipientParty;
		}

		public void setRecipientParty(PartyType value) {
			this.recipientParty = value;
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

	public DocumentResponseType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(DocumentResponseType value);

	public void update(DocumentResponseType value);

	public DocumentResponseType merge(DocumentResponseType value);

	public void delete(DocumentResponseType value);

	public void delete(Long id);
}
