package org.openmrs.module.jspexample;

import java.util.List;

import org.openmrs.api.OpenmrsService;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface JspExampleService extends OpenmrsService {
	
	public RoomTemperature getLatestRoomTemperature();
	
	/**
	 * Persisting the RoomTemperature object
	 * 
	 * @param rt the RoomTemperature to save
	 */
	public void saveRoomTemperature(RoomTemperature rt);
	
	/**
	 * Get all the saved room temperatures
	 * 
	 * @return the list of room temps in the database
	 */
	public List<RoomTemperature> getAllRoomTemperatures();
}
