package org.openebiz.dao.common.udt;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.udt.IdentifierType;

public interface IdentifierTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		String value;

		String schemeAgencyID;

		String schemeAgencyName;

		String schemeDataURI;

		String schemeID;

		String schemeName;

		String schemeURI;

		String schemeVersionID;

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

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getSchemeAgencyID() {
			return this.schemeAgencyID;
		}

		public void setSchemeAgencyID(String value) {
			this.schemeAgencyID = value;
		}

		public String getSchemeAgencyName() {
			return this.schemeAgencyName;
		}

		public void setSchemeAgencyName(String value) {
			this.schemeAgencyName = value;
		}

		public String getSchemeDataURI() {
			return this.schemeDataURI;
		}

		public void setSchemeDataURI(String value) {
			this.schemeDataURI = value;
		}

		public String getSchemeID() {
			return this.schemeID;
		}

		public void setSchemeID(String value) {
			this.schemeID = value;
		}

		public String getSchemeName() {
			return this.schemeName;
		}

		public void setSchemeName(String value) {
			this.schemeName = value;
		}

		public String getSchemeURI() {
			return this.schemeURI;
		}

		public void setSchemeURI(String value) {
			this.schemeURI = value;
		}

		public String getSchemeVersionID() {
			return this.schemeVersionID;
		}

		public void setSchemeVersionID(String value) {
			this.schemeVersionID = value;
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

	public IdentifierType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(IdentifierType value);

	public void update(IdentifierType value);

	public IdentifierType merge(IdentifierType value);

	public void delete(IdentifierType value);

	public void delete(Long id);
}
