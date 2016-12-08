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

<%
String redirect = ParamUtil.getString(request, "redirect");

long issueId = ParamUtil.getLong(request, "issueId");

Issue issue = null;

if (issueId > 0) {
	issue = issueLocalService.getIssue(issueId);
}
%>

<aui:form action="<%= renderResponse.createActionURL() %>" method="post" name="fm">
	<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= issue == null ? Constants.ADD : Constants.UPDATE %>" />
	<aui:input name="redirect" type="hidden" value="<%= currentURL %>" />
	<aui:input name="issueId" type="hidden" value="<%= issueId %>" />

	<liferay-ui:header
		backURL="<%= redirect %>"
		title='<%= (issue != null) ? issue.getTitle() : "new-issue" %>'
	/>

	<liferay-ui:asset-categories-error />

	<liferay-ui:asset-tags-error />

	<aui:model-context bean="<%= issue %>" model="<%= Issue.class %>" />

	<aui:fieldset>
		<aui:input name="title" />

		<aui:input name="description" />

		<aui:input name="summary" />

		<% if (issueId > 0)  { %>
			<strong><%= HtmlUtil.escape(String.valueOf(issue.getVotes())) %></strong>
		<% } %>

		<aui:input name="picture" />

		<liferay-ui:custom-attributes-available className="<%= Issue.class.getName() %>">
			<liferay-ui:custom-attribute-list
				className="<%= Issue.class.getName() %>"
				classPK="<%= (issue != null) ? issue.getIssueId() : 0 %>"
				editable="<%= true %>"
				label="<%= true %>"
			/>
		</liferay-ui:custom-attributes-available>

		<aui:input name="categories" type="assetCategories" />

		<aui:input name="tags" type="assetTags" />
	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit" />

		<aui:button href="<%= redirect %>" type="cancel" />
	</aui:button-row>
</aui:form>