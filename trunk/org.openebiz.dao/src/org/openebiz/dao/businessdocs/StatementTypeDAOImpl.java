package org.openebiz.dao.businessdocs;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.businessdocs.StatementType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class StatementTypeDAOImpl extends HibernateDaoSupport implements StatementTypeDAO {


	static private final Log log = LogFactory
			.getLog(StatementTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(StatementType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public StatementType getById(Long id) {
		StatementType value = null;
		Session session = getSession();
		value = (StatementType) session.load(StatementType.class, id);
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
		Criteria newCriteria = session.createCriteria(StatementType.class);
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
		if (criteria.getDocumentCurrencyCode() != null) {
			newCriteria.add(Restrictions.eq("documentCurrencyCode", criteria
					.getDocumentCurrencyCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("documentCurrencyCode")))
			newCriteria.addOrder(Order.asc("documentCurrencyCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("documentCurrencyCode")))
			newCriteria.addOrder(Order.desc("documentCurrencyCode"));
		if (criteria.getStatementPeriod() != null) {
			newCriteria.add(Restrictions.eq("statementPeriod", criteria
					.getStatementPeriod()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("statementPeriod")))
			newCriteria.addOrder(Order.asc("statementPeriod"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("statementPeriod")))
			newCriteria.addOrder(Order.desc("statementPeriod"));
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
		if (criteria.getDebtorCustomerParty() != null) {
			newCriteria.add(Restrictions.eq("debtorCustomerParty", criteria
					.getDebtorCustomerParty()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("debtorCustomerParty")))
			newCriteria.addOrder(Order.asc("debtorCustomerParty"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("debtorCustomerParty")))
			newCriteria.addOrder(Order.desc("debtorCustomerParty"));
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
		if (criteria.getPaymentMeans() != null) {
			newCriteria.add(Restrictions.eq("paymentMeans", criteria
					.getPaymentMeans()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("paymentMeans")))
			newCriteria.addOrder(Order.asc("paymentMeans"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("paymentMeans")))
			newCriteria.addOrder(Order.desc("paymentMeans"));
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

	public void insert(StatementType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(StatementType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public StatementType merge(StatementType value) {
		StatementType newValue = null;
		Session session = getSession();
		newValue = (StatementType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(StatementType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		StatementType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
