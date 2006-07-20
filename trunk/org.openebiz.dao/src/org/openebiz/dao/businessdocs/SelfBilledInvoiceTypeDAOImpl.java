package org.openebiz.dao.businessdocs;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.businessdocs.SelfBilledInvoiceType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class SelfBilledInvoiceTypeDAOImpl extends HibernateDaoSupport implements SelfBilledInvoiceTypeDAO {


	static private final Log log = LogFactory
			.getLog(SelfBilledInvoiceTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session
				.createCriteria(SelfBilledInvoiceType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public SelfBilledInvoiceType getById(Long id) {
		SelfBilledInvoiceType value = null;
		Session session = getSession();
		value = (SelfBilledInvoiceType) session.load(
				SelfBilledInvoiceType.class, id);
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
				.createCriteria(SelfBilledInvoiceType.class);
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
		if (criteria.getInvoiceTypeCode() != null) {
			newCriteria.add(Restrictions.eq("invoiceTypeCode", criteria
					.getInvoiceTypeCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("invoiceTypeCode")))
			newCriteria.addOrder(Order.asc("invoiceTypeCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("invoiceTypeCode")))
			newCriteria.addOrder(Order.desc("invoiceTypeCode"));
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

	public void insert(SelfBilledInvoiceType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(SelfBilledInvoiceType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public SelfBilledInvoiceType merge(SelfBilledInvoiceType value) {
		SelfBilledInvoiceType newValue = null;
		Session session = getSession();
		newValue = (SelfBilledInvoiceType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(SelfBilledInvoiceType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		SelfBilledInvoiceType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
