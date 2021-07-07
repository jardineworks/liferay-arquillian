/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 * <p>
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * <p>
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.demokit.arquillian.calculator.service.impl;

import com.demokit.arquillian.calculator.exception.DivideByZeroException;
import com.demokit.arquillian.calculator.service.base.CalculatorLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the calculator local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.demokit.arquillian.calculator.service.CalculatorLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CalculatorLocalServiceBaseImpl
 */
@Component(
        property = "model.class.name=com.demokit.arquillian.calculator.model.Calculator",
        service = AopService.class
)
public class CalculatorLocalServiceImpl extends CalculatorLocalServiceBaseImpl
{

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this class directly. Use <code>com.demokit.arquillian.calculator.service.CalculatorLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.demokit.arquillian.calculator.service.CalculatorLocalServiceUtil</code>.
     */

    /**
     * Adds the two numbers provided together and returns the result.
     * @param num1 long with the first number
     * @param num2 long with the second number
     * @return sum of the first and second number
     */
    public long add(long num1, long num2)
    {
        return num1 + num2;
    }

    /**
     * Subtracts the second number from the first and returns the result.
     * @param num1 long with the first number
     * @param num2 long with the second number
     * @return difference between the first and second number
     */
    public long subtract(long num1, long num2)
    {

        return num1 - num2;
    }

    /**
     * Multiplies the first and second numbers and returns the result.
     * @param num1 long with the first number
     * @param num2 long with the second number
     * @return multiple of the first and second number
     */
    public long multiply(long num1, long num2)
    {
        return num1 * num2;
    }

    /**
     * Divides the first number by the second and returns the result.
     * @param num1 long with the first number
     * @param num2 long with the second number
     * @return result of the first number divided by the second
     * @throws DivideByZeroException thrown when the second number has a value of zero
     */
    public long divide(long num1, long num2) throws DivideByZeroException
    {
        if ( num2 == 0 )
            throw new DivideByZeroException();

        return num1 / num2;
    }

    /**
     * Negates the number provided, effectively converting positive numbers into negative number and negative numbers into positive numbers.
     * @param num long with the number to be negated
     * @return result of the inversion
     */
    public long negate(long num)
    {
        return num * -1;
    }
}