<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<html> 
<head> 
<title>Spring MVC Form Handling</title> 
</head> 
<body> 
<h2>Patient  Information</h2> 
<form:form method="POST" action="/WestClinicPatientWebApp/insert">
<table> 
<tr> 
<td><form:label path="userId">ID</form:label></td> 
<td><form:input path="userId" /></td> 
</tr>
<tr> 
<td><form:label path="firstName">firstName</form:label></td> 
<td><form:input path="firstName" /></td> 
</tr> 
<tr> 
<td><form:label path="lastName">lastName</form:label></td> 
<td><form:input path="lastName" /></td> 
</tr> 
<tr> 
<td><form:label path="gender">gender</form:label></td> 
<td><form:input path="gender" /></td> 
</tr> 
<tr> 
<td><form:label path="city">City</form:label></td> 
<td><form:input path="city" /></td> 
</tr> 
<tr> 
<td colspan="2"> 
<input type="submit" value="Submit"/> 
</td> 
</tr> 
</table> 
</form:form> 
</body> 
</html> 