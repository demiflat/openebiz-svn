package org.openebiz.dao.businessdocs;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.businessdocs.AttachedDocumentType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class AttachedDocumentTypeDAOImpl extends HibernateDaoSupport implements AttachedDocumentTypeDAO {


	static private final Log log = LogFactory
			.getLog(AttachedDocumentTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(AttachedDocumentType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public AttachedDocumentType getById(Long id) {
		AttachedDocumentType value = null;
		Session session = getSession();
		value = (AttachedDocumentType) session.load(AttachedDocumentType.class,
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
				.createCriteria(AttachedDocumentType.class);
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
		if (criteria.getDocumentQualifierCode() != null) {
			newCriteria.add(Restrictions.eq("documentQualifierCode", criteria
					.getDocumentQualifierCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("documentQualifierCode")))
			newCriteria.addOrder(Order.asc("documentQualifierCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("documentQualifierCode")))
			newCriteria.addOrder(Order.desc("documentQualifierCode"));
		if (criteria.getParentDocumentID() != null) {
			newCriteria.add(Restrictions.eq("parentDocumentID", criteria
					.getParentDocumentID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("parentDocumentID")))
			newCriteria.addOrder(Order.asc("parentDocumentID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("parentDocumentID")))
			newCriteria.addOrder(Order.desc("parentDocumentID"));
		if (criteria.getParentDocumentQualifierCode() != null) {
			newCriteria.add(Restrictions.eq("parentDocumentQualifierCode",
					criteria.getParentDocumentQualifierCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("parentDocumentQualifierCode")))
			newCriteria.addOrder(Order.asc("parentDocumentQualifierCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("parentDocumentQualifierCode")))
			newCriteria.addOrder(Order.desc("parentDocumentQualifierCode"));
		if (criteria.getSenderParty() != null) {
			newCriteria.add(Restrictions.eq("senderParty", criteria
					.getSenderParty()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("senderParty")))
			newCriteria.addOrder(Order.asc("senderParty"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("senderParty")))
			newCriteria.addOrder(Order.desc("senderParty"));
		if (criteria.getReceiverParty() != null) {
			newCriteria.add(Restrictions.eq("receiverParty", criteria
					.getReceiverParty()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("receiverParty")))
			newCriteria.addOrder(Order.asc("receiverParty"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("receiverParty")))
			newCriteria.addOrder(Order.desc("receiverParty"));
		if (criteria.getAttachment() != null) {
			newCriteria.add(Restrictions.eq("attachment", criteria
					.getAttachment()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("attachment")))
			newCriteria.addOrder(Order.asc("attachment"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("attachment")))
			newCriteria.addOrder(Order.desc("attachment"));
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

	public void insert(AttachedDocumentType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(AttachedDocumentType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public AttachedDocumentType merge(AttachedDocumentType value) {
		AttachedDocumentType newValue = null;
		Session session = getSession();
		newValue = (AttachedDocumentType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(AttachedDocumentType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		AttachedDocumentType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
