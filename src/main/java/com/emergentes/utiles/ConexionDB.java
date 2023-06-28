
package com.emergentes.utiles;

/**
 *
 * @author JOSBER
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionDB {
    static String driver = "com.mysql.jdbc.Driver";
    static String url = "jdbc:mysql://localhost:3306/app_matriculacionv2";
    static String usuario = "root";
    static String password =  "";
    
    protected Connection conn = null;
    
    public ConexionDB(){
        try{
            //Especificacion del Driver
            Class.forName(driver);
            //Estable la conexion a la base de datos
            conn = DriverManager.getConnection(url, usuario, password);
            //Verificar si la conexion fue exitosa
            if (conn != null) {
                System.out.println("Conexion OK" + conn);
            }
        } catch (SQLException ex){
            System.out.println("Error de SQL "+ ex.getMessage());
        } catch (ClassNotFoundException ex){
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Connection conectar(){
        return conn;
    }
    public void desconectar(){
        try{
            conn.close();
        } catch (SQLException ex){
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
