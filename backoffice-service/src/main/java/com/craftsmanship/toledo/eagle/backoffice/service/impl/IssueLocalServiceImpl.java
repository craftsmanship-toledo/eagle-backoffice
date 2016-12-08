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

package com.craftsmanship.toledo.eagle.backoffice.service.impl;

import aQute.bnd.annotation.ProviderType;

import com.craftsmanship.toledo.eagle.backoffice.model.Issue;
import com.craftsmanship.toledo.eagle.backoffice.service.base.IssueLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;

import java.util.Date;

/**
 * The implementation of the issue local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.craftsmanship.toledo.eagle.backoffice.service.IssueLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see IssueLocalServiceBaseImpl
 * @see com.craftsmanship.toledo.eagle.backoffice.service.IssueLocalServiceUtil
 */
@ProviderType
public class IssueLocalServiceImpl extends IssueLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.craftsmanship.toledo.eagle.backoffice.service.IssueLocalServiceUtil} to access the issue local service.
	 */

	public Issue addIssue(
			String type, String title, String description, String summary,
			String status, String picture)
		throws PortalException {

		long issueId = counterLocalService.increment();

		Issue issue = issuePersistence.create(issueId);

		issue.setIssueId(issueId);
		issue.setType(type);
		issue.setTitle(title);
		issue.setDescription(description);
		issue.setSummary(summary);
		issue.setStatus(status);
		issue.setVotes(0);
		issue.setPicture(picture);

		return issuePersistence.update(issue);
	}

	public Issue updateIssue(
			long issueId, String type, String title, String description,
			String summary, String status, String picture)
		throws PortalException {

		Issue issue = issuePersistence.findByPrimaryKey(issueId);

		issue.setIssueId(issueId);
		issue.setType(type);
		issue.setTitle(title);
		issue.setDescription(description);
		issue.setSummary(summary);
		issue.setStatus(status);
		issue.setPicture(picture);

		issue.setModifiedDate(new Date());

		return issuePersistence.update(issue);
	}

}