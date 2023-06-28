<%-- 
    Document   : usuarios
    Author     : santos
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="layout/encabezado.jsp"%>

<%@include file='layout/sidebar.jsp' %>

<div class="main-panel">
    <div class="content-wrapper">
        <!--<h1>Jos</h1>-->
        <div class="row">
            <div class="col-md-12 grid-margin stretch-card">
                <div class="card">
                    <div class="card-body">
                        <p class="card-title mb-0">Lista de Universitarios</p>
                        <a href="UsuarioController?action=add" class="float-right btn btn-primary btn-rounded btn-fw" role="button">Nuevo Universitario</a>
                        <div class="table-responsive">
                            <table class="table table-striped table-borderless">
                                <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>Paterno</th>
                                        <th>Materno</th>
                                        <th>Nombres</th>
                                        <th>Ci</th>
                                        <th>Ru</th>
                                        <th>Nro T. Bach.</th>
                                        
                                        <!--<th class="float-right text-center">Acciones</th>-->
                                    </tr>  
                                </thead>
                                <tbody>
                                    <c:forEach var="item" items="${usuarios}">
                                        <tr>
                                            <td>${item.id_usuario}</td>
                                            <td>${item.ap_paterno}</td>                                            
                                            <td>${item.ap_materno}</td>                                            
                                            <td>${item.nombres}</td>                                            
                                            <td>${item.ci}</td>                                            
                                            <td>${item.ru}</td>                                            
                                            <td>${item.n_titulo_bachiller}</td>                                            
                                            <td class="float-right">                                                
                                                <a href="UsuarioController?action=edit&id_usuario=${item.id_usuario}" class="btn btn-warning btn-sm" role="button">Editar</a>
                                                <a href="UsuarioController?action=delete&id_usuario=${item.id_usuario}" class="btn btn-danger btn-sm" role="button"
                                                   onclick="return(confirm('Esta seguro ???'))">Eliminar</a>
                                            </td>                                            
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

<%@include file="layout/pie.jsp" %>

