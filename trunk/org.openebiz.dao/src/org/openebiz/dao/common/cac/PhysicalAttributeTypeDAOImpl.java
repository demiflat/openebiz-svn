package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.PhysicalAttributeType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class PhysicalAttributeTypeDAOImpl extends HibernateDaoSupport implements PhysicalAttributeTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(PhysicalAttributeTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session
				.createCriteria(PhysicalAttributeType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public PhysicalAttributeType getById(Long id) {
		PhysicalAttributeType value = null;
		Session session = getSession();
		value = (PhysicalAttributeType) session.load(
				PhysicalAttributeType.class, id);
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
				.createCriteria(PhysicalAttributeType.class);
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
		if (criteria.getAttributeID() != null) {
			newCriteria.add(Restrictions.eq("attributeID", criteria
					.getAttributeID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("attributeID")))
			newCriteria.addOrder(Order.asc("attributeID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("attributeID")))
			newCriteria.addOrder(Order.desc("attributeID"));
		if (criteria.getPositionCode() != null) {
			newCriteria.add(Restrictions.eq("positionCode", criteria
					.getPositionCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("positionCode")))
			newCriteria.addOrder(Order.asc("positionCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("positionCode")))
			newCriteria.addOrder(Order.desc("positionCode"));
		if (criteria.getDescriptionCode() != null) {
			newCriteria.add(Restrictions.eq("descriptionCode", criteria
					.getDescriptionCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("descriptionCode")))
			newCriteria.addOrder(Order.asc("descriptionCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("descriptionCode")))
			newCriteria.addOrder(Order.desc("descriptionCode"));
		if (criteria.getDescription() != null) {
			newCriteria.add(Restrictions.eq("description", criteria
					.getDescription()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("description")))
			newCriteria.addOrder(Order.asc("description"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("description")))
			newCriteria.addOrder(Order.desc("description"));
		return newCriteria;
	}

	public void insert(PhysicalAttributeType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(PhysicalAttributeType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public PhysicalAttributeType merge(PhysicalAttributeType value) {
		PhysicalAttributeType newValue = null;
		Session session = getSession();
		newValue = (PhysicalAttributeType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(PhysicalAttributeType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		PhysicalAttributeType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
