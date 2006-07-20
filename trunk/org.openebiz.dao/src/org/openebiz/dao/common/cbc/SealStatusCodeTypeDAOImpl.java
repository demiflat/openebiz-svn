package org.openebiz.dao.common.cbc;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cbc.SealStatusCodeType;
import java.util.Iterator;
import org.hibernate.LockMode;

public class SealStatusCodeTypeDAOImpl extends HibernateDaoSupport implements SealStatusCodeTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(SealStatusCodeTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(SealStatusCodeType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public SealStatusCodeType getById(Long id) {
		SealStatusCodeType value = null;
		Session session = getSession();
		value = (SealStatusCodeType) session.load(SealStatusCodeType.class, id);
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
		Criteria newCriteria = session.createCriteria(SealStatusCodeType.class);
		return newCriteria;
	}

	public void insert(SealStatusCodeType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(SealStatusCodeType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public SealStatusCodeType merge(SealStatusCodeType value) {
		SealStatusCodeType newValue = null;
		Session session = getSession();
		newValue = (SealStatusCodeType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(SealStatusCodeType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		SealStatusCodeType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
