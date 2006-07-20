package org.openebiz.dao.businessdocs;

import org.openebiz.core.common.cbc.VersionIDType;
import org.openebiz.core.common.cac.PartyType;
import org.openebiz.core.common.cac.CertificateOfOriginApplicationType;
import org.openebiz.core.common.cac.EndorsementType;
import org.openebiz.core.common.cbc.GUIDType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.businessdocs.CertificateOfOriginType;

public interface CertificateOfOriginTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		VersionIDType versionID;

		PartyType exporterParty;

		PartyType importerParty;

		CertificateOfOriginApplicationType certificateOfOriginApplication;

		EndorsementType issuerEndorsement;

		EndorsementType embassyEndorsement;

		EndorsementType insuranceEndorsement;

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

		public VersionIDType getVersionID() {
			return this.versionID;
		}

		public void setVersionID(VersionIDType value) {
			this.versionID = value;
		}

		public PartyType getExporterParty() {
			return this.exporterParty;
		}

		public void setExporterParty(PartyType value) {
			this.exporterParty = value;
		}

		public PartyType getImporterParty() {
			return this.importerParty;
		}

		public void setImporterParty(PartyType value) {
			this.importerParty = value;
		}

		public CertificateOfOriginApplicationType getCertificateOfOriginApplication() {
			return this.certificateOfOriginApplication;
		}

		public void setCertificateOfOriginApplication(
				CertificateOfOriginApplicationType value) {
			this.certificateOfOriginApplication = value;
		}

		public EndorsementType getIssuerEndorsement() {
			return this.issuerEndorsement;
		}

		public void setIssuerEndorsement(EndorsementType value) {
			this.issuerEndorsement = value;
		}

		public EndorsementType getEmbassyEndorsement() {
			return this.embassyEndorsement;
		}

		public void setEmbassyEndorsement(EndorsementType value) {
			this.embassyEndorsement = value;
		}

		public EndorsementType getInsuranceEndorsement() {
			return this.insuranceEndorsement;
		}

		public void setInsuranceEndorsement(EndorsementType value) {
			this.insuranceEndorsement = value;
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

	public CertificateOfOriginType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(CertificateOfOriginType value);

	public void update(CertificateOfOriginType value);

	public CertificateOfOriginType merge(CertificateOfOriginType value);

	public void delete(CertificateOfOriginType value);

	public void delete(Long id);
}
