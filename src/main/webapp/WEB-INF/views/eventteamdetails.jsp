<%@ include file= "common/header.jsp"%>
<%@ include file= "common/navigation.jsp"%>

<div class="container">

		<table class="table table-striped">
			<caption>Teams for Event :  <strong style="color: green">${event.event_name}</strong>  </caption>

			<thead>
				<tr>
					<th>Team Name</th>
					<th>Event ID</th>
					<th>Team ID</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${teams}" var="team">
					<tr>
						<td>${team.team_name}</td>
						<td>${team.event_id}</td>
						<td>${team.task_id}</td>
						<td><a href="/update-event?id=${team.event_id}" class="btn btn-success">Task List</a></td>
						<td><a href="/delete-event?id=${team.event_id}" class="btn btn-danger">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	<div>
	<a class="btn btn-success" href="/addevent">Add</a>
	</div>
</div>
</body>

<%@ include file= "common/footer.jsp"%>
</html>