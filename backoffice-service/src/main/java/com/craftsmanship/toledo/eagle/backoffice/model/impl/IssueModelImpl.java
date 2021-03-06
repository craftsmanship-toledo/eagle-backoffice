/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.craftsmanship.toledo.eagle.backoffice.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.craftsmanship.toledo.eagle.backoffice.model.Issue;
import com.craftsmanship.toledo.eagle.backoffice.model.IssueModel;
import com.craftsmanship.toledo.eagle.backoffice.model.IssueSoap;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Issue service. Represents a row in the &quot;Eagle_Issue&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link IssueModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link IssueImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see IssueImpl
 * @see Issue
 * @see IssueModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class IssueModelImpl extends BaseModelImpl<Issue> implements IssueModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a issue model instance should use the {@link Issue} interface instead.
	 */
	public static final String TABLE_NAME = "Eagle_Issue";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "issueId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "type_", Types.VARCHAR },
			{ "title", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "summary", Types.VARCHAR },
			{ "status", Types.VARCHAR },
			{ "votes", Types.BIGINT },
			{ "picture", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("issueId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("type_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("title", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("description", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("summary", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("status", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("votes", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("picture", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table Eagle_Issue (uuid_ VARCHAR(75) null,issueId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,type_ VARCHAR(75) null,title VARCHAR(75) null,description VARCHAR(75) null,summary VARCHAR(75) null,status VARCHAR(75) null,votes LONG,picture VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table Eagle_Issue";
	public static final String ORDER_BY_JPQL = " ORDER BY issue.votes ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Eagle_Issue.votes ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.craftsmanship.toledo.eagle.backoffice.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.craftsmanship.toledo.eagle.backoffice.model.Issue"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.craftsmanship.toledo.eagle.backoffice.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.craftsmanship.toledo.eagle.backoffice.model.Issue"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.craftsmanship.toledo.eagle.backoffice.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.craftsmanship.toledo.eagle.backoffice.model.Issue"),
			true);
	public static final long COMPANYID_COLUMN_BITMASK = 1L;
	public static final long GROUPID_COLUMN_BITMASK = 2L;
	public static final long STATUS_COLUMN_BITMASK = 4L;
	public static final long TYPE_COLUMN_BITMASK = 8L;
	public static final long UUID_COLUMN_BITMASK = 16L;
	public static final long VOTES_COLUMN_BITMASK = 32L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Issue toModel(IssueSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Issue model = new IssueImpl();

		model.setUuid(soapModel.getUuid());
		model.setIssueId(soapModel.getIssueId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setType(soapModel.getType());
		model.setTitle(soapModel.getTitle());
		model.setDescription(soapModel.getDescription());
		model.setSummary(soapModel.getSummary());
		model.setStatus(soapModel.getStatus());
		model.setVotes(soapModel.getVotes());
		model.setPicture(soapModel.getPicture());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Issue> toModels(IssueSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Issue> models = new ArrayList<Issue>(soapModels.length);

		for (IssueSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.craftsmanship.toledo.eagle.backoffice.service.util.ServiceProps.get(
				"lock.expiration.time.com.craftsmanship.toledo.eagle.backoffice.model.Issue"));

	public IssueModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _issueId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setIssueId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _issueId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Issue.class;
	}

	@Override
	public String getModelClassName() {
		return Issue.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("issueId", getIssueId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("type", getType());
		attributes.put("title", getTitle());
		attributes.put("description", getDescription());
		attributes.put("summary", getSummary());
		attributes.put("status", getStatus());
		attributes.put("votes", getVotes());
		attributes.put("picture", getPicture());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long issueId = (Long)attributes.get("issueId");

		if (issueId != null) {
			setIssueId(issueId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String summary = (String)attributes.get("summary");

		if (summary != null) {
			setSummary(summary);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long votes = (Long)attributes.get("votes");

		if (votes != null) {
			setVotes(votes);
		}

		String picture = (String)attributes.get("picture");

		if (picture != null) {
			setPicture(picture);
		}
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getIssueId() {
		return _issueId;
	}

	@Override
	public void setIssueId(long issueId) {
		_issueId = issueId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return StringPool.BLANK;
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getType() {
		if (_type == null) {
			return StringPool.BLANK;
		}
		else {
			return _type;
		}
	}

	@Override
	public void setType(String type) {
		_columnBitmask |= TYPE_COLUMN_BITMASK;

		if (_originalType == null) {
			_originalType = _type;
		}

		_type = type;
	}

	public String getOriginalType() {
		return GetterUtil.getString(_originalType);
	}

	@JSON
	@Override
	public String getTitle() {
		if (_title == null) {
			return StringPool.BLANK;
		}
		else {
			return _title;
		}
	}

	@Override
	public void setTitle(String title) {
		_title = title;
	}

	@JSON
	@Override
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@JSON
	@Override
	public String getSummary() {
		if (_summary == null) {
			return StringPool.BLANK;
		}
		else {
			return _summary;
		}
	}

	@Override
	public void setSummary(String summary) {
		_summary = summary;
	}

	@JSON
	@Override
	public String getStatus() {
		if (_status == null) {
			return StringPool.BLANK;
		}
		else {
			return _status;
		}
	}

	@Override
	public void setStatus(String status) {
		_columnBitmask |= STATUS_COLUMN_BITMASK;

		if (_originalStatus == null) {
			_originalStatus = _status;
		}

		_status = status;
	}

	public String getOriginalStatus() {
		return GetterUtil.getString(_originalStatus);
	}

	@JSON
	@Override
	public long getVotes() {
		return _votes;
	}

	@Override
	public void setVotes(long votes) {
		_columnBitmask = -1L;

		_votes = votes;
	}

	@JSON
	@Override
	public String getPicture() {
		if (_picture == null) {
			return StringPool.BLANK;
		}
		else {
			return _picture;
		}
	}

	@Override
	public void setPicture(String picture) {
		_picture = picture;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				Issue.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Issue.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Issue toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Issue)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		IssueImpl issueImpl = new IssueImpl();

		issueImpl.setUuid(getUuid());
		issueImpl.setIssueId(getIssueId());
		issueImpl.setGroupId(getGroupId());
		issueImpl.setCompanyId(getCompanyId());
		issueImpl.setUserId(getUserId());
		issueImpl.setUserName(getUserName());
		issueImpl.setCreateDate(getCreateDate());
		issueImpl.setModifiedDate(getModifiedDate());
		issueImpl.setType(getType());
		issueImpl.setTitle(getTitle());
		issueImpl.setDescription(getDescription());
		issueImpl.setSummary(getSummary());
		issueImpl.setStatus(getStatus());
		issueImpl.setVotes(getVotes());
		issueImpl.setPicture(getPicture());

		issueImpl.resetOriginalValues();

		return issueImpl;
	}

	@Override
	public int compareTo(Issue issue) {
		int value = 0;

		if (getVotes() < issue.getVotes()) {
			value = -1;
		}
		else if (getVotes() > issue.getVotes()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Issue)) {
			return false;
		}

		Issue issue = (Issue)obj;

		long primaryKey = issue.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		IssueModelImpl issueModelImpl = this;

		issueModelImpl._originalUuid = issueModelImpl._uuid;

		issueModelImpl._originalGroupId = issueModelImpl._groupId;

		issueModelImpl._setOriginalGroupId = false;

		issueModelImpl._originalCompanyId = issueModelImpl._companyId;

		issueModelImpl._setOriginalCompanyId = false;

		issueModelImpl._setModifiedDate = false;

		issueModelImpl._originalType = issueModelImpl._type;

		issueModelImpl._originalStatus = issueModelImpl._status;

		issueModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Issue> toCacheModel() {
		IssueCacheModel issueCacheModel = new IssueCacheModel();

		issueCacheModel.uuid = getUuid();

		String uuid = issueCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			issueCacheModel.uuid = null;
		}

		issueCacheModel.issueId = getIssueId();

		issueCacheModel.groupId = getGroupId();

		issueCacheModel.companyId = getCompanyId();

		issueCacheModel.userId = getUserId();

		issueCacheModel.userName = getUserName();

		String userName = issueCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			issueCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			issueCacheModel.createDate = createDate.getTime();
		}
		else {
			issueCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			issueCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			issueCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		issueCacheModel.type = getType();

		String type = issueCacheModel.type;

		if ((type != null) && (type.length() == 0)) {
			issueCacheModel.type = null;
		}

		issueCacheModel.title = getTitle();

		String title = issueCacheModel.title;

		if ((title != null) && (title.length() == 0)) {
			issueCacheModel.title = null;
		}

		issueCacheModel.description = getDescription();

		String description = issueCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			issueCacheModel.description = null;
		}

		issueCacheModel.summary = getSummary();

		String summary = issueCacheModel.summary;

		if ((summary != null) && (summary.length() == 0)) {
			issueCacheModel.summary = null;
		}

		issueCacheModel.status = getStatus();

		String status = issueCacheModel.status;

		if ((status != null) && (status.length() == 0)) {
			issueCacheModel.status = null;
		}

		issueCacheModel.votes = getVotes();

		issueCacheModel.picture = getPicture();

		String picture = issueCacheModel.picture;

		if ((picture != null) && (picture.length() == 0)) {
			issueCacheModel.picture = null;
		}

		return issueCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", issueId=");
		sb.append(getIssueId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", type=");
		sb.append(getType());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", summary=");
		sb.append(getSummary());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", votes=");
		sb.append(getVotes());
		sb.append(", picture=");
		sb.append(getPicture());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("com.craftsmanship.toledo.eagle.backoffice.model.Issue");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>issueId</column-name><column-value><![CDATA[");
		sb.append(getIssueId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>type</column-name><column-value><![CDATA[");
		sb.append(getType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>summary</column-name><column-value><![CDATA[");
		sb.append(getSummary());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>votes</column-name><column-value><![CDATA[");
		sb.append(getVotes());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>picture</column-name><column-value><![CDATA[");
		sb.append(getPicture());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = Issue.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			Issue.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _issueId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _type;
	private String _originalType;
	private String _title;
	private String _description;
	private String _summary;
	private String _status;
	private String _originalStatus;
	private long _votes;
	private String _picture;
	private long _columnBitmask;
	private Issue _escapedModel;
}