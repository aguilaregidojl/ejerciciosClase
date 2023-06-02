/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSwing;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author java
 */
public class Ventanas extends JFrame implements ActionListener {

    private JButton boton1;
    private JButton boton2;
    private int label;
    private JLabel label1;
    private JLabel label2;

    public Ventanas() {
        setLayout(null);

        boton1 = new JButton("Botón 1");
        boton1.setBounds(50, 50, 100, 30);
        add(boton1);
        boton1.addActionListener(this);

        boton2 = new JButton("Botón 2");
        boton2.setBounds(250, 50, 100, 30);
        add(boton2);
        boton2.addActionListener(this);

    }

    public Ventanas(int label) {
        setLayout(null);
        //this.label = label;
        if (label == 1) {
            label1 = new JLabel("Has pulsado el botón 1");
            label1.setBounds(100, 0, 200, 100);
            add(label1);
        }
        if (label == 2) {
            label2 = new JLabel("Has pulsado el botón 2");
            label2.setBounds(100, 0, 200, 100);
            add(label2);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            label = 1;
            this.setVisible(false);
            Ventanas ventana2 = new Ventanas(label);
            ventana2.setBounds(500, 300, 400, 150);
            ventana2.setVisible(true);
            ventana2.setDefaultCloseOperation(EXIT_ON_CLOSE);
        }

        if (e.getSource() == boton2) {
            label = 2;
            this.setVisible(false);
            Ventanas ventana3 = new Ventanas(label);
            ventana3.setBounds(500, 300, 400, 150);
            ventana3.setVisible(true);
            ventana3.setDefaultCloseOperation(EXIT_ON_CLOSE);

        }
    }

    public static void main(String[] args) {
        Ventanas ventana1 = new Ventanas();
        ventana1.setBounds(500, 300, 400, 150);
        ventana1.setVisible(true);
        ventana1.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
