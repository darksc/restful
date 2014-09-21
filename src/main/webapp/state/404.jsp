<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="java.lang.Exception" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <title>错误页面</title>
    </head>

    <body>
        <h1>页面找不到啦！</h1>
        <%
        Exception e = (Exception)request.getAttribute("exception");
        out.print(e.getMessage());
        %>
    </body>
</html>