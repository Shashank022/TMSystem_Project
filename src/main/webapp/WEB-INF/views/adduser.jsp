<%@ include file= "common/header.jsp"%>
<%@ include file= "common/navigation.jsp"%>
<div class="container">
<h1>Add a User</h1>
	<form:form method="post" modelAttribute="event">
	
	

	<fieldset class="form-group">
		<form:label path="user_name">User name :</form:label>
		<form:input path="event_name" type="text" class="form-control" required="required"/>
		<form:errors path="event_name" cssClass="text-warning"/> 
	</fieldset>
	
	<fieldset class="form-group">
		<form:label path="created_by">Your Employee ID:</form:label>
		<form:input path="created_by" type="text" class="form-control" required="required"/>
		<form:errors path="created_by" cssClass="text-warning"/> 
	</fieldset>
		<input class="btn btn-success" type="submit" value="Submit"/>
	</form:form>
</div>

</body>
<%@ include file= "common/footer.jsp"%>
</html>