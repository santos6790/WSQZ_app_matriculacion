package com.emergentes.controlador;

import com.emergentes.dao.AdministradorDAO;
import com.emergentes.dao.AdministradorDAOimpl;
import com.emergentes.modelo.Administrador;
import com.emergentes.utiles.Validate;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author santos
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("login.jsp");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
                
        System.out.println("Datos.."+ email +" "+ password);
        
        Validate v = new Validate();
        
        if (v.checkUser(email, password)) {
            try{                
                AdministradorDAO dao = new AdministradorDAOimpl();
                // Gestionar Registros
                Administrador adm = new Administrador();
                adm = dao.getByCorreo(email);
                
                HttpSession ses  = request.getSession();
                ses.setAttribute("administrador", adm);
                ses.setAttribute("login", "OK");
                response.sendRedirect("Dashboard");
                
            } catch (Exception e){
                System.out.println("Error" + e.getMessage());
            }
            
        }else{
            response.sendRedirect("login.jsp");
        }
    }
}
