/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejAnimales;

/**
 *
 * @author java
 */
public class Persona {
    //Atributos
    String nombre;
    String nacionalidad;
    String genero;
    
    //Atributo de clase
    static int totalPersonas = 0;
    
    //Constructor
    public Persona(String nombre, String nacionalidad, String genero) {
        super();
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.genero = genero;
    }
    
}
