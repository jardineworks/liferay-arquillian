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

package com.demokit.arquillian.calculator.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Calculator}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Calculator
 * @generated
 */
public class CalculatorWrapper
	extends BaseModelWrapper<Calculator>
	implements Calculator, ModelWrapper<Calculator> {

	public CalculatorWrapper(Calculator calculator) {
		super(calculator);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("calculatorId", getCalculatorId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long calculatorId = (Long)attributes.get("calculatorId");

		if (calculatorId != null) {
			setCalculatorId(calculatorId);
		}
	}

	/**
	 * Returns the calculator ID of this calculator.
	 *
	 * @return the calculator ID of this calculator
	 */
	@Override
	public long getCalculatorId() {
		return model.getCalculatorId();
	}

	/**
	 * Returns the primary key of this calculator.
	 *
	 * @return the primary key of this calculator
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the uuid of this calculator.
	 *
	 * @return the uuid of this calculator
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Sets the calculator ID of this calculator.
	 *
	 * @param calculatorId the calculator ID of this calculator
	 */
	@Override
	public void setCalculatorId(long calculatorId) {
		model.setCalculatorId(calculatorId);
	}

	/**
	 * Sets the primary key of this calculator.
	 *
	 * @param primaryKey the primary key of this calculator
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uuid of this calculator.
	 *
	 * @param uuid the uuid of this calculator
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected CalculatorWrapper wrap(Calculator calculator) {
		return new CalculatorWrapper(calculator);
	}

}