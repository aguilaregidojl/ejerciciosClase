/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosClase;

/**
 *
 * @author java
 */
public class EjercicioBucles {
    public static void main(String[] args) {
        //Ejercicio con WHILE
        
        /*int numero=0;
        
        System.out.println("Los múltiplos de 5 entre 0 y 100 son:");
        while (numero<100) {
            numero=numero+5;
            System.out.print(numero + " ");
        }*/
        
        // Ejercicio con FOR
       
        /*System.out.println("Los múltiplos de 5 entre 0 y 100 son:");
        for (int numero=5; numero<100; numero=numero+5) {
            System.out.print(numero + " ");
        }*/
        
        //Ejercicio con DO WHILE
        /*int numero=0;
        System.out.println("Los múltiplos de 5 entre 0 y 100 son:");
        do {
            numero=numero+5;
            System.out.print(numero + " ");
        } while (numero<100);*/
        
        System.out.println("Entre el 320 y el 160, los números de 20 en 20 son:");
        for (int numero=320; numero>159; numero=numero-20) {
            System.out.print(numero + " ");
        }
    }
}
