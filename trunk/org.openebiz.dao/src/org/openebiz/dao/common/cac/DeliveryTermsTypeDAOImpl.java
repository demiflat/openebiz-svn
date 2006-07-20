package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.DeliveryTermsType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class DeliveryTermsTypeDAOImpl extends HibernateDaoSupport implements DeliveryTermsTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(DeliveryTermsTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(DeliveryTermsType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public DeliveryTermsType getById(Long id) {
		DeliveryTermsType value = null;
		Session session = getSession();
		value = (DeliveryTermsType) session.load(DeliveryTermsType.class, id);
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
		Criteria newCriteria = session.createCriteria(DeliveryTermsType.class);
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
		if (criteria.getLossRiskResponsibilityCode() != null) {
			newCriteria.add(Restrictions.eq("lossRiskResponsibilityCode",
					criteria.getLossRiskResponsibilityCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("lossRiskResponsibilityCode")))
			newCriteria.addOrder(Order.asc("lossRiskResponsibilityCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("lossRiskResponsibilityCode")))
			newCriteria.addOrder(Order.desc("lossRiskResponsibilityCode"));
		if (criteria.getAllowanceCharge() != null) {
			newCriteria.add(Restrictions.eq("allowanceCharge", criteria
					.getAllowanceCharge()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("allowanceCharge")))
			newCriteria.addOrder(Order.asc("allowanceCharge"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("allowanceCharge")))
			newCriteria.addOrder(Order.desc("allowanceCharge"));
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

	public void insert(DeliveryTermsType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(DeliveryTermsType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public DeliveryTermsType merge(DeliveryTermsType value) {
		DeliveryTermsType newValue = null;
		Session session = getSession();
		newValue = (DeliveryTermsType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(DeliveryTermsType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		DeliveryTermsType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
