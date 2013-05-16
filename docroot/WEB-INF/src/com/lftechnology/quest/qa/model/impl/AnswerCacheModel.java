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

package com.lftechnology.quest.qa.model.impl;

import com.lftechnology.quest.qa.model.Answer;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing Answer in entity cache.
 *
 * @author ramsharan
 * @see Answer
 * @generated
 */
public class AnswerCacheModel implements CacheModel<Answer>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(id);
		sb.append(", answer=");
		sb.append(answer);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", questionId=");
		sb.append(questionId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append("}");

		return sb.toString();
	}

	public Answer toEntityModel() {
		AnswerImpl answerImpl = new AnswerImpl();

		answerImpl.setId(id);

		if (answer == null) {
			answerImpl.setAnswer(StringPool.BLANK);
		}
		else {
			answerImpl.setAnswer(answer);
		}

		if (createDate == Long.MIN_VALUE) {
			answerImpl.setCreateDate(null);
		}
		else {
			answerImpl.setCreateDate(new Date(createDate));
		}

		answerImpl.setUserId(userId);
		answerImpl.setQuestionId(questionId);
		answerImpl.setCompanyId(companyId);

		answerImpl.resetOriginalValues();

		return answerImpl;
	}

	public long id;
	public String answer;
	public long createDate;
	public long userId;
	public long questionId;
	public long companyId;
}