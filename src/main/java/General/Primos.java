/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package General;

import java.util.Scanner;

/**
 * Programa para calcular si un número es o no es un número primo.
 *
 * @author Jose Luis Aguilar Egido
 */
public class Primos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x;
        int resto;
        int contador;
        int divisor;
        System.out.println("Introduce el número a comprobar :");
        x = teclado.nextInt();
        divisor = x;
        contador = 0;

        while (divisor > 0) {
            resto = (x % divisor);
            if (resto == 0) {
                contador++;
                divisor--;
            } else {
                divisor--;
            }
        }
        if (contador == 2) {
            System.out.println("Es primo.");
        } else {
            System.out.println("No es primo");
        }
    }
}
