<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/includes/taglibs.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title><decorator:title/> </title>
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<link rel="stylesheet" href="css/bootstrap.min.css"/>
	<link rel="stylesheet" href="css/bootstrap-theme.min.css"/>
	<link rel="stylesheet" href="css/font-awesome.min.css"/>

	<link rel="stylesheet" href="css/index.css"/>
	<link rel="stylesheet" href="css/animate.css">
	<link rel="stylesheet" media="all" href="css/media.css">

	<!-- <link rel="stylesheet" media="all" href="css/style.css"> -->

	<script type="text/javascript" src="js/jquery-1.12.1.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/handle.js"></script>
	<script type="text/javascript" src="js/jquery.tinycarousel.min.js"></script>
	<script type="text/javascript" src="js/wow.min.js"></script>
	<script type="text/javascript" src="js/jquery.tinycarousel.min.js"></script>
</head>

<body>
   <div class="container">
      <%@ include file="/WEB-INF/includes/header.jsp"%>
      <div id="content">
         <decorator:body />
      </div>
      <%@ include file="/WEB-INF/includes/footer.jsp"%>
   </div>
</body>

</html>