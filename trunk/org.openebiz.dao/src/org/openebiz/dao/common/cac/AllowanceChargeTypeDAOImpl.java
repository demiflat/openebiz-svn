package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.AllowanceChargeType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class AllowanceChargeTypeDAOImpl extends HibernateDaoSupport implements AllowanceChargeTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(AllowanceChargeTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(AllowanceChargeType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public AllowanceChargeType getById(Long id) {
		AllowanceChargeType value = null;
		Session session = getSession();
		value = (AllowanceChargeType) session.load(AllowanceChargeType.class,
				id);
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
				.createCriteria(AllowanceChargeType.class);
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
		if (criteria.getReasonCode() != null) {
			newCriteria.add(Restrictions.eq("reasonCode", criteria
					.getReasonCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("reasonCode")))
			newCriteria.addOrder(Order.asc("reasonCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("reasonCode")))
			newCriteria.addOrder(Order.desc("reasonCode"));
		if (criteria.getAccountingCostCode() != null) {
			newCriteria.add(Restrictions.eq("accountingCostCode", criteria
					.getAccountingCostCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("accountingCostCode")))
			newCriteria.addOrder(Order.asc("accountingCostCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("accountingCostCode")))
			newCriteria.addOrder(Order.desc("accountingCostCode"));
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

	public void insert(AllowanceChargeType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(AllowanceChargeType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public AllowanceChargeType merge(AllowanceChargeType value) {
		AllowanceChargeType newValue = null;
		Session session = getSession();
		newValue = (AllowanceChargeType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(AllowanceChargeType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		AllowanceChargeType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
