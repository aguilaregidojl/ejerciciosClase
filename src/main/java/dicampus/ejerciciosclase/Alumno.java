/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dicampus.ejerciciosclase;

/**
 *
 * @author java
 */
public class Alumno {

    //Atributos
    String nombre;
    String apellidos;
    int edad;
    String dni;

    //Método constructor, tiene el mismo nombre que la clase
    Alumno() {

    }

    Alumno(String nombre, String apellidos, int edad, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;

    }

    void mostrarnombre() {
        System.out.println(this.nombre);
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", dni=" + dni + '}';
    }

    public String getApellidos() {
        return apellidos;
    }

}
