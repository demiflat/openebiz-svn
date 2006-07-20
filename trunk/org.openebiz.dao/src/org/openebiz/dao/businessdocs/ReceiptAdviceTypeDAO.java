package org.openebiz.dao.businessdocs;

import org.openebiz.core.common.cbc.DocumentStatusCodeType;
import org.openebiz.core.common.cbc.NoteType;
import org.openebiz.core.common.cac.CustomerPartyType;
import org.openebiz.core.common.cac.SupplierPartyType;
import org.openebiz.core.common.cac.ShipmentType;
import org.openebiz.core.common.cbc.GUIDType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.businessdocs.ReceiptAdviceType;

public interface ReceiptAdviceTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		DocumentStatusCodeType documentStatusCode;

		NoteType note;

		CustomerPartyType buyerCustomerParty;

		SupplierPartyType sellerSupplierParty;

		ShipmentType shipment;

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

		public DocumentStatusCodeType getDocumentStatusCode() {
			return this.documentStatusCode;
		}

		public void setDocumentStatusCode(DocumentStatusCodeType value) {
			this.documentStatusCode = value;
		}

		public NoteType getNote() {
			return this.note;
		}

		public void setNote(NoteType value) {
			this.note = value;
		}

		public CustomerPartyType getBuyerCustomerParty() {
			return this.buyerCustomerParty;
		}

		public void setBuyerCustomerParty(CustomerPartyType value) {
			this.buyerCustomerParty = value;
		}

		public SupplierPartyType getSellerSupplierParty() {
			return this.sellerSupplierParty;
		}

		public void setSellerSupplierParty(SupplierPartyType value) {
			this.sellerSupplierParty = value;
		}

		public ShipmentType getShipment() {
			return this.shipment;
		}

		public void setShipment(ShipmentType value) {
			this.shipment = value;
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

	public ReceiptAdviceType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(ReceiptAdviceType value);

	public void update(ReceiptAdviceType value);

	public ReceiptAdviceType merge(ReceiptAdviceType value);

	public void delete(ReceiptAdviceType value);

	public void delete(Long id);
}
