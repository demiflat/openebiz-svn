
package org.openebiz.dao.common.cbc;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cbc.FullnessIndicationCodeType;

public interface FullnessIndicationCodeTypeDAO {

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

	public FullnessIndicationCodeType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(FullnessIndicationCodeType value);

	public void update(FullnessIndicationCodeType value);

	public FullnessIndicationCodeType merge(FullnessIndicationCodeType value);

	public void delete(FullnessIndicationCodeType value);

	public void delete(Long id);
}
