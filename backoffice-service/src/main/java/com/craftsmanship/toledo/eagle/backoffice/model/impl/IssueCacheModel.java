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

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Issue in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Issue
 * @generated
 */
@ProviderType
public class IssueCacheModel implements CacheModel<Issue>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof IssueCacheModel)) {
			return false;
		}

		IssueCacheModel issueCacheModel = (IssueCacheModel)obj;

		if (issueId == issueCacheModel.issueId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, issueId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", issueId=");
		sb.append(issueId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", type=");
		sb.append(type);
		sb.append(", title=");
		sb.append(title);
		sb.append(", description=");
		sb.append(description);
		sb.append(", summary=");
		sb.append(summary);
		sb.append(", status=");
		sb.append(status);
		sb.append(", votes=");
		sb.append(votes);
		sb.append(", picture=");
		sb.append(picture);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Issue toEntityModel() {
		IssueImpl issueImpl = new IssueImpl();

		if (uuid == null) {
			issueImpl.setUuid(StringPool.BLANK);
		}
		else {
			issueImpl.setUuid(uuid);
		}

		issueImpl.setIssueId(issueId);
		issueImpl.setGroupId(groupId);
		issueImpl.setCompanyId(companyId);
		issueImpl.setUserId(userId);

		if (userName == null) {
			issueImpl.setUserName(StringPool.BLANK);
		}
		else {
			issueImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			issueImpl.setCreateDate(null);
		}
		else {
			issueImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			issueImpl.setModifiedDate(null);
		}
		else {
			issueImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (type == null) {
			issueImpl.setType(StringPool.BLANK);
		}
		else {
			issueImpl.setType(type);
		}

		if (title == null) {
			issueImpl.setTitle(StringPool.BLANK);
		}
		else {
			issueImpl.setTitle(title);
		}

		if (description == null) {
			issueImpl.setDescription(StringPool.BLANK);
		}
		else {
			issueImpl.setDescription(description);
		}

		if (summary == null) {
			issueImpl.setSummary(StringPool.BLANK);
		}
		else {
			issueImpl.setSummary(summary);
		}

		if (status == null) {
			issueImpl.setStatus(StringPool.BLANK);
		}
		else {
			issueImpl.setStatus(status);
		}

		issueImpl.setVotes(votes);

		if (picture == null) {
			issueImpl.setPicture(StringPool.BLANK);
		}
		else {
			issueImpl.setPicture(picture);
		}

		issueImpl.resetOriginalValues();

		return issueImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		issueId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		type = objectInput.readUTF();
		title = objectInput.readUTF();
		description = objectInput.readUTF();
		summary = objectInput.readUTF();
		status = objectInput.readUTF();

		votes = objectInput.readLong();
		picture = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(issueId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (type == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(type);
		}

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (summary == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(summary);
		}

		if (status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(status);
		}

		objectOutput.writeLong(votes);

		if (picture == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(picture);
		}
	}

	public String uuid;
	public long issueId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String type;
	public String title;
	public String description;
	public String summary;
	public String status;
	public long votes;
	public String picture;
}