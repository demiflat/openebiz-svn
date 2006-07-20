package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.CustomerPartyType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class CustomerPartyTypeDAOImpl extends HibernateDaoSupport implements CustomerPartyTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(CustomerPartyTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(CustomerPartyType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public CustomerPartyType getById(Long id) {
		CustomerPartyType value = null;
		Session session = getSession();
		value = (CustomerPartyType) session.load(CustomerPartyType.class, id);
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
		Criteria newCriteria = session.createCriteria(CustomerPartyType.class);
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
		if (criteria.getCustomerAssignedAccountID() != null) {
			newCriteria.add(Restrictions.eq("customerAssignedAccountID",
					criteria.getCustomerAssignedAccountID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("customerAssignedAccountID")))
			newCriteria.addOrder(Order.asc("customerAssignedAccountID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("customerAssignedAccountID")))
			newCriteria.addOrder(Order.desc("customerAssignedAccountID"));
		if (criteria.getSupplierAssignedAccountID() != null) {
			newCriteria.add(Restrictions.eq("supplierAssignedAccountID",
					criteria.getSupplierAssignedAccountID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("supplierAssignedAccountID")))
			newCriteria.addOrder(Order.asc("supplierAssignedAccountID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("supplierAssignedAccountID")))
			newCriteria.addOrder(Order.desc("supplierAssignedAccountID"));
		if (criteria.getParty() != null) {
			newCriteria.add(Restrictions.eq("party", criteria.getParty()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("party")))
			newCriteria.addOrder(Order.asc("party"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("party")))
			newCriteria.addOrder(Order.desc("party"));
		return newCriteria;
	}

	public void insert(CustomerPartyType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(CustomerPartyType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public CustomerPartyType merge(CustomerPartyType value) {
		CustomerPartyType newValue = null;
		Session session = getSession();
		newValue = (CustomerPartyType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(CustomerPartyType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		CustomerPartyType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
