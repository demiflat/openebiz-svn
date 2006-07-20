package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.NoteType;
import org.openebiz.core.common.cbc.AccountingCostCodeType;
import org.openebiz.core.common.cac.ItemType;
import org.openebiz.core.common.cac.BasePriceType;
import org.openebiz.core.common.cac.DeliveryTermsType;
import org.openebiz.core.common.cbc.GUIDType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.InvoiceLineType;

public interface InvoiceLineTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		NoteType note;

		AccountingCostCodeType accountingCostCode;

		ItemType item;

		BasePriceType basePrice;

		DeliveryTermsType deliveryTerms;

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

		public AccountingCostCodeType getAccountingCostCode() {
			return this.accountingCostCode;
		}

		public void setAccountingCostCode(AccountingCostCodeType value) {
			this.accountingCostCode = value;
		}

		public ItemType getItem() {
			return this.item;
		}

		public void setItem(ItemType value) {
			this.item = value;
		}

		public BasePriceType getBasePrice() {
			return this.basePrice;
		}

		public void setBasePrice(BasePriceType value) {
			this.basePrice = value;
		}

		public DeliveryTermsType getDeliveryTerms() {
			return this.deliveryTerms;
		}

		public void setDeliveryTerms(DeliveryTermsType value) {
			this.deliveryTerms = value;
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

	public InvoiceLineType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(InvoiceLineType value);

	public void update(InvoiceLineType value);

	public InvoiceLineType merge(InvoiceLineType value);

	public void delete(InvoiceLineType value);

	public void delete(Long id);
}
