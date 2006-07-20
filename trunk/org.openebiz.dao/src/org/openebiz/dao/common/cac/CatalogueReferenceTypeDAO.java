package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.VersionIDType;
import org.openebiz.core.common.cbc.PreviousVersionIDType;
import org.openebiz.core.common.cbc.GUIDType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.CatalogueReferenceType;

public interface CatalogueReferenceTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		VersionIDType versionID;

		PreviousVersionIDType previousVersionID;

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

		public PreviousVersionIDType getPreviousVersionID() {
			return this.previousVersionID;
		}

		public void setPreviousVersionID(PreviousVersionIDType value) {
			this.previousVersionID = value;
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

	public CatalogueReferenceType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(CatalogueReferenceType value);

	public void update(CatalogueReferenceType value);

	public CatalogueReferenceType merge(CatalogueReferenceType value);

	public void delete(CatalogueReferenceType value);

	public void delete(Long id);
}
