<%-- 
    Document   : CadastraEvento
    Created on : 06/10/2020, 23:23:29
    Author     : Casa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Preencha os campos com as informações adequadas:</h1>
        <form action="NovoEvento.jsp" method="post">
            Nome: <input type="text" name="nome"/><br/>
            Sigla: <input type="text" name="sigla"/><br/>
            Area de Concentração: <input type="text" name="area"/><br/>
            Instituição: <input type="text" name="inst"/><br/>
            <input type="submit" value="Salvar"/>
        </form>
    </body>
</html>
