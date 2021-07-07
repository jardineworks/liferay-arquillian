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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CalculatorLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CalculatorLocalService
 * @generated
 */
public class CalculatorLocalServiceWrapper
	implements CalculatorLocalService, ServiceWrapper<CalculatorLocalService> {

	public CalculatorLocalServiceWrapper(
		CalculatorLocalService calculatorLocalService) {

		_calculatorLocalService = calculatorLocalService;
	}

	/**
	 * Adds the two numbers provided together and returns the result.
	 *
	 * @param num1 long with the first number
	 * @param num2 long with the second number
	 * @return sum of the first and second number
	 */
	@Override
	public long add(long num1, long num2) {
		return _calculatorLocalService.add(num1, num2);
	}

	/**
	 * Divides the first number by the second and returns the result.
	 *
	 * @param num1 long with the first number
	 * @param num2 long with the second number
	 * @return result of the first number divided by the second
	 * @throws DivideByZeroException thrown when the second number has a value of zero
	 */
	@Override
	public long divide(long num1, long num2)
		throws com.demokit.arquillian.calculator.exception.
			DivideByZeroException {

		return _calculatorLocalService.divide(num1, num2);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _calculatorLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * Multiplies the first and second numbers and returns the result.
	 *
	 * @param num1 long with the first number
	 * @param num2 long with the second number
	 * @return multiple of the first and second number
	 */
	@Override
	public long multiply(long num1, long num2) {
		return _calculatorLocalService.multiply(num1, num2);
	}

	/**
	 * Negates the number provided, effectively converting positive numbers into negative number and negative numbers into positive numbers.
	 *
	 * @param num long with the number to be negated
	 * @return result of the inversion
	 */
	@Override
	public long negate(long num) {
		return _calculatorLocalService.negate(num);
	}

	/**
	 * Subtracts the second number from the first and returns the result.
	 *
	 * @param num1 long with the first number
	 * @param num2 long with the second number
	 * @return difference between the first and second number
	 */
	@Override
	public long subtract(long num1, long num2) {
		return _calculatorLocalService.subtract(num1, num2);
	}

	@Override
	public CalculatorLocalService getWrappedService() {
		return _calculatorLocalService;
	}

	@Override
	public void setWrappedService(
		CalculatorLocalService calculatorLocalService) {

		_calculatorLocalService = calculatorLocalService;
	}

	private CalculatorLocalService _calculatorLocalService;

}