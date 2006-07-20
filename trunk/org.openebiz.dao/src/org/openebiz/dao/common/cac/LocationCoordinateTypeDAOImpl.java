package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.LocationCoordinateType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class LocationCoordinateTypeDAOImpl extends HibernateDaoSupport implements LocationCoordinateTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(LocationCoordinateTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session
				.createCriteria(LocationCoordinateType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public LocationCoordinateType getById(Long id) {
		LocationCoordinateType value = null;
		Session session = getSession();
		value = (LocationCoordinateType) session.load(
				LocationCoordinateType.class, id);
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
				.createCriteria(LocationCoordinateType.class);
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
		if (criteria.getCoordinateSystemCode() != null) {
			newCriteria.add(Restrictions.eq("coordinateSystemCode", criteria
					.getCoordinateSystemCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("coordinateSystemCode")))
			newCriteria.addOrder(Order.asc("coordinateSystemCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("coordinateSystemCode")))
			newCriteria.addOrder(Order.desc("coordinateSystemCode"));
		if (criteria.getLatitudeDirectionCode() != null) {
			newCriteria.add(Restrictions.eq("latitudeDirectionCode", criteria
					.getLatitudeDirectionCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("latitudeDirectionCode")))
			newCriteria.addOrder(Order.asc("latitudeDirectionCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("latitudeDirectionCode")))
			newCriteria.addOrder(Order.desc("latitudeDirectionCode"));
		if (criteria.getLongitudeDirectionCode() != null) {
			newCriteria.add(Restrictions.eq("longitudeDirectionCode", criteria
					.getLongitudeDirectionCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("longitudeDirectionCode")))
			newCriteria.addOrder(Order.asc("longitudeDirectionCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("longitudeDirectionCode")))
			newCriteria.addOrder(Order.desc("longitudeDirectionCode"));
		return newCriteria;
	}

	public void insert(LocationCoordinateType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(LocationCoordinateType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public LocationCoordinateType merge(LocationCoordinateType value) {
		LocationCoordinateType newValue = null;
		Session session = getSession();
		newValue = (LocationCoordinateType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(LocationCoordinateType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		LocationCoordinateType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
