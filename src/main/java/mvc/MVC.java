/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc;

import Controlador.Controlador;
import Modelo.Conexion;
import Vista.Vista;

/**
 *
 * @author proof
 */
public class MVC {
    public static void main (String[] args) {
        Conexion mod = new Conexion();
        Vista view = new Vista();
        Controlador ctrl = new Controlador(view, mod);
        
        
        ctrl.iniciar();
        view.setVisible(true);
    }
    
}
