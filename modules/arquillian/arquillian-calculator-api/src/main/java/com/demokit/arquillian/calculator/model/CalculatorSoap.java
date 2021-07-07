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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class CalculatorSoap implements Serializable {

	public static CalculatorSoap toSoapModel(Calculator model) {
		CalculatorSoap soapModel = new CalculatorSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setCalculatorId(model.getCalculatorId());

		return soapModel;
	}

	public static CalculatorSoap[] toSoapModels(Calculator[] models) {
		CalculatorSoap[] soapModels = new CalculatorSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CalculatorSoap[][] toSoapModels(Calculator[][] models) {
		CalculatorSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CalculatorSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CalculatorSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CalculatorSoap[] toSoapModels(List<Calculator> models) {
		List<CalculatorSoap> soapModels = new ArrayList<CalculatorSoap>(
			models.size());

		for (Calculator model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CalculatorSoap[soapModels.size()]);
	}

	public CalculatorSoap() {
	}

	public long getPrimaryKey() {
		return _calculatorId;
	}

	public void setPrimaryKey(long pk) {
		setCalculatorId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getCalculatorId() {
		return _calculatorId;
	}

	public void setCalculatorId(long calculatorId) {
		_calculatorId = calculatorId;
	}

	private String _uuid;
	private long _calculatorId;

}