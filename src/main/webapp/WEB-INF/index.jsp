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
        <td>${start}</td>
        <td>${finish}</td>
        <td>${step}</td>
    </tr>
</table>
<table>
    <tr>
        <th>Max</th>
        <th>Min</th>
    </tr>
    <tr>
        <td><%=String.format("%.8f", ((Result) request.getAttribute("max")).getX())%></td>
        <td><%=String.format("%.8f", ((Result) request.getAttribute("min")).getX())%></td>
    </tr>
    <tr>
        <td><%=String.format("%.8f", ((Result) request.getAttribute("max")).getY())%></td>
        <td><%=String.format("%.8f", ((Result) request.getAttribute("min")).getY())%></td>
    </tr>
</table>
<table>
    <tr>
        <th style="width: 50%">Sum</th>
        <th>Avg</th>
    </tr>
    <tr>
        <td><%=String.format("%.8f", ((Double) request.getAttribute("sum")))%></td>
        <td><%=String.format("%.8f", ((Double) request.getAttribute("avg")))%></td>
    </tr>
</table>
</body>
</html>
