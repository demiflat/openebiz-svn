package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.TransactionConditionsType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class TransactionConditionsTypeDAOImpl extends HibernateDaoSupport implements
		TransactionConditionsTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(TransactionConditionsTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session
				.createCriteria(TransactionConditionsType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public TransactionConditionsType getById(Long id) {
		TransactionConditionsType value = null;
		Session session = getSession();
		value = (TransactionConditionsType) session.load(
				TransactionConditionsType.class, id);
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
		Criteria newCriteria = session
				.createCriteria(TransactionConditionsType.class);
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
		if (criteria.getActionCode() != null) {
			newCriteria.add(Restrictions.eq("actionCode", criteria
					.getActionCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("actionCode")))
			newCriteria.addOrder(Order.asc("actionCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("actionCode")))
			newCriteria.addOrder(Order.desc("actionCode"));
		if (criteria.getDescription() != null) {
			newCriteria.add(Restrictions.eq("description", criteria
					.getDescription()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("description")))
			newCriteria.addOrder(Order.asc("description"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("description")))
			newCriteria.addOrder(Order.desc("description"));
		if (criteria.getID() != null) {
			newCriteria.add(Restrictions.eq("ID", criteria.getID()));
		}
		if ((criteria.ascending != null) && (criteria.ascending.contains("ID")))
			newCriteria.addOrder(Order.asc("ID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("ID")))
			newCriteria.addOrder(Order.desc("ID"));
		return newCriteria;
	}

	public void insert(TransactionConditionsType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(TransactionConditionsType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public TransactionConditionsType merge(TransactionConditionsType value) {
		TransactionConditionsType newValue = null;
		Session session = getSession();
		newValue = (TransactionConditionsType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(TransactionConditionsType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		TransactionConditionsType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
