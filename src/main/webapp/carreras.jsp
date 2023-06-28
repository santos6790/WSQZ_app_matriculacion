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
                        <p class="card-title mb-0">Lista de Carreras</p>
                        <a href="CarreraController?action=add" class="float-right btn btn-primary btn-rounded btn-fw" role="button">Nueva Carrera</a>
                        <div class="table-responsive">
                            <table class="table table-striped table-borderless">
                                <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>Nombre</th>
                                        <th>Descripcion</th>
                                        <th>Direccion</th>
                                    </tr>  
                                </thead>
                                <tbody>
                                    <c:forEach var="item" items="${carreras}">
                                        <tr>
                                            <td>${item.id_carrera}</td>
                                            <td>${item.nombre}</td>                                            
                                            <td>${item.descripcion}</td> 
                                            <td>${item.direccion}</td> 
                                            <td class="float-right">                                                
                                                <a href="CarreraController?action=edit&id_carrera=${item.id_carrera}" class="btn btn-warning btn-sm" role="button">Editar</a>
                                                <a href="CarreraController?action=delete&id_carrera=${item.id_carrera}" class="btn btn-danger btn-sm" role="button"
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

