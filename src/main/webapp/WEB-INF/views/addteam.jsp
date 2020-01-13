<%@ include file= "common/header.jsp"%>
<%@ include file= "common/navigation.jsp"%>
<div class="container">
<h3>Add a New Team</h3>
	<form:form method="post" modelAttribute="team">
	
	<div class="form-group col-md-4">
	<fieldset class="form-group">
		<form:label path="team_name">Task :</form:label>
		<form:input path="team_name" type="text" class="form-control" required="required"/>
		<form:errors path="team_name" cssClass="text-warning"/> 
	</fieldset>
	<fieldset class="form-group">
		<form:label path="event.id">Event ID :</form:label>
		<form:input path="event.id" type="text" class="form-control" required="required" id="team_event_id"/>
		<form:errors path="event.id" cssClass="text-warning"/> 
	</fieldset>
	
	<fieldset class="form-group">
		<form:label path="task_id">Task ID :</form:label>
		<form:input path="task_id" type="text" class="form-control" required="required"/>
		<form:errors path="task_id" cssClass="text-warning"/> 
	</fieldset>

	<input class="btn btn-success" type="submit" value="Submit"/>
</div>
	</form:form>
	
</div>

</body>
<script>
$(document).ready(function() {
    console.log( "ready!" );
    alert("Welcome to Jquery........>!!!");
    var team_id = document.getElementById('team_event_id');
    alert(team_id.value);
});
</script>
<%@ include file= "common/footer.jsp"%>
</html>