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
public class PrimosExamen {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x;
        int y;
        boolean primo;
        System.out.println("Introduce el primer número del rango:");
        x = teclado.nextInt();
        System.out.println("Introduce el segundo número del rango:");
        y = teclado.nextInt();
        
        System.out.println("Números primos: ");
        for (int i = y;i>=y;i--) {
            primo = false;
            for (int z=2; z< i;z++) {
                if (i%z==0){
                    primo = true;
                }
            }
            if(primo==false) {
                System.out.println(i);
            }
        }
    }
}
