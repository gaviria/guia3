/*
    * To change this license header, choose License Headers in Project Properties.
    * To change this template file, choose Tools | Templates
    * and open the template in the editor.
 */
package ejercicio1;

public class Dupla {
    
    private int a;
    private int b;
    
    public void guarda(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public Dupla() {
    }
    
    public void lee(int a, int b) {
        guarda(a, b);
    }
    
    public int getA() {
        return a;
    }
    
    public Dupla(int a2, int b2) {
        a2 = a;
        b2 = b;
    }
    
    public void setA(int a) {
        this.a = a;
    }
    
    public int getB() {
        return b;
    }
    
    public void setB(int b) {
        this.b = b;
    }
}
