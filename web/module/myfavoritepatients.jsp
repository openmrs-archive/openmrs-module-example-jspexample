<%@ include file="/WEB-INF/template/include.jsp" %>

<%@ include file="/WEB-INF/template/header.jsp" %>

<h1>My favorite ${fn:length(favorites)} patient(s)</h1>

<ul>
	<c:forEach var="p" items="${favorites}">
		<li><a href="<openmrs:contextPath/>/patientDashboard.form?patientId=${p.patientId}">${p.personName}</a></li>
	</c:forEach>
</ul>

<form method="post" action="addfavoritepatient.form">
	Patient:
	<openmrs:fieldGen formFieldName="patient_id" type="org.openmrs.Patient" val=""/>
	<input type="submit" value="Add"/>
</form>

<%@ include file="/WEB-INF/template/footer.jsp" %>
