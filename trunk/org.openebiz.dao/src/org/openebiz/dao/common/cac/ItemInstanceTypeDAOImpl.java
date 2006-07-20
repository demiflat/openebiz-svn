package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.ItemInstanceType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class ItemInstanceTypeDAOImpl extends HibernateDaoSupport implements ItemInstanceTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(ItemInstanceTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(ItemInstanceType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public ItemInstanceType getById(Long id) {
		ItemInstanceType value = null;
		Session session = getSession();
		value = (ItemInstanceType) session.load(ItemInstanceType.class, id);
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
		Criteria newCriteria = session.createCriteria(ItemInstanceType.class);
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
		if (criteria.getProductTraceID() != null) {
			newCriteria.add(Restrictions.eq("productTraceID", criteria
					.getProductTraceID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("productTraceID")))
			newCriteria.addOrder(Order.asc("productTraceID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("productTraceID")))
			newCriteria.addOrder(Order.desc("productTraceID"));
		if (criteria.getRegistrationID() != null) {
			newCriteria.add(Restrictions.eq("registrationID", criteria
					.getRegistrationID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("registrationID")))
			newCriteria.addOrder(Order.asc("registrationID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("registrationID")))
			newCriteria.addOrder(Order.desc("registrationID"));
		if (criteria.getSerialID() != null) {
			newCriteria
					.add(Restrictions.eq("serialID", criteria.getSerialID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("serialID")))
			newCriteria.addOrder(Order.asc("serialID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("serialID")))
			newCriteria.addOrder(Order.desc("serialID"));
		return newCriteria;
	}

	public void insert(ItemInstanceType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(ItemInstanceType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public ItemInstanceType merge(ItemInstanceType value) {
		ItemInstanceType newValue = null;
		Session session = getSession();
		newValue = (ItemInstanceType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(ItemInstanceType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		ItemInstanceType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
