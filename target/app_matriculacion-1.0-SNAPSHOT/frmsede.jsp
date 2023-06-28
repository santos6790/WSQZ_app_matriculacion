<%-- 
    Document   : frmsede
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
                        <div class="col-12 grid-margin stretch-card">
                            <div class="card">
                                <div class="card-body">
                                    <h4 class="card-title">Registro de Sedes</h4>
                                    <p class="card-description">
                                        <c:if test="${sede.id_sede == 0}">Crear nueva</c:if>
                                        <c:if test="${sede.id_sede != 0}">Editar la</c:if>
                                            Sede
                                        </p>
                                        <form action="SedeController" method="POST" class="forms-sample">
                                            <input type="hidden" name="id_sede" value="${sede.id_sede}">
                                        <div class="form-group">
                                            <label for="nombre">Nombre</label>
                                            <input name="nombre" value="${sede.nombre}" type="text" class="form-control" id="nombre" placeholder="Introduzca una categoria">
                                        </div>
                                        <div class="form-group">
                                            <label for="area">Direccion</label>
                                            <textarea class="form-control" id="area" rows="4" name="direccion" placeholder="Introduzca una direccion">${sede.direccion}</textarea>
                                        </div>

                                        <button type="submit" class="btn btn-primary mr-2">Guardar</button>
                                        <a href="SedeController" role="button" class="btn btn-light">Cancelar</a>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
<%@include file="layout/pie.jsp" %>

