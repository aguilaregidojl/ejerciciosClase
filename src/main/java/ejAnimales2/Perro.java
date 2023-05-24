/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejAnimales2;

/**
 *
 * @author proof
 */

// Clase Perro (subclase de Animal)
class Perro extends Animal {
    // Atributos adicionales
    private String raza;
    private String tamanio;

    // Constructor
    public Perro(String nombre, int edad, String color, double peso, String raza, String tamanio) {
        super(nombre, edad, color, peso);
        this.raza = raza;
        this.tamanio = tamanio;
    }

    // Métodos adicionales
    public void ladrar() {
        System.out.println("El perro está ladrando.");
    }

    public void jugar() {
        System.out.println("El perro está jugando.");
    }
}
