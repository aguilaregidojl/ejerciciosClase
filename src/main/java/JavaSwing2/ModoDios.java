/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSwing2;

import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author java
 */
public class ModoDios extends JFrame {
    
    int tipo;
    
    public String tipoComponente(int tipo) {
        if (tipo==0) {
            return "String";
        }
        return "Error";
    }

    public static void main(String[] args) {

        int opcion = 0;
        int contador = 1;
        int componentes;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número de componentes para el formulario:");
        componentes = teclado.nextInt();

        while (opcion != 6 || contador != componentes) {
            System.out.println("¿Qué tipo de dato irá en el componente " + contador + " ?");
            System.out.println("1. Cadena de texto (String)");
            System.out.println("2. Número entero (Int)");
            System.out.println("3. Número con decimales (Float)");
            System.out.println("4. Valor true/false (Boolean)");
            System.out.println("5. Carácter (Char)");
            System.out.println("6. Cancelar y salir.");

            System.out.println("Introduce una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1 -> {
                    
                    contador++;
                }
                case 2 -> {
                    contador++;
                }
                case 3 -> {
                    contador++;
                }
                case 4 -> {
                    contador++;
                }

                case 5 -> {
                    contador++;
                }
                default -> {
                    System.out.println("¡Hasta pronto!");
                    System.exit(0);
                }
            }
        }

    }

}
