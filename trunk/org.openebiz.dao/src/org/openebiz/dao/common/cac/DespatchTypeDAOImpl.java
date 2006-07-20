package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.DespatchType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class DespatchTypeDAOImpl extends HibernateDaoSupport implements DespatchTypeDAO {

	
	static private final Log log = LogFactory.getLog(DespatchTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(DespatchType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public DespatchType getById(Long id) {
		DespatchType value = null;
		Session session = getSession();
		value = (DespatchType) session.load(DespatchType.class, id);
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
		Criteria newCriteria = session.createCriteria(DespatchType.class);
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
		if (criteria.getDespatchAddress() != null) {
			newCriteria.add(Restrictions.eq("despatchAddress", criteria
					.getDespatchAddress()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("despatchAddress")))
			newCriteria.addOrder(Order.asc("despatchAddress"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("despatchAddress")))
			newCriteria.addOrder(Order.desc("despatchAddress"));
		if (criteria.getDespatchParty() != null) {
			newCriteria.add(Restrictions.eq("despatchParty", criteria
					.getDespatchParty()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("despatchParty")))
			newCriteria.addOrder(Order.asc("despatchParty"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("despatchParty")))
			newCriteria.addOrder(Order.desc("despatchParty"));
		if (criteria.getContact() != null) {
			newCriteria.add(Restrictions.eq("contact", criteria.getContact()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("contact")))
			newCriteria.addOrder(Order.asc("contact"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("contact")))
			newCriteria.addOrder(Order.desc("contact"));
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

	public void insert(DespatchType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(DespatchType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public DespatchType merge(DespatchType value) {
		DespatchType newValue = null;
		Session session = getSession();
		newValue = (DespatchType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(DespatchType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		DespatchType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
