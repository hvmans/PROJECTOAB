package pt.ipp.isep.dei.esoft.project.domain;

public class Land extends Property{


    public Land() {
    }

    public Land(String location, double area, double distanceCenter, String photos, Owner owner) {
        super(location, area, distanceCenter, photos, owner);
    }

}