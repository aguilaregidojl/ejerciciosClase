/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejAnimales2;

/**
 *
 * @author proof
 */
class Animal implements Comparable<Animal> {
    // Atributos
    protected String nombre;
    protected int edad;
    protected String color;
    protected double peso;

    // Constructor
    public Animal(String nombre, int edad, String color, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
        this.peso = peso;
    }

    // Métodos
    public void comer() {
        System.out.println("El animal está comiendo.");
    }

    public void dormir() {
        System.out.println("El animal está durmiendo.");
    }

    // Implementación del método compareTo para ordenar por nombre
    @Override
    public int compareTo(Animal otroAnimal) {
        return this.nombre.compareTo(otroAnimal.nombre);
    }
}