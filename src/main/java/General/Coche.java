/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package General;

/**
 *
 * @author java
 */
public class Coche {
// atributo de clase
private static int kilometrajeTotal = 0;
// método de clase
public static int getKilometrajeTotal() {
return Coche.kilometrajeTotal;
}
private String marca;
private String modelo;
private int kilometraje;
public Coche(String ma, String mo) {
this.marca = ma;
this.modelo = mo;
this.kilometraje = 0;
}
public int getKilometraje() {
return this.kilometraje;
}
/**
* Recorre una determinada distancia.
*
* @param km distancia a recorrer en kilómetros
*/
public static void main(String[] args) {
Coche c1 = new Coche("O", "A");
System.out.println(c1.getKilometraje());
}
}
