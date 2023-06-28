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
                                    <h4 class="card-title">Registro de Categorias</h4>
                                    <p class="card-description">
                                        <c:if test="${categoria.id_categoria == 0}">Crear nueva</c:if>
                                        <c:if test="${categoria.id_categoria != 0}">Editar la</c:if>
                                            Categoria
                                        </p>
                                        <form action="CategoriaController" method="POST" class="forms-sample">
                                            <input type="hidden" name="id_categoria" value="${categoria.id_categoria}">
                                        <div class="form-group">
                                            <label for="nombre">Nombre</label>
                                            <input name="nombre" value="${categoria.nombre}" type="text" class="form-control" id="nombre" placeholder="Introduzca una categoria">
                                        </div>
                                        <div class="form-group">
                                            <label for="area">Descripcion</label>
                                            <textarea class="form-control" id="area" rows="4" name="descripcion" placeholder="Introduzca una descripcion">${categoria.descripcion}</textarea>
                                        </div>

                                        <button type="submit" class="btn btn-primary mr-2">Guardar</button>
                                        <a href="CategoriaController" role="button" class="btn btn-light">Cancelar</a>
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

