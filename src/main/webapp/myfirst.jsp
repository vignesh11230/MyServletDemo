<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

simple jsp file creation code no:1

 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>hellow</h1>
<%

int num1=Integer.parseInt(request.getParameter("username"));
int num2=Integer.parseInt(request.getParameter("f2"));
%>
<%!
public static int clac(int num1,int num2){
	int result=num1+num2;
	return result;
}

%>
<%=clac(num1,num2) %>

</body>
</html>