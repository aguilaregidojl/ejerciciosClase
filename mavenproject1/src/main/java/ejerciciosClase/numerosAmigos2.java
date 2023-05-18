/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosClase;

/**
 *
 * @author java
 */
public class numerosAmigos2 {

    public static void main(String[] args) {
        //Declaramos las variables
        //int divsuma1;
        //int divsuma2;
        int contadoramigos = 0;
        int numero1 = 1;

        while (contadoramigos < 3) {

            int divsuma1 = 0;
            int divsuma2 = 0;
            //Calculamos el sumatorio de divisores de un número
            for (int divisor = 1; divisor < numero1; divisor++) {
                if (numero1 % divisor == 0) {
                    divsuma1 += divisor;
                }
            }

            // Calculamos el sumatorio de divisores de comparándolo con divsuma1
            for (int divisor = 1; divisor < divsuma1; divisor++) {
                if (divsuma1 % divisor == 0) {
                    divsuma2 += divisor;
                }
            }

            //Comparamos si divsuma2 es igual al primer número, si lo son
            //son amigos.
            if (divsuma2 == numero1 && numero1 != divsuma1 && numero1 != divsuma1) {
                System.out.println(numero1 + " y " + divsuma1 + " son amigos del alma.");
                contadoramigos++;
            }
            numero1++;
        }
    }
}
