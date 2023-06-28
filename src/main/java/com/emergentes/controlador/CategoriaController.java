package com.emergentes.controlador;

import com.emergentes.dao.CategoriaDAO;
import com.emergentes.dao.CategoriaDAOimpl;
import com.emergentes.modelo.Categoria;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author santos
 */
@WebServlet(name = "CategoriaController", urlPatterns = {"/CategoriaController"})
public class CategoriaController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            CategoriaDAO dao = new CategoriaDAOimpl();
            //Para resibir el ID
            int id;
            // Gestionar Registros
            Categoria cat = new Categoria();
            
            String action = (request.getParameter("action") != null) ? request.getParameter("action") : "view";
            switch(action){
                case "add":
                    //Nuevo Registro
                    request.setAttribute("categoria", cat);
                    request.getRequestDispatcher("frmcategoria.jsp").forward(request, response);
                    break;
                case "edit":
                    //Editar Registro
                    id = Integer.parseInt(request.getParameter("id_categoria"));
                    cat = dao.getById(id);
                    request.setAttribute("categoria", cat);
                    request.getRequestDispatcher("frmcategoria.jsp").forward(request, response);
                    break;
                case "delete":
                    //Eliminar Registro
                    id = Integer.parseInt(request.getParameter("id_categoria"));
                    dao.delete(id);
                    response.sendRedirect("CategoriaController");
//                    request.getRequestDispatcher("productos.jsp").forward(request, response);
                    break;
                case "view":
                    //Listar Registros
                    List<Categoria> lista = dao.getAll();
                    request.setAttribute("categorias", lista);
                    request.getRequestDispatcher("categorias.jsp").forward(request, response);
                    break;
                
            }
        }catch(Exception e){
            System.out.println("Error"+e.getMessage());
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        CategoriaDAO dao = new CategoriaDAOimpl();
        
        int id = Integer.parseInt(request.getParameter("id_categoria"));
        String nombre = request.getParameter("nombre");
        String descripcion = request.getParameter("descripcion");
        
        Categoria cat = new Categoria();
        
        cat.setId_categoria(id);
        cat.setNombre(nombre);
        cat.setDescripcion(descripcion);
        
        
        if (id == 0) {
            //Nuevo Registro
            try{
                dao.insert(cat);
                response.sendRedirect("CategoriaController");
            } catch (Exception e){
                System.out.println("Error" + e.getMessage());
            }
        }else{
            //Actualizacion
            try{
                dao.update(cat);
                response.sendRedirect("CategoriaController");
            } catch (Exception e){
                System.out.println("Error" + e.getMessage());
            }
        }
    }
}
