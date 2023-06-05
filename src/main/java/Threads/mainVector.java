/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Threads;

/**
 *
 * @author java
 */
public class mainVector {

    public static void main(String[] args) {

        
        int suma1;
        int suma2;
        int suma3;

        sumaVector hilo1 = new sumaVector(1);
        sumaVector hilo2 = new sumaVector(2);
        sumaVector hilo3 = new sumaVector(3);

        hilo1.start();
        hilo2.start();
        hilo3.start();

        try {
            hilo1.join();
            hilo2.join();
            hilo3.join();
        } catch (InterruptedException ex) {
            System.out.println("ERROR FATAL");
        }
        
        suma1=hilo1.getSuma1();
        suma2=hilo2.getSuma2();
        suma3=hilo3.getSuma3();
       
        int suma = suma1+suma2+suma3;
        System.out.println("El total es:");
        System.out.println(suma);
    }

}
