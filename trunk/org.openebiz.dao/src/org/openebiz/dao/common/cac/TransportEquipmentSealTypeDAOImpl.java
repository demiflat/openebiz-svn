package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.TransportEquipmentSealType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class TransportEquipmentSealTypeDAOImpl extends HibernateDaoSupport implements
		TransportEquipmentSealTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(TransportEquipmentSealTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session
				.createCriteria(TransportEquipmentSealType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public TransportEquipmentSealType getById(Long id) {
		TransportEquipmentSealType value = null;
		Session session = getSession();
		value = (TransportEquipmentSealType) session.load(
				TransportEquipmentSealType.class, id);
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
				.createCriteria(TransportEquipmentSealType.class);
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
		if (criteria.getSealIssuerTypeCode() != null) {
			newCriteria.add(Restrictions.eq("sealIssuerTypeCode", criteria
					.getSealIssuerTypeCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("sealIssuerTypeCode")))
			newCriteria.addOrder(Order.asc("sealIssuerTypeCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("sealIssuerTypeCode")))
			newCriteria.addOrder(Order.desc("sealIssuerTypeCode"));
		if (criteria.getSealStatusCode() != null) {
			newCriteria.add(Restrictions.eq("sealStatusCode", criteria
					.getSealStatusCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("sealStatusCode")))
			newCriteria.addOrder(Order.asc("sealStatusCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("sealStatusCode")))
			newCriteria.addOrder(Order.desc("sealStatusCode"));
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

	public void insert(TransportEquipmentSealType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(TransportEquipmentSealType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public TransportEquipmentSealType merge(TransportEquipmentSealType value) {
		TransportEquipmentSealType newValue = null;
		Session session = getSession();
		newValue = (TransportEquipmentSealType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(TransportEquipmentSealType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		TransportEquipmentSealType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
