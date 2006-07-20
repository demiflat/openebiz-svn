package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.TransportMeansType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class TransportMeansTypeDAOImpl extends HibernateDaoSupport implements TransportMeansTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(TransportMeansTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(TransportMeansType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public TransportMeansType getById(Long id) {
		TransportMeansType value = null;
		Session session = getSession();
		value = (TransportMeansType) session.load(TransportMeansType.class, id);
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
		Criteria newCriteria = session.createCriteria(TransportMeansType.class);
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
		if (criteria.getJourneyID() != null) {
			newCriteria.add(Restrictions.eq("journeyID", criteria
					.getJourneyID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("journeyID")))
			newCriteria.addOrder(Order.asc("journeyID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("journeyID")))
			newCriteria.addOrder(Order.desc("journeyID"));
		if (criteria.getRegistrationNationalityID() != null) {
			newCriteria.add(Restrictions.eq("registrationNationalityID",
					criteria.getRegistrationNationalityID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("registrationNationalityID")))
			newCriteria.addOrder(Order.asc("registrationNationalityID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("registrationNationalityID")))
			newCriteria.addOrder(Order.desc("registrationNationalityID"));
		if (criteria.getDirectionCode() != null) {
			newCriteria.add(Restrictions.eq("directionCode", criteria
					.getDirectionCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("directionCode")))
			newCriteria.addOrder(Order.asc("directionCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("directionCode")))
			newCriteria.addOrder(Order.desc("directionCode"));
		if (criteria.getStowage() != null) {
			newCriteria.add(Restrictions.eq("stowage", criteria.getStowage()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("stowage")))
			newCriteria.addOrder(Order.asc("stowage"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("stowage")))
			newCriteria.addOrder(Order.desc("stowage"));
		if (criteria.getAirTransport() != null) {
			newCriteria.add(Restrictions.eq("airTransport", criteria
					.getAirTransport()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("airTransport")))
			newCriteria.addOrder(Order.asc("airTransport"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("airTransport")))
			newCriteria.addOrder(Order.desc("airTransport"));
		if (criteria.getRoadTransport() != null) {
			newCriteria.add(Restrictions.eq("roadTransport", criteria
					.getRoadTransport()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("roadTransport")))
			newCriteria.addOrder(Order.asc("roadTransport"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("roadTransport")))
			newCriteria.addOrder(Order.desc("roadTransport"));
		if (criteria.getRailTransport() != null) {
			newCriteria.add(Restrictions.eq("railTransport", criteria
					.getRailTransport()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("railTransport")))
			newCriteria.addOrder(Order.asc("railTransport"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("railTransport")))
			newCriteria.addOrder(Order.desc("railTransport"));
		if (criteria.getMaritimeTransport() != null) {
			newCriteria.add(Restrictions.eq("maritimeTransport", criteria
					.getMaritimeTransport()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("maritimeTransport")))
			newCriteria.addOrder(Order.asc("maritimeTransport"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("maritimeTransport")))
			newCriteria.addOrder(Order.desc("maritimeTransport"));
		if (criteria.getOwnerParty() != null) {
			newCriteria.add(Restrictions.eq("ownerParty", criteria
					.getOwnerParty()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("ownerParty")))
			newCriteria.addOrder(Order.asc("ownerParty"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("ownerParty")))
			newCriteria.addOrder(Order.desc("ownerParty"));
		return newCriteria;
	}

	public void insert(TransportMeansType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(TransportMeansType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public TransportMeansType merge(TransportMeansType value) {
		TransportMeansType newValue = null;
		Session session = getSession();
		newValue = (TransportMeansType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(TransportMeansType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		TransportMeansType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
