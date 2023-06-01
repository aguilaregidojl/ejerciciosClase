/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.frmConexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author java
 */
public class Controlador implements ActionListener {

    private frmConexion frmcnx;
    private Controlador cont;

    public void iniciar() {
        frmcnx.setTitle("Datos Conexión");
        frmcnx.setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frmcnx.btnConectar) {
            
        }

        if (e.getSource() == frmcnx.btnBorrarTodo) {
            frmcnx.txtIp.setText(null);
            frmcnx.txtPuerto.setText(null);
            frmcnx.txtNombreDb.setText(null);
            frmcnx.txtUsuario.setText(null);
            frmcnx.txtPassword.setText(null);
        }
    }

}
