/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejAnimales2;

/**
 *
 * @author proof
 */
// Clase Persona (subclase de Animal)
class Persona extends Animal {
    // Atributos adicionales
    private String nombreCompleto;
    private String direccion;
    
    // Constructor
    public Persona(String nombre, int edad, String color, double peso, String nombreCompleto, String direccion) {
        super(nombre, edad, color, peso);
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
    }

    // Métodos adicionales
    public void hablar() {
        System.out.println("La persona está hablando.");
    }

    public void caminar() {
        System.out.println("La persona está caminando.");
    }
}
