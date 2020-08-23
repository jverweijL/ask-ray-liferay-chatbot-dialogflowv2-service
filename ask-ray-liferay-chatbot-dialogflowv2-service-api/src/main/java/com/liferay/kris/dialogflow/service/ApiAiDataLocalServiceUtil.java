/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.kris.dialogflow.service;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for ApiAiData. This utility wraps
 * <code>com.liferay.kris.dialogflow.service.impl.ApiAiDataLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ApiAiDataLocalService
 * @generated
 */
@ProviderType
public class ApiAiDataLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.kris.dialogflow.service.impl.ApiAiDataLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the api ai data to the database. Also notifies the appropriate model listeners.
	 *
	 * @param apiAiData the api ai data
	 * @return the api ai data that was added
	 */
	public static com.liferay.kris.dialogflow.model.ApiAiData addApiAiData(
		com.liferay.kris.dialogflow.model.ApiAiData apiAiData) {

		return getService().addApiAiData(apiAiData);
	}

	public static String addApiAiData(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		String query, String authtoken, String speech, String action,
		String fulfillment, String result) {

		return getService().addApiAiData(
			serviceContext, query, authtoken, speech, action, fulfillment,
			result);
	}

	/**
	 * Creates a new api ai data with the primary key. Does not add the api ai data to the database.
	 *
	 * @param apiAiDataId the primary key for the new api ai data
	 * @return the new api ai data
	 */
	public static com.liferay.kris.dialogflow.model.ApiAiData createApiAiData(
		long apiAiDataId) {

		return getService().createApiAiData(apiAiDataId);
	}

	/**
	 * Deletes the api ai data from the database. Also notifies the appropriate model listeners.
	 *
	 * @param apiAiData the api ai data
	 * @return the api ai data that was removed
	 */
	public static com.liferay.kris.dialogflow.model.ApiAiData deleteApiAiData(
		com.liferay.kris.dialogflow.model.ApiAiData apiAiData) {

		return getService().deleteApiAiData(apiAiData);
	}

	/**
	 * Deletes the api ai data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param apiAiDataId the primary key of the api ai data
	 * @return the api ai data that was removed
	 * @throws PortalException if a api ai data with the primary key could not be found
	 */
	public static com.liferay.kris.dialogflow.model.ApiAiData deleteApiAiData(
			long apiAiDataId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteApiAiData(apiAiDataId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liferay.kris.dialogflow.model.impl.ApiAiDataModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liferay.kris.dialogflow.model.impl.ApiAiDataModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.kris.dialogflow.model.ApiAiData fetchApiAiData(
		long apiAiDataId) {

		return getService().fetchApiAiData(apiAiDataId);
	}

	/**
	 * Returns the api ai data matching the UUID and group.
	 *
	 * @param uuid the api ai data's UUID
	 * @param groupId the primary key of the group
	 * @return the matching api ai data, or <code>null</code> if a matching api ai data could not be found
	 */
	public static com.liferay.kris.dialogflow.model.ApiAiData
		fetchApiAiDataByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchApiAiDataByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the api ai data with the primary key.
	 *
	 * @param apiAiDataId the primary key of the api ai data
	 * @return the api ai data
	 * @throws PortalException if a api ai data with the primary key could not be found
	 */
	public static com.liferay.kris.dialogflow.model.ApiAiData getApiAiData(
			long apiAiDataId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getApiAiData(apiAiDataId);
	}

	public static java.util.List<com.liferay.kris.dialogflow.model.ApiAiData>
		getApiAiDataByUserId(long userId) {

		return getService().getApiAiDataByUserId(userId);
	}

	/**
	 * Returns the api ai data matching the UUID and group.
	 *
	 * @param uuid the api ai data's UUID
	 * @param groupId the primary key of the group
	 * @return the matching api ai data
	 * @throws PortalException if a matching api ai data could not be found
	 */
	public static com.liferay.kris.dialogflow.model.ApiAiData
			getApiAiDataByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getApiAiDataByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the api ai datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liferay.kris.dialogflow.model.impl.ApiAiDataModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of api ai datas
	 * @param end the upper bound of the range of api ai datas (not inclusive)
	 * @return the range of api ai datas
	 */
	public static java.util.List<com.liferay.kris.dialogflow.model.ApiAiData>
		getApiAiDatas(int start, int end) {

		return getService().getApiAiDatas(start, end);
	}

	/**
	 * Returns all the api ai datas matching the UUID and company.
	 *
	 * @param uuid the UUID of the api ai datas
	 * @param companyId the primary key of the company
	 * @return the matching api ai datas, or an empty list if no matches were found
	 */
	public static java.util.List<com.liferay.kris.dialogflow.model.ApiAiData>
		getApiAiDatasByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getApiAiDatasByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of api ai datas matching the UUID and company.
	 *
	 * @param uuid the UUID of the api ai datas
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of api ai datas
	 * @param end the upper bound of the range of api ai datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching api ai datas, or an empty list if no matches were found
	 */
	public static java.util.List<com.liferay.kris.dialogflow.model.ApiAiData>
		getApiAiDatasByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.kris.dialogflow.model.ApiAiData>
					orderByComparator) {

		return getService().getApiAiDatasByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of api ai datas.
	 *
	 * @return the number of api ai datas
	 */
	public static int getApiAiDatasCount() {
		return getService().getApiAiDatasCount();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	public static java.util.List<com.liferay.kris.dialogflow.model.ApiAiData>
		getRecentConversation(
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			int records) {

		return getService().getRecentConversation(serviceContext, records);
	}

	public static java.util.List<com.liferay.kris.dialogflow.model.ApiAiData>
		getRecentConversation(
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			int records, String sortOrder) {

		return getService().getRecentConversation(
			serviceContext, records, sortOrder);
	}

	/**
	 * Updates the api ai data in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param apiAiData the api ai data
	 * @return the api ai data that was updated
	 */
	public static com.liferay.kris.dialogflow.model.ApiAiData updateApiAiData(
		com.liferay.kris.dialogflow.model.ApiAiData apiAiData) {

		return getService().updateApiAiData(apiAiData);
	}

	public static ApiAiDataLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ApiAiDataLocalService, ApiAiDataLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ApiAiDataLocalService.class);

		ServiceTracker<ApiAiDataLocalService, ApiAiDataLocalService>
			serviceTracker =
				new ServiceTracker
					<ApiAiDataLocalService, ApiAiDataLocalService>(
						bundle.getBundleContext(), ApiAiDataLocalService.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}