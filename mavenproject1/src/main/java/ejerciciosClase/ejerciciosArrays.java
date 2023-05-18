/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosClase;

import java.util.Scanner;

/**
 *
 * @author proof
 */
public class ejerciciosArrays {

    public static void main(String[] args) {
        //*************************Ejercicio 1**********************************
        int[] num;
        num = new int[12];
        num[0] = 39;
        num[1] = -2;
        num[4] = 0;
        num[6] = 14;
        num[8] = 5;
        num[9] = 120;

        //Los valores no inicializados en el array se mantienen a 0 hasta
        //ser inicializados en el caso de ser int
        System.out.println("Los valores del array 'num' son: ");
        System.out.print(num[0] + ", " + num[1] + ", " + num[2] + ", ");
        System.out.print(num[3] + ", " + num[4] + ", " + num[5] + ", ");
        System.out.print(num[6] + ", " + num[7] + ", " + num[8] + ", " + num[9]);
        System.out.println(", " + num[10] + ", " + num[11]);
        System.out.println();

        //*************************Ejercicio 2**********************************
        char[] simbolo;
        simbolo = new char[10];
        simbolo[0] = 'a';
        simbolo[1] = 'x';
        simbolo[4] = '@';
        simbolo[6] = ' ';
        simbolo[7] = '+';
        simbolo[8] = 'Q';

        //Los valores no inicializados son espacios en blanco ' ' porque en
        //ASCII el 0 es un NULL, espacio en blanco.
        System.out.println("Los valores del array 'simbolo' array son: ");
        System.out.print(simbolo[0] + ", " + simbolo[1] + ", " + simbolo[2]);
        System.out.print(", " + simbolo[3] + ", " + simbolo[4] + ", " + simbolo[5]);
        System.out.print(", " + simbolo[6] + ", " + simbolo[7] + ", " + simbolo[8]);
        System.out.println(", " + simbolo[9]);
        System.out.println();

        //*************************Ejercicio 3**********************************
        Scanner teclado = new Scanner(System.in);
        int[] numero;
        numero = new int[10];
        System.out.println("Introduce el primer número del array: ");
        numero[0]= teclado.nextInt();
        System.out.println("Introduce el segundo número del array: ");
        numero[1]= teclado.nextInt();
        System.out.println("Introduce el tercer número del array: ");
        numero[2]= teclado.nextInt();
        System.out.println("Introduce el cuarto número del array: ");
        numero[3]= teclado.nextInt();
        System.out.println("Introduce el quinto número del array: ");
        numero[4]= teclado.nextInt();
        System.out.println("Introduce el sexto número del array: ");
        numero[5]= teclado.nextInt();
        System.out.println("Introduce el séptimo número del array: ");
        numero[6]= teclado.nextInt();
        System.out.println("Introduce el octavo número del array: ");
        numero[7]= teclado.nextInt();
        System.out.println("Introduce el noveno número del array: ");
        numero[8]= teclado.nextInt();
        System.out.println("Introduce el décimo y último número del array: ");
        numero[9]= teclado.nextInt();
        System.out.println("Los valores del array 'numero' son:");
        System.out.print(numero[9] + ", " + numero[8] + ", " + numero[7] + ", ");
        System.out.print(numero[6] + ", " + numero[5] + ", " + numero[4] + ", ");
        System.out.print(numero[3] + ", " + numero[2] + ", " + numero[1] + ", ");
        System.out.print(numero[0]);
        
        //*************************Ejercicio 4**********************************
        
        

    }
}
