/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("Ingrese la Información del empleado:");
            System.out.println("Nombre: ");
            String name = in.nextLine();
            System.out.println("Departamento: ");
            String department = in.nextLine();
            System.out.println("Posición: ");
            String position = in.nextLine();
            System.out.println("Salario: ");
            String salary = in.nextLine();
            Employee emp = new Employee(name, department, position, Double.valueOf(salary));
            System.out.print("Empleado : ");
            //print all saved employees
            emp.toString();
            System.out.println("Fue guardado en la base de datos.");

            System.out.println("Presione x para salir o cualquier otra tecla para continuar: ");
            String abort = in.nextLine();

            loop = !"x".equals(abort);
        }
    }

}
