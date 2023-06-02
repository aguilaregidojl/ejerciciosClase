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
public class CantidadCifras {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.println("Introduce un número entero:");
        n = teclado.nextInt();
        String numstr = Integer.toString(n);

        System.out.println("El número tiene " + numstr.length() + " cifras.");
    }

}
