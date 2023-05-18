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
public class sumatorio {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, suma;
        float promedio;
        System.out.println("Ingrese primer valor:");
        num1 = teclado.nextInt();
        System.out.println("Ingrese segundo valor");
        num2 = teclado.nextInt();
        suma = num1 + num2;
        //Convertimos los números a float para sacar el promedio con decimales
        promedio = ((float) num1 + (float) num2) / 2;
        System.out.print("La suma de los dos valores es:");
        System.out.println(suma);
        System.out.print("El promedio de los dos valores es:");
        System.out.println(promedio);
    }

}
