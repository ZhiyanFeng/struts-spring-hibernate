<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Product List</title>
</head>
<body>
	<div align="center">
		<table width="80%" border="1" style="border-collapse: collapse;">
			<tr>
				<th>No</th>
				<th>Name</th>
				<th>Gender</th>
				<th>Teacher</th>
				<th>Grade</th>
			</tr>
			<s:iterator var="student" value="studentList">
				<tr>
					<td><s:property value="id" /></td>
					<td><s:property value="name" /></td>
					<c:choose>
						<c:when test="${gender == true}">
							<td>Male</td>
						</c:when>
						<c:otherwise>
							<td>Female</td>
						</c:otherwise>
					</c:choose>
					<td><s:property value="#student.category.name" /></td>
					<td><s:property value="#student.category.grade" /></td>
				</tr>
			</s:iterator>
		</table>
		<button>
			<a href="addStudentForm">Add Student</a>
		</button>
	</div>
</body>
</html>