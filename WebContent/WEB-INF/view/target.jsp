<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
List<String> list = (List<String>)request.getAttribute("list");//get 대상이 리퀘스트라 가능
for(String str:list){//list안에 값들을 하나씩 str에 넣기
%>
<%=str %><br>
<%
}
%>
</body>
</html>