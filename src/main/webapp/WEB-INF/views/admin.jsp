<%@ include file= "common/header.jsp"%>
<%@ include file= "common/navigation.jsp"%>

<div class="container">
<div>

</div>

    <div class="container">

      <!-- Main component for a primary marketing message or call to action -->
      <div class="jumbotron">
      
        <h2>Task Monitoring System</h2>
        <br>
       <div></div>
      
        <p></p>
        <p>
         <h5><a href="/eventstats"> Click here</a> to get your stats for the Events.</h5>
        </p>
       
          <c:if test = "${eventstat > 0}">
           <div class="jumbotron">
          <table border="2" style="align-items: center;">
          <thead> <tr><td>Events : </td> <td> Number</td></tr></thead>
          <tr><td>The Number of the Events Open: </td> <td>${eventstat}</td></tr>
          <tr><td>The Number of the Events Pending: </td> <td>${eventstat}</td></tr>
          <tr><td>The Number of the Events Open: </td> <td>${eventstat}</td></tr>
          <tr><td>The Number of the Events Open: </td> <td>${eventstat}</td></tr>
          <tr><td>The Number of the Events Open: </td> <td>${eventstat}</td></tr>
          </table>
           </div>
          </c:if>

      </div>

    </div> <!-- /container -->


</div>
</body>
<%@ include file= "common/footer.jsp"%>
</html>