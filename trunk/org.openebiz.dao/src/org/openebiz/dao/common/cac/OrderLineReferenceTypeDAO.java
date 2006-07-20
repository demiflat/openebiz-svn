package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.LineIDType;
import org.openebiz.core.common.cbc.SalesOrderLineIDType;
import org.openebiz.core.common.cbc.LineStatusCodeType;
import org.openebiz.core.common.cac.OrderReferenceType;
import org.openebiz.core.common.cbc.GUIDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.OrderLineReferenceType;

public interface OrderLineReferenceTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		LineIDType lineID;

		SalesOrderLineIDType salesOrderLineID;

		LineStatusCodeType lineStatusCode;

		OrderReferenceType orderReference;

		GUIDType GUID;

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

		public SalesOrderLineIDType getSalesOrderLineID() {
			return this.salesOrderLineID;
		}

		public void setSalesOrderLineID(SalesOrderLineIDType value) {
			this.salesOrderLineID = value;
		}

		public LineStatusCodeType getLineStatusCode() {
			return this.lineStatusCode;
		}

		public void setLineStatusCode(LineStatusCodeType value) {
			this.lineStatusCode = value;
		}

		public OrderReferenceType getOrderReference() {
			return this.orderReference;
		}

		public void setOrderReference(OrderReferenceType value) {
			this.orderReference = value;
		}

		public GUIDType getGUID() {
			return this.GUID;
		}

		public void setGUID(GUIDType value) {
			this.GUID = value;
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

	public OrderLineReferenceType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(OrderLineReferenceType value);

	public void update(OrderLineReferenceType value);

	public OrderLineReferenceType merge(OrderLineReferenceType value);

	public void delete(OrderLineReferenceType value);

	public void delete(Long id);
}
