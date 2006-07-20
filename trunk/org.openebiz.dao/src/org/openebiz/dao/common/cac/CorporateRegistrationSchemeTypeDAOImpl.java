package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.CorporateRegistrationSchemeType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class CorporateRegistrationSchemeTypeDAOImpl extends HibernateDaoSupport implements
		CorporateRegistrationSchemeTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(CorporateRegistrationSchemeTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session
				.createCriteria(CorporateRegistrationSchemeType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public CorporateRegistrationSchemeType getById(Long id) {
		CorporateRegistrationSchemeType value = null;
		Session session = getSession();
		value = (CorporateRegistrationSchemeType) session.load(
				CorporateRegistrationSchemeType.class, id);
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
				.createCriteria(CorporateRegistrationSchemeType.class);
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
		if (criteria.getCorporateRegistrationTypeCode() != null) {
			newCriteria.add(Restrictions.eq("corporateRegistrationTypeCode",
					criteria.getCorporateRegistrationTypeCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending
						.contains("corporateRegistrationTypeCode")))
			newCriteria.addOrder(Order.asc("corporateRegistrationTypeCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending
						.contains("corporateRegistrationTypeCode")))
			newCriteria.addOrder(Order.desc("corporateRegistrationTypeCode"));
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

	public void insert(CorporateRegistrationSchemeType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(CorporateRegistrationSchemeType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public CorporateRegistrationSchemeType merge(
			CorporateRegistrationSchemeType value) {
		CorporateRegistrationSchemeType newValue = null;
		Session session = getSession();
		newValue = (CorporateRegistrationSchemeType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(CorporateRegistrationSchemeType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		CorporateRegistrationSchemeType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
