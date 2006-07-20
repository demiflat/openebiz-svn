package org.openebiz.dao.common.cbc;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cbc.LossRiskResponsibilityCodeType;
import java.util.Iterator;
import org.hibernate.LockMode;

public class LossRiskResponsibilityCodeTypeDAOImpl extends HibernateDaoSupport implements
		LossRiskResponsibilityCodeTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(LossRiskResponsibilityCodeTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session
				.createCriteria(LossRiskResponsibilityCodeType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public LossRiskResponsibilityCodeType getById(Long id) {
		LossRiskResponsibilityCodeType value = null;
		Session session = getSession();
		value = (LossRiskResponsibilityCodeType) session.load(
				LossRiskResponsibilityCodeType.class, id);
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
				.createCriteria(LossRiskResponsibilityCodeType.class);
		return newCriteria;
	}

	public void insert(LossRiskResponsibilityCodeType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(LossRiskResponsibilityCodeType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public LossRiskResponsibilityCodeType merge(
			LossRiskResponsibilityCodeType value) {
		LossRiskResponsibilityCodeType newValue = null;
		Session session = getSession();
		newValue = (LossRiskResponsibilityCodeType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(LossRiskResponsibilityCodeType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		LossRiskResponsibilityCodeType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
