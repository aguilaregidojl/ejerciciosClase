/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejAnimales;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author java
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Pedimos la edad de los perros y las personas por teclado
        System.out.println("Dime el nombre del Husky:");
        String nombre1 = teclado.nextLine();
        System.out.println("Dime el nombre del Terrier:");
        String nombre2 = teclado.nextLine();
        System.out.println("Dime el nombre del Caniche");
        String nombre3 = teclado.nextLine();
        System.out.println("Dime el nombre de Rodríguez");
        String nombre4 = teclado.nextLine();
        System.out.println("Dime la edad de Johnson");
        String nombre5 = teclado.nextLine();
        System.out.println("Dime la edad de Gómez");
        String nombre6 = teclado.nextLine();

        //Generamos los objetos de perros y personas
        Perro perro1 = new Perro(3, "Husky", "Tango", "Macho", "Canis familiaris", true);
        Perro perro2 = new Perro(5, "Terrier", "Runa", "Hembra", "Canis familiaris", false);
        Perro perro3 = new Perro(7, "Caniche", "Milu", "Macho", "Canis familiaris", true);
        Persona persona1 = new Persona(35, "Homo sapiens", "Fernando", "Rodríguez", "España", "Masculino");
        Persona persona2 = new Persona(23, "Homo sapiens", "Helen", "Johnson", "Inglaterra", "No binario");
        Persona persona3 = new Persona(40, "Homo sapiens", "Fermín", "Gómez", "Argentina", "Masculino");
        
        System.out.println("Ahora ordenaré los nombres: ");
        System.out.println(" ");
        System.out.println(" ");

        //Ahora creamos el array (o lo intentamos)
        Animal[] animales = {perro1, perro2, perro3, persona1, persona2, persona3};
        Arrays.sort(animales);

        //Tratamos de imprimir el resultado ya en orden
        for (Animal animal : animales) {
            System.out.println(animal.nombre);
        }
    }

}
