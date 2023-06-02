/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author java
 */
public class Main {

    public static void main(String args[]) {
        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno("Jose Luis", "Aguilar", 31, "71777310Z");

        System.out.println(alumno1);
        System.out.println(alumno2);
        alumno2.mostrarnombre();

        System.out.println("La edad del alumno es " + alumno2.getEdad());
        System.out.println(alumno2);

    }

}
