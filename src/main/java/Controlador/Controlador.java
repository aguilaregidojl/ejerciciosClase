/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Conexion;
import Vista.frmConexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import lombok.Data;

/**
 *
 * @author java
 */
@Data
public class Controlador implements ActionListener {

    private frmConexion frmcnx;
    private Conexion conx;
    /*public String ip;
    public String puerto;
    public String base;
    public String user;
    public char[] password;
    public String pwd;*/
    
    public Controlador(frmConexion frmcnx, Conexion conx) {
        this.conx = conx;
        this.frmcnx = frmcnx;
        this.frmcnx.btnConectar.addActionListener(this);
        this.frmcnx.btnBorrarTodo.addActionListener(this);
    }

    public void iniciar() {
        frmcnx.setTitle("Datos Conexión");
        frmcnx.setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frmcnx.btnConectar) {
            conx.setUrl(frmcnx.txtIp.getText());
            conx.setPuerto(frmcnx.txtPuerto.getText());
            conx.setBase(frmcnx.txtNombreDb.getText());
            conx.setUser(frmcnx.txtUsuario.getText());
            conx.setPassword(frmcnx.txtPassword.getPassword());
            
            /*ip = frmcnx.txtIp.getText();
            puerto = frmcnx.txtPuerto.getText();
            base = frmcnx.txtNombreDb.getText();
            user = frmcnx.txtUsuario.getText();
            password = frmcnx.txtPassword.getPassword();
            pwd = new String(password);*/

        }

        if (e.getSource() == frmcnx.btnBorrarTodo) {
            limpiar();
        }
    }

    public void limpiar() {
        frmcnx.txtIp.setText(null);
        frmcnx.txtPuerto.setText(null);
        frmcnx.txtNombreDb.setText(null);
        frmcnx.txtUsuario.setText(null);
        frmcnx.txtPassword.setText(null);
    }
}
