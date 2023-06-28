<%-- 
    Document   : matriculas
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
                        <p class="card-title mb-0">Lista de Matriculas</p>
                        <c:if test="${administrador.nivel == 1}">
                        <a href="MatriculaController?action=add" class="float-right btn btn-primary btn-rounded btn-fw" role="button">Nueva Matricula</a>
                        </c:if>
                        <div class="table-responsive">
                            <table class="table table-striped table-borderless">
                                <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>Universitario</th>
                                        <th>Categoria</th>
                                        <th>Carrera</th>
                                        <th>Sede</th>
                                        <th>Gestion</th>
                                    </tr>  
                                </thead>
                                <tbody>
                                    <c:forEach var="item" items="${matriculas}">
                                        <tr>
                                            <td>${item.id_matricula}</td>
                                            <td>${item.usuario}</td>                                            
                                            <td>${item.categoria}</td> 
                                            <td>${item.carrera}</td> 
                                            <td>${item.sede}</td> 
                                            <td>${item.gestion}</td>
                                            <c:if test="${administrador.nivel == 1}">
                                            <td class="float-right">                                                
                                                <a href="MatriculaController?action=edit&id_matricula=${item.id_matricula}" class="btn btn-warning btn-sm" role="button">Editar</a>
                                                <a href="MatriculaController?action=delete&id_matricula=${item.id_matricula}" class="btn btn-danger btn-sm" role="button"
                                                   onclick="return(confirm('Esta seguro ???'))">Eliminar</a>
                                            </td>
                                            </c:if>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>

<%@include file="layout/pie.jsp" %>

