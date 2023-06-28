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
                        <p class="card-title mb-0">Lista de Categorias</p>
                        <a href="CategoriaController?action=add" class="float-right btn btn-primary btn-rounded btn-fw" role="button">Nueva Categoria</a>
                        <div class="table-responsive">
                            <table class="table table-striped table-borderless">
                                <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>Nombre</th>
                                        <th>Descripcion</th>
                                    </tr>  
                                </thead>
                                <tbody>
                                    <c:forEach var="item" items="${categorias}">
                                        <tr>
                                            <td>${item.id_categoria}</td>
                                            <td>${item.nombre}</td>                                            
                                            <td>${item.descripcion}</td> 
                                            <td class="float-right">                                                
                                                <a href="CategoriaController?action=edit&id_categoria=${item.id_categoria}" class="btn btn-warning btn-sm" role="button">Editar</a>
                                                <a href="CategoriaController?action=delete&id_categoria=${item.id_categoria}" class="btn btn-danger btn-sm" role="button"
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

