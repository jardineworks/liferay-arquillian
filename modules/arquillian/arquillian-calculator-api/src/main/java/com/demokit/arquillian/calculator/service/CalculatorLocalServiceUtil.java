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

/**
 * Provides the local service utility for Calculator. This utility wraps
 * <code>com.demokit.arquillian.calculator.service.impl.CalculatorLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CalculatorLocalService
 * @generated
 */
public class CalculatorLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.demokit.arquillian.calculator.service.impl.CalculatorLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the two numbers provided together and returns the result.
	 *
	 * @param num1 long with the first number
	 * @param num2 long with the second number
	 * @return sum of the first and second number
	 */
	public static long add(long num1, long num2) {
		return getService().add(num1, num2);
	}

	/**
	 * Divides the first number by the second and returns the result.
	 *
	 * @param num1 long with the first number
	 * @param num2 long with the second number
	 * @return result of the first number divided by the second
	 * @throws DivideByZeroException thrown when the second number has a value of zero
	 */
	public static long divide(long num1, long num2)
		throws com.demokit.arquillian.calculator.exception.
			DivideByZeroException {

		return getService().divide(num1, num2);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * Multiplies the first and second numbers and returns the result.
	 *
	 * @param num1 long with the first number
	 * @param num2 long with the second number
	 * @return multiple of the first and second number
	 */
	public static long multiply(long num1, long num2) {
		return getService().multiply(num1, num2);
	}

	/**
	 * Negates the number provided, effectively converting positive numbers into negative number and negative numbers into positive numbers.
	 *
	 * @param num long with the number to be negated
	 * @return result of the inversion
	 */
	public static long negate(long num) {
		return getService().negate(num);
	}

	/**
	 * Subtracts the second number from the first and returns the result.
	 *
	 * @param num1 long with the first number
	 * @param num2 long with the second number
	 * @return difference between the first and second number
	 */
	public static long subtract(long num1, long num2) {
		return getService().subtract(num1, num2);
	}

	public static CalculatorLocalService getService() {
		return _service;
	}

	private static volatile CalculatorLocalService _service;

}