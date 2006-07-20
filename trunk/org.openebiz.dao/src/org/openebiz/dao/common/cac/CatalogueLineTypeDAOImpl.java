package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.CatalogueLineType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class CatalogueLineTypeDAOImpl extends HibernateDaoSupport implements CatalogueLineTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(CatalogueLineTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(CatalogueLineType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public CatalogueLineType getById(Long id) {
		CatalogueLineType value = null;
		Session session = getSession();
		value = (CatalogueLineType) session.load(CatalogueLineType.class, id);
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
		Criteria newCriteria = session.createCriteria(CatalogueLineType.class);
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
		if (criteria.getActionCode() != null) {
			newCriteria.add(Restrictions.eq("actionCode", criteria
					.getActionCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("actionCode")))
			newCriteria.addOrder(Order.asc("actionCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("actionCode")))
			newCriteria.addOrder(Order.desc("actionCode"));
		if (criteria.getLifeCycleStatusCode() != null) {
			newCriteria.add(Restrictions.eq("lifeCycleStatusCode", criteria
					.getLifeCycleStatusCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("lifeCycleStatusCode")))
			newCriteria.addOrder(Order.asc("lifeCycleStatusCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("lifeCycleStatusCode")))
			newCriteria.addOrder(Order.desc("lifeCycleStatusCode"));
		if (criteria.getOrderingUnitMeasureID() != null) {
			newCriteria.add(Restrictions.eq("orderingUnitMeasureID", criteria
					.getOrderingUnitMeasureID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("orderingUnitMeasureID")))
			newCriteria.addOrder(Order.asc("orderingUnitMeasureID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("orderingUnitMeasureID")))
			newCriteria.addOrder(Order.desc("orderingUnitMeasureID"));
		if (criteria.getPackLevelCode() != null) {
			newCriteria.add(Restrictions.eq("packLevelCode", criteria
					.getPackLevelCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("packLevelCode")))
			newCriteria.addOrder(Order.asc("packLevelCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("packLevelCode")))
			newCriteria.addOrder(Order.desc("packLevelCode"));
		if (criteria.getInformationValidityPeriod() != null) {
			newCriteria.add(Restrictions.eq("informationValidityPeriod",
					criteria.getInformationValidityPeriod()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("informationValidityPeriod")))
			newCriteria.addOrder(Order.asc("informationValidityPeriod"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("informationValidityPeriod")))
			newCriteria.addOrder(Order.desc("informationValidityPeriod"));
		if (criteria.getItem() != null) {
			newCriteria.add(Restrictions.eq("item", criteria.getItem()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("item")))
			newCriteria.addOrder(Order.asc("item"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("item")))
			newCriteria.addOrder(Order.desc("item"));
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

	public void insert(CatalogueLineType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(CatalogueLineType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public CatalogueLineType merge(CatalogueLineType value) {
		CatalogueLineType newValue = null;
		Session session = getSession();
		newValue = (CatalogueLineType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(CatalogueLineType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		CatalogueLineType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
