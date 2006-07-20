package org.openebiz.dao.businessdocs;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.businessdocs.QuotationType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class QuotationTypeDAOImpl extends HibernateDaoSupport implements QuotationTypeDAO {


	static private final Log log = LogFactory
			.getLog(QuotationTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(QuotationType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public QuotationType getById(Long id) {
		QuotationType value = null;
		Session session = getSession();
		value = (QuotationType) session.load(QuotationType.class, id);
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
		Criteria newCriteria = session.createCriteria(QuotationType.class);
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
		if (criteria.getValidityPeriod() != null) {
			newCriteria.add(Restrictions.eq("validityPeriod", criteria
					.getValidityPeriod()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("validityPeriod")))
			newCriteria.addOrder(Order.asc("validityPeriod"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("validityPeriod")))
			newCriteria.addOrder(Order.desc("validityPeriod"));
		if (criteria.getRequestForQuotationDocumentReference() != null) {
			newCriteria.add(Restrictions.eq(
					"requestForQuotationDocumentReference", criteria
							.getRequestForQuotationDocumentReference()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending
						.contains("requestForQuotationDocumentReference")))
			newCriteria.addOrder(Order
					.asc("requestForQuotationDocumentReference"));
		else if ((criteria.descending != null)
				&& (criteria.descending
						.contains("requestForQuotationDocumentReference")))
			newCriteria.addOrder(Order
					.desc("requestForQuotationDocumentReference"));
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
		if (criteria.getTransactionConditions() != null) {
			newCriteria.add(Restrictions.eq("transactionConditions", criteria
					.getTransactionConditions()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("transactionConditions")))
			newCriteria.addOrder(Order.asc("transactionConditions"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("transactionConditions")))
			newCriteria.addOrder(Order.desc("transactionConditions"));
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
		if (criteria.getLegalTotal() != null) {
			newCriteria.add(Restrictions.eq("legalTotal", criteria
					.getLegalTotal()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("legalTotal")))
			newCriteria.addOrder(Order.asc("legalTotal"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("legalTotal")))
			newCriteria.addOrder(Order.desc("legalTotal"));
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

	public void insert(QuotationType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(QuotationType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public QuotationType merge(QuotationType value) {
		QuotationType newValue = null;
		Session session = getSession();
		newValue = (QuotationType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(QuotationType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		QuotationType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
