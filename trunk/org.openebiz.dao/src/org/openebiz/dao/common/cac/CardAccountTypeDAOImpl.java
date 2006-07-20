package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.CardAccountType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class CardAccountTypeDAOImpl extends HibernateDaoSupport implements CardAccountTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(CardAccountTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(CardAccountType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public CardAccountType getById(Long id) {
		CardAccountType value = null;
		Session session = getSession();
		value = (CardAccountType) session.load(CardAccountType.class, id);
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
		Criteria newCriteria = session.createCriteria(CardAccountType.class);
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
		if (criteria.getPrimaryAccountNumberID() != null) {
			newCriteria.add(Restrictions.eq("primaryAccountNumberID", criteria
					.getPrimaryAccountNumberID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("primaryAccountNumberID")))
			newCriteria.addOrder(Order.asc("primaryAccountNumberID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("primaryAccountNumberID")))
			newCriteria.addOrder(Order.desc("primaryAccountNumberID"));
		if (criteria.getNetworkID() != null) {
			newCriteria.add(Restrictions.eq("networkID", criteria
					.getNetworkID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("networkID")))
			newCriteria.addOrder(Order.asc("networkID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("networkID")))
			newCriteria.addOrder(Order.desc("networkID"));
		if (criteria.getCardTypeCode() != null) {
			newCriteria.add(Restrictions.eq("cardTypeCode", criteria
					.getCardTypeCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("cardTypeCode")))
			newCriteria.addOrder(Order.asc("cardTypeCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("cardTypeCode")))
			newCriteria.addOrder(Order.desc("cardTypeCode"));
		if (criteria.getIssuerID() != null) {
			newCriteria
					.add(Restrictions.eq("issuerID", criteria.getIssuerID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("issuerID")))
			newCriteria.addOrder(Order.asc("issuerID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("issuerID")))
			newCriteria.addOrder(Order.desc("issuerID"));
		if (criteria.getIssueNumberID() != null) {
			newCriteria.add(Restrictions.eq("issueNumberID", criteria
					.getIssueNumberID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("issueNumberID")))
			newCriteria.addOrder(Order.asc("issueNumberID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("issueNumberID")))
			newCriteria.addOrder(Order.desc("issueNumberID"));
		if (criteria.getChipCode() != null) {
			newCriteria
					.add(Restrictions.eq("chipCode", criteria.getChipCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("chipCode")))
			newCriteria.addOrder(Order.asc("chipCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("chipCode")))
			newCriteria.addOrder(Order.desc("chipCode"));
		if (criteria.getChipApplicationID() != null) {
			newCriteria.add(Restrictions.eq("chipApplicationID", criteria
					.getChipApplicationID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("chipApplicationID")))
			newCriteria.addOrder(Order.asc("chipApplicationID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("chipApplicationID")))
			newCriteria.addOrder(Order.desc("chipApplicationID"));
		if (criteria.getCV2ID() != null) {
			newCriteria.add(Restrictions.eq("CV2ID", criteria.getCV2ID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("CV2ID")))
			newCriteria.addOrder(Order.asc("CV2ID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("CV2ID")))
			newCriteria.addOrder(Order.desc("CV2ID"));
		return newCriteria;
	}

	public void insert(CardAccountType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(CardAccountType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public CardAccountType merge(CardAccountType value) {
		CardAccountType newValue = null;
		Session session = getSession();
		newValue = (CardAccountType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(CardAccountType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		CardAccountType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
