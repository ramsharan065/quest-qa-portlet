package com.lftechnology.quest.qa;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.lftechnology.quest.qa.model.Question;
import com.lftechnology.quest.qa.service.QuestionLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class QAPortlet
 */
public class QAPortlet extends MVCPortlet {
	
	public void editMode(ActionRequest renderRequest,
			ActionResponse renderResponse) throws IOException, PortletException {
		// TODO Auto-generated method stub
		System.out.println("hello i am from edit mode  and the input id is "+renderRequest.getParameter("id"));
		Question question = QuestionLocalServiceUtil.get(Integer.parseInt(renderRequest.getParameter("id")));
		renderRequest.setAttribute("question", question);
		renderResponse.setRenderParameter("jspPage", "/html/qa/singleQuestionView.jsp");
	}
	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		// TODO Auto-generated method stub
		super.doView(renderRequest, renderResponse);
	}

}
