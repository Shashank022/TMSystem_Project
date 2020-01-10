<%@ include file= "common/header.jsp"%>
<%@ include file= "common/navigation.jsp"%>


<div class="container" >
<div class="row" style="border-color: black;"> 
<span class="border border-secondary">
	<c:forEach items="${events}" var="event">
		    <div class="col-xs-6 col-md-4" >
		         <div class="card border-success mb-3 text-left">
		        <h5 class="card-title"><strong>Event Name:</strong> ${event.event_name}</h5>
		        <p class="card-text"><strong>Created By :</strong> ${event.created_by}</p>
		        <p class="card-text"><strong>Updated By :</strong> ${event.updated_by}</p>
		        <a href="/update-event?id=${event.id}" class="btn btn-success">Update</a>
		        <a href="/delete-event?id=${event.id}" class="btn btn-danger">Delete</a>
		        <a href="/getDetails?id=${event.id}" class="btn btn-primary">Team Details</a>
		      </div>
		    </div>
	</c:forEach>
	</span>
</div>
<div>

<br><br>
	<a class="btn btn-success" href="/addevent">Add New Event</a>
</div>
</div>
	
</body>
<%@ include file= "common/footer.jsp"%>
</html>