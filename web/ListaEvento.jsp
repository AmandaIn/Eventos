<%-- 
    Document   : ListaEvento
    Created on : 10/10/2020, 20:07:59
    Author     : Casa
--%>

<%@page import="jpa.entities.Evento"%>
<%@page import="java.util.List"%>
<%@page import="dao.eventoDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
     eventoDao dao= new eventoDao();
     List<Evento> lista = dao.listar();
     
    %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eventos</title>
    </head>
    <body>
        <div>
            <h1 class="centro">Eventos</h1>
            
            
                +<a href="CadastraEvento.jsp">Novo Evento</a><br />
                
                 
                                          
                
                    <table>
                        <tr>
                            <th>Nome</th>
                            <th>Sigla</th>
                            <th>Área</th>
                            <th>Instituição</th>                            
                            <th>Ações</th>
                        </tr>
                        <%
                        for(Evento item:lista)
                        {
                        %>
                        <tr>
                            <td><%=item.getNome()%></td>
                            <td><%=item.getSigla()%></td>
                            <td><%=item.getArea()%></td>
                            <td><%=item.getInstitui()%></td>
                            <td><a href=>Editar</a>
                                <a href="removeEv.jsp?sigla=<%=item.getSigla()%>">Excluir</a>
                            </td>
                            
                        </tr>
                       <%
                        }
                       %>
                    </table>
                    
                
            
        </div>
    </body>
    </body>
</html>
