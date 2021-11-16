<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page d'accueil</title>
</head>
<body>
	<h1> Bienvenue sur mon site !</h1>
	<a href="<%=application.getContextPath()%>/user-info"> Voir mes infos utilisateurs <br></a>
	<a href="<%=application.getContextPath()%>/liste-articles"> Voir mes articles <br></a>

</body>
</html>