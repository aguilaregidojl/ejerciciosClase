/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.*;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author java
 */
public class controlador implements ActionListener {
    private vista vista;
    private conexion modelo;
    Connection con;
    PreparedStatement ps = null;
    public DefaultTableModel modelotabla;
    Statement st;
    ResultSet rs;
    int id;
    
    public controlador (vista vista, conexion modelo) {
        this.vista=vista;
        this.modelo=modelo;
        //CAMBIAR POR LOS BOTONES
        //this.vista.jButton1.addActionListener(this);
    }
    
    public void iniciar() {
        //vista.setTitle("Prueba");
        //vista.setLocationRelativeTo(null);
    }
    
    /*private void limpiarCajas() {
        cname.setText(null);
        csurname.setText(null);
        cnameact.setText(null);
        csurnameact.setText(null);
        cidact.setText(null);
        ciddel.setText(null);
        ctelefono.setText(null);
        cdni.setText(null);
        acttelefono.setText(null);
        actdni.setText(null);
    }*/

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
