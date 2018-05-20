<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="lable.title" /></title>
</head>
<body>
	<h2><spring:message code="lable.header" /></h2>
	
<%-- 	
    <p>Account Number: ${param.accountNo}</p>
	<p>Account Holder Name: ${param.accountHolderName}</p>
	<p>Balance: ${param.balance}</p> 
--%>

<%-- 	<p>Account Number: ${accountNo}</p>
	<p>Account Holder Name: ${accountHolderName}</p>
	<p>Balance: ${balance}</p> --%>
	
	<p><spring:message code="lable.accountNo" />: ${account.accountNo}</p>
	<p><spring:message code="lable.accountHolderName"/>: ${account.accountHolderName}</p>
	<p><spring:message code="lable.balance"/>: ${account.balance}</p>
		
</body>
</html>