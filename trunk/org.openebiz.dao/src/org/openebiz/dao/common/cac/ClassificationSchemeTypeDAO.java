package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.StatusCodeType;
import org.openebiz.core.common.cbc.NoteType;
import org.openebiz.core.common.cbc.DescriptionType;
import org.openebiz.core.common.cbc.AgencyIDType;
import org.openebiz.core.common.cbc.VersionIDType;
import org.openebiz.core.common.cbc.SchemeURIType;
import org.openebiz.core.common.cbc.LanguageIDType;
import org.openebiz.core.common.cbc.URIType;
import org.openebiz.core.common.cbc.GUIDType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.ClassificationSchemeType;

public interface ClassificationSchemeTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		StatusCodeType statusCode;

		NoteType note;

		DescriptionType description;

		AgencyIDType agencyID;

		VersionIDType versionID;

		SchemeURIType schemeURI;

		LanguageIDType languageID;

		URIType URI;

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

		public StatusCodeType getStatusCode() {
			return this.statusCode;
		}

		public void setStatusCode(StatusCodeType value) {
			this.statusCode = value;
		}

		public NoteType getNote() {
			return this.note;
		}

		public void setNote(NoteType value) {
			this.note = value;
		}

		public DescriptionType getDescription() {
			return this.description;
		}

		public void setDescription(DescriptionType value) {
			this.description = value;
		}

		public AgencyIDType getAgencyID() {
			return this.agencyID;
		}

		public void setAgencyID(AgencyIDType value) {
			this.agencyID = value;
		}

		public VersionIDType getVersionID() {
			return this.versionID;
		}

		public void setVersionID(VersionIDType value) {
			this.versionID = value;
		}

		public SchemeURIType getSchemeURI() {
			return this.schemeURI;
		}

		public void setSchemeURI(SchemeURIType value) {
			this.schemeURI = value;
		}

		public LanguageIDType getLanguageID() {
			return this.languageID;
		}

		public void setLanguageID(LanguageIDType value) {
			this.languageID = value;
		}

		public URIType getURI() {
			return this.URI;
		}

		public void setURI(URIType value) {
			this.URI = value;
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

	public ClassificationSchemeType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(ClassificationSchemeType value);

	public void update(ClassificationSchemeType value);

	public ClassificationSchemeType merge(ClassificationSchemeType value);

	public void delete(ClassificationSchemeType value);

	public void delete(Long id);
}
