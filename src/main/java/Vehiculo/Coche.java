/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculo;

/**
 *
 * @author Jose Luis Aguilar Egido
 */
public class Coche extends Vehiculo {

    private int potencia; //Potencia en CV

    public Coche(int p) {
        super();
        this.potencia = p;
    }

    public void acelerar() {
        System.out.println("¡Aceleróooon!");
    }
}
