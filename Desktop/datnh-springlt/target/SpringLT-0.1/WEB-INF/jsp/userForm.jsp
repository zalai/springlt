<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/includes/taglibs.jsp"%>

<title>Welcome to Laptrinh.vn</title>

<style>
.error {
	color:red;
}
</style>

<form:form commandName="user" action="form.html" method="POST">
	<table>
		<tr>
			<td colspan="2">
				<form:hidden path="id"/>
			</td>
		</tr>
		
		<tr>
			<td>Username</td>
			<td>
				<form:input path="username"/>
				<br/><form:errors path="username" cssClass="error"/>
			</td>
		</tr>
		
		<tr>
			<td>Website</td>
			<td>
				<form:input path="website"/>
				<br/><form:errors path="website" cssClass="error"/>
			</td>
		</tr>
		
		<tr>
			<td></td>
			<td>
				<input type="Submit" value="Submit" />
			</td>
		</tr>
	</table>
</form:form>