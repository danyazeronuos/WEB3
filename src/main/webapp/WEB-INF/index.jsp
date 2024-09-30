<jsp:useBean id="max" scope="request" type="org.zero.web3.model.Result"/>
<jsp:useBean id="min" scope="request" type="org.zero.web3.model.Result"/>
<jsp:useBean id="sum" scope="request" type="java.lang.Double"/>
<jsp:useBean id="avg" scope="request" type="java.lang.Double"/>
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
<table>
    <tr>
        <th>Max</th>
        <th>Min</th>
        <th>Sum</th>
        <th>Avg</th>
    </tr>
    <tr>
        <td>${max.x}</td>
        <td>${min.x}</td>
        <td>${sum}</td>
        <td>${avg}</td>
    </tr>
    <tr>
        <td>${max.y}</td>
        <td>${min.y}</td>
    </tr>
</table>
<table style="border: 1px solid black">
    <tr>
        <th>ID</th>
        <th>X</th>
        <th>Y</th>
    </tr>
    <%
        List<Result> list = (List<Result>) request.getAttribute("result");
        for (var i = 0; i < list.size(); i++) {
    %>
    <tr>
        <td><%= i%></td>
        <td><%= String.format("%.2f", list.get(i).getX())%>
        </td>
        <td><%= String.format("%.8f", list.get(i).getY())%>
        </td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
