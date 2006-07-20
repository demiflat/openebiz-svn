
package org.openebiz.dao.common.cbc;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cbc.ExchangeMarketIDType;

public interface ExchangeMarketIDTypeDAO {

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

	public ExchangeMarketIDType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(ExchangeMarketIDType value);

	public void update(ExchangeMarketIDType value);

	public ExchangeMarketIDType merge(ExchangeMarketIDType value);

	public void delete(ExchangeMarketIDType value);

	public void delete(Long id);
}
