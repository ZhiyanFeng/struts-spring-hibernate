<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Page</title>
</head>
<body>
	<s:form action="register">
		<s:textfield name="name" label="Student Name" />
		<s:select name="gender" label="Gender" list="{'Male','Female'}" />
		<s:select name="grade" label="Grade" list="{'1','2','3','4','5','6' }" />
		<s:submit />
	</s:form>
</body>
</html>