<%-- 
    Document   : removeEv
    Created on : 11/10/2020, 16:20:22
    Author     : Casa
--%>

<%@page import="jpa.entities.Evento"%>
<%@page import="dao.eventoDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
String sigla = request.getParameter ("sigla");
eventoDao dao= new eventoDao();
Evento obj = dao.recupera(sigla);

    dao.excluir(obj);

%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        
    </body>
</html>
