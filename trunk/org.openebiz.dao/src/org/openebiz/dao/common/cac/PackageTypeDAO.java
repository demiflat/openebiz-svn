package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.PackageLevelCodeType;
import org.openebiz.core.common.cbc.PackagingTypeCodeType;
import org.openebiz.core.common.cac.PackageType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;

public interface PackageTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		PackageLevelCodeType packageLevelCode;

		PackagingTypeCodeType packagingTypeCode;

		PackageType containedPackage;

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

		public PackageLevelCodeType getPackageLevelCode() {
			return this.packageLevelCode;
		}

		public void setPackageLevelCode(PackageLevelCodeType value) {
			this.packageLevelCode = value;
		}

		public PackagingTypeCodeType getPackagingTypeCode() {
			return this.packagingTypeCode;
		}

		public void setPackagingTypeCode(PackagingTypeCodeType value) {
			this.packagingTypeCode = value;
		}

		public PackageType getContainedPackage() {
			return this.containedPackage;
		}

		public void setContainedPackage(PackageType value) {
			this.containedPackage = value;
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

	public PackageType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(PackageType value);

	public void update(PackageType value);

	public PackageType merge(PackageType value);

	public void delete(PackageType value);

	public void delete(Long id);
}
