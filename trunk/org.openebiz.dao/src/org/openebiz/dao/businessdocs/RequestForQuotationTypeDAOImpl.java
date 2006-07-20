package org.openebiz.dao.businessdocs;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.businessdocs.RequestForQuotationType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class RequestForQuotationTypeDAOImpl extends HibernateDaoSupport implements
		RequestForQuotationTypeDAO {


	static private final Log log = LogFactory
			.getLog(RequestForQuotationTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session
				.createCriteria(RequestForQuotationType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public RequestForQuotationType getById(Long id) {
		RequestForQuotationType value = null;
		Session session = getSession();
		value = (RequestForQuotationType) session.load(
				RequestForQuotationType.class, id);
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
				.createCriteria(RequestForQuotationType.class);
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
		if (criteria.getTransactionCurrencyCode() != null) {
			newCriteria.add(Restrictions.eq("transactionCurrencyCode", criteria
					.getTransactionCurrencyCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("transactionCurrencyCode")))
			newCriteria.addOrder(Order.asc("transactionCurrencyCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("transactionCurrencyCode")))
			newCriteria.addOrder(Order.desc("transactionCurrencyCode"));
		if (criteria.getPricingCurrencyCode() != null) {
			newCriteria.add(Restrictions.eq("pricingCurrencyCode", criteria
					.getPricingCurrencyCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("pricingCurrencyCode")))
			newCriteria.addOrder(Order.asc("pricingCurrencyCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("pricingCurrencyCode")))
			newCriteria.addOrder(Order.desc("pricingCurrencyCode"));
		if (criteria.getCatalogueDocumentReference() != null) {
			newCriteria.add(Restrictions.eq("catalogueDocumentReference",
					criteria.getCatalogueDocumentReference()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("catalogueDocumentReference")))
			newCriteria.addOrder(Order.asc("catalogueDocumentReference"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("catalogueDocumentReference")))
			newCriteria.addOrder(Order.desc("catalogueDocumentReference"));
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
		if (criteria.getDestinationCountry() != null) {
			newCriteria.add(Restrictions.eq("destinationCountry", criteria
					.getDestinationCountry()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("destinationCountry")))
			newCriteria.addOrder(Order.asc("destinationCountry"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("destinationCountry")))
			newCriteria.addOrder(Order.desc("destinationCountry"));
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

	public void insert(RequestForQuotationType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(RequestForQuotationType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public RequestForQuotationType merge(RequestForQuotationType value) {
		RequestForQuotationType newValue = null;
		Session session = getSession();
		newValue = (RequestForQuotationType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(RequestForQuotationType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		RequestForQuotationType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
