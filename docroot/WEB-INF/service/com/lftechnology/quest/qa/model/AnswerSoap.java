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

package com.lftechnology.quest.qa.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author    ramsharan
 * @generated
 */
public class AnswerSoap implements Serializable {
	public static AnswerSoap toSoapModel(Answer model) {
		AnswerSoap soapModel = new AnswerSoap();

		soapModel.setId(model.getId());
		soapModel.setAnswer(model.getAnswer());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setUserId(model.getUserId());
		soapModel.setQuestionId(model.getQuestionId());
		soapModel.setCompanyId(model.getCompanyId());

		return soapModel;
	}

	public static AnswerSoap[] toSoapModels(Answer[] models) {
		AnswerSoap[] soapModels = new AnswerSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AnswerSoap[][] toSoapModels(Answer[][] models) {
		AnswerSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AnswerSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AnswerSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AnswerSoap[] toSoapModels(List<Answer> models) {
		List<AnswerSoap> soapModels = new ArrayList<AnswerSoap>(models.size());

		for (Answer model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AnswerSoap[soapModels.size()]);
	}

	public AnswerSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getAnswer() {
		return _answer;
	}

	public void setAnswer(String answer) {
		_answer = answer;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public long getQuestionId() {
		return _questionId;
	}

	public void setQuestionId(long questionId) {
		_questionId = questionId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	private long _id;
	private String _answer;
	private Date _createDate;
	private long _userId;
	private long _questionId;
	private long _companyId;
}