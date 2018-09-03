/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.List;
import java.util.Scanner;

public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese los detalles del edificio:");
        System.out.println("Numero de Pisos: ");
        String nrFloors = in.nextLine();

        System.out.println("Número de sotanos: ");
        String nrBase = in.nextLine();

        System.out.println("Posición actual del elevador:");
        String currentP = in.nextLine();

        Elevator elev = new Elevator(Integer.valueOf(nrFloors), Integer.valueOf(nrBase));

        System.out.println("Pisos totales del elevador que puede viajar: " + elev.totalNrOfFlorsCanTravel());
        System.out.println("Desde la posición actual, si sube, llegará al piso :" + elev.nextFloor(Integer.valueOf(currentP)));
        System.out.println("Desde la posición actual, si baja, llegará al piso :" + elev.previousFloor(Integer.valueOf(currentP)));

    }

}
