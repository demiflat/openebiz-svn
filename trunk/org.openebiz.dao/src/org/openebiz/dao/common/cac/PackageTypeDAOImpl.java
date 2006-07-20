package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.PackageType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class PackageTypeDAOImpl extends HibernateDaoSupport implements PackageTypeDAO {

	
	static private final Log log = LogFactory.getLog(PackageTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(PackageType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public PackageType getById(Long id) {
		PackageType value = null;
		Session session = getSession();
		value = (PackageType) session.load(PackageType.class, id);
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
		Criteria newCriteria = session.createCriteria(PackageType.class);
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
		if (criteria.getPackageLevelCode() != null) {
			newCriteria.add(Restrictions.eq("packageLevelCode", criteria
					.getPackageLevelCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("packageLevelCode")))
			newCriteria.addOrder(Order.asc("packageLevelCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("packageLevelCode")))
			newCriteria.addOrder(Order.desc("packageLevelCode"));
		if (criteria.getPackagingTypeCode() != null) {
			newCriteria.add(Restrictions.eq("packagingTypeCode", criteria
					.getPackagingTypeCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("packagingTypeCode")))
			newCriteria.addOrder(Order.asc("packagingTypeCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("packagingTypeCode")))
			newCriteria.addOrder(Order.desc("packagingTypeCode"));
		if (criteria.getContainedPackage() != null) {
			newCriteria.add(Restrictions.eq("containedPackage", criteria
					.getContainedPackage()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("containedPackage")))
			newCriteria.addOrder(Order.asc("containedPackage"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("containedPackage")))
			newCriteria.addOrder(Order.desc("containedPackage"));
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

	public void insert(PackageType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(PackageType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public PackageType merge(PackageType value) {
		PackageType newValue = null;
		Session session = getSession();
		newValue = (PackageType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(PackageType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		PackageType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
