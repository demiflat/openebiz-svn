package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.FinancialAccountType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class FinancialAccountTypeDAOImpl extends HibernateDaoSupport implements FinancialAccountTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(FinancialAccountTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(FinancialAccountType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public FinancialAccountType getById(Long id) {
		FinancialAccountType value = null;
		Session session = getSession();
		value = (FinancialAccountType) session.load(FinancialAccountType.class,
				id);
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
				.createCriteria(FinancialAccountType.class);
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
		if (criteria.getAccountTypeCode() != null) {
			newCriteria.add(Restrictions.eq("accountTypeCode", criteria
					.getAccountTypeCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("accountTypeCode")))
			newCriteria.addOrder(Order.asc("accountTypeCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("accountTypeCode")))
			newCriteria.addOrder(Order.desc("accountTypeCode"));
		if (criteria.getCurrencyCode() != null) {
			newCriteria.add(Restrictions.eq("currencyCode", criteria
					.getCurrencyCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("currencyCode")))
			newCriteria.addOrder(Order.asc("currencyCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("currencyCode")))
			newCriteria.addOrder(Order.desc("currencyCode"));
		if (criteria.getFinancialInstitutionBranch() != null) {
			newCriteria.add(Restrictions.eq("financialInstitutionBranch",
					criteria.getFinancialInstitutionBranch()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("financialInstitutionBranch")))
			newCriteria.addOrder(Order.asc("financialInstitutionBranch"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("financialInstitutionBranch")))
			newCriteria.addOrder(Order.desc("financialInstitutionBranch"));
		if (criteria.getCountry() != null) {
			newCriteria.add(Restrictions.eq("country", criteria.getCountry()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("country")))
			newCriteria.addOrder(Order.asc("country"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("country")))
			newCriteria.addOrder(Order.desc("country"));
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

	public void insert(FinancialAccountType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(FinancialAccountType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public FinancialAccountType merge(FinancialAccountType value) {
		FinancialAccountType newValue = null;
		Session session = getSession();
		newValue = (FinancialAccountType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(FinancialAccountType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		FinancialAccountType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
