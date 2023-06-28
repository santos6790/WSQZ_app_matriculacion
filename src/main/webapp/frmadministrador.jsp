<%-- 
    Document   : frmusuario
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
                        <!--<p class="card-title mb-0">Registro de Gestiones</p>-->
                        <div class="col-12 grid-margin stretch-card">
                            <div class="card">
                                <div class="card-body">
                                    <h4 class="card-title">Registro de Administradores</h4>
                                    <p class="card-description">
                                        <c:if test="${administrador.id_usuario == 0}">Crear nueva</c:if>
                                        <c:if test="${administrador.id_usuario != 0}">Editar la</c:if>
                                         Administrador
                                    </p>
                                    <form action="AdministradorController" method="POST" class="forms-sample">
                                        <input type="hidden" name="id_usuario" value="${administrador.id_usuario}">
                                        <div class="form-group">
                                            <label for="app">Apellido Paterno</label>
                                            <input name="ap_paterno" value="${administrador.ap_paterno}" type="text" class="form-control" id="app" placeholder="Introduzca Ap Paterno">
                                        </div>
                                        
                                        <div class="form-group">
                                            <label for="apm">Apellido Materno</label>
                                            <input name="ap_materno" value="${administrador.ap_materno}" type="text" class="form-control" id="apm" placeholder="Introduzca Ap Materno">
                                        </div>
                                        
                                        <div class="form-group">
                                            <label for="nombre">Nombres</label>
                                            <input name="nombres" value="${administrador.nombres}" type="text" class="form-control" id="nombre" placeholder="Introduzca Nombres">
                                        </div>
                                        
                                        <div class="form-group">
                                            <label for="ci">Cedula de Identidad</label>
                                            <input name="ci" value="${administrador.ci}" type="text" class="form-control" id="ci" placeholder="Introduzca Cedula Identidad">
                                        </div>
                                        
                                        
                                        
                                        <div class="form-group">
                                            <label for="cel">Celular</label>
                                            <input name="celular" value="${administrador.celular}" type="text" class="form-control" id="cel" placeholder="Introduzca Celular">
                                        </div>
                                        
                                        <div class="form-group">
                                            <label for="cor">Correo</label>
                                            <input name="correo" value="${administrador.correo}" type="text" class="form-control" id="cor" placeholder="Introduzca Correo">
                                        </div>                                       
                                      
                                        
                                        <div class="form-group">
                                            <label for="pwd">Password</label>
                                            <input name="password" value="${administrador.password}" type="text" class="form-control" id="pwd" placeholder="Introduzca Password">
                                        </div>
                                        <button type="submit" class="btn btn-primary mr-2">Guardar</button>
                                        <a href="AdministradorController" role="button" class="btn btn-light">Cancelar</a>
                                    </form>
                                </div>
                            </div>
                        </div>


                    </div>
                </div>
            </div>
        </div>

        <%@include file="layout/pie.jsp" %>