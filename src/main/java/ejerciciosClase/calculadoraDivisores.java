/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosClase;

/**
 *
 * @author java
 */
public class calculadoraDivisores {

    public static void main(String[] args) {
        //Inicializamos las variables divisor y número
        int divisor;
        int numero = 0;
        int divsuma= 0;

        //Creamos un bucle que calcule los divisores de la variable número
        while (numero < 300) {
            numero++;
            System.out.print("Número " + numero + ": ");
            divisor=1;
            while (divisor != numero) {
                    if (numero % divisor == 0) {
                    System.out.print(divisor + " ");
                    divsuma+=divisor; //Es igual que divsuma=divsuma+divisor
                }
                divisor++;
            }
            System.out.print(" La suma es: " + divsuma);
            System.out.println(" ");
            divsuma=0;
        }
    }
}
