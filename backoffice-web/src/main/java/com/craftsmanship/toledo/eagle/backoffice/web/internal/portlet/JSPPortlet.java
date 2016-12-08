/**
 * Copyright 2000-present Liferay, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.craftsmanship.toledo.eagle.backoffice.web.internal.portlet;

import com.craftsmanship.toledo.eagle.backoffice.model.Issue;
import com.craftsmanship.toledo.eagle.backoffice.service.IssueLocalService;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Liferay
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.add-default-resource=true",
		"com.liferay.portlet.css-class-wrapper=portlet-backoffice",
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.icon=/icons/eagle.png",
		"com.liferay.portlet.instanceable=true",
		"com.liferay.portlet.use-default-template=true",
		"javax.portlet.display-name=Eagle Backoffice",
		"javax.portlet.expiration-cache=0",
		"javax.portlet.info.keywords=Eagle Backoffice",
		"javax.portlet.info.short-title=Backoffice",
		"javax.portlet.info.title=Eagle Backoffice",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.supports.mime-type=text/html"
	},
	service = Portlet.class
)
public class JSPPortlet extends MVCPortlet {

	public IssueLocalService getIssueLocalService() {
		return _issueLocalService;
	}

	@Override
	public void processAction(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws IOException, PortletException {

		try {
			String cmd = ParamUtil.getString(actionRequest, Constants.CMD);

			if (cmd.equals(Constants.ADD) || cmd.equals(Constants.UPDATE)) {
				updateIssue(actionRequest);
			}
			else if (cmd.equals(Constants.DELETE)) {
				deleteIssue(actionRequest);
			}

			if (Validator.isNotNull(cmd)) {
				if (SessionErrors.isEmpty(actionRequest)) {
					SessionMessages.add(actionRequest, "requestProcessed");
				}

				String redirect = ParamUtil.getString(
					actionRequest, "redirect");

				actionResponse.sendRedirect(redirect);
			}
		}
		catch (Exception e) {
			throw new PortletException(e);
		}
	}

	@Override
	public void render(RenderRequest request, RenderResponse response)
		throws IOException, PortletException {

		//set service bean
		request.setAttribute("issueLocalService", getIssueLocalService());

		super.render(request, response);
	}

	@Reference
	public void setIssueLocalService(IssueLocalService issueLocalService) {
		_issueLocalService = issueLocalService;
	}

	protected void deleteIssue(ActionRequest actionRequest) throws Exception {
		long issueId = ParamUtil.getLong(actionRequest, "issueId");

		getIssueLocalService().deleteIssue(issueId);
	}

	protected void updateIssue(ActionRequest actionRequest) throws Exception {
		long issueId = ParamUtil.getLong(actionRequest, "issueId");

		String type = ParamUtil.getString(actionRequest, "type");
		String title = ParamUtil.getString(actionRequest, "title");
		String description = ParamUtil.getString(actionRequest, "description");
		String summary = ParamUtil.getString(actionRequest, "summary");

		String status = ParamUtil.getString(actionRequest, "status");
		long votes = ParamUtil.getLong(actionRequest, "votes");
		String picture = ParamUtil.getString(actionRequest, "picture");

		if (issueId <= 0) {
			Issue issue = getIssueLocalService().createIssue(0);

			issue.setType(type);
			issue.setTitle(title);
			issue.setDescription(description);
			issue.setSummary(summary);
			issue.setStatus(status);
			issue.setVotes(votes);
			issue.setPicture(picture);

			issue.isNew();

			getIssueLocalService().addIssue(issue);
		}
		else {
			Issue issue = getIssueLocalService().fetchIssue(issueId);

			issue.setType(type);
			issue.setTitle(title);
			issue.setDescription(description);
			issue.setSummary(summary);
			issue.setStatus(status);
			issue.setVotes(votes);
			issue.setPicture(picture);

			getIssueLocalService().updateIssue(issue);
		}
	}

	private IssueLocalService _issueLocalService;

}