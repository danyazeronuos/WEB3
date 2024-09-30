<jsp:useBean id="step" scope="request" type="java.lang.Double"/>
<jsp:useBean id="finish" scope="request" type="java.lang.Double"/>
<jsp:useBean id="start" scope="request" type="java.lang.Double"/>
<%@ page import="java.util.List" %>
<%@ page import="org.zero.web3.model.Result" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>

<style>
    table, th, td {
        border: 1px solid black;
        border-collapse: collapse;
    }
    th, td {
        padding: 5px;
    }
</style>

<table>
    <tr>
        <th>Start</th>
        <th>Finish</th>
        <th>Step</th>
    </tr>
    <tr>
        <td>${start}</td>
        <td>${finish}</td>
        <td>${step}</td>
    </tr>
</table>
<table style="border: 1px solid black">
    <tr>
        <th>X</th>
        <th>Y</th>
    </tr>
    <%
        List<Result> list = (List<Result>) request.getAttribute("result");
        for (Result r : list) {
    %>
    <tr>
        <td><%= String.format("%.2f", r.getX())%>
        </td>
        <td><%= String.format("%.8f", r.getY())%>
        </td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>