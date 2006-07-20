package org.openebiz.dao.businessdocs;

import org.openebiz.core.common.cbc.DocumentQualifierCodeType;
import org.openebiz.core.common.cbc.ParentDocumentIDType;
import org.openebiz.core.common.cbc.ParentDocumentQualifierCodeType;
import org.openebiz.core.common.cac.PartyType;
import org.openebiz.core.common.cac.AttachmentType;
import org.openebiz.core.common.cbc.GUIDType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.businessdocs.AttachedDocumentType;

public interface AttachedDocumentTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		DocumentQualifierCodeType documentQualifierCode;

		ParentDocumentIDType parentDocumentID;

		ParentDocumentQualifierCodeType parentDocumentQualifierCode;

		PartyType senderParty;

		PartyType receiverParty;

		AttachmentType attachment;

		GUIDType GUID;

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

		public DocumentQualifierCodeType getDocumentQualifierCode() {
			return this.documentQualifierCode;
		}

		public void setDocumentQualifierCode(DocumentQualifierCodeType value) {
			this.documentQualifierCode = value;
		}

		public ParentDocumentIDType getParentDocumentID() {
			return this.parentDocumentID;
		}

		public void setParentDocumentID(ParentDocumentIDType value) {
			this.parentDocumentID = value;
		}

		public ParentDocumentQualifierCodeType getParentDocumentQualifierCode() {
			return this.parentDocumentQualifierCode;
		}

		public void setParentDocumentQualifierCode(
				ParentDocumentQualifierCodeType value) {
			this.parentDocumentQualifierCode = value;
		}

		public PartyType getSenderParty() {
			return this.senderParty;
		}

		public void setSenderParty(PartyType value) {
			this.senderParty = value;
		}

		public PartyType getReceiverParty() {
			return this.receiverParty;
		}

		public void setReceiverParty(PartyType value) {
			this.receiverParty = value;
		}

		public AttachmentType getAttachment() {
			return this.attachment;
		}

		public void setAttachment(AttachmentType value) {
			this.attachment = value;
		}

		public GUIDType getGUID() {
			return this.GUID;
		}

		public void setGUID(GUIDType value) {
			this.GUID = value;
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

	public AttachedDocumentType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(AttachedDocumentType value);

	public void update(AttachedDocumentType value);

	public AttachedDocumentType merge(AttachedDocumentType value);

	public void delete(AttachedDocumentType value);

	public void delete(Long id);
}
