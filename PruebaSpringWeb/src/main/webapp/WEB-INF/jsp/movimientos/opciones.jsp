<%-- 
    Document   : opciones
    Created on : 13-mar-2014, 10:18:30
    Author     : Carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <script src="http://jquery-json.googlecode.com/files/jquery.json-2.4.min.js"></script>
        <script>
            function insertar()
            {
                var xmlhttp;

                xmlhttp = new XMLHttpRequest();

                var formElement = document.getElementById("movimientoForm");

                xmlhttp.onreadystatechange = obtenerResultadoInsercion;
                xmlhttp.open(formElement.method, formElement.action, true);
                xmlhttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");

                xmlhttp.send($("#movimientoForm").serialize());
            }

            function obtenerResultadoInsercion() {
                if (this.readyState === this.DONE) {
                    if (this.status === 200) {
                        // success!
                        var movimientos = $.evalJSON(this.responseText);

                        var resultado = "";
                        
                        for (var i = 0; i < movimientos.length; i++) {
                            resultado = resultado + movimientos[i].id + " " + movimientos[i].concepto + "<br>";
                        }
                        
                        document.getElementById("idResultado").innerHTML = resultado;
                    }
                    else {
                        // something went wrong
                        document.getElementById("error").innerHTML = this.responseText;
                    }
                }
            }
        </script>
    </head>
    <body>
        <form:form id="movimientoForm" commandName="movimiento" action="insertarMovimiento">
            <table>
                <tr>
                    <td>Concepto</td>
                    <td><form:input path="concepto" /></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <!--    -->
                        <input type="button" value="Insertar" onclick="insertar()"/>

                        <!-- 
                        <input type="submit" value="Buscar">
                        -->
                    </td>
                </tr>
            </table>
        </form:form>
        <div>RESULTADOS</div>
        <div id="idResultado"></div>
        <div id="error"></div>
    </body>
</html>
