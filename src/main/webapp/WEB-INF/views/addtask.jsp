<%@ include file= "common/header.jsp"%>
<%@ include file= "common/navigation.jsp"%>
<div class="container">
<h3>Add a New Task</h3>
	<form:form method="post" modelAttribute="task">
	
	<div class="form-group col-md-4">
	<fieldset class="form-group">
		<form:label path="task_name">Task :</form:label>
		<form:input path="task_name" type="text" class="form-control" required="required"/>
		<form:errors path="task_name" cssClass="text-warning"/> 
	</fieldset>

	
	<fieldset class="form-group">
		<form:label path="task_created">Task Created Date :</form:label>
		<form:input path="task_created" type="text" class="form-control" required="required"/>
		<form:errors path="task_created" cssClass="text-warning"/> 
	</fieldset>
	
	<fieldset class="form-group">
		<form:label path="task_updated">Task Updated By:</form:label>
		<form:input path="task_updated" type="text" class="form-control" required="required"/>
		<form:errors path="task_updated" cssClass="text-warning"/> 
	</fieldset>

	<input class="btn btn-success" type="submit" value="Submit"/>
</div>
	</form:form>
	
</div>

</body>
<%@ include file= "common/footer.jsp"%>
</html>