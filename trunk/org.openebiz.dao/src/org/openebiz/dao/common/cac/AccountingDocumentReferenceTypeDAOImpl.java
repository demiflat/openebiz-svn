package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.AccountingDocumentReferenceType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class AccountingDocumentReferenceTypeDAOImpl extends HibernateDaoSupport implements
		AccountingDocumentReferenceTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(AccountingDocumentReferenceTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session
				.createCriteria(AccountingDocumentReferenceType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public AccountingDocumentReferenceType getById(Long id) {
		AccountingDocumentReferenceType value = null;
		Session session = getSession();
		value = (AccountingDocumentReferenceType) session.load(
				AccountingDocumentReferenceType.class, id);
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
				.createCriteria(AccountingDocumentReferenceType.class);
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
		if (criteria.getTaxCurrencyCode() != null) {
			newCriteria.add(Restrictions.eq("taxCurrencyCode", criteria
					.getTaxCurrencyCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("taxCurrencyCode")))
			newCriteria.addOrder(Order.asc("taxCurrencyCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("taxCurrencyCode")))
			newCriteria.addOrder(Order.desc("taxCurrencyCode"));
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
		if (criteria.getAccountingDocumentReferenceLine() != null) {
			newCriteria.add(Restrictions.eq("accountingDocumentReferenceLine",
					criteria.getAccountingDocumentReferenceLine()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending
						.contains("accountingDocumentReferenceLine")))
			newCriteria.addOrder(Order.asc("accountingDocumentReferenceLine"));
		else if ((criteria.descending != null)
				&& (criteria.descending
						.contains("accountingDocumentReferenceLine")))
			newCriteria.addOrder(Order.desc("accountingDocumentReferenceLine"));
		return newCriteria;
	}

	public void insert(AccountingDocumentReferenceType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(AccountingDocumentReferenceType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public AccountingDocumentReferenceType merge(
			AccountingDocumentReferenceType value) {
		AccountingDocumentReferenceType newValue = null;
		Session session = getSession();
		newValue = (AccountingDocumentReferenceType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(AccountingDocumentReferenceType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		AccountingDocumentReferenceType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
