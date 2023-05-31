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
public class Triangulos {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce cuántos asteriscos tiene un lado: ");
        int n = teclado.nextInt();
        System.out.println("Toma un árbol de Navidad to guapo: ");
        for (int x = 0; x < n; x++) {
            for (int y = n - x; y > 1; y--) {
                System.out.print(" ");
            }
            for (int y = 0; y <= x; y++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
