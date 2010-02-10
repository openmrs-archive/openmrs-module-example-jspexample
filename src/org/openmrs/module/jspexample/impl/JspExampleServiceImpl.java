package org.openmrs.module.jspexample.impl;

import java.util.List;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.jspexample.JspExampleService;
import org.openmrs.module.jspexample.RoomTemperature;
import org.openmrs.module.jspexample.db.JspExampleDAO;


public class JspExampleServiceImpl extends BaseOpenmrsService implements JspExampleService {
	
	private JspExampleDAO dao;
	
	public void setJspExampleDAO(JspExampleDAO dao) {
		this.dao = dao;
	}
	
	public RoomTemperature getLatestRoomTemperature() {
		return dao.getLatestRoomTemperature();
	}
	
	public void saveRoomTemperature(RoomTemperature rt) {
		dao.saveRoomTemperature(rt);
	}

	public List<RoomTemperature> getAllRoomTemperatures() {
	    return dao.getAllRoomTemperatures();
    }
	
	
}
