/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean loop = true;
        List<Dogs> dogs = new ArrayList<Dogs>();
        while (loop) {
            System.out.println("Ingrese la Información del Perro:");
            System.out.println("Nombre: ");
            String name = in.nextLine();
            System.out.println("Raza: ");
            String breed = in.nextLine();
            System.out.println("Localidad: : ");
            String locationTown = in.nextLine();
            System.out.println("Propietario: ");
            String owner = in.nextLine();
            System.out.print("Cedula: ");
            String ownerCard = in.nextLine();
            System.out.print("Telefono Propietario:");
            String ownerPhoneNr = in.nextLine();
            System.out.print("Primer dia:");
            String firstDay = in.nextLine();

            Dogs dog = new Dogs(name, breed, locationTown, owner, ownerCard, ownerPhoneNr, firstDay);

            dogs.add(dog);
            System.out.println("Fue guardado en la base de datos.");

            System.out.println("Presiona x para finalizar u otra tecla para finalizar: ");
            String abort = in.nextLine();

            loop = !"x".equals(abort);
        }

        Map<String, List<Dogs>> byLocation = new HashMap<>();
        for (Dogs d : dogs) {
            if (byLocation.containsKey(d.getTown())) {
                byLocation.get(d.getTown()).add(d);
            } else {
                List<Dogs> tempList = new ArrayList<>();
                tempList.add(d);
                byLocation.put(d.getTown(), tempList);
            }
        }

        for (String key : byLocation.keySet()) {
            List<Dogs> get = byLocation.get(key);
            System.out.println("Perros de la Localidad: " + key);
            //Imprime por localidad
            get.toString();
        }
    }

}
