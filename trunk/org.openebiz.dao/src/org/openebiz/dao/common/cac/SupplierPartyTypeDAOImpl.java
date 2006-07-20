package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.SupplierPartyType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class SupplierPartyTypeDAOImpl extends HibernateDaoSupport implements SupplierPartyTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(SupplierPartyTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(SupplierPartyType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public SupplierPartyType getById(Long id) {
		SupplierPartyType value = null;
		Session session = getSession();
		value = (SupplierPartyType) session.load(SupplierPartyType.class, id);
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
		Criteria newCriteria = session.createCriteria(SupplierPartyType.class);
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
		if (criteria.getShippingContact() != null) {
			newCriteria.add(Restrictions.eq("shippingContact", criteria
					.getShippingContact()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("shippingContact")))
			newCriteria.addOrder(Order.asc("shippingContact"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("shippingContact")))
			newCriteria.addOrder(Order.desc("shippingContact"));
		if (criteria.getAccountsContact() != null) {
			newCriteria.add(Restrictions.eq("accountsContact", criteria
					.getAccountsContact()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("accountsContact")))
			newCriteria.addOrder(Order.asc("accountsContact"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("accountsContact")))
			newCriteria.addOrder(Order.desc("accountsContact"));
		if (criteria.getOrderContact() != null) {
			newCriteria.add(Restrictions.eq("orderContact", criteria
					.getOrderContact()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("orderContact")))
			newCriteria.addOrder(Order.asc("orderContact"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("orderContact")))
			newCriteria.addOrder(Order.desc("orderContact"));
		return newCriteria;
	}

	public void insert(SupplierPartyType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(SupplierPartyType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public SupplierPartyType merge(SupplierPartyType value) {
		SupplierPartyType newValue = null;
		Session session = getSession();
		newValue = (SupplierPartyType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(SupplierPartyType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		SupplierPartyType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
