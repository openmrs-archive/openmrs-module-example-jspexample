package org.openmrs.module.jspexample.web;

import java.util.ArrayList;
import java.util.List;

import org.openmrs.api.context.Context;
import org.openmrs.module.jspexample.JspExampleService;
import org.openmrs.module.jspexample.RoomTemperature;

public class DWRRoomTemperatureService {
	
	public List<Integer> getAllRoomTemperatures() {
		List<Integer> listToReturn = new ArrayList<Integer>();
		for (RoomTemperature rt : Context.getService(JspExampleService.class).getAllRoomTemperatures()) {
			listToReturn.add(rt.getTemp());
		}
		
		return listToReturn;
	}

}
