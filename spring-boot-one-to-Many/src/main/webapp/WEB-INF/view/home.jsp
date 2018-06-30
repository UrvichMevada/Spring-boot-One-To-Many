<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>

	<title>Home</title>
	
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-3.3.1.js"></script>
<script src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
</head>
<body>
<div class="container">
   <form class="form-horizontal" action="rege" method="post">
    <input type="hidden" id="id" name="id" value="0">
    <div class="form-group">
      <label class="control-label col-sm-2" >Name:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="name" name="name">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" >address:</label>
      <div class="col-sm-10">          
        <input type="text" class="form-control" id="adres" name="address">
      </div>
    </div>
   
   <div class="form-group">
      <label class="control-label col-sm-2" >Skill:</label>
      <div class="col-sm-10">     
            <input type="text" class="form-control"  name="empskillvo[0].skillname"  id="empskill0">
            <input type="hidden" value="0" name="empskillvo[0].skillid">
        	<input type="text" class="form-control"  name="empskillvo[1].skillname" id="empskill1">
        	<input type="hidden" value="0"  name="empskillvo[1].skillid">
      </div>
    </div> 
   
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">Submit</button>
      </div>
    </div>
  </form></div>
 
  
  <c:if test="${not empty list}">
  <table class="table table-striped">
   <thead>
      <tr>
        <th>id</th>
        <th>name</th>
        <th>adress</th>
        <th>comp</th>
        <th>Action</th>
     
      </tr>
        </thead>
    <tbody>
    <c:forEach items="${list}" var="list">
     <input type="hidden" id="empid" name="emp_id" value="${list.id}">
     <tr><td id="id">${list.id}</td><td id="name">${list.name}</td><td id="adre">${list.address}</td>
    <td>
      <c:forEach items="${list.empskillvo}" var="list2">
   		
   		<p> ${list2.skillname}</p> 
   
      </c:forEach>
    </td>
    <td><button class="btn btn-info">Edit</button> <a href="delete/${list.id}"><button class="btn btn-danger">Delete</button> </a></td>
   
     
     </tr>  
     
    </c:forEach>
    </tbody>
</table>
</c:if>
<script>
$(document).ready(function() {

	function edit(){alert("sds")}
	 var t = $('#example').DataTable();
	$(".btn-info").click(function() {
	    var $row = $(this).closest("tr"); 
	    $("#id").val($row.find("#id").text());
	    $("#name").val($row.find("#name").text());
	    $("#adres").val($row.find("#adre").text());
	    $("#compname").val($row.find("#comp").text());
	    $("#emp_id").val($row.find("#empid").val());
	    $("#empskill0").val($row.find("p:first").text());
	    $("#empskill1").val($row.find("p:nth-child(2)").text());
	       
	});
	
	
});
</script>
</body>
</html>
