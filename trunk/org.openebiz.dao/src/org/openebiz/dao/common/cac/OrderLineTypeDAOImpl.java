package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.OrderLineType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class OrderLineTypeDAOImpl extends HibernateDaoSupport implements OrderLineTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(OrderLineTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(OrderLineType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public OrderLineType getById(Long id) {
		OrderLineType value = null;
		Session session = getSession();
		value = (OrderLineType) session.load(OrderLineType.class, id);
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
		Criteria newCriteria = session.createCriteria(OrderLineType.class);
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
		if (criteria.getSubstitutionStatusCode() != null) {
			newCriteria.add(Restrictions.eq("substitutionStatusCode", criteria
					.getSubstitutionStatusCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("substitutionStatusCode")))
			newCriteria.addOrder(Order.asc("substitutionStatusCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("substitutionStatusCode")))
			newCriteria.addOrder(Order.desc("substitutionStatusCode"));
		if (criteria.getNote() != null) {
			newCriteria.add(Restrictions.eq("note", criteria.getNote()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("note")))
			newCriteria.addOrder(Order.asc("note"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("note")))
			newCriteria.addOrder(Order.desc("note"));
		if (criteria.getLineItem() != null) {
			newCriteria
					.add(Restrictions.eq("lineItem", criteria.getLineItem()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("lineItem")))
			newCriteria.addOrder(Order.asc("lineItem"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("lineItem")))
			newCriteria.addOrder(Order.desc("lineItem"));
		if (criteria.getQuotationLineReference() != null) {
			newCriteria.add(Restrictions.eq("quotationLineReference", criteria
					.getQuotationLineReference()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("quotationLineReference")))
			newCriteria.addOrder(Order.asc("quotationLineReference"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("quotationLineReference")))
			newCriteria.addOrder(Order.desc("quotationLineReference"));
		return newCriteria;
	}

	public void insert(OrderLineType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(OrderLineType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public OrderLineType merge(OrderLineType value) {
		OrderLineType newValue = null;
		Session session = getSession();
		newValue = (OrderLineType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(OrderLineType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		OrderLineType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
