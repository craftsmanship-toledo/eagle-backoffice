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
import com.craftsmanship.toledo.eagle.backoffice.service.IssueLocalServiceUtil;

/**
 * The extended model base implementation for the Issue service. Represents a row in the &quot;Eagle_Issue&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link IssueImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see IssueImpl
 * @see Issue
 * @generated
 */
@ProviderType
public abstract class IssueBaseImpl extends IssueModelImpl implements Issue {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a issue model instance should use the {@link Issue} interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			IssueLocalServiceUtil.addIssue(this);
		}
		else {
			IssueLocalServiceUtil.updateIssue(this);
		}
	}
}