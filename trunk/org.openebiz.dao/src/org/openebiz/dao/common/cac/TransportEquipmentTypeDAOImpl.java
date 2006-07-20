package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.TransportEquipmentType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class TransportEquipmentTypeDAOImpl extends HibernateDaoSupport implements TransportEquipmentTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(TransportEquipmentTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session
				.createCriteria(TransportEquipmentType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public TransportEquipmentType getById(Long id) {
		TransportEquipmentType value = null;
		Session session = getSession();
		value = (TransportEquipmentType) session.load(
				TransportEquipmentType.class, id);
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
				.createCriteria(TransportEquipmentType.class);
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
		if (criteria.getProviderTypeCode() != null) {
			newCriteria.add(Restrictions.eq("providerTypeCode", criteria
					.getProviderTypeCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("providerTypeCode")))
			newCriteria.addOrder(Order.asc("providerTypeCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("providerTypeCode")))
			newCriteria.addOrder(Order.desc("providerTypeCode"));
		if (criteria.getOwnerTypeCode() != null) {
			newCriteria.add(Restrictions.eq("ownerTypeCode", criteria
					.getOwnerTypeCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("ownerTypeCode")))
			newCriteria.addOrder(Order.asc("ownerTypeCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("ownerTypeCode")))
			newCriteria.addOrder(Order.desc("ownerTypeCode"));
		if (criteria.getSizeTypeCode() != null) {
			newCriteria.add(Restrictions.eq("sizeTypeCode", criteria
					.getSizeTypeCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("sizeTypeCode")))
			newCriteria.addOrder(Order.asc("sizeTypeCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("sizeTypeCode")))
			newCriteria.addOrder(Order.desc("sizeTypeCode"));
		if (criteria.getDispositionCode() != null) {
			newCriteria.add(Restrictions.eq("dispositionCode", criteria
					.getDispositionCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("dispositionCode")))
			newCriteria.addOrder(Order.asc("dispositionCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("dispositionCode")))
			newCriteria.addOrder(Order.desc("dispositionCode"));
		if (criteria.getFullnessIndicationCode() != null) {
			newCriteria.add(Restrictions.eq("fullnessIndicationCode", criteria
					.getFullnessIndicationCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("fullnessIndicationCode")))
			newCriteria.addOrder(Order.asc("fullnessIndicationCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("fullnessIndicationCode")))
			newCriteria.addOrder(Order.desc("fullnessIndicationCode"));
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
		if (criteria.getProviderParty() != null) {
			newCriteria.add(Restrictions.eq("providerParty", criteria
					.getProviderParty()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("providerParty")))
			newCriteria.addOrder(Order.asc("providerParty"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("providerParty")))
			newCriteria.addOrder(Order.desc("providerParty"));
		if (criteria.getLoadingProofParty() != null) {
			newCriteria.add(Restrictions.eq("loadingProofParty", criteria
					.getLoadingProofParty()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("loadingProofParty")))
			newCriteria.addOrder(Order.asc("loadingProofParty"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("loadingProofParty")))
			newCriteria.addOrder(Order.desc("loadingProofParty"));
		if (criteria.getLoadingLocation() != null) {
			newCriteria.add(Restrictions.eq("loadingLocation", criteria
					.getLoadingLocation()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("loadingLocation")))
			newCriteria.addOrder(Order.asc("loadingLocation"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("loadingLocation")))
			newCriteria.addOrder(Order.desc("loadingLocation"));
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

	public void insert(TransportEquipmentType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(TransportEquipmentType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public TransportEquipmentType merge(TransportEquipmentType value) {
		TransportEquipmentType newValue = null;
		Session session = getSession();
		newValue = (TransportEquipmentType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(TransportEquipmentType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		TransportEquipmentType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
