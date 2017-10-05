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
public class PruebaConexion extends Conexion{
    Connection cn=cadena_conexion();
    
    public int probarconexion(){
        int conexion=0;
        try{
            PreparedStatement ps=null;
            ResultSet rs = null;
            ps=cn.prepareStatement("aqui va el codigo de consulta");
            rs=ps.executeQuery();
            if(rs.next()){
                conexion=1;
            }
        }catch (Exception e){
            
        }
        
        return conexion;
    }
    
}
