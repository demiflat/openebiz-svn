package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.EndorserPartyType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class EndorserPartyTypeDAOImpl extends HibernateDaoSupport implements EndorserPartyTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(EndorserPartyTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(EndorserPartyType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public EndorserPartyType getById(Long id) {
		EndorserPartyType value = null;
		Session session = getSession();
		value = (EndorserPartyType) session.load(EndorserPartyType.class, id);
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
		Criteria newCriteria = session.createCriteria(EndorserPartyType.class);
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
		if (criteria.getRoleCode() != null) {
			newCriteria
					.add(Restrictions.eq("roleCode", criteria.getRoleCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("roleCode")))
			newCriteria.addOrder(Order.asc("roleCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("roleCode")))
			newCriteria.addOrder(Order.desc("roleCode"));
		if (criteria.getParty() != null) {
			newCriteria.add(Restrictions.eq("party", criteria.getParty()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("party")))
			newCriteria.addOrder(Order.asc("party"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("party")))
			newCriteria.addOrder(Order.desc("party"));
		if (criteria.getSignatoryContact() != null) {
			newCriteria.add(Restrictions.eq("signatoryContact", criteria
					.getSignatoryContact()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("signatoryContact")))
			newCriteria.addOrder(Order.asc("signatoryContact"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("signatoryContact")))
			newCriteria.addOrder(Order.desc("signatoryContact"));
		return newCriteria;
	}

	public void insert(EndorserPartyType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(EndorserPartyType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public EndorserPartyType merge(EndorserPartyType value) {
		EndorserPartyType newValue = null;
		Session session = getSession();
		newValue = (EndorserPartyType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(EndorserPartyType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		EndorserPartyType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
