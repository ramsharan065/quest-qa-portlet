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

package com.lftechnology.quest.qa.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link AnswerLocalService}.
 * </p>
 *
 * @author    ramsharan
 * @see       AnswerLocalService
 * @generated
 */
public class AnswerLocalServiceWrapper implements AnswerLocalService,
	ServiceWrapper<AnswerLocalService> {
	public AnswerLocalServiceWrapper(AnswerLocalService answerLocalService) {
		_answerLocalService = answerLocalService;
	}

	/**
	* Adds the answer to the database. Also notifies the appropriate model listeners.
	*
	* @param answer the answer
	* @return the answer that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.quest.qa.model.Answer addAnswer(
		com.lftechnology.quest.qa.model.Answer answer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _answerLocalService.addAnswer(answer);
	}

	/**
	* Creates a new answer with the primary key. Does not add the answer to the database.
	*
	* @param id the primary key for the new answer
	* @return the new answer
	*/
	public com.lftechnology.quest.qa.model.Answer createAnswer(long id) {
		return _answerLocalService.createAnswer(id);
	}

	/**
	* Deletes the answer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the answer
	* @return the answer that was removed
	* @throws PortalException if a answer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.quest.qa.model.Answer deleteAnswer(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _answerLocalService.deleteAnswer(id);
	}

	/**
	* Deletes the answer from the database. Also notifies the appropriate model listeners.
	*
	* @param answer the answer
	* @return the answer that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.quest.qa.model.Answer deleteAnswer(
		com.lftechnology.quest.qa.model.Answer answer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _answerLocalService.deleteAnswer(answer);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _answerLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _answerLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _answerLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _answerLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _answerLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.lftechnology.quest.qa.model.Answer fetchAnswer(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _answerLocalService.fetchAnswer(id);
	}

	/**
	* Returns the answer with the primary key.
	*
	* @param id the primary key of the answer
	* @return the answer
	* @throws PortalException if a answer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.quest.qa.model.Answer getAnswer(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _answerLocalService.getAnswer(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _answerLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the answers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of answers
	* @param end the upper bound of the range of answers (not inclusive)
	* @return the range of answers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.lftechnology.quest.qa.model.Answer> getAnswers(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _answerLocalService.getAnswers(start, end);
	}

	/**
	* Returns the number of answers.
	*
	* @return the number of answers
	* @throws SystemException if a system exception occurred
	*/
	public int getAnswersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _answerLocalService.getAnswersCount();
	}

	/**
	* Updates the answer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param answer the answer
	* @return the answer that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.quest.qa.model.Answer updateAnswer(
		com.lftechnology.quest.qa.model.Answer answer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _answerLocalService.updateAnswer(answer);
	}

	/**
	* Updates the answer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param answer the answer
	* @param merge whether to merge the answer with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the answer that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.quest.qa.model.Answer updateAnswer(
		com.lftechnology.quest.qa.model.Answer answer, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _answerLocalService.updateAnswer(answer, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _answerLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_answerLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _answerLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	public com.lftechnology.quest.qa.model.Answer add(
		com.lftechnology.quest.qa.model.Answer answer) {
		return _answerLocalService.add(answer);
	}

	public com.lftechnology.quest.qa.model.Answer get(long id) {
		return _answerLocalService.get(id);
	}

	public com.lftechnology.quest.qa.model.Answer update(
		com.lftechnology.quest.qa.model.Answer answer) {
		return _answerLocalService.update(answer);
	}

	public com.lftechnology.quest.qa.model.Answer delete(long id) {
		return _answerLocalService.delete(id);
	}

	public java.util.List<com.lftechnology.quest.qa.model.Answer> getAll() {
		return _answerLocalService.getAll();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public AnswerLocalService getWrappedAnswerLocalService() {
		return _answerLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedAnswerLocalService(
		AnswerLocalService answerLocalService) {
		_answerLocalService = answerLocalService;
	}

	public AnswerLocalService getWrappedService() {
		return _answerLocalService;
	}

	public void setWrappedService(AnswerLocalService answerLocalService) {
		_answerLocalService = answerLocalService;
	}

	private AnswerLocalService _answerLocalService;
}