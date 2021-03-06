<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://vidageek.net/autoweb" prefix="aw"%>

<html>
	<head>
		<title>Quem constrói esse site?</title>
	</head>
	<body>
		<div class="about">
			<h1>Pessoas que contribuem com o projeto</h1>
			<div id="contributors"></div>
			<h1>Organizações que contribuem com o projeto</h1>
			<div id="organizations">
				<div>
					<aw:img url="http://www.adaptideas.com.br/images/logo.png" alt="AdaptIdeas"/>
					<a class="btn btn-info" href="http://www.adaptideas.com.br/">AdaptIdeas</a>
				</div>
				<div>
					<aw:img url="/images/ccsl.jpeg" alt="CCSL"/>
					<a class="btn btn-info" href="http://ccsl.ime.usp.br/">CCSL</a>
				</div>
				<div>
					<aw:img url="https://secure.gravatar.com/avatar/9ce5f6b25189ecb05c5c982cc5c0ad7c.png" alt="VidaGeek.net"/>
					<a class="btn btn-info" href="http://vidageek.net/">VidaGeek.net</a>
				</div>
			</div>
		</div>
	</body>
</html>
