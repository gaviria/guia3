/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

public class Pendulum {

    private double length;
    private double gravitationalForce;

    public Pendulum() {
        this.gravitationalForce = 10;
        this.length = 0;
    }

    public double calculateOscilationPeriod(double pi) {
        return 2 * pi * Math.sqrt((gravitationalForce / length));
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getGravitationalForce() {
        return gravitationalForce;
    }

    public void setGravitationalForce(double gravitationalForce) {
        this.gravitationalForce = gravitationalForce;
    }

    public Pendulum(double length, double gravitationalForce) {
        this.length = length;
        this.gravitationalForce = gravitationalForce;
    }
}
