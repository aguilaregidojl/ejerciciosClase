/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSwing2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Jose Luis Aguilar
 */
public class Registro extends JFrame implements ActionListener {

    private JButton boton1;
    private JButton boton2;
    private JButton enviar;
    private int label;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JTextField field1;
    private JTextField field2;
    private JTextField field3;
    private JRadioButton m;
    private JRadioButton f;
    private JRadioButton nb;
    private ButtonGroup bg;
    private JCheckBox consent;

    public Registro() {
        setLayout(null);

        boton1 = new JButton("Opción 1");
        boton1.setBounds(50, 50, 100, 30);
        add(boton1);
        boton1.addActionListener(this);

        boton2 = new JButton("Opción 2");
        boton2.setBounds(250, 50, 100, 30);
        add(boton2);
        boton2.addActionListener(this);

    }

    public Registro(int label) {
        setLayout(null);
        //this.label = label;
        if (label == 1) {
            //Creamos las 3 labels
            label1 = new JLabel("Nombre", SwingConstants.RIGHT);
            label1.setBounds(10, 0, 70, 30);
            add(label1);
            label2 = new JLabel("Apellidos", SwingConstants.RIGHT);
            label2.setBounds(10, 30, 70, 30);
            add(label2);
            label3 = new JLabel("Contraseña", SwingConstants.RIGHT);
            label3.setBounds(10, 60, 70, 30);
            add(label3);
            //Ahora creamos los 3 espacios para introducir texto
            field1 = new JTextField();
            field1.setBounds(90, 10, 150, 20);
            add(field1);
            field2 = new JTextField();
            field2.setBounds(90, 40, 150, 20);
            add(field2);
            field3 = new JTextField();
            field3.setBounds(90, 70, 150, 20);
            add(field3);
            //Creamos el botón Enviar
            enviar = new JButton("Enviar");
            enviar.setBounds(90, 100, 100, 30);
            add(enviar);
            enviar.addActionListener(this);

        }
        if (label == 2) {
            //Creamos las 4 labels
            label1 = new JLabel("Nombre", SwingConstants.RIGHT);
            label1.setBounds(10, 0, 70, 30);
            add(label1);
            label2 = new JLabel("Apellidos", SwingConstants.RIGHT);
            label2.setBounds(10, 30, 70, 30);
            add(label2);
            label3 = new JLabel("Contraseña", SwingConstants.RIGHT);
            label3.setBounds(10, 60, 70, 30);
            add(label3);
            label4 = new JLabel("Género");
            label4.setBounds(40, 100, 60, 30);
            add(label4);
            //Ahora creamos los 3 espacios para introducir texto
            field1 = new JTextField();
            field1.setBounds(90, 10, 150, 20);
            add(field1);
            field2 = new JTextField();
            field2.setBounds(90, 40, 150, 20);
            add(field2);
            field3 = new JTextField();
            field3.setBounds(90, 70, 150, 20);
            add(field3);
            //Ahora creamos los RadioButton de Género y su ButtonGroup
            bg = new ButtonGroup();
            m = new JRadioButton("M");
            m.setBounds(100, 105, 40, 20);
            add(m);
            bg.add(m);
            f = new JRadioButton("F");
            f.setBounds(140, 105, 40, 20);
            add(f);
            bg.add(f);
            nb = new JRadioButton("NB");
            nb.setBounds(180, 105, 50, 20);
            add(nb);
            bg.add(nb);
            //Creamos el checkbox de consentimiento
            consent = new JCheckBox("¿Estás de acuerdo?");
            consent.setHorizontalTextPosition(SwingConstants.LEFT);
            consent.setBounds(70, 130, 180, 30);
            add(consent);
            //Creamos el botón Enviar
            enviar = new JButton("Enviar");
            enviar.setBounds(90, 170, 100, 30);
            add(enviar);
            enviar.addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            label = 1;
            this.setVisible(false);
            Registro ventana2 = new Registro(label);
            ventana2.setBounds(500, 300, 280, 200);
            ventana2.setVisible(true);
            ventana2.setDefaultCloseOperation(EXIT_ON_CLOSE);
        }

        if (e.getSource() == boton2) {
            label = 2;
            this.setVisible(false);
            Registro ventana3 = new Registro(label);
            ventana3.setBounds(500, 300, 280, 250);
            ventana3.setVisible(true);
            ventana3.setDefaultCloseOperation(EXIT_ON_CLOSE);

        }

        if (e.getSource() == enviar) {
            field1.setEnabled(false);
            field2.setEnabled(false);
            field3.setEnabled(false);
            enviar.setText("¡Enviado!");
            enviar.setEnabled(false);
            if (label == 2) {
                m.setEnabled(false);
                f.setEnabled(false);
                nb.setEnabled(false);
                consent.setEnabled(false);
            }

        }
    }

    public static void main(String[] args) {
        Registro ventana1 = new Registro();
        ventana1.setBounds(500, 300, 400, 150);
        ventana1.setVisible(true);
        ventana1.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
