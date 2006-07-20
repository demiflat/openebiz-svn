package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.RemittanceAdviceLineType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class RemittanceAdviceLineTypeDAOImpl extends HibernateDaoSupport implements
		RemittanceAdviceLineTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(RemittanceAdviceLineTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session
				.createCriteria(RemittanceAdviceLineType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public RemittanceAdviceLineType getById(Long id) {
		RemittanceAdviceLineType value = null;
		Session session = getSession();
		value = (RemittanceAdviceLineType) session.load(
				RemittanceAdviceLineType.class, id);
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
				.createCriteria(RemittanceAdviceLineType.class);
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
		if (criteria.getCreditorSupplierParty() != null) {
			newCriteria.add(Restrictions.eq("creditorSupplierParty", criteria
					.getCreditorSupplierParty()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("creditorSupplierParty")))
			newCriteria.addOrder(Order.asc("creditorSupplierParty"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("creditorSupplierParty")))
			newCriteria.addOrder(Order.desc("creditorSupplierParty"));
		if (criteria.getDebtorSupplierParty() != null) {
			newCriteria.add(Restrictions.eq("debtorSupplierParty", criteria
					.getDebtorSupplierParty()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("debtorSupplierParty")))
			newCriteria.addOrder(Order.asc("debtorSupplierParty"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("debtorSupplierParty")))
			newCriteria.addOrder(Order.desc("debtorSupplierParty"));
		if (criteria.getBuyerCustomerParty() != null) {
			newCriteria.add(Restrictions.eq("buyerCustomerParty", criteria
					.getBuyerCustomerParty()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("buyerCustomerParty")))
			newCriteria.addOrder(Order.asc("buyerCustomerParty"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("buyerCustomerParty")))
			newCriteria.addOrder(Order.desc("buyerCustomerParty"));
		if (criteria.getSellerSupplierParty() != null) {
			newCriteria.add(Restrictions.eq("sellerSupplierParty", criteria
					.getSellerSupplierParty()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("sellerSupplierParty")))
			newCriteria.addOrder(Order.asc("sellerSupplierParty"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("sellerSupplierParty")))
			newCriteria.addOrder(Order.desc("sellerSupplierParty"));
		if (criteria.getOriginatorCustomerParty() != null) {
			newCriteria.add(Restrictions.eq("originatorCustomerParty", criteria
					.getOriginatorCustomerParty()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("originatorCustomerParty")))
			newCriteria.addOrder(Order.asc("originatorCustomerParty"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("originatorCustomerParty")))
			newCriteria.addOrder(Order.desc("originatorCustomerParty"));
		if (criteria.getPayeeParty() != null) {
			newCriteria.add(Restrictions.eq("payeeParty", criteria
					.getPayeeParty()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("payeeParty")))
			newCriteria.addOrder(Order.asc("payeeParty"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("payeeParty")))
			newCriteria.addOrder(Order.desc("payeeParty"));
		if (criteria.getExchangeRate() != null) {
			newCriteria.add(Restrictions.eq("exchangeRate", criteria
					.getExchangeRate()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("exchangeRate")))
			newCriteria.addOrder(Order.asc("exchangeRate"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("exchangeRate")))
			newCriteria.addOrder(Order.desc("exchangeRate"));
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

	public void insert(RemittanceAdviceLineType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(RemittanceAdviceLineType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public RemittanceAdviceLineType merge(RemittanceAdviceLineType value) {
		RemittanceAdviceLineType newValue = null;
		Session session = getSession();
		newValue = (RemittanceAdviceLineType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(RemittanceAdviceLineType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		RemittanceAdviceLineType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
