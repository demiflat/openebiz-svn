package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.HazardousGoodsTransitType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class HazardousGoodsTransitTypeDAOImpl extends HibernateDaoSupport implements
		HazardousGoodsTransitTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(HazardousGoodsTransitTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session
				.createCriteria(HazardousGoodsTransitType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public HazardousGoodsTransitType getById(Long id) {
		HazardousGoodsTransitType value = null;
		Session session = getSession();
		value = (HazardousGoodsTransitType) session.load(
				HazardousGoodsTransitType.class, id);
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
				.createCriteria(HazardousGoodsTransitType.class);
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
		if (criteria.getTransportEmergencyCardCode() != null) {
			newCriteria.add(Restrictions.eq("transportEmergencyCardCode",
					criteria.getTransportEmergencyCardCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("transportEmergencyCardCode")))
			newCriteria.addOrder(Order.asc("transportEmergencyCardCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("transportEmergencyCardCode")))
			newCriteria.addOrder(Order.desc("transportEmergencyCardCode"));
		if (criteria.getPackingCriteriaCode() != null) {
			newCriteria.add(Restrictions.eq("packingCriteriaCode", criteria
					.getPackingCriteriaCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("packingCriteriaCode")))
			newCriteria.addOrder(Order.asc("packingCriteriaCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("packingCriteriaCode")))
			newCriteria.addOrder(Order.desc("packingCriteriaCode"));
		if (criteria.getRegulationCode() != null) {
			newCriteria.add(Restrictions.eq("regulationCode", criteria
					.getRegulationCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("regulationCode")))
			newCriteria.addOrder(Order.asc("regulationCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("regulationCode")))
			newCriteria.addOrder(Order.desc("regulationCode"));
		if (criteria.getInhalationToxicityZoneCode() != null) {
			newCriteria.add(Restrictions.eq("inhalationToxicityZoneCode",
					criteria.getInhalationToxicityZoneCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("inhalationToxicityZoneCode")))
			newCriteria.addOrder(Order.asc("inhalationToxicityZoneCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("inhalationToxicityZoneCode")))
			newCriteria.addOrder(Order.desc("inhalationToxicityZoneCode"));
		if (criteria.getTransportAuthorizationCode() != null) {
			newCriteria.add(Restrictions.eq("transportAuthorizationCode",
					criteria.getTransportAuthorizationCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("transportAuthorizationCode")))
			newCriteria.addOrder(Order.asc("transportAuthorizationCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("transportAuthorizationCode")))
			newCriteria.addOrder(Order.desc("transportAuthorizationCode"));
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
		return newCriteria;
	}

	public void insert(HazardousGoodsTransitType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(HazardousGoodsTransitType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public HazardousGoodsTransitType merge(HazardousGoodsTransitType value) {
		HazardousGoodsTransitType newValue = null;
		Session session = getSession();
		newValue = (HazardousGoodsTransitType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(HazardousGoodsTransitType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		HazardousGoodsTransitType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
