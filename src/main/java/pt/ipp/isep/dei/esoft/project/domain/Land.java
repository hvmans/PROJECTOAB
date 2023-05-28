package pt.ipp.isep.dei.esoft.project.domain;

public class Land extends Property{

    private final String propertyTypeLand = this.getClass().getSimpleName();

    public Land() {

    }

    public Land(String location, double area, double distanceCenter, String photos, Owner owner) {
        super(location, area, distanceCenter, photos, owner);
        setPropertyType();
    }

    @Override
    public void setPropertyType() {
        super.setPropertyType(propertyTypeLand);
    }
}