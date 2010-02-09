package org.openmrs.module.jspexample.db;

import org.openmrs.module.jspexample.RoomTemperature;


public interface JspExampleDAO {

	public RoomTemperature getLatestRoomTemperature();
	
}
