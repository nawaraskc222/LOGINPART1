<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Videos</title>
</head>
<body>


<%

response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");//for version http1.1
response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
response.setHeader("Expires", "0"); // for Proxies server.

if(session.getAttribute("username")==null){
	
	response.sendRedirect("Login.jsp");
}

%>


<iframe width="560" height="315" src="https://www.youtube.com/embed/Mqgk5Rsx0ck" 
title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; 
gyroscope; picture-in-picture" allowfullscreen></iframe>
</body>
</html>