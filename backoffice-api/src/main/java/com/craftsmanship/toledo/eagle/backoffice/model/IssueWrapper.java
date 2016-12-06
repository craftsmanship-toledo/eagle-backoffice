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

package com.craftsmanship.toledo.eagle.backoffice.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Issue}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Issue
 * @generated
 */
@ProviderType
public class IssueWrapper implements Issue, ModelWrapper<Issue> {
	public IssueWrapper(Issue issue) {
		_issue = issue;
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

	@Override
	public Issue toEscapedModel() {
		return new IssueWrapper(_issue.toEscapedModel());
	}

	@Override
	public Issue toUnescapedModel() {
		return new IssueWrapper(_issue.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _issue.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _issue.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _issue.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _issue.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Issue> toCacheModel() {
		return _issue.toCacheModel();
	}

	@Override
	public int compareTo(Issue issue) {
		return _issue.compareTo(issue);
	}

	@Override
	public int hashCode() {
		return _issue.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _issue.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new IssueWrapper((Issue)_issue.clone());
	}

	/**
	* Returns the description of this issue.
	*
	* @return the description of this issue
	*/
	@Override
	public java.lang.String getDescription() {
		return _issue.getDescription();
	}

	/**
	* Returns the picture of this issue.
	*
	* @return the picture of this issue
	*/
	@Override
	public java.lang.String getPicture() {
		return _issue.getPicture();
	}

	/**
	* Returns the status of this issue.
	*
	* @return the status of this issue
	*/
	@Override
	public java.lang.String getStatus() {
		return _issue.getStatus();
	}

	/**
	* Returns the summary of this issue.
	*
	* @return the summary of this issue
	*/
	@Override
	public java.lang.String getSummary() {
		return _issue.getSummary();
	}

	/**
	* Returns the title of this issue.
	*
	* @return the title of this issue
	*/
	@Override
	public java.lang.String getTitle() {
		return _issue.getTitle();
	}

	/**
	* Returns the type of this issue.
	*
	* @return the type of this issue
	*/
	@Override
	public java.lang.String getType() {
		return _issue.getType();
	}

	/**
	* Returns the user name of this issue.
	*
	* @return the user name of this issue
	*/
	@Override
	public java.lang.String getUserName() {
		return _issue.getUserName();
	}

	/**
	* Returns the user uuid of this issue.
	*
	* @return the user uuid of this issue
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _issue.getUserUuid();
	}

	/**
	* Returns the uuid of this issue.
	*
	* @return the uuid of this issue
	*/
	@Override
	public java.lang.String getUuid() {
		return _issue.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _issue.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _issue.toXmlString();
	}

	/**
	* Returns the create date of this issue.
	*
	* @return the create date of this issue
	*/
	@Override
	public Date getCreateDate() {
		return _issue.getCreateDate();
	}

	/**
	* Returns the modified date of this issue.
	*
	* @return the modified date of this issue
	*/
	@Override
	public Date getModifiedDate() {
		return _issue.getModifiedDate();
	}

	/**
	* Returns the company ID of this issue.
	*
	* @return the company ID of this issue
	*/
	@Override
	public long getCompanyId() {
		return _issue.getCompanyId();
	}

	/**
	* Returns the group ID of this issue.
	*
	* @return the group ID of this issue
	*/
	@Override
	public long getGroupId() {
		return _issue.getGroupId();
	}

	/**
	* Returns the issue ID of this issue.
	*
	* @return the issue ID of this issue
	*/
	@Override
	public long getIssueId() {
		return _issue.getIssueId();
	}

	/**
	* Returns the primary key of this issue.
	*
	* @return the primary key of this issue
	*/
	@Override
	public long getPrimaryKey() {
		return _issue.getPrimaryKey();
	}

	/**
	* Returns the user ID of this issue.
	*
	* @return the user ID of this issue
	*/
	@Override
	public long getUserId() {
		return _issue.getUserId();
	}

	/**
	* Returns the votes of this issue.
	*
	* @return the votes of this issue
	*/
	@Override
	public long getVotes() {
		return _issue.getVotes();
	}

	@Override
	public void persist() {
		_issue.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_issue.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this issue.
	*
	* @param companyId the company ID of this issue
	*/
	@Override
	public void setCompanyId(long companyId) {
		_issue.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this issue.
	*
	* @param createDate the create date of this issue
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_issue.setCreateDate(createDate);
	}

	/**
	* Sets the description of this issue.
	*
	* @param description the description of this issue
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_issue.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_issue.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_issue.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_issue.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this issue.
	*
	* @param groupId the group ID of this issue
	*/
	@Override
	public void setGroupId(long groupId) {
		_issue.setGroupId(groupId);
	}

	/**
	* Sets the issue ID of this issue.
	*
	* @param issueId the issue ID of this issue
	*/
	@Override
	public void setIssueId(long issueId) {
		_issue.setIssueId(issueId);
	}

	/**
	* Sets the modified date of this issue.
	*
	* @param modifiedDate the modified date of this issue
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_issue.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_issue.setNew(n);
	}

	/**
	* Sets the picture of this issue.
	*
	* @param picture the picture of this issue
	*/
	@Override
	public void setPicture(java.lang.String picture) {
		_issue.setPicture(picture);
	}

	/**
	* Sets the primary key of this issue.
	*
	* @param primaryKey the primary key of this issue
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_issue.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_issue.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the status of this issue.
	*
	* @param status the status of this issue
	*/
	@Override
	public void setStatus(java.lang.String status) {
		_issue.setStatus(status);
	}

	/**
	* Sets the summary of this issue.
	*
	* @param summary the summary of this issue
	*/
	@Override
	public void setSummary(java.lang.String summary) {
		_issue.setSummary(summary);
	}

	/**
	* Sets the title of this issue.
	*
	* @param title the title of this issue
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_issue.setTitle(title);
	}

	/**
	* Sets the type of this issue.
	*
	* @param type the type of this issue
	*/
	@Override
	public void setType(java.lang.String type) {
		_issue.setType(type);
	}

	/**
	* Sets the user ID of this issue.
	*
	* @param userId the user ID of this issue
	*/
	@Override
	public void setUserId(long userId) {
		_issue.setUserId(userId);
	}

	/**
	* Sets the user name of this issue.
	*
	* @param userName the user name of this issue
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_issue.setUserName(userName);
	}

	/**
	* Sets the user uuid of this issue.
	*
	* @param userUuid the user uuid of this issue
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_issue.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this issue.
	*
	* @param uuid the uuid of this issue
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_issue.setUuid(uuid);
	}

	/**
	* Sets the votes of this issue.
	*
	* @param votes the votes of this issue
	*/
	@Override
	public void setVotes(long votes) {
		_issue.setVotes(votes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof IssueWrapper)) {
			return false;
		}

		IssueWrapper issueWrapper = (IssueWrapper)obj;

		if (Objects.equals(_issue, issueWrapper._issue)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _issue.getStagedModelType();
	}

	@Override
	public Issue getWrappedModel() {
		return _issue;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _issue.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _issue.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_issue.resetOriginalValues();
	}

	private final Issue _issue;
}