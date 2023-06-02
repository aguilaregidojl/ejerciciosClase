/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc;

import Controlador.Controlador;
import Modelo.Conexion;
import Vista.frmConexion;

/**
 *
 * @author proof
 */
public class MVC {
    public static void main (String[] args) {
        Conexion conexion = new Conexion();
        frmConexion frmcnx = new frmConexion();
        
        Controlador ctrl = new Controlador(frmcnx, conexion);
        ctrl.iniciar();
        frmcnx.setVisible(true);
    }
    
}
