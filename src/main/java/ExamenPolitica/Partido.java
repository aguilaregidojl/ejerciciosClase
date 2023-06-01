/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenPolitica;

import java.util.Arrays;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author java
 */
@AllArgsConstructor
@Getter
@Setter
//@ToString
public class Partido {

    //Atributos de clase
    String nombre;
    String direccion;
    Representante[] rep;

    @Override
    public String toString() {
        return "Partido{" + "nombre= " + nombre + ", direccion= " + direccion + ", rep= " + "\n" + Arrays.toString(rep) + '}';
    }
    
    
}
