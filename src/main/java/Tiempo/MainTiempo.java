/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tiempo;

/**
 *
 * @author java
 */
public class MainTiempo {

    public static void main(String[] args) {
        Tiempo t1 = new Tiempo(1, 20, 35);
        Tiempo t2 = new Tiempo(2, 5, 10);
        Tiempo t3 = new Tiempo(0, 1, 0);

        System.out.println(t1 + " + " + t2 + " = " + t1.suma(t2));
        System.out.println(t2 + " - " + t3 + " = " + t2.resta(t3));
    }

}
