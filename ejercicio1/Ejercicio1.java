/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dupla primerPar = new Dupla();
        primerPar.guarda(12, 31);
        int x = 0, y = 0;
        primerPar.lee(x, y);

        System.out.println(" \"Valor de primerPar.a: " + primerPar.getA());
        System.out.println(" \"Valor de primerPar.b: " + primerPar.getB());
    }

}
