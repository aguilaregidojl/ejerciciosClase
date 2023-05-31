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
public class PrimosExamen2 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        int menor = teclado.nextInt();
        System.out.println("Introduce el segundo número: ");
        int mayor = teclado.nextInt();

        for (int i = mayor; i >= menor; i--) {
            if (esPrimo(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean esPrimo(int n) {
        int contador = 0;

        if (n < 2) {
            return false;
        }


        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}
