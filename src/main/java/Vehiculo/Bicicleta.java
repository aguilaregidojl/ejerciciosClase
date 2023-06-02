/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculo;

/**
 *
 * @author Jose Luis Aguilar Egido
 */
public class Bicicleta extends Vehiculo {

    private int marchas;

    public Bicicleta(int m) {
        super();
        this.marchas = m;
    }

    public void hacerCaballito() {
        System.out.println("Caballito hecho.");
    }
}
