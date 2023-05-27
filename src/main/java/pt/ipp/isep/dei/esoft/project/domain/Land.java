package pt.ipp.isep.dei.esoft.project.domain;

public class Land extends Property{
    private String propertyType;
    private String location;
    private double area;
    private double distanceCenter;
    private String photos;
    private Owner owner;

    public Land(String propertyType, String location, double area, double distanceCenter, String photos, Owner owner, String propertyType1, String location1, double area1, double distanceCenter1, String photos1, Owner owner1) {
        super(propertyType, location, area, distanceCenter, photos, owner);
        this.propertyType = propertyType1;
        this.location = location1;
        this.area = area1;
        this.distanceCenter = distanceCenter1;
        this.photos = photos1;
        this.owner = owner1;
    }

    public Land(String propertyType, String location, double area, double distanceCenter, String photos, Owner owner) {
        this.propertyType = propertyType;
        this.location = location;
        this.area = area;
        this.distanceCenter = distanceCenter;
        this.photos = photos;
        this.owner = owner;
    }

    @Override
    public String getPropertyType() {
        return propertyType;
    }

    @Override
    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public double getDistanceCenter() {
        return distanceCenter;
    }

    @Override
    public void setDistanceCenter(double distanceCenter) {
        this.distanceCenter = distanceCenter;
    }

    @Override
    public String getPhotos() {
        return photos;
    }

    @Override
    public void setPhotos(String photos) {
        this.photos = photos;
    }

    @Override
    public Owner getOwner() {
        return owner;
    }

    @Override
    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}