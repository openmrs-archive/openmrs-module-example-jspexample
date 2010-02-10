package org.openmrs.module.jspexample.db;

import java.util.List;

import org.openmrs.module.jspexample.RoomTemperature;


public interface JspExampleDAO {

	public RoomTemperature getLatestRoomTemperature();
	
	public void saveRoomTemperature(RoomTemperature rt);

	public List<RoomTemperature> getAllRoomTemperatures();
}
