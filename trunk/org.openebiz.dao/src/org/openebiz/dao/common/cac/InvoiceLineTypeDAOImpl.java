package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.InvoiceLineType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class InvoiceLineTypeDAOImpl extends HibernateDaoSupport implements InvoiceLineTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(InvoiceLineTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(InvoiceLineType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public InvoiceLineType getById(Long id) {
		InvoiceLineType value = null;
		Session session = getSession();
		value = (InvoiceLineType) session.load(InvoiceLineType.class, id);
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
		Criteria newCriteria = session.createCriteria(InvoiceLineType.class);
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
		if (criteria.getNote() != null) {
			newCriteria.add(Restrictions.eq("note", criteria.getNote()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("note")))
			newCriteria.addOrder(Order.asc("note"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("note")))
			newCriteria.addOrder(Order.desc("note"));
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
		if (criteria.getItem() != null) {
			newCriteria.add(Restrictions.eq("item", criteria.getItem()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("item")))
			newCriteria.addOrder(Order.asc("item"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("item")))
			newCriteria.addOrder(Order.desc("item"));
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
		if (criteria.getGUID() != null) {
			newCriteria.add(Restrictions.eq("GUID", criteria.getGUID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("GUID")))
			newCriteria.addOrder(Order.asc("GUID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("GUID")))
			newCriteria.addOrder(Order.desc("GUID"));
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

	public void insert(InvoiceLineType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(InvoiceLineType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public InvoiceLineType merge(InvoiceLineType value) {
		InvoiceLineType newValue = null;
		Session session = getSession();
		newValue = (InvoiceLineType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(InvoiceLineType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		InvoiceLineType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
