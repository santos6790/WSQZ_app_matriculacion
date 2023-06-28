package com.emergentes.controlador;

import com.emergentes.dao.CarreraDAO;
import com.emergentes.dao.CarreraDAOimpl;
import com.emergentes.dao.CategoriaDAO;
import com.emergentes.dao.CategoriaDAOimpl;
import com.emergentes.dao.GestionDAO;
import com.emergentes.dao.GestionDAOimpl;
import com.emergentes.dao.MatriculaDAO;
import com.emergentes.dao.MatriculaDAOimpl;
import com.emergentes.dao.SedeDAO;
import com.emergentes.dao.SedeDAOimpl;
import com.emergentes.dao.UsuarioDAO;
import com.emergentes.dao.UsuarioDAOimpl;
import com.emergentes.modelo.Carrera;
import com.emergentes.modelo.Categoria;
import com.emergentes.modelo.Gestion;
import com.emergentes.modelo.Matricula;
import com.emergentes.modelo.Sede;
import com.emergentes.modelo.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @author santos
 */
@WebServlet(name = "MatriculaController", urlPatterns = {"/MatriculaController"})
public class MatriculaController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            MatriculaDAO dao = new MatriculaDAOimpl();
            
            UsuarioDAO daoUsuario = new UsuarioDAOimpl();
            CategoriaDAO daoCategoria = new CategoriaDAOimpl();
            CarreraDAO daoCarrera = new CarreraDAOimpl();
            SedeDAO daoSede = new SedeDAOimpl();
            GestionDAO daoGestion = new GestionDAOimpl();
            
            //Para recibir el ID
            int id;
            
            List<Usuario> lista_usuarios = null;
            List<Categoria> lista_categorias = null;
            List<Carrera> lista_carreras = null;
            List<Sede> lista_sedes = null;
            List<Gestion> lista_gestiones = null;
            
            
            // Gestionar Registros
            Matricula mat = new Matricula();
            
            String action = (request.getParameter("action") != null) ? request.getParameter("action") : "view";
            switch(action){
                case "add":
                    //Nuevo Registro
                    lista_usuarios = daoUsuario.getAll();
                    lista_categorias = daoCategoria.getAll();
                    lista_carreras = daoCarrera.getAll();
                    lista_sedes = daoSede.getAll();
                    lista_gestiones = daoGestion.getAll();
                    
                    request.setAttribute("lista_usuarios", lista_usuarios);
                    request.setAttribute("lista_categorias", lista_categorias);
                    request.setAttribute("lista_carreras", lista_carreras);
                    request.setAttribute("lista_sedes", lista_sedes);
                    request.setAttribute("lista_gestiones", lista_gestiones);
                    
                    request.setAttribute("matricula", mat);
                    request.getRequestDispatcher("frmmatricula.jsp").forward(request, response);
                    break;
                case "edit":
                    //Editar Registro
                    id = Integer.parseInt(request.getParameter("id_matricula"));
                    mat = dao.getById(id);
                    
                    lista_usuarios = daoUsuario.getAll();
                    lista_categorias = daoCategoria.getAll();
                    lista_carreras = daoCarrera.getAll();
                    lista_sedes = daoSede.getAll();
                    lista_gestiones = daoGestion.getAll();
                    
                    request.setAttribute("lista_usuarios", lista_usuarios);
                    request.setAttribute("lista_categorias", lista_categorias);
                    request.setAttribute("lista_carreras", lista_carreras);
                    request.setAttribute("lista_sedes", lista_sedes);
                    request.setAttribute("lista_gestiones", lista_gestiones);
                    
                    
                    request.setAttribute("matricula", mat);
                    request.getRequestDispatcher("frmmatricula.jsp").forward(request, response);
                    break;
                case "delete":
                    //Eliminar Registro
                    id = Integer.parseInt(request.getParameter("id_matricula"));
                    dao.delete(id);
                    response.sendRedirect("MatriculaController");
//                    request.getRequestDispatcher("productos.jsp").forward(request, response);
                    break;
                case "view":
                    //Listar Registros
                    List<Matricula> lista = dao.getAll();
                    request.setAttribute("matriculas", lista);
                    request.getRequestDispatcher("matriculas.jsp").forward(request, response);
                    break;
                
            }
        }catch(Exception e){
            System.out.println("Error"+e.getMessage());
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                
        int id = Integer.parseInt(request.getParameter("id_matricula"));
        
        int id_usuario = Integer.parseInt(request.getParameter("id_usuario"));
        int id_categoria = Integer.parseInt(request.getParameter("id_categoria"));
        int id_carrera = Integer.parseInt(request.getParameter("id_carrera"));
        int id_sede = Integer.parseInt(request.getParameter("id_sede"));
        int id_gestion = Integer.parseInt(request.getParameter("id_gestion"));
        
        int costo = Integer.parseInt(request.getParameter("costo"));
        String f_matriculacion = request.getParameter("f_matriculacion");
        int nro_deposito = Integer.parseInt(request.getParameter("nro_deposito"));
        
        
        Matricula mat = new Matricula();
        
        mat.setId_matricula(id);
        mat.setCosto(costo);
        mat.setF_matriculacion(f_matriculacion);
        mat.setNro_deposito(nro_deposito);
        mat.setId_usuario(id_usuario);
        mat.setId_categoria(id_categoria);
        mat.setId_carrera(id_carrera);
        mat.setId_sede(id_sede);
        mat.setId_gestion(id_gestion);
        
        
        if (id == 0) {
            //Nuevo Registro
            MatriculaDAO dao = new MatriculaDAOimpl();
            try{
                dao.insert(mat);
                response.sendRedirect("MatriculaController");
            } catch (Exception ex){
                Logger.getLogger(MatriculaController.class.getName()).log(Level.SEVERE, null, ex);
//                System.out.println("Error" + e.getMessage());
            }
        }else{
            //Actualizacion
            MatriculaDAO dao = new MatriculaDAOimpl();
            try{
                
                dao.update(mat);
                response.sendRedirect("MatriculaController");
            } catch (Exception ex){
                Logger.getLogger(MatriculaController.class.getName()).log(Level.SEVERE, null, ex);
                //System.out.println("Error" + e.getMessage());
            }
        }
    }
}
