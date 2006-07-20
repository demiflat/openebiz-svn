package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.SalesOrderIDType;
import org.openebiz.core.common.cbc.GloballyUniqueGUIDType;
import org.openebiz.core.common.cbc.NoteType;
import org.openebiz.core.common.cbc.LineStatusCodeType;
import org.openebiz.core.common.cbc.InspectionMethodCodeType;
import org.openebiz.core.common.cbc.AccountingCostCodeType;
import org.openebiz.core.common.cac.DeliveryTermsType;
import org.openebiz.core.common.cac.PartyType;
import org.openebiz.core.common.cac.BasePriceType;
import org.openebiz.core.common.cac.ItemType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.LineItemType;

public interface LineItemTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		SalesOrderIDType salesOrderID;

		GloballyUniqueGUIDType globallyUniqueGUID;

		NoteType note;

		LineStatusCodeType lineStatusCode;

		InspectionMethodCodeType inspectionMethodCode;

		AccountingCostCodeType accountingCostCode;

		DeliveryTermsType deliveryTerms;

		PartyType destinationParty;

		BasePriceType basePrice;

		ItemType item;

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

		public SalesOrderIDType getSalesOrderID() {
			return this.salesOrderID;
		}

		public void setSalesOrderID(SalesOrderIDType value) {
			this.salesOrderID = value;
		}

		public GloballyUniqueGUIDType getGloballyUniqueGUID() {
			return this.globallyUniqueGUID;
		}

		public void setGloballyUniqueGUID(GloballyUniqueGUIDType value) {
			this.globallyUniqueGUID = value;
		}

		public NoteType getNote() {
			return this.note;
		}

		public void setNote(NoteType value) {
			this.note = value;
		}

		public LineStatusCodeType getLineStatusCode() {
			return this.lineStatusCode;
		}

		public void setLineStatusCode(LineStatusCodeType value) {
			this.lineStatusCode = value;
		}

		public InspectionMethodCodeType getInspectionMethodCode() {
			return this.inspectionMethodCode;
		}

		public void setInspectionMethodCode(InspectionMethodCodeType value) {
			this.inspectionMethodCode = value;
		}

		public AccountingCostCodeType getAccountingCostCode() {
			return this.accountingCostCode;
		}

		public void setAccountingCostCode(AccountingCostCodeType value) {
			this.accountingCostCode = value;
		}

		public DeliveryTermsType getDeliveryTerms() {
			return this.deliveryTerms;
		}

		public void setDeliveryTerms(DeliveryTermsType value) {
			this.deliveryTerms = value;
		}

		public PartyType getDestinationParty() {
			return this.destinationParty;
		}

		public void setDestinationParty(PartyType value) {
			this.destinationParty = value;
		}

		public BasePriceType getBasePrice() {
			return this.basePrice;
		}

		public void setBasePrice(BasePriceType value) {
			this.basePrice = value;
		}

		public ItemType getItem() {
			return this.item;
		}

		public void setItem(ItemType value) {
			this.item = value;
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

	public LineItemType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(LineItemType value);

	public void update(LineItemType value);

	public LineItemType merge(LineItemType value);

	public void delete(LineItemType value);

	public void delete(Long id);
}
