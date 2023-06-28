package com.emergentes.controlador;

import com.emergentes.dao.UsuarioDAO;
import com.emergentes.dao.UsuarioDAOimpl;
import com.emergentes.modelo.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author JOSBER
 */
@WebServlet(name = "UsuarioController", urlPatterns = {"/UsuarioController"})
public class UsuarioController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            UsuarioDAO dao = new UsuarioDAOimpl();
            //Para resibir el ID
            int id;
            // Gestionar Registros
            Usuario usu = new Usuario();
            
            String action = (request.getParameter("action") != null) ? request.getParameter("action") : "view";
            switch(action){
                case "add":
                    //Nuevo Registro
                    request.setAttribute("usuario", usu);
                    request.getRequestDispatcher("frmusuario.jsp").forward(request, response);
                    break;
                case "edit":
                    //Editar Registro
                    id = Integer.parseInt(request.getParameter("id_usuario"));
                    usu = dao.getById(id);
                    request.setAttribute("usuario", usu);
                    request.getRequestDispatcher("frmusuario.jsp").forward(request, response);
                    break;
                case "delete":
                    //Eliminar Registro
                    id = Integer.parseInt(request.getParameter("id_usuario"));
                    dao.delete(id);
                    response.sendRedirect("UsuarioController");
//                    request.getRequestDispatcher("productos.jsp").forward(request, response);
                    break;
                case "view":
                    //Listar Registros
                    List<Usuario> lista = dao.getAll();
                    request.setAttribute("usuarios", lista);
                    request.getRequestDispatcher("usuarios.jsp").forward(request, response);
                    break;
                
            }
        }catch(Exception e){
            System.out.println("Error"+e.getMessage());
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        UsuarioDAO dao = new UsuarioDAOimpl();
        
        int id = Integer.parseInt(request.getParameter("id_usuario"));
        String ap_paterno = request.getParameter("ap_paterno");
        String ap_materno = request.getParameter("ap_materno");
        String nombres = request.getParameter("nombres");
        int ci = Integer.parseInt(request.getParameter("ci"));
        int ru = Integer.parseInt(request.getParameter("ru"));
        int celular = Integer.parseInt(request.getParameter("celular"));
        String correo = request.getParameter("correo");
        String direccion = request.getParameter("direccion");
        String f_nac = request.getParameter("f_nac");
        String n_titulo_bachiller = request.getParameter("n_titulo_bachiller");
        String foto = "default.jpg";
        String nick = request.getParameter("nick");
        String password = request.getParameter("password");
        int estado = 1;
        int nivel = 2;
        
        //Cifrar Password
        //generatePassword = hashlib.sha1(password.encode()).digest();
        
        Usuario usu = new Usuario();
        
        usu.setId_usuario(id);
        usu.setAp_paterno(ap_paterno);
        usu.setAp_materno(ap_materno);
        usu.setNombres(nombres);
        usu.setCi(ci);
        usu.setRu(ru);
        usu.setCelular(celular);
        usu.setCorreo(correo);
        usu.setDireccion(direccion);
        usu.setF_nac(f_nac);
        usu.setN_titulo_bachiller(n_titulo_bachiller);
        usu.setFoto(foto);
        usu.setNick(nick);
        usu.setPassword(password);
        usu.setEstado(estado);
        usu.setNivel(nivel);
        
        
        if (id == 0) {
            //Nuevo Registro
            try{
                dao.insert(usu);
                response.sendRedirect("UsuarioController");
            } catch (Exception e){
                System.out.println("Error" + e.getMessage());
            }
        }else{
            //Actualizacion
            try{
                dao.update(usu);
                response.sendRedirect("UsuarioController");
            } catch (Exception e){
                System.out.println("Error" + e.getMessage());
            }
        }
    }
}
