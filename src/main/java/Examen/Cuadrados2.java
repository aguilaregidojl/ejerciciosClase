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
class Cuadrados2 {

    public static void main(String args[]) {
        int a, b, k, l;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el lado del cuadrado: ");
        k = teclado.nextInt();
        l = k;

        if (k % 2 == 0) {
            for (a = 1; a <= k; a++) {
                for (b = 1; b <= l; b++) {
                    if (a == 1 || a == k || b == 1 || b == l) {

                        System.out.print("+");
                    } else {

                        System.out.print("-");
                    }
                }

                System.out.println();
            }
        }

        if (k % 2 == 1) {
            for (a = 1; a <= k; a++) {
                for (b = 1; b <= l; b++) {
                    if (a == 1 || a == k || b == 1 || b == l) {

                        System.out.print("-");
                    } else {

                        System.out.print("+");
                    }
                }

                System.out.println();
            }
        }
    }
}
