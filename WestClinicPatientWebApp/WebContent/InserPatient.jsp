<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css"> 
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script> 

<title>Insert title here</title>
</head>
<body>
 <h3>Hello Spring Patient</h3>
     
    <div class="container">
  <h2>Vertical (basic) form</h2>
    <form novalidate class="form-horizontal" action="/updateUser" method="post">
  <div class="form-group">
     <label class="col-sm-2 control-label">User ID:</label>
      <div class="col-sm-10">
      <input type="text" ng-model="userId" name="userId" ng-disabled="edit" placeholder="User ID">
      </div>
  </div>
    <div class="form-group">
       <label class="col-sm-2 control-label">First Name:</label>
        <div class="col-sm-10">
        <input type="text" ng-model="fname" name="fname" ng-disabled="edit" placeholder="First Name">
       </div>
  </div> 
  <div class="form-group">
    <label class="col-sm-2 control-label">Last Name:</label>
    <div class="col-sm-10">
    <input type="text" ng-model="lname" name="lname" ng-disabled="edit" placeholder="Last Name">
    </div>
  </div>
    <div class="form-group">
      <label class="col-sm-2 control-label">Gender:</label>
       <div class="col-sm-10">
       <input type="text" ng-model="gender" name="gender" ng-disabled="edit" placeholder="Gender">
       </div>
   </div><!-- end class="fron-groupd" -->
     <div class="form-group">
       <label class="col-sm-2 control-label">City:</label>
       <div class="col-sm-10">
      <input type="text" ng-model="city" name="city" ng-disabled="edit" placeholder="City">
       </div>
    </div><!-- end form-froupd -->
</div>
 

</body>
</html>