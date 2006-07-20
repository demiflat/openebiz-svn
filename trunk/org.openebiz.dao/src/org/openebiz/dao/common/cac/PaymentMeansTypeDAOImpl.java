package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.PaymentMeansType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class PaymentMeansTypeDAOImpl extends HibernateDaoSupport implements PaymentMeansTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(PaymentMeansTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(PaymentMeansType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public PaymentMeansType getById(Long id) {
		PaymentMeansType value = null;
		Session session = getSession();
		value = (PaymentMeansType) session.load(PaymentMeansType.class, id);
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
		Criteria newCriteria = session.createCriteria(PaymentMeansType.class);
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
		if (criteria.getPaymentMeansCode() != null) {
			newCriteria.add(Restrictions.eq("paymentMeansCode", criteria
					.getPaymentMeansCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("paymentMeansCode")))
			newCriteria.addOrder(Order.asc("paymentMeansCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("paymentMeansCode")))
			newCriteria.addOrder(Order.desc("paymentMeansCode"));
		if (criteria.getPaymentChannelCode() != null) {
			newCriteria.add(Restrictions.eq("paymentChannelCode", criteria
					.getPaymentChannelCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("paymentChannelCode")))
			newCriteria.addOrder(Order.asc("paymentChannelCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("paymentChannelCode")))
			newCriteria.addOrder(Order.desc("paymentChannelCode"));
		if (criteria.getCardAccount() != null) {
			newCriteria.add(Restrictions.eq("cardAccount", criteria
					.getCardAccount()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("cardAccount")))
			newCriteria.addOrder(Order.asc("cardAccount"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("cardAccount")))
			newCriteria.addOrder(Order.desc("cardAccount"));
		if (criteria.getPayerFinancialAccount() != null) {
			newCriteria.add(Restrictions.eq("payerFinancialAccount", criteria
					.getPayerFinancialAccount()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("payerFinancialAccount")))
			newCriteria.addOrder(Order.asc("payerFinancialAccount"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("payerFinancialAccount")))
			newCriteria.addOrder(Order.desc("payerFinancialAccount"));
		if (criteria.getPayeeFinancialAccount() != null) {
			newCriteria.add(Restrictions.eq("payeeFinancialAccount", criteria
					.getPayeeFinancialAccount()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("payeeFinancialAccount")))
			newCriteria.addOrder(Order.asc("payeeFinancialAccount"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("payeeFinancialAccount")))
			newCriteria.addOrder(Order.desc("payeeFinancialAccount"));
		if (criteria.getCreditAccount() != null) {
			newCriteria.add(Restrictions.eq("creditAccount", criteria
					.getCreditAccount()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("creditAccount")))
			newCriteria.addOrder(Order.asc("creditAccount"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("creditAccount")))
			newCriteria.addOrder(Order.desc("creditAccount"));
		return newCriteria;
	}

	public void insert(PaymentMeansType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(PaymentMeansType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public PaymentMeansType merge(PaymentMeansType value) {
		PaymentMeansType newValue = null;
		Session session = getSession();
		newValue = (PaymentMeansType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(PaymentMeansType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		PaymentMeansType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
