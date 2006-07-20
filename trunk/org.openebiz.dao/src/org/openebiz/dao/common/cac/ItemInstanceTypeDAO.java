package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.ProductTraceIDType;
import org.openebiz.core.common.cbc.RegistrationIDType;
import org.openebiz.core.common.cbc.SerialIDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.ItemInstanceType;

public interface ItemInstanceTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		ProductTraceIDType productTraceID;

		RegistrationIDType registrationID;

		SerialIDType serialID;

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

		public ProductTraceIDType getProductTraceID() {
			return this.productTraceID;
		}

		public void setProductTraceID(ProductTraceIDType value) {
			this.productTraceID = value;
		}

		public RegistrationIDType getRegistrationID() {
			return this.registrationID;
		}

		public void setRegistrationID(RegistrationIDType value) {
			this.registrationID = value;
		}

		public SerialIDType getSerialID() {
			return this.serialID;
		}

		public void setSerialID(SerialIDType value) {
			this.serialID = value;
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

	public ItemInstanceType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(ItemInstanceType value);

	public void update(ItemInstanceType value);

	public ItemInstanceType merge(ItemInstanceType value);

	public void delete(ItemInstanceType value);

	public void delete(Long id);
}
