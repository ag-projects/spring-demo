<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Accounts Details</title>
</head>
<body>
	<table border="1" width="100%">
		<thead>
			<tr>
				<th><spring:message code="lable.accountNo" /></th>
				<th><spring:message code="lable.accountHolderName" /></th>
				<th><spring:message code="lable.balance" /></th>
				<th>&nbsp;</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="account" items="${accounts}">
			<c:url var="updateLink" value="/edit">
				<c:param name="accountNo" value="${account.accountNo}"></c:param>
			</c:url>
				<tr>
					<td>${account.accountNo}</td>
					<td>${account.accountHolderName}</td>
					<td>${account.balance}</td>
					<td><a href="${updateLink}"></a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>