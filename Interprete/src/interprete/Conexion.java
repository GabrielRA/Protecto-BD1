/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interprete;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author M Express
 */
public class Conexion {
    static Connection conn = null;
    public static String username;
    public static String password;
    public static boolean status;
    
    public static Connection cadena_conexion(){
        status = false;
        String url = "jdbc:sqlserver://localhost;databaseName=Banco";
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn=DriverManager.getConnection(url,Conexion.username,Conexion.password);
            status = true;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se puede conectar..." + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return conn;
    }
    
    public static void setUser(String user, String pass){
        Conexion.username = user;
        Conexion.password = pass;
    }
    
    public static boolean getStatus(){
        return status;
    }
    
}
