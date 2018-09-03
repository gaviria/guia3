/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

public class Elevator {

    private int numberOfFloors;
    private int numberOfBasements;

    public Elevator(int numberOfFloors, int numberOfBasements) {
        this.numberOfFloors = numberOfFloors;
        this.numberOfBasements = numberOfBasements;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public int getNumberOfBasements() {
        return numberOfBasements;
    }

    public void setNumberOfBasements(int numberOfBasements) {
        this.numberOfBasements = numberOfBasements;
    }

    public int nextFloor(int currentPosition) {
        if (currentPosition > numberOfFloors) {
            System.out.print("No puede llegar. Piso Máximo");
        }
        return currentPosition + 1;
    }

    public int previousFloor(int currentPosition) {
        if (currentPosition < numberOfBasements) {
            System.out.print("No puede llegar. Piso Minimo");
        }
        return currentPosition - 1;
    }

    public int totalNrOfFlorsCanTravel() {
        int downFloors = numberOfBasements < 0 ? (numberOfBasements * (-1)) : numberOfBasements;
        return Math.abs(numberOfFloors + downFloors);
    }
}
