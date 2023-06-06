/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Conexion;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import lombok.Data;

/**
 *
 * @author java
 */
@Data
public class Controlador implements ActionListener {

    private Vista view;
    private Conexion model;
    /*public String ip;
    public String puerto;
    public String base;
    public String user;
    public char[] password;
    public String pwd;*/
    
    public Controlador(Vista view, Conexion model) {
        this.model = model;
        this.view = view;
        this.view.btnConectar.addActionListener(this);
        this.view.btnBorrarTodo.addActionListener(this);
    }

    public void iniciar() {
        view.setTitle("Datos Conexión");
        view.setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.btnConectar) {
            model.setUrl(view.txtIp.getText());
            model.setPuerto(view.txtPuerto.getText());
            model.setBase(view.txtNombreDb.getText());
            model.setUser(view.txtUsuario.getText());
            model.setPassword(view.txtPassword.getPassword());
            
            /*ip = frmcnx.txtIp.getText();
            puerto = frmcnx.txtPuerto.getText();
            base = frmcnx.txtNombreDb.getText();
            user = frmcnx.txtUsuario.getText();
            password = frmcnx.txtPassword.getPassword();
            pwd = new String(password);*/

        }

        if (e.getSource() == view.btnBorrarTodo) {
            limpiar();
        }
    }

    public void limpiar() {
        view.txtIp.setText(null);
        view.txtPuerto.setText(null);
        view.txtNombreDb.setText(null);
        view.txtUsuario.setText(null);
        view.txtPassword.setText(null);
    }
}
