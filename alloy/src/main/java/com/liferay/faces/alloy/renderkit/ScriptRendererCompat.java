/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
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
package com.liferay.faces.alloy.renderkit;

import javax.faces.context.FacesContext;
import javax.faces.render.Renderer;


/**
 * This class provides a compatibility layer for JSF1/JSF2 and different versions of the Liferay Portal API.
 *
 * @author  Neil Griffin
 */
public abstract class ScriptRendererCompat extends Renderer {

	protected boolean isInline(FacesContext facesContext) {

		// Since Liferay 5.2 does not have the ability to render AUI ScriptData at the bottom of the portal page, all
		// scripts must be rendered inline.
		return true;
	}

	protected boolean isAjaxRequest(FacesContext facesContext) {
		return facesContext.getPartialViewContext().isAjaxRequest();
	}
}
