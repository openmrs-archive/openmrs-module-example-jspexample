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

import org.openmrs.module.Extension;

/**
 * We reference this class from our config.xml file and extend a point on the example page.
 */
public class ExampleExtension extends Extension {
	
	public Extension.MEDIA_TYPE getMediaType() {
		return Extension.MEDIA_TYPE.html;
	}

	public String getMethodOne() {
		return "method one. the parameters passed in are:" + getParameterMap().values();
	}
	
	public String getMethodTwo() {
		return "method two blah blah blah";
	}
	
//	public String getOverrideContent(String currentContent) {
//		return "the override content";
//	}
}
