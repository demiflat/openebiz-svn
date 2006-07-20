package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.HazardousItemType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class HazardousItemTypeDAOImpl extends HibernateDaoSupport implements HazardousItemTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(HazardousItemTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(HazardousItemType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public HazardousItemType getById(Long id) {
		HazardousItemType value = null;
		Session session = getSession();
		value = (HazardousItemType) session.load(HazardousItemType.class, id);
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
		Criteria newCriteria = session.createCriteria(HazardousItemType.class);
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
		if (criteria.getEmergencyProceduresCode() != null) {
			newCriteria.add(Restrictions.eq("emergencyProceduresCode", criteria
					.getEmergencyProceduresCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("emergencyProceduresCode")))
			newCriteria.addOrder(Order.asc("emergencyProceduresCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("emergencyProceduresCode")))
			newCriteria.addOrder(Order.desc("emergencyProceduresCode"));
		if (criteria.getMedicalFirstAidGuideCode() != null) {
			newCriteria.add(Restrictions.eq("medicalFirstAidGuideCode",
					criteria.getMedicalFirstAidGuideCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("medicalFirstAidGuideCode")))
			newCriteria.addOrder(Order.asc("medicalFirstAidGuideCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("medicalFirstAidGuideCode")))
			newCriteria.addOrder(Order.desc("medicalFirstAidGuideCode"));
		if (criteria.getCategoryCode() != null) {
			newCriteria.add(Restrictions.eq("categoryCode", criteria
					.getCategoryCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("categoryCode")))
			newCriteria.addOrder(Order.asc("categoryCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("categoryCode")))
			newCriteria.addOrder(Order.desc("categoryCode"));
		if (criteria.getUpperOrangeHazardPlacardID() != null) {
			newCriteria.add(Restrictions.eq("upperOrangeHazardPlacardID",
					criteria.getUpperOrangeHazardPlacardID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("upperOrangeHazardPlacardID")))
			newCriteria.addOrder(Order.asc("upperOrangeHazardPlacardID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("upperOrangeHazardPlacardID")))
			newCriteria.addOrder(Order.desc("upperOrangeHazardPlacardID"));
		if (criteria.getLowerOrangeHazardPlacardID() != null) {
			newCriteria.add(Restrictions.eq("lowerOrangeHazardPlacardID",
					criteria.getLowerOrangeHazardPlacardID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("lowerOrangeHazardPlacardID")))
			newCriteria.addOrder(Order.asc("lowerOrangeHazardPlacardID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("lowerOrangeHazardPlacardID")))
			newCriteria.addOrder(Order.desc("lowerOrangeHazardPlacardID"));
		if (criteria.getMarkingID() != null) {
			newCriteria.add(Restrictions.eq("markingID", criteria
					.getMarkingID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("markingID")))
			newCriteria.addOrder(Order.asc("markingID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("markingID")))
			newCriteria.addOrder(Order.desc("markingID"));
		if (criteria.getHazardClassID() != null) {
			newCriteria.add(Restrictions.eq("hazardClassID", criteria
					.getHazardClassID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("hazardClassID")))
			newCriteria.addOrder(Order.asc("hazardClassID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("hazardClassID")))
			newCriteria.addOrder(Order.desc("hazardClassID"));
		if (criteria.getContactParty() != null) {
			newCriteria.add(Restrictions.eq("contactParty", criteria
					.getContactParty()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("contactParty")))
			newCriteria.addOrder(Order.asc("contactParty"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("contactParty")))
			newCriteria.addOrder(Order.desc("contactParty"));
		if (criteria.getEmergencyTemperature() != null) {
			newCriteria.add(Restrictions.eq("emergencyTemperature", criteria
					.getEmergencyTemperature()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("emergencyTemperature")))
			newCriteria.addOrder(Order.asc("emergencyTemperature"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("emergencyTemperature")))
			newCriteria.addOrder(Order.desc("emergencyTemperature"));
		if (criteria.getFlashpointTemperature() != null) {
			newCriteria.add(Restrictions.eq("flashpointTemperature", criteria
					.getFlashpointTemperature()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("flashpointTemperature")))
			newCriteria.addOrder(Order.asc("flashpointTemperature"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("flashpointTemperature")))
			newCriteria.addOrder(Order.desc("flashpointTemperature"));
		if (criteria.getUNDGCode() != null) {
			newCriteria
					.add(Restrictions.eq("UNDGCode", criteria.getUNDGCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("UNDGCode")))
			newCriteria.addOrder(Order.asc("UNDGCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("UNDGCode")))
			newCriteria.addOrder(Order.desc("UNDGCode"));
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

	public void insert(HazardousItemType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(HazardousItemType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public HazardousItemType merge(HazardousItemType value) {
		HazardousItemType newValue = null;
		Session session = getSession();
		newValue = (HazardousItemType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(HazardousItemType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		HazardousItemType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
