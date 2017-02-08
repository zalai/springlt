<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/includes/taglibs.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>[springapp] <decorator:title/> </title>
</head>
<body>
   <div id="container">
      <%@ include file="/includes/header.jsp"%>
      <div id="content">
         <decorator:body />
      </div>
      <%@ include file="/includes/footer.jsp"%>
   </div>
</body>
</html>