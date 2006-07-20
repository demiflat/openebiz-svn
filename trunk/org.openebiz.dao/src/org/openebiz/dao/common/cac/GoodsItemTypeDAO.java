package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.SequenceNumberIDType;
import org.openebiz.core.common.cbc.PreferenceCriterionCodeType;
import org.openebiz.core.common.cbc.RequiredCustomsIDType;
import org.openebiz.core.common.cbc.CustomsStatusCodeType;
import org.openebiz.core.common.cac.AddressType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.GoodsItemType;

public interface GoodsItemTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		SequenceNumberIDType sequenceNumberID;

		PreferenceCriterionCodeType preferenceCriterionCode;

		RequiredCustomsIDType requiredCustomsID;

		CustomsStatusCodeType customsStatusCode;

		AddressType originAddress;

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

		public SequenceNumberIDType getSequenceNumberID() {
			return this.sequenceNumberID;
		}

		public void setSequenceNumberID(SequenceNumberIDType value) {
			this.sequenceNumberID = value;
		}

		public PreferenceCriterionCodeType getPreferenceCriterionCode() {
			return this.preferenceCriterionCode;
		}

		public void setPreferenceCriterionCode(PreferenceCriterionCodeType value) {
			this.preferenceCriterionCode = value;
		}

		public RequiredCustomsIDType getRequiredCustomsID() {
			return this.requiredCustomsID;
		}

		public void setRequiredCustomsID(RequiredCustomsIDType value) {
			this.requiredCustomsID = value;
		}

		public CustomsStatusCodeType getCustomsStatusCode() {
			return this.customsStatusCode;
		}

		public void setCustomsStatusCode(CustomsStatusCodeType value) {
			this.customsStatusCode = value;
		}

		public AddressType getOriginAddress() {
			return this.originAddress;
		}

		public void setOriginAddress(AddressType value) {
			this.originAddress = value;
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

	public GoodsItemType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(GoodsItemType value);

	public void update(GoodsItemType value);

	public GoodsItemType merge(GoodsItemType value);

	public void delete(GoodsItemType value);

	public void delete(Long id);
}
