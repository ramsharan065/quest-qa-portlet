
<%@page import="javax.portlet.RenderRequest"%>
<%@page import="com.lftechnology.quest.qa.model.Answer"%>
<%@page import="java.util.List"%>
<%@page import="com.lftechnology.quest.qa.model.Question"%>
<%@page
	import="com.lftechnology.quest.qa.service.QuestionLocalServiceUtil"%>


<portlet:defineObjects />

This is the
<b>QA Portlet</b>
portlet in View mode.
<br />
the title is : ${question.title }<br/>
the description is : ${question.description }<br/>
the answer is : ${answers[0].answer }<br/>
answer created : ${answers[0].createDate }<br/>
<%
List<Answer> answers = (List<Answer>)request.getAttribute("answers");
for(Answer a : answers){
	out.println(a.getAnswer());out.println("<br/>");
	out.println("Created date: "+a.getCreateDate());out.println("<br/>");
}
%>