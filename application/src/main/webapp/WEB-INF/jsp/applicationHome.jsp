    
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <style><%@include file="/WEB-INF/css/style.css"%></style>
<title>Franchise Application Form</title>
</head>
<body>

	<div class="franchise-application-form-style" >

		<form:form  method="POST" action="${pageContext.request.contextPath}/addApplication" modelAttribute="application">
			
			<fieldset>
			
				<legend>Welcome, Enter Franchise Application Details</legend>
				
				<input placeholder="Applicants Name:"  name= "name" type="text" tabindex="1" maxlength="50" required autofocus />
				
				<input placeholder="Birth Date:" name ="birthDate" type="date" tabindex="3" required>
				
				<input placeholder="Contact Address" name ="address" type="text" tabindex="4" maxlength="100" required>
				
				<input placeholder="Contact Phone (Format: 123-456-7890)" name ="contactNumber" pattern="[0-9]{3}-[0-9]{3}-[0-9]{4}" type="tel" tabindex="5" maxlength="100" required>
				
				<input placeholder="Contact Email :" name ="email" type="email" size="30" tabindex="6"  maxlength="50" required>
				
				<label>Describe your previous experience about Food and Beverage business: <span class="required">*</span></label>
				<textarea  name="experience" id="experience" maxlength="100" class="field-long field-textarea"></textarea>
				
				<label>Describe your interest about our brand: <span class="required">*</span></label>
				<textarea name="interest" id="interest" maxlength="100" class="field-long field-textarea"></textarea>
				
				<label>Planned investment amount in USD: <span class="required">*</span></label>
				<input name ="investment" type="number" tabindex="7" maxlength="50" required>
				
				<label>In which geographical areas would you like to operate: <span class="required">*</span></label>
			    <select name="operationLocation" class="field-select">
			    <option value="Qatar">Qatar</option>
			    <option value="France">France</option>
			    <option value="Singapore">Singapore</option>
			    <option value="Germany">Germany</option>
			    </select>
				
				<label>Additional Notes: <span class="required">*</span></label>
				<textarea name="notes" id="notes" class="field-long field-textarea" maxlength="100"></textarea>
				
		    </fieldset>
		
			<button  name="submit" type="submit" id="contact-submit" data-submit="...Sending">Submit</button>
			
		</form:form>
	</div>
</body>
</html>