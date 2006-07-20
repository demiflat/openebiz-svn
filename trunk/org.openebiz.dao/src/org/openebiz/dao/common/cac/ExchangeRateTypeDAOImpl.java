package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.ExchangeRateType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class ExchangeRateTypeDAOImpl extends HibernateDaoSupport implements ExchangeRateTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(ExchangeRateTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(ExchangeRateType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public ExchangeRateType getById(Long id) {
		ExchangeRateType value = null;
		Session session = getSession();
		value = (ExchangeRateType) session.load(ExchangeRateType.class, id);
		return value;
	}

	public List findByCriteria(SearchCriteria criteria) {
		List values = null;
		Session session = getSession();
		Criteria crit = getHBCriteria(session, criteria);
		if (criteria.startFrom < criteria.maxResults && criteria.startFrom > -1) {
			crit.setFirstResult(criteria.startFrom);
			crit.setMaxResults(criteria.maxResults - criteria.startFrom);
		}
		values = crit.list();
		return values;
	}

	private Criteria getHBCriteria(Session session, SearchCriteria criteria) {
		Criteria newCriteria = session.createCriteria(ExchangeRateType.class);
		if (criteria.getInternalId() != null) {
			newCriteria.add(Restrictions.eq("internalId", criteria
					.getInternalId()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("internalId")))
			newCriteria.addOrder(Order.asc("internalId"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("internalId")))
			newCriteria.addOrder(Order.desc("internalId"));
		if (criteria.getVersion() != null) {
			newCriteria.add(Restrictions.eq("version", criteria.getVersion()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("version")))
			newCriteria.addOrder(Order.asc("version"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("version")))
			newCriteria.addOrder(Order.desc("version"));
		if (criteria.getSourceCurrencyCode() != null) {
			newCriteria.add(Restrictions.eq("sourceCurrencyCode", criteria
					.getSourceCurrencyCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("sourceCurrencyCode")))
			newCriteria.addOrder(Order.asc("sourceCurrencyCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("sourceCurrencyCode")))
			newCriteria.addOrder(Order.desc("sourceCurrencyCode"));
		if (criteria.getTargetCurrencyCode() != null) {
			newCriteria.add(Restrictions.eq("targetCurrencyCode", criteria
					.getTargetCurrencyCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("targetCurrencyCode")))
			newCriteria.addOrder(Order.asc("targetCurrencyCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("targetCurrencyCode")))
			newCriteria.addOrder(Order.desc("targetCurrencyCode"));
		if (criteria.getExchangeMarketID() != null) {
			newCriteria.add(Restrictions.eq("exchangeMarketID", criteria
					.getExchangeMarketID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("exchangeMarketID")))
			newCriteria.addOrder(Order.asc("exchangeMarketID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("exchangeMarketID")))
			newCriteria.addOrder(Order.desc("exchangeMarketID"));
		if (criteria.getOperatorCode() != null) {
			newCriteria.add(Restrictions.eq("operatorCode", criteria
					.getOperatorCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("operatorCode")))
			newCriteria.addOrder(Order.asc("operatorCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("operatorCode")))
			newCriteria.addOrder(Order.desc("operatorCode"));
		if (criteria.getForeignExchangeContract() != null) {
			newCriteria.add(Restrictions.eq("foreignExchangeContract", criteria
					.getForeignExchangeContract()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("foreignExchangeContract")))
			newCriteria.addOrder(Order.asc("foreignExchangeContract"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("foreignExchangeContract")))
			newCriteria.addOrder(Order.desc("foreignExchangeContract"));
		return newCriteria;
	}

	public void insert(ExchangeRateType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(ExchangeRateType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public ExchangeRateType merge(ExchangeRateType value) {
		ExchangeRateType newValue = null;
		Session session = getSession();
		newValue = (ExchangeRateType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(ExchangeRateType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		ExchangeRateType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
