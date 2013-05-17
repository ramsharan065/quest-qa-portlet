<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@ page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.lftechnology.quest.qa.model.Question"%>
<%@page import="java.util.List"%>
<%@page
	import="com.lftechnology.quest.qa.service.QuestionLocalServiceUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/security"
	prefix="liferay-security"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util"%>

<portlet:defineObjects />

This is the
<b>QA Portlet</b>
portlet in View mode.
<br />
<%
	List<Question> questions = QuestionLocalServiceUtil.getAll();
	pageContext.setAttribute("questions", questions);
%>
<%-- the question title is <%=questions.get(0).getDescription() %> --%>
${questions[0].description} from el
<br />



<liferay-ui:search-container emptyResultsMessage="question-empty-list"
	delta="20">
	<liferay-ui:search-container-results>

		<%
			List<Question> list = QuestionLocalServiceUtil.getAll();
					results = ListUtil.subList(list,
							searchContainer.getStart(),
							searchContainer.getEnd());
					total = list.size();
					pageContext.setAttribute("results", results);
					pageContext.setAttribute("total", total);
		%>
	</liferay-ui:search-container-results>
	<liferay-ui:search-container-row className="Question" keyProperty="id"
		modelVar="question">
		<liferay-ui:search-container-column-text orderable="true" name="title"
			property="title" />
		<liferay-ui:search-container-column-text orderable="true"
			name="description" property="description" />

		<liferay-ui:search-container-column-text>
			<%
				Long primKey = ((Question) row.getObject()).getId();
			%>
<%-- 			<portlet:actionURL name="editMode" var="nextUrl" /> --%>
			<portlet:actionURL name="editMode" var="editUrl">
				<portlet:param name="id" value="<%=primKey.toString()%>" />
			</portlet:actionURL>
			<a href="${editUrl }">Editme</a>
		</liferay-ui:search-container-column-text>
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator />
</liferay-ui:search-container>