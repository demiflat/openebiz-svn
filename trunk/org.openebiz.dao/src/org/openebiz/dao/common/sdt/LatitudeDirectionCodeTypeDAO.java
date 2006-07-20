package org.openebiz.dao.common.sdt;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.sdt.LatitudeDirectionCodeType;

public interface LatitudeDirectionCodeTypeDAO {

	public static class SearchCriteria {

		int startFrom;
		
		int maxResults;

		Set<String> ascending;

		Set<String> descending;

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

	public LatitudeDirectionCodeType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(LatitudeDirectionCodeType value);

	public void update(LatitudeDirectionCodeType value);

	public LatitudeDirectionCodeType merge(LatitudeDirectionCodeType value);

	public void delete(LatitudeDirectionCodeType value);

	public void delete(Long id);
}
