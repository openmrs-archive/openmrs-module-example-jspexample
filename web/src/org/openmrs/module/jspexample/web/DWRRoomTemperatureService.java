package org.openmrs.module.jspexample.web;

import java.util.List;

import org.openmrs.api.APIException;

public class DWRRoomTemperatureService {
	
	/**
	 * Get all temperature integers in the system
	 * 
	 * @return all temperatures
	 */
	public List<Integer> getAllRoomTemperatures() {
		
		throw new APIException("Something bad happened");
		
//		
//		List<Integer> listToReturn = new ArrayList<Integer>();
//		
//		for (RoomTemperature rt : Context.getService(JspExampleService.class).getAllRoomTemperatures()) {
//			listToReturn.add(rt.getTemp());
//		}
//		
//		return listToReturn;
	}

}
