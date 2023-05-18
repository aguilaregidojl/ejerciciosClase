/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosClase;

import java.util.Scanner;

/**
 *
 * @author java
 */
public class Primos2 {

    public static void main(String[] args) {
        System.out.println("Hola mundo!");
        Scanner teclado = new Scanner(System.in);
        // Pedimos el número a comprobar por el programa
        System.out.println("Introduce un número a comprobar: ");
        int numero = teclado.nextInt();
        int contadordivisores = 0;
        int divisor = 1;
        int rangoinferior = 2;
        int rangosuperior = 20;
        
        while (divisor <= numero) {
            if (numero % divisor == 0) { //Si el resto de la división es cero
                //entonces es divisor
                contadordivisores++;
            }
            divisor++;
        }
        System.out.println("La cantidad de divisores es " + contadordivisores);
        if (contadordivisores <= 2) {
            System.out.println("El número SÍ es primo.");
        } else {
            System.out.println("El número NO es primo.");
        }
    }
}
