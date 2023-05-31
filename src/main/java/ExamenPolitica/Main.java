/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenPolitica;

import java.util.Arrays;

/**
 *
 * @author java
 */
public class Main {

    public static void main(String[] args) {

        Representante[] reppsoe;
        Representante[] reppp;
        Representante[] repup;

        //Instanciamos tres veces la clase Partido
        Partido psoe = new Partido("Partido Socialista Obrero Español", "Calle Ferraz", null);
        Partido pp = new Partido("Partido Popular", "Calle Génova", null);
        Partido up = new Partido("Unidas Podemos", "Calle Princesa", null);

        //Ahora instanciamos 3 Representante por cada instancia de Partido.
        //Representantes PSOE
        Representante psoe1 = new Representante("Pedro Sánchez Pérez Castejón", "HP1", "PM1", psoe);
        Representante psoe2 = new Representante("Adriana Lastra Fernández", "HP2", "PM2", psoe);
        Representante psoe3 = new Representante("Maria Jesús Montero Cuadrado", "HP3", "HP3", psoe);
        //Creamos un array para los Representantes del PSOE
        reppsoe = new Representante[]{psoe1, psoe2, psoe3};

        //Representantes PP
        Representante pp1 = new Representante("Alberto Núñez Feijóo", "HP4", "PM4", pp);
        Representante pp2 = new Representante("Pablo Casado", "HP5", "PM5", pp);
        Representante pp3 = new Representante("Concepción Gamarra Ruiz-Clavijo", "HP6", "PM6", pp);
        //Creamos un array para los Representantes del PP
        reppp = new Representante[]{pp1, pp2, pp3};
        //Representantes Podemos

        Representante up1 = new Representante("Pablo Iglesias Turrión", "HP7", "PM7", up);
        Representante up2 = new Representante("Irene Montero", "HP8", "PM8", up);
        Representante up3 = new Representante("Ione Belarra Urteaga", "HP9", "PM9", up);
        //Creamos un array para los Representantes de Podemos
        repup = new Representante[]{up1, up2, up3};

        //Probanding
        psoe.setRep(reppsoe);
        pp.setRep(reppp);
        up.setRep(repup);

        //Ahora instanciamos a 3 votantes aleatorios
        Votante vot1 = new Votante("Javier Fernández", 71234567, 985450193, "C/ Falsa 123", psoe);
        Votante vot2 = new Votante("Elisa Pérez", 77654321, 985452343, "C/ Verdadera 321", up);
        Votante vot3 = new Votante("Ermenegildo Díaz", 19345872, 985453275, "C/ Yoqueséya 13", psoe);

        Object[] votantes = new Object[3];
        votantes[0] = vot1;
        votantes[1] = vot2;
        votantes[2] = vot3;

        for (Object i : votantes) {
            System.out.println(i);
        }

    }

}
