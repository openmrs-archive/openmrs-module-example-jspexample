package org.openmrs.module.jspexample;

import org.openmrs.module.web.extension.LinkExt;


public class GutterLink extends LinkExt {

	@Override
    public String getLabel() {
	    return "My Favorite Patients";
    }

	@Override
    public String getRequiredPrivilege() {
	    return null;
    }

	@Override
    public String getUrl() {
	    return "module/jspexample/myfavoritepatients.form";
    }

	
}
