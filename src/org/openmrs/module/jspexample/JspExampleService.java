package org.openmrs.module.jspexample;

import org.openmrs.api.OpenmrsService;


public interface JspExampleService extends OpenmrsService {
	
	public RoomTemperature getLatestRoomTemperature();
	
}
