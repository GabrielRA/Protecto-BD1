/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interprete;

import java.sql.*;

/**
 *
 * @author M Express
 */
public class Conexion {
    
    public Connection cadena_conexion(){
        Connection cn=null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn=DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=bdproy1","user","1234");
        }catch (Exception e){}
        return cn;
    }
    
}
