
package org.openebiz.dao.common.cbc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cbc.AuthorizationCodeType;
import java.util.Iterator;
import org.hibernate.LockMode;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class AuthorizationCodeTypeDAOImpl extends HibernateDaoSupport implements AuthorizationCodeTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(AuthorizationCodeTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session
				.createCriteria(AuthorizationCodeType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public AuthorizationCodeType getById(Long id) {
		AuthorizationCodeType value = null;
		Session session = getSession();
		value = (AuthorizationCodeType) session.load(
				AuthorizationCodeType.class, id);
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
				.createCriteria(AuthorizationCodeType.class);
		return newCriteria;
	}

	public void insert(AuthorizationCodeType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(AuthorizationCodeType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public AuthorizationCodeType merge(AuthorizationCodeType value) {
		AuthorizationCodeType newValue = null;
		Session session = getSession();
		newValue = (AuthorizationCodeType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(AuthorizationCodeType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		AuthorizationCodeType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
