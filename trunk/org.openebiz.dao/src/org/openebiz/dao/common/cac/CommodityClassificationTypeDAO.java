package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.NatureCodeType;
import org.openebiz.core.common.cbc.CargoTypeCodeType;
import org.openebiz.core.common.cbc.CommodityCodeType;
import org.openebiz.core.common.cbc.ItemClassificationCodeType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.CommodityClassificationType;

public interface CommodityClassificationTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		NatureCodeType natureCode;

		CargoTypeCodeType cargoTypeCode;

		CommodityCodeType commodityCode;

		ItemClassificationCodeType itemClassificationCode;

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

		public NatureCodeType getNatureCode() {
			return this.natureCode;
		}

		public void setNatureCode(NatureCodeType value) {
			this.natureCode = value;
		}

		public CargoTypeCodeType getCargoTypeCode() {
			return this.cargoTypeCode;
		}

		public void setCargoTypeCode(CargoTypeCodeType value) {
			this.cargoTypeCode = value;
		}

		public CommodityCodeType getCommodityCode() {
			return this.commodityCode;
		}

		public void setCommodityCode(CommodityCodeType value) {
			this.commodityCode = value;
		}

		public ItemClassificationCodeType getItemClassificationCode() {
			return this.itemClassificationCode;
		}

		public void setItemClassificationCode(ItemClassificationCodeType value) {
			this.itemClassificationCode = value;
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

	public CommodityClassificationType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(CommodityClassificationType value);

	public void update(CommodityClassificationType value);

	public CommodityClassificationType merge(CommodityClassificationType value);

	public void delete(CommodityClassificationType value);

	public void delete(Long id);
}
