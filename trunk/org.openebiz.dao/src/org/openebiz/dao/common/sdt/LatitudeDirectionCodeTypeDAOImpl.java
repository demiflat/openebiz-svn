package org.openebiz.dao.common.sdt;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.sdt.LatitudeDirectionCodeType;
import java.util.Iterator;
import org.hibernate.LockMode;

public class LatitudeDirectionCodeTypeDAOImpl extends HibernateDaoSupport implements
		LatitudeDirectionCodeTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(LatitudeDirectionCodeTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session
				.createCriteria(LatitudeDirectionCodeType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public LatitudeDirectionCodeType getById(Long id) {
		LatitudeDirectionCodeType value = null;
		Session session = getSession();
		value = (LatitudeDirectionCodeType) session.load(
				LatitudeDirectionCodeType.class, id);
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
				.createCriteria(LatitudeDirectionCodeType.class);
		return newCriteria;
	}

	public void insert(LatitudeDirectionCodeType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(LatitudeDirectionCodeType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public LatitudeDirectionCodeType merge(LatitudeDirectionCodeType value) {
		LatitudeDirectionCodeType newValue = null;
		Session session = getSession();
		newValue = (LatitudeDirectionCodeType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(LatitudeDirectionCodeType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		LatitudeDirectionCodeType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
