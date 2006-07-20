package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.OrderLineReferenceType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class OrderLineReferenceTypeDAOImpl extends HibernateDaoSupport implements OrderLineReferenceTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(OrderLineReferenceTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session
				.createCriteria(OrderLineReferenceType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public OrderLineReferenceType getById(Long id) {
		OrderLineReferenceType value = null;
		Session session = getSession();
		value = (OrderLineReferenceType) session.load(
				OrderLineReferenceType.class, id);
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
				.createCriteria(OrderLineReferenceType.class);
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
		if (criteria.getLineID() != null) {
			newCriteria.add(Restrictions.eq("lineID", criteria.getLineID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("lineID")))
			newCriteria.addOrder(Order.asc("lineID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("lineID")))
			newCriteria.addOrder(Order.desc("lineID"));
		if (criteria.getSalesOrderLineID() != null) {
			newCriteria.add(Restrictions.eq("salesOrderLineID", criteria
					.getSalesOrderLineID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("salesOrderLineID")))
			newCriteria.addOrder(Order.asc("salesOrderLineID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("salesOrderLineID")))
			newCriteria.addOrder(Order.desc("salesOrderLineID"));
		if (criteria.getLineStatusCode() != null) {
			newCriteria.add(Restrictions.eq("lineStatusCode", criteria
					.getLineStatusCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("lineStatusCode")))
			newCriteria.addOrder(Order.asc("lineStatusCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("lineStatusCode")))
			newCriteria.addOrder(Order.desc("lineStatusCode"));
		if (criteria.getOrderReference() != null) {
			newCriteria.add(Restrictions.eq("orderReference", criteria
					.getOrderReference()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("orderReference")))
			newCriteria.addOrder(Order.asc("orderReference"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("orderReference")))
			newCriteria.addOrder(Order.desc("orderReference"));
		if (criteria.getGUID() != null) {
			newCriteria.add(Restrictions.eq("GUID", criteria.getGUID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("GUID")))
			newCriteria.addOrder(Order.asc("GUID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("GUID")))
			newCriteria.addOrder(Order.desc("GUID"));
		return newCriteria;
	}

	public void insert(OrderLineReferenceType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(OrderLineReferenceType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public OrderLineReferenceType merge(OrderLineReferenceType value) {
		OrderLineReferenceType newValue = null;
		Session session = getSession();
		newValue = (OrderLineReferenceType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(OrderLineReferenceType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		OrderLineReferenceType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
