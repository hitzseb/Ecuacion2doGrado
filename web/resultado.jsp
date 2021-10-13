<%-- 
    Document   : resultado
    Created on : 06-oct-2021, 15:00:08
    Author     : Sebastian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/styleResultado.css">
    </head>
    <body>
        <%@ page import="negocios.Solucion" %>
        <%@ page import="negocios.Archivo" %>
        <%
            // Extracción de los parámetros recibidos
            String a = request.getParameter("a");
            String b = request.getParameter("b");
            String c = request.getParameter("c");

            Solucion solucion = new Solucion(a, b, c);

            String s1 = solucion.raiz1();
            String s2 = solucion.raiz2();
            ServletContext sc = this.getServletContext();
            String path = sc.getRealPath("/WEB-INF/Resultado.txt");

            Archivo archivo = new Archivo();
            archivo.guardarResultado(a, b, c, s1, s2, path);
        %>
        <h1>Resultado</h1>
        <p><span>Primera raiz:</span> <%= s1%></p>
        <p><span>Segunda raiz:</span> <%= s2%></p>
        <p> Resultados guardados en "build\web\WEB-INF\resultado.txt"</p>
        <form action="index.html" method="POST">
            <input type="submit" value="Regresar" id="boton">
        </form>
    </body>
</html>
