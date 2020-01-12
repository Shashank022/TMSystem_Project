<%@ include file= "common/header.jsp"%>
<%@ include file= "common/navigation.jsp"%>

<div class="container">

		<table class="table table-striped">
			<caption>Your List of Tasks are</caption>

			<thead>
				<tr>
					<th>Team Name</th>
					<th>Task Created</th>
					<th>Task Updated</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${tasks}" var="task">
					<tr>
						<td>${task.task_name}</td>
						<td>${task.task_created}</td>
						<td>${task.task_updated}</td>
						<td><a href="/updatetask?id=${task.task_id}" class="btn btn-success">Update</a></td>
						<td><a href="/deletetask?id=${task.task_id}" class="btn btn-danger">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	<div>
	<a class="btn btn-success" href="/addtask">Add</a>
	</div>
</div>

</div>
</body>
<%@ include file= "common/footer.jsp"%>
</html>