<%@ include file="/WEB-INF/template/include.jsp" %>

<%@ include file="/WEB-INF/template/header.jsp" %>

<h1>Patients named John!!!</h1>

<table border="1">
	<c:forEach var="p" items="${patients}">
		<tr>
			<td>${p.personName}</td> <%-- p.getPersonName().getFullName() --%>
			<td>created on: <openmrs:formatDate date="${p.dateCreated}"/></td>
		</tr>
	</c:forEach>
	<tr>
		<td colspan="2">
			All their encounters:
			<c:forEach var="e" items="${encounters}">
				at ${e.location.name} on <openmrs:formatDate date="${e.encounterDatetime}"/>
			</c:forEach> 
		</td>
	</tr>
</table>

<h2> Latest Room Temperature </h2>
${temp.temp} at <openmrs:formatDate date="${temp.time}"/>

This page can be access at either

http://localhost:8080/openmrs/module/jspexample/examplewithcontroller.form

 or 

http://localhost:8080/openmrs/module/jspexample/examplewithcontroller.list

 or 

http://localhost:8080/openmrs/module/jspexample/examplewithcontroller.htm 
(but NO controller access with this .htm url)

<br/><br/>

<%@ include file="/WEB-INF/template/footer.jsp" %>