/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosPOO;

/**
 *
 * @author java
 */
public class PilotoDeFormula1 {

    //Atributos
    String nombre;
    String escuderia;
    int numero;
    String nacionalidad;

    //Constructor
    PilotoDeFormula1(String nombre, String escuderia, int numero, String nacionalidad) {
        this.nombre = nombre;
        this.escuderia = escuderia;
        this.numero = numero;
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Pilotos: " + "Nombre: " + nombre + ", Escuderia: " + escuderia + ", numero=" + numero + ", nacionalidad=" + nacionalidad + '}';
    }

    public static void main(String args[]) {

        //Creamos varios objetos
        PilotoDeFormula1 hamilton = new PilotoDeFormula1("Lewis Hamilton", "Mercedes", 44, "Reino Unido");
        PilotoDeFormula1 alonso = new PilotoDeFormula1("Fernando Alonso", "Aston Martin", 14, "España");
        PilotoDeFormula1 sainz = new PilotoDeFormula1("Carlos Sainz", "Ferrari", 55, "España");

        System.out.println(hamilton);
        System.out.println(alonso);
        System.out.println(sainz);
    }
}
