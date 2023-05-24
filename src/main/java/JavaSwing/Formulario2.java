/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSwing;

/**
 *
 * @author proof
 */
import javax.swing.*;
public class Formulario2 extends JFrame {
    private JLabel label1,label2;
    public Formulario2() {
        setLayout(null);
        label1=new JLabel("Sistema de Facturación.");
        label1.setBounds(100,20,300,30);
        add(label1);
        label2=new JLabel("Vesion 1.0");
        label2.setBounds(100,100,100,30);
        add(label2);
    }
    
    public static void main(String[] ar) {
        Formulario2 formulario1=new Formulario2();
        formulario1.setBounds(0,0,300,200);
        formulario1.setResizable(false);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
