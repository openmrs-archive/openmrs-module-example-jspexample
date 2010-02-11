<%@ include file="/WEB-INF/template/include.jsp" %>

<%@ include file="/WEB-INF/template/header.jsp" %>

<openmrs:htmlInclude file="/scripts/jquery/jquery-1.3.2.min.js" />
<openmrs:htmlInclude file="/scripts/jquery/dataTables/css/dataTables.css" />
<openmrs:htmlInclude file="/scripts/jquery/dataTables/js/jquery.dataTables.min.js" />
<openmrs:htmlInclude file="/scripts/jquery-ui/js/jquery-ui-1.7.2.custom.min.js" />
<openmrs:htmlInclude file="/scripts/jquery-ui/css/redmond/jquery-ui-1.7.2.custom.css" />


<script type="text/javascript">
	var $j = jQuery.noConflict();
</script>

<!-- Javascript -->
<script type="text/javascript">
	$j(document).ready(function() {
		$j('#showButton').click( showTemps );
		$j('#tempTable').dataTable({
			"bLengthChange": false
		});
		$j('.help').dialog();
		$j('.help').dialog('hide');
		$j('#helpButton').click(function() { $j('.help').dialog('show'); });
	});
	
	function showTemps() {
		$j('#allTemps').slideToggle('slow');
	}
</script>


<!-- Page content -->

<form method="post">

 Temperature: <input type="text" name="temp" />
 <input type="submit"/>
 
 <span id="helpButton">Help</span>
 
 <div class="help">
     We have lots and lots of documentation at <a href="http://openmrs.org">our website</a>.
 </div>
 
</form>


<h2> Latest Room Temperature </h2>
${temp.temp} at <openmrs:formatDate date="${temp.time}"/>

<br/>
<a id="showButton" href="#">Show all temperatures</a>

<div id="allTemps">
<h2> All Temperatures </h2>
<table id="tempTable">
	<thead>
		<tr>
			<th>Id</th>
			<th>Time</th>
			<th>Temperature</th>
		</tr>
	</thead>
	<tbody>
<c:forEach var="rt" items="${allTemps}">
		<tr>
			<td>${rt.roomTemperatureId}</td>
			<td><openmrs:formatDate date="${rt.time}"/></td>
			<td>${rt.temp}</td>
		</tr>
</c:forEach>
	</tbody>
</table>
</div>

<br/><br/>

<h2> DWR Example </h2>

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