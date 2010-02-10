<%@ include file="/WEB-INF/template/include.jsp" %>

<%@ include file="/WEB-INF/template/header.jsp" %>

<form method="post">

 Temperature: <input type="text" name="temp" />
 <input type="submit"/>
 
</form>


<h2> Latest Room Temperature </h2>
${temp.temp} at <openmrs:formatDate date="${temp.time}"/>

<h2> All Temperatures </h2>
<c:forEach var="rt" items="${allTemps}">
	${rt.roomTemperatureId} - ${rt.temp} - <openmrs:formatDate date="${rt.time}"/> <br/>
</c:forEach>

<br/><br/>

<script src="<openmrs:contextPath/>/dwr/interface/DWRRoomTemperatureService"></script>
<script>
	function tempsFound(temps) {
		alert("Found Temperatures: " + temps.length);
	}
	
	function showTemperatures() {
		DWRRoomTemperatureService.getAllRoomTemperatures(tempsFound);
	}
</script>

<input type="button" onclick="showTemperatures()" value="Show Temperatures"/>


<%@ include file="/WEB-INF/template/footer.jsp" %>