<%-- 
    Document   : RemoveEvento
    Created on : 10/10/2020, 21:40:45
    Author     : Casa
--%>
<%@page import="jpa.entities.Evento"%>
<%@page import="dao.eventoDao"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <form action="removeEv.jsp" method="post">
            
            
            Sigla: <input type="text" name="sigla"/><br/>
            
           
            <input type="submit" value="Excluir"/>
        </form>
    </body>
</html>
