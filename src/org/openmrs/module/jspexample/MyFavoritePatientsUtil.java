package org.openmrs.module.jspexample;

import java.util.ArrayList;
import java.util.List;

import org.openmrs.Cohort;
import org.openmrs.Patient;
import org.openmrs.User;
import org.openmrs.api.context.Context;

/**
 * This should really be implemented as a proper service, but I'm lazy.
 */
public class MyFavoritePatientsUtil {

	public static List<Patient> getFavoritePatients(User user) {
	    String cohortName = cohortName(user);
	    Cohort cohort = Context.getCohortService().getCohort(cohortName);
	    if (cohort == null)
	    	return new ArrayList<Patient>();
	    else {
	    	return Context.getPatientSetService().getPatients(cohort.getMemberIds());
	    }
    }

	private static String cohortName(User user) {
	    return "Favorite patients for user #" + user.getUserId();
    }

	public static void addFavoritePatient(User user, Patient p) {
		String cohortName = cohortName(user);
	    Cohort cohort = Context.getCohortService().getCohort(cohortName);
	    if (cohort == null) {
	    	cohort = new Cohort();
	    	cohort.setName(cohortName);
	    	cohort.setDescription("Automatically generated -- do not edit");
	    }
	    cohort.addMember(p.getPatientId());
	    Context.getCohortService().saveCohort(cohort);
    }

	
	
}
