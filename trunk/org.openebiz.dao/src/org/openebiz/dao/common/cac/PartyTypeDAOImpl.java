package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.PartyType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class PartyTypeDAOImpl extends HibernateDaoSupport implements PartyTypeDAO {

	
	static private final Log log = LogFactory.getLog(PartyTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(PartyType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public PartyType getById(Long id) {
		PartyType value = null;
		Session session = getSession();
		value = (PartyType) session.load(PartyType.class, id);
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
		Criteria newCriteria = session.createCriteria(PartyType.class);
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
		if (criteria.getLogoReferenceID() != null) {
			newCriteria.add(Restrictions.eq("logoReferenceID", criteria
					.getLogoReferenceID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("logoReferenceID")))
			newCriteria.addOrder(Order.asc("logoReferenceID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("logoReferenceID")))
			newCriteria.addOrder(Order.desc("logoReferenceID"));
		if (criteria.getLanguage() != null) {
			newCriteria
					.add(Restrictions.eq("language", criteria.getLanguage()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("language")))
			newCriteria.addOrder(Order.asc("language"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("language")))
			newCriteria.addOrder(Order.desc("language"));
		if (criteria.getAddress() != null) {
			newCriteria.add(Restrictions.eq("address", criteria.getAddress()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("address")))
			newCriteria.addOrder(Order.asc("address"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("address")))
			newCriteria.addOrder(Order.desc("address"));
		if (criteria.getContact() != null) {
			newCriteria.add(Restrictions.eq("contact", criteria.getContact()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("contact")))
			newCriteria.addOrder(Order.asc("contact"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("contact")))
			newCriteria.addOrder(Order.desc("contact"));
		if (criteria.getPerson() != null) {
			newCriteria.add(Restrictions.eq("person", criteria.getPerson()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("person")))
			newCriteria.addOrder(Order.asc("person"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("person")))
			newCriteria.addOrder(Order.desc("person"));
		if (criteria.getAgentParty() != null) {
			newCriteria.add(Restrictions.eq("agentParty", criteria
					.getAgentParty()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("agentParty")))
			newCriteria.addOrder(Order.asc("agentParty"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("agentParty")))
			newCriteria.addOrder(Order.desc("agentParty"));
		return newCriteria;
	}

	public void insert(PartyType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(PartyType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public PartyType merge(PartyType value) {
		PartyType newValue = null;
		Session session = getSession();
		newValue = (PartyType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(PartyType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		PartyType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
