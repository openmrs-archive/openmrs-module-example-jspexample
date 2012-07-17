package org.openmrs.module.jspexample;


/**
 * This is a regular Java class.  It's here to show that you can put code in a separate java file,
 * and to provide some methods to use in the unit testing demo.
 */
public class JspExampleUtils {

    /**
     * echo() is here so we can write a unit test.  It returns whatever you send it.
     *
     * @param returnThis a string to return
     * @return returnThis
     *
     * @should return the string you send in
     */
    public static String echo(String returnThis){
	return returnThis;

    }

}
