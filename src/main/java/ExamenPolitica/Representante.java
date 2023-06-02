/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenPolitica;

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
public class Representante {
    //Atributos de clase
    String nombre;
    String HP;
    String PM;
    Partido partido;

    @Override
    public String toString() {
        return "Representante{" + "nombre= " + nombre;
    }
    
    
    
}
