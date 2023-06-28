package com.emergentes.controlador;

import com.emergentes.dao.CarreraDAO;
import com.emergentes.dao.CarreraDAOimpl;
import com.emergentes.modelo.Carrera;
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
@WebServlet(name = "CarreraController", urlPatterns = {"/CarreraController"})
public class CarreraController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            CarreraDAO dao = new CarreraDAOimpl();
            //Para resibir el ID
            int id;
            // Gestionar Registros
            Carrera car = new Carrera();
            
            String action = (request.getParameter("action") != null) ? request.getParameter("action") : "view";
            switch(action){
                case "add":
                    //Nuevo Registro
                    request.setAttribute("carrera", car);
                    request.getRequestDispatcher("frmcarrera.jsp").forward(request, response);
                    break;
                case "edit":
                    //Editar Registro
                    id = Integer.parseInt(request.getParameter("id_carrera"));
                    car = dao.getById(id);
                    request.setAttribute("carrera", car);
                    request.getRequestDispatcher("frmcarrera.jsp").forward(request, response);
                    break;
                case "delete":
                    //Eliminar Registro
                    id = Integer.parseInt(request.getParameter("id_carrera"));
                    dao.delete(id);
                    response.sendRedirect("CarreraController");
//                    request.getRequestDispatcher("productos.jsp").forward(request, response);
                    break;
                case "view":
                    //Listar Registros
                    List<Carrera> lista = dao.getAll();
                    request.setAttribute("carreras", lista);
                    request.getRequestDispatcher("carreras.jsp").forward(request, response);
                    break;
                
            }
        }catch(Exception e){
            System.out.println("Error"+e.getMessage());
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        CarreraDAO dao = new CarreraDAOimpl();
        
        int id = Integer.parseInt(request.getParameter("id_carrera"));
        String nombre = request.getParameter("nombre");
        String descripcion = request.getParameter("descripcion");
        String direccion = request.getParameter("direccion");
        
        Carrera car = new Carrera();
        
        car.setId_carrera(id);
        car.setNombre(nombre);
        car.setDescripcion(descripcion);
        car.setDireccion(direccion);
        
        
        if (id == 0) {
            //Nuevo Registro
            try{
                dao.insert(car);
                response.sendRedirect("CarreraController");
            } catch (Exception e){
                System.out.println("Error" + e.getMessage());
            }
        }else{
            //Actualizacion
            try{
                dao.update(car);
                response.sendRedirect("CarreraController");
            } catch (Exception e){
                System.out.println("Error" + e.getMessage());
            }
        }
    }
}
