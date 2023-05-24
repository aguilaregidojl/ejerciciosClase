/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSwing;

import java.util.Scanner;

/**
 *
 * @author Jose Luis Aguilar
 */
public class Examen {
    public static void main (String[] args) {
        
        Scanner teclado = new Scanner (System.in);

        //Atributos
        int capital;
        double interes;
        int anios;
        double total;
        
        
        //Yo que sé ya
        System.out.println("Introduce la cantidad de dinero a calcular:");
        capital = teclado.nextInt();
        System.out.println("Introduce el porcentaje de interés:");
        interes = teclado.nextDouble();
        System.out.println("Introduce el número de años:");
        anios = teclado.nextInt();
        
        total = (capital * (interes * 0.01)) * anios;
        
        System.out.print("El interés total que recibirás es de:");
        System.out.println(total);
        System.out.print("euros.");
       
    }
    
}
