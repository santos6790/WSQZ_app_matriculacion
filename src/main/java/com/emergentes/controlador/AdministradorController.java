package com.emergentes.controlador;

import com.emergentes.dao.AdministradorDAO;
import com.emergentes.dao.AdministradorDAOimpl;
import com.emergentes.dao.UsuarioDAOimpl;
import com.emergentes.modelo.Administrador;
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
@WebServlet(name = "AdministradorController", urlPatterns = {"/AdministradorController"})
public class AdministradorController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            AdministradorDAO dao = new AdministradorDAOimpl();
            //Para resibir el ID
            int id;
            // Gestionar Registros
            Administrador adm = new Administrador();
            
            String action = (request.getParameter("action") != null) ? request.getParameter("action") : "view";
            switch(action){
                case "add":
                    //Nuevo Registro
                    request.setAttribute("administrador", adm);
                    request.getRequestDispatcher("frmadministrador.jsp").forward(request, response);
                    break;
                case "edit":
                    //Editar Registro
                    id = Integer.parseInt(request.getParameter("id_usuario"));
                    adm = dao.getById(id);
                    request.setAttribute("administrador", adm);
                    request.getRequestDispatcher("frmadministrador.jsp").forward(request, response);
                    break;
                case "delete":
                    //Eliminar Registro
                    id = Integer.parseInt(request.getParameter("id_usuario"));
                    dao.delete(id);
                    response.sendRedirect("AdministradorController");
//                    request.getRequestDispatcher("productos.jsp").forward(request, response);
                    break;
                case "view":
                    //Listar Registros
                    List<Administrador> lista = dao.getAll();
                    request.setAttribute("administradores", lista);
                    request.getRequestDispatcher("administradores.jsp").forward(request, response);
                    break;
                
            }
        }catch(Exception e){
            System.out.println("Error"+e.getMessage());
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        AdministradorDAO dao = new AdministradorDAOimpl();
        
        int id = Integer.parseInt(request.getParameter("id_usuario"));
        String ap_paterno = request.getParameter("ap_paterno");
        String ap_materno = request.getParameter("ap_materno");
        String nombres = request.getParameter("nombres");
        int ci = Integer.parseInt(request.getParameter("ci"));
        int celular = Integer.parseInt(request.getParameter("celular"));
        String correo = request.getParameter("correo");
        String foto = "default.jpg";
        String password = request.getParameter("password");
        int estado = 1;
        int nivel = 1;
        
        //Cifrar Password
        //generatePassword = hashlib.sha1(password.encode()).digest();
        
        Administrador adm = new Administrador();
        
        adm.setId_usuario(id);
        adm.setAp_paterno(ap_paterno);
        adm.setAp_materno(ap_materno);
        adm.setNombres(nombres);
        adm.setCi(ci);
        adm.setCelular(celular);
        adm.setCorreo(correo);
        adm.setFoto(foto);
        adm.setPassword(password);
        adm.setEstado(estado);
        adm.setNivel(nivel);
        
        
        if (id == 0) {
            //Nuevo Registro
            try{
                dao.insert(adm);
                response.sendRedirect("AdministradorController");
            } catch (Exception e){
                System.out.println("Error" + e.getMessage());
            }
        }else{
            //Actualizacion
            try{
                dao.update(adm);
                response.sendRedirect("AdministradorController");
            } catch (Exception e){
                System.out.println("Error" + e.getMessage());
            }
        }
    }
}
