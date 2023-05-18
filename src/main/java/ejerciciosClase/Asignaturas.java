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
public class Asignaturas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String Lunes = "Matemáticas";
        String Martes = "Ed. Física";
        String Miércoles = "Lengua Castellana";
        String Jueves = "Tecnología";
        String Viernes = "Geografía";
        
        System.out.println("Escribe el día de la semana: ");
        String dia = teclado.nextLine();
        
        switch (dia) {
            case "Lunes" -> System.out.println("Ese día toca: " + Lunes);
            case "Martes" -> System.out.println("Ese día toca: " + Martes);
            case "Miércoles" -> System.out.println("Ese día toca: " + Miércoles);
            case "Jueves" -> System.out.println("Ese día toca: " + Jueves);
            case "Viernes" -> System.out.println("Ese día toca: " + Viernes);
            default -> System.out.println("Esa día no existe, atontao.");
        }

        /*asignatura = switch (dia) {
            case "Lunes" -> "Matemáticas";
            case "Martes" -> "Ed. Física";
            case "Miércoles" -> "Lengua Castellana";
            case "Jueves" -> "Tecnología";
            case "Viernes" -> "Geografía";
            default -> "Esa asignatura no existe.";
        };*/   
    }

}
