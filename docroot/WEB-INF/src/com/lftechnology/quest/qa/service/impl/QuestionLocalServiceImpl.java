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

import java.util.ArrayList;
import java.util.List;

import com.lftechnology.quest.qa.NoSuchuestionException;
import com.lftechnology.quest.qa.model.Question;
import com.lftechnology.quest.qa.service.base.QuestionLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the question local service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.lftechnology.quest.qa.service.QuestionLocalService} interface.
 * 
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 * 
 * @author ramsharan
 * @see com.lftechnology.quest.qa.service.base.QuestionLocalServiceBaseImpl
 * @see com.lftechnology.quest.qa.service.QuestionLocalServiceUtil
 */
public class QuestionLocalServiceImpl extends QuestionLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * com.lftechnology.quest.qa.service.QuestionLocalServiceUtil} to access the
	 * question local service.
	 */
	public Question add(Question question) {
		Question newQuestion = null;
		
		try {
			//create new question with unique primary key
			newQuestion = questionPersistence.create(counterLocalService.increment(Question.class.getName()));
			
			//copy fields values
			newQuestion.setTitle(question.getTitle());
			newQuestion.setDescription(question.getDescription());
			newQuestion.setCreateDate(question.getCreateDate());
			
			//copy all other fields
			newQuestion.setUserId(question.getUserId());
			newQuestion.setCompanyId(question.getCompanyId());
			
			newQuestion = questionPersistence.update(newQuestion, false);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return newQuestion;
	}

	public Question get(long id) {
		Question question = null;
		try {
			question = questionPersistence.findByPrimaryKey(id);
		} catch (NoSuchuestionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return question;
	}
	
	public Question update(Question question){
		return null;
	}
	
	public Question delete(long id){
		return null;
	}
	public List<Question> getAll(){
		List<Question> questions = new ArrayList<Question>();
		try {
			questions = questionPersistence.findAll();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return questions;
	}
}