<%@ include file= "common/header.jsp"%>
<%@ include file= "common/navigation.jsp"%>

<div class="container">

		<table class="table table-striped">
			<caption>List of Teams are</caption>

			<thead>
				<tr>
					<th>Team Name</th>
					<th>Event Name</th>
					<th>Task Details</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${teams}" var="team">
					<tr>
						<td>${team.team_name}</td>
						<td>${team.event.event_id}</td>
						<td>${team.task_id}</td>
						<td><a href="/updatetask?id=${team.task_id}" class="btn btn-success">Update</a></td>
						<td><a href="/deletetask?id=${team.task_id}" class="btn btn-danger">Delete</a></td>
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