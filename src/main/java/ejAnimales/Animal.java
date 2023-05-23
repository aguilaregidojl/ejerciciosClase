/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejAnimales;

import java.util.Scanner;

/**
 *
 * @author java
 */
public abstract class Animal {

    Scanner teclado = new Scanner(System.in);

    //Atributos
    protected int edad;
    protected String especie;
    protected String sexo;

    //Atributos de clase
    static int totalAnimales = 0;

    //Constructor
    public Animal(String especie, String sexo) {
        this.especie = especie;
        this.sexo = sexo;
        System.out.println("¿Qué edad tiene?");
        int e = teclado.nextInt();
        this.edad = e;
        totalAnimales++;

    }

}
