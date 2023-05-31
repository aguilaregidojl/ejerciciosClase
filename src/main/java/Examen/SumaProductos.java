/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen;

import java.util.Scanner;

/**
 *
 * @author java
 */
public class SumaProductos {

    public static void main(String[] args) {

        int sumatotal = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer valor del rango: ");
        int menor = teclado.nextInt();
        System.out.println("Introduce el segundo valor del rango: ");
        int mayor = teclado.nextInt();

        for (int n = menor; n <= mayor; n++) {
            if (n%3==0) {
                sumatotal=sumatotal + (n*n);
            } else {
                
            }
        }

        System.out.println(sumatotal);
    }

}
