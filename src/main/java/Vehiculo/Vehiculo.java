/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculo;

/**
 *
 * @author Jose Luis Aguilar Egido
 */
public class Vehiculo {

    //Atributos de clase
    private static int vehiculosCreados = 0;
    private static int kilometrosTotales = 0;

    //Atributo de instancia
    int kilometrosRecorridos = 0;

    //Constructor
    public Vehiculo() {
        this.kilometrosRecorridos = 0;
    }

    public int getKilometrosRecorridos() {
        return this.kilometrosRecorridos;
    }

    public static int getKilometrosTotales() {
        return Vehiculo.kilometrosTotales;
    }

    //Función que suma los kilómetros a kilometrosRecorridos del objeto
    //y luego lo suma a kilometrosTotales, que es de la clase (static)
    public void avanzar(int km) {
        this.kilometrosRecorridos += km;
        Vehiculo.kilometrosTotales += km;
    }
}
