/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

package com.lftechnology.quest.qa.service.impl;

import java.util.List;

import com.lftechnology.quest.qa.model.Answer;
import com.lftechnology.quest.qa.service.AnswerLocalServiceUtil;
import com.lftechnology.quest.qa.service.base.AnswerLocalServiceBaseImpl;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the answer local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.lftechnology.quest.qa.service.AnswerLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author ramsharan
 * @see com.lftechnology.quest.qa.service.base.AnswerLocalServiceBaseImpl
 * @see com.lftechnology.quest.qa.service.AnswerLocalServiceUtil
 */
public class AnswerLocalServiceImpl extends AnswerLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.lftechnology.quest.qa.service.AnswerLocalServiceUtil} to access the answer local service.
	 */
	public Answer add(Answer answer) {
		return null;
	}

	public Answer get(long id) {
		return null;
	}
	
	public Answer update(Answer answer){
		return null;
	}
	
	public Answer delete(long id){
		return null;
	}
	public List<Answer> getAllOfQuestion(long questinId){
		List<Answer> answers = null;
		//answerPersistence.findWithDynamicQuery("FROM Answer WHERE questionId=:questionId");
		DynamicQuery dq = new DynamicQueryFactoryUtil().forClass(Answer.class);
		dq.add(RestrictionsFactoryUtil.eq("questionId", new Long(questinId)));
		try {
			answers = AnswerLocalServiceUtil.dynamicQuery(dq);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return answers;
	}
}