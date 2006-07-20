package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.NoteType;
import org.openebiz.core.common.cbc.ShortageActionCodeType;
import org.openebiz.core.common.cbc.RejectReasonCodeType;
import org.openebiz.core.common.cbc.RejectActionCodeType;
import org.openebiz.core.common.cbc.TimingComplaintCodeType;
import org.openebiz.core.common.cac.OrderLineReferenceType;
import org.openebiz.core.common.cbc.GUIDType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.ReceiptLineType;

public interface ReceiptLineTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		NoteType note;

		ShortageActionCodeType shortageActionCode;

		RejectReasonCodeType rejectReasonCode;

		RejectActionCodeType rejectActionCode;

		TimingComplaintCodeType timingComplaintCode;

		OrderLineReferenceType orderLineReference;

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

		public NoteType getNote() {
			return this.note;
		}

		public void setNote(NoteType value) {
			this.note = value;
		}

		public ShortageActionCodeType getShortageActionCode() {
			return this.shortageActionCode;
		}

		public void setShortageActionCode(ShortageActionCodeType value) {
			this.shortageActionCode = value;
		}

		public RejectReasonCodeType getRejectReasonCode() {
			return this.rejectReasonCode;
		}

		public void setRejectReasonCode(RejectReasonCodeType value) {
			this.rejectReasonCode = value;
		}

		public RejectActionCodeType getRejectActionCode() {
			return this.rejectActionCode;
		}

		public void setRejectActionCode(RejectActionCodeType value) {
			this.rejectActionCode = value;
		}

		public TimingComplaintCodeType getTimingComplaintCode() {
			return this.timingComplaintCode;
		}

		public void setTimingComplaintCode(TimingComplaintCodeType value) {
			this.timingComplaintCode = value;
		}

		public OrderLineReferenceType getOrderLineReference() {
			return this.orderLineReference;
		}

		public void setOrderLineReference(OrderLineReferenceType value) {
			this.orderLineReference = value;
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

	public ReceiptLineType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(ReceiptLineType value);

	public void update(ReceiptLineType value);

	public ReceiptLineType merge(ReceiptLineType value);

	public void delete(ReceiptLineType value);

	public void delete(Long id);
}
