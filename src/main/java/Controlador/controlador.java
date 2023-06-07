/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.*;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author java
 */
public class controlador implements ActionListener {
    private vista vista;
    private modelo modelo;
    
    public controlador (vista vista, modelo modelo) {
        this.vista=vista;
        this.modelo=modelo;
        //CAMBIAR POR LOS BOTONES
        //this.vista.jButton1.addActionListener(this);
    }
    
    public void iniciar() {
        //vista.setTitle("Prueba");
        //vista.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
