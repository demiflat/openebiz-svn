package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.DocumentResponseType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class DocumentResponseTypeDAOImpl extends HibernateDaoSupport implements DocumentResponseTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(DocumentResponseTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(DocumentResponseType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public DocumentResponseType getById(Long id) {
		DocumentResponseType value = null;
		Session session = getSession();
		value = (DocumentResponseType) session.load(DocumentResponseType.class,
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
				.createCriteria(DocumentResponseType.class);
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
		if (criteria.getResponse() != null) {
			newCriteria
					.add(Restrictions.eq("response", criteria.getResponse()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("response")))
			newCriteria.addOrder(Order.asc("response"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("response")))
			newCriteria.addOrder(Order.desc("response"));
		if (criteria.getDocumentReference() != null) {
			newCriteria.add(Restrictions.eq("documentReference", criteria
					.getDocumentReference()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("documentReference")))
			newCriteria.addOrder(Order.asc("documentReference"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("documentReference")))
			newCriteria.addOrder(Order.desc("documentReference"));
		if (criteria.getIssuerParty() != null) {
			newCriteria.add(Restrictions.eq("issuerParty", criteria
					.getIssuerParty()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("issuerParty")))
			newCriteria.addOrder(Order.asc("issuerParty"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("issuerParty")))
			newCriteria.addOrder(Order.desc("issuerParty"));
		if (criteria.getRecipientParty() != null) {
			newCriteria.add(Restrictions.eq("recipientParty", criteria
					.getRecipientParty()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("recipientParty")))
			newCriteria.addOrder(Order.asc("recipientParty"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("recipientParty")))
			newCriteria.addOrder(Order.desc("recipientParty"));
		return newCriteria;
	}

	public void insert(DocumentResponseType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(DocumentResponseType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public DocumentResponseType merge(DocumentResponseType value) {
		DocumentResponseType newValue = null;
		Session session = getSession();
		newValue = (DocumentResponseType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(DocumentResponseType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		DocumentResponseType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
