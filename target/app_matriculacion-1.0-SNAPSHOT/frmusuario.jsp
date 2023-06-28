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
                                    <h4 class="card-title">Registro Universitario</h4>
                                    <p class="card-description">
                                        <c:if test="${usuario.id_usuario == 0}">Crear nueva</c:if>
                                        <c:if test="${usuario.id_usuario != 0}">Editar la</c:if>
                                         Universitario
                                    </p>
                                    <form action="UsuarioController" method="POST" class="forms-sample">
                                        <input type="hidden" name="id_usuario" value="${usuario.id_usuario}">
                                        <div class="form-group">
                                            <label for="app">Apellido Paterno</label>
                                            <input name="ap_paterno" value="${usuario.ap_paterno}" type="text" class="form-control" id="app" placeholder="Introduzca Ap Paterno">
                                        </div>
                                        
                                        <div class="form-group">
                                            <label for="apm">Apellido Materno</label>
                                            <input name="ap_materno" value="${usuario.ap_materno}" type="text" class="form-control" id="apm" placeholder="Introduzca Ap Materno">
                                        </div>
                                        
                                        <div class="form-group">
                                            <label for="nombre">Nombres</label>
                                            <input name="nombres" value="${usuario.nombres}" type="text" class="form-control" id="nombre" placeholder="Introduzca Nombres">
                                        </div>
                                        
                                        <div class="form-group">
                                            <label for="ci">Cedula de Identidad</label>
                                            <input name="ci" value="${usuario.ci}" type="text" class="form-control" id="ci" placeholder="Introduzca Cedula Identidad">
                                        </div>
                                        
                                        <div class="form-group">
                                            <label for="ru">Registro Universitario</label>
                                            <input name="ru" value="${usuario.ru}" type="text" class="form-control" id="ru" placeholder="Introduzca Registro Universitario">
                                        </div>
                                        
                                        <div class="form-group">
                                            <label for="cel">Celular</label>
                                            <input name="celular" value="${usuario.celular}" type="text" class="form-control" id="cel" placeholder="Introduzca Celular">
                                        </div>
                                        
                                        <div class="form-group">
                                            <label for="cor">Correo</label>
                                            <input name="correo" value="${usuario.correo}" type="text" class="form-control" id="cor" placeholder="Introduzca Correo">
                                        </div>
                                        
                                        <div class="form-group">
                                            <label for="dir">Direccion</label>
                                            <input name="direccion" value="${usuario.direccion}" type="text" class="form-control" id="dir" placeholder="Introduzca Direccion">
                                        </div>
                                        
                                        <div class="form-group">
                                            <label for="fn">Fecha de Nacimiento</label>
                                            <input name="f_nac" value="${usuario.f_nac}" type="date" class="form-control" id="fn">
                                        </div>
                                        
                                        <div class="form-group">
                                            <label for="nb">Nro. de Bachiller</label>
                                            <input name="n_titulo_bachiller" value="${usuario.n_titulo_bachiller}" type="text" class="form-control" id="nb" placeholder="Introduzca N. Titulo Bachiller">
                                        </div>
                                        
                                        <div class="form-group">
                                            <label for="ni">Nick</label>
                                            <input name="nick" value="${usuario.nick}" type="text" class="form-control" id="ni" placeholder="Introduzca un Nick">
                                        </div>
                                        
                                        <div class="form-group">
                                            <label for="pwd">Password</label>
                                            <input name="password" value="${usuario.password}" type="text" class="form-control" id="pwd" placeholder="Introduzca Password">
                                        </div>
                                        <button type="submit" class="btn btn-primary mr-2">Guardar</button>
                                        <a href="UsuarioController" role="button" class="btn btn-light">Cancelar</a>
                                    </form>
                                </div>
                            </div>
                        </div>


                    </div>
                </div>
            </div>
            <%--<%@include file="../layout/dashboard.jsp" %>--%>
        </div>

        <%@include file="layout/pie.jsp" %>