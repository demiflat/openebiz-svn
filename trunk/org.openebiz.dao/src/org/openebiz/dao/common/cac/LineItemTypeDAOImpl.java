package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.LineItemType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class LineItemTypeDAOImpl extends HibernateDaoSupport implements LineItemTypeDAO {

	
	static private final Log log = LogFactory.getLog(LineItemTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(LineItemType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public LineItemType getById(Long id) {
		LineItemType value = null;
		Session session = getSession();
		value = (LineItemType) session.load(LineItemType.class, id);
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
		Criteria newCriteria = session.createCriteria(LineItemType.class);
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
		if (criteria.getSalesOrderID() != null) {
			newCriteria.add(Restrictions.eq("salesOrderID", criteria
					.getSalesOrderID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("salesOrderID")))
			newCriteria.addOrder(Order.asc("salesOrderID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("salesOrderID")))
			newCriteria.addOrder(Order.desc("salesOrderID"));
		if (criteria.getGloballyUniqueGUID() != null) {
			newCriteria.add(Restrictions.eq("globallyUniqueGUID", criteria
					.getGloballyUniqueGUID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("globallyUniqueGUID")))
			newCriteria.addOrder(Order.asc("globallyUniqueGUID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("globallyUniqueGUID")))
			newCriteria.addOrder(Order.desc("globallyUniqueGUID"));
		if (criteria.getNote() != null) {
			newCriteria.add(Restrictions.eq("note", criteria.getNote()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("note")))
			newCriteria.addOrder(Order.asc("note"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("note")))
			newCriteria.addOrder(Order.desc("note"));
		if (criteria.getLineStatusCode() != null) {
			newCriteria.add(Restrictions.eq("lineStatusCode", criteria
					.getLineStatusCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("lineStatusCode")))
			newCriteria.addOrder(Order.asc("lineStatusCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("lineStatusCode")))
			newCriteria.addOrder(Order.desc("lineStatusCode"));
		if (criteria.getInspectionMethodCode() != null) {
			newCriteria.add(Restrictions.eq("inspectionMethodCode", criteria
					.getInspectionMethodCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("inspectionMethodCode")))
			newCriteria.addOrder(Order.asc("inspectionMethodCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("inspectionMethodCode")))
			newCriteria.addOrder(Order.desc("inspectionMethodCode"));
		if (criteria.getAccountingCostCode() != null) {
			newCriteria.add(Restrictions.eq("accountingCostCode", criteria
					.getAccountingCostCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("accountingCostCode")))
			newCriteria.addOrder(Order.asc("accountingCostCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("accountingCostCode")))
			newCriteria.addOrder(Order.desc("accountingCostCode"));
		if (criteria.getDeliveryTerms() != null) {
			newCriteria.add(Restrictions.eq("deliveryTerms", criteria
					.getDeliveryTerms()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("deliveryTerms")))
			newCriteria.addOrder(Order.asc("deliveryTerms"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("deliveryTerms")))
			newCriteria.addOrder(Order.desc("deliveryTerms"));
		if (criteria.getDestinationParty() != null) {
			newCriteria.add(Restrictions.eq("destinationParty", criteria
					.getDestinationParty()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("destinationParty")))
			newCriteria.addOrder(Order.asc("destinationParty"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("destinationParty")))
			newCriteria.addOrder(Order.desc("destinationParty"));
		if (criteria.getBasePrice() != null) {
			newCriteria.add(Restrictions.eq("basePrice", criteria
					.getBasePrice()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("basePrice")))
			newCriteria.addOrder(Order.asc("basePrice"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("basePrice")))
			newCriteria.addOrder(Order.desc("basePrice"));
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

	public void insert(LineItemType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(LineItemType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public LineItemType merge(LineItemType value) {
		LineItemType newValue = null;
		Session session = getSession();
		newValue = (LineItemType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(LineItemType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		LineItemType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
