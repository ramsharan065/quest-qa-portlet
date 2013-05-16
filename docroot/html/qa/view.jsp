<%@page import="com.lftechnology.quest.qa.model.Question"%>
<%@page import="java.util.List"%>
<%@page import="com.lftechnology.quest.qa.service.QuestionLocalServiceUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

This is the <b>QA Portlet</b> portlet in View mode.<br/>
<%
	List<Question> questions = QuestionLocalServiceUtil.getAll();
%>
the question title is <%=questions.get(0).getDescription() %>