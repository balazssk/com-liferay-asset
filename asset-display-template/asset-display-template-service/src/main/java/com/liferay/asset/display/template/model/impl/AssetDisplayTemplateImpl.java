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

package com.liferay.asset.display.template.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.ClassName;
import com.liferay.portal.kernel.security.permission.ResourceActionsUtil;
import com.liferay.portal.kernel.service.ClassNameLocalServiceUtil;

import java.util.Locale;

/**
 * @author Pavel Savinov
 */
@ProviderType
public class AssetDisplayTemplateImpl extends AssetDisplayTemplateBaseImpl {

	@Override
	public String getAssetTypeName(Locale locale) throws PortalException {
		ClassName className = ClassNameLocalServiceUtil.getClassName(
			getClassNameId());

		return ResourceActionsUtil.getModelResource(
			locale, className.getValue());
	}

}