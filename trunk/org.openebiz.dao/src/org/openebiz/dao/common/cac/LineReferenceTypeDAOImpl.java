package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.LineReferenceType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class LineReferenceTypeDAOImpl extends HibernateDaoSupport implements LineReferenceTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(LineReferenceTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(LineReferenceType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public LineReferenceType getById(Long id) {
		LineReferenceType value = null;
		Session session = getSession();
		value = (LineReferenceType) session.load(LineReferenceType.class, id);
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
		Criteria newCriteria = session.createCriteria(LineReferenceType.class);
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
		if (criteria.getGloballyUniqueGUID() != null) {
			newCriteria.add(Restrictions.eq("globallyUniqueGUID", criteria
					.getGloballyUniqueGUID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("globallyUniqueGUID")))
			newCriteria.addOrder(Order.asc("globallyUniqueGUID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("globallyUniqueGUID")))
			newCriteria.addOrder(Order.desc("globallyUniqueGUID"));
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
		if (criteria.getDocumentReference() != null) {
			newCriteria.add(Restrictions.eq("documentReference", criteria
					.getDocumentReference()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("documentReference")))
			newCriteria.addOrder(Order.asc("documentReference"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("documentReference")))
			newCriteria.addOrder(Order.desc("documentReference"));
		if (criteria.getAccountingDocumentReference() != null) {
			newCriteria.add(Restrictions.eq("accountingDocumentReference",
					criteria.getAccountingDocumentReference()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("accountingDocumentReference")))
			newCriteria.addOrder(Order.asc("accountingDocumentReference"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("accountingDocumentReference")))
			newCriteria.addOrder(Order.desc("accountingDocumentReference"));
		return newCriteria;
	}

	public void insert(LineReferenceType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(LineReferenceType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public LineReferenceType merge(LineReferenceType value) {
		LineReferenceType newValue = null;
		Session session = getSession();
		newValue = (LineReferenceType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(LineReferenceType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		LineReferenceType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
