/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejAnimales2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author proof
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Pedir datos del animal
        System.out.println("Ingrese el nombre del animal: ");
        String nombreAnimal = teclado.nextLine();

        System.out.println("Ingrese la edad del animal: ");
        int edadAnimal = teclado.nextInt();
        teclado.nextLine(); // Limpiar el búfer de entrada

        System.out.println("Ingrese el color del animal: ");
        String colorAnimal = teclado.nextLine();

        System.out.println("Ingrese el peso del animal: ");
        double pesoAnimal = teclado.nextDouble();
        teclado.nextLine(); // Limpiar el búfer de entrada

        // Crear un perro
        System.out.println("Ingrese la raza del perro: ");
        String razaPerro = teclado.nextLine();

        System.out.println("Ingrese el tamaño del perro: ");
        String tamanioPerro = teclado.nextLine();

        Perro perro = new Perro(nombreAnimal, edadAnimal, colorAnimal, pesoAnimal, razaPerro, tamanioPerro);

        // Pedir datos de la persona
        System.out.println("Ingrese el nombre de la persona: ");
        String nombrePersona = teclado.nextLine();

        System.out.println("Ingrese la edad de la persona: ");
        int edadPersona = teclado.nextInt();
        teclado.nextLine(); // Limpiar el búfer de entrada

        System.out.println("Ingrese el color de cabello de la persona: ");
        String colorCabelloPersona = teclado.nextLine();

        System.out.println("Ingrese el peso de la persona: ");
        double pesoPersona = teclado.nextDouble();
        teclado.nextLine(); // Limpiar el búfer de entrada

        System.out.println("Ingrese el nombre completo de la persona: ");
        String nombreCompletoPersona = teclado.nextLine();

        System.out.println("Ingrese la dirección de la persona: ");
        String direccionPersona = teclado.nextLine();

        Persona persona = new Persona(nombrePersona, edadPersona, colorCabelloPersona, pesoPersona, nombreCompletoPersona, direccionPersona);

        // Crear un array de animales y ordenarlos
        Animal[] animales = {perro, persona};
        Arrays.sort(animales);

        // Imprimir el resultado ordenado
        for (Animal animal : animales) {
            System.out.println(animal.nombre);
        }
    }
}
