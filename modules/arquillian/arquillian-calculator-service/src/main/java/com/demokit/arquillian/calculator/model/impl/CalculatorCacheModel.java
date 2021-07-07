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

package com.demokit.arquillian.calculator.model.impl;

import com.demokit.arquillian.calculator.model.Calculator;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Calculator in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CalculatorCacheModel
	implements CacheModel<Calculator>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CalculatorCacheModel)) {
			return false;
		}

		CalculatorCacheModel calculatorCacheModel =
			(CalculatorCacheModel)object;

		if (calculatorId == calculatorCacheModel.calculatorId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, calculatorId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", calculatorId=");
		sb.append(calculatorId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Calculator toEntityModel() {
		CalculatorImpl calculatorImpl = new CalculatorImpl();

		if (uuid == null) {
			calculatorImpl.setUuid("");
		}
		else {
			calculatorImpl.setUuid(uuid);
		}

		calculatorImpl.setCalculatorId(calculatorId);

		calculatorImpl.resetOriginalValues();

		return calculatorImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		calculatorId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(calculatorId);
	}

	public String uuid;
	public long calculatorId;

}