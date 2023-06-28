<%@page import="java.util.List" %>
<%@page import="com.emergentes.modelo.Gestion" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    List<Gestion> lista = (List<Gestion>) request.getAttribute("lista");
%>

<%@include file="../layout/encabezado.jsp"%>

<%@include file='../layout/sidebar.jsp' %>

<div class="main-panel">
    <div class="content-wrapper">
        <!--<h1>Jos</h1>-->
        <div class="row">
            <div class="col-md-12 grid-margin stretch-card">
                <div class="card">
                    <div class="card-body">
                        <p class="card-title mb-0">Lista de Gestiones</p>
                        <div class="table-responsive">
                            <table class="table table-striped table-borderless">
                                <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>Nombre</th>
                                        <!--<th>Date</th>-->
                                        <th>Status</th>
                                    </tr>  
                                </thead>
                                <tbody>
<!--                                    <tr>
                                        <td>Search Engine Marketing</td>
                                        <td class="font-weight-bold">$362</td>
                                        <td>21 Sep 2018</td>
                                        <td class="font-weight-medium"><div class="badge badge-success">Completed</div></td>
                                    </tr>-->
                                    <c:forEach var="item" items="${lista}">
                                        <tr>
                                            <td>${item.id_gestion}</td>
                                            <td>${item.nombre}</td>                                            
<!--                                            <td>
                                                <a href="GestionController?op=editar&id_gestion= item.id_gestion">
                                                    Editar</a>
                                            </td>-->
<!--                                            <td>
                                                <a href="GestionController?op=eliminar&id_gestion=item.id_gestion}"
                                                   onclick="return(confirm('Esta seguro ???'))">Eliminar</a>
                                            </td>-->
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
            <%--<%@include file="../layout/dashboard.jsp" %>--%>
        </div>

        <%@include file="../layout/pie.jsp" %>

