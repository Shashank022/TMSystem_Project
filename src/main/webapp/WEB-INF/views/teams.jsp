<%@ include file= "common/header.jsp"%>
<%@ include file= "common/navigation.jsp"%>

<div class="container">

		<table class="table table-striped">
			<caption>List of Teams are</caption>

			<thead>
				<tr>
					<th>Team ID Details</th>
					<th>Team Name</th>
					<th>Event Name</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${teams}" var="team">
					<tr>
						<td>${team.team_id}</td>
						<td>${team.team_name}</td>
						<td>${team.event.event_id}</td>
						<td><a href="/updateteam?id=${team.team_id}" class="btn btn-success">Update</a></td>
						<td><a href="/deleteteam?id=${team.team_id}" class="btn btn-danger">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	<div>
	<a class="btn btn-success" href="/addtask">Add</a>
	</div>
</div>
<script>

/* var CORS = 'https://cors-anywhere.herokuapp.com/';

$.ajax({
  url: '',
  dataType: "json",
  type: "GET",
  data: {

  },
  success: function(jsonObject, status) {
    console.log("ajax result: " + JSON.stringify(jsonObject));
  }
}); */
</script>

</div>
</body>
<%@ include file= "common/footer.jsp"%>
</html>