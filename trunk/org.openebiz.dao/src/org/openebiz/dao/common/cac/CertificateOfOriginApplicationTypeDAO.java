package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.ReferenceIDType;
import org.openebiz.core.common.cbc.StatusCodeType;
import org.openebiz.core.common.cbc.OriginalJobIDType;
import org.openebiz.core.common.cbc.PreviousJobIDType;
import org.openebiz.core.common.cbc.RemarksType;
import org.openebiz.core.common.cac.ShipmentType;
import org.openebiz.core.common.cac.PartyType;
import org.openebiz.core.common.cac.CountryType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.CertificateOfOriginApplicationType;

public interface CertificateOfOriginApplicationTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		ReferenceIDType referenceID;

		StatusCodeType statusCode;

		OriginalJobIDType originalJobID;

		PreviousJobIDType previousJobID;

		RemarksType remarks;

		ShipmentType shipment;

		PartyType preparationParty;

		PartyType issuerParty;

		CountryType issuingCountry;

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

		public ReferenceIDType getReferenceID() {
			return this.referenceID;
		}

		public void setReferenceID(ReferenceIDType value) {
			this.referenceID = value;
		}

		public StatusCodeType getStatusCode() {
			return this.statusCode;
		}

		public void setStatusCode(StatusCodeType value) {
			this.statusCode = value;
		}

		public OriginalJobIDType getOriginalJobID() {
			return this.originalJobID;
		}

		public void setOriginalJobID(OriginalJobIDType value) {
			this.originalJobID = value;
		}

		public PreviousJobIDType getPreviousJobID() {
			return this.previousJobID;
		}

		public void setPreviousJobID(PreviousJobIDType value) {
			this.previousJobID = value;
		}

		public RemarksType getRemarks() {
			return this.remarks;
		}

		public void setRemarks(RemarksType value) {
			this.remarks = value;
		}

		public ShipmentType getShipment() {
			return this.shipment;
		}

		public void setShipment(ShipmentType value) {
			this.shipment = value;
		}

		public PartyType getPreparationParty() {
			return this.preparationParty;
		}

		public void setPreparationParty(PartyType value) {
			this.preparationParty = value;
		}

		public PartyType getIssuerParty() {
			return this.issuerParty;
		}

		public void setIssuerParty(PartyType value) {
			this.issuerParty = value;
		}

		public CountryType getIssuingCountry() {
			return this.issuingCountry;
		}

		public void setIssuingCountry(CountryType value) {
			this.issuingCountry = value;
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

	public CertificateOfOriginApplicationType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(CertificateOfOriginApplicationType value);

	public void update(CertificateOfOriginApplicationType value);

	public CertificateOfOriginApplicationType merge(
			CertificateOfOriginApplicationType value);

	public void delete(CertificateOfOriginApplicationType value);

	public void delete(Long id);
}
