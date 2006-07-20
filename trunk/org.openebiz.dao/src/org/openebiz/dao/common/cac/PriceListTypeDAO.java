package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.StatusCodeType;
import org.openebiz.core.common.cac.PriceListType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;

public interface PriceListTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		StatusCodeType statusCode;

		PriceListType previousPriceList;

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

		public StatusCodeType getStatusCode() {
			return this.statusCode;
		}

		public void setStatusCode(StatusCodeType value) {
			this.statusCode = value;
		}

		public PriceListType getPreviousPriceList() {
			return this.previousPriceList;
		}

		public void setPreviousPriceList(PriceListType value) {
			this.previousPriceList = value;
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

	public PriceListType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(PriceListType value);

	public void update(PriceListType value);

	public PriceListType merge(PriceListType value);

	public void delete(PriceListType value);

	public void delete(Long id);
}
