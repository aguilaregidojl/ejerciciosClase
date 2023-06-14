/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenFinal;

import java.util.ArrayList;

/**
 *
 * @author java
 */
public class Main {

    public static void main(String[] args) {
        
        //Declaramos los dos ArrayList
        ArrayList<Persona> personas = new ArrayList<>();
        ArrayList<Empleado> empleados = new ArrayList<>();

        //Creamos seis objetos de la clase Persona
        Persona p1 = new Persona("Manuel", 39, "Masculino");
        Persona p2 = new Persona("Cristina", 17, "Femenino");
        Persona p3 = new Persona("Alma", 29, "No Binario");
        Persona p4 = new Persona("Federico", 13, "Masculino");
        Persona p5 = new Persona("Fermín", 57, "Masculino");
        Persona p6 = new Persona("Erika", 33, "Femenino");

        //Creamos seis objetos de la clase Empleado
        Empleado e1 = new Empleado("Linda", 35000, "Mid Designer");
        Empleado e2 = new Empleado("Marcos", 18000, "Junior Developer");
        Empleado e3 = new Empleado("Patricia", 55000, "Lead Designer");
        Empleado e4 = new Empleado("Paolo", 27000, "Product Manager");
        Empleado e5 = new Empleado("Anna", 41000, "SCRUM Master");
        Empleado e6 = new Empleado("Fabián", 63000, "CEO");

        //Añadimos los objetos al array personas
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);
        personas.add(p5);
        personas.add(p6);

        //Añadimos los objetos al array empleados
        empleados.add(e1);
        empleados.add(e2);
        empleados.add(e3);
        empleados.add(e4);
        empleados.add(e5);
        empleados.add(e6);

        //Llamamos a los métodos de los dos ordenamientos
        ordenBurbuja(personas);
        ordenMezcla(empleados);

        // Imprimimos el resultado de Personas
        System.out.println("(Bubble Sort) Personas ordenadas por nombre:");
        for (Persona persona : personas) {
            System.out.println(persona.getNombre());
        }

        //Imprimimos un par de líneas en blanco para separar ambos prints.
        System.out.println("");
        System.out.println("");

        // Imprimimos el resultado de Empleados
        System.out.println("(Merge Sort) Empleados ordenados por nombre:");
        for (Empleado empleado : empleados) {
            System.out.println(empleado.getNombre());
        }
    }

    // Método de ordenamiento por burbuja
    public static void ordenBurbuja(ArrayList<Persona> arr) {
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr.get(j).getNombre().compareTo(arr.get(j + 1).getNombre()) > 0) {
                    Persona temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
    }

    // Método de ordenamiento por merge
    private static void ordenMezcla(ArrayList<Empleado> arr) {
        if (arr.size() < 2) {
            return;
        }

        int mitad = arr.size() / 2;
        ArrayList<Empleado> izquierda = new ArrayList<>(arr.subList(0, mitad));
        ArrayList<Empleado> derecha = new ArrayList<>(arr.subList(mitad, arr.size()));

        ordenMezcla(izquierda);
        ordenMezcla(derecha);

        mezcla(arr, izquierda, derecha);
    }

    //Volvemos a unir ambos array para formar el array ordenado.
    private static void mezcla(ArrayList<Empleado> arr, ArrayList<Empleado> izquierda, ArrayList<Empleado> derecha) {
        int i = 0, j = 0, k = 0;

        while (i < izquierda.size() && j < derecha.size()) {
            if (izquierda.get(i).getNombre().compareTo(derecha.get(j).getNombre()) <= 0) {
                arr.set(k++, izquierda.get(i++));
            } else {
                arr.set(k++, derecha.get(j++));
            }
        }

        while (i < izquierda.size()) {
            arr.set(k++, izquierda.get(i++));
        }

        while (j < derecha.size()) {
            arr.set(k++, derecha.get(j++));
        }
    }

}
