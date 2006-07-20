package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.NoteType;
import org.openebiz.core.common.cbc.ValidatorIDType;
import org.openebiz.core.common.cac.PartyType;
import org.openebiz.core.common.cac.AttachmentType;
import org.openebiz.core.common.cac.DocumentReferenceType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.SignatureType;

public interface SignatureTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		NoteType note;

		ValidatorIDType validatorID;

		PartyType signatoryParty;

		AttachmentType digitalSignatureAttachment;

		DocumentReferenceType originalDocumentReference;

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

		public NoteType getNote() {
			return this.note;
		}

		public void setNote(NoteType value) {
			this.note = value;
		}

		public ValidatorIDType getValidatorID() {
			return this.validatorID;
		}

		public void setValidatorID(ValidatorIDType value) {
			this.validatorID = value;
		}

		public PartyType getSignatoryParty() {
			return this.signatoryParty;
		}

		public void setSignatoryParty(PartyType value) {
			this.signatoryParty = value;
		}

		public AttachmentType getDigitalSignatureAttachment() {
			return this.digitalSignatureAttachment;
		}

		public void setDigitalSignatureAttachment(AttachmentType value) {
			this.digitalSignatureAttachment = value;
		}

		public DocumentReferenceType getOriginalDocumentReference() {
			return this.originalDocumentReference;
		}

		public void setOriginalDocumentReference(DocumentReferenceType value) {
			this.originalDocumentReference = value;
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

	public SignatureType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(SignatureType value);

	public void update(SignatureType value);

	public SignatureType merge(SignatureType value);

	public void delete(SignatureType value);

	public void delete(Long id);
}
