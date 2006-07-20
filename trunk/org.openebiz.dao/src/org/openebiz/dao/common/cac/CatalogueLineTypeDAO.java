package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.ActionCodeType;
import org.openebiz.core.common.cbc.LifeCycleStatusCodeType;
import org.openebiz.core.common.cbc.OrderingUnitMeasureIDType;
import org.openebiz.core.common.cbc.PackLevelCodeType;
import org.openebiz.core.common.cac.PeriodType;
import org.openebiz.core.common.cac.ItemType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.CatalogueLineType;

public interface CatalogueLineTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		ActionCodeType actionCode;

		LifeCycleStatusCodeType lifeCycleStatusCode;

		OrderingUnitMeasureIDType orderingUnitMeasureID;

		PackLevelCodeType packLevelCode;

		PeriodType informationValidityPeriod;

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

		public ActionCodeType getActionCode() {
			return this.actionCode;
		}

		public void setActionCode(ActionCodeType value) {
			this.actionCode = value;
		}

		public LifeCycleStatusCodeType getLifeCycleStatusCode() {
			return this.lifeCycleStatusCode;
		}

		public void setLifeCycleStatusCode(LifeCycleStatusCodeType value) {
			this.lifeCycleStatusCode = value;
		}

		public OrderingUnitMeasureIDType getOrderingUnitMeasureID() {
			return this.orderingUnitMeasureID;
		}

		public void setOrderingUnitMeasureID(OrderingUnitMeasureIDType value) {
			this.orderingUnitMeasureID = value;
		}

		public PackLevelCodeType getPackLevelCode() {
			return this.packLevelCode;
		}

		public void setPackLevelCode(PackLevelCodeType value) {
			this.packLevelCode = value;
		}

		public PeriodType getInformationValidityPeriod() {
			return this.informationValidityPeriod;
		}

		public void setInformationValidityPeriod(PeriodType value) {
			this.informationValidityPeriod = value;
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

	public CatalogueLineType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(CatalogueLineType value);

	public void update(CatalogueLineType value);

	public CatalogueLineType merge(CatalogueLineType value);

	public void delete(CatalogueLineType value);

	public void delete(Long id);
}
