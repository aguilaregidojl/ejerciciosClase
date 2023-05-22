/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculo;

import java.util.Scanner;

/**
 *
 * @author Jose Luis Aguilar Egido
 */
public class MainVehiculo {

    public static void main(String[] args) {
        int opcion = 0;
        int km;

        Scanner teclado = new Scanner(System.in);

        Bicicleta bici1 = new Bicicleta(5);
        Coche coche1 = new Coche(95);

        while (opcion != 8) {
            System.out.println("1. Avanza con la bici.");
            System.out.println("2. Haz un caballito.");
            System.out.println("3. Avanza con el coche.");
            System.out.println("4. Acelera con el coche.");
            System.out.println("5. Ver cuentakilómetros de la bici.");
            System.out.println("6. Ver cuentakilómetros del coche.");
            System.out.println("7. Ver cuentakilómetros total.");
            System.out.println("8. Salir.");

            System.out.println("Introduce una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("¿Cuántos kilómetros avanzas?");
                    km = teclado.nextInt();
                    bici1.avanzar(km);
                }
                case 2 ->
                    bici1.hacerCaballito();
                case 3 -> {
                    System.out.println("¿Cuántos kilómetros avanzas?");
                    km = teclado.nextInt();
                    coche1.avanzar(km);
                }
                case 4 ->
                    coche1.acelerar();
                case 5 -> {
                    System.out.print("La bicicleta lleva recorridos ");
                    System.out.print(bici1.kilometrosRecorridos);
                    System.out.println(" km.");
                }
                case 6 -> {
                    System.out.print("El coche lleva recorridos ");
                    System.out.print(coche1.kilometrosRecorridos);
                    System.out.println(" km.");
                }
                case 7 -> {
                    System.out.print("El total de kilómetros es ");
                    System.out.print(Vehiculo.getKilometrosTotales());
                    System.out.println(" km.");
                }
                default -> {
                }
            }
        }
    }
}
