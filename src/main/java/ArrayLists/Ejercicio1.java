/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayLists;

import java.util.ArrayList;

/**
 *
 * @author java
 */
public class Ejercicio1 {
    public static void main (String[] args) {
        ArrayList<String> compis = new ArrayList<String>();
        compis.add("Cristian");
        compis.add("Carmen");
        compis.add("Alejandra");
        compis.add("Victor");
        compis.add("Ángel");
        compis.add("Iván");
        
        //compis.forEach(System.out::println);
        // ↑↑↑↑↑ El IDE recomienda cambiar a esta de arriba
        for (String nombre : compis) {
            System.out.println(nombre);
        }
    }
    
}
