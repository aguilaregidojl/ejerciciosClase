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
public class matriz90 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        /**
         * **********************EJERCICIO
         * TRAMPA******************************* int [][] n = new int[3][3];
         *
         * System.out.println("Introduce el primer número de la matriz: "); n
         * [0][0] = teclado.nextInt(); System.out.println("Introduce el segundo
         * número de la matriz: "); n [0][1] = teclado.nextInt();
         * System.out.println("Introduce el tercer número de la matriz: "); n
         * [0][2] = teclado.nextInt(); System.out.println("Introduce el cuarto
         * número de la matriz: "); n [1][0] = teclado.nextInt();
         * System.out.println("Introduce el quinto número de la matriz: "); n
         * [1][1] = teclado.nextInt(); System.out.println("Introduce el sexto
         * número de la matriz: "); n [1][2] = teclado.nextInt();
         * System.out.println("Introduce el séptimo número de la matriz: "); n
         * [2][0] = teclado.nextInt(); System.out.println("Introduce el octavo
         * número de la matriz: "); n [2][1] = teclado.nextInt();
         * System.out.println("Introduce el noveno y último número de la matriz:
         * "); n [2][2] = teclado.nextInt();
         *
         * System.out.println("Vamos a darle un twist a la matriz:");
         * System.out.println(" | " + n[2][0] + " | " + n[1][0] + " | " +
         * n[0][0]); System.out.println(" | " + n[2][1] + " | " + n[1][1] + " |
         * " + n[0][1]); System.out.println(" | " + n[2][2] + " | " + n[1][2] +
         * " | " + n[0][2]);
         * *********************************************************************
         */
        int f;
        int c;
        int contf;
        int contc;
        int ctotal;

        System.out.println("Introduce el número de filas para la matriz:");
        f = teclado.nextInt();
        System.out.println("Introduce el número de columnas para la matriz:");
        c = teclado.nextInt();

        contf = 0;
        contc = 0;
        ctotal = f * c;

        int[][] n = new int[f][c];

        System.out.println("Introduce los números de la matriz en orden.");

        //while (contf != f - 1) {
        while (contf != f) {
            while (contc != c) {
                n[contf][contc] = teclado.nextInt();
                contc++;
            }

            contf++;
            contc = 0;

        }

        /*while (contf != f - 1) {
                n[contf][contc] = teclado.nextInt();
                contc++;
                ctotal--;
            }*/
        //contf = 0;
        //}
        contf = 0;
        contc = 0;
        System.out.println("Ahora le daremos un twist a la matriz:");

        while (contc != c) {
            System.out.print(n[contf][contc] + " ");
            contc++;
        }

        System.out.println();

        contc = 0;
        contf = 1;

        while (contf != f && contc != c) {
            while(contc!=c) {
                System.out.print(n[contf][contc] + " ");
                contc++;
            }
            contc=0;
            contf++;
            
            System.out.println();
        }
        System.out.println();
    }

}
