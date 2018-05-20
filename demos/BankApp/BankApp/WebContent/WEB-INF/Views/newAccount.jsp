<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="lable.title"></spring:message></title>
</head>
<body>
	<h2><spring:message code="lable.header"></spring:message></h2>
	<%-- <form action="saveAccount" name="accountForm" method="post"> --%>
	<form:form action="saveAccount" modelAttribute="account">
		<table>
			<tr>
				<td><spring:message code="lable.accountNo" /></td>
				<td><form:input path="accountNo" size="30" /></td>
			</tr>
			<tr>
				<td><spring:message code="lable.accountHolderName"></spring:message></td>
				<td><form:input path="accountHolderName" size="30"/></td>
			</tr>
			<tr>
				<td><spring:message code="lable.balance"></spring:message></td>
				<td><form:input path="balance" size="30"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="Create Account" name="btnSubmit"/>
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>