package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.DeliveryType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class DeliveryTypeDAOImpl extends HibernateDaoSupport implements DeliveryTypeDAO {

	
	static private final Log log = LogFactory.getLog(DeliveryTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(DeliveryType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public DeliveryType getById(Long id) {
		DeliveryType value = null;
		Session session = getSession();
		value = (DeliveryType) session.load(DeliveryType.class, id);
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
		Criteria newCriteria = session.createCriteria(DeliveryType.class);
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
		if (criteria.getDeliveryAddress() != null) {
			newCriteria.add(Restrictions.eq("deliveryAddress", criteria
					.getDeliveryAddress()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("deliveryAddress")))
			newCriteria.addOrder(Order.asc("deliveryAddress"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("deliveryAddress")))
			newCriteria.addOrder(Order.desc("deliveryAddress"));
		if (criteria.getContact() != null) {
			newCriteria.add(Restrictions.eq("contact", criteria.getContact()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("contact")))
			newCriteria.addOrder(Order.asc("contact"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("contact")))
			newCriteria.addOrder(Order.desc("contact"));
		if (criteria.getOriginatorParty() != null) {
			newCriteria.add(Restrictions.eq("originatorParty", criteria
					.getOriginatorParty()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("originatorParty")))
			newCriteria.addOrder(Order.asc("originatorParty"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("originatorParty")))
			newCriteria.addOrder(Order.desc("originatorParty"));
		if (criteria.getDespatch() != null) {
			newCriteria
					.add(Restrictions.eq("despatch", criteria.getDespatch()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("despatch")))
			newCriteria.addOrder(Order.asc("despatch"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("despatch")))
			newCriteria.addOrder(Order.desc("despatch"));
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

	public void insert(DeliveryType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(DeliveryType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public DeliveryType merge(DeliveryType value) {
		DeliveryType newValue = null;
		Session session = getSession();
		newValue = (DeliveryType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(DeliveryType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		DeliveryType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
