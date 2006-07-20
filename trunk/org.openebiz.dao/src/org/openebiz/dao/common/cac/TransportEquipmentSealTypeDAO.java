package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.SealIssuerTypeCodeType;
import org.openebiz.core.common.cbc.SealStatusCodeType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.TransportEquipmentSealType;

public interface TransportEquipmentSealTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		SealIssuerTypeCodeType sealIssuerTypeCode;

		SealStatusCodeType sealStatusCode;

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

		public SealIssuerTypeCodeType getSealIssuerTypeCode() {
			return this.sealIssuerTypeCode;
		}

		public void setSealIssuerTypeCode(SealIssuerTypeCodeType value) {
			this.sealIssuerTypeCode = value;
		}

		public SealStatusCodeType getSealStatusCode() {
			return this.sealStatusCode;
		}

		public void setSealStatusCode(SealStatusCodeType value) {
			this.sealStatusCode = value;
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

	public TransportEquipmentSealType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(TransportEquipmentSealType value);

	public void update(TransportEquipmentSealType value);

	public TransportEquipmentSealType merge(TransportEquipmentSealType value);

	public void delete(TransportEquipmentSealType value);

	public void delete(Long id);
}
