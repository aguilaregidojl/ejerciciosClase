/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaDB;

/**
 *
 * @author java
 */
import java.sql.*;

public class PruebaDB {
    
    public static void main(String[] args) {
            System.out.println("-------- MySQL JDBC Connection Testing ------------");


    Connection connection = null;

    try {
        connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/sakila", "root", "");
    } catch (SQLException e) {
        for(Throwable ex : e) {
            System.err.println("Error occurred " + ex);
        }
        e.printStackTrace();
    }

    if (connection != null) {
        System.out.println("Connected to database!");
    } else {
        System.out.println("Failed to make connection!");
    }

    try {
        Statement stmt = connection.createStatement();
        String query = "select * from actor ;";
    //person is the table name
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            String id = rs.getObject(1).toString();
            String first_name = rs.getObject(2).toString();
            String last_name = rs.getObject(3).toString();
            System.out.println("El nombre del actor es " + first_name + " con id número " + id + " y su apellido es " + last_name);
    //Person table has name and gender column

        }
    } catch (SQLException e) {
        e.printStackTrace();
        for(Throwable ex : e) {
            System.err.println("Error occurred " + ex);
        }
        System.out.println("Error in fetching data");
    }
    }
    
}