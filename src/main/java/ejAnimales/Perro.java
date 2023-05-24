/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejAnimales;

/**
 *
 * @author java
 */
public class Perro extends Animal {

    //Atributos
    String sexo;
    String raza;
    boolean chip;

    //Atributos de clase
    static int totalPerros = 0;

    //Constructor
    public Perro(int edad, String especie, String nombre, String sexo, String raza, boolean chip) {
        super(edad, especie, nombre);
        this.sexo = sexo;
        this.raza = raza;
        this.chip = chip;

    }

}
