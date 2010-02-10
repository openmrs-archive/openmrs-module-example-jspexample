<%@ include file="/WEB-INF/template/include.jsp" %>

<%@ include file="/WEB-INF/template/header.jsp" %>

This page can be access at http://localhost:8080/openmrs/module/jspexample/example.htm because there is no controller defined.

<br/><br/>
-- Start of Extension point <br/>
<openmrs:extensionPoint pointId="org.openmrs.module.jspexample.example" type="html" parameters="patientId=${patientId}|key=value|key2=value2">
	toString output of the class that extends this point: ${extension} <br/>
	methodOne output: ${extension.methodOne} <br/>
	methodTwo output: ${extension.methodTwo} <br/>
</openmrs:extensionPoint>

<openmrs:extensionPoint pointId="org.openmrs.module.jspexample.example.bottom"></openmrs:extensionPoint>

<br/>
-- end of extension point
<br/>

<%@ include file="/WEB-INF/template/footer.jsp" %>