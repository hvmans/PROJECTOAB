package pt.ipp.isep.dei.esoft.project.domain;

public abstract class Property {

    private String propertyType;
    private static int propertyIdCounter = 0;
    private int propertyId;
    private String location;
    private double area;
    private double distanceCenter;
    private String photos;
    private Owner owner;

    public Property() {

    }

    public Property(String location, double area, double distanceCenter, String photos, Owner owner) {
        this.location = location;
        this.area = area;
        this.distanceCenter = distanceCenter;
        this.photos = photos;
        this.owner = owner;
        this.propertyId = propertyIdCounter++;
    }

    public static int getPropertyIdCounter() {
        return propertyIdCounter;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getDistanceCenter() {
        return distanceCenter;
    }

    public void setDistanceCenter(double distanceCenter) {
        this.distanceCenter = distanceCenter;
    }

    public String getPhotos() {
        return photos;
    }

    public void setPhotos(String photos) {
        this.photos = photos;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public abstract void setPropertyType();
}
