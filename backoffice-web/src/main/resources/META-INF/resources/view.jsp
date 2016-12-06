<%--
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
--%>

<%@ include file="/init.jsp" %>

<strong><liferay-ui:message key="welcome-to-the-blade-service-builder-web" /></strong>

<aui:button-row>
	<portlet:renderURL var="editIssueURL">
		<portlet:param name="mvcPath" value="/edit_issue.jsp" />
		<portlet:param name="redirect" value="<%= currentURL %>" />
	</portlet:renderURL>

	<aui:button href="<%= editIssueURL %>" value="add-issue" />
</aui:button-row>

<liferay-ui:search-container
	total="<%= issueLocalService.getIssuesCount() %>"
>
	<liferay-ui:search-container-results
		results="<%= issueLocalService.getIssues(searchContainer.getStart(), searchContainer.getEnd()) %>"
	/>

	<liferay-ui:search-container-row
		className="com.craftsmanship.toledo.eagle.backoffice.model.Issue"
		escapedModel="true"
		modelVar="issue"
	>
		<liferay-ui:search-container-column-text
			name="id"
			property="issueId"
			valign="top"
		/>

		<liferay-ui:search-container-column-text
			name="title"
			valign="top"
		>
			<strong><%= issue.getTitle() %></strong>

			<br />

			<div class="lfr-asset-categories">
				<liferay-ui:asset-categories-summary
					className="<%= Issue.class.getName() %>"
					classPK="<%= issue.getIssueId() %>"
				/>
			</div>

			<div class="lfr-asset-tags">
				<liferay-ui:asset-tags-summary
					className="<%= Issue.class.getName() %>"
					classPK="<%= issue.getIssueId() %>"
					message="tags"
				/>
			</div>
		</liferay-ui:search-container-column-text>

		<liferay-ui:search-container-column-text
			property="votes"
			valign="top"
		/>

		<liferay-ui:search-container-column-jsp
			cssClass="entry-action"
			path="/issue_action.jsp"
			valign="top"
		/>
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>