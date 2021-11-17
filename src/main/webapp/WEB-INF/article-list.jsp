<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste articles</title>
</head>
<body>

		<h1> Liste des articles</h1>
			<ul><a href="<%=application.getContextPath()%>/first-article"> ${articleOneTitle} </a></ul>
			<ul><a href="<%=application.getContextPath()%>/second-article"> ${articleTwoTitle}</a></ul>


 
</body>
</html>