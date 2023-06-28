<%-- 
    Document   : dashboard
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
                        <p class="card-title mb-0">Hola !!</p>
                        <hr>
                        <div class="table-responsive">
                            <h3>Bienvenido a Matriculaciones ${administrador.nombres} </h3>
                        </div>
                    </div>
                </div>
            </div>
            <%--<%@include file="../layout/dashboard.jsp" %>--%>
        </div>

<%@include file="layout/pie.jsp" %>