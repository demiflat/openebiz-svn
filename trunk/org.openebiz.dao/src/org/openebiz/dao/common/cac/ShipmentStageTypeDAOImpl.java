package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.ShipmentStageType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class ShipmentStageTypeDAOImpl extends HibernateDaoSupport implements ShipmentStageTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(ShipmentStageTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(ShipmentStageType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public ShipmentStageType getById(Long id) {
		ShipmentStageType value = null;
		Session session = getSession();
		value = (ShipmentStageType) session.load(ShipmentStageType.class, id);
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
		Criteria newCriteria = session.createCriteria(ShipmentStageType.class);
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
		if (criteria.getTransportModeCode() != null) {
			newCriteria.add(Restrictions.eq("transportModeCode", criteria
					.getTransportModeCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("transportModeCode")))
			newCriteria.addOrder(Order.asc("transportModeCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("transportModeCode")))
			newCriteria.addOrder(Order.desc("transportModeCode"));
		if (criteria.getTransportMeansTypeCode() != null) {
			newCriteria.add(Restrictions.eq("transportMeansTypeCode", criteria
					.getTransportMeansTypeCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("transportMeansTypeCode")))
			newCriteria.addOrder(Order.asc("transportMeansTypeCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("transportMeansTypeCode")))
			newCriteria.addOrder(Order.desc("transportMeansTypeCode"));
		if (criteria.getTransitDirectionCode() != null) {
			newCriteria.add(Restrictions.eq("transitDirectionCode", criteria
					.getTransitDirectionCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("transitDirectionCode")))
			newCriteria.addOrder(Order.asc("transitDirectionCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("transitDirectionCode")))
			newCriteria.addOrder(Order.desc("transitDirectionCode"));
		if (criteria.getTransitPeriod() != null) {
			newCriteria.add(Restrictions.eq("transitPeriod", criteria
					.getTransitPeriod()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("transitPeriod")))
			newCriteria.addOrder(Order.asc("transitPeriod"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("transitPeriod")))
			newCriteria.addOrder(Order.desc("transitPeriod"));
		if (criteria.getTransportMeans() != null) {
			newCriteria.add(Restrictions.eq("transportMeans", criteria
					.getTransportMeans()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("transportMeans")))
			newCriteria.addOrder(Order.asc("transportMeans"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("transportMeans")))
			newCriteria.addOrder(Order.desc("transportMeans"));
		if (criteria.getLoadingPort() != null) {
			newCriteria.add(Restrictions.eq("loadingPort", criteria
					.getLoadingPort()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("loadingPort")))
			newCriteria.addOrder(Order.asc("loadingPort"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("loadingPort")))
			newCriteria.addOrder(Order.desc("loadingPort"));
		if (criteria.getUnloadingPort() != null) {
			newCriteria.add(Restrictions.eq("unloadingPort", criteria
					.getUnloadingPort()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("unloadingPort")))
			newCriteria.addOrder(Order.asc("unloadingPort"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("unloadingPort")))
			newCriteria.addOrder(Order.desc("unloadingPort"));
		if (criteria.getTransshipPort() != null) {
			newCriteria.add(Restrictions.eq("transshipPort", criteria
					.getTransshipPort()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("transshipPort")))
			newCriteria.addOrder(Order.asc("transshipPort"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("transshipPort")))
			newCriteria.addOrder(Order.desc("transshipPort"));
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

	public void insert(ShipmentStageType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(ShipmentStageType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public ShipmentStageType merge(ShipmentStageType value) {
		ShipmentStageType newValue = null;
		Session session = getSession();
		newValue = (ShipmentStageType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(ShipmentStageType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		ShipmentStageType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
