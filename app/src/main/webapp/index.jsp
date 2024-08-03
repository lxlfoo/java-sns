<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<meta http-equiv="Cache-Control" content="no-store" />
	<meta name="author" content="lxlfoo" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<title>BULLSHIT PLAYGROUND</title>
	<link rel="icon" type="image/x-icon" href="/favicon.png" />
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/reset-css@5.0.1/reset.min.css" />
	<link rel="preconnect" href="https://fonts.googleapis.com" />
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
	<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Tektur:wght@400;600&display=swap" />
	<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@24,400,0,0" />
	<link rel="stylesheet" href="/css/login.css" />
	<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.20.0/dist/jquery.validate.min.js"></script>
	<script defer src="/js/login.js"></script>
</head>
<body oncontextmenu="return false" onselectstart="return false" ondragstart="return false">
	<form id="frm" action="/login" method="post">
		<div><img src="/images/title.png" alt="login" /></div>
		<div>
			<input type="password" name="pwd" maxlength="20" autofocus />
			<span id="spnLogin" class="material-symbols-outlined">login</span>
		</div>
		<div class="error"><c:if test="${param.isLogin eq false}">Access Denied.</c:if></div>
	</form>
</body>
</html>