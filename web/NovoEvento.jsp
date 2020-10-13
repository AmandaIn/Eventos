<%-- 
    Document   : NovoEvento
    Created on : 06/10/2020, 23:51:57
    Author     : Casa
--%>

<%@page import="jpa.entities.Evento"%>
<%@page import="dao.eventoDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%


  //int Id = 1;
          //Integer.parseInt(request.getParameter ("id"));
   //Integer Id = 0;
  // int Id = Integer.parseInt(id);
 // int Id = Integer.valueOf(id);
  String nome = request.getParameter("nome");
  String sigla = request.getParameter("sigla");
  String area = request.getParameter("area");
  String inst = request.getParameter("inst");
  
    eventoDao dao= new eventoDao();
    Evento obj = new Evento ();
   // obj.setId(Id);
    obj.setNome(nome);
    obj.setArea(area);
    obj.setSigla(sigla);
    obj.setInstitui(inst);
    

    dao.salva(obj);
    
    
    
  
     
    
    %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Evento cadastrado com sucesso. 
        
        
        <p><a href="./index.html">Home</a></p>
    </body>
</html>
