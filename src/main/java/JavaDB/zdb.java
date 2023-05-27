/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaDB;

/**
 *
 * @author java
 */
import java.sql.Connection;
import java.sql.DriverManager;


public class zdb {
    
    Connection con = null;
    
    public static Connection mycon(){
        
        Connection con = null;
        
        try {
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "");
            return con;
            
            
        } catch (Exception e) {
            
            return null;
        }
    }
    
    public Connection getConnection() {
        return con;
    }
    
}