
<%@page import="com.lftechnology.quest.qa.model.Question"%>
<%@page
	import="com.lftechnology.quest.qa.service.QuestionLocalServiceUtil"%>

<portlet:defineObjects />

This is the
<b>QA Portlet</b>
portlet in View mode.
<br />
the title is : ${question.title }<br/>
the description is : ${question.description }
