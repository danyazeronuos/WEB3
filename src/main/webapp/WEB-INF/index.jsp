<%@ page import="org.zero.web3.model.ResultModel" %>
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
    body {
        display: flex;
        flex-direction: column;
        gap: 1rem;
    }
</style>

<table>
    <tr>
        <th>Start</th>
        <th>Finish</th>
        <th>Step</th>
    </tr>
    <tr>
        <td><%= ((ResultModel) request.getAttribute("data")).data().start()%></td>
        <td><%= ((ResultModel) request.getAttribute("data")).data().finish()%></td>
        <td><%= ((ResultModel) request.getAttribute("data")).data().step()%></td>
    </tr>
</table>
<table>
    <tr>
        <th>Max</th>
        <th>Min</th>
    </tr>
    <tr>
        <td><%=String.format("%.8f", ((ResultModel) request.getAttribute("data")).max().getX())%></td>
        <td><%=String.format("%.8f", ((ResultModel) request.getAttribute("data")).min().getX())%></td>
    </tr>
    <tr>
        <td><%=String.format("%.8f", ((ResultModel) request.getAttribute("data")).max().getY())%></td>
        <td><%=String.format("%.8f", ((ResultModel) request.getAttribute("data")).min().getY())%></td>
    </tr>
</table>
<table>
    <tr>
        <th style="width: 50%">Sum</th>
        <th>Avg</th>
    </tr>
    <tr>
        <td><%=String.format("%.8f", ((ResultModel) request.getAttribute("data")).sum())%></td>
        <td><%=String.format("%.8f", ((ResultModel) request.getAttribute("data")).avg())%></td>
    </tr>
</table>
</body>
</html>
