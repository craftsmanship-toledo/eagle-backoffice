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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Issue service. Represents a row in the &quot;Eagle_Issue&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.craftsmanship.toledo.eagle.backoffice.model.impl.IssueModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.craftsmanship.toledo.eagle.backoffice.model.impl.IssueImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Issue
 * @see com.craftsmanship.toledo.eagle.backoffice.model.impl.IssueImpl
 * @see com.craftsmanship.toledo.eagle.backoffice.model.impl.IssueModelImpl
 * @generated
 */
@ProviderType
public interface IssueModel extends BaseModel<Issue>, GroupedModel, ShardedModel,
	StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a issue model instance should use the {@link Issue} interface instead.
	 */

	/**
	 * Returns the primary key of this issue.
	 *
	 * @return the primary key of this issue
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this issue.
	 *
	 * @param primaryKey the primary key of this issue
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this issue.
	 *
	 * @return the uuid of this issue
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this issue.
	 *
	 * @param uuid the uuid of this issue
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the issue ID of this issue.
	 *
	 * @return the issue ID of this issue
	 */
	public long getIssueId();

	/**
	 * Sets the issue ID of this issue.
	 *
	 * @param issueId the issue ID of this issue
	 */
	public void setIssueId(long issueId);

	/**
	 * Returns the group ID of this issue.
	 *
	 * @return the group ID of this issue
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this issue.
	 *
	 * @param groupId the group ID of this issue
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this issue.
	 *
	 * @return the company ID of this issue
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this issue.
	 *
	 * @param companyId the company ID of this issue
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this issue.
	 *
	 * @return the user ID of this issue
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this issue.
	 *
	 * @param userId the user ID of this issue
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this issue.
	 *
	 * @return the user uuid of this issue
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this issue.
	 *
	 * @param userUuid the user uuid of this issue
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this issue.
	 *
	 * @return the user name of this issue
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this issue.
	 *
	 * @param userName the user name of this issue
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this issue.
	 *
	 * @return the create date of this issue
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this issue.
	 *
	 * @param createDate the create date of this issue
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this issue.
	 *
	 * @return the modified date of this issue
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this issue.
	 *
	 * @param modifiedDate the modified date of this issue
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the type of this issue.
	 *
	 * @return the type of this issue
	 */
	@AutoEscape
	public String getType();

	/**
	 * Sets the type of this issue.
	 *
	 * @param type the type of this issue
	 */
	public void setType(String type);

	/**
	 * Returns the title of this issue.
	 *
	 * @return the title of this issue
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this issue.
	 *
	 * @param title the title of this issue
	 */
	public void setTitle(String title);

	/**
	 * Returns the description of this issue.
	 *
	 * @return the description of this issue
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this issue.
	 *
	 * @param description the description of this issue
	 */
	public void setDescription(String description);

	/**
	 * Returns the summary of this issue.
	 *
	 * @return the summary of this issue
	 */
	@AutoEscape
	public String getSummary();

	/**
	 * Sets the summary of this issue.
	 *
	 * @param summary the summary of this issue
	 */
	public void setSummary(String summary);

	/**
	 * Returns the status of this issue.
	 *
	 * @return the status of this issue
	 */
	@AutoEscape
	public String getStatus();

	/**
	 * Sets the status of this issue.
	 *
	 * @param status the status of this issue
	 */
	public void setStatus(String status);

	/**
	 * Returns the votes of this issue.
	 *
	 * @return the votes of this issue
	 */
	public long getVotes();

	/**
	 * Sets the votes of this issue.
	 *
	 * @param votes the votes of this issue
	 */
	public void setVotes(long votes);

	/**
	 * Returns the picture of this issue.
	 *
	 * @return the picture of this issue
	 */
	@AutoEscape
	public String getPicture();

	/**
	 * Sets the picture of this issue.
	 *
	 * @param picture the picture of this issue
	 */
	public void setPicture(String picture);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Issue issue);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Issue> toCacheModel();

	@Override
	public Issue toEscapedModel();

	@Override
	public Issue toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}