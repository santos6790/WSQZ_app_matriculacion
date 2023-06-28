package com.emergentes.controlador;

import com.emergentes.dao.GestionDAO;
import com.emergentes.dao.GestionDAOimpl;
import com.emergentes.modelo.Gestion;
import com.emergentes.utiles.ConexionDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author santos
 */
@WebServlet(name = "GestionController", urlPatterns = {"/GestionController"})
public class GestionController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            GestionDAO dao = new GestionDAOimpl();
            //Para resibir el ID
            int id;
            // Gestionar Registros
            Gestion ges = new Gestion();
            
            String action = (request.getParameter("action") != null) ? request.getParameter("action") : "view";
            switch(action){
                case "add":
                    //Nuevo Registro
                    request.setAttribute("gestion", ges);
                    request.getRequestDispatcher("frmgestion.jsp").forward(request, response);
                    break;
                case "edit":
                    //Editar Registro
                    id = Integer.parseInt(request.getParameter("id_gestion"));
                    ges = dao.getById(id);
                    request.setAttribute("gestion", ges);
                    request.getRequestDispatcher("frmgestion.jsp").forward(request, response);
                    break;
                case "delete":
                    //Eliminar Registro
                    id = Integer.parseInt(request.getParameter("id_gestion"));
                    dao.delete(id);
                    response.sendRedirect("GestionController");
//                    request.getRequestDispatcher("productos.jsp").forward(request, response);
                    break;
                case "view":
                    //Listar Registros
                    List<Gestion> lista = dao.getAll();
                    request.setAttribute("gestiones", lista);
                    request.getRequestDispatcher("gestiones.jsp").forward(request, response);
                    break;
                
            }
        }catch(Exception e){
            System.out.println("Error"+e.getMessage());
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        GestionDAO dao = new GestionDAOimpl();
        
        int id = Integer.parseInt(request.getParameter("id_gestion"));
        String nombre = request.getParameter("nombre");
        
        Gestion ges = new Gestion();
        
        ges.setId_gestion(id);
        ges.setNombre(nombre);
        
        if (id == 0) {
            //Nuevo Registro
            try{
                dao.insert(ges);
                response.sendRedirect("GestionController");
            } catch (Exception e){
                System.out.println("Error" + e.getMessage());
            }
        }else{
            //Actualizacion
            try{
                dao.update(ges);
                response.sendRedirect("GestionController");
            } catch (Exception e){
                System.out.println("Error" + e.getMessage());
            }
        }
    }
}
