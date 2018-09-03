/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

public class Dogs {

    private String name;
    private String breed;
    private String town;
    private String owner;
    private String ownerIdentityCard;
    private String ownerPhoneNumber;
    private String attendanceDay;

    public Dogs(String name, String breed, String town, String owner, String ownerIdentityCard, String ownerPhoneNumber, String attendanceDay) {
        this.name = name;
        this.breed = breed;
        this.town = town;
        this.owner = owner;
        this.ownerIdentityCard = ownerIdentityCard;
        this.ownerPhoneNumber = ownerPhoneNumber;
        this.attendanceDay = attendanceDay;
    }

    @Override
    public String toString() {
        System.out.println("--------------------------------------------------");
        System.out.println("Nombre: " + name);
        System.out.println("Raza: " + breed);
        System.out.println("Localidad: " + town);
        System.out.println("Propietario: " + owner);
        System.out.println("Cedula: " + ownerIdentityCard);
        System.out.println("Teléfono: " + ownerPhoneNumber);
        System.out.println("Día: " + attendanceDay);
        System.out.println("--------------------------------------------------");
        return super.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwnerIdentityCard() {
        return ownerIdentityCard;
    }

    public void setOwnerIdentityCard(String ownerIdentityCard) {
        this.ownerIdentityCard = ownerIdentityCard;
    }

    public String getOwnerPhoneNumber() {
        return ownerPhoneNumber;
    }

    public void setOwnerPhoneNumber(String ownerPhoneNumber) {
        this.ownerPhoneNumber = ownerPhoneNumber;
    }

    public String getAttendanceDay() {
        return attendanceDay;
    }

    public void setAttendanceDay(String attendanceDay) {
        this.attendanceDay = attendanceDay;
    }

}
