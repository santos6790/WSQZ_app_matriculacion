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
                        <p class="card-title mb-0">Lista de Sedes</p>
                        <a href="SedeController?action=add" class="float-right btn btn-primary btn-rounded btn-fw" role="button">Nueva Sede</a>
                        <div class="table-responsive">
                            <table class="table table-striped table-borderless">
                                <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>Nombre</th>
                                        <th>Direccion</th>
                                    </tr>  
                                </thead>
                                <tbody>
                                    <c:forEach var="item" items="${sedes}">
                                        <tr>
                                            <td>${item.id_sede}</td>
                                            <td>${item.nombre}</td>                                            
                                            <td>${item.direccion}</td> 
                                            <td class="float-right">                                                
                                                <a href="SedeController?action=edit&id_sede=${item.id_sede}" class="btn btn-warning btn-sm" role="button">Editar</a>
                                                <a href="SedeController?action=delete&id_sede=${item.id_sede}" class="btn btn-danger btn-sm" role="button"
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

