/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pati
 */
public class conexion {
     
    private final String base="estacion";
    private final String user="root";
    private final String password="";
    private final String url="jdbc:mysql://localhost:3306/"+base;
    private Connection con=null;

    public Connection getconexion()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection(url,user,password);
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {   
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
               return con;
    }
}
