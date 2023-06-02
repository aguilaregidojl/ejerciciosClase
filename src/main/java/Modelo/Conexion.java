/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Controlador.Controlador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import lombok.Data;

/**
 *
 * @author java
 */
@Data
public class Conexion {

    //Creamos las variables genéricas de la conexión
    private String base;
    private String user;
    private char[] password;
    private String url;
    private String puerto;
    private Controlador cont;
    private Connection con;
    private String pwd = new String(password);

    public Connection getConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.url, this.user, this.pwd);

        } catch (SQLException e) {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (con != null) {
            System.out.println("Connected to database!");
        } else {
            System.out.println("Failed to make connection!");
        }

        return con;
    }

}
