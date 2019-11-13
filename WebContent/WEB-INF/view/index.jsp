<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="/test/list">TestController로 고고씽</a><%--/앞에 자동으로 localhost가 찍힘, /test/만 맞으면 이동--%>
<%--겟방식이니까 TestController에서 doGet방식이 실행됨, post는 폼태그 안에서  --%>
<a href="/user/asd">UserController로 간당</a>
<a href="/views/asd">URIcontroller로 갈거당</a>
</body>
</html>