/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejAnimales;

/**
 *
 * @author java
 */
public class Persona extends Animal {

    //Atributos
    private String apellido;
    private String nacionalidad;
    private String genero;

    //Atributo de clase
    static int totalPersonas = 0;

    //Constructor
    public Persona(int edad, String especie, String nombre, String apellido, String nacionalidad, String genero) {
        super(edad, especie, nombre);
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.genero = genero;
    }

}
