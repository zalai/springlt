<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/includes/taglibs.jsp"%>

<title>Welcome to Laptrinh.vn</title>
<style>
	table tr td, table tr th {
	    border: 1px solid #aaa;
	    padding: 2px;
	}
	
	table {
	    border-collapse: collapse;
	    width: 500px;
	}
</style>
<h1>User List</h1>

<div>
	<h2>Sử dụng thư viện displaytag</h2>
	
	<display:table name="${userList}" class="simple wid100" id="user" requestURI="" pagesize="15" export="true" >
		<display:column title="STT" class="stt" > <c:out value="${user_rowNum}"/> </display:column>
		<display:column title="ID" property="id" />
	    <display:column title="Username" property="username" />
	    <display:column title="Website" property="website"/>
	    <display:column title="Detail" media="html" >
	    	<a href="detail.html?id=${user.id}" title="Detail">Detail</a>&nbsp;
	    </display:column>
	</display:table>
</div>

<div>
	<h2>Sử dụng hàm c:forEach</h2>
	
	<table>
		<tr>
			<th>STT</th>
			<th>ID</th>
			<th>Username</th>
			<th>Website</th>
		</tr>
		<c:forEach items="${userList}" var="item" varStatus="stt">
			<tr>
				<td>${stt.index}</td>
				<td>${item.id}</td>
				<td>${item.username}</td>
				<td>${item.website}</td>
			</tr>
		</c:forEach>
	</table>
</div>