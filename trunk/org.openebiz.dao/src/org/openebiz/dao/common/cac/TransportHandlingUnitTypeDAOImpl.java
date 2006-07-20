package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.TransportHandlingUnitType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class TransportHandlingUnitTypeDAOImpl extends HibernateDaoSupport implements
		TransportHandlingUnitTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(TransportHandlingUnitTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session
				.createCriteria(TransportHandlingUnitType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public TransportHandlingUnitType getById(Long id) {
		TransportHandlingUnitType value = null;
		Session session = getSession();
		value = (TransportHandlingUnitType) session.load(
				TransportHandlingUnitType.class, id);
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
				.createCriteria(TransportHandlingUnitType.class);
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
		if (criteria.getTransportHandlingUnitTypeCode() != null) {
			newCriteria.add(Restrictions.eq("transportHandlingUnitTypeCode",
					criteria.getTransportHandlingUnitTypeCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending
						.contains("transportHandlingUnitTypeCode")))
			newCriteria.addOrder(Order.asc("transportHandlingUnitTypeCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending
						.contains("transportHandlingUnitTypeCode")))
			newCriteria.addOrder(Order.desc("transportHandlingUnitTypeCode"));
		if (criteria.getHandlingCode() != null) {
			newCriteria.add(Restrictions.eq("handlingCode", criteria
					.getHandlingCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("handlingCode")))
			newCriteria.addOrder(Order.asc("handlingCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("handlingCode")))
			newCriteria.addOrder(Order.desc("handlingCode"));
		if (criteria.getMinimumTemperature() != null) {
			newCriteria.add(Restrictions.eq("minimumTemperature", criteria
					.getMinimumTemperature()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("minimumTemperature")))
			newCriteria.addOrder(Order.asc("minimumTemperature"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("minimumTemperature")))
			newCriteria.addOrder(Order.desc("minimumTemperature"));
		if (criteria.getMaximumTemperature() != null) {
			newCriteria.add(Restrictions.eq("maximumTemperature", criteria
					.getMaximumTemperature()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("maximumTemperature")))
			newCriteria.addOrder(Order.asc("maximumTemperature"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("maximumTemperature")))
			newCriteria.addOrder(Order.desc("maximumTemperature"));
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

	public void insert(TransportHandlingUnitType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(TransportHandlingUnitType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public TransportHandlingUnitType merge(TransportHandlingUnitType value) {
		TransportHandlingUnitType newValue = null;
		Session session = getSession();
		newValue = (TransportHandlingUnitType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(TransportHandlingUnitType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		TransportHandlingUnitType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
