package org.openmrs.module.jspexample;

import java.util.Date;

import org.openmrs.BaseOpenmrsData;
import org.openmrs.OpenmrsObject;


public class RoomTemperature extends BaseOpenmrsData implements OpenmrsObject {
	
	private Integer roomTemperatureId;
	
	private Date time;
	
	private Integer temp;
	
    /**
     * @return the roomTemperatureId
     */
    public Integer getRoomTemperatureId() {
    	return roomTemperatureId;
    }

	
    /**
     * @param roomTemperatureId the roomTemperatureId to set
     */
    public void setRoomTemperatureId(Integer roomTemperatureId) {
    	this.roomTemperatureId = roomTemperatureId;
    }

	
    /**
     * @return the time
     */
    public Date getTime() {
    	return time;
    }

	
    /**
     * @param time the time to set
     */
    public void setTime(Date time) {
    	this.time = time;
    }

	
    /**
     * @return the temp
     */
    public Integer getTemp() {
    	return temp;
    }

	
    /**
     * @param temp the temp to set
     */
    public void setTemp(Integer temp) {
    	this.temp = temp;
    }

	public Integer getId() {
		return getRoomTemperatureId();
	}
	
	public void setId(Integer arg0) {
		setRoomTemperatureId(arg0);
	}
	
}
