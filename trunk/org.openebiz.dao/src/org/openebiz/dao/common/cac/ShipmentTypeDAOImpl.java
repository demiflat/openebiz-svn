package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.ShipmentType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class ShipmentTypeDAOImpl extends HibernateDaoSupport implements ShipmentTypeDAO {

	
	static private final Log log = LogFactory.getLog(ShipmentTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(ShipmentType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public ShipmentType getById(Long id) {
		ShipmentType value = null;
		Session session = getSession();
		value = (ShipmentType) session.load(ShipmentType.class, id);
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
		Criteria newCriteria = session.createCriteria(ShipmentType.class);
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
		if (criteria.getPriorityLevelCode() != null) {
			newCriteria.add(Restrictions.eq("priorityLevelCode", criteria
					.getPriorityLevelCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("priorityLevelCode")))
			newCriteria.addOrder(Order.asc("priorityLevelCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("priorityLevelCode")))
			newCriteria.addOrder(Order.desc("priorityLevelCode"));
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
		if (criteria.getInformation() != null) {
			newCriteria.add(Restrictions.eq("information", criteria
					.getInformation()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("information")))
			newCriteria.addOrder(Order.asc("information"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("information")))
			newCriteria.addOrder(Order.desc("information"));
		if (criteria.getConsignment() != null) {
			newCriteria.add(Restrictions.eq("consignment", criteria
					.getConsignment()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("consignment")))
			newCriteria.addOrder(Order.asc("consignment"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("consignment")))
			newCriteria.addOrder(Order.desc("consignment"));
		if (criteria.getTransportContract() != null) {
			newCriteria.add(Restrictions.eq("transportContract", criteria
					.getTransportContract()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("transportContract")))
			newCriteria.addOrder(Order.asc("transportContract"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("transportContract")))
			newCriteria.addOrder(Order.desc("transportContract"));
		if (criteria.getDelivery() != null) {
			newCriteria
					.add(Restrictions.eq("delivery", criteria.getDelivery()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("delivery")))
			newCriteria.addOrder(Order.asc("delivery"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("delivery")))
			newCriteria.addOrder(Order.desc("delivery"));
		if (criteria.getOriginAddress() != null) {
			newCriteria.add(Restrictions.eq("originAddress", criteria
					.getOriginAddress()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("originAddress")))
			newCriteria.addOrder(Order.asc("originAddress"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("originAddress")))
			newCriteria.addOrder(Order.desc("originAddress"));
		if (criteria.getFirstArrivalPort() != null) {
			newCriteria.add(Restrictions.eq("firstArrivalPort", criteria
					.getFirstArrivalPort()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("firstArrivalPort")))
			newCriteria.addOrder(Order.asc("firstArrivalPort"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("firstArrivalPort")))
			newCriteria.addOrder(Order.desc("firstArrivalPort"));
		if (criteria.getLastExitPort() != null) {
			newCriteria.add(Restrictions.eq("lastExitPort", criteria
					.getLastExitPort()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("lastExitPort")))
			newCriteria.addOrder(Order.asc("lastExitPort"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("lastExitPort")))
			newCriteria.addOrder(Order.desc("lastExitPort"));
		if (criteria.getExportCountry() != null) {
			newCriteria.add(Restrictions.eq("exportCountry", criteria
					.getExportCountry()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("exportCountry")))
			newCriteria.addOrder(Order.asc("exportCountry"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("exportCountry")))
			newCriteria.addOrder(Order.desc("exportCountry"));
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

	public void insert(ShipmentType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(ShipmentType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public ShipmentType merge(ShipmentType value) {
		ShipmentType newValue = null;
		Session session = getSession();
		newValue = (ShipmentType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(ShipmentType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		ShipmentType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
