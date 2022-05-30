<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome </title>
</head>
<body>
<h1>Welcome SON</h1>


<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");//for version http1.1
response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
response.setHeader("Expires", "0"); // for Proxies server.


if(session.getAttribute("username")==null){
	response.sendRedirect("login.jsp");
}

%>


<pre>

Welcome ${username}


<a href="video.jsp">Videos here</a>
<br/>

<form action="Logout" method="get">

<input type="submit" value="Logout">
</form>

</pre>

</body>
</html>