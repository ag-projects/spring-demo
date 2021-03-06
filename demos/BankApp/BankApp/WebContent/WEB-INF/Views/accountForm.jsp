<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="lable.title"></spring:message></title>
<style>
	.error {
		color: red
	
}
</style>
</head>
<body>
	<h2><spring:message code="lable.header"></spring:message></h2>
	<%-- <form action="saveAccount" name="accountForm" method="post"> --%>
	<form:form action="saveAccount" modelAttribute="account">
		<table>
			<tr>
				<td><spring:message code="lable.accountNo" /></td>
				<td><form:input path="accountNo" size="30" />
					<form:errors path="accountNo" cssClass="error"/>
				</td>
			</tr>
			<tr>
				<td><spring:message code="lable.accountHolderName"></spring:message></td>
				<td><form:input path="accountHolderName" size="30"/>
					<form:errors path="accountHolderName" cssClass="error"/>
				</td>
			</tr>
			<tr>
				<td><spring:message code="lable.balance"></spring:message></td>
				<td><form:input path="balance" size="30"/>
					<form:errors path="balance" cssClass="error"/>
				</td>
			</tr>
			<tr>
				<td><spring:message code="lable.account.type"></spring:message>:</td>
				<td>
					<form:select path="accountType">
						<form:option value="">Select Account Type</form:option>
						<form:option value="SAVING">Saving</form:option>
						<form:option value="CURRENT">Current</form:option>
					</form:select>
					<form:errors path="accountType" cssClass="error"/>
				</td>
			</tr>
			<tr>
				<td><spring:message code="lable.dob" />: </td>
				<td><form:input path="dob" size="30" />
					<form:errors path="dob" cssClass="error"/>
				</td>
			</tr>
			<tr>
				<td><spring:message code="lable.code" /></td>
				<td><form:input path="code" size="30"/>
					<form:errors path="code" cssClass="error"/>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="Save Account" name="btnSubmit"/>
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>