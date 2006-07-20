package org.openebiz.dao.common.udt;

import org.openebiz.core.common.mimetype.BinaryObjectMimeCodeContentType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.udt.VideoType;

public interface VideoTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		byte[] value;

		String encodingCode;

		String filename;

		String format;

		String uri;

		BinaryObjectMimeCodeContentType mimeCode;

		int startFrom;

		int maxResults;

		Set<String> ascending;

		Set<String> descending;

		public Long getInternalId() {
			return this.internalId;
		}

		public void setInternalId(Long value) {
			this.internalId = value;
		}

		public Integer getVersion() {
			return this.version;
		}

		public void setVersion(Integer value) {
			this.version = value;
		}

		public byte[] getValue() {
			return this.value;
		}

		public void setValue(byte[] value) {
			this.value = value;
		}

		public String getEncodingCode() {
			return this.encodingCode;
		}

		public void setEncodingCode(String value) {
			this.encodingCode = value;
		}

		public String getFilename() {
			return this.filename;
		}

		public void setFilename(String value) {
			this.filename = value;
		}

		public String getFormat() {
			return this.format;
		}

		public void setFormat(String value) {
			this.format = value;
		}

		public String getUri() {
			return this.uri;
		}

		public void setUri(String value) {
			this.uri = value;
		}

		public BinaryObjectMimeCodeContentType getMimeCode() {
			return this.mimeCode;
		}

		public void setMimeCode(BinaryObjectMimeCodeContentType value) {
			this.mimeCode = value;
		}

		public void addAscendingOrder(String propertyName) {
			if (ascending == null)
				ascending = new HashSet<String>();
			ascending.add(propertyName);
			if ((descending != null) && (descending.contains(propertyName)))
				descending.remove(propertyName);
		}

		public void addDescendingOrder(String propertyName) {
			if (descending == null)
				descending = new HashSet<String>();
			descending.add(propertyName);
			if ((ascending != null) && (ascending.contains(propertyName)))
				ascending.remove(propertyName);
		}
	}

	public List getAll();

	public Iterator iterateAll();

	public VideoType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(VideoType value);

	public void update(VideoType value);

	public VideoType merge(VideoType value);

	public void delete(VideoType value);

	public void delete(Long id);
}
