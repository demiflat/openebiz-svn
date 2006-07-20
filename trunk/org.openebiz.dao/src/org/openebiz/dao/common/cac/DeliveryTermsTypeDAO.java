package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.LossRiskResponsibilityCodeType;
import org.openebiz.core.common.cac.AllowanceChargeType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.DeliveryTermsType;

public interface DeliveryTermsTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		LossRiskResponsibilityCodeType lossRiskResponsibilityCode;

		AllowanceChargeType allowanceCharge;

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

		public LossRiskResponsibilityCodeType getLossRiskResponsibilityCode() {
			return this.lossRiskResponsibilityCode;
		}

		public void setLossRiskResponsibilityCode(
				LossRiskResponsibilityCodeType value) {
			this.lossRiskResponsibilityCode = value;
		}

		public AllowanceChargeType getAllowanceCharge() {
			return this.allowanceCharge;
		}

		public void setAllowanceCharge(AllowanceChargeType value) {
			this.allowanceCharge = value;
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

	public DeliveryTermsType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(DeliveryTermsType value);

	public void update(DeliveryTermsType value);

	public DeliveryTermsType merge(DeliveryTermsType value);

	public void delete(DeliveryTermsType value);

	public void delete(Long id);
}
