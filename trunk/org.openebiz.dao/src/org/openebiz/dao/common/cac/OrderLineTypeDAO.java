package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.SubstitutionStatusCodeType;
import org.openebiz.core.common.cbc.NoteType;
import org.openebiz.core.common.cac.LineItemType;
import org.openebiz.core.common.cac.LineReferenceType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.OrderLineType;

public interface OrderLineTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		SubstitutionStatusCodeType substitutionStatusCode;

		NoteType note;

		LineItemType lineItem;

		LineReferenceType quotationLineReference;

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

		public SubstitutionStatusCodeType getSubstitutionStatusCode() {
			return this.substitutionStatusCode;
		}

		public void setSubstitutionStatusCode(SubstitutionStatusCodeType value) {
			this.substitutionStatusCode = value;
		}

		public NoteType getNote() {
			return this.note;
		}

		public void setNote(NoteType value) {
			this.note = value;
		}

		public LineItemType getLineItem() {
			return this.lineItem;
		}

		public void setLineItem(LineItemType value) {
			this.lineItem = value;
		}

		public LineReferenceType getQuotationLineReference() {
			return this.quotationLineReference;
		}

		public void setQuotationLineReference(LineReferenceType value) {
			this.quotationLineReference = value;
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

	public OrderLineType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(OrderLineType value);

	public void update(OrderLineType value);

	public OrderLineType merge(OrderLineType value);

	public void delete(OrderLineType value);

	public void delete(Long id);
}
