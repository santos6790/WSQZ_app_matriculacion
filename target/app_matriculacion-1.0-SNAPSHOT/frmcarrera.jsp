<%-- 
    Document   : frmcarrera
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
                                    <h4 class="card-title">Registro de Carreras</h4>
                                    <p class="card-description">
                                        <c:if test="${carrera.id_carrera == 0}">Crear nueva</c:if>
                                        <c:if test="${carrera.id_carrera != 0}">Editar la</c:if>
                                            Carrera
                                        </p>
                                        <form action="CarreraController" method="POST" class="forms-sample">
                                            <input type="hidden" name="id_carrera" value="${carrera.id_carrera}">
                                        <div class="form-group">
                                            <label for="nombre">Nombre</label>
                                            <input name="nombre" value="${carrera.nombre}" type="text" class="form-control" id="nombre" placeholder="Introduzca una carrera">
                                        </div>
                                        <div class="form-group">
                                            <label for="area">Descripcion</label>
                                            <textarea class="form-control" id="area" rows="4" name="descripcion" placeholder="Introduzca una descripcion">${carrera.descripcion}</textarea>
                                        </div>
                                        <div class="form-group">
                                            <label for="area1">Direccion</label>
                                            <textarea class="form-control" id="area1" rows="4" name="direccion" placeholder="Introduzca una direccion">${carrera.direccion}</textarea>
                                        </div>

                                        <button type="submit" class="btn btn-primary mr-2">Guardar</button>
                                        <a href="CarreraController" role="button" class="btn btn-light">Cancelar</a>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

<%@include file="layout/pie.jsp" %>


