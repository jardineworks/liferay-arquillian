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

package com.demokit.arquillian.calculator.service;

import com.demokit.arquillian.calculator.exception.DivideByZeroException;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Transactional;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for Calculator. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see CalculatorLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface CalculatorLocalService extends BaseLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.demokit.arquillian.calculator.service.impl.CalculatorLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the calculator local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link CalculatorLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the two numbers provided together and returns the result.
	 *
	 * @param num1 long with the first number
	 * @param num2 long with the second number
	 * @return sum of the first and second number
	 */
	public long add(long num1, long num2);

	/**
	 * Divides the first number by the second and returns the result.
	 *
	 * @param num1 long with the first number
	 * @param num2 long with the second number
	 * @return result of the first number divided by the second
	 * @throws DivideByZeroException thrown when the second number has a value of zero
	 */
	public long divide(long num1, long num2) throws DivideByZeroException;

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	/**
	 * Multiplies the first and second numbers and returns the result.
	 *
	 * @param num1 long with the first number
	 * @param num2 long with the second number
	 * @return multiple of the first and second number
	 */
	public long multiply(long num1, long num2);

	/**
	 * Negates the number provided, effectively converting positive numbers into negative number and negative numbers into positive numbers.
	 *
	 * @param num long with the number to be negated
	 * @return result of the inversion
	 */
	public long negate(long num);

	/**
	 * Subtracts the second number from the first and returns the result.
	 *
	 * @param num1 long with the first number
	 * @param num2 long with the second number
	 * @return difference between the first and second number
	 */
	public long subtract(long num1, long num2);

}