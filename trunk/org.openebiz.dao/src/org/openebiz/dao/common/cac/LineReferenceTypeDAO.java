package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.LineIDType;
import org.openebiz.core.common.cbc.GloballyUniqueGUIDType;
import org.openebiz.core.common.cbc.LineStatusCodeType;
import org.openebiz.core.common.cac.DocumentReferenceType;
import org.openebiz.core.common.cac.AccountingDocumentReferenceType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.LineReferenceType;

public interface LineReferenceTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		LineIDType lineID;

		GloballyUniqueGUIDType globallyUniqueGUID;

		LineStatusCodeType lineStatusCode;

		DocumentReferenceType documentReference;

		AccountingDocumentReferenceType accountingDocumentReference;

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

		public LineIDType getLineID() {
			return this.lineID;
		}

		public void setLineID(LineIDType value) {
			this.lineID = value;
		}

		public GloballyUniqueGUIDType getGloballyUniqueGUID() {
			return this.globallyUniqueGUID;
		}

		public void setGloballyUniqueGUID(GloballyUniqueGUIDType value) {
			this.globallyUniqueGUID = value;
		}

		public LineStatusCodeType getLineStatusCode() {
			return this.lineStatusCode;
		}

		public void setLineStatusCode(LineStatusCodeType value) {
			this.lineStatusCode = value;
		}

		public DocumentReferenceType getDocumentReference() {
			return this.documentReference;
		}

		public void setDocumentReference(DocumentReferenceType value) {
			this.documentReference = value;
		}

		public AccountingDocumentReferenceType getAccountingDocumentReference() {
			return this.accountingDocumentReference;
		}

		public void setAccountingDocumentReference(
				AccountingDocumentReferenceType value) {
			this.accountingDocumentReference = value;
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

	public LineReferenceType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(LineReferenceType value);

	public void update(LineReferenceType value);

	public LineReferenceType merge(LineReferenceType value);

	public void delete(LineReferenceType value);

	public void delete(Long id);
}
