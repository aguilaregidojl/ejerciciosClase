/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenPolitica;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author java
 */

@AllArgsConstructor
@Getter
@Setter
public class Votante {
    //Atributos de clase
    String nombre;
    int DNI;
    int telefono;
    String direccion;
    Partido voto;

    @Override
    public String toString() {
        return "Votante{" + "nombre= " + nombre + ", DNI= " + DNI + ", telefono= " + telefono + ", direccion= " + direccion + ", voto= " + "\n" + voto + '}';
    }
    
    
}
