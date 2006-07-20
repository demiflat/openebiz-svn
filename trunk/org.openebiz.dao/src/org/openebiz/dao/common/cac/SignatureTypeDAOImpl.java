package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.SignatureType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class SignatureTypeDAOImpl extends HibernateDaoSupport implements SignatureTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(SignatureTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(SignatureType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public SignatureType getById(Long id) {
		SignatureType value = null;
		Session session = getSession();
		value = (SignatureType) session.load(SignatureType.class, id);
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
		Criteria newCriteria = session.createCriteria(SignatureType.class);
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
		if (criteria.getValidatorID() != null) {
			newCriteria.add(Restrictions.eq("validatorID", criteria
					.getValidatorID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("validatorID")))
			newCriteria.addOrder(Order.asc("validatorID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("validatorID")))
			newCriteria.addOrder(Order.desc("validatorID"));
		if (criteria.getSignatoryParty() != null) {
			newCriteria.add(Restrictions.eq("signatoryParty", criteria
					.getSignatoryParty()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("signatoryParty")))
			newCriteria.addOrder(Order.asc("signatoryParty"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("signatoryParty")))
			newCriteria.addOrder(Order.desc("signatoryParty"));
		if (criteria.getDigitalSignatureAttachment() != null) {
			newCriteria.add(Restrictions.eq("digitalSignatureAttachment",
					criteria.getDigitalSignatureAttachment()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("digitalSignatureAttachment")))
			newCriteria.addOrder(Order.asc("digitalSignatureAttachment"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("digitalSignatureAttachment")))
			newCriteria.addOrder(Order.desc("digitalSignatureAttachment"));
		if (criteria.getOriginalDocumentReference() != null) {
			newCriteria.add(Restrictions.eq("originalDocumentReference",
					criteria.getOriginalDocumentReference()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("originalDocumentReference")))
			newCriteria.addOrder(Order.asc("originalDocumentReference"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("originalDocumentReference")))
			newCriteria.addOrder(Order.desc("originalDocumentReference"));
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

	public void insert(SignatureType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(SignatureType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public SignatureType merge(SignatureType value) {
		SignatureType newValue = null;
		Session session = getSession();
		newValue = (SignatureType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(SignatureType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		SignatureType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
