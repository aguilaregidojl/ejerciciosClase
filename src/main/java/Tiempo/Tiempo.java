/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tiempo;

/**
 *
 * @author java
 */
public class Tiempo {

    //Atributos
    private int segundos;

    //Constructores
    //Convierte el total de segundos en horas y en minutos.
    public Tiempo(int horas, int minutos, int segundos) {
        this.segundos = (horas * 3600) + (minutos * 60) + segundos;
    }

    //Añade s segundos al total
    public Tiempo(int s) {
        this.segundos = s;
    }

    //toString
    @Override
    public String toString() {
        int segundos = this.segundos;
        int horas = segundos / 3600;
        segundos -= horas * 3600;
        int minutos = segundos / 60;
        segundos -= minutos * 60;

        if (this.segundos < 0) {
            return "-(" + (-horas) + "h " + (-minutos) + "m " + (-segundos) + "s)";
        } else {
            return horas + "h " + minutos + "m " + segundos + "s";
        }
    }

    private int getSegundos() {
        return this.segundos;
    }

    public Tiempo suma(Tiempo t) {
        return new Tiempo(this.segundos + t.getSegundos());
    }

    public Tiempo resta(Tiempo t) {
        return new Tiempo(this.segundos - t.getSegundos());
    }
}
