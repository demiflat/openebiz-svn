package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.CommodityClassificationType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class CommodityClassificationTypeDAOImpl extends HibernateDaoSupport implements
		CommodityClassificationTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(CommodityClassificationTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session
				.createCriteria(CommodityClassificationType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public CommodityClassificationType getById(Long id) {
		CommodityClassificationType value = null;
		Session session = getSession();
		value = (CommodityClassificationType) session.load(
				CommodityClassificationType.class, id);
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
				.createCriteria(CommodityClassificationType.class);
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
		if (criteria.getNatureCode() != null) {
			newCriteria.add(Restrictions.eq("natureCode", criteria
					.getNatureCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("natureCode")))
			newCriteria.addOrder(Order.asc("natureCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("natureCode")))
			newCriteria.addOrder(Order.desc("natureCode"));
		if (criteria.getCargoTypeCode() != null) {
			newCriteria.add(Restrictions.eq("cargoTypeCode", criteria
					.getCargoTypeCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("cargoTypeCode")))
			newCriteria.addOrder(Order.asc("cargoTypeCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("cargoTypeCode")))
			newCriteria.addOrder(Order.desc("cargoTypeCode"));
		if (criteria.getCommodityCode() != null) {
			newCriteria.add(Restrictions.eq("commodityCode", criteria
					.getCommodityCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("commodityCode")))
			newCriteria.addOrder(Order.asc("commodityCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("commodityCode")))
			newCriteria.addOrder(Order.desc("commodityCode"));
		if (criteria.getItemClassificationCode() != null) {
			newCriteria.add(Restrictions.eq("itemClassificationCode", criteria
					.getItemClassificationCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("itemClassificationCode")))
			newCriteria.addOrder(Order.asc("itemClassificationCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("itemClassificationCode")))
			newCriteria.addOrder(Order.desc("itemClassificationCode"));
		return newCriteria;
	}

	public void insert(CommodityClassificationType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(CommodityClassificationType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public CommodityClassificationType merge(CommodityClassificationType value) {
		CommodityClassificationType newValue = null;
		Session session = getSession();
		newValue = (CommodityClassificationType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(CommodityClassificationType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		CommodityClassificationType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
