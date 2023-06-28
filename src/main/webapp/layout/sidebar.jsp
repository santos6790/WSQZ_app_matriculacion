<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

      <!-- partial:partials/_sidebar.html -->
      <nav class="sidebar sidebar-offcanvas" id="sidebar">
        <ul class="nav">
          <li class="nav-item">
            <a class="nav-link" href="Dashboard">
              <i class="icon-grid menu-icon"></i>
              <span class="menu-title">Inicio</span>
            </a>
          </li>
          <c:if test="${administrador.nivel == 1}">
          <li class="nav-item">
            <a class="nav-link" data-toggle="collapse" href="#ui-basic" aria-expanded="false" aria-controls="ui-basic">
              <i class="icon-head menu-icon"></i>
              <span class="menu-title">Personal</span>
              <i class="menu-arrow"></i>
            </a>
            <div class="collapse" id="ui-basic">
              <ul class="nav flex-column sub-menu">
                <li class="nav-item"> <a class="nav-link" href="AdministradorController">Administradores</a></li>                
              </ul>
            </div>
          </li>
          </c:if>
          <c:if test="${administrador.nivel == 1}">
          <li class="nav-item">
            <a class="nav-link" data-toggle="collapse" href="#form-elements" aria-expanded="false" aria-controls="form-elements">
              <i class="icon-columns menu-icon"></i>
              <span class="menu-title">Universitarios</span>
              <i class="menu-arrow"></i>
            </a>
            <div class="collapse" id="form-elements">
              <ul class="nav flex-column sub-menu">
                <li class="nav-item"><a class="nav-link" href="UsuarioController">Registrados</a></li>
              </ul>
            </div>
          </li>
          </c:if>
          <li class="nav-item">
            <a class="nav-link" data-toggle="collapse" href="#tables" aria-expanded="false" aria-controls="tables">
              <i class="icon-grid-2 menu-icon"></i>
              <span class="menu-title">Matriculaciones</span>
              <i class="menu-arrow"></i>
            </a>
            <div class="collapse" id="tables">
              <ul class="nav flex-column sub-menu">
                <li class="nav-item"> <a class="nav-link" href="MatriculaController">Matriculados</a></li>
                <c:if test="${administrador.nivel == 1}">
                <li class="nav-item"> <a class="nav-link" href="CarreraController">Carreras</a></li>
                </c:if>
                <c:if test="${administrador.nivel == 1}">
                <li class="nav-item"> <a class="nav-link" href="CategoriaController">Categoria</a></li>
                </c:if>
                <c:if test="${administrador.nivel == 1}">
                <li class="nav-item"> <a class="nav-link" href="GestionController">Gestiones</a></li>
                </c:if>
                <c:if test="${administrador.nivel == 1}">
                <li class="nav-item"> <a class="nav-link" href="SedeController">Sedes</a></li>
                </c:if>
              </ul>
            </div>
          </li>                  
    
          <li class="nav-item">
            <a class="nav-link" href="pages/documentation/documentation.html">
              <i class="icon-paper menu-icon"></i>
              <span class="menu-title">Reportes</span>
            </a>
          </li>
        </ul>
      </nav>
      <!-- partial -->
