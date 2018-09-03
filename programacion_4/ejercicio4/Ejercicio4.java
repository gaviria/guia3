/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

public class Ejercicio4 {

    public static final double PI = 3.14;

    public static void main(String[] args) {

        Pendulum p = new Pendulum();
        p.setGravitationalForce(9.8);
        p.setLength(12);
        System.out.print("El periodo de Oscilación es : "
                + p.calculateOscilationPeriod(PI));
    }

}
