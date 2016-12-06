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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.craftsmanship.toledo.eagle.backoffice.service.http.IssueServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.craftsmanship.toledo.eagle.backoffice.service.http.IssueServiceSoap
 * @generated
 */
@ProviderType
public class IssueSoap implements Serializable {
	public static IssueSoap toSoapModel(Issue model) {
		IssueSoap soapModel = new IssueSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setIssueId(model.getIssueId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setType(model.getType());
		soapModel.setTitle(model.getTitle());
		soapModel.setDescription(model.getDescription());
		soapModel.setSummary(model.getSummary());
		soapModel.setStatus(model.getStatus());
		soapModel.setVotes(model.getVotes());
		soapModel.setPicture(model.getPicture());

		return soapModel;
	}

	public static IssueSoap[] toSoapModels(Issue[] models) {
		IssueSoap[] soapModels = new IssueSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static IssueSoap[][] toSoapModels(Issue[][] models) {
		IssueSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new IssueSoap[models.length][models[0].length];
		}
		else {
			soapModels = new IssueSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static IssueSoap[] toSoapModels(List<Issue> models) {
		List<IssueSoap> soapModels = new ArrayList<IssueSoap>(models.size());

		for (Issue model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new IssueSoap[soapModels.size()]);
	}

	public IssueSoap() {
	}

	public long getPrimaryKey() {
		return _issueId;
	}

	public void setPrimaryKey(long pk) {
		setIssueId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getIssueId() {
		return _issueId;
	}

	public void setIssueId(long issueId) {
		_issueId = issueId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getType() {
		return _type;
	}

	public void setType(String type) {
		_type = type;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getSummary() {
		return _summary;
	}

	public void setSummary(String summary) {
		_summary = summary;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	public long getVotes() {
		return _votes;
	}

	public void setVotes(long votes) {
		_votes = votes;
	}

	public String getPicture() {
		return _picture;
	}

	public void setPicture(String picture) {
		_picture = picture;
	}

	private String _uuid;
	private long _issueId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _type;
	private String _title;
	private String _description;
	private String _summary;
	private String _status;
	private long _votes;
	private String _picture;
}