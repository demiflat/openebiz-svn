package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.ReceiptLineType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class ReceiptLineTypeDAOImpl extends HibernateDaoSupport implements ReceiptLineTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(ReceiptLineTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(ReceiptLineType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public ReceiptLineType getById(Long id) {
		ReceiptLineType value = null;
		Session session = getSession();
		value = (ReceiptLineType) session.load(ReceiptLineType.class, id);
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
		Criteria newCriteria = session.createCriteria(ReceiptLineType.class);
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
		if (criteria.getNote() != null) {
			newCriteria.add(Restrictions.eq("note", criteria.getNote()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("note")))
			newCriteria.addOrder(Order.asc("note"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("note")))
			newCriteria.addOrder(Order.desc("note"));
		if (criteria.getShortageActionCode() != null) {
			newCriteria.add(Restrictions.eq("shortageActionCode", criteria
					.getShortageActionCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("shortageActionCode")))
			newCriteria.addOrder(Order.asc("shortageActionCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("shortageActionCode")))
			newCriteria.addOrder(Order.desc("shortageActionCode"));
		if (criteria.getRejectReasonCode() != null) {
			newCriteria.add(Restrictions.eq("rejectReasonCode", criteria
					.getRejectReasonCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("rejectReasonCode")))
			newCriteria.addOrder(Order.asc("rejectReasonCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("rejectReasonCode")))
			newCriteria.addOrder(Order.desc("rejectReasonCode"));
		if (criteria.getRejectActionCode() != null) {
			newCriteria.add(Restrictions.eq("rejectActionCode", criteria
					.getRejectActionCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("rejectActionCode")))
			newCriteria.addOrder(Order.asc("rejectActionCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("rejectActionCode")))
			newCriteria.addOrder(Order.desc("rejectActionCode"));
		if (criteria.getTimingComplaintCode() != null) {
			newCriteria.add(Restrictions.eq("timingComplaintCode", criteria
					.getTimingComplaintCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("timingComplaintCode")))
			newCriteria.addOrder(Order.asc("timingComplaintCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("timingComplaintCode")))
			newCriteria.addOrder(Order.desc("timingComplaintCode"));
		if (criteria.getOrderLineReference() != null) {
			newCriteria.add(Restrictions.eq("orderLineReference", criteria
					.getOrderLineReference()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("orderLineReference")))
			newCriteria.addOrder(Order.asc("orderLineReference"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("orderLineReference")))
			newCriteria.addOrder(Order.desc("orderLineReference"));
		if (criteria.getGUID() != null) {
			newCriteria.add(Restrictions.eq("GUID", criteria.getGUID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("GUID")))
			newCriteria.addOrder(Order.asc("GUID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("GUID")))
			newCriteria.addOrder(Order.desc("GUID"));
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

	public void insert(ReceiptLineType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(ReceiptLineType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public ReceiptLineType merge(ReceiptLineType value) {
		ReceiptLineType newValue = null;
		Session session = getSession();
		newValue = (ReceiptLineType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(ReceiptLineType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		ReceiptLineType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
