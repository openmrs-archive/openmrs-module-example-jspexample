package org.openmrs.module.jspexample;

import org.openmrs.Patient;
import org.openmrs.api.context.Context;
import org.openmrs.propertyeditor.PatientEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyFavoritePatientsController {

	@InitBinder
	public void initBinder(WebDataBinder wdb) {
		wdb.registerCustomEditor(Patient.class, new PatientEditor());
	}
	
	@RequestMapping("/module/jspexample/myfavoritepatients")
	public void showFavs(ModelMap model) {
		model.addAttribute("favorites", MyFavoritePatientsUtil.getFavoritePatients(Context.getAuthenticatedUser()));
	}
	
	@RequestMapping("/module/jspexample/addfavoritepatient")
	public String addFave(@RequestParam("patient_id") Patient patient) {
		if (patient != null)
			MyFavoritePatientsUtil.addFavoritePatient(Context.getAuthenticatedUser(), patient);
		return "redirect:myfavoritepatients.form";
	}
	
}
