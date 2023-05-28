package pt.ipp.isep.dei.esoft.project.domain;

public class Apartment extends Property {

    private int numberBedrooms, numberBathrooms, numberParkingSpaces;
    private String availableEquipment;

    public Apartment() {
        super();
    }


    public Apartment(String location, double area, double distanceCenter, String photos, Owner owner, int numberBedrooms, int numberBathrooms, int numberParkingSpaces, String availableEquipment) {
        super(location, area, distanceCenter, photos, owner);
        this.numberBedrooms = numberBedrooms;
        this.numberBathrooms = numberBathrooms;
        this.numberParkingSpaces = numberParkingSpaces;
        this.availableEquipment = availableEquipment;
    }

    public Apartment clone() {
        return new Apartment(this.getLocation(), this.getArea(), this.getDistanceCenter(), this.getPhotos(), this.getOwner(), this.numberBedrooms, this.numberBathrooms, this.numberParkingSpaces, this.availableEquipment);
    }


    public int getNumberBedrooms() {
        return numberBedrooms;
    }

    public void setNumberBedrooms(int numberBedrooms) {
        this.numberBedrooms = numberBedrooms;
    }

    public int getNumberBathrooms() {
        return numberBathrooms;
    }

    public void setNumberBathrooms(int numberBathrooms) {
        this.numberBathrooms = numberBathrooms;
    }

    public int getNumberParkingSpaces() {
        return numberParkingSpaces;
    }

    public void setNumberParkingSpaces(int numberParkingSpaces) {
        this.numberParkingSpaces = numberParkingSpaces;
    }

    public String getAvailableEquipment() {
        return availableEquipment;
    }

    public void setAvailableEquipment(String availableEquipment) {
        this.availableEquipment = availableEquipment;
    }


}
