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
                                    <h4 class="card-title">Registro de Matriculas</h4>
                                    <p class="card-description">
                                        <c:if test="${matricula.id_carrera == 0}">Crear nueva</c:if>
                                        <c:if test="${matricula.id_carrera != 0}">Editar la</c:if>
                                            Matricula
                                        </p>
                                        <form action="MatriculaController" method="POST" class="forms-sample">
                                            <input type="hidden" name="id_matricula" value="${matricula.id_matricula}">
                                        <div class="form-group">
                                            <label for="us">Universitario</label>
                                            <select name="id_usuario" class="form-control" id="us">
                                                <option value=""> Seleccione </option>
                                                <c:forEach var="item" items="${lista_usuarios}">
                                                    <option value="${item.id_usuario}"
                                                            <c:if test="${matricula.id_usuario == item.id_usuario}">
                                                                selected
                                                            </c:if>
                                                            >${item.ci}</option>
                                                </c:forEach>                                                
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <label for="c">Categoria</label>
                                            <select name="id_categoria" class="form-control" id="c">
                                                <option value=""> Seleccione </option>
                                                <c:forEach var="item" items="${lista_categorias}">
                                                    <option value="${item.id_categoria}"
                                                            <c:if test="${matricula.id_categoria == item.id_categoria}">
                                                                selected
                                                            </c:if>
                                                            >${item.nombre}</option>
                                                </c:forEach>                                                
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <label for="cr">Carrera</label>
                                            <select name="id_carrera" class="form-control" id="cr">
                                                <option value=""> Seleccione </option>
                                                <c:forEach var="item" items="${lista_carreras}">
                                                    <option value="${item.id_carrera}"
                                                            <c:if test="${matricula.id_carrera == item.id_carrera}">
                                                                selected
                                                            </c:if>
                                                            >${item.nombre}</option>
                                                </c:forEach>                                                
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <label for="s">Sede</label>
                                            <select name="id_sede" class="form-control" id="s">
                                                <option value=""> Seleccione </option>
                                                <c:forEach var="item" items="${lista_sedes}">
                                                    <option value="${item.id_sede}"
                                                            <c:if test="${matricula.id_sede == item.id_sede}">
                                                                selected
                                                            </c:if>
                                                            >${item.nombre}</option>
                                                </c:forEach>                                                
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <label for="g">Gestion</label>
                                            <select name="id_gestion" class="form-control" id="g">
                                                <option value=""> Seleccione </option>
                                                <c:forEach var="item" items="${lista_gestiones}">
                                                    <option value="${item.id_gestion}"
                                                            <c:if test="${matricula.id_gestion == item.id_gestion}">
                                                                selected
                                                            </c:if>
                                                            >${item.nombre}</option>
                                                </c:forEach>                                                
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <label for="costo">Monto de Deposito</label>
                                            <input name="costo" value="${matricula.costo}" type="text" class="form-control" id="costo" placeholder="Introduzca Monto de Deposito">
                                        </div>
                                        <div class="form-group">
                                            <label for="fm">Fecha de Matriculacion</label>
                                            <input name="f_matriculacion" value="${matricula.f_matriculacion}" type="date" class="form-control" id="fm">
                                        </div>                                        
                                        <div class="form-group">
                                            <label for="dep">Nro de Deposito Bancario</label>
                                            <input name="nro_deposito" value="${matricula.nro_deposito}" type="text" class="form-control" id="dep" placeholder="Introduzca Numero de Deposito">
                                        </div>                                                                                

                                        <button type="submit" class="btn btn-primary mr-2">Guardar</button>
                                        <a href="MatriculaController" role="button" class="btn btn-light">Cancelar</a>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

<%@include file="layout/pie.jsp" %>


