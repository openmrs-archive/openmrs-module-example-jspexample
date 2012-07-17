/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.jspexample;

import java.util.LinkedHashMap;
import java.util.Map;

import org.openmrs.module.web.extension.AdministrationSectionExt;

/**
 * This class is referenced in the config.xml to map this class to the admin list extension point.
 * This puts the {@link #getLinks()} text as links on the Administration page.
 */
public class AdminList extends AdministrationSectionExt {
	
	@Override
	public Map<String, String> getLinks() {
		Map<String, String> map = new LinkedHashMap<String, String>();
		
		map.put("/module/jspexample/example.htm", "Example Page");
		map.put("/module/jspexample/examplewithcontroller.form", "Controller Example Page");
		map.put("/module/jspexample/examplewithoutheader.htm", "No Headers page");
		
		return map;
	}
	
	@Override
	public String getTitle() {
		return "JSP Example Module";
	}
	
}
