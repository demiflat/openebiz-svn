package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.PartyLegalEntityType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class PartyLegalEntityTypeDAOImpl extends HibernateDaoSupport implements PartyLegalEntityTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(PartyLegalEntityTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(PartyLegalEntityType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public PartyLegalEntityType getById(Long id) {
		PartyLegalEntityType value = null;
		Session session = getSession();
		value = (PartyLegalEntityType) session.load(PartyLegalEntityType.class,
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
				.createCriteria(PartyLegalEntityType.class);
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
		if (criteria.getCompanyID() != null) {
			newCriteria.add(Restrictions.eq("companyID", criteria
					.getCompanyID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("companyID")))
			newCriteria.addOrder(Order.asc("companyID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("companyID")))
			newCriteria.addOrder(Order.desc("companyID"));
		if (criteria.getRegistrationAddress() != null) {
			newCriteria.add(Restrictions.eq("registrationAddress", criteria
					.getRegistrationAddress()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("registrationAddress")))
			newCriteria.addOrder(Order.asc("registrationAddress"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("registrationAddress")))
			newCriteria.addOrder(Order.desc("registrationAddress"));
		if (criteria.getCorporateRegistrationScheme() != null) {
			newCriteria.add(Restrictions.eq("corporateRegistrationScheme",
					criteria.getCorporateRegistrationScheme()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("corporateRegistrationScheme")))
			newCriteria.addOrder(Order.asc("corporateRegistrationScheme"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("corporateRegistrationScheme")))
			newCriteria.addOrder(Order.desc("corporateRegistrationScheme"));
		return newCriteria;
	}

	public void insert(PartyLegalEntityType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(PartyLegalEntityType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public PartyLegalEntityType merge(PartyLegalEntityType value) {
		PartyLegalEntityType newValue = null;
		Session session = getSession();
		newValue = (PartyLegalEntityType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(PartyLegalEntityType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		PartyLegalEntityType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
