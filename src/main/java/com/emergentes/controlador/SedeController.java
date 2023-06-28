package com.emergentes.controlador;

import com.emergentes.dao.SedeDAO;
import com.emergentes.dao.SedeDAOimpl;
import com.emergentes.modelo.Sede;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @author santos
 */
@WebServlet(name = "SedeController", urlPatterns = {"/SedeController"})
public class SedeController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            SedeDAO dao = new SedeDAOimpl();
            //Para resibir el ID
            int id;
            // Gestionar Registros
            Sede sed = new Sede();
            
            String action = (request.getParameter("action") != null) ? request.getParameter("action") : "view";
            switch(action){
                case "add":
                    //Nuevo Registro
                    request.setAttribute("sede", sed);
                    request.getRequestDispatcher("frmsede.jsp").forward(request, response);
                    break;
                case "edit":
                    //Editar Registro
                    id = Integer.parseInt(request.getParameter("id_sede"));
                    sed = dao.getById(id);
                    request.setAttribute("sede", sed);
                    request.getRequestDispatcher("frmsede.jsp").forward(request, response);
                    break;
                case "delete":
                    //Eliminar Registro
                    id = Integer.parseInt(request.getParameter("id_sede"));
                    dao.delete(id);
                    response.sendRedirect("SedeController");
//                    request.getRequestDispatcher("productos.jsp").forward(request, response);
                    break;
                case "view":
                    //Listar Registros
                    List<Sede> lista = dao.getAll();
                    request.setAttribute("sedes", lista);
                    request.getRequestDispatcher("sedes.jsp").forward(request, response);
                    break;
                
            }
        }catch(Exception e){
            System.out.println("Error"+e.getMessage());
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        SedeDAO dao = new SedeDAOimpl();
        
        int id = Integer.parseInt(request.getParameter("id_sede"));
        String nombre = request.getParameter("nombre");
        String direccion = request.getParameter("direccion");
        
        Sede sed = new Sede();
        
        sed.setId_sede(id);
        sed.setNombre(nombre);
        sed.setDireccion(direccion);
        
        
        if (id == 0) {
            //Nuevo Registro
            try{
                dao.insert(sed);
                response.sendRedirect("SedeController");
            } catch (Exception e){
                System.out.println("Error" + e.getMessage());
            }
        }else{
            //Actualizacion
            try{
                dao.update(sed);
                response.sendRedirect("SedeController");
            } catch (Exception e){
                System.out.println("Error" + e.getMessage());
            }
        }
    }
}
