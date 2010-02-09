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

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.Encounter;
import org.openmrs.EncounterType;
import org.openmrs.Location;
import org.openmrs.Patient;
import org.openmrs.api.context.Context;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * A controller for the /openmrs/module/jspexample/example.form page. <br/>
 * The component-scan in the moduleApplicationContext.xml file allows us to use spring annotations
 * in this class.
 */
@Controller
public class ExampleController {
	
	private Log log = LogFactory.getLog(ExampleController.class);
	
	/**
	 * This method is called for all "GET" requests to the urls of
	 * /module/jspexample/examplewithcontroller.form or
	 * /module/jspexample/examplewithcontroller.list <br/>
	 * <br/>
	 * No return value means that the examplewithcontroller.jsp page will be displayed because of
	 * the url.
	 * 
	 * @param modelMap the key-value pair of variables available in the jsp
	 */
	@RequestMapping(value = "/module/jspexample/examplewithcontroller", method = RequestMethod.GET)
	public void showPage(ModelMap modelMap) {
		log.trace("In the 'showPage' method");
		
		List<Patient> johns = Context.getPatientService().getPatients("john");
		List<Encounter> encs = new ArrayList<Encounter>();
		for (Patient p : johns) {
			encs.addAll(Context.getEncounterService().getEncountersByPatient(p));
		}
		Location somewhere = null;
		EncounterType foo = null;
		modelMap.put("patients", johns);
		modelMap.put("encounters", encs);
		
		JspExampleService service = Context.getService(JspExampleService.class);
		
		RoomTemperature temp = service.getLatestRoomTemperature();
		
		modelMap.put("temp", temp);
		
		
	}
	
}
