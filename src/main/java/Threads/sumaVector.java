/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Threads;

import java.util.Scanner;

/**
 *
 * @author java
 */
public class sumaVector extends Thread {

    Scanner teclado = new Scanner(System.in);

    protected int hilo; //Numero del hilo
    int suma1;
    int suma2;
    int suma3;

    public sumaVector(int hilo) {
        this.hilo = hilo;
    }

    @Override
    public void run() {
        int[] n;
        n = new int[6];
        n[0]=10;
        n[1]=20;
        n[2]=30;
        n[3]=40;
        n[4]=50;
        n[5]=60;
        switch (this.hilo) {
            case 1 -> {
                suma1 = n[0] + n[1];
                System.out.println(suma1);
            }
            case 2 -> {
                suma2 = n[2] + n[3];
                System.out.println(suma2);
            }
            case 3 -> {
                suma3 = n[4] + n[5];
                System.out.println(suma3);
            }

            default -> {

            }

        }
    }

    public int getSuma1() {
        return this.suma1;
    }

    public int getSuma2() {
        return this.suma2;
    }

    public int getSuma3() {
        return this.suma3;
    }

}
