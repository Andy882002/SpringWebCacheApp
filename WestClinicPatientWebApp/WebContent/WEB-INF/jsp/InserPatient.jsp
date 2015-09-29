<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h3>Hello Spring Patient</h3>
     
      <center>  
    
   
  <div>  
   <form:form method="post" action="/insert" modelAttribute="patient">  
    <table> 
      <tr>  
      <td>Patient ID :</td>  
      <td><form:input path="userId" /></td>  
     </tr> 
     <tr>  
      <td>First Name :</td>  
      <td><form:input path="firstName" /></td>  
     </tr>  
     <tr>  
      <td>Last Name :</td>  
      <td><form:input path="lastName" /></td>  
     </tr>  
     <tr>  
      <td>Gender :</td>  
        <td><form:input path="gender" /></td>
     </tr>  
     <tr>  
      <td>City :</td>  
       <td><form:input path="city" /></td>
     </tr>  
     <tr>  
      <td> </td>  
      <td><input type="submit" value="Save" /></td>  
     </tr>  
    
    </table>  
   </form:form>  
  </div>  
 </center>  
 

</body>
</html>