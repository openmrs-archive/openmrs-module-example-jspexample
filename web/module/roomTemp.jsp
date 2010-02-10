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

<%@ include file="/WEB-INF/template/footer.jsp" %>