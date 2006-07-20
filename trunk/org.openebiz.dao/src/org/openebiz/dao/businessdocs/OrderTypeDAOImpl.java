package org.openebiz.dao.businessdocs;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.businessdocs.OrderType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class OrderTypeDAOImpl extends HibernateDaoSupport implements OrderTypeDAO {


	static private final Log log = LogFactory.getLog(OrderTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(OrderType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public OrderType getById(Long id) {
		OrderType value = null;
		Session session = getSession();
		value = (OrderType) session.load(OrderType.class, id);
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
		Criteria newCriteria = session.createCriteria(OrderType.class);
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
		if (criteria.getNote() != null) {
			newCriteria.add(Restrictions.eq("note", criteria.getNote()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("note")))
			newCriteria.addOrder(Order.asc("note"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("note")))
			newCriteria.addOrder(Order.desc("note"));
		if (criteria.getRequestedInvoiceCurrencyCode() != null) {
			newCriteria.add(Restrictions.eq("requestedInvoiceCurrencyCode",
					criteria.getRequestedInvoiceCurrencyCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("requestedInvoiceCurrencyCode")))
			newCriteria.addOrder(Order.asc("requestedInvoiceCurrencyCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending
						.contains("requestedInvoiceCurrencyCode")))
			newCriteria.addOrder(Order.desc("requestedInvoiceCurrencyCode"));
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
		if (criteria.getQuotationDocumentReference() != null) {
			newCriteria.add(Restrictions.eq("quotationDocumentReference",
					criteria.getQuotationDocumentReference()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("quotationDocumentReference")))
			newCriteria.addOrder(Order.asc("quotationDocumentReference"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("quotationDocumentReference")))
			newCriteria.addOrder(Order.desc("quotationDocumentReference"));
		if (criteria.getOriginatorDocumentReference() != null) {
			newCriteria.add(Restrictions.eq("originatorDocumentReference",
					criteria.getOriginatorDocumentReference()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("originatorDocumentReference")))
			newCriteria.addOrder(Order.asc("originatorDocumentReference"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("originatorDocumentReference")))
			newCriteria.addOrder(Order.desc("originatorDocumentReference"));
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
		if (criteria.getFreightForwarderParty() != null) {
			newCriteria.add(Restrictions.eq("freightForwarderParty", criteria
					.getFreightForwarderParty()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("freightForwarderParty")))
			newCriteria.addOrder(Order.asc("freightForwarderParty"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("freightForwarderParty")))
			newCriteria.addOrder(Order.desc("freightForwarderParty"));
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

	public void insert(OrderType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(OrderType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public OrderType merge(OrderType value) {
		OrderType newValue = null;
		Session session = getSession();
		newValue = (OrderType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(OrderType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		OrderType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
